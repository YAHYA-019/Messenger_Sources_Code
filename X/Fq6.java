package X;

import java.util.HashMap;

/* loaded from: Fq6.class */
public final class Fq6 implements GIY {
    public final /* synthetic */ DZW A00;

    public Fq6(DZW dzw) {
        this.A00 = dzw;
    }

    public void Bxj(Integer num, String str, String str2, String str3) {
        FIT fit;
        String str4;
        DZW dzw = this.A00;
        if (num == 0S2.A0Y) {
            fit = dzw.A08;
            if (fit != null) {
                str4 = "purchase_unsuccessful";
                fit.A0J(str4, (HashMap) null);
            }
        } else if (num == 0S2.A0j) {
            fit = dzw.A08;
            if (fit != null) {
                str4 = "consume_unsuccessful";
                fit.A0J(str4, (HashMap) null);
            }
        }
        dzw.A0E.Ccf(str, str2, str3);
    }

    public void COw(Integer num, Object obj, String str) {
        FIT fit;
        String str2;
        DZW dzw = this.A00;
        if (num == 0S2.A0Y) {
            fit = dzw.A08;
            if (fit != null) {
                str2 = "purchase_successful";
                fit.A0J(str2, (HashMap) null);
            }
        } else if (num == 0S2.A0j) {
            fit = dzw.A08;
            if (fit != null) {
                str2 = "consume_successful";
                fit.A0J(str2, (HashMap) null);
            }
        }
        dzw.A0E.Ci7(str, obj);
    }
}
