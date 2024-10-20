package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.1v8, reason: invalid class name */
/* loaded from: 1v8.class */
public final class C1v8 {
    public static final Capabilities A02;
    public static final Capabilities A03;
    public static final Capabilities A04;
    public static final Capabilities A05;
    public static final Capabilities A06;
    public static final Capabilities A07;
    public final C15h A00 = new C3j6(19);
    public final C15h A01 = new C3j6(20);

    static {
        1M7 r0 = Capabilities.A01;
        A07 = r0.A02(new int[]{1, 0, 27, 28, 8, 12, 29, 26, 14, 19, 30, 33, 32, 31, 34, 10, 11, 35, 58, 37, 36, 39, 40, 41, 42, 43, 52, 53, 54, 55, 56, 57, 44, 45, 48, 50, 51, 15, 2, 60, 9, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77});
        A06 = r0.A02(new int[]{1, 0, 27, 28, 8, 12, 14, 30, 33, 32, 31, 34, 10, 58, 37, 36, 39, 40, 41, 42, 43, 52, 53, 54, 55, 56, 57, 44, 45, 48, 50, 51, 60, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77});
        A04 = r0.A02(new int[]{28, 8, 46, 47, 49, 42, 41, 38, 61, 56, 66, 68, 69, 70, 71, 72, 73, 74, 75, 76, 58});
        A05 = r0.A02(new int[]{28, 36, 29, 14, 8, 45, 41, 53, 55});
        A02 = r0.A02(new int[]{1, 27, 28, 8, 29, 14, 19, 30, 33, 32, 31, 34, 10, 35, 58, 37, 36, 39, 41, 42, 43, 52, 53, 54, 55, 56, 57, 44, 45, 50, 51, 15, 2, 60, 9, 64, 69, 70, 71, 72, 73, 74, 75, 76, 77});
        A03 = Capabilities.A02;
    }

    public final int A00() {
        int i;
        Object obj = this.A00.get();
        11T.A0A(obj);
        if (((Boolean) obj).booleanValue()) {
            i = 1;
        } else {
            String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
            C15h c15h = this.A01;
            if (c15h.get() != null && !11T.A0O(str, c15h.get())) {
                return 2;
            }
            i = 0;
            if (((1Wa) 1Bi.A03(66347)).A00()) {
                return 6;
            }
        }
        return i;
    }

    public final Capabilities A01() {
        int A00 = A00();
        if (A00 == 0) {
            return A07;
        }
        if (A00 == 1) {
            return A04;
        }
        if (A00 == 2) {
            return A06;
        }
        if (A00 == 3) {
            return A05;
        }
        if (A00 == 6) {
            return A02;
        }
        0fH.A0o("AccountCapabilityFactory", "Wrong account type when computing account capabilities.");
        return A03;
    }
}
