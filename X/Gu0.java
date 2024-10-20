package X;

/* loaded from: Gu0.class */
public final class Gu0 extends HDP {
    public String mErrorSeverity;

    public Gu0(String str, Throwable th) {
        super(str, th, th instanceof HDP ? ((HDP) th).mErrorCode : 20000);
    }

    public Gu0(Throwable th) {
        super(DKE.A12(th), th, th instanceof HDP ? ((HDP) th).mErrorCode : 20000);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HDP, X.Gu0] */
    public static Gu0 A00(String str) {
        return new HDP(20000, str);
    }
}
