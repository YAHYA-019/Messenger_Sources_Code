package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: E16.class */
public final class E16 extends 20R {
    public final 1Br A00;

    public E16() {
        super(60500878, false);
        this.A00 = 7zM.A0T();
    }

    public static final UserFlowLogger A00(E16 e16) {
        return 4YV.A0Z(e16.A00);
    }

    public static void A01(E16 e16, String str, String str2) {
        if (str2.endsWith(str)) {
            e16.A08(A00(e16), str2, (String) null);
        } else {
            e16.A08(A00(e16), 0Pz.A0W(str2, str), (String) null);
        }
    }

    public final void A09(String str) {
        11T.A0F(str, 0);
        A01(this, "_end", str);
    }

    public final void A0A(String str) {
        11T.A0F(str, 0);
        A01(this, "_start", str);
    }

    public final void A0B(String str, String str2) {
        11T.A0H(str, str2);
        A07(4YV.A0Z(this.A00), str, 1BK.A13(str2));
    }
}
