package org.webrtc.legacy.videoengine;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.7zL;
import X.AnonymousClass001;
import X.GOn;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

/* loaded from: GLTextureView.class */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    public static final GLThreadManager sGLThreadManager = new Object();
    public int mDebugFlags;
    public boolean mDetached;
    public EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public EGLContextFactory mEGLContextFactory;
    public EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    public GLThread mGLThread;
    public GLWrapper mGLWrapper;
    public boolean mHaveEglContextFactory;
    public boolean mPreserveEGLContextOnPause;
    public GLSurfaceView.Renderer mRenderer;
    public final WeakReference mThisWeakRef;

    /* loaded from: GLTextureView$BaseConfigChooser.class */
    public abstract class BaseConfigChooser implements EGLConfigChooser {
        public int[] mConfigSpec;

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (GLTextureView.this.mEGLContextClientVersion != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // org.webrtc.legacy.videoengine.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                throw AnonymousClass001.A0L("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw AnonymousClass001.A0L("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                throw AnonymousClass001.A0L("eglChooseConfig#2 failed");
            }
            EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            if (chooseConfig != null) {
                return chooseConfig;
            }
            throw AnonymousClass001.A0L("No config chosen");
        }

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);
    }

    /* loaded from: GLTextureView$ComponentSizeChooser.class */
    public class ComponentSizeChooser extends BaseConfigChooser {
        public int mAlphaSize;
        public int mBlueSize;
        public int mDepthSize;
        public int mGreenSize;
        public int mRedSize;
        public int mStencilSize;
        public int[] mValue;

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mValue = new int[1];
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

        @Override // org.webrtc.legacy.videoengine.GLTextureView.BaseConfigChooser
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

    /* loaded from: GLTextureView$DefaultWindowSurfaceFactory.class */
    public class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        public DefaultWindowSurfaceFactory() {
        }

        public /* synthetic */ DefaultWindowSurfaceFactory(AnonymousClass1 anonymousClass1) {
        }

        @Override // org.webrtc.legacy.videoengine.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
            }
            return eGLSurface;
        }

        @Override // org.webrtc.legacy.videoengine.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* loaded from: GLTextureView$EGLConfigChooser.class */
    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* loaded from: GLTextureView$EGLContextFactory.class */
    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* loaded from: GLTextureView$EGLWindowSurfaceFactory.class */
    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* loaded from: GLTextureView$EglHelper.class */
    public class EglHelper {
        public EGL10 mEgl;
        public EGLConfig mEglConfig;
        public EGLContext mEglContext;
        public EGLDisplay mEglDisplay;
        public EGLSurface mEglSurface;
        public WeakReference mGLTextureViewWeakRef;

        public EglHelper(WeakReference weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.mEglSurface;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                gLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }

        public static String formatEglError(String str, int i) {
            return 0Pz.A0W(str, " failed");
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
            throw 0Q8.createAndThrow();
        }

        public static void throwEglException(String str, int i) {
            throw 0Pz.A08(str, " failed");
        }

        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                GLWrapper gLWrapper = gLTextureView.mGLWrapper;
                if (gLWrapper != null) {
                    gl = gLWrapper.wrap(gl);
                }
                int i = gLTextureView.mDebugFlags;
                if ((i & 3) != 0) {
                    int i2 = 0;
                    LogWriter logWriter = null;
                    if ((i & 1) != 0) {
                        i2 = 1;
                    }
                    if ((i & 2) != 0) {
                        logWriter = new LogWriter();
                    }
                    gl = GLDebugHelper.wrap(gl, i2, logWriter);
                }
            }
            return gl;
        }

        public boolean createSurface() {
            if (this.mEgl == null) {
                throw AnonymousClass001.A0T("egl not initialized");
            }
            if (this.mEglDisplay == null) {
                throw AnonymousClass001.A0T("eglDisplay not initialized");
            }
            if (this.mEglConfig == null) {
                throw AnonymousClass001.A0T("mEglConfig not initialized");
            }
            destroySurfaceImp();
            GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
            EGLSurface createWindowSurface = gLTextureView != null ? gLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gLTextureView.getSurfaceTexture()) : null;
            this.mEglSurface = createWindowSurface;
            if (createWindowSurface == null || createWindowSurface == EGL10.EGL_NO_SURFACE) {
                return false;
            }
            return this.mEgl.eglMakeCurrent(this.mEglDisplay, createWindowSurface, createWindowSurface, this.mEglContext);
        }

        public void destroySurface() {
            destroySurfaceImp();
        }

        public void finish() {
            EGLContext eGLContext = this.mEglContext;
            if (eGLContext != null) {
                GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, eGLContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public void start() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.mEgl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw AnonymousClass001.A0T("eglGetDisplay failed");
            }
            if (!this.mEgl.eglInitialize(eglGetDisplay, GOn.A1b())) {
                throw AnonymousClass001.A0T("eglInitialize failed");
            }
            GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
            if (gLTextureView == null) {
                this.mEglConfig = null;
                this.mEglContext = null;
            } else {
                EGLConfig chooseConfig = gLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                this.mEglConfig = chooseConfig;
                EGLContext createContext = gLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, chooseConfig);
                this.mEglContext = createContext;
                if (createContext != null && createContext != EGL10.EGL_NO_CONTEXT) {
                    this.mEglSurface = null;
                    return;
                }
            }
            this.mEglContext = null;
            throwEglException("createContext");
            throw 0Q8.createAndThrow();
        }

        public int swap() {
            if (this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return 12288;
            }
            return this.mEgl.eglGetError();
        }
    }

    /* loaded from: GLTextureView$GLThread.class */
    public class GLThread extends Thread {
        public EglHelper mEglHelper;
        public boolean mExited;
        public boolean mFinishedCreatingEglSurface;
        public WeakReference mGLTextureViewWeakRef;
        public boolean mHasSurface;
        public boolean mHaveEglContext;
        public boolean mHaveEglSurface;
        public boolean mPaused;
        public boolean mRenderComplete;
        public boolean mRequestPaused;
        public boolean mShouldExit;
        public boolean mShouldReleaseEglContext;
        public boolean mSurfaceIsBad;
        public boolean mWaitingForSurface;
        public final ArrayList mEventQueue = AnonymousClass001.A0s();
        public boolean mSizeChanged = true;
        public int mWidth = 0;
        public int mHeight = 0;
        public boolean mRequestRender = true;
        public int mRenderMode = 1;

        public GLThread(WeakReference weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:315:0x03a6
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        private void guardedRun() {
            /*
                Method dump skipped, instructions count: 940
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.videoengine.GLTextureView.GLThread.guardedRun():void");
        }

        private boolean readyToDraw() {
            GLTextureView gLTextureView = (GLTextureView) this.mGLTextureViewWeakRef.get();
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
                return false;
            }
            return (this.mRequestRender || this.mRenderMode == 1) && gLTextureView != null && gLTextureView.mHaveEglContextFactory;
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                GLTextureView.sGLThreadManager.notifyAll();
            }
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (readyToDraw() == false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean ableToDraw() {
            /*
                r301 = this;
                r0 = r301
                boolean r0 = r0.mHaveEglContext
                r302 = r0
                r0 = r302
                if (r0 == 0) goto L1d
                r0 = r301
                boolean r0 = r0.mHaveEglSurface
                r302 = r0
                r0 = r302
                if (r0 == 0) goto L1d
                r0 = r301
                boolean r0 = r0.readyToDraw()
                r303 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                if (r0 != 0) goto L1f
            L1d:
                r0 = 0
                r302 = r0
            L1f:
                r0 = r302
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.videoengine.GLTextureView.GLThread.ableToDraw():boolean");
        }

        public int getRenderMode() {
            int i;
            synchronized (GLTextureView.sGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public void onPause() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mRequestPaused = true;
                gLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }

        public void onResume() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                gLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                gLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }

        public void queueEvent(Runnable runnable) {
            if (runnable == null) {
                throw AnonymousClass001.A0L("r must not be null");
            }
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mEventQueue.add(runnable);
                gLThreadManager.notifyAll();
            }
        }

        public void requestExitAndWait() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mShouldExit = true;
                gLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            GLTextureView.sGLThreadManager.notifyAll();
        }

        public void requestRender() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mRequestRender = true;
                gLThreadManager.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName(AnonymousClass001.A0h(AnonymousClass001.A0n("GLThread "), getId()));
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.sGLThreadManager.threadExiting(this);
                throw th;
            }
            GLTextureView.sGLThreadManager.threadExiting(this);
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                throw AnonymousClass001.A0L("renderMode");
            }
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mRenderMode = i;
                gLThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mHasSurface = true;
                this.mFinishedCreatingEglSurface = false;
                gLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            GLThreadManager gLThreadManager = GLTextureView.sGLThreadManager;
            synchronized (gLThreadManager) {
                this.mHasSurface = false;
                gLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        gLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
            }
        }
    }

    /* loaded from: GLTextureView$GLThreadManager.class */
    public class GLThreadManager {
        public GLThreadManager() {
        }

        public /* synthetic */ GLThreadManager(AnonymousClass1 anonymousClass1) {
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            notifyAll();
        }

        public void threadExiting(GLThread gLThread) {
            synchronized (this) {
                gLThread.mExited = true;
                notifyAll();
            }
        }
    }

    /* loaded from: GLTextureView$GLWrapper.class */
    public interface GLWrapper {
        GL wrap(GL gl);
    }

    /* loaded from: GLTextureView$LogWriter.class */
    public class LogWriter extends Writer {
        public final StringBuilder mBuilder = AnonymousClass001.A0k();

        private void flushBuilder() {
            StringBuilder sb = this.mBuilder;
            if (sb.length() > 0) {
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= i2) {
                    return;
                }
                char c = cArr[i + i4];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
                i3 = i4 + 1;
            }
        }
    }

    /* loaded from: GLTextureView$SimpleEGLConfigChooser.class */
    public class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.mThisWeakRef = 7zL.A14(this);
        setSurfaceTextureListener(this);
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = 7zL.A14(this);
        setSurfaceTextureListener(this);
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw AnonymousClass001.A0N("setRenderer has already been called for this instance.");
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public void finalize() {
        int A03 = 0FI.A03(-1942564275);
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
            0FI.A09(-1415692913, A03);
        } catch (Throwable th) {
            0FI.A09(-1327554546, A03);
            throw th;
        }
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    public void on(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(528273120);
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            GLThread gLThread = this.mGLThread;
            int renderMode = gLThread != null ? gLThread.getRenderMode() : 1;
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.mGLThread = gLThread2;
            if (renderMode != 1) {
                gLThread2.setRenderMode(renderMode);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
        0FI.A0C(1650639218, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(765965316);
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
        0FI.A0C(1557400553, A06);
    }

    public void onPause() {
        this.mGLThread.onPause();
    }

    public void onResume() {
        this.mGLThread.onResume();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-998406015);
        super.onSizeChanged(i, i2, i3, i4);
        this.mGLThread.onWindowResize(i, i2);
        0FI.A0C(-561532980, A06);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mGLThread.surfaceCreated();
        this.mGLThread.onWindowResize(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.mGLThread.surfaceDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mGLThread.onWindowResize(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public boolean requestDraw() {
        return true;
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        GLThreadManager gLThreadManager = sGLThreadManager;
        synchronized (gLThreadManager) {
            if (this.mGLThread == null) {
                throw AnonymousClass001.A0N("setRenderer must already be called.");
            }
            this.mEGLContextFactory = eGLContextFactory;
            this.mHaveEglContextFactory = true;
            gLThreadManager.notifyAll();
        }
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [org.webrtc.legacy.videoengine.GLTextureView$EGLWindowSurfaceFactory, java.lang.Object] */
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new Object();
        }
        this.mRenderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread = gLThread;
        gLThread.start();
    }
}
