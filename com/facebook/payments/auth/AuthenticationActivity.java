package com.facebook.payments.auth;

import X.0LS;
import X.0fH;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.1Lo;
import X.1iF;
import X.7zL;
import X.AbF;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C06014fk;
import X.DKD;
import X.DKF;
import X.DKG;
import X.E4y;
import X.ELo;
import X.EO0;
import X.ETA;
import X.EX8;
import X.Ek0;
import X.EtE;
import X.EwQ;
import X.Ex8;
import X.F5g;
import X.F8y;
import X.F95;
import X.F9H;
import X.FAC;
import X.FGK;
import X.FHO;
import X.FI2;
import X.FII;
import X.FJC;
import X.FZB;
import X.Fkz;
import X.Fvi;
import X.GJp;
import X.R2f;
import X.Rh9;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.auth.pin.newpinv2.PaymentPinV2Activity;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AuthenticationActivity.class */
public class AuthenticationActivity extends FbFragmentActivity {
    public ETA A00;
    public FbUserSession A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public FHO A05;
    public AuthenticationParams A06;
    public Ex8 A07;
    public F8y A08;
    public F95 A09;
    public F9H A0A;
    public FI2 A0B;
    public C00i A0D;
    public C00i A0E;
    public FII A0F;
    public final EX8 A0J = (EX8) 1Bi.A03(99003);
    public final EwQ A0G = (EwQ) 1Bi.A03(99155);
    public boolean A0C = false;
    public final AtomicBoolean A0I = new AtomicBoolean();
    public final GJp A0H = new Fkz(this, 0);

    public static void A12(AuthenticationActivity authenticationActivity) {
        if (!authenticationActivity.A0I.getAndSet(false)) {
            0fH.A0k("AuthenticationActivity", "authentication not in progress when finishing authentication!");
        }
        authenticationActivity.finish();
    }

    public static void A15(AuthenticationActivity authenticationActivity, String str) {
        authenticationActivity.A0G.A01(authenticationActivity.A0B.A0A(str) ? new EtE(ELo.A01, str) : new EtE(ELo.A02, str));
        A12(authenticationActivity);
    }

    public static void A16(AuthenticationActivity authenticationActivity, String str) {
        Bundle bundle;
        List singletonList = Collections.singletonList("CHARGE");
        PaymentItemType paymentItemType = authenticationActivity.A06.A04;
        paymentItemType.getClass();
        String str2 = paymentItemType.mValue;
        PaymentsLoggingSessionData paymentsLoggingSessionData = authenticationActivity.A06.A03;
        paymentsLoggingSessionData.getClass();
        Ek0 A03 = FGK.A03(str, str2, paymentsLoggingSessionData.sessionId, singletonList);
        FAC A0B = C06014fk.A0B();
        Rh9 rh9 = new Rh9(Rh9.A08, (Fragment) null, authenticationActivity, A0B, A0B.A06);
        Bundle bundle2 = authenticationActivity.A06.A00;
        HashMap A0u = AnonymousClass001.A0u();
        if (bundle2 != null && (bundle = bundle2.getBundle("FBPAT_PTT_DATA_BUNDLE")) != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                A0u.put(A0i, bundle.get(A0i));
            }
        }
        FJC.A07(rh9.A04(A03, A0u, "CHARGE"), authenticationActivity, FZB.A00(authenticationActivity, 8));
    }

    public static void A1D(AuthenticationActivity authenticationActivity, String str) {
        EO0 eo0 = EO0.A08;
        PaymentsDecoratorParams.A02();
        String A00 = R2f.A00(authenticationActivity.getResources(), authenticationActivity.A0B);
        PaymentsDecoratorParams paymentsDecoratorParams = new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, PaymentsTitleBarStyle.A05, null, null, null, null, false);
        AuthenticationParams authenticationParams = authenticationActivity.A06;
        0LS.A07(authenticationActivity, PaymentPinV2Activity.A12(authenticationActivity, new PaymentPinParams(null, authenticationParams.A00, null, null, null, eo0, null, paymentsDecoratorParams, authenticationParams.A03, authenticationParams.A04, str, "PIN", A00, null, -1.0f, false, true)), 5001);
    }

    public static void A1F(AuthenticationActivity authenticationActivity, String str, int i) {
        float dimension = authenticationActivity.getResources().getDimension(2132279515);
        EO0 eo0 = EO0.A08;
        PaymentsDecoratorParams.A02();
        String A00 = R2f.A00(authenticationActivity.getResources(), authenticationActivity.A0B);
        PaymentsDecoratorParams paymentsDecoratorParams = new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, PaymentsTitleBarStyle.A05, null, null, null, null, false);
        AuthenticationParams authenticationParams = authenticationActivity.A06;
        0LS.A07(authenticationActivity, PaymentPinV2Activity.A12(authenticationActivity, new PaymentPinParams(null, authenticationParams.A00, null, null, null, eo0, null, paymentsDecoratorParams, authenticationParams.A03, authenticationParams.A04, "VERIFY_PIN_TO_PAY", "PIN", A00, str, dimension, false, true)), i);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return DKG.A0G();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        DKF.A0h(this.A0E).A06("FETCH_PIN_API_REQUEST");
        this.A0A.A01();
        super.A2l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010e, code lost:
    
        if (((X.F80) r301.A02.get()).A01() != false) goto L21;
     */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Object, X.F49] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.auth.AuthenticationActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        this.A07 = (Ex8) 1Bn.A0E(this, (1BY) null, 99351);
        this.A09 = (F95) 1Bn.A0E(this, (1BY) null, 99353);
        this.A08 = (F8y) 1Bn.A0E(this, (1BY) null, 99313);
        this.A0B = DKD.A0X();
        this.A0F = DKG.A0h(this);
        this.A05 = DKG.A0c();
        this.A03 = 1BV.A00(99314);
        this.A0E = DKG.A0T();
        this.A04 = 7zL.A0R(this, 99347);
        this.A02 = 7zL.A0R(this, 99396);
        this.A0A = (F9H) 1Hv.A02(this, 99342);
        this.A0D = AbF.A0Q(this, 99252);
        this.A00 = (ETA) 1Lo.A04(this, AbL.A08(this), (1BY) null, 99311);
        AuthenticationParams authenticationParams = (AuthenticationParams) getIntent().getParcelableExtra("extra_authentication_params");
        this.A06 = authenticationParams;
        this.A0C = authenticationParams.A09;
        this.A0F.A05(this, PaymentsTitleBarStyle.A05, false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 5001 && i != 5002) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            this.A0G.A00();
        } else {
            if (intent.getStringExtra("user_fingerprint_nonce") != null) {
                A15(this, intent.getStringExtra("user_fingerprint_nonce"));
                return;
            }
            String stringExtra = intent.getStringExtra("user_entered_pin");
            stringExtra.getClass();
            if (i == 5002) {
                boolean A07 = this.A0B.A07();
                PaymentsFlowStep paymentsFlowStep = A07 ? PaymentsFlowStep.A1l : PaymentsFlowStep.A0U;
                F9H f9h = this.A0A;
                if (A07) {
                    this.A03.get();
                }
                f9h.A00 = F9H.A00(F5g.A03, new E4y(this, paymentsFlowStep, 0), f9h, new Fvi(f9h, stringExtra), f9h.A00);
            }
            EwQ ewQ = this.A0G;
            EtE etE = new EtE(ELo.A05, stringExtra);
            Preconditions.checkArgument(AnonymousClass001.A1Q(stringExtra.length(), 4));
            ewQ.A01(etE);
        }
        A12(this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0I.set(bundle.getBoolean("auth_state"));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("auth_state", this.A0I.get());
    }
}
