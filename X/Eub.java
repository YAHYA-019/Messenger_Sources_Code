package X;

import android.content.Context;
import android.view.View;
import com.facebook.iorg.common.upsell.model.PromoDataModel;

/* loaded from: Eub.class */
public final class Eub {
    public final C00i A02;
    public final /* synthetic */ Dpo A03;
    public FAG A01 = null;
    public View A00 = null;

    public Eub(C00i c00i, Dpo dpo) {
        this.A03 = dpo;
        this.A02 = c00i;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.Dpo, androidx.fragment.app.Fragment] */
    public View A00(Context context) {
        C00i c00i;
        if (this.A00 == null) {
            if (this.A01 == null && (c00i = this.A02) != null) {
                FAG fag = (FAG) c00i.get();
                this.A01 = fag;
                ?? r0 = this.A03;
                PromoDataModel promoDataModel = (PromoDataModel) r0.requireArguments().getParcelable("promo_data_model");
                fag.A01 = r0;
                fag.A00 = promoDataModel;
            }
            FAG fag2 = this.A01;
            if (fag2 != null) {
                this.A00 = fag2.A03(context, this.A03.A00);
            }
        }
        return this.A00;
    }
}
