package X;

import android.content.Context;
import com.facebook.payments.shipping.model.ShippingStyle;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: EtJ.class */
public final class EtJ {
    public final C00i A00;
    public final ImmutableMap A01;

    public EtJ(Context context) {
        this.A00 = 7zL.A0R(context, 99215);
        Set<Eov> set = (Set) 1Bn.A0E(context, (1BY) null, 228);
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (Eov eov : set) {
            A0c.put(eov.A04, eov);
        }
        this.A01 = A0c.build();
    }

    public FEe A00(ShippingStyle shippingStyle) {
        ImmutableMap immutableMap = this.A01;
        if (!immutableMap.containsKey(shippingStyle)) {
            shippingStyle = ShippingStyle.SIMPLE;
        }
        return (FEe) ((Eov) immutableMap.get(shippingStyle)).A00.get();
    }
}
