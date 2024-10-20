package com.mapbox.mapboxsdk.maps.renderer.egl;

import X.AnonymousClass001;
import android.opengl.GLSurfaceView;
import android.os.Build;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.utils.Compare;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: EGLConfigChooser.class */
public class EGLConfigChooser implements GLSurfaceView.EGLConfigChooser {
    public static final int EGL_CONFORMANT = 12354;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final String TAG = "Mbgl-EGLConfigChooser";
    public boolean translucentSurface;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser$1Config, reason: invalid class name */
    /* loaded from: EGLConfigChooser$1Config.class */
    public class C1Config implements Comparable {
        public final BufferFormat bufferFormat;
        public final EGLConfig config;
        public final DepthStencilFormat depthStencilFormat;
        public final int index;
        public final boolean isCaveat;
        public final boolean isNotConformant;

        public C1Config(BufferFormat bufferFormat, DepthStencilFormat depthStencilFormat, boolean z, boolean z2, int i, EGLConfig eGLConfig) {
            this.bufferFormat = bufferFormat;
            this.depthStencilFormat = depthStencilFormat;
            this.isNotConformant = z;
            this.isCaveat = z2;
            this.index = i;
            this.config = eGLConfig;
        }

        @Override // java.lang.Comparable
        public int compareTo(C1Config c1Config) {
            int compare = Compare.compare(this.bufferFormat.value, c1Config.bufferFormat.value);
            if (compare == 0) {
                compare = Compare.compare(this.depthStencilFormat.value, c1Config.depthStencilFormat.value);
                if (compare == 0) {
                    compare = Compare.compare(this.isNotConformant, c1Config.isNotConformant);
                    if (compare == 0) {
                        compare = Compare.compare(this.isCaveat, c1Config.isCaveat);
                        if (compare == 0) {
                            compare = Compare.compare(this.index, c1Config.index);
                            if (compare == 0) {
                                compare = 0;
                            }
                        }
                    }
                }
            }
            return compare;
        }
    }

    /* loaded from: EGLConfigChooser$BufferFormat.class */
    public enum BufferFormat {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);

        public int value;

        BufferFormat(int i) {
            this.value = i;
        }
    }

    /* loaded from: EGLConfigChooser$DepthStencilFormat.class */
    public enum DepthStencilFormat {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);

        public int value;

        DepthStencilFormat(int i) {
            this.value = i;
        }
    }

    public EGLConfigChooser() {
        this(false);
    }

    public EGLConfigChooser(boolean z) {
        this.translucentSurface = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00eb, code lost:
    
        if (r0 == 16) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private javax.microedition.khronos.egl.EGLConfig chooseBestMatchConfig(javax.microedition.khronos.egl.EGL10 r302, javax.microedition.khronos.egl.EGLDisplay r303, javax.microedition.khronos.egl.EGLConfig[] r304) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser.chooseBestMatchConfig(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay, javax.microedition.khronos.egl.EGLConfig[]):javax.microedition.khronos.egl.EGLConfig");
    }

    private int getConfigAttr(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        Logger.e(TAG, String.format(MapboxConstants.MAPBOX_LOCALE, "eglGetConfigAttrib(%d) returned error %d", AnonymousClass001.A1b(Integer.valueOf(i), egl10.eglGetError())));
        throw new RuntimeException("eglGetConfigAttrib() failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (android.os.Build.MANUFACTURER.contains("Genymotion") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] getConfigAttributes() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser.getConfigAttributes():int[]");
    }

    private int[] getNumberOfConfigurations(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            return iArr2;
        }
        Logger.e(TAG, String.format(MapboxConstants.MAPBOX_LOCALE, "eglChooseConfig(NULL) returned error %d", AnonymousClass001.A1a(egl10.eglGetError())));
        throw new RuntimeException("eglChooseConfig() failed");
    }

    private EGLConfig[] getPossibleConfigurations(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2)) {
            return eGLConfigArr;
        }
        Logger.e(TAG, String.format(MapboxConstants.MAPBOX_LOCALE, "eglChooseConfig() returned error %d", AnonymousClass001.A1a(egl10.eglGetError())));
        throw new RuntimeException("eglChooseConfig() failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (java.lang.System.getProperty("ro.kernel.qemu") != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean inEmulator() {
        /*
            r301 = this;
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r302 = r0
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            java.lang.String r0 = "unknown"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            java.lang.String r0 = android.os.Build.MODEL
            r302 = r0
            r0 = 198(0xc6, float:2.77E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r306 = r0
            r0 = r302
            r1 = r306
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            java.lang.String r0 = android.os.Build.BRAND
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L81
            java.lang.String r0 = android.os.Build.DEVICE
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
        L81:
            java.lang.String r0 = android.os.Build.PRODUCT
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            java.lang.String r0 = "ro.kernel.qemu"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            if (r0 == 0) goto La4
        La2:
            r0 = 1
            r304 = r0
        La4:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser.inEmulator():boolean");
    }

    private boolean inGenymotion() {
        return Build.MANUFACTURER.contains("Genymotion");
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] configAttributes = getConfigAttributes();
        int[] numberOfConfigurations = getNumberOfConfigurations(egl10, eGLDisplay, configAttributes);
        if (numberOfConfigurations[0] < 1) {
            Logger.e(TAG, "eglChooseConfig() returned no configs.");
            throw new RuntimeException("eglChooseConfig() failed");
        }
        EGLConfig chooseBestMatchConfig = chooseBestMatchConfig(egl10, eGLDisplay, getPossibleConfigurations(egl10, eGLDisplay, configAttributes, numberOfConfigurations));
        if (chooseBestMatchConfig != null) {
            return chooseBestMatchConfig;
        }
        Logger.e(TAG, "No config chosen");
        throw new RuntimeException("No config chosen");
    }
}
