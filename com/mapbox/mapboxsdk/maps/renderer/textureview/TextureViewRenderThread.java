package com.mapbox.mapboxsdk.maps.renderer.textureview;

import X.7zL;
import X.AnonymousClass001;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.mapbox.mapboxsdk.log.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: TextureViewRenderThread.class */
public class TextureViewRenderThread extends Thread implements TextureView.SurfaceTextureListener {
    public static final String TAG = "Mbgl-TextureViewRenderThread";
    public boolean destroyContext;
    public boolean destroySurface;
    public final EGLHolder eglHolder;
    public boolean exited;
    public int height;
    public final TextureViewMapRenderer mapRenderer;
    public boolean paused;
    public boolean requestRender;
    public boolean shouldExit;
    public boolean sizeChanged;
    public SurfaceTexture surface;
    public int width;
    public final Object lock = AnonymousClass001.A0R();
    public final ArrayList eventQueue = AnonymousClass001.A0s();

    /* loaded from: TextureViewRenderThread$EGLHolder.class */
    public class EGLHolder {
        public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        public EGL10 egl;
        public EGLConfig eglConfig;
        public final WeakReference textureViewWeakRef;
        public boolean translucentSurface;
        public EGLDisplay eglDisplay = EGL10.EGL_NO_DISPLAY;
        public EGLContext eglContext = EGL10.EGL_NO_CONTEXT;
        public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

        public EGLHolder(WeakReference weakReference, boolean z) {
            this.textureViewWeakRef = weakReference;
            this.translucentSurface = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroyContext() {
            EGLContext eGLContext = this.eglContext;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext != eGLContext2) {
                if (!this.egl.eglDestroyContext(this.eglDisplay, eGLContext)) {
                    Logger.w(TextureViewRenderThread.TAG, String.format("Could not destroy egl context. Display %s, Context %s", this.eglDisplay, this.eglContext));
                }
                this.eglContext = eGLContext2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void destroySurface() {
            EGLSurface eGLSurface = this.eglSurface;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                if (!this.egl.eglDestroySurface(this.eglDisplay, eGLSurface)) {
                    Logger.w(TextureViewRenderThread.TAG, String.format("Could not destroy egl surface. Display %s, Surface %s", this.eglDisplay, this.eglSurface));
                }
                this.eglSurface = eGLSurface2;
            }
        }

        private void terminate() {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
            if (eGLDisplay != eGLDisplay2) {
                if (!this.egl.eglTerminate(eGLDisplay)) {
                    Logger.w(TextureViewRenderThread.TAG, String.format("Could not terminate egl. Display %s", this.eglDisplay));
                }
                this.eglDisplay = eGLDisplay2;
            }
        }

        public void cleanup() {
            destroySurface();
            destroyContext();
            terminate();
        }

        public GL10 createGL() {
            return (GL10) this.eglContext.getGL();
        }

        public boolean createSurface() {
            destroySurface();
            TextureView textureView = (TextureView) this.textureViewWeakRef.get();
            boolean z = false;
            EGLSurface eglCreateWindowSurface = (textureView == null || textureView.getSurfaceTexture() == null) ? EGL10.EGL_NO_SURFACE : this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, textureView.getSurfaceTexture(), new int[]{12344});
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                z = makeCurrent();
            } else if (this.egl.eglGetError() == 12299) {
                Logger.e(TextureViewRenderThread.TAG, "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                return false;
            }
            return z;
        }

        public boolean makeCurrent() {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                return true;
            }
            Logger.w(TextureViewRenderThread.TAG, String.format("eglMakeCurrent: %s", Integer.valueOf(this.egl.eglGetError())));
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void prepare() {
            /*
                Method dump skipped, instructions count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewRenderThread.EGLHolder.prepare():void");
        }

        public int swap() {
            if (this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface)) {
                return 12288;
            }
            return this.egl.eglGetError();
        }
    }

    public TextureViewRenderThread(TextureView textureView, TextureViewMapRenderer textureViewMapRenderer) {
        textureView.setOpaque(!textureViewMapRenderer.translucentSurface);
        textureView.setSurfaceTextureListener(this);
        this.mapRenderer = textureViewMapRenderer;
        this.eglHolder = new EGLHolder(7zL.A14(textureView), textureViewMapRenderer.translucentSurface);
    }

    public void onDestroy() {
        synchronized (this.lock) {
            this.shouldExit = true;
            this.lock.notifyAll();
            while (!this.exited) {
                try {
                    this.lock.wait();
                } catch (InterruptedException unused) {
                    AnonymousClass001.A13();
                }
            }
        }
    }

    public void onPause() {
        synchronized (this.lock) {
            this.paused = true;
            this.lock.notifyAll();
        }
    }

    public void onResume() {
        synchronized (this.lock) {
            this.paused = false;
            this.lock.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            this.surface = surfaceTexture;
            this.width = i;
            this.height = i2;
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.lock) {
            this.surface = null;
            this.destroySurface = true;
            this.requestRender = false;
            this.lock.notifyAll();
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            this.width = i;
            this.height = i2;
            this.sizeChanged = true;
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        if (runnable == null) {
            throw AnonymousClass001.A0L("runnable must not be null");
        }
        synchronized (this.lock) {
            this.eventQueue.add(runnable);
            this.lock.notifyAll();
        }
    }

    public void requestRender() {
        synchronized (this.lock) {
            this.requestRender = true;
            this.lock.notifyAll();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:275:0x0323
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewRenderThread.run():void");
    }
}
