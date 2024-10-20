package X;

import java.util.HashMap;

/* loaded from: L7v.class */
public final class L7v {
    public static final long A00(long j) {
        return (0 > j || j >= 1356998400) ? -1 : j;
    }

    public static final void A01(long j, HashMap hashMap) {
        hashMap.put("dt", String.valueOf(A00(j)));
    }

    public final void A02(MKh mKh, HashMap hashMap) {
        11T.A0F(hashMap, 0);
        if (mKh != null) {
            String Aks = mKh.Aks();
            String AkR = mKh.AkR();
            int AkN = mKh.AkN();
            int ApV = mKh.ApV();
            String Arm = mKh.Arm();
            String BGb = mKh.BGb();
            if (Aks != null && Aks.length() != 0) {
                hashMap.put("ex_type", Aks);
            }
            if (AkR != null && AkR.length() != 0) {
                hashMap.put("ex_msg", AkR);
            }
            if (AkN != -1) {
                hashMap.put("ex_code", String.valueOf(AkN));
            }
            if (ApV != -1) {
                hashMap.put("http_status_code", String.valueOf(ApV));
            }
            if (Arm != null && Arm.length() != 0) {
                hashMap.put("error_type", Arm);
            }
            if (BGb == null || BGb.length() == 0) {
                return;
            }
            hashMap.put("ex_inner_msg", BGb);
        }
    }
}
