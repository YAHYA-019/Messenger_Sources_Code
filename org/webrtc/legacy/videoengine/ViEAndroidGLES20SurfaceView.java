package org.webrtc.legacy.videoengine;

import X.1BK;
import X.1BQ;
import X.1BY;
import X.1FV;
import X.4YU;
import X.7hZ;
import X.AnonymousClass001;
import X.C00i;
import X.IHM;
import X.J7D;
import X.QpT;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.rtc.photosnapshots.jni.NativeSnapshotHelper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.videoengine.MC;

/* loaded from: ViEAndroidGLES20SurfaceView.class */
public class ViEAndroidGLES20SurfaceView extends GLSurfaceView implements ViEViewEventListenable, GLSurfaceView.Renderer, GLContextSharingTarget {
    public static final boolean DEBUG = false;
    public static final double SCALE_THRESHOLD_DEFAULT = 0.15d;
    public static final double SCALE_THRESHOLD_DISABLED = -1.0d;
    public static final int SCALE_TYPE_CENTER_CROP = 1;
    public static final int SCALE_TYPE_FIT_CENTER = 2;
    public static final int SCALE_TYPE_STRETCH = 0;
    public static final String TAG = "ViEAndroidGLES20SurfaceView";
    public 1BY _UL_mInjectionContext;
    public final AwakeTimeSinceBootClock mClock;
    public final ContextFactory mContextFactory;
    public boolean mCustomVideoSize;
    public float mGlClearAlpha;
    public float mGlClearBlue;
    public float mGlClearGreen;
    public float mGlClearRed;
    public final AtomicLong mLastRedrawTime;
    public final C00i mMobileConfig;
    public NativeSnapshotHelper mNativeSnapshotHelper;
    public final Object mNativeSnapshotHelperLock;
    public OneShotDrawListener mOneShotDrawListener;
    public volatile OneShotReDrawListener mOneShotReDrawListener;
    public int mRawVideoHeight;
    public int mRawVideoWidth;
    public boolean mRendererSetupDone;
    public double mScaleThreshold;
    public int mScaleType;
    public long mSnapshotSourceUserID;
    public double mSupportedOpenGLESVersion;
    public int mSurfaceHeight;
    public int mSurfaceWidth;
    public int mVideoHeight;
    public VideoSizeChangedListener mVideoSizeChangedListener;
    public int mVideoWidth;
    public final ReentrantLock nativeFunctionLock;
    public boolean nativeFunctionsRegisted;
    public long nativeObject;
    public boolean surfaceCreated;

    /* loaded from: ViEAndroidGLES20SurfaceView$ContextFactory.class */
    public class ContextFactory extends SharedEGLContextFactory implements GLSurfaceView.EGLContextFactory {
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

        @Override // org.webrtc.legacy.videoengine.SharedEGLContextFactory
        public boolean setSharedContext(EglBase.Context context) {
            return super.setSharedContext(context);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView$ContextFactory, org.webrtc.legacy.videoengine.SharedEGLContextFactory] */
    public ViEAndroidGLES20SurfaceView(Context context) {
        super(context);
        this.mMobileConfig = 1BQ.A00();
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
        this.mSupportedOpenGLESVersion = 0.0d;
        init(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView$ContextFactory, org.webrtc.legacy.videoengine.SharedEGLContextFactory] */
    public ViEAndroidGLES20SurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMobileConfig = 1BQ.A00();
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
        this.mSupportedOpenGLESVersion = 0.0d;
        init(context, attributeSet);
    }

    private native boolean DrawNative(long j);

    private native boolean HasNewFrame(long j);

    private native void SetupRenderer(long j, int i, int i2, int i3, float f);

    private void init(Context context, AttributeSet attributeSet) {
        setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) new IHM());
        setEGLContextFactory(this.mContextFactory);
        setRenderer(this);
        setRenderMode(0);
        String glEsVersion = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion();
        if (glEsVersion != null) {
            this.mSupportedOpenGLESVersion = Double.parseDouble(glEsVersion);
        }
        this.mLastRedrawTime.set(0L);
    }

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

    public float GetMaxScalingRatio() {
        if (this.mSupportedOpenGLESVersion < 3.0d || !1BK.A0N(this.mMobileConfig).AZk(MC.m4a_rtc_video_upscaling.lanczos_enabled)) {
            return -1.0f;
        }
        return ((float) 1BK.A0N(this.mMobileConfig).Auy(MC.m4a_rtc_video_upscaling.max_scaling_ratio)) / 100.0f;
    }

    public void ReDraw(final int i, final int i2) {
        if (this.mRawVideoWidth != i || this.mRawVideoHeight != i2 || this.mOneShotReDrawListener != null) {
            post(new Runnable() { // from class: org.webrtc.legacy.videoengine.ViEAndroidGLES20SurfaceView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (ViEAndroidGLES20SurfaceView.this.mOneShotReDrawListener != null) {
                        ViEAndroidGLES20SurfaceView.this.mOneShotReDrawListener.onReDraw();
                        ViEAndroidGLES20SurfaceView.this.mOneShotReDrawListener = null;
                    }
                    ViEAndroidGLES20SurfaceView viEAndroidGLES20SurfaceView = ViEAndroidGLES20SurfaceView.this;
                    int i3 = viEAndroidGLES20SurfaceView.mRawVideoWidth;
                    int i4 = i;
                    if (i3 == i4 && viEAndroidGLES20SurfaceView.mRawVideoHeight == i2) {
                        return;
                    }
                    viEAndroidGLES20SurfaceView.mRawVideoWidth = i4;
                    int i5 = i2;
                    viEAndroidGLES20SurfaceView.mRawVideoHeight = i5;
                    VideoSizeChangedListener videoSizeChangedListener = viEAndroidGLES20SurfaceView.mVideoSizeChangedListener;
                    if (videoSizeChangedListener != null) {
                        videoSizeChangedListener.onVideoSizeChanged(i4, i5);
                    }
                    ViEAndroidGLES20SurfaceView viEAndroidGLES20SurfaceView2 = ViEAndroidGLES20SurfaceView.this;
                    if (viEAndroidGLES20SurfaceView2.mCustomVideoSize) {
                        return;
                    }
                    viEAndroidGLES20SurfaceView2.setVideoSizeInternal(i, i2);
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
            return new 7hZ(new J7D(QpT.A06, "ViEAndroidGLES20SurfaceView::mNativeSnapshotHelper is null"));
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

    public long getLastRedrawTime() {
        return this.mLastRedrawTime.get();
    }

    public long getSnapshotSourceUserId() {
        return this.mSnapshotSourceUserID;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        this.nativeFunctionLock.lock();
        try {
            gl10.glClearColor(this.mGlClearRed, this.mGlClearGreen, this.mGlClearBlue, this.mGlClearAlpha);
            gl10.glClear(16640);
            if (this.nativeFunctionsRegisted && this.surfaceCreated) {
                if (!this.mRendererSetupDone) {
                    SetupRenderer(this.nativeObject, this.mScaleType, this.mSurfaceWidth, this.mSurfaceHeight, 0.0f);
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

    @Override // android.view.SurfaceView, android.view.View
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

    public void resetLastRedrawTime() {
        this.mLastRedrawTime.set(0L);
    }

    @Override // org.webrtc.legacy.videoengine.GLContextSharingTarget
    public void setEglContext(EglBase.Context context) {
        if (this.mContextFactory.setSharedContext(context)) {
            Logging.d(TAG, "Forcing context recreation");
            setPreserveEGLContextOnPause(false);
            onPause();
            onResume();
        }
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

    public void setScaleType(int i) {
        setScaleType(i, i == 1 ? -1.0d : 0.15d);
    }

    public void setScaleType(int i, double d) {
        if (this.mScaleType == i && this.mScaleThreshold == d) {
            return;
        }
        this.mScaleThreshold = d;
        this.mScaleType = i;
        this.mRendererSetupDone = false;
        requestLayout();
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
