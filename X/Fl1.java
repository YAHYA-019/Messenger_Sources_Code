package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: Fl1.class */
public final class Fl1 implements GJp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fl1(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(Fl1 fl1) {
        FGz fGz = (FGz) fl1.A01;
        LiveData liveData = fGz.A01;
        if (liveData != null) {
            LifecycleOwner lifecycleOwner = fGz.A00;
            lifecycleOwner.getClass();
            liveData.removeObservers(lifecycleOwner);
        }
    }

    @Override // X.GJp
    public void C9a() {
        switch (this.A00) {
            case 0:
                A00(this);
                ((GJp) this.A02).C9a();
                return;
            case 1:
                DZK dzk = (DZK) this.A01;
                DZK.A0E(dzk, true);
                DZK.A0B(dzk);
                DZK.A09(dzk);
                return;
            default:
                DZK.A0B((DZK) this.A01);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GJp
    public void C9b(String str) {
        EtC etC;
        String string;
        String A0v;
        switch (this.A00) {
            case 0:
                A00(this);
                ((GJp) this.A02).C9b(str);
                return;
            case 1:
                DZK dzk = (DZK) this.A01;
                DKG.A0d(dzk).A07(PaymentsFlowStep.A0U, dzk.A09, PaymentItemType.A0W, "confirm_fingerprint_creation_page");
                ((F8y) dzk.A0X.get()).A00((FbUserSession) this.A02, true);
                DZK.A0B(dzk);
                DZK.A0E(dzk, true);
                etC = (EtC) dzk.A0W.get();
                C00i c00i = dzk.A0T;
                string = 1BK.A04(((F5U) c00i.get()).A02).getString(2131956873);
                F5U f5u = (F5U) c00i.get();
                A0v = 1BK.A0v(1BK.A04(f5u.A02), ((Eip) f5u.A01.get()).A00.getResources().getString(0S2.A01.intValue() != 0 ? 2131956881 : 2131956878), 2131956872);
                etC.A00(string, A0v);
                return;
            default:
                DZK dzk2 = (DZK) this.A01;
                DKG.A0d(dzk2).A07(PaymentsFlowStep.A0d, dzk2.A09, PaymentItemType.A0W, "confirm_fingerprint_disable_page");
                DKC.A0Z(dzk2.A0c).A0A(str);
                DZK.A09(dzk2);
                ((F8y) dzk2.A0X.get()).A00((FbUserSession) this.A02, false);
                DZK.A0B(dzk2);
                dzk2.A1X();
                etC = (EtC) dzk2.A0W.get();
                string = dzk2.getString(2131956875);
                A0v = dzk2.getString(2131956874);
                etC.A00(string, A0v);
                return;
        }
    }

    @Override // X.GJp
    public void CZX() {
        switch (this.A00) {
            case 0:
                A00(this);
                ((GJp) this.A02).CZX();
                return;
            case 1:
                return;
            default:
                DZK dzk = (DZK) this.A01;
                if (DZK.A0F(dzk)) {
                    DZK.A07(EO0.A07, dzk, 1006);
                    return;
                } else {
                    DZK.A08(EO0.A08, dzk, "VERIFY_PIN_TO_DISABLE_BIO_HUB", 1006);
                    return;
                }
        }
    }

    @Override // X.GJp
    public void onCancel() {
        switch (this.A00) {
            case 0:
                A00(this);
                ((GJp) this.A02).onCancel();
                return;
            case 1:
                DZK dzk = (DZK) this.A01;
                DZK.A0E(dzk, true);
                DZK.A0B(dzk);
                DZK.A09(dzk);
                return;
            default:
                DZK.A0B((DZK) this.A01);
                return;
        }
    }
}
