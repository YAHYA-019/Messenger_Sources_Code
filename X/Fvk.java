package X;

import android.os.Bundle;
import com.facebook.payments.auth.pin.model.DeletePaymentPinParams;
import com.google.common.base.Supplier;

/* loaded from: Fvk.class */
public final class Fvk implements Supplier {
    public final /* synthetic */ long A00;
    public final /* synthetic */ F9H A01;
    public final /* synthetic */ String A02;

    public Fvk(F9H f9h, String str, long j) {
        this.A01 = f9h;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        Fca fca = this.A01.A06;
        long j = this.A00;
        String str = this.A02;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("deletePaymentPinParams", new DeletePaymentPinParams(j, str));
        return Fca.A00(A05, fca, "delete_payment_pin");
    }
}
