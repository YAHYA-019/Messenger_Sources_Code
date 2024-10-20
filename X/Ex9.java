package X;

import android.content.Context;
import com.facebook.payments.checkout.model.CheckoutData;
import java.util.List;

/* loaded from: Ex9.class */
public final class Ex9 {
    public CheckoutData A00;
    public final FFx A02;
    public final Object A04 = AnonymousClass001.A0R();
    public final List A03 = AnonymousClass001.A0s();
    public final RGc A01 = new RGc(this);

    public Ex9(Context context) {
        this.A02 = (FFx) 1Hv.A02(context, 99010);
    }

    public void A00(GFP gfp) {
        synchronized (this.A04) {
            List list = this.A03;
            if (!list.contains(gfp)) {
                list.add(gfp);
            }
        }
    }

    public void A01(GFP gfp) {
        synchronized (this.A04) {
            this.A03.remove(gfp);
        }
    }
}
