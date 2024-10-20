package X;

import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem;

/* loaded from: Jwp.class */
public final class Jwp extends AbstractC3052Jhk {
    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        return new Q3J(AbstractC3052Jhk.A01(viewGroup, this), this);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        Q3J q3j = (Q3J) c2lb;
        11T.A0H(fjc, q3j);
        if (FJC.A0C(fjc)) {
            Object obj = fjc.A01;
            if (obj == null) {
                throw 1BK.A0h();
            }
            ConfirmationProductUpsellSectionHeaderItem confirmationProductUpsellSectionHeaderItem = (ConfirmationProductUpsellSectionHeaderItem) obj;
            11T.A0F(confirmationProductUpsellSectionHeaderItem, 0);
            q3j.A00.setText(confirmationProductUpsellSectionHeaderItem.A00);
        }
    }
}
