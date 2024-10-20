package X;

import android.net.Uri;

/* loaded from: F1k.class */
public abstract class F1k {
    public static String A00(String str) {
        Uri A00;
        String str2 = null;
        if (str != null && (A00 = FGF.A00(str)) != null) {
            str2 = A00.getScheme();
        }
        return str2;
    }

    public static void A01(C1kw c1kw, FFL ffl) {
        if (DTm.A00 == null) {
            synchronized (DTm.class) {
                if (DTm.A00 == null) {
                    DTm.A00 = new C2J3(c1kw);
                }
            }
        }
        AbstractC01593ro A0A = AbJ.A0A(DTm.A00, "fb4a_sanitized_thirdparty_appsite");
        if (A0A.A0B()) {
            A0A.A06("appsite_data", ffl.toString());
            A0A.A0A();
        }
    }
}
