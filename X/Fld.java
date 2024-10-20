package X;

import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.configuration.model.CheckoutContentConfiguration;
import com.facebook.payments.checkout.configuration.model.CheckoutEntity;
import com.facebook.payments.checkout.configuration.model.CheckoutPayActionContent;
import com.google.common.collect.ImmutableList;

/* loaded from: Fld.class */
public final class Fld implements GKs {
    public final Er4 A00;
    public final Flf A01;

    public Fld() {
        Flf flf = (Flf) 1Bn.A0B(99051);
        this.A00 = DKG.A0e();
        this.A01 = flf;
    }

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        CheckoutContentConfiguration CWh = this.A01.CWh(r302, str);
        CheckoutEntity checkoutEntity = CWh.A01;
        ImmutableList immutableList = CWh.A04;
        ImmutableList immutableList2 = CWh.A03;
        ImmutableList immutableList3 = CWh.A05;
        CheckoutPayActionContent checkoutPayActionContent = CWh.A02;
        CheckoutConfigPrice checkoutConfigPrice = CWh.A00;
        String A00 = 1BJ.A00(91);
        if (r302.A0Z(A00)) {
            checkoutEntity = (CheckoutEntity) GKs.A00(this.A00.A0M, r302, A00, str);
        }
        if (r302.A0Z("price_total")) {
            checkoutConfigPrice = (CheckoutConfigPrice) GKs.A00(this.A00.A01, r302, "price_total", str);
        }
        return new CheckoutContentConfiguration(checkoutConfigPrice, checkoutEntity, checkoutPayActionContent, immutableList2, immutableList, immutableList3);
    }
}
