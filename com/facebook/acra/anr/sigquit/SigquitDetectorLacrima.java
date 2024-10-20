package com.facebook.acra.anr.sigquit;

import X.0fH;
import android.os.Handler;

/* loaded from: SigquitDetectorLacrima.class */
public class SigquitDetectorLacrima implements SigquitDetector {
    public static final String TAG = "SigquitDetectorLacrima";
    public static SigquitDetector sInstance;
    public static boolean sIsArt;
    public SigquitDetectorListener mListener;
    public Handler mMainThreadHandler;
    public boolean mNotifyJavaOnSigquit;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r0.startsWith("0.") != false) goto L8;
     */
    static {
        /*
            java.lang.String r0 = "java.vm.version"
            r301 = r0
            r0 = r301
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L28
            java.lang.String r0 = "1."
            r301 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            java.lang.String r0 = "0."
            r301 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.sIsArt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.m5557clinit():void");
    }

    public SigquitDetectorLacrima(SigquitDetectorListener sigquitDetectorListener) {
        this.mListener = sigquitDetectorListener;
    }

    public static SigquitDetector getInstance(SigquitDetectorListener sigquitDetectorListener) {
        SigquitDetector sigquitDetector = sInstance;
        if (sigquitDetector == null) {
            sigquitDetector = new SigquitDetectorLacrima(sigquitDetectorListener);
            sInstance = sigquitDetector;
        }
        return sigquitDetector;
    }

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, boolean z7, boolean z8, boolean z9, boolean z10);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    private void onSigquit() {
        this.mListener.onSigquit();
    }

    private void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2) {
        0fH.A17(TAG, "sigquitDetected inFgV1: %b inFgV2: %b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2)});
        this.mListener.onSigquitTracesAvailable(str, str2, z, z2);
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void cleanupAppStateFile() {
        nativeCleanupAppStateFile();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void doNotIgnoreNextSiguit() {
        nativeSendNextSigquitTraceUnconditionally();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006a, code lost:
    
        if (r0.endsWith(":browser") != false) goto L6;
     */
    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(X.C04a r302, boolean r303) {
        /*
            r301 = this;
            java.lang.String r0 = com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.TAG
            r304 = r0
            r0 = r304
            java.lang.String r1 = "nativeInit"
            X.0fH.A0n(r0, r1)
            r0 = r302
            r305 = r0
            r0 = r302
            android.os.Handler r0 = r0.A02
            r306 = r0
            r0 = r301
            r307 = r0
            r0 = r301
            r1 = r306
            r0.mMainThreadHandler = r1
            r0 = r302
            boolean r0 = r0.A06
            r308 = r0
            r0 = r301
            r1 = r308
            r0.mNotifyJavaOnSigquit = r1
            boolean r0 = com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.sIsArt
            r309 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r310 = r0
            java.lang.String r0 = ""
            r311 = r0
            r0 = r302
            java.lang.String r0 = r0.A05
            r312 = r0
            java.lang.String r0 = ".stacktrace"
            r313 = r0
            r0 = r302
            java.lang.String r0 = r0.A04
            r314 = r0
            java.lang.String r0 = ":"
            r306 = r0
            r0 = r314
            r1 = r306
            boolean r0 = r0.contains(r1)
            r315 = r0
            r0 = r315
            if (r0 == 0) goto L6d
            java.lang.String r0 = ":browser"
            r306 = r0
            r0 = r314
            r1 = r306
            boolean r0 = r0.endsWith(r1)
            r315 = r0
            r0 = 0
            r316 = r0
            r0 = r315
            if (r0 == 0) goto L70
        L6d:
            r0 = 1
            r316 = r0
        L70:
            r0 = r305
            boolean r0 = r0.A0A
            r317 = r0
            r0 = r305
            boolean r0 = r0.A08
            r318 = r0
            r0 = r305
            boolean r0 = r0.A07
            r319 = r0
            r0 = r305
            java.lang.String r0 = r0.A00()
            r320 = r0
            r0 = r305
            boolean r0 = r0.A09
            r315 = r0
            r0 = r307
            r1 = r309
            r2 = r310
            r3 = r311
            r4 = r311
            r5 = r312
            r6 = r313
            r7 = r316
            r8 = r303
            r9 = r317
            r10 = r318
            r11 = r319
            r12 = r320
            r13 = r315
            r14 = r308
            r15 = 0
            r16 = 0
            nativeInit(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.init(X.04a, boolean):void");
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void installSignalHandler(final Handler handler, final boolean z) {
        final Runnable runnable = new Runnable() { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.1
            @Override // java.lang.Runnable
            public void run() {
                boolean nativeHookMethods = SigquitDetectorLacrima.nativeHookMethods();
                SigquitDetectorLacrima.this.mListener.onHookedMethods(nativeHookMethods);
                if (nativeHookMethods && z) {
                    SigquitDetectorLacrima.this.startDetector();
                }
            }
        };
        if (this.mNotifyJavaOnSigquit) {
            new Thread("LacrimaSigquitNotifier") { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    SigquitDetectorLacrima.nativeWaitForSignal();
                }
            }.start();
        }
        this.mMainThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.3
            @Override // java.lang.Runnable
            public void run() {
                SigquitDetectorLacrima.nativeAddSignalHandler();
                handler.post(runnable);
            }
        });
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void startDetector() {
        nativeStartDetector();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetector
    public void stopDetector() {
        nativeStopDetector();
    }
}
