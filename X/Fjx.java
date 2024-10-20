package X;

import com.facebook.messaging.neue.nux.phoneconfirmation.ConfirmPhoneFragment;

/* loaded from: Fjx.class */
public final class Fjx implements GF9 {
    public final int A00;
    public final Object A01;

    public Fjx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GF9
    public void BpZ(String str) {
        if (this.A00 != 0) {
            ConfirmPhoneFragment.A06((ConfirmPhoneFragment) this.A01, str);
            return;
        }
        DZl dZl = (DZl) this.A01;
        dZl.A06.A02();
        if (str.length() == 6) {
            dZl.A06.A03(str);
        }
    }
}
