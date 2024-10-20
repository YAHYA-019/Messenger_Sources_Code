package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.widget.banner.FBPayBanner;
import java.util.List;

/* loaded from: Jwq.class */
public final class Jwq extends AbstractC3052Jhk {
    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        List list = C2lb.A0J;
        View A00 = C06014fk.A0A().A00(4YU.A08(viewGroup), viewGroup, KP0.A0a);
        11T.A0I(A00, "null cannot be cast to non-null type com.facebookpay.widget.banner.FBPayBanner");
        return new Q33(this, (FBPayBanner) A00);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        Object obj;
        MPZ mpz;
        Q33 q33 = (Q33) c2lb;
        11T.A0F(fjc, 0);
        11T.A0F(q33, 1);
        if (!FJC.A0C(fjc) || (obj = fjc.A01) == null) {
            return;
        }
        PuxBannerItem puxBannerItem = (PuxBannerItem) obj;
        Integer num = puxBannerItem.A03;
        if ((num == null ? -1 : num.intValue()) != 4 || (mpz = puxBannerItem.A00) == null || mpz.BEp() == null) {
            q33.A00.setVisibility(8);
        } else {
            C06014fk.A04().A03(4YU.A08(q33.A00), 54, 46);
            throw 0Q8.createAndThrow();
        }
    }
}
