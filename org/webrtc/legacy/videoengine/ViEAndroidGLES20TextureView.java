package org.webrtc.legacy.videoengine;

import X.0Pz;
import X.1FV;
import X.4YU;
import X.7hZ;
import X.AnonymousClass001;
import X.C1oo;
import X.GOn;
import X.J7D;
import X.QpT;
import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.rtc.photosnapshots.jni.NativeSnapshotHelper;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.videoengine.GLTextureView;

/* loaded from: ViEAndroidGLES20TextureView.class */
public class ViEAndroidGLES20TextureView extends GLTextureView implements ViEViewEventListenable, GLSurfaceView.Renderer, GLContextSharingTarget {
    public static final boolean DEBUG = false;
    public static final double SCALE_THRESHOLD_DEFAULT = 0.15d;
    public static final double SCALE_THRESHOLD_DISABLED = -1.0d;
    public static final int SCALE_TYPE_CENTER_CROP = 1;
    public static final int SCALE_TYPE_FIT_CENTER = 2;
    public static final int SCALE_TYPE_STRETCH = 0;
    public static final String TAG = "ViEAndroidGLES20TextureView";
    public final AwakeTimeSinceBootClock mClock;
    public final ContextFactory mContextFactory;
    public boolean mCustomVideoSize;
    public volatile Runnable mFirstFrameEventRunnable;
    public final AtomicLong mFirstFrameTime;
    public final AtomicInteger mFramesDrawn;
    public float mGlClearAlpha;
    public float mGlClearBlue;
    public float mGlClearGreen;
    public float mGlClearRed;
    public final AtomicLong mLastRedrawTime;
    public NativeSnapshotHelper mNativeSnapshotHelper;
    public final Object mNativeSnapshotHelperLock;
    public OneShotDrawListener mOneShotDrawListener;
    public volatile OneShotReDrawListener mOneShotReDrawListener;
    public int mRawVideoHeight;
    public int mRawVideoWidth;
    public boolean mRendererSetupDone;
    public float mRoundedCornerRadius;
    public double mScaleThreshold;
    public int mScaleType;
    public long mSnapshotSourceUserID;
    public int mSurfaceHeight;
    public int mSurfaceWidth;
    public final Handler mUiHandler;
    public int mVideoHeight;
    public VideoSizeChangedListener mVideoSizeChangedListener;
    public int mVideoWidth;
    public final ReentrantLock nativeFunctionLock;
    public boolean nativeFunctionsRegisted;
    public long nativeObject;
    public boolean surfaceCreated;

    /* loaded from: ViEAndroidGLES20TextureView$ConfigChooser.class */
    public class ConfigChooser implements GLTextureView.EGLConfigChooser {
        public static final int EGL_OPENGL_ES2_BIT = 4;
        public static final int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
        public int mAlphaSize;
        public int mBlueSize;
        public int mDepthSize;
        public int mGreenSize;
        public int mRedSize;
        public int mStencilSize;
        public final int[] mValue = new int[1];

        public ConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        public static void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, EGLConfigChooser.EGL_CONFORMANT};
            String[] strArr = new String[33];
            System.arraycopy(new String[]{"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL"}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{"EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"}, 0, strArr, 27, 6);
            int[] iArr2 = new int[1];
            int i = 0;
            do {
                int i2 = iArr[i];
                String str = strArr[i];
                if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, iArr2)) {
                    Logging.w(ViEAndroidGLES20TextureView.TAG, 0Pz.A0F(iArr2[0], "  ", str, ": "));
                    i++;
                }
                do {
                } while (egl10.eglGetError() != 12288);
                i++;
            } while (i < 33);
        }

        private void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            Logging.w(ViEAndroidGLES20TextureView.TAG, 0Pz.A0D(length, " configurations"));
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return;
                }
                Logging.w(ViEAndroidGLES20TextureView.TAG, 0Pz.A0d("Configuration ", ":", i2));
                printConfig(egl10, eGLDisplay, eGLConfigArr[i2]);
                i = i2 + 1;
            }
        }

        @Override // org.webrtc.legacy.videoengine.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            int[] iArr2 = s_configAttribs2;
            egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                throw AnonymousClass001.A0L("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr);
            return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return null;
                }
                EGLConfig eGLConfig = eGLConfigArr[i2];
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
                i = i2 + 1;
            }
        }
    }

    /* loaded from: ViEAndroidGLES20TextureView$ContextFactory.class */
    public class ContextFactory extends SharedEGLContextFactory implements GLTextureView.EGLContextFactory {
        public ContextFactory(EglBase.Context context) {
            super(context);
        }

        @Override // org.webrtc.legacy.videoengine.SharedEGLContextFactory, android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return super.createContext(egl10, eGLDisplay, eGLConfig);
        }

        @Override // org.webrtc.legacy.videoengine.SharedEGLContextFactory, android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView$ContextFactory, org.webrtc.legacy.videoengine.SharedEGLContextFactory] */
    public ViEAndroidGLES20TextureView(Context context) {
        super(context);
        this.surfaceCreated = false;
        this.mRendererSetupDone = false;
        this.nativeFunctionsRegisted = false;
        this.nativeFunctionLock = new ReentrantLock();
        this.nativeObject = 0L;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mRawVideoWidth = 0;
        this.mRawVideoHeight = 0;
        this.mCustomVideoSize = false;
        this.mClock = AwakeTimeSinceBootClock.INSTANCE;
        this.mOneShotDrawListener = null;
        this.mOneShotReDrawListener = null;
        this.mVideoSizeChangedListener = null;
        this.mScaleType = 0;
        this.mNativeSnapshotHelperLock = AnonymousClass001.A0R();
        this.mContextFactory = new SharedEGLContextFactory(null);
        this.mLastRedrawTime = new AtomicLong(0L);
        this.mGlClearRed = 0.0f;
        this.mGlClearGreen = 0.0f;
        this.mGlClearBlue = 0.0f;
        this.mGlClearAlpha = 1.0f;
        this.mFramesDrawn = GOn.A1K(0);
        this.mFirstFrameTime = new AtomicLong();
        this.mUiHandler = AnonymousClass001.A07();
        init(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView$ContextFactory, org.webrtc.legacy.videoengine.SharedEGLContextFactory] */
    public ViEAndroidGLES20TextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.surfaceCreated = false;
        this.mRendererSetupDone = false;
        this.nativeFunctionsRegisted = false;
        this.nativeFunctionLock = new ReentrantLock();
        this.nativeObject = 0L;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mRawVideoWidth = 0;
        this.mRawVideoHeight = 0;
        this.mCustomVideoSize = false;
        this.mClock = AwakeTimeSinceBootClock.INSTANCE;
        this.mOneShotDrawListener = null;
        this.mOneShotReDrawListener = null;
        this.mVideoSizeChangedListener = null;
        this.mScaleType = 0;
        this.mNativeSnapshotHelperLock = AnonymousClass001.A0R();
        this.mContextFactory = new SharedEGLContextFactory(null);
        this.mLastRedrawTime = new AtomicLong(0L);
        this.mGlClearRed = 0.0f;
        this.mGlClearGreen = 0.0f;
        this.mGlClearBlue = 0.0f;
        this.mGlClearAlpha = 1.0f;
        this.mFramesDrawn = GOn.A1K(0);
        this.mFirstFrameTime = new AtomicLong();
        this.mUiHandler = AnonymousClass001.A07();
        init(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView$ContextFactory, org.webrtc.legacy.videoengine.SharedEGLContextFactory] */
    public ViEAndroidGLES20TextureView(Context context, boolean z, int i, int i2) {
        super(context);
        this.surfaceCreated = false;
        this.mRendererSetupDone = false;
        this.nativeFunctionsRegisted = false;
        this.nativeFunctionLock = new ReentrantLock();
        this.nativeObject = 0L;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mRawVideoWidth = 0;
        this.mRawVideoHeight = 0;
        this.mCustomVideoSize = false;
        this.mClock = AwakeTimeSinceBootClock.INSTANCE;
        this.mOneShotDrawListener = null;
        this.mOneShotReDrawListener = null;
        this.mVideoSizeChangedListener = null;
        this.mScaleType = 0;
        this.mNativeSnapshotHelperLock = AnonymousClass001.A0R();
        this.mContextFactory = new SharedEGLContextFactory(null);
        this.mLastRedrawTime = new AtomicLong(0L);
        this.mGlClearRed = 0.0f;
        this.mGlClearGreen = 0.0f;
        this.mGlClearBlue = 0.0f;
        this.mGlClearAlpha = 1.0f;
        this.mFramesDrawn = GOn.A1K(0);
        this.mFirstFrameTime = new AtomicLong();
        this.mUiHandler = AnonymousClass001.A07();
        init(context, null);
    }

    private native boolean DrawNative(long j);

    private native boolean HasNewFrame(long j);

    private native void SetupRenderer(long j, int i, int i2, int i3, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSizeInternal(int i, int i2) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        requestLayout();
    }

    private boolean withinThreshold(double d, double d2) {
        double d3 = this.mScaleThreshold;
        boolean z = true;
        if (d3 >= 0.0d) {
            if (d2 <= 0.0d || d3 == 0.0d) {
                return false;
            }
            if (Math.abs(d - d2) / d2 > d3) {
                z = false;
            }
        }
        return z;
    }

    public void DeRegisterNativeObject(long j) {
        this.nativeFunctionLock.lock();
        try {
            if (j != this.nativeObject) {
                return;
            }
            this.nativeFunctionsRegisted = false;
            this.mRendererSetupDone = false;
            this.nativeObject = 0L;
            this.nativeFunctionLock.unlock();
            synchronized (this.mNativeSnapshotHelperLock) {
                this.mNativeSnapshotHelper = null;
            }
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    public void ReDraw(final int i, final int i2) {
        this.mFramesDrawn.incrementAndGet();
        if (this.mFirstFrameTime.compareAndSet(0L, System.currentTimeMillis()) && this.mFirstFrameEventRunnable != null) {
            this.mUiHandler.post(this.mFirstFrameEventRunnable);
        }
        if (this.mRawVideoWidth != i || this.mRawVideoHeight != i2 || this.mOneShotReDrawListener != null) {
            post(new Runnable() { // from class: org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ViEAndroidGLES20TextureView.this.mOneShotReDrawListener != null) {
                        ViEAndroidGLES20TextureView.this.mOneShotReDrawListener.onReDraw();
                        ViEAndroidGLES20TextureView.this.mOneShotReDrawListener = null;
                    }
                    ViEAndroidGLES20TextureView viEAndroidGLES20TextureView = ViEAndroidGLES20TextureView.this;
                    int i3 = viEAndroidGLES20TextureView.mRawVideoWidth;
                    int i4 = i;
                    if (i3 == i4 && viEAndroidGLES20TextureView.mRawVideoHeight == i2) {
                        return;
                    }
                    viEAndroidGLES20TextureView.mRawVideoWidth = i4;
                    int i5 = i2;
                    viEAndroidGLES20TextureView.mRawVideoHeight = i5;
                    VideoSizeChangedListener videoSizeChangedListener = viEAndroidGLES20TextureView.mVideoSizeChangedListener;
                    if (videoSizeChangedListener != null) {
                        videoSizeChangedListener.onVideoSizeChanged(i4, i5);
                    }
                    ViEAndroidGLES20TextureView viEAndroidGLES20TextureView2 = ViEAndroidGLES20TextureView.this;
                    if (viEAndroidGLES20TextureView2.mCustomVideoSize) {
                        return;
                    }
                    viEAndroidGLES20TextureView2.setVideoSizeInternal(i, i2);
                }
            });
        }
        if (this.surfaceCreated) {
            this.mLastRedrawTime.set(this.mClock.now());
            requestRender();
        }
    }

    public void RegisterNativeObject(long j, NativeSnapshotHelper nativeSnapshotHelper) {
        this.nativeFunctionLock.lock();
        try {
            this.nativeObject = j;
            this.nativeFunctionsRegisted = true;
            this.mRendererSetupDone = false;
            if (nativeSnapshotHelper != null) {
                synchronized (this.mNativeSnapshotHelperLock) {
                    nativeSnapshotHelper.init(getContext(), this.mSnapshotSourceUserID);
                    this.mNativeSnapshotHelper = nativeSnapshotHelper;
                }
            }
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    public ListenableFuture captureSnapshot() {
        NativeSnapshotHelper nativeSnapshotHelper;
        synchronized (this.mNativeSnapshotHelperLock) {
            nativeSnapshotHelper = this.mNativeSnapshotHelper;
        }
        if (nativeSnapshotHelper == null) {
            return new 7hZ(new J7D(QpT.A06, "ViEAndroidGLES20TextureView::mNativeSnapshotHelper is null"));
        }
        1FV A0j = 4YU.A0j();
        synchronized (nativeSnapshotHelper.pendingResultsLock) {
            nativeSnapshotHelper.pendingResults.add(A0j);
        }
        requestRender();
        return A0j;
    }

    public void clearBuffer() {
        if (this.surfaceCreated) {
            requestRender();
        }
    }

    public long getFirstFrameDrawTime() {
        return this.mFirstFrameTime.get();
    }

    public int getFramesDrawn() {
        return this.mFramesDrawn.getAndSet(0);
    }

    public long getLastRedrawTime() {
        return this.mLastRedrawTime.get();
    }

    public int getScaleType() {
        return this.mScaleType;
    }

    public long getSnapshotSourceUserId() {
        return this.mSnapshotSourceUserID;
    }

    public void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2t);
            try {
                this.mRoundedCornerRadius = obtainStyledAttributes.getDimension(0, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setEGLConfigChooser(new ConfigChooser(8, 8, 8, 8, 0, 0));
        setRenderer(this);
        setRenderMode(0);
        setEGLContextFactory(this.mContextFactory);
        this.mLastRedrawTime.set(0L);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        this.nativeFunctionLock.lock();
        try {
            gl10.glClearColor(this.mGlClearRed, this.mGlClearGreen, this.mGlClearBlue, this.mGlClearAlpha);
            gl10.glClear(16640);
            if (this.nativeFunctionsRegisted && this.surfaceCreated) {
                if (!this.mRendererSetupDone) {
                    SetupRenderer(this.nativeObject, this.mScaleType, this.mSurfaceWidth, this.mSurfaceHeight, this.mRoundedCornerRadius);
                    this.mRendererSetupDone = true;
                }
                DrawNative(this.nativeObject);
                this.nativeFunctionLock.unlock();
                OneShotDrawListener oneShotDrawListener = this.mOneShotDrawListener;
                if (oneShotDrawListener != null) {
                    oneShotDrawListener.onDraw();
                    this.mOneShotDrawListener = null;
                }
            }
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mVideoWidth > 0 && this.mVideoHeight > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size > 0 && size2 > 0) {
                double d = size / size2;
                int i3 = this.mVideoWidth;
                double d2 = i3;
                int i4 = this.mVideoHeight;
                double d3 = d2 / i4;
                if (!withinThreshold(d, d3)) {
                    if (d > d3) {
                        size = (i3 * size2) / i4;
                    } else {
                        size2 = (i4 * size) / i3;
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.surfaceCreated = true;
        this.mSurfaceWidth = i;
        this.mSurfaceHeight = i2;
        this.nativeFunctionLock.lock();
        try {
            if (this.nativeFunctionsRegisted) {
                this.mRendererSetupDone = false;
            }
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (HasNewFrame(r301.nativeObject) != false) goto L6;
     */
    @Override // org.webrtc.legacy.videoengine.GLTextureView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean requestDraw() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.nativeFunctionsRegisted
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1c
            r0 = r301
            long r0 = r0.nativeObject
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.HasNewFrame(r1)
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r302 = r0
        L1e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.videoengine.ViEAndroidGLES20TextureView.requestDraw():boolean");
    }

    public void resetLastRedrawTime() {
        this.mLastRedrawTime.set(0L);
    }

    @Override // org.webrtc.legacy.videoengine.GLContextSharingTarget
    public void setEglContext(EglBase.Context context) {
        if (this.mContextFactory.setSharedContext(context)) {
            Logging.d(TAG, "Forcing context recreation");
            this.mPreserveEGLContextOnPause = false;
            onPause();
            onResume();
        }
    }

    public void setFirstFrameEventRunnable(Runnable runnable) {
        this.mFirstFrameEventRunnable = runnable;
    }

    public void setGlClearColor(float f, float f2, float f3, float f4) {
        this.mGlClearRed = f;
        this.mGlClearGreen = f2;
        this.mGlClearBlue = f3;
        this.mGlClearAlpha = f4;
    }

    @Override // org.webrtc.legacy.videoengine.ViEViewEventListenable
    public void setOneShotDrawListener(OneShotDrawListener oneShotDrawListener) {
        this.mOneShotDrawListener = oneShotDrawListener;
    }

    @Override // org.webrtc.legacy.videoengine.ViEViewEventListenable
    public void setOneShotReDrawListener(OneShotReDrawListener oneShotReDrawListener) {
        this.mOneShotReDrawListener = oneShotReDrawListener;
    }

    public void setRoundedCornerRadius(float f) {
        this.nativeFunctionLock.lock();
        try {
            this.mRoundedCornerRadius = f;
            this.mRendererSetupDone = false;
            requestLayout();
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    public void setScaleType(int i) {
        setScaleType(i, i == 1 ? -1.0d : 0.15d);
    }

    public void setScaleType(int i, double d) {
        this.nativeFunctionLock.lock();
        try {
            if (this.mScaleType != i || this.mScaleThreshold != d) {
                this.mScaleThreshold = d;
                this.mScaleType = i;
                this.mRendererSetupDone = false;
                requestLayout();
            }
        } finally {
            this.nativeFunctionLock.unlock();
        }
    }

    public void setSnapshotSourceUserId(long j) {
        NativeSnapshotHelper nativeSnapshotHelper;
        synchronized (this.mNativeSnapshotHelperLock) {
            nativeSnapshotHelper = this.mNativeSnapshotHelper;
            this.mSnapshotSourceUserID = j;
        }
        if (nativeSnapshotHelper != null) {
            synchronized (nativeSnapshotHelper.longTermStateLock) {
                nativeSnapshotHelper.id = j;
            }
        }
    }

    public void setVideoSize(int i, int i2) {
        this.mCustomVideoSize = true;
        setVideoSizeInternal(i, i2);
    }

    @Override // org.webrtc.legacy.videoengine.ViEViewEventListenable
    public void setVideoSizeChangedListener(VideoSizeChangedListener videoSizeChangedListener) {
        this.mVideoSizeChangedListener = videoSizeChangedListener;
    }
}
