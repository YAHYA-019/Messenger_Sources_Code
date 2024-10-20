package X;

/* renamed from: X.2do, reason: invalid class name */
/* loaded from: 2do.class */
public abstract class C2do {
    public static final 1G2 A00;
    public static final 1G2 A01;
    public static final 1G2 A02;

    static {
        1G3 r0 = new 1G3("/notifications/permission/");
        A02 = r0;
        1G2 A0D = r0.A0D("permission_nux_displayed");
        11T.A0A(A0D);
        A01 = A0D;
        1G2 A0D2 = r0.A0D("permission_inbox_prompt_suppressed");
        11T.A0A(A0D2);
        A00 = A0D2;
    }
}
