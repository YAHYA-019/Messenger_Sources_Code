package X;

import com.facebook.payments.checkout.configuration.model.CheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.SimpleCheckoutPurchaseInfoExtension;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Flg.class */
public final class Flg implements GKs {
    public final Er4 A00 = DKG.A0e();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public CheckoutPurchaseInfoExtension A00(Quq quq, 24X r303, String str) {
        C00i c00i;
        SimpleCheckoutPurchaseInfoExtension simpleCheckoutPurchaseInfoExtension;
        switch (quq.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 11:
            case 14:
                simpleCheckoutPurchaseInfoExtension = new SimpleCheckoutPurchaseInfoExtension(quq);
                return (CheckoutPurchaseInfoExtension) simpleCheckoutPurchaseInfoExtension;
            case 9:
                Er4 er4 = this.A00;
                c00i = !str.equals("1.1") ? er4.A0G : er4.A09;
                simpleCheckoutPurchaseInfoExtension = (CheckoutPurchaseInfoExtension) DKF.A0W(c00i).CWh(r303, str);
                return (CheckoutPurchaseInfoExtension) simpleCheckoutPurchaseInfoExtension;
            case 10:
                c00i = this.A00.A0E;
                simpleCheckoutPurchaseInfoExtension = (CheckoutPurchaseInfoExtension) DKF.A0W(c00i).CWh(r303, str);
                return (CheckoutPurchaseInfoExtension) simpleCheckoutPurchaseInfoExtension;
            default:
                throw AnonymousClass002.A0C(quq, "Cannot handle identifier ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = r302.iterator();
        while (it.hasNext()) {
            24X A0j = DKC.A0j(it);
            DKF.A1T(A0j, "identifier");
            A0h.m11011add((Object) A00(Quq.A00(AbK.A18(A0j, "identifier")), A0j, str));
        }
        return A0h.build();
    }
}
