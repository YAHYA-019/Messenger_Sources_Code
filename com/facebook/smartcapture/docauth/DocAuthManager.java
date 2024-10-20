package com.facebook.smartcapture.docauth;

import X.11T;
import X.1BK;
import X.7zL;
import X.7zO;
import X.7zS;
import X.AbH;
import X.C0il;
import X.QpM;
import X.Reh;
import android.content.Context;
import android.graphics.Rect;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import com.facebook.smartcapture.flow.FbCardScannerExperimentConfig;
import com.facebook.smartcapture.flow.FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: DocAuthManager.class */
public final class DocAuthManager {
    public float alignmentScaleX;
    public int bytesPerPixel;
    public final Context context;
    public WeakReference delegate;
    public final IdCaptureConfig idCaptureConfig;
    public boolean isImageProcessingRunning;
    public boolean isNativeLibraryLoaded;
    public final IdCaptureLogger logger;
    public HybridData mHybridData;
    public int previewHeight;
    public Rect previewRegionOfInterest;
    public int previewWidth;

    public DocAuthManager(Context context, IdCaptureConfig idCaptureConfig, IdCaptureLogger idCaptureLogger) {
        7zS.A16(1, context, idCaptureConfig, idCaptureLogger);
        this.context = context;
        this.idCaptureConfig = idCaptureConfig;
        this.logger = idCaptureLogger;
        this.isImageProcessingRunning = true;
    }

    private final native void initCreditCardScanner(String str, String str2, String str3);

    private final native void initCreditCardScanner(String str, String str2, String str3, int i, float f, boolean z);

    private final native HybridData initHybrid(IdCaptureLogger idCaptureLogger, boolean z, boolean z2, boolean z3, String str);

    private final native DocAuthResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r301.idCaptureConfig.A01() == X.Qpv.A02) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldRunNativeProcessing() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isNativeLibraryLoaded
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r0.idCaptureConfig
            r303 = r0
            r0 = r303
            X.Qpv r0 = r0.A01()
            r304 = r0
            X.Qpv r0 = X.Qpv.A02
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L24
        L20:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L24:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.docauth.DocAuthManager.shouldRunNativeProcessing():boolean");
    }

    public final void cleanupJNI() {
        synchronized (this) {
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
            }
            this.mHybridData = null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final void initJNI(boolean z, boolean z2, Map map) {
        int i;
        float f;
        boolean z3;
        synchronized (this) {
            11T.A0F(map, 2);
            try {
                if (this.idCaptureConfig.A0H) {
                    C0il.A0C("dynamic_pytorch_impl", 16);
                    C0il.A0C("torch-code-gen", 16);
                    C0il.A0B("smartcapture_id_pt_cc");
                } else if (z2) {
                    C0il.A0C("dynamic_pytorch_impl", 16);
                    C0il.A0C("torch-code-gen", 16);
                    C0il.A0B("smartcapture_id_pt");
                } else {
                    C0il.A0B("smartcapture_id");
                }
                this.isNativeLibraryLoaded = true;
            } catch (UnsatisfiedLinkError unused) {
            }
            cleanupJNI();
            if (shouldRunNativeProcessing()) {
                this.mHybridData = initHybrid(this.logger, this.idCaptureConfig.A0I, z, z2, AbH.A1C(QpM.A04, map));
                if (this.idCaptureConfig.A0H) {
                    String A1C = AbH.A1C(QpM.A05, map);
                    String A1C2 = AbH.A1C(QpM.A06, map);
                    String A1C3 = AbH.A1C(QpM.A07, map);
                    FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider fbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider = this.idCaptureConfig.A06;
                    if (A1C != null && A1C2 != null && A1C3 != null) {
                        if (fbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider != null) {
                            FbCardScannerExperimentConfig fbCardScannerExperimentConfig = fbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider.A00;
                            if (fbCardScannerExperimentConfig == null) {
                                throw 1BK.A0h();
                            }
                            11T.A0I(fbCardScannerExperimentConfig, "null cannot be cast to non-null type com.facebook.smartcapture.experimentation.CardScannerExperimentConfig");
                            i = fbCardScannerExperimentConfig.A01;
                            f = fbCardScannerExperimentConfig.A00;
                            z3 = fbCardScannerExperimentConfig.A03;
                        } else {
                            i = 1;
                            f = 0.8f;
                            z3 = false;
                        }
                        initCreditCardScanner(A1C, A1C2, A1C3, i, f, z3);
                    }
                }
            } else {
                this.mHybridData = null;
            }
        }
    }

    public void onPreviewBytesPerPixelChanged(int i) {
        this.bytesPerPixel = i;
    }

    public void onPreviewFrame(byte[] bArr) {
        synchronized (this) {
            11T.A0F(bArr, 0);
            if (shouldRunNativeProcessing() && this.isImageProcessingRunning && this.mHybridData != null) {
                int i = this.previewWidth;
                int i2 = this.previewHeight;
                float f = this.alignmentScaleX;
                Rect rect = this.previewRegionOfInterest;
                11T.A0D(rect);
                int i3 = rect.left;
                Rect rect2 = this.previewRegionOfInterest;
                11T.A0D(rect2);
                int i4 = rect2.top;
                Rect rect3 = this.previewRegionOfInterest;
                11T.A0D(rect3);
                int i5 = rect3.right;
                Rect rect4 = this.previewRegionOfInterest;
                11T.A0D(rect4);
                int i6 = i5 - rect4.left;
                Rect rect5 = this.previewRegionOfInterest;
                11T.A0D(rect5);
                int i7 = rect5.bottom;
                Rect rect6 = this.previewRegionOfInterest;
                11T.A0D(rect6);
                DocAuthResult processImageBuffer = processImageBuffer(bArr, i, i2, f, i3, i4, i6, i7 - rect6.top, this.bytesPerPixel);
                Rect rect7 = this.previewRegionOfInterest;
                11T.A0D(rect7);
                int i8 = rect7.bottom;
                Rect rect8 = this.previewRegionOfInterest;
                11T.A0D(rect8);
                int i9 = i8 - rect8.top;
                WeakReference weakReference = this.delegate;
                11T.A0D(weakReference);
                DocAuthManagerDelegate docAuthManagerDelegate = (DocAuthManagerDelegate) weakReference.get();
                if (processImageBuffer != null && docAuthManagerDelegate != null) {
                    docAuthManagerDelegate.onDocAuthResultAvailable(processImageBuffer, i9);
                }
                if (this.idCaptureConfig.A0I && processImageBuffer != null) {
                    DiagnosticInfo diagnosticInfo = processImageBuffer.diagnosticInfo;
                    if (diagnosticInfo != null) {
                        Rect rect9 = this.previewRegionOfInterest;
                        11T.A0D(rect9);
                        int i10 = rect9.right;
                        Rect rect10 = this.previewRegionOfInterest;
                        11T.A0D(rect10);
                        diagnosticInfo.previewWidth = i10 - rect10.left;
                        diagnosticInfo.previewHeight = i9;
                        if (docAuthManagerDelegate != null) {
                            docAuthManagerDelegate.onDiagnosticInfoAvailable(diagnosticInfo);
                        }
                    }
                }
            }
        }
    }

    public void onPreviewSizeChanged(int i, int i2, int i3, int i4) {
        this.previewWidth = i;
        this.previewHeight = i2;
        this.previewRegionOfInterest = Reh.A01(i3, i4, i, i2);
        this.alignmentScaleX = 1.0f - (((16.0f * 7zO.A0I(this.context).density) * 2.0f) / i3);
    }

    public final void setDelegate(DocAuthManagerDelegate docAuthManagerDelegate) {
        11T.A0F(docAuthManagerDelegate, 0);
        this.delegate = 7zL.A14(docAuthManagerDelegate);
    }

    public final void setImageProcessingRunning(boolean z) {
        this.isImageProcessingRunning = z;
    }
}
