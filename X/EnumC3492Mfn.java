package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mfn, reason: case insensitive filesystem */
/* loaded from: Mfn.class */
public final class EnumC3492Mfn {
    public static final /* synthetic */ EnumC3492Mfn[] A00;
    public static final EnumC3492Mfn A01;
    public static final EnumC3492Mfn A02;
    public static final EnumC3492Mfn A03;
    public static final EnumC3492Mfn A04;
    public static final EnumC3492Mfn A05;
    public static final EnumC3492Mfn A06;
    public static final EnumC3492Mfn A07;
    public static final EnumC3492Mfn A08;
    public static final EnumC3492Mfn A09;
    public static final EnumC3492Mfn A0A;
    public static final EnumC3492Mfn A0B;
    public static final EnumC3492Mfn A0C;
    public static final EnumC3492Mfn A0D;
    public static final EnumC3492Mfn A0E;
    public static final EnumC3492Mfn A0F;
    public static final EnumC3492Mfn A0G;
    public static final EnumC3492Mfn A0H;
    public static final EnumC3492Mfn A0I;
    public static final EnumC3492Mfn A0J;
    public static final EnumC3492Mfn A0K;
    public static final EnumC3492Mfn A0L;
    public static final EnumC3492Mfn A0M;
    public static final EnumC3492Mfn A0N;
    public static final EnumC3492Mfn A0O;
    public static final EnumC3492Mfn A0P;
    public static final EnumC3492Mfn A0Q;
    public static final EnumC3492Mfn A0R;
    public static final EnumC3492Mfn A0S;
    public static final EnumC3492Mfn A0T;
    public static final EnumC3492Mfn A0U;
    public static final EnumC3492Mfn A0V;
    public static final EnumC3492Mfn A0W;
    public static final EnumC3492Mfn A0X;
    public static final EnumC3492Mfn A0Y;
    public final boolean isTerminalStatus;

    static {
        EnumC3492Mfn enumC3492Mfn = new EnumC3492Mfn("R_PENDING", 0, false);
        A0B = enumC3492Mfn;
        EnumC3492Mfn A012 = A01("R_PENDING_VERIFICATION", 1, false);
        A0H = A012;
        EnumC3492Mfn A013 = A01("R_PENDING_VERIFICATION_PROCESSING", 2, false);
        A0I = A013;
        EnumC3492Mfn A014 = A01("R_PENDING_MANUAL_REVIEW", 3, false);
        A0C = A014;
        EnumC3492Mfn A015 = A01("R_CANCELED", 4, true);
        A01 = A015;
        EnumC3492Mfn A016 = A01("R_CANCELED_SENDER_RISK", 5, true);
        A08 = A016;
        EnumC3492Mfn A017 = A01("R_CANCELED_RECIPIENT_RISK", 6, true);
        A06 = A017;
        EnumC3492Mfn A018 = A01("R_CANCELED_DECLINED", 7, true);
        A04 = A018;
        EnumC3492Mfn A019 = A01("R_CANCELED_EXPIRED", 8, true);
        A05 = A019;
        EnumC3492Mfn A0110 = A01("R_CANCELED_SAME_CARD", 9, true);
        A07 = A0110;
        EnumC3492Mfn A0111 = A01("R_CANCELED_CUSTOMER_SERVICE", 10, true);
        A03 = A0111;
        EnumC3492Mfn A0112 = A01("R_CANCELED_CHARGEBACK", 11, true);
        A02 = A0112;
        EnumC3492Mfn A0113 = A01("R_CANCELED_SYSTEM_FAIL", 12, true);
        A09 = A0113;
        EnumC3492Mfn A0114 = A01("R_COMPLETED", 13, true);
        A0A = A0114;
        EnumC3492Mfn A0115 = A01("R_PENDING_NUX", 14, false);
        A0D = A0115;
        EnumC3492Mfn A0116 = A01("R_PENDING_PROCESSING", 15, false);
        A0E = A0116;
        EnumC3492Mfn A0117 = A01("R_PENDING_PUSH_FAIL", 16, false);
        A0F = A0117;
        EnumC3492Mfn A0118 = A01("R_PENDING_PUSH_FAIL_CARD_EXPIRED", 17, false);
        A0G = A0118;
        EnumC3492Mfn A0119 = A01("S_PENDING", 18, false);
        A0T = A0119;
        EnumC3492Mfn A0120 = A01("S_PENDING_VERIFICATION", 19, false);
        A0V = A0120;
        EnumC3492Mfn A0121 = A01("S_PENDING_VERIFICATION_PROCESSING", 20, false);
        A0W = A0121;
        EnumC3492Mfn A0122 = A01("S_PENDING_MANUAL_REVIEW", 21, false);
        A0U = A0122;
        EnumC3492Mfn A0123 = A01("S_CANCELED", 22, true);
        A0J = A0123;
        EnumC3492Mfn A0124 = A01("S_CANCELED_SENDER_RISK", 23, true);
        A0Q = A0124;
        EnumC3492Mfn A0125 = A01("S_CANCELED_RECIPIENT_RISK", 24, true);
        A0O = A0125;
        EnumC3492Mfn A0126 = A01("S_CANCELED_DECLINED", 25, true);
        A0M = A0126;
        EnumC3492Mfn A0127 = A01("S_CANCELED_EXPIRED", 26, true);
        A0N = A0127;
        EnumC3492Mfn A0128 = A01("S_CANCELED_SAME_CARD", 27, true);
        A0P = A0128;
        EnumC3492Mfn A0129 = A01("S_CANCELED_CUSTOMER_SERVICE", 28, true);
        A0L = A0129;
        EnumC3492Mfn A0130 = A01("S_CANCELED_CHARGEBACK", 29, true);
        A0K = A0130;
        EnumC3492Mfn A0131 = A01("S_CANCELED_SYSTEM_FAIL", 30, true);
        A0R = A0131;
        EnumC3492Mfn A0132 = A01("S_COMPLETED", 31, true);
        A0S = A0132;
        EnumC3492Mfn A0133 = A01("S_SENT", 32, false);
        A0X = A0133;
        EnumC3492Mfn A0134 = A01("UNKNOWN_STATUS", 33, false);
        A0Y = A0134;
        EnumC3492Mfn[] enumC3492MfnArr = new EnumC3492Mfn[34];
        System.arraycopy(new EnumC3492Mfn[]{enumC3492Mfn, A012, A013, A014, A015, A016, A017, A018, A019, A0110, A0111, A0112, A0113, A0114, A0115, A0116, A0117, A0118, A0119, A0120, A0121, A0122, A0123, A0124, A0125, A0126, A0127}, 0, enumC3492MfnArr, 0, 27);
        System.arraycopy(new EnumC3492Mfn[]{A0128, A0129, A0130, A0131, A0132, A0133, A0134}, 0, enumC3492MfnArr, 27, 7);
        A00 = enumC3492MfnArr;
    }

    public EnumC3492Mfn(String str, int i, boolean z) {
        this.isTerminalStatus = z;
    }

    public static EnumC3492Mfn A00(String str) {
        EnumC3492Mfn enumC3492Mfn;
        EnumC3492Mfn[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                enumC3492Mfn = A0Y;
                break;
            }
            enumC3492Mfn = values[i2];
            if (enumC3492Mfn.name().equalsIgnoreCase(str)) {
                break;
            }
            i = i2 + 1;
        }
        return enumC3492Mfn;
    }

    public static EnumC3492Mfn A01(String str, int i, boolean z) {
        return new EnumC3492Mfn(str, i, z);
    }

    public static EnumC3492Mfn valueOf(String str) {
        return (EnumC3492Mfn) Enum.valueOf(EnumC3492Mfn.class, str);
    }

    public static EnumC3492Mfn[] values() {
        return (EnumC3492Mfn[]) A00.clone();
    }
}
