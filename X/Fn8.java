package X;

import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.p2p.form.PaymentSectionsParams;
import com.google.common.collect.ImmutableList;

/* loaded from: Fn8.class */
public final class Fn8 implements GFl {
    public final C00i A00 = 1BV.A00(98902);
    public final C00i A01 = 1BQ.A01();

    @Override // X.GFl
    public 1pK AnO(FbFragmentActivity fbFragmentActivity, 2JX r303) {
        String A2R = r303.A2R();
        if (A2R == null) {
            1BK.A09(this.A01).D0v("PhaseStepFragmentFactory", "Step type is missing for payment phase");
            return null;
        }
        if (!A2R.equals("FORM")) {
            return ((Fn9) this.A00.get()).AnO(fbFragmentActivity, r303);
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du A0v = AbI.A0v(r303, 2JX.class, 947936814, -1321551970);
        while (A0v.hasNext()) {
            A0h.m11011add((Object) 2JX.A08(AbG.A0D(A0v)));
        }
        ImmutableList.of();
        ImmutableList build = A0h.build();
        C1pq.A08("sections", build);
        PaymentSectionsParams paymentSectionsParams = new PaymentSectionsParams(build);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("payment_sections_params_key", paymentSectionsParams);
        1pK r0 = new 1pK();
        r0.setArguments(A05);
        return r0;
    }
}
