package X;

import android.text.Spannable;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.iorg.common.upsell.model.PromoDataModel;
import com.facebook.iorg.common.upsell.server.ZeroRecommendedPromoResult;

/* loaded from: Dpg.class */
public final class Dpg extends FAG {
    public final Evr A00;
    public final EgS A01;
    public final EgU A02;

    public Dpg() {
        EgS egS = (EgS) 1Bi.A03(98826);
        Evr A0X = DKG.A0X();
        EgU egU = (EgU) 1Bi.A03(98827);
        this.A01 = egS;
        this.A00 = A0X;
        this.A02 = egU;
    }

    public void A05(DQU dqu) {
        String string;
        EM6 em6;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PromoDataModel promoDataModel = ((FAG) this).A00;
        if (promoDataModel != null) {
            str6 = promoDataModel.A08;
        }
        Dpo dpo = ((FAG) this).A01;
        ZeroRecommendedPromoResult zeroRecommendedPromoResult = dpo.A02;
        String str7 = zeroRecommendedPromoResult != null ? zeroRecommendedPromoResult.A03 : "";
        String str8 = promoDataModel.A02;
        Q9d q9d = new Q9d(dpo, this, this.A00, this.A01, this.A02);
        boolean A0B = 1JF.A0B(promoDataModel.A03);
        PromoDataModel promoDataModel2 = ((FAG) this).A00;
        if (A0B) {
            str = promoDataModel2.A03;
            str2 = promoDataModel2.A06;
            str3 = promoDataModel2.A07;
            str4 = promoDataModel2.A04;
            string = ((FAG) this).A01.getString(2131967761);
            em6 = EM6.A07;
        } else {
            em6 = promoDataModel2.A00;
            if (em6 == null) {
                em6 = EM6.A07;
            }
            str5 = promoDataModel2.A03;
            string = ((FAG) this).A01.getString(2131967755);
        }
        DQU.A00((Spannable) null, q9d, FXs.A00(em6, this, 13), (View.OnClickListener) null, (CompoundButton.OnCheckedChangeListener) null, dqu, str, str2, str3, str4, (String) null, str5, str8, string, (String) null, str6, str7, 0, 0, false, true, false);
    }
}
