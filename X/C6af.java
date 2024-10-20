package X;

/* renamed from: X.6af, reason: invalid class name */
/* loaded from: 6af.class */
public abstract class C6af {
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int A00(C6ae c6ae) {
        String str;
        int A02 = c6ae.A02(4);
        if (A02 == 15) {
            if (c6ae.A01() >= 24) {
                return c6ae.A02(24);
            }
            str = "AAC header insufficient data";
        } else {
            if (A02 < 13) {
                return A01[A02];
            }
            str = "AAC header wrong Sampling Frequency Index";
        }
        throw KLu.A02(str, (Throwable) null);
    }

    public static C6ag A01(C6ae c6ae, boolean z) {
        StringBuilder A0k;
        int A02 = c6ae.A02(5);
        if (A02 == 31) {
            A02 = c6ae.A02(6) + 32;
        }
        int A002 = A00(c6ae);
        int A022 = c6ae.A02(4);
        String A0T = 0Pz.A0T("mp4a.40.", A02);
        if (A02 == 5 || A02 == 29) {
            A002 = A00(c6ae);
            A02 = c6ae.A02(5);
            if (A02 == 31) {
                A02 = c6ae.A02(6) + 32;
            }
            if (A02 == 22) {
                A022 = c6ae.A02(4);
            }
        }
        if (z) {
            if (A02 != 1 && A02 != 2 && A02 != 3 && A02 != 4 && A02 != 6 && A02 != 7 && A02 != 17) {
                switch (A02) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        A0k = AnonymousClass001.A0k();
                        A0k.append("Unsupported audio object type: ");
                        A0k.append(A02);
                        throw KLu.A00(A0k.toString());
                }
            }
            if (c6ae.A0A()) {
                5My.A04("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c6ae.A0A()) {
                c6ae.A06(14);
            }
            boolean A0A = c6ae.A0A();
            if (A022 == 0) {
                throw AnonymousClass001.A0p();
            }
            if (A02 == 6 || A02 == 20) {
                c6ae.A06(3);
            }
            if (A0A) {
                if (A02 == 22) {
                    c6ae.A06(16);
                } else if (A02 == 17 || A02 == 19 || A02 == 20 || A02 == 23) {
                    c6ae.A06(3);
                }
                c6ae.A06(1);
            }
            switch (A02) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int A023 = c6ae.A02(2);
                    if (A023 == 2 || A023 == 3) {
                        A0k = AnonymousClass001.A0k();
                        A0k.append("Unsupported epConfig: ");
                        A0k.append(A023);
                        throw KLu.A00(A0k.toString());
                    }
                    break;
            }
        }
        int i = A00[A022];
        if (i != -1) {
            return new C6ag(A002, i, A0T);
        }
        throw KLu.A02((String) null, (Throwable) null);
    }
}
