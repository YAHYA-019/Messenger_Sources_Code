package X;

import com.facebook.payments.cart.model.PaymentsCartParams;
import java.util.List;

/* loaded from: Fl9.class */
public final class Fl9 implements GK1 {
    public final List A00 = AnonymousClass001.A0s();

    @Override // X.GK1
    public void A5W(GK0 gk0) {
        this.A00.add(gk0);
    }

    @Override // X.GK1
    public void ASI(PaymentsCartParams paymentsCartParams, String str) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.GK1
    public boolean BMq() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.GK1
    public void CeA(GK0 gk0) {
        this.A00.remove(gk0);
    }

    @Override // X.GK1
    public void D1U(PaymentsCartParams paymentsCartParams) {
        throw AnonymousClass001.A0p();
    }
}
