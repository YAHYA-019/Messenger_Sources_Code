package X;

/* renamed from: X.3X0, reason: invalid class name */
/* loaded from: 3X0.class */
public abstract class C3X0 implements 2Hi {
    public static final 2Hk A00 = new RnL();

    public static void A00(2Ho r301, StringBuilder sb, int i) {
        sb.append(r301.getName());
        sb.append(" (policy: ");
        sb.append(r301.B3p());
        sb.append(" , ver: ");
        sb.append(r301.BJA());
        sb.append(" , ver_timestamp: ");
        sb.append(r301.BBo());
        sb.append(" , sample_rate: ");
        sb.append(i);
        sb.append(" , ");
        sb.append(r301.B5o().A00());
        sb.append(")");
    }

    public static boolean A01(String str, StringBuilder sb, Object[] objArr) {
        if (objArr == null) {
            return false;
        }
        sb.append(str);
        1JF.A09(A00, ", ", sb, objArr);
        return true;
    }
}
