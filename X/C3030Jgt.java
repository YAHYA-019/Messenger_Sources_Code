package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.Set;

/* renamed from: X.Jgt, reason: case insensitive filesystem */
/* loaded from: Jgt.class */
public final class C3030Jgt extends ViewModel {
    public Rem A00;
    public ECPHandler A01;
    public FJC A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final LiveData A07;
    public final LiveData A08;
    public final MediatorLiveData A09;
    public final MediatorLiveData A0A;
    public final MediatorLiveData A0B;
    public final MediatorLiveData A0C;
    public final MutableLiveData A0D;
    public final MutableLiveData A0E = JQx.A0a();
    public final MutableLiveData A0F = JQx.A0a();
    public final MutableLiveData A0G;
    public final MutableLiveData A0H;
    public final MutableLiveData A0I;
    public final MutableLiveData A0J;
    public final Observer A0K;
    public final Observer A0L;
    public final Observer A0M;
    public final Observer A0N;
    public final Observer A0O;
    public final L8l A0P;
    public final C3032Jgv A0Q;
    public final LoggingContext A0R;
    public final C3029Jgs A0S;
    public final java.util.Map A0T;

    /* JADX WARN: Type inference failed for: r0v79, types: [androidx.lifecycle.LiveData, androidx.lifecycle.MediatorLiveData] */
    public C3030Jgt(C3032Jgv c3032Jgv, LoggingContext loggingContext, C3029Jgs c3029Jgs) {
        this.A0R = loggingContext;
        this.A0S = c3029Jgs;
        this.A0Q = c3032Jgv;
        L8l l8l = new L8l();
        this.A0P = l8l;
        this.A07 = l8l.A08;
        this.A0D = JQx.A0a();
        this.A0T = 04R.A09(new 03Y[]{LAF.A00(KOy.A09, false), LAF.A00(KOy.A0J, false), LAF.A00(KOy.A0A, false), LAF.A00(KOy.A0I, false), LAF.A00(KOy.A0H, false), LAF.A00(KOy.A0B, false), LAF.A00(KOy.A04, false)});
        this.A0H = JQx.A0a();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.A09 = mediatorLiveData;
        MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        this.A0A = mediatorLiveData2;
        this.A0C = new MediatorLiveData();
        this.A0I = JQx.A0a();
        this.A0J = JQx.A0a();
        this.A0G = JQx.A0a();
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        KP0 kp0 = KP0.A0f;
        C0ty c0ty = C0ty.A00;
        FJC A03 = FJC.A03(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, kp0, new ItemDetails(0S2.A00, null), null, null, c0ty, 0, false, false, false));
        this.A02 = A03;
        KP0 kp02 = KP0.A0P;
        11T.A0I(A03, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        ?? liveData = new LiveData(FJC.A03(new PuxAccordionItem(kp02, null, A03, c0ty, false)));
        liveData.mSources = new 0QJ();
        this.A0B = liveData;
        this.A08 = l8l.A0A;
        JQz.A1A(mediatorLiveData2, (Object) null);
        MPg mPg = (MPg) this.A0F.getValue();
        JQz.A19(mediatorLiveData, Integer.valueOf((mPg != null ? LD1.A03(mPg) : null) == EnumC3490Mfk.A04 ? 2131956182 : 2131956148));
        C06014fk.A0A().A06.A00.observeForever(LR8.A00(this, 24));
        this.A0N = LR8.A00(this, 28);
        this.A0K = LR8.A00(this, 25);
        this.A0M = LR8.A00(this, 27);
        this.A0L = LR8.A00(this, 26);
        this.A0O = LR8.A00(this, 29);
    }

    public static final void A00(C3030Jgt c3030Jgt) {
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) c3030Jgt.A0H.getValue();
        if (eCPPaymentRequest != null) {
            C3032Jgv c3032Jgv = c3030Jgt.A0Q;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            c3032Jgv.A09(LD1.A02((2Jd) null, eCPPaymentRequest, (OtcInput) null, paymentReceiverInfo != null ? paymentReceiverInfo.A02 : null, eCPPaymentRequest.A09, "REGULAR"), c3030Jgt.A0R);
        }
    }

    public static final boolean A01(C3030Jgt c3030Jgt) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0W = JQz.A0W(c3030Jgt.A0H);
        return (A0W == null || (checkoutConfiguration = A0W.A01) == null || !checkoutConfiguration.A0D.contains(KNL.A08)) ? false : true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A02() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3030Jgt.A02():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006b, code lost:
    
        if (r307 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03() {
        /*
            r301 = this;
            r0 = r301
            androidx.lifecycle.MutableLiveData r0 = r0.A0I
            X.FJC r0 = X.JQz.A0X(r0)
            r302 = r0
            r0 = r302
            boolean r0 = X.FJC.A0B(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L9f
            java.lang.String r0 = "formViewModel"
            r304 = r0
            X.Mfk r0 = X.EnumC3490Mfk.A04
            r305 = r0
            X.Ks7 r0 = X.C06014fk.A0A()
            X.LZv r0 = r0.A02
            r306 = r0
            r0 = r301
            com.facebookpay.logging.LoggingContext r0 = r0.A0R
            r307 = r0
            r0 = r301
            X.Jgs r0 = r0.A0S
            X.Kzj r0 = r0.A04()
            r308 = r0
            r0 = r307
            java.lang.String r1 = "add_paypal_nux"
            java.util.LinkedHashMap r0 = X.JR1.A16(r0, r1)
            r309 = r0
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r302 = r0
            r0 = r309
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)
            java.lang.String r0 = "extra_data"
            r310 = r0
            r0 = r309
            r1 = r310
            java.lang.Object r0 = r0.get(r1)
            r307 = r0
            r0 = r307
            boolean r0 = X.C0B7.A08(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6e
            r0 = r307
            java.util.Map r0 = (java.util.Map) r0
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L73
        L6e:
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r307 = r0
        L73:
            r0 = r308
            r1 = r307
            X.LEL.A08(r0, r1)
            r0 = r309
            r1 = r310
            r2 = r307
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r309
            com.google.common.collect.ImmutableMap r0 = X.GOo.A0k(r0)
            r307 = r0
            r0 = r306
            java.lang.String r1 = "user_add_credential_submit"
            r2 = r307
            r0.BZT(r1, r2)
            r0 = r304
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3030Jgt.A03():void");
    }

    public final void A04(ECPHandler eCPHandler) {
        if (eCPHandler == null) {
            throw AnonymousClass001.A0N("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
        }
        ECPHandler eCPHandler2 = this.A01;
        if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
            throw AnonymousClass001.A0N("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        if (!11T.A0O(this.A01, eCPHandler)) {
            throw AnonymousClass001.A0Q("transactionInfo");
        }
        this.A01 = eCPHandler;
    }

    public final void A05(LoggingContext loggingContext, Integer num) {
        11T.A0F(num, 1);
        if (num == 0S2.A00) {
            7zU.A0b().A0Q(loggingContext, "nux_checkout", DKH.A0t(this.A0S));
        }
        if (this.A01 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        MutableLiveData mutableLiveData = this.A0H;
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0S.A03(null, true);
        throw AnonymousClass001.A0Q("handleCancellation");
    }

    public final boolean A06() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0W = JQz.A0W(this.A0H);
        boolean z = false;
        if (A0W == null || (checkoutConfiguration = A0W.A01) == null || !1BK.A1X(checkoutConfiguration.A02, true)) {
            return this.A0S.A02;
        }
        if (this.A0S.A02) {
            if ((A07() ? 0S2.A00 : 0S2.A0N) == 0S2.A00) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A07() {
        CheckoutConfiguration checkoutConfiguration;
        CheckoutConfiguration checkoutConfiguration2;
        ECPRepositoryImpl eCPRepositoryImpl = C06014fk.A0A().A06;
        MutableLiveData mutableLiveData = this.A0H;
        ECPPaymentRequest A0W = JQz.A0W(mutableLiveData);
        Set set = (A0W == null || (checkoutConfiguration2 = A0W.A01) == null) ? C0uA.A00 : checkoutConfiguration2.A0D;
        ECPPaymentRequest A0W2 = JQz.A0W(mutableLiveData);
        Set set2 = (A0W2 == null || (checkoutConfiguration = A0W2.A01) == null) ? C0uA.A00 : checkoutConfiguration.A0E;
        Object value = mutableLiveData.getValue();
        if (value != null) {
            return eCPRepositoryImpl.A02(((ECPPaymentRequest) value).A08, set, set2);
        }
        throw 1BK.A0h();
    }
}
