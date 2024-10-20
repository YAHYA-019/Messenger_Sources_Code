package X;

import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.widget.titlebar.TitleBarButtonSpec;

/* loaded from: Eot.class */
public final class Eot {
    public Ef0 A00;
    public PaymentsDecoratorParams A01;
    public PaymentsTitleBarViewStub A02;
    public GL6 A03;
    public final F6h A04;

    public Eot() {
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A09 = false;
        this.A04 = f6h;
    }
}
