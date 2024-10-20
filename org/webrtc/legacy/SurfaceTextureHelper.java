package org.webrtc.legacy;

import X.0Pz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOn;
import X.GOo;
import X.GOp;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.opengl.GlUtil;

/* loaded from: SurfaceTextureHelper.class */
public class SurfaceTextureHelper {
    public static final String TAG = "SurfaceTextureHelper";
    public final AtomicBoolean disposed;
    public final EglBase eglBase;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public OnTextureFrameAvailableListener listener;
    public final int oesTextureId;
    public OnTextureFrameAvailableListener pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    /* loaded from: SurfaceTextureHelper$OnTextureFrameAvailableListener.class */
    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler) {
        this.hasPendingTexture = false;
        this.isTextureInUse = false;
        this.isQuitting = false;
        this.disposed = new AtomicBoolean();
        this.setListenerRunnable = new Runnable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Setting listener to ");
                Logging.d(SurfaceTextureHelper.TAG, AnonymousClass001.A0a(SurfaceTextureHelper.this.pendingListener, A0k));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (GOo.A11(handler) != Thread.currentThread()) {
            throw AnonymousClass001.A0N("SurfaceTextureHelper must be created on the handler thread");
        }
        this.handler = handler;
        EglBase create = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = create;
        try {
            create.createPbufferSurface(1, 1);
            create.makeCurrent();
            int generateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = generateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
            this.surfaceTexture = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.webrtc.legacy.SurfaceTextureHelper.3
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                    surfaceTextureHelper.hasPendingTexture = true;
                    surfaceTextureHelper.tryDeliverTextureFrame();
                }
            });
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context) {
        final Handler handler = new Handler(AnonymousClass002.A09(str));
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.1
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, handler);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, 0Pz.A0W(str, " create failure"), e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (GOo.A11(this.handler) != Thread.currentThread()) {
            throw AnonymousClass001.A0N("Wrong thread.");
        }
        if (this.isTextureInUse || !this.isQuitting) {
            throw AnonymousClass001.A0N("Unexpected release.");
        }
        YuvConverter yuvConverter = this.yuvConverter;
        if (yuvConverter != null) {
            yuvConverter.release();
        }
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        if (GOo.A11(this.handler) != Thread.currentThread()) {
            throw AnonymousClass001.A0N("Wrong thread.");
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] A1a = GOn.A1a();
        this.surfaceTexture.getTransformMatrix(A1a);
        this.listener.onTextureFrameAvailable(this.oesTextureId, A1a, this.surfaceTexture.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        if (!GOp.A1a(this.disposed)) {
            throw AnonymousClass001.A0N("dispose being called more than once");
        }
        Logging.d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.6
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.isQuitting = true;
                if (surfaceTextureHelper.isTextureInUse) {
                    return;
                }
                SurfaceTextureHelper.this.release();
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.isTextureInUse = false;
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.isQuitting) {
                    surfaceTextureHelper.release();
                } else {
                    surfaceTextureHelper.tryDeliverTextureFrame();
                }
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener != null || this.pendingListener != null) {
            throw AnonymousClass001.A0N("SurfaceTextureHelper listener has already been set.");
        }
        this.pendingListener = onTextureFrameAvailableListener;
        this.handler.post(this.setListenerRunnable);
    }

    public void stopListening() {
        Logging.d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.4
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = null;
                surfaceTextureHelper.pendingListener = null;
            }
        });
    }

    public void textureToYUV(final ByteBuffer byteBuffer, final int i, final int i2, final int i3, final int i4, final float[] fArr) {
        if (i4 != this.oesTextureId) {
            throw AnonymousClass001.A0N("textureToByteBuffer called with unexpected textureId");
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: org.webrtc.legacy.SurfaceTextureHelper.7
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.yuvConverter == null) {
                    surfaceTextureHelper.yuvConverter = new YuvConverter();
                }
                SurfaceTextureHelper.this.yuvConverter.convert(byteBuffer, i, i2, i3, i4, fArr);
            }
        });
    }
}
