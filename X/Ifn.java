package X;

/* loaded from: Ifn.class */
public abstract class Ifn implements JMR {
    public static void A00(String str, String str2, String str3) {
        0fH.A0j("[NoopRtcTTRCTraceImpl]", 0Pz.A0w(str, str2, ", ", str3, ')'));
    }

    public void ADz(String str) {
        0fH.A0j("[NoopRtcTTRCTraceImpl]", 0Pz.A0X("cancel(", str, ')'));
    }

    public void ARr(String str) {
        0fH.A0j("[NoopRtcTTRCTraceImpl]", 0Pz.A0X("endWithError(", str, ')'));
    }

    public long BGc() {
        return 1L;
    }

    public void Bch(String str, String str2) {
        11T.A0F(str2, 1);
        A00("markerAnnotate(", str, str2);
    }

    public void Bct(String str, String str2) {
        A00("markPoint(", str, null);
    }

    public void Bcv(String str, String str2) {
        A00("markEndPoint(", str, str2);
    }

    public void Bcw(String str, String str2) {
        A00("markStartPoint(", str, null);
    }
}
