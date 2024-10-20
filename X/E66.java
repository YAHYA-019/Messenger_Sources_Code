package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.paypal.P2pPaypalFundingOptionsActivity;
import com.facebook.payments.p2p.paypal.P2pPaypalFundingOptionsParams;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionData;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionPaymentMethod;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodWithBalance;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.paymentmethods.picker.protocol.GetPaymentMethodsInfoParams;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.User;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: E66.class */
public final class E66 extends Ezy {
    public Context A00;
    public 1pK A01;
    public 2JX A02;
    public P2pPaymentConfig A03;
    public P2pPaymentData A04;
    public EsC A05;
    public RSI A06;
    public PaymentMethod A07;
    public ImmutableList A08;
    public ImmutableList A09;
    public ImmutableList A0A;
    public ListenableFuture A0B;
    public ListenableFuture A0C;
    public SettableFuture A0D;
    public SettableFuture A0E;
    public SettableFuture A0F;
    public 2JX A0I;
    public RQD A0J;
    public final Resources A0M;
    public final Fch A0T;
    public final Executor A0U;
    public final 6Gx A0S = DKD.A0Z();
    public final C00i A0N = 1BQ.A00();
    public final C00i A0P = 1BQ.A02(99146);
    public final C00i A0Q = 1BQ.A02(84011);
    public final C00i A0O = 1BQ.A02(99003);
    public final F57 A0R = (F57) 1Bn.A0A(98938);
    public final Ef9 A0V = new Ef9(this);
    public final DialogInterface.OnCancelListener A0L = new FJm(this, 3);
    public boolean A0G = false;
    public boolean A0K = false;
    public boolean A0H = false;

    public E66() {
        Fch A0b = DKD.A0b();
        Context A00 = FbInjector.A00();
        Executor A1D = AbJ.A1D();
        this.A0T = A0b;
        this.A0M = A00.getResources();
        this.A0U = A1D;
    }

    public static Intent A00(E66 e66, PayPalBillingAgreement payPalBillingAgreement) {
        String str = null;
        PaymentsDecoratorParams A00 = PaymentsDecoratorParams.A00();
        PaymentsDecoratorAnimation paymentsDecoratorAnimation = A00.paymentsDecoratorAnimation;
        PaymentsTitleBarStyle paymentsTitleBarStyle = A00.paymentsTitleBarStyle;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = A00.paymentsTitleBarTitleStyle;
        String str2 = A00.paymentsTitleBarButtonText;
        Optional optional = A00.A00;
        String str3 = A00.paymentsPayBarButtonText;
        if (str3 != null) {
            str = str3;
        }
        PaymentsDecoratorParams paymentsDecoratorParams = new PaymentsDecoratorParams(paymentsDecoratorAnimation, paymentsTitleBarStyle, paymentsTitleBarTitleStyle, optional, str, str2, false);
        Context context = e66.A00;
        HashSet A0v = AnonymousClass001.A0v();
        CurrencyAmount A002 = e66.A04.A00();
        C1pq.A08("currencyAmount", A002);
        String str4 = payPalBillingAgreement.id;
        C1pq.A08("paypalBaId", str4);
        P2pPaypalFundingOptionsParams p2pPaypalFundingOptionsParams = new P2pPaypalFundingOptionsParams(A002, paymentsDecoratorParams, str4, 4YV.A0z("paymentsDecoratorParams", A0v, A0v));
        Intent A0D = C3o5.A0D(context, P2pPaypalFundingOptionsActivity.class);
        A0D.putExtra("extra_paypal_funding_options_param", p2pPaypalFundingOptionsParams);
        return A0D;
    }

    public static CR2 A01(Object obj, List list, int i) {
        String A0r = ((2JY) list.get(i)).A0r(3321850);
        if (A0r == null) {
            return null;
        }
        return new CR2(A0r, obj, 5);
    }

    public static ArrayList A02(E66 e66) {
        String string;
        ArrayList A0s = AnonymousClass001.A0s();
        ImmutableList immutableList = e66.A0A;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                A0s.add(((PaymentMethod) it.next()).Ai2(e66.A0M));
            }
        }
        ImmutableList immutableList2 = e66.A08;
        if (immutableList2 != null) {
            1Du it2 = immutableList2.iterator();
            while (it2.hasNext()) {
                if (AnonymousClass001.A0i(it2).equals("DEBIT_CARD") && (string = e66.A0M.getString(2131965724)) != null) {
                    A0s.add(string);
                }
            }
        }
        return A0s;
    }

    public static void A03(FbUserSession fbUserSession, E66 e66) {
        ListenableFuture A00;
        if (e66.A09 != null) {
            if (e66.A0K) {
                A05(fbUserSession, e66, e66.A0A);
                return;
            }
            QuickPerformanceLogger quickPerformanceLogger = ((Ej6) e66.A0P.get()).A00.A00.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerPoint(319422465, 0Pz.A0W("fetch_payment_methods", "_start"));
            }
            Fch fch = e66.A0T;
            if (4DQ.A03(fch.A00)) {
                A00 = fch.A00;
            } else {
                EsI esI = (EsI) 1Lo.A06(fbUserSession, 98954);
                GetPaymentMethodsInfoParams getPaymentMethodsInfoParams = new GetPaymentMethodsInfoParams(null, PaymentItemType.A0C, ConstantsKt.CAMERA_ID_FRONT, null, null, null);
                Qmm qmm = esI.A00;
                qmm.BPu(getPaymentMethodsInfoParams);
                Object Apt = qmm.Apt(getPaymentMethodsInfoParams);
                A00 = Fvf.A00(Apt != null ? C3o5.A0J(Apt) : G72.A00(qmm.A03, getPaymentMethodsInfoParams, qmm, 7), fch, 28);
                fch.A00 = A00;
            }
            e66.A0C = A00;
            1Kd.A0F(FwJ.A00(fbUserSession, e66, 27), A00, e66.A0U);
            e66.A06.A00.A05.A08.A00();
        }
    }

    public static void A04(FbUserSession fbUserSession, E66 e66, PaymentMethod paymentMethod) {
        e66.A07 = paymentMethod;
        PaymentMethod paymentMethod2 = e66.A04.A04;
        if (paymentMethod2 == null || !paymentMethod2.getId().equals(paymentMethod.getId())) {
            e66.A06.A01();
            e66.A0J.A00(paymentMethod);
        }
        if (e66.A07 == null || e66.A04.A06.isEmpty() || 4DQ.A03(e66.A0B) || 4DQ.A03(e66.A0C)) {
            return;
        }
        if (e66.A0H) {
            A06(e66.A02, e66);
            return;
        }
        e66.A0G = true;
        Fch fch = e66.A0T;
        String str = ((User) 1BK.A0r(e66.A04.A06)).A0k.id;
        PaymentMethod paymentMethod3 = e66.A04.A04;
        2FT A00 = Fvf.A00(Fch.A02(fbUserSession, fch, str, paymentMethod3 != null ? paymentMethod3.getId() : ""), fch, 38);
        e66.A0B = A00;
        1Kd.A0F(FwK.A01(e66, 24), A00, e66.A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r305 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.auth.usersession.FbUserSession r301, X.E66 r302, com.google.common.collect.ImmutableList r303) {
        /*
            r0 = r302
            r1 = r303
            r0.A0A = r1
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            r0.A0K = r1
            r0 = r303
            if (r0 == 0) goto L58
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3c
            r0 = r302
            com.facebook.payments.p2p.datamodel.P2pPaymentData r0 = r0.A04
            com.facebook.payments.paymentmethods.model.PaymentMethod r0 = r0.A04
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L35
            r0 = r303
            java.lang.Object r0 = X.1BK.A0r(r0)
            com.facebook.payments.paymentmethods.model.PaymentMethod r0 = (com.facebook.payments.paymentmethods.model.PaymentMethod) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L47
        L35:
            r0 = r301
            r1 = r302
            r2 = r305
            A04(r0, r1, r2)
        L3c:
            r0 = r302
            X.RSI r0 = r0.A06
            r305 = r0
            r0 = r305
            r0.A01()
        L47:
            r0 = r302
            X.RSI r0 = r0.A06
            X.S5c r0 = r0.A00
            X.FoS r0 = r0.A05
            X.Euz r0 = r0.A08
            r0.A00()
            return
        L58:
            r0 = r302
            X.RSI r0 = r0.A06
            r301 = r0
            java.lang.String r0 = "Null result from payment method fetch"
            r306 = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r305 = r0
            r0 = r305
            r1 = r306
            r0.<init>(r1)
            r0 = r301
            r0.A00()
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E66.A05(com.facebook.auth.usersession.FbUserSession, X.E66, com.google.common.collect.ImmutableList):void");
    }

    public static void A06(2JX r301, E66 e66) {
        e66.A0H = true;
        e66.A02 = r301;
        if (r301 != null) {
            ImmutableList A2K = r301.A2K(241352577, 646499151);
            if (A2K.size() > 3) {
                0fH.A0B(E66.class, "Invalid dialog buttons provided");
            }
            if (e66.A0I == null) {
                C2121Dea A03 = C2121Dea.A03(e66.A00);
                String A0o = r301.A0o();
                if (A0o != null) {
                    A03.A0B(A0o);
                }
                String A0h = r301.A0h();
                if (A0h != null) {
                    A03.A0A(A0h);
                }
                if (A2K.size() >= 1) {
                    A03.A0H(A01(e66, A2K, 0), AbF.A0M(A2K, 0).A0i());
                }
                if (A2K.size() >= 2) {
                    A03.A0G(A01(e66, A2K, 1), AbF.A0M(A2K, 1).A0i());
                }
                if (A2K.size() >= 3) {
                    A03.A0F(A01(e66, A2K, 2), AbF.A0M(A2K, 2).A0i());
                }
                A03.A0C(false);
                AbM.A1I(A03);
            }
            e66.A0I = r301;
        } else {
            e66.A0G = false;
        }
        e66.A06.A01();
        e66.A06.A00.A05.A08.A00();
    }

    public static boolean A07(E66 e66) {
        PaymentMethod paymentMethod = e66.A07;
        if (!(paymentMethod instanceof PaymentMethodWithBalance)) {
            return false;
        }
        try {
            PaymentMethodWithBalance paymentMethodWithBalance = (PaymentMethodWithBalance) paymentMethod;
            CurrencyAmount A00 = e66.A04.A00();
            CallerContext callerContext = Fcb.A01;
            return DKD.A1U(paymentMethodWithBalance.AYl().compareTo(A00));
        } catch (IllegalArgumentException e) {
            0fH.A0H(E66.class, "Exception thrown on currency compare", e);
            e66.A06.A00();
            return true;
        }
    }

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        View qvs = new QVS(context);
        ((QVS) qvs).A04 = this.A0V;
        return qvs;
    }

    @Override // X.Ezy
    public void A0E(int i, int i2, Intent intent) {
        PaymentMethod paymentMethod;
        FbUserSession A0C = 4YV.A0C(this.A00);
        if (i == 50) {
            if (i2 != -1 || intent == null) {
                SettableFuture settableFuture = this.A0F;
                if (settableFuture != null) {
                    settableFuture.set(ELQ.A01);
                    return;
                }
                return;
            }
            if (!super.A00 || (paymentMethod = (PaymentMethod) intent.getParcelableExtra("selected_payment_method")) == null) {
                return;
            }
            String id = paymentMethod.getId();
            ImmutableList immutableList = this.A0A;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    if (((PaymentOption) it.next()).getId().equals(id)) {
                        A04(A0C, this, paymentMethod);
                        return;
                    }
                }
            }
            A0I(A0C, paymentMethod);
            return;
        }
        if (i != 51) {
            boolean z = true;
            if (i == 52) {
                if (i2 == -1) {
                    this.A0J.A00(new PaypalFundingOptionPaymentMethod((PaypalFundingOptionData) intent.getParcelableExtra("funding_option_id"), (PayPalBillingAgreement) this.A07));
                }
                SettableFuture settableFuture2 = this.A0E;
                if (settableFuture2 != null) {
                    if (i2 != -1) {
                        z = false;
                    }
                    AbG.A1W(settableFuture2, z);
                    this.A0E = null;
                    return;
                }
                return;
            }
            if (i != 53) {
                if (i == 54) {
                    SettableFuture settableFuture3 = this.A0D;
                    if (settableFuture3 != null) {
                        if (-1 != i2) {
                            z = false;
                        }
                        AbG.A1W(settableFuture3, z);
                        this.A0D = null;
                    }
                    this.A0K = false;
                    A03(A0C, this);
                    return;
                }
                return;
            }
            if (i2 == -1) {
                A04(A0C, this, new PaypalFundingOptionPaymentMethod((PaypalFundingOptionData) intent.getParcelableExtra("funding_option_id"), (PayPalBillingAgreement) this.A07));
            }
        }
        SettableFuture settableFuture4 = this.A0F;
        if (settableFuture4 != null) {
            settableFuture4.set(i2 == -1 ? ELQ.A04 : ELQ.A01);
            this.A0F = null;
        }
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A00 = context;
        this.A01 = r304;
        this.A04 = p2pPaymentData;
        this.A06 = rsi;
        this.A0J = rqd;
        this.A03 = p2pPaymentConfig;
        if (bundle != null) {
            if (bundle.containsKey("KEY_PAYMENT_METHODS")) {
                this.A0A = ImmutableList.copyOf((Collection) bundle.getSerializable("KEY_PAYMENT_METHODS"));
                this.A0K = true;
            }
            if (bundle.containsKey("KEY_ERROR_RESULT")) {
                this.A02 = (2JX) FJ8.A03(bundle, "KEY_ERROR_RESULT");
                this.A0H = true;
            }
            if (bundle.containsKey("KEY_HAS_ERROR_DIALOG")) {
                this.A0G = bundle.getBoolean("KEY_HAS_ERROR_DIALOG", false);
            }
        }
        A03(4YV.A0D(context), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (X.4DQ.A03(r301.A0C) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (A07(r301) != false) goto L11;
     */
    @Override // X.Ezy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(android.view.View r302, com.facebook.payments.p2p.datamodel.P2pPaymentConfig r303, com.facebook.payments.p2p.datamodel.P2pPaymentData r304) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E66.A0G(android.view.View, com.facebook.payments.p2p.datamodel.P2pPaymentConfig, com.facebook.payments.p2p.datamodel.P2pPaymentData):void");
    }

    @Override // X.Ezy
    public void A0H(P2pPaymentData p2pPaymentData) {
        P2pPaymentData p2pPaymentData2 = this.A04;
        this.A04 = p2pPaymentData;
        PaymentMethod paymentMethod = p2pPaymentData.A04;
        if (paymentMethod != null && !1JF.A0B(paymentMethod.getId())) {
            String id = this.A04.A04.getId();
            PaymentMethod paymentMethod2 = this.A07;
            if (!id.equals(paymentMethod2 == null ? null : paymentMethod2.getId())) {
                this.A07 = this.A04.A04;
                A03(4YV.A0C(this.A00), this);
                this.A06.A01();
            }
        }
        P2pPaymentData p2pPaymentData3 = this.A04;
        CurrencyAmount A00 = p2pPaymentData3.A00();
        if (A00 == null || p2pPaymentData3.A04 == null || A00.equals(p2pPaymentData2.A00())) {
            return;
        }
        PaypalFundingOptionPaymentMethod paypalFundingOptionPaymentMethod = this.A04.A04;
        if (paypalFundingOptionPaymentMethod instanceof PaypalFundingOptionPaymentMethod) {
            this.A0J.A00(paypalFundingOptionPaymentMethod.A01);
        }
    }

    public void A0I(FbUserSession fbUserSession, PaymentMethod paymentMethod) {
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList immutableList = this.A0A;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbH.A1V(A0h, it);
            }
        }
        this.A0A = AbG.A0z(A0h, paymentMethod);
        A04(fbUserSession, this, paymentMethod);
        if (paymentMethod instanceof PayPalBillingAgreement) {
            PayPalBillingAgreement payPalBillingAgreement = (PayPalBillingAgreement) paymentMethod;
            if (this.A04.A00().A08()) {
                return;
            }
            0LS.A05(A00(this, payPalBillingAgreement), this.A01, 53);
            return;
        }
        SettableFuture settableFuture = this.A0F;
        if (settableFuture != null) {
            settableFuture.set(ELQ.A04);
            this.A0F = null;
        }
    }
}
