package X;

/* renamed from: X.2a4, reason: invalid class name */
/* loaded from: 2a4.class */
public abstract class C2a4 {
    public static final 0DJ A02 = new 0DJ("COMPLETING_ALREADY");
    public static final 0DJ A04 = new 0DJ("COMPLETING_WAITING_CHILDREN");
    public static final 0DJ A03 = new 0DJ("COMPLETING_RETRY");
    public static final 0DJ A06 = new 0DJ("TOO_LATE_TO_CANCEL");
    public static final 0DJ A05 = new 0DJ("SEALED");
    public static final C2a5 A01 = new C2a5(false);
    public static final C2a5 A00 = new C2a5(true);

    public static final Object A00(Object obj) {
        C44q c44q;
        C2a6 c2a6;
        return (!(obj instanceof C44q) || (c44q = (C44q) obj) == null || (c2a6 = c44q.A00) == null) ? obj : c2a6;
    }
}
