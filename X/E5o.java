package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.payments.p2p.phases.PaymentPhaseActivity;

/* loaded from: E5o.class */
public final class E5o extends FmS {
    public final int A00;
    public final Object A01;

    public E5o(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                ((QQp) this.A01).A00.AGC(0, (String) null);
                return;
            case 1:
                ((Eek) this.A01).A00.AGC(0, (String) null);
                return;
            case 2:
                Activity A1P = ((1pK) this.A01).A1P();
                if (A1P != null) {
                    A1P.setResult(0);
                    A1P.finish();
                    return;
                }
                return;
            case 3:
                ((EfK) this.A01).A00.A03.onCancel();
                return;
            default:
                ((PaymentPhaseActivity) this.A01).finish();
                return;
        }
    }
}
