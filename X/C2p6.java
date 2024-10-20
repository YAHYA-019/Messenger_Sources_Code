package X;

/* renamed from: X.2p6, reason: invalid class name */
/* loaded from: 2p6.class */
public abstract class C2p6 {
    public static final C2p8 A00;
    public static final C2p8 A01;
    public static final C2p8 A02;
    public static final C2p8 A03;
    public static final C2p8 A04;

    static {
        2KE r0 = C2p7.A01;
        C1u7 c1u7 = C1u7.A08;
        2KE r02 = C2p7.A00;
        C1u7 c1u72 = C1u7.A0A;
        A01 = new C2p8(c1u7, c1u72, c1u72, c1u72, r0, r02, r02, r02);
        2KE r03 = 2KE.A09;
        2KE r04 = 2KE.A02;
        A00 = new C2p8(c1u7, c1u72, c1u72, c1u72, r03, r04, r04, r04);
        A02 = new C2p8(c1u7, c1u72, c1u72, C1u7.A06, r03, r04, r04, r04);
        2KE r05 = 2KE.A0D;
        2KE r06 = 2KE.A0E;
        A04 = new C2p8(c1u7, c1u7, c1u72, c1u72, r05, r06, r02, r02);
        A03 = new C2p8(c1u7, c1u7, c1u7, c1u7, r05, r06, r06, r06);
    }

    public static final C2p8 A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return A01;
        }
        if (intValue == 1) {
            return A00;
        }
        if (intValue == 2) {
            return A04;
        }
        if (intValue == 3) {
            return A03;
        }
        if (intValue == 4) {
            return A02;
        }
        throw AnonymousClass001.A0L("Unsupported thread item text style param type!");
    }
}
