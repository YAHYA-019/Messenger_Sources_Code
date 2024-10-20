package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.CheckoutContentConfiguration;
import com.facebook.payments.checkout.configuration.model.CheckoutPayActionContent;
import com.google.common.collect.ImmutableList;

/* loaded from: Flf.class */
public final class Flf implements GKs {
    public final Er4 A00 = DKG.A0e();

    @Override // X.GKs
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public CheckoutContentConfiguration CWh(24X r302, String str) {
        CheckoutPayActionContent checkoutPayActionContent = null;
        Er4 er4 = this.A00;
        ImmutableList immutableList = (ImmutableList) DKF.A0W(er4.A06).CWh(JSONUtil.A07(r302, "items"), str);
        ImmutableList immutableList2 = (ImmutableList) DKF.A0W(er4.A02).CWh(JSONUtil.A07(r302, "price_list"), str);
        ImmutableList immutableList3 = (ImmutableList) DKF.A0W(!str.equals("1.1") ? !str.equals("1.1.1") ? er4.A0N : er4.A0H : er4.A0C).CWh(JSONUtil.A07(r302, "purchase_info"), str);
        if (r302.A0Z("pay_action_content")) {
            checkoutPayActionContent = (CheckoutPayActionContent) GKs.A00(er4.A0A, r302, "pay_action_content", str);
        }
        return new CheckoutContentConfiguration(null, null, checkoutPayActionContent, immutableList2, immutableList, immutableList3);
    }
}
