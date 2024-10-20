package X;

/* renamed from: X.7tf, reason: invalid class name */
/* loaded from: 7tf.class */
public final class C7tf {
    public final String A00;

    public C7tf(String str) {
        this.A00 = str;
    }

    public static C7tf A00(6aO r301) {
        String str;
        String str2;
        r301.A0Q(2);
        int A07 = r301.A07();
        int i = A07 >> 1;
        int A072 = ((r301.A07() >> 3) & 31) | ((A07 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        str2 = ".0";
        return new C7tf(0Pz.A0p(str, str2, A072 >= 10 ? "." : ".0", i, A072));
    }
}
