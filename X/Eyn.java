package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: Eyn.class */
public final class Eyn {
    public F6G A00;
    public final EcN A01;
    public final java.util.Map A02;
    public final java.util.Map A03;

    public Eyn(GCT gct, ETX etx, FbT fbT, JNI jni, QuickPerformanceLogger quickPerformanceLogger) {
        EcN ecN = new EcN();
        this.A01 = ecN;
        this.A03 = DKD.A13();
        this.A02 = DKD.A13();
        this.A00 = new F6G(gct, ecN, etx, fbT, jni, quickPerformanceLogger);
    }

    public void A00(FEf fEf, String str, boolean z) {
        F6G f6g = this.A00;
        String str2 = fEf.A01;
        int i = 22413316;
        if (fEf.A02) {
            i = 22413315;
        }
        int A05 = AbM.A05(str2, str);
        short s = 3;
        if (z) {
            s = 2;
        }
        QuickPerformanceLogger quickPerformanceLogger = f6g.A02;
        if (quickPerformanceLogger.isMarkerOn(i, A05)) {
            quickPerformanceLogger.markerEnd(i, A05, s);
            F6G.A00("logVoltronLoadFinish", "markerEnd", s != 2 ? "fail" : OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, str, str2, i);
        }
    }

    public void A01(String str) {
        ARRequestAsset aRRequestAsset = (ARRequestAsset) this.A02.get(str);
        if (aRRequestAsset != null) {
            String num = aRRequestAsset.A0B ? Integer.toString(aRRequestAsset.hashCode()) : aRRequestAsset.A02.A09;
            String str2 = ((FEf) DKC.A12(str, this.A03)).A01;
            F6G f6g = this.A00;
            int hashCode = str2.hashCode();
            QuickPerformanceLogger quickPerformanceLogger = f6g.A02;
            if (quickPerformanceLogger.isMarkerOn(22413313, hashCode)) {
                quickPerformanceLogger.markerPoint(22413313, hashCode, "user_download_slam_start");
                F6G.A00("logUserDownloadSlamStart", "markerPoint", "user_download_slam_start", num, str2, 22413313);
            }
        }
    }

    public void A02(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        ARRequestAsset aRRequestAsset = (ARRequestAsset) this.A02.get(str);
        if (aRRequestAsset != null) {
            String num = aRRequestAsset.A0B ? Integer.toString(aRRequestAsset.hashCode()) : aRRequestAsset.A02.A09;
            String str5 = ((FEf) DKC.A12(str, this.A03)).A01;
            F6G f6g = this.A00;
            int hashCode = str5.hashCode();
            QuickPerformanceLogger quickPerformanceLogger = f6g.A02;
            if (quickPerformanceLogger.isMarkerOn(22413313, hashCode)) {
                if (z) {
                    str3 = "user_download_slam_finish";
                    quickPerformanceLogger.markerPoint(22413313, hashCode, str3);
                    str2 = "logUserDownloadSlamFinish";
                    str4 = "markerPoint";
                } else {
                    quickPerformanceLogger.markerPoint(22413313, hashCode, "user_download_slam_fail");
                    quickPerformanceLogger.markerEnd(22413313, hashCode, (short) 3);
                    str2 = "logUserDownloadSlamFinish";
                    F6G.A00(str2, "markerPoint", "user_download_slam_fail", num, str5, 22413313);
                    str3 = "fail";
                    str4 = "markerEnd";
                }
                F6G.A00(str2, str4, str3, num, str5, 22413313);
            }
        }
    }
}
