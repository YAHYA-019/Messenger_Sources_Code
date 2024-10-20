package X;

import android.os.Parcelable;
import com.facebook.inject.FbInjector;
import com.facebook.payments.shipping.model.ShippingParams;
import com.facebook.payments.shipping.model.ShippingStyle;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.widget.titlebar.TitleBarButtonSpec;

/* loaded from: F6L.class */
public final class F6L {
    public EfZ A00;
    public ShippingParams A01;
    public PaymentsTitleBarViewStub A02;
    public GL6 A03;
    public final F6h A04;
    public final C00i A05 = FbInjector.A00;

    public F6L() {
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A09 = false;
        this.A04 = f6h;
    }

    public static void A00(F6L f6l) {
        if (f6l.A01.shippingStyle != ShippingStyle.SIMPLE_V2) {
            F6h f6h = f6l.A04;
            f6h.A08 = 1BL.A0B(f6l.A05).getString(2131965920);
            GL6.A01(f6l.A03, f6h);
            ErO.A00(f6l.A03, f6l, 7);
        }
    }
}
