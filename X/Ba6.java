package X;

/* loaded from: Ba6.class */
public abstract class Ba6 {
    public static final C11644x6 A00;
    public static final C11644x6 A01;
    public static final C11644x6 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;
    public static final 1G2 A05;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.4x6, X.1G3] */
    static {
        1G2 A012 = 1G3.A01(1G0.A04, "znotif/");
        A05 = A012;
        A03 = 1G3.A01(A012, "last_web_sent_ms");
        A04 = 1G3.A01(A012, "oldest_zp_wakeup");
        ?? r0 = new 1G3("/znotif/");
        A02 = r0;
        C11644x6 c11644x6 = (C11644x6) r0.A0D("msg_time/");
        A00 = c11644x6;
        A01 = (C11644x6) c11644x6.A0D("def");
    }
}
