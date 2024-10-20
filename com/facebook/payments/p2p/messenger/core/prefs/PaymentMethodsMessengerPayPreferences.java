package com.facebook.payments.p2p.messenger.core.prefs;

import X.0FI;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.1EK;
import X.1Lo;
import X.1Mc;
import X.1P9;
import X.1PA;
import X.1VX;
import X.1iF;
import X.2FP;
import X.2FT;
import X.2JX;
import X.2Jf;
import X.4DQ;
import X.4YU;
import X.6gK;
import X.7zL;
import X.7zM;
import X.7zO;
import X.82O;
import X.AbE;
import X.AbH;
import X.AbL;
import X.AbstractC05414dq;
import X.C00i;
import X.C3sa;
import X.C3sb;
import X.DKD;
import X.DZJ;
import X.EMf;
import X.EsF;
import X.EsG;
import X.Ew2;
import X.F9R;
import X.FWb;
import X.FWg;
import X.FWh;
import X.Fch;
import X.Frp;
import X.FvT;
import X.GKP;
import X.Q0E;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.payments.p2p.model.PartialPaymentCard;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodWithBalance;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: PaymentMethodsMessengerPayPreferences.class */
public final class PaymentMethodsMessengerPayPreferences extends DZJ implements GKP {
    public PreferenceCategory A00;
    public FbUserSession A01;
    public 1PA A02;
    public 1Mc A03;
    public 82O A04;
    public 6gK A05;
    public EsF A06;
    public F9R A07;
    public ImmutableList A08;
    public ImmutableList A09;
    public ImmutableList A0A;
    public ImmutableList A0B;
    public ImmutableList A0C;
    public final Fch A0H = DKD.A0b();
    public final C00i A0G = AbH.A0P();
    public final C00i A0E = 1BQ.A01();
    public final C00i A0F = DKD.A0U();
    public boolean A0D = true;

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() {
        ImmutableList immutableList;
        PreferenceCategory preferenceCategory = this.A00;
        if (preferenceCategory != null) {
            preferenceCategory.removeAll();
            ImmutableList immutableList2 = this.A0A;
            if (immutableList2 != null) {
                1Du it = immutableList2.iterator();
                while (it.hasNext()) {
                    this.A00.addPreference(new Q0E(getContext(), (PaymentMethod) it.next()));
                }
            }
            if (this.A09 != null && (immutableList = this.A0B) != null) {
                1Du it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    PaymentCard paymentCard = (PaymentCard) it2.next();
                    Preference q0e = new Q0E(getContext(), paymentCard);
                    boolean z = true;
                    if (this.A0C.size() == 1) {
                        EMf eMf = EMf.A02;
                        if (paymentCard instanceof PartialPaymentCard) {
                            throw new IllegalAccessError("Cannot access category for locally constructed PaymentCard");
                        }
                        if (eMf.equals(paymentCard.A03)) {
                            q0e.setOnPreferenceClickListener(new FWb(this, paymentCard, z));
                            this.A00.addPreference(q0e);
                        }
                    }
                    z = false;
                    q0e.setOnPreferenceClickListener(new FWb(this, paymentCard, z));
                    this.A00.addPreference(q0e);
                }
            }
            ImmutableList immutableList3 = this.A08;
            if (immutableList3 != null) {
                1Du it3 = immutableList3.iterator();
                while (it3.hasNext()) {
                    PayPalBillingAgreement payPalBillingAgreement = (PayPalBillingAgreement) it3.next();
                    Preference q0e2 = new Q0E(getContext(), payPalBillingAgreement);
                    FWg.A00(q0e2, payPalBillingAgreement, this, 1);
                    this.A00.addPreference(q0e2);
                }
            }
            if (this.A0D) {
                Preference.OnPreferenceClickListener fWh = new FWh(this, 6);
                Context context = getContext();
                if (context != null) {
                    this.A0F.get();
                    Preference preference = new Preference(context);
                    preference.setLayoutResource(2132543048);
                    preference.setTitle(2131965770);
                    preference.setOnPreferenceClickListener(fWh);
                    this.A00.addPreference(preference);
                }
            }
        }
    }

    public 1iF A1R() {
        return AbL.A0A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = 1BL.A0G(this);
        this.A04 = (82O) 1Bn.A0A(65587);
        this.A07 = (F9R) 7zO.A0l(this, 99164);
        this.A03 = (1Mc) 7zO.A0m(this, 65732);
        this.A05 = (6gK) 1Lo.A04(getContext(), this.A01, (1BY) null, 50126);
        PreferenceCategory A0K = DZJ.A0K(this);
        this.A00 = A0K;
        A0K.setLayoutResource(2132543139);
        this.A00.setTitle(2131965790);
        this.A02 = 1P9.A01(new 1P9(this.A03), new Frp(this, 8), AbE.A00(449));
    }

    public Preference B49() {
        return this.A00;
    }

    public boolean BV0() {
        return true;
    }

    public ListenableFuture BYO() {
        Fch fch = this.A0H;
        FbUserSession fbUserSession = this.A01;
        fbUserSession.getClass();
        ImmutableList of = ImmutableList.of((Object) "PAYPAL_BA", (Object) "DEBIT_CARD", (Object) "CREDIT_CARD", (Object) "STORED_VALUE_ACCOUNT");
        if (4DQ.A03(fch.A00)) {
            return fch.A00;
        }
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A03("should_include_paypal", true);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "P2pPaymentMethodQuery", (String) null, "fbandroid", 1853804120, 0, 915102274L, 915102274L, false, true));
        ((C3sb) A0L).A03 = 0L;
        AbstractC05414dq A09 = 1VX.A09(1BK.A04(fch.A0C), fbUserSession);
        A0L.A05 = new 1iF(1EK.A01(), 0L);
        2FT A01 = 2FP.A01(new FvT(fch, of, 3), A09.A03(A0L));
        fch.A00 = A01;
        return A01;
    }

    public /* bridge */ /* synthetic */ void C4E(Object obj) {
        ImmutableCollection immutableCollection = (ImmutableCollection) obj;
        if (immutableCollection == null) {
            immutableCollection = ImmutableList.of();
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList.Builder A0h2 = 4YU.A0h();
        ImmutableList.Builder A0h3 = 4YU.A0h();
        1Du it = immutableCollection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof PaymentCard) {
                A0h.m11011add(next);
            }
            if (next instanceof PayPalBillingAgreement) {
                A0h2.m11011add(next);
            }
            if (next instanceof PaymentMethodWithBalance) {
                A0h3.m11011add(next);
            }
        }
        this.A0A = A0h3.build();
        this.A09 = A0h.build();
        this.A08 = A0h2.build();
        ImmutableList immutableList = this.A09;
        this.A0B = immutableList;
        ImmutableList.Builder A0h4 = 4YU.A0h();
        1Du it2 = immutableList.iterator();
        while (it2.hasNext()) {
            PaymentCard paymentCard = (PaymentCard) it2.next();
            if (paymentCard instanceof PartialPaymentCard) {
                throw new IllegalAccessError("Cannot access category for locally constructed PaymentCard");
            }
            if (paymentCard.A03.equals(EMf.A02)) {
                A0h4.m11011add((Object) paymentCard);
            }
        }
        this.A0C = A0h4.build();
        A03();
    }

    public void CBA(Ew2 ew2) {
        this.A0D = ew2.A00;
        A03();
    }

    public void Cqi(EsF esF) {
        this.A06 = esF;
    }

    public void CsV(EsG esG) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 6) {
            if (i2 == -1) {
                PaymentsPreferenceActivity.A01(this.A06.A00);
            }
        } else {
            if (i != 1000 && i != 1001) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            F9R f9r = this.A07;
            FbUserSession fbUserSession = this.A01;
            fbUserSession.getClass();
            f9r.A01(intent, fbUserSession, i, i2);
        }
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-754651936);
        super.onDestroy();
        F9R f9r = this.A07;
        ListenableFuture listenableFuture = f9r.A03;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            f9r.A03 = null;
        }
        ListenableFuture listenableFuture2 = f9r.A04;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(true);
            f9r.A04 = null;
        }
        ListenableFuture listenableFuture3 = f9r.A02;
        if (listenableFuture3 != null) {
            listenableFuture3.cancel(true);
            f9r.A02 = null;
        }
        f9r.A00 = null;
        this.A02.A01();
        0FI.A08(1731942219, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-723177449);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02.A00();
        0FI.A08(-613066432, A02);
    }
}
