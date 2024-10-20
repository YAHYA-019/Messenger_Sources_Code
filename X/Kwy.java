package X;

/* loaded from: Kwy.class */
public abstract class Kwy {
    public static final long A00 = KUR.A00(0.0f, 0.0f);

    public static String A00(long j) {
        float A002 = DKH.A00(j);
        float A02 = JR1.A02(j);
        boolean A1O = AnonymousClass001.A1O((A002 > A02 ? 1 : (A002 == A02 ? 0 : -1)));
        StringBuilder A0k = AnonymousClass001.A0k();
        if (A1O) {
            A0k.append("CornerRadius.circular(");
        } else {
            A0k.append("CornerRadius.elliptical(");
            A0k.append(KUS.A00(A002));
            AnonymousClass001.A1H(A0k);
            A002 = A02;
        }
        A0k.append(KUS.A00(A002));
        return AnonymousClass001.A0g(A0k, ')');
    }
}
