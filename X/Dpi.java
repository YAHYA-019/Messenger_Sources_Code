package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.iorg.common.upsell.server.UpsellDialogScreenContent;
import com.facebook.iorg.common.upsell.server.ZeroRecommendedPromoResult;

/* loaded from: Dpi.class */
public final class Dpi extends FAG {
    public final Evr A00;
    public final EgS A01;
    public final EgU A02;
    public final Emd A03;
    public final C15h A04;

    public Dpi() {
        Emd emd = (Emd) 1Bn.A0B(98828);
        G7K A01 = G7K.A01(this, 25);
        Evr A0X = DKG.A0X();
        EgS egS = (EgS) 1Bi.A03(98826);
        EgU egU = (EgU) 1Bi.A03(98827);
        this.A03 = emd;
        this.A04 = A01;
        this.A00 = A0X;
        this.A01 = egS;
        this.A02 = egU;
    }

    public View A03(Context context, ViewGroup viewGroup) {
        Evr evr = this.A00;
        if (evr != null) {
            evr.A01(FES.A04, A04());
        }
        if (!1BL.A1a(this.A04)) {
            FAG.A01(this.A03);
        }
        UpsellDialogScreenContent upsellDialogScreenContent = (UpsellDialogScreenContent) DKC.A13(((FAG) this).A01.A01.A02);
        Dpo dpo = ((FAG) this).A01;
        ZeroRecommendedPromoResult zeroRecommendedPromoResult = dpo.A02;
        String str = zeroRecommendedPromoResult != null ? zeroRecommendedPromoResult.A03 : "";
        String str2 = upsellDialogScreenContent.A04;
        String str3 = upsellDialogScreenContent.A00;
        String str4 = upsellDialogScreenContent.A01;
        Q9c q9c = new Q9c(dpo, this, evr, this.A01, this.A02);
        String str5 = upsellDialogScreenContent.A02;
        FXr A00 = FAG.A00(this);
        DQU dqu = new DQU(context);
        DQU.A01(q9c, A00, (View.OnClickListener) null, dqu, (String) null, str3, str4, str5, (String) null, str2, str, false);
        return dqu;
    }
}
