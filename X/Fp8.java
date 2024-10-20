package X;

import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: Fp8.class */
public final class Fp8 implements GGA {
    public final /* synthetic */ DZW A00;

    public Fp8(DZW dzw) {
        this.A00 = dzw;
    }

    public void A7n() {
        String str;
        DZW dzw = this.A00;
        FAX fax = dzw.A09;
        Integer num = 0S2.A01;
        fax.A07 = num;
        fax.A0B = 1BK.A0t();
        dzw.A0D.A00();
        dzw.A0a.get();
        FHq.A01(dzw.A07.A05, (GGC) null);
        FIT fit = dzw.A08;
        if (fit != null) {
            fit.A0C("game_loading_view_completed");
        }
        FIT fit2 = dzw.A08;
        if (fit2 != null) {
            fit2.A0C("game_active");
        }
        C00i c00i = dzw.A10;
        if (((FcN) c00i.get()).A02()) {
            ((FcN) c00i.get()).A00();
            String A0t = 1BK.A0t();
            FIT fit3 = dzw.A08;
            if (fit3 != null) {
                fit3.A0E("shortcut_dialog_accepted", num, A0t);
            }
            Er6 er6 = dzw.A09.A03;
            if (er6 != null && er6.A0g != null) {
                ((C3X) dzw.A0l.get()).A00(er6.A0g);
            }
        }
        int A00 = C1Ur.A00(FHN.A00(dzw.A0o), 0, 36592618887447441L);
        Er6 er62 = dzw.A09.A03;
        if (A00 > 0 && er62 != null && (str = er62.A0g) != null) {
            DZW.A0G(dzw, str, A00);
        }
        dzw.A0E.Ckm(dzw.A0N ? EOz.A0L : EOz.A03, dzw.A0A.A0F());
        dzw.A0N = true;
        QuicksilverActivity quicksilverActivity = dzw.A06.A01;
        2Wo r0 = quicksilverActivity.A0I;
        if (r0 != null && r0.A04()) {
            QuicksilverActivity.A1F(quicksilverActivity);
        } else if (quicksilverActivity.A0C != null) {
            QuicksilverActivity.A1J(quicksilverActivity, Boolean.valueOf(quicksilverActivity.A0O));
        }
    }
}
