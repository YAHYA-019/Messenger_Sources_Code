package X;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Switch;
import com.facebook.inject.FbInjector;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.simplescreen.model.EditPayPalScreenExtraData;
import com.facebook.payments.simplescreen.model.SimpleScreenExtraData;
import com.facebook.payments.ui.HubFormButtonView;
import com.facebook.widget.titlebar.TitleBarButtonSpec;

/* loaded from: Foe.class */
public final class Foe implements GKO {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public Button A03;
    public ProgressBar A04;
    public Switch A05;
    public 1BY A06;
    public PaymentsLoggingSessionData A07;
    public PaymentItemType A08;
    public PayPalBillingAgreement A09;
    public HubFormButtonView A0A;
    public ETu A0B;
    public final C00i A0C = FbInjector.A00;
    public final C00i A0H = 1BV.A01((1BY) null, 49829);
    public final C00i A0G = 1BQ.A02(99089);
    public final C00i A0E = 1BQ.A02(99003);
    public final C00i A0F = 1BQ.A02(67477);
    public final C00i A0I = AbH.A0F();
    public final C00i A0D = 1BV.A01((1BY) null, 98432);

    public Foe(1BO r302) {
        this.A06 = 7zL.A0Q(r302);
    }

    public void AE4() {
        DKG.A1N(this.A0H);
    }

    public String BG6() {
        return 1BL.A0B(this.A0C).getString(2131967469);
    }

    public TitleBarButtonSpec BGA() {
        if (this.A01.getVisibility() != 0 || !this.A05.isEnabled()) {
            return null;
        }
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A09 = true;
        f6h.A08 = 1BK.A04(this.A0C).getString(2131953847);
        return new TitleBarButtonSpec(f6h);
    }

    public /* bridge */ /* synthetic */ void BOd(ViewStub viewStub, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, SimpleScreenExtraData simpleScreenExtraData) {
        EditPayPalScreenExtraData editPayPalScreenExtraData = (EditPayPalScreenExtraData) simpleScreenExtraData;
        View A0C = DKF.A0C(viewStub, 2132543529);
        PayPalBillingAgreement A00 = editPayPalScreenExtraData.A00();
        this.A09 = A00;
        this.A04 = (ProgressBar) C09s.A01(A0C, 2131366701);
        this.A00 = C09s.A01(A0C, 2131363330);
        this.A0A = C09s.A01(A0C, 2131366894);
        C09s.A01(A0C, 2131366390).A01(this.A09);
        this.A07 = paymentsLoggingSessionData;
        this.A08 = paymentItemType;
        this.A0A.A00.setText(2131967475);
        FXt.A01(this.A0A, FK6.A00(this, 84), this, new FJv(6, this.A09, this, 1Fw.A05(this.A06)), 35);
        this.A02 = (ViewGroup) A0C.requireViewById(2131366351);
        this.A03 = (Button) A0C.requireViewById(2131366388);
        ((EtK) 1Bi.A03(98517)).A00(this.A02, 2131958823, this.A09.A05);
        int i = 0;
        this.A03.setVisibility(DKG.A00(A00.A05 ? 1 : 0));
        FXq.A01(this.A03, this, 100);
        this.A03.setText(2131958832);
        this.A01 = A0C.requireViewById(2131365423);
        this.A05 = (Switch) A0C.requireViewById(2131365426);
        View view = this.A01;
        if (!editPayPalScreenExtraData.A00) {
            i = 8;
        }
        view.setVisibility(i);
        this.A05.setChecked(this.A09.A04);
        this.A05.setEnabled(!this.A09.A04);
    }

    public void CQj() {
        if (this.A05.isChecked()) {
            1G1 A05 = 1Fw.A05(this.A06);
            1IB A09 = DKI.A09((Fch) this.A0F.get(), this.A09.id, A05.A02);
            1Kd.A0D(this.A0I, new DeI(this, 6), A09);
        }
        ETu eTu = this.A0B;
        if (eTu != null) {
            FHd.A03(eTu);
        }
    }

    public void CsR(ETu eTu) {
        this.A0B = eTu;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ETu eTu;
        if (i == 2000 && i2 == -1 && (eTu = this.A0B) != null) {
            FHd.A03(eTu);
        }
    }
}
