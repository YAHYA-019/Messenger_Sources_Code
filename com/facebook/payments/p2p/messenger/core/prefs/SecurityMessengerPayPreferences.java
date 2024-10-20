package com.facebook.payments.p2p.messenger.core.prefs;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1Mc;
import X.1P9;
import X.1PA;
import X.1iF;
import X.7zO;
import X.AbF;
import X.AbL;
import X.C00i;
import X.C3o5;
import X.DKD;
import X.DKF;
import X.DZJ;
import X.Eir;
import X.EsF;
import X.EsG;
import X.Ew2;
import X.Ex8;
import X.F5s;
import X.FI2;
import X.FWg;
import X.Fca;
import X.Frp;
import X.GKP;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.facebook.fbpay.platforms.messenger.config.FBPayMessengerConfig;
import com.facebook.payments.auth.pin.model.PaymentPin;
import com.facebook.payments.auth.settings.PaymentPinSettingsActivity;
import com.facebook.payments.auth.settings.PaymentPinSettingsParams;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowName;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: SecurityMessengerPayPreferences.class */
public final class SecurityMessengerPayPreferences extends DZJ implements GKP {
    public PreferenceCategory A00;
    public 1PA A01;
    public 1Mc A02;
    public Eir A03;
    public EsF A04;
    public FI2 A06;
    public PaymentsLoggingSessionData A07;
    public final C00i A09 = AbF.A0S(this, 99351);
    public final Fca A0A = (Fca) 1Bi.A03(99165);
    public final C00i A08 = 1BQ.A02(99120);
    public boolean A05 = false;

    public 1iF A1R() {
        return AbL.A0A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = (Eir) 1Bn.A0A(99189);
        this.A06 = DKD.A0X();
        this.A02 = (1Mc) 7zO.A0m(this, 65732);
        ((FBPayMessengerConfig) this.A08.get()).A00();
        this.A05 = ((Ex8) this.A09.get()).A01();
        this.A07 = bundle == null ? F5s.A00(PaymentsFlowName.PAYMENT_SETTINGS) : (PaymentsLoggingSessionData) bundle.getParcelable("payments_logging_session_datra");
        PreferenceCategory A0K = DZJ.A0K(this);
        this.A00 = A0K;
        A0K.setLayoutResource(2132543137);
        this.A00.setTitle(2131965806);
        this.A01 = 1P9.A01(new 1P9(this.A02), new Frp(this, 11), "com.facebook.payments.auth.ACTION_PIN_UPDATED");
    }

    public Preference B49() {
        return this.A00;
    }

    public boolean BV0() {
        return true;
    }

    public ListenableFuture BYO() {
        return this.A0A.A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void C4E(Object obj) {
        Intent A0D;
        PaymentPin paymentPin = (PaymentPin) obj;
        if (paymentPin == null) {
            paymentPin = PaymentPin.A00;
        }
        this.A00.removeAll();
        Preference A0J = DZJ.A0J(this);
        int i = 2131963100;
        if (this.A05) {
            i = 2131963101;
        }
        A0J.setTitle(i);
        this.A00.addPreference(A0J);
        Eir eir = this.A03;
        Context context = getContext();
        if (DKD.A1W(paymentPin) || eir.A00.A04()) {
            PaymentPinSettingsParams paymentPinSettingsParams = new PaymentPinSettingsParams(null, PaymentsDecoratorParams.A03(), DKD.A1W(paymentPin));
            context.getClass();
            A0D = C3o5.A0D(context, PaymentPinSettingsActivity.class);
            A0D.putExtra("payment_pin_settings_params", paymentPinSettingsParams);
        } else {
            A0D = DKF.A07(context);
        }
        FWg.A00(A0J, A0D, this, 3);
        A0J.setSummary(2131956889);
    }

    public void CBA(Ew2 ew2) {
    }

    public void Cqi(EsF esF) {
        this.A04 = esF;
    }

    public void CsV(EsG esG) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 4) {
            super.onActivityResult(i, i2, intent);
        } else {
            PaymentsPreferenceActivity.A01(this.A04.A00);
        }
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1973619740);
        super.onDestroy();
        this.A01.A01();
        0FI.A08(-1337548374, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-773772501);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A01.A00();
        0FI.A08(-1638203247, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("payments_logging_session_datra", this.A07);
    }
}
