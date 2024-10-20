package X;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InvisibleHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.Jgw, reason: case insensitive filesystem */
/* loaded from: Jgw.class */
public final class C3033Jgw extends ViewModel {
    public LiveData A00;
    public MutableLiveData A01;
    public KP0 A02;
    public RQQ A03;
    public Kq6 A04;
    public ECPHandler A05;
    public Ra5 A06;
    public FJC A07;
    public FJC A08;
    public FJC A09;
    public FJC A0A;
    public FJC A0B;
    public FJC A0C;
    public FJC A0D;
    public FJC A0E;
    public FJC A0F;
    public FJC A0G;
    public FJC A0H;
    public FJC A0I;
    public FJC A0J;
    public FJC A0K;
    public FJC A0L;
    public FJC A0M;
    public FJC A0N;
    public FJC A0O;
    public FJC A0P;
    public FJC A0Q;
    public FJC A0R;
    public FJC A0S;
    public Boolean A0T;
    public Boolean A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public List A0Y;
    public java.util.Map A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public FJC A0h;
    public FJC A0i;
    public FJC A0j;
    public FJC A0k;
    public Boolean A0l;
    public boolean A0m;
    public final LiveData A0n;
    public final LiveData A0o;
    public final LiveData A0p;
    public final MediatorLiveData A0q;
    public final MediatorLiveData A0r;
    public final MutableLiveData A0s;
    public final MutableLiveData A0t;
    public final MutableLiveData A0u;
    public final MutableLiveData A0v;
    public final MutableLiveData A0w;
    public final MutableLiveData A0x;
    public final MutableLiveData A0y;
    public final MutableLiveData A0z;
    public final MutableLiveData A10;
    public final MutableLiveData A11;
    public final Observer A12;
    public final Observer A13;
    public final Observer A14;
    public final Observer A15;
    public final Observer A16;
    public final Observer A17;
    public final Observer A18;
    public final Observer A19;
    public final Observer A1A;
    public final Observer A1B;
    public final Observer A1C;
    public final Observer A1D;
    public final Observer A1E;
    public final Observer A1F;
    public final Observer A1G;
    public final Observer A1H;
    public final Observer A1I;
    public final Observer A1J;
    public final C3039Jh2 A1K;
    public final Q2I A1L;
    public final L8l A1M;
    public final C3036Jgz A1N;
    public final C3032Jgv A1O;
    public final LoggingContext A1P;
    public final C3029Jgs A1Q;
    public final C3038Jh1 A1R;
    public final C3031Jgu A1S;
    public final C3035Jgy A1T;
    public final C3037Jh0 A1U;
    public final Q2K A1V;
    public final FJC A1W;
    public final LinkedHashMap A1X;
    public final java.util.Map A1Y;
    public final Observer A1Z;
    public final Observer A1a;
    public final Observer A1b;
    public final List A1c;

    /* JADX WARN: Type inference failed for: r0v97, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C3033Jgw(C3039Jh2 c3039Jh2, Q2I q2i, C3036Jgz c3036Jgz, C3032Jgv c3032Jgv, LoggingContext loggingContext, C3029Jgs c3029Jgs, C3038Jh1 c3038Jh1, C3031Jgu c3031Jgu, C3035Jgy c3035Jgy, C3037Jh0 c3037Jh0, Q2K q2k) {
        11T.A0F(c3031Jgu, 2);
        7zT.A11(3, c3037Jh0, c3036Jgz, c3039Jh2, c3035Jgy);
        7zS.A18(7, q2k, c3038Jh1, c3032Jgv);
        11T.A0F(c3029Jgs, 10);
        11T.A0F(q2i, 11);
        this.A1P = loggingContext;
        this.A1S = c3031Jgu;
        this.A1U = c3037Jh0;
        this.A1N = c3036Jgz;
        this.A1K = c3039Jh2;
        this.A1T = c3035Jgy;
        this.A1V = q2k;
        this.A1R = c3038Jh1;
        this.A1O = c3032Jgv;
        this.A1Q = c3029Jgs;
        this.A1L = q2i;
        this.A11 = JQx.A0a();
        L8l l8l = new L8l();
        this.A1M = l8l;
        this.A0o = l8l.A08;
        MutableLiveData A0a = JQx.A0a();
        this.A0u = A0a;
        this.A0p = A0a;
        this.A0q = new MediatorLiveData();
        this.A0w = JQx.A0a();
        this.A0z = JQx.A0a();
        this.A0t = JQx.A0a();
        this.A10 = JQx.A0a();
        this.A0x = JQx.A0a();
        MutableLiveData A0a2 = JQx.A0a();
        this.A0s = A0a2;
        this.A0n = A0a2;
        this.A0y = JQx.A0a();
        03Y A00 = LAF.A00(KOy.A08, false);
        03Y A002 = LAF.A00(KOy.A09, false);
        03Y A003 = LAF.A00(KOy.A0F, false);
        03Y A004 = LAF.A00(KOy.A0C, false);
        03Y A005 = LAF.A00(KOy.A0A, false);
        03Y A006 = LAF.A00(KOy.A0J, false);
        03Y A007 = LAF.A00(KOy.A0I, false);
        03Y A008 = LAF.A00(KOy.A06, false);
        03Y A009 = LAF.A00(KOy.A0G, false);
        KOy kOy = KOy.A0H;
        03Y A0010 = LAF.A00(kOy, true);
        KOy kOy2 = KOy.A0B;
        03Y A0011 = LAF.A00(kOy2, true);
        KOy kOy3 = KOy.A04;
        this.A1Y = 04R.A09(new 03Y[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, LAF.A00(kOy3, true), LAF.A00(KOy.A05, false)});
        this.A1c = C0s8.A14(kOy, kOy2, kOy3);
        this.A01 = new LiveData(FJC.A03((Object) null));
        this.A0v = JQx.A0a();
        this.A0H = FJC.A03((Object) null);
        this.A0P = FJC.A03((Object) null);
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        KP0 kp0 = KP0.A0f;
        C0ty c0ty = C0ty.A00;
        Integer num = 0S2.A00;
        this.A0i = FJC.A03(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, kp0, new ItemDetails(num, null), null, null, c0ty, 0, false, false, false));
        this.A0N = FJC.A03(new PuxPaymentMethodItem(KP0.A0g, null, null, false, true));
        KP0 kp02 = KP0.A0b;
        this.A0I = FJC.A03(new PuxContactItem(kp02, null, null, null, null, null, null, false));
        this.A0Q = FJC.A03(new PuxShippingAddressItem(KP0.A0k, null, null, null, null, false));
        this.A0J = FJC.A03(new PuxFulfillmentOptionItem(KP0.A0d, null, num, null, false, false));
        this.A0O = FJC.A03(new PuxContactItem(kp02, null, null, null, null, null, null, false));
        this.A0M = FJC.A03(new PayButtonItem(new CurrencyAmount("", ""), KP0.A0S, null, false));
        this.A0R = FJC.A03(new PuxTermsConditionItem(null, null, null, null, KP0.A0l, null, null, null, null, false));
        this.A0Z = 04R.A0G();
        this.A0K = FJC.A03(new IncentiveItem(KP0.A0e, c0ty, 0, true));
        this.A0L = FJC.A03(new IncentiveSummaryItem(KP0.A0I, c0ty, 0));
        KP0 kp03 = KP0.A0Z;
        FJC fjc = this.A0Q;
        11T.A0I(fjc, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0F = FJC.A03(new PuxAccordionItem(kp03, null, fjc, c0ty, false));
        KP0 kp04 = KP0.A0X;
        FJC fjc2 = this.A0N;
        11T.A0I(fjc2, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0D = FJC.A03(new PuxAccordionItem(kp04, null, fjc2, c0ty, false));
        KP0 kp05 = KP0.A0U;
        FJC fjc3 = this.A0I;
        11T.A0I(fjc3, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0A = FJC.A03(new PuxAccordionItem(kp05, null, fjc3, c0ty, false));
        KP0 kp06 = KP0.A0V;
        FJC fjc4 = this.A0J;
        11T.A0I(fjc4, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0B = FJC.A03(new PuxAccordionItem(kp06, null, fjc4, c0ty, false));
        KP0 kp07 = KP0.A0Y;
        FJC fjc5 = this.A0O;
        11T.A0I(fjc5, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0E = FJC.A03(new PuxAccordionItem(kp07, null, fjc5, c0ty, false));
        KP0 kp08 = KP0.A0W;
        FJC fjc6 = this.A0i;
        11T.A0I(fjc6, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0h = FJC.A03(new PuxAccordionItem(kp08, null, fjc6, c0ty, false));
        this.A0G = FJC.A03(new AnonCheckoutPuxLink(null, KP0.A08, false));
        this.A07 = FJC.A03(new InlineBackButtonItem(KP0.A0K, null));
        this.A09 = FJC.A03(new EmailOptInItem(null, KP0.A0G, null, false, false));
        this.A1W = FJC.A04(new InvisibleHeaderItem(KP0.A0L));
        this.A04 = new Kq6(c0ty);
        this.A0S = FJC.A03((Object) null);
        this.A1X = 1BK.A1C();
        this.A1H = LR8.A00(this, 49);
        this.A1G = LR8.A00(this, 48);
        this.A16 = LR8.A00(this, 37);
        this.A15 = LR8.A00(this, 36);
        this.A1F = LR8.A00(this, 47);
        this.A1E = LR8.A00(this, 46);
        this.A1B = LR8.A00(this, 42);
        this.A1a = LR8.A00(this, 34);
        this.A1Z = LR8.A00(this, 33);
        this.A1D = LR8.A00(this, 44);
        this.A1C = LR8.A00(this, 43);
        this.A13 = LR8.A00(this, 32);
        this.A12 = LR8.A00(this, 31);
        this.A18 = LR8.A00(this, 39);
        this.A17 = LR8.A00(this, 38);
        this.A14 = LR8.A00(this, 35);
        this.A1A = LR8.A00(this, 41);
        this.A1b = LR8.A00(this, 51);
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        JQz.A1A(mediatorLiveData, new Kht(false, false));
        this.A0r = mediatorLiveData;
        this.A19 = LR8.A00(this, 40);
        this.A1I = LR8.A00(this, 50);
        this.A1J = LR8.A00(this, 52);
        C06014fk.A0A().A06.A00.observeForever(LR8.A00(this, 30));
    }

    public static final MediatorLiveData A00(C3033Jgw c3033Jgw, List list) {
        List A0j = c3033Jgw.A0j();
        KOy kOy = KOy.A04;
        if (!A0j.contains(kOy)) {
            return null;
        }
        LAF A0V = JQz.A0V(kOy, c3033Jgw.A1Y);
        if (A0V != null) {
            LAF.A01(A0V, c3033Jgw, 25);
        }
        MediatorLiveData mediatorLiveData = c3033Jgw.A0q;
        C3039Jh2 c3039Jh2 = c3033Jgw.A1K;
        MediatorLiveData mediatorLiveData2 = c3039Jh2.A0A;
        mediatorLiveData.addSource(mediatorLiveData2, c3033Jgw.A1a);
        mediatorLiveData.addSource(c3039Jh2.A0B, c3033Jgw.A1Z);
        if (list != null) {
            11T.A0I(mediatorLiveData2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
            list.add(mediatorLiveData2);
        }
        11T.A0I(mediatorLiveData2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
        return mediatorLiveData2;
    }

    public static final KtE A01(C3033Jgw c3033Jgw) {
        MediatorLiveData mediatorLiveData = c3033Jgw.A1K.A0A;
        if (L6B.A02(KOy.A04, c3033Jgw.A0j()) && JR0.A1S(mediatorLiveData)) {
            return (KtE) ((L07) JR1.A0p(mediatorLiveData)).A01;
        }
        return null;
    }

    public static TransactionInfo A02(C3033Jgw c3033Jgw) {
        return (TransactionInfo) c3033Jgw.A0S.A01;
    }

    public static final ShippingAddress A03(C3033Jgw c3033Jgw) {
        if (!L6B.A02(KOy.A0B, c3033Jgw.A0j())) {
            return null;
        }
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration == null || !checkoutConfiguration.A0E.contains(KNE.A02)) {
            return null;
        }
        return c3033Jgw.A1R.A0F();
    }

    public static final ShippingAddress A04(C3033Jgw c3033Jgw) {
        CheckoutConfiguration checkoutConfiguration;
        MediatorLiveData mediatorLiveData = c3033Jgw.A1U.A06;
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) A0A;
        if (L6B.A02(KOy.A0H, c3033Jgw.A0j()) && (checkoutConfiguration = eCPPaymentRequest.A01) != null && checkoutConfiguration.A0D.contains(KNL.A0D) && JR0.A1S(mediatorLiveData)) {
            return (ShippingAddress) ((L07) JR1.A0p(mediatorLiveData)).A01;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.FJC A05() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A05():X.FJC");
    }

    public static final FJC A06(Kld kld, C3033Jgw c3033Jgw, List list, boolean z) {
        KP0 kp0;
        List list2;
        Object selectionActionViewItem;
        List list3;
        FJC A0X;
        L07 l07;
        PickupInfo pickupInfo;
        FJC fjc = c3033Jgw.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem = (PuxFulfillmentOptionItem) fjc.A01;
        String str = null;
        if ((puxFulfillmentOptionItem != null ? puxFulfillmentOptionItem.A02 : null) == 0S2.A01) {
            if (!A0d(c3033Jgw) && !A0c(c3033Jgw) && !A0e(c3033Jgw) && (A0X = JQz.A0X(c3033Jgw.A1T.A06)) != null && (l07 = (L07) A0X.A01) != null && (pickupInfo = (PickupInfo) l07.A01) != null) {
                str = pickupInfo.A02;
            }
            C3036Jgz c3036Jgz = c3033Jgw.A1N;
            ArrayList A0s = AnonymousClass001.A0s();
            MutableLiveData mutableLiveData = c3036Jgz.A05;
            11T.A0I(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
            FJC A0X2 = JQz.A0X(mutableLiveData);
            if (A0X2 != null && (list3 = (List) A0X2.A01) != null) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (Object obj : list3) {
                    Object obj2 = ((FJC) obj).A01;
                    if (obj2 instanceof SelectionPickupFulfillmentOptionItem) {
                        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2;
                        if (11T.A0O(selectionPickupFulfillmentOptionItem != null ? selectionPickupFulfillmentOptionItem.A07 : null, C3036Jgz.A00(c3036Jgz))) {
                            A0s2.add(obj);
                        }
                    }
                }
                if (!A0s2.isEmpty()) {
                    JQz.A1K(JR1.A0e(2131956077), A0s);
                    A0s.addAll(A0s2);
                    JQz.A1K(new SelectionActionViewItem(KP0.A0m, null, 2131956031, null, null), A0s);
                    if (str != null) {
                        selectionActionViewItem = new SelectionTextViewItem(KP0.A0t, null, str, true);
                        JQz.A1K(selectionActionViewItem, A0s);
                    }
                    kp0 = KP0.A0V;
                    fjc = c3033Jgw.A0J;
                    11T.A0I(fjc, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
                    list2 = A0s;
                }
            }
            if (C06014fk.A03().A03()) {
                JQz.A1K(new SelectionHeaderItem(KP0.A0o, 2131956077, 0S2.A0N, null, null), A0s);
                selectionActionViewItem = new SelectionActionViewItem(KP0.A0m, null, 2131956089, null, null);
                JQz.A1K(selectionActionViewItem, A0s);
            }
            kp0 = KP0.A0V;
            fjc = c3033Jgw.A0J;
            11T.A0I(fjc, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            list2 = A0s;
        } else {
            kp0 = KP0.A0V;
            list2 = list;
        }
        return FJC.A04(new PuxAccordionItem(kp0, kld, fjc, list2, z));
    }

    public static final FJC A07(C3033Jgw c3033Jgw) {
        Boolean bool;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0W = JQz.A0W(c3033Jgw.A11);
        if (A0W != null && (checkoutConfiguration = A0W.A01) != null && 7zR.A1X(checkoutConfiguration.A02)) {
            C3029Jgs c3029Jgs = c3033Jgw.A1Q;
            if (c3029Jgs.A02 && !c3029Jgs.A07()) {
                bool = c3033Jgw.A0l;
                if (bool == null) {
                    return FJC.A03((Object) null);
                }
                return FJC.A04(bool);
            }
        }
        bool = false;
        return FJC.A04(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r301.A1O.A05 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.FJC A08(X.C3033Jgw r301) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A08(X.Jgw):X.FJC");
    }

    public static final FJC A09(FJC fjc, int i) {
        if (FJC.A0A(fjc) && (fjc.A02 instanceof LxJ)) {
            fjc = FJC.A05(fjc.A01, new LxJ(KOv.A08, i));
            11T.A0D(fjc);
        }
        return fjc;
    }

    public static Object A0A(C3033Jgw c3033Jgw) {
        return c3033Jgw.A11.getValue();
    }

    private final List A0B() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0W = JQz.A0W(this.A11);
        return C0s8.A14((A0W == null || (checkoutConfiguration = A0W.A01) == null || checkoutConfiguration.A09 == null) ? KOy.A0I : KOy.A06, KOy.A0J, KOy.A0C, KOy.A0F, KOy.A08, KOy.A0G, KOy.A0A);
    }

    private final void A0C() {
        List list = this.A04.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0QU.A0t(((L3w) it.next()).A01.keySet(), A0s);
        }
        for (KP0 kp0 : 0QD.A0V(A0s)) {
            A0E(kp0, this);
            A0F(kp0, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
    
        if (r309 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x021a, code lost:
    
        if (r306 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023a  */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v227, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0D(X.KP0 r301, X.KP0 r302, X.C3033Jgw r303, java.lang.Boolean r304) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0D(X.KP0, X.KP0, X.Jgw, java.lang.Boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x055a, code lost:
    
        if (r329 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04e4, code lost:
    
        if (r329 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0489, code lost:
    
        if (r317 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042a, code lost:
    
        if (r317 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x06f4, code lost:
    
        if (r307 == 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0743, code lost:
    
        if ((r0.A02 instanceof X.LxJ) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        if (r305 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bf, code lost:
    
        if ((r0.A02 instanceof X.LxJ) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0217, code lost:
    
        if (r305 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f0, code lost:
    
        if ((r0.A02 instanceof X.LxJ) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        if ((r0.A02 instanceof X.LxJ) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v421, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v460, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v492, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v529, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r307v11 */
    /* JADX WARN: Type inference failed for: r307v14 */
    /* JADX WARN: Type inference failed for: r307v16, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r307v19 */
    /* JADX WARN: Type inference failed for: r307v20 */
    /* JADX WARN: Type inference failed for: r307v21 */
    /* JADX WARN: Type inference failed for: r307v23, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r307v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r312v12, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r312v17, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r312v2, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0E(X.KP0 r301, X.C3033Jgw r302) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0E(X.KP0, X.Jgw):void");
    }

    public static final void A0F(KP0 kp0, C3033Jgw c3033Jgw) {
        KOy kOy;
        FJC fjc;
        switch (kp0.ordinal()) {
            case 12:
                kOy = KOy.A0B;
                fjc = c3033Jgw.A0D;
                break;
            case 13:
                kOy = KOy.A0H;
                fjc = c3033Jgw.A0F;
                break;
            case 14:
                kOy = KOy.A04;
                fjc = c3033Jgw.A0A;
                break;
            case 15:
                kOy = KOy.A06;
                fjc = c3033Jgw.A0B;
                break;
            case 16:
                kOy = KOy.A0A;
                fjc = c3033Jgw.A0h;
                break;
            case 17:
                kOy = KOy.A0E;
                fjc = c3033Jgw.A0E;
                break;
            case 50:
                kOy = KOy.A07;
                fjc = c3033Jgw.A0C;
                break;
            default:
                throw AnonymousClass002.A0C(kp0, "{ECPViewModel} ItemType is not found for identifier => ", AnonymousClass001.A0k());
        }
        A0M(c3033Jgw, kOy, fjc);
    }

    public static final void A0G(KP0 kp0, C3033Jgw c3033Jgw, boolean z) {
        if (!z) {
            if (kp0 == c3033Jgw.A02) {
                c3033Jgw.A0p(false);
                return;
            }
            return;
        }
        KP0 kp02 = c3033Jgw.A02;
        if (kp0 != kp02) {
            LinkedHashMap linkedHashMap = c3033Jgw.A1X;
            Set keySet = linkedHashMap.keySet();
            11T.A0A(keySet);
            List A0V = 0QD.A0V(keySet);
            if (A0V.indexOf(kp0.A01()) < (kp02 != null ? A0V.indexOf(kp02.A01()) : linkedHashMap.size())) {
                c3033Jgw.A0H(kp0, false);
            }
        }
    }

    private final void A0H(KP0 kp0, boolean z) {
        String str;
        String str2;
        KP0 kp02 = KP0.A0X;
        if (kp0 == kp02 && A0s()) {
            ShippingAddress A04 = A04(this);
            ShippingAddress A03 = A03(this);
            boolean z2 = false;
            if (A04 != null && A03 != null && (str = A04.A06) != null && (str2 = A03.A06) != null) {
                z2 = str.equals(str2);
            }
            Boolean A0I = this.A1R.A0I();
            LZv A0b = 7zU.A0b();
            LoggingContext loggingContext = this.A1P;
            String str3 = z2 ? "checkbox" : "inline_billing_form";
            if (A0I != null) {
                z2 = A0I.booleanValue();
            }
            LZv.A03(AbF.A08(1BK.A08(A0b.A00, "client_load_shippingasbilling_display"), ActionId.DATA_LOAD_START), loggingContext, new GAk(null, loggingContext, str3, 9, z2));
        }
        KP0 kp03 = this.A02;
        this.A02 = kp0;
        if (kp03 != null) {
            if (z) {
                int ordinal = kp03.ordinal();
                if (ordinal == 13) {
                    FJC A09 = A09(this.A0Q, 2131956058);
                    11T.A0I(A09, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem>");
                    this.A0Q = A09;
                } else if (ordinal == 12) {
                    FJC A092 = A09(this.A0N, 2131956056);
                    11T.A0I(A092, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem>");
                    this.A0N = A092;
                } else if (ordinal == 14) {
                    FJC A093 = A09(this.A0I, 2131956054);
                    11T.A0I(A093, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxContactItem>");
                    this.A0I = A093;
                }
            }
            if (kp03 == KP0.A0W) {
                A0E(kp03, this);
                A0F(kp03, this);
            } else if (kp03 == kp02) {
                A0l();
            }
        }
        A0C();
    }

    public static final void A0I(C3033Jgw c3033Jgw) {
        c3033Jgw.A0t.setValue(new EtZ(new ErrorDialogContent(KOE.A03, null, null, null, 2131956115, 2131956114, null, null, null, null)));
        c3033Jgw.A0m = true;
    }

    public static final void A0J(C3033Jgw c3033Jgw) {
        if (!7zR.A1X(c3033Jgw.A0l) && !FJC.A0B(c3033Jgw.A0N) && ((!FJC.A0B(c3033Jgw.A0F) || !A0f(c3033Jgw)) && (!FJC.A0B(c3033Jgw.A0I) || (!A0a(c3033Jgw) && !A0b(c3033Jgw) && !A0Z(c3033Jgw))))) {
            Object A0A = A0A(c3033Jgw);
            if (A0A == null) {
                throw 1BK.A0h();
            }
            c3033Jgw.A0l = JR0.A0l(L9K.A00((ECPPaymentRequest) A0A, c3033Jgw, false), "FULL_PUX");
        }
        FJC fjc = null;
        A0M(c3033Jgw, KOy.A02, c3033Jgw.A0T() ? c3033Jgw.A08 : null);
        KOy kOy = KOy.A09;
        if (!1BK.A1X(A07(c3033Jgw).A01, false)) {
            fjc = c3033Jgw.A0G;
        }
        A0M(c3033Jgw, kOy, fjc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r309 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r303.contains(X.KNE.A03) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        r309 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r303 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        r306 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        r0.A08 = r307;
        r0.A07 = r309;
        r0.A09 = r306;
        r0 = r0.A0B;
        r0 = X.JQz.A0X(r0.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r302 = (X.KtF) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        X.JQz.A19(r0, X.C3039Jh2.A01(r302, r0));
        r0 = r301.A1T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        if (r303 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        r309 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
    
        if (r303.contains(X.KNE.A07) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        r310 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f5, code lost:
    
        if (r303.contains(X.KNE.A06) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
    
        r310 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ff, code lost:
    
        if (r303 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012c, code lost:
    
        r305 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        r0.A03 = r309;
        r0.A02 = r310;
        r0.A04 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (r303.contains(X.KNE.A08) != true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        r309 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (r303 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        r302 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        r306 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r303.contains(X.KNE.A05) == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r303 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r303.contains(X.KNE.A04) != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0K(X.C3033Jgw r301) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0K(X.Jgw):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ae, code lost:
    
        if (X.FJC.A0C(r301.A0Q) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e5, code lost:
    
        if (X.11T.A0O(r0.A01, r0.A01) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0L(X.C3033Jgw r301) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0L(X.Jgw):void");
    }

    public static final void A0M(C3033Jgw c3033Jgw, KOy kOy, FJC fjc) {
        LinkedHashMap linkedHashMap;
        String str;
        int ordinal = kOy.ordinal();
        if (ordinal != 12) {
            if (ordinal != 21) {
                if (ordinal != 33) {
                    linkedHashMap = c3033Jgw.A1X;
                    str = kOy.name();
                    if (A0h(fjc, (FJC) linkedHashMap.get(str))) {
                        return;
                    }
                } else if (A0h(fjc, c3033Jgw.A0k)) {
                    return;
                } else {
                    c3033Jgw.A0k = fjc;
                }
            } else if (A0h(fjc, c3033Jgw.A0j)) {
                return;
            } else {
                c3033Jgw.A0j = fjc;
            }
            A0Q(c3033Jgw, c3033Jgw.A1X, 11T.A03(c3033Jgw.A1W));
        }
        linkedHashMap = c3033Jgw.A1X;
        str = "INCENTIVES";
        linkedHashMap.put(str, fjc);
        A0Q(c3033Jgw, c3033Jgw.A1X, 11T.A03(c3033Jgw.A1W));
    }

    public static final void A0N(C3033Jgw c3033Jgw, PaymentMethod paymentMethod) {
        String str;
        String str2;
        MPh mPh;
        String AkU;
        C3038Jh1 c3038Jh1 = c3033Jgw.A1R;
        Integer A0J = c3038Jh1.A0J(paymentMethod);
        if (paymentMethod != null) {
            KXq.A00(paymentMethod, A0J, false, c3033Jgw.A1Q.A06());
        }
        ShippingAddress A04 = A04(c3033Jgw);
        ShippingAddress A03 = A03(c3033Jgw);
        boolean z = paymentMethod instanceof CreditCard;
        CreditCard creditCard = z ? (CreditCard) paymentMethod : null;
        if (creditCard == null || (mPh = creditCard.A01) == null || (AkU = mPh.AkU()) == null || !7zL.A1V(AkU)) {
            if (!c3038Jh1.A0O(z ? (CreditCard) paymentMethod : null, true) || A04 == null || A03 == null || (str = A04.A06) == null || (str2 = A03.A06) == null || !str.equals(str2)) {
                return;
            }
            if ((paymentMethod instanceof TokenizedCard) && ((TokenizedCard) paymentMethod).A01.BGM() == Qtm.A02) {
                return;
            }
            if (c3033Jgw.A0a) {
                c3038Jh1.A0M(paymentMethod);
                return;
            }
            L9K.A02(c3033Jgw, "user_click_credential_atomic", "edit_selected_credential_from_alert_dialog");
            if (paymentMethod != null) {
                paymentMethod.BG6();
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            String str3 = A04.A08;
            if (str3 != null && str3.length() > 0) {
                A0k.append(str3);
                A0k.append(", ");
            }
            String str4 = A04.A09;
            if (str4 != null && str4.length() > 0) {
                A0k.append(str4);
                A0k.append(", ");
            }
            String str5 = A04.A01;
            if (str5 != null && str5.length() > 0) {
                A0k.append(str5);
                A0k.append(", ");
            }
            String str6 = A04.A07;
            if (str6 != null && str6.length() > 0) {
                A0k.append(str6);
                A0k.append(" ");
            }
            if (str.length() > 0) {
                A0k.append(str);
            }
            A0k.toString();
            C06014fk.A0I();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0O(C3033Jgw c3033Jgw, Throwable th) {
        if (c3033Jgw.A0m) {
            return;
        }
        if (!(th instanceof K0H)) {
            A0I(c3033Jgw);
            return;
        }
        K0H k0h = (K0H) th;
        11T.A0F(k0h, 0);
        if (k0h.primaryCta.A00 == Qtp.A02) {
            c3033Jgw.A0m = true;
        }
        c3033Jgw.A0t.setValue(L69.A00(k0h));
    }

    public static final void A0P(C3033Jgw c3033Jgw, Throwable th, boolean z, boolean z2) {
        LZv A0b = 7zU.A0b();
        LoggingContext loggingContext = c3033Jgw.A1P;
        Kzj A04 = c3033Jgw.A1Q.A04();
        Boolean valueOf = Boolean.valueOf(z2);
        LinkedHashMap A1C = 1BK.A1C();
        if (z) {
            LEL.A08(A04, A1C);
            if (valueOf != null) {
                A1C.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
            }
            LZv.A02(AbF.A08(1BK.A08(A0b.A00, "client_load_ecpcheckout_success"), 65), loggingContext, A1C, "pux_checkout", 36);
            return;
        }
        LEL.A08(A04, A1C);
        JR1.A1N(th, A1C);
        if (valueOf != null) {
            A1C.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
        }
        LZv.A02(AbF.A08(1BK.A08(A0b.A00, "client_load_ecpcheckout_fail"), 63), loggingContext, A1C, "pux_checkout", 33);
    }

    public static void A0Q(C3033Jgw c3033Jgw, AbstractMap abstractMap, Collection collection) {
        Collection values = abstractMap.values();
        11T.A0A(values);
        c3033Jgw.A0q.setValue(0QD.A0O(0QD.A0S(0QD.A0V(values)), collection));
        c3033Jgw.A0w.setValue(c3033Jgw.A0M);
        c3033Jgw.A0z.setValue(c3033Jgw.A0R);
    }

    public static final void A0R(C3033Jgw c3033Jgw, List list) {
        String str;
        LinkedHashMap linkedHashMap = c3033Jgw.A1X;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FJC fjc = null;
            switch (((KOy) it.next()).ordinal()) {
                case 1:
                    if (!A0V(c3033Jgw)) {
                        break;
                    } else {
                        fjc = c3033Jgw.A07;
                        str = "ANON_CHECKOUT_BACK_BUTTON";
                        break;
                    }
                case 2:
                    if (c3033Jgw.A0T()) {
                        fjc = c3033Jgw.A08;
                    }
                    str = "APM";
                    break;
                case 3:
                    fjc = c3033Jgw.A0H;
                    str = "BANNER";
                    break;
                case 6:
                    fjc = c3033Jgw.A0A;
                    str = "CONTACT_INFORMATION";
                    break;
                case 8:
                    if (A0W(c3033Jgw)) {
                        fjc = c3033Jgw.A09;
                    }
                    str = "EMAIL_OPTIN";
                    break;
                case 9:
                case 29:
                    fjc = c3033Jgw.A0B;
                    str = "FULFILLMENT_OPTIONS";
                    break;
                case 12:
                    fjc = c3033Jgw.A0C;
                    str = "INCENTIVES";
                    break;
                case 17:
                    if (!FJC.A0B(A07(c3033Jgw)) && !7zR.A1X(A07(c3033Jgw).A01)) {
                        break;
                    } else {
                        fjc = c3033Jgw.A0G;
                        str = "ONE_TIME_CHECKOUT_OPTION";
                        break;
                    }
                case 18:
                    fjc = c3033Jgw.A05();
                    str = "ORDER_SUMMARY";
                    break;
                case 19:
                    fjc = c3033Jgw.A0D;
                    str = "PAYMENT_METHOD";
                    break;
                case 21:
                    c3033Jgw.A0j = c3033Jgw.A0M;
                    continue;
                case 22:
                    fjc = c3033Jgw.A0E;
                    str = "PICKUP_CONTACT_INFO";
                    break;
                case 28:
                    fjc = c3033Jgw.A0F;
                    str = PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS;
                    break;
                case 33:
                    c3033Jgw.A0k = c3033Jgw.A0R;
                    continue;
            }
            linkedHashMap.put(str, fjc);
        }
        A0Q(c3033Jgw, linkedHashMap, 11T.A03(c3033Jgw.A1W));
    }

    public static final void A0S(C3033Jgw c3033Jgw, boolean z) {
        JQz.A1B(c3033Jgw.A0v, z);
        FJC fjc = c3033Jgw.A0Q;
        PuxShippingAddressItem puxShippingAddressItem = (PuxShippingAddressItem) fjc.A01;
        FJC fjc2 = null;
        c3033Jgw.A0Q = FJC.A02(fjc, puxShippingAddressItem != null ? new PuxShippingAddressItem(puxShippingAddressItem.A00, puxShippingAddressItem.A01, puxShippingAddressItem.A03, puxShippingAddressItem.A02, puxShippingAddressItem.A04, z) : null);
        FJC fjc3 = c3033Jgw.A0N;
        PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) fjc3.A01;
        c3033Jgw.A0N = FJC.A02(fjc3, puxPaymentMethodItem != null ? new PuxPaymentMethodItem(puxPaymentMethodItem.A00, puxPaymentMethodItem.A01, puxPaymentMethodItem.A02, z, puxPaymentMethodItem.A04) : null);
        FJC fjc4 = c3033Jgw.A0I;
        PuxContactItem puxContactItem = (PuxContactItem) fjc4.A01;
        c3033Jgw.A0I = FJC.A02(fjc4, puxContactItem != null ? new PuxContactItem(puxContactItem.A00, puxContactItem.A01, puxContactItem.A03, puxContactItem.A04, puxContactItem.A05, puxContactItem.A06, puxContactItem.A02, z) : null);
        FJC fjc5 = c3033Jgw.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem = (PuxFulfillmentOptionItem) fjc5.A01;
        c3033Jgw.A0J = FJC.A02(fjc5, puxFulfillmentOptionItem != null ? new PuxFulfillmentOptionItem(puxFulfillmentOptionItem.A00, puxFulfillmentOptionItem.A01, puxFulfillmentOptionItem.A03, puxFulfillmentOptionItem.A02, z, puxFulfillmentOptionItem.A04) : null);
        FJC fjc6 = c3033Jgw.A0O;
        PuxContactItem puxContactItem2 = (PuxContactItem) fjc6.A01;
        c3033Jgw.A0O = FJC.A02(fjc6, puxContactItem2 != null ? new PuxContactItem(puxContactItem2.A00, puxContactItem2.A01, puxContactItem2.A03, puxContactItem2.A04, puxContactItem2.A05, puxContactItem2.A06, puxContactItem2.A02, z) : null);
        FJC fjc7 = c3033Jgw.A0G;
        AnonCheckoutPuxLink anonCheckoutPuxLink = (AnonCheckoutPuxLink) fjc7.A01;
        c3033Jgw.A0G = FJC.A02(fjc7, anonCheckoutPuxLink != null ? new AnonCheckoutPuxLink(anonCheckoutPuxLink.A00, anonCheckoutPuxLink.A01, z) : null);
        FJC fjc8 = c3033Jgw.A09;
        EmailOptInItem emailOptInItem = (EmailOptInItem) fjc8.A01;
        c3033Jgw.A09 = FJC.A02(fjc8, emailOptInItem != null ? new EmailOptInItem(emailOptInItem.A01, emailOptInItem.A02, emailOptInItem.A03, emailOptInItem.A00, z) : null);
        FJC fjc9 = c3033Jgw.A0R;
        PuxTermsConditionItem puxTermsConditionItem = (PuxTermsConditionItem) fjc9.A01;
        c3033Jgw.A0R = FJC.A02(fjc9, puxTermsConditionItem != null ? new PuxTermsConditionItem(puxTermsConditionItem.A01, puxTermsConditionItem.A02, puxTermsConditionItem.A03, puxTermsConditionItem.A00, puxTermsConditionItem.A04, puxTermsConditionItem.A05, puxTermsConditionItem.A06, puxTermsConditionItem.A07, puxTermsConditionItem.A08, z) : null);
        FJC fjc10 = c3033Jgw.A0H;
        PuxBannerItem puxBannerItem = (PuxBannerItem) fjc10.A01;
        c3033Jgw.A0H = FJC.A02(fjc10, puxBannerItem != null ? new PuxBannerItem(puxBannerItem.A00, puxBannerItem.A01, puxBannerItem.A02, puxBannerItem.A03, puxBannerItem.A04, z) : null);
        A0M(c3033Jgw, KOy.A0J, c3033Jgw.A0R);
        c3033Jgw.A02 = null;
        FJC fjc11 = c3033Jgw.A0i;
        PuxOrderSummaryItem puxOrderSummaryItem = (PuxOrderSummaryItem) fjc11.A01;
        c3033Jgw.A0i = FJC.A02(fjc11, puxOrderSummaryItem != null ? new PuxOrderSummaryItem(puxOrderSummaryItem.A02, puxOrderSummaryItem.A01, puxOrderSummaryItem.A03, puxOrderSummaryItem.A04, puxOrderSummaryItem.A05, puxOrderSummaryItem.A06, puxOrderSummaryItem.A07, puxOrderSummaryItem.A00, puxOrderSummaryItem.A0A, puxOrderSummaryItem.A09, z) : null);
        KP0 kp0 = KP0.A0W;
        A0E(kp0, c3033Jgw);
        A0F(kp0, c3033Jgw);
        if (c3033Jgw.A0j().contains(KOy.A0H)) {
            KP0 kp02 = KP0.A0Z;
            A0E(kp02, c3033Jgw);
            A0F(kp02, c3033Jgw);
        }
        if (c3033Jgw.A0j().contains(KOy.A0B)) {
            KP0 kp03 = KP0.A0X;
            A0E(kp03, c3033Jgw);
            A0F(kp03, c3033Jgw);
        }
        if (c3033Jgw.A0j().contains(KOy.A04)) {
            KP0 kp04 = KP0.A0U;
            A0E(kp04, c3033Jgw);
            A0F(kp04, c3033Jgw);
        }
        if (c3033Jgw.A0j().contains(KOy.A0I) || c3033Jgw.A0j().contains(KOy.A06)) {
            KP0 kp05 = KP0.A0V;
            A0E(kp05, c3033Jgw);
            A0F(kp05, c3033Jgw);
        }
        if (c3033Jgw.A0j().contains(KOy.A0E)) {
            KP0 kp06 = KP0.A0Y;
            A0E(kp06, c3033Jgw);
            A0F(kp06, c3033Jgw);
        }
        List A0j = c3033Jgw.A0j();
        KOy kOy = KOy.A09;
        if (A0j.contains(kOy)) {
            A0M(c3033Jgw, kOy, !1BK.A1X(A07(c3033Jgw).A01, false) ? c3033Jgw.A0G : null);
        }
        List A0j2 = c3033Jgw.A0j();
        KOy kOy2 = KOy.A05;
        if (A0j2.contains(kOy2)) {
            if (A0W(c3033Jgw)) {
                fjc2 = c3033Jgw.A09;
            }
            A0M(c3033Jgw, kOy2, fjc2);
        }
        List A0j3 = c3033Jgw.A0j();
        KOy kOy3 = KOy.A03;
        if (A0j3.contains(kOy3)) {
            A0M(c3033Jgw, kOy3, c3033Jgw.A0H);
        }
        List A0j4 = c3033Jgw.A0j();
        KOy kOy4 = KOy.A07;
        if (A0j4.contains(kOy4)) {
            A0M(c3033Jgw, kOy4, c3033Jgw.A0C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (((r0 == null || (r0 = r0.A01) == null) ? null : r0.Af1()) != X.EnumC3490Mfk.A05) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0T() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = A0A(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r302
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r301
            r2 = 0
            java.lang.String r0 = X.L9K.A00(r0, r1, r2)
            r304 = r0
            java.lang.String r0 = "PARTIAL_PUX_WITHOUT_CREDENTIAL"
            r302 = r0
            r0 = r304
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5f
            java.lang.String r0 = "PARTIAL_PUX_WITH_CREDENTIAL"
            r302 = r0
            r0 = r304
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L61
            r0 = r301
            X.FJC r0 = r0.A0N
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L63
            r0 = r302
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L63
            r0 = r302
            X.Mfk r0 = r0.Af1()
            r304 = r0
        L56:
            X.Mfk r0 = X.EnumC3490Mfk.A05
            r302 = r0
            r0 = r304
            r1 = r302
            if (r0 == r1) goto L61
        L5f:
            r0 = 1
            r303 = r0
        L61:
            r0 = r303
            return r0
        L63:
            r0 = 0
            r304 = r0
            goto L56
        L68:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0T():boolean");
    }

    private final boolean A0U() {
        ECPRepositoryImpl eCPRepositoryImpl = C06014fk.A0A().A06;
        MutableLiveData mutableLiveData = this.A11;
        Object value = mutableLiveData.getValue();
        if (value == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) value).A01;
        Set set = checkoutConfiguration != null ? checkoutConfiguration.A0D : C0uA.A00;
        Object value2 = mutableLiveData.getValue();
        if (value2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CheckoutConfiguration checkoutConfiguration2 = ((ECPPaymentRequest) value2).A01;
        Set set2 = checkoutConfiguration2 != null ? checkoutConfiguration2.A0E : C0uA.A00;
        Object value3 = mutableLiveData.getValue();
        if (value3 != null) {
            return eCPRepositoryImpl.A02(((ECPPaymentRequest) value3).A08, set, set2);
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    public static final boolean A0V(C3033Jgw c3033Jgw) {
        Integer num;
        ECPPaymentRequest A0W;
        CheckoutConfiguration checkoutConfiguration;
        C3029Jgs c3029Jgs = c3033Jgw.A1Q;
        boolean A0U = c3033Jgw.A0U();
        boolean z = false;
        boolean A07 = c3029Jgs.A07();
        if (!A0U) {
            if (A07) {
                if (c3029Jgs.A07()) {
                    num = 0S2.A0j;
                }
                throw AnonymousClass001.A0q("OTC State is not known");
            }
            num = 0S2.A0Y;
            if (num == 0S2.A0j) {
                z = 4YV.A1a(checkoutConfiguration.A02, true, false);
            }
            return z;
        }
        if (A07) {
            if (c3029Jgs.A07()) {
                num = 0S2.A01;
            }
            throw AnonymousClass001.A0q("OTC State is not known");
        }
        num = 0S2.A0C;
        if (num == 0S2.A0j && c3029Jgs.A06() && (A0W = JQz.A0W(c3033Jgw.A11)) != null && (checkoutConfiguration = A0W.A01) != null) {
            z = 4YV.A1a(checkoutConfiguration.A02, true, false);
        }
        return z;
    }

    public static final boolean A0W(C3033Jgw c3033Jgw) {
        ECPPaymentRequest A0W;
        CheckoutConfiguration checkoutConfiguration;
        String str;
        boolean z = true;
        if (!A0Z(c3033Jgw) || (A0W = JQz.A0W(c3033Jgw.A11)) == null || (checkoutConfiguration = A0W.A01) == null || (str = checkoutConfiguration.A0C) == null || str.length() == 0) {
            z = false;
        }
        return z;
    }

    public static final boolean A0X(C3033Jgw c3033Jgw) {
        FJC fjc = c3033Jgw.A0Q;
        if (FJC.A0A(fjc) && (fjc.A02 instanceof LxJ)) {
            return false;
        }
        FJC fjc2 = c3033Jgw.A0N;
        if (FJC.A0A(fjc2) && (fjc2.A02 instanceof LxJ)) {
            return false;
        }
        FJC fjc3 = c3033Jgw.A0I;
        if (FJC.A0A(fjc3) && (fjc3.A02 instanceof LxJ)) {
            return false;
        }
        FJC fjc4 = c3033Jgw.A0O;
        return (FJC.A0A(fjc4) && (fjc4.A02 instanceof LxJ)) ? false : true;
    }

    public static final boolean A0Y(C3033Jgw c3033Jgw) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0W = JQz.A0W(c3033Jgw.A11);
        return (A0W == null || (checkoutConfiguration = A0W.A01) == null || !checkoutConfiguration.A0D.contains(KNL.A08)) ? false : true;
    }

    public static final boolean A0Z(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A03);
        }
        return false;
    }

    public static final boolean A0a(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A04);
        }
        return false;
    }

    public static final boolean A0b(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A05);
        }
        return false;
    }

    public static final boolean A0c(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A06);
        }
        return false;
    }

    public static final boolean A0d(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A07);
        }
        return false;
    }

    public static final boolean A0e(C3033Jgw c3033Jgw) {
        Object A0A = A0A(c3033Jgw);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
        if (checkoutConfiguration != null) {
            return checkoutConfiguration.A0E.contains(KNE.A08);
        }
        return false;
    }

    public static final boolean A0f(C3033Jgw c3033Jgw) {
        boolean z = false;
        if (L6B.A02(KOy.A0H, c3033Jgw.A0j())) {
            Object A0A = A0A(c3033Jgw);
            if (A0A == null) {
                throw 1BK.A0h();
            }
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A0A).A01;
            if (checkoutConfiguration != null && checkoutConfiguration.A0D.contains(KNL.A0D)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean A0g(C3033Jgw c3033Jgw, Object obj) {
        return c3033Jgw.A0j().contains(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (X.11T.A0O(r301.A02, r302.A02) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r301.A00 == r302.A00) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A0h(X.FJC r301, X.FJC r302) {
        /*
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L57
            r0 = r301
            if (r0 == 0) goto L5b
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L57
            r0 = r301
            X.EL6 r0 = r0.A00
            r305 = r0
            r0 = r302
            X.EL6 r0 = r0.A00
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L5e
            r0 = r301
            java.lang.Object r0 = r0.A01
            r307 = r0
            r0 = r302
            java.lang.Object r0 = r0.A01
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5e
            r0 = r301
            java.lang.Throwable r0 = r0.A02
            r307 = r0
            r0 = r302
            java.lang.Throwable r0 = r0.A02
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5e
        L57:
            r0 = 1
            r303 = r0
        L59:
            r0 = r303
            return r0
        L5b:
            r0 = 0
            r305 = r0
        L5e:
            X.EL6 r0 = X.EL6.A02
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L59
            r0 = r301
            X.EL6 r0 = r0.A00
            r307 = r0
            r0 = r302
            X.EL6 r0 = r0.A00
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto L59
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0h(X.FJC, X.FJC):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0434, code lost:
    
        if (r334 != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.MediatorLiveData A0i(androidx.fragment.app.Fragment r302, X.Rh9 r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 1595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0i(androidx.fragment.app.Fragment, X.Rh9, java.lang.String):androidx.lifecycle.MediatorLiveData");
    }

    public final List A0j() {
        List list = this.A0Y;
        if (list != null) {
            return list;
        }
        11T.A0L("componentTypeList");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x00fa, code lost:
    
        if (r309 != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0k() {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3033Jgw.A0k():void");
    }

    public final void A0l() {
        LocaleMember localeMember;
        String str;
        String A13;
        List A0L;
        L07 l07;
        C3038Jh1 c3038Jh1 = this.A1R;
        ShippingAddress A04 = A04(this);
        LZo A00 = A04 != null ? L6C.A00(A04) : null;
        if (C3038Jh1.A0E(c3038Jh1)) {
            FJC A0X = JQz.A0X(c3038Jh1.A08);
            PaymentMethod paymentMethod = null;
            if (A0X != null && (l07 = (L07) A0X.A01) != null) {
                paymentMethod = (PaymentMethod) l07.A01;
            }
            if (!(paymentMethod instanceof CreditCard) || paymentMethod == null) {
                return;
            }
            if (11T.A0O(c3038Jh1.A0I(), true) || c3038Jh1.A0H() == null) {
                if (!11T.A0O(c3038Jh1.A0I(), true) || A00 == null) {
                    return;
                }
            } else {
                if (!11T.A0O(c3038Jh1.A0H(), true)) {
                    C3038Jh1.A08(c3038Jh1);
                    return;
                }
                Object obj = c3038Jh1.A00.get(2);
                String str2 = null;
                if ((obj instanceof String) && (str = (String) obj) != null && (A13 = 4YU.A13(str)) != null && !0CU.A0O(A13) && (A0L = 0CU.A0L(A13, new char[]{' '}, 0)) != null) {
                    if (1BK.A1Y(A0L)) {
                        A0L.get(0);
                    }
                    if (A0L.size() > 1) {
                        A0L.get(1);
                    }
                }
                SparseArray sparseArray = c3038Jh1.A00;
                String A0u = JR1.A0u(sparseArray, 5);
                String A0u2 = JR1.A0u(sparseArray, 6);
                String A0u3 = JR1.A0u(sparseArray, 7);
                String A0u4 = JR1.A0u(sparseArray, 8);
                Object obj2 = sparseArray.get(10);
                String iSO3Country = (!(obj2 instanceof Country) || (localeMember = (LocaleMember) obj2) == null) ? null : localeMember.A00.getISO3Country();
                Object obj3 = c3038Jh1.A00.get(9);
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                A00 = new LZo(A0u, A0u2, A0u3, A0u4, iSO3Country, str2);
            }
            c3038Jh1.A0L(A00, paymentMethod);
        }
    }

    public final void A0m(KP0 kp0, boolean z) {
        A0D(kp0, null, this, Boolean.valueOf(z));
        if (z) {
            A0H(kp0, true);
            return;
        }
        if (this.A02 == KP0.A0X) {
            A0l();
        }
        this.A02 = null;
        A0C();
    }

    public final void A0n(ECPHandler eCPHandler) {
        if (eCPHandler == null) {
            throw AnonymousClass001.A0N("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
        }
        ECPHandler eCPHandler2 = this.A05;
        if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
            throw AnonymousClass001.A0N("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        if (!11T.A0O(this.A05, eCPHandler)) {
            throw AnonymousClass001.A0Q("transactionInfo");
        }
        this.A05 = eCPHandler;
    }

    public final void A0o(LoggingContext loggingContext, Integer num) {
        11T.A0G(num, 1, loggingContext);
        if (num == 0S2.A00) {
            7zU.A0b().A0Q(loggingContext, "pux_checkout", DKH.A0t(this.A1Q));
        }
        if (this.A05 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        MutableLiveData mutableLiveData = this.A11;
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (mutableLiveData.getValue() == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01.getValue();
        this.A1Q.A03(null, true);
        throw AnonymousClass001.A0Q("handleCancellation");
    }

    public final void A0p(boolean z) {
        KP0 kp0;
        Object obj;
        KP0 kp02;
        BaseCheckoutItem baseCheckoutItem;
        BaseCheckoutItem baseCheckoutItem2;
        BaseCheckoutItem baseCheckoutItem3;
        BaseCheckoutItem baseCheckoutItem4;
        Collection values = this.A1X.values();
        11T.A0A(values);
        Iterator it = values.iterator();
        while (true) {
            kp0 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FJC fjc = (FJC) obj;
            if (((fjc == null || (baseCheckoutItem4 = (BaseCheckoutItem) fjc.A01) == null) ? null : baseCheckoutItem4.AsX()) != KP0.A0X || !JR0.A1R(this.A1R.A08)) {
                if (((fjc == null || (baseCheckoutItem3 = (BaseCheckoutItem) fjc.A01) == null) ? null : baseCheckoutItem3.AsX()) != KP0.A0Z || !JR0.A1R(this.A1U.A06)) {
                    if (((fjc == null || (baseCheckoutItem2 = (BaseCheckoutItem) fjc.A01) == null) ? null : baseCheckoutItem2.AsX()) == KP0.A0U && JR0.A1R(this.A1K.A0A)) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        FJC fjc2 = (FJC) obj;
        if (fjc2 != null && (baseCheckoutItem = (BaseCheckoutItem) fjc2.A01) != null) {
            kp0 = baseCheckoutItem.AsX();
        }
        if (kp0 != null) {
            if (z && (kp02 = this.A02) != null) {
                A0D(kp02, kp0, this, null);
            }
            A0H(kp0, false);
            return;
        }
        KP0 kp03 = this.A02;
        if (kp03 != null) {
            if (kp03 == KP0.A0X) {
                A0l();
            }
            this.A02 = null;
            A0C();
        }
    }

    public final void A0q(boolean z, boolean z2) {
        Object obj = this.A0M.A01;
        if (obj == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        PayButtonItem payButtonItem = (PayButtonItem) obj;
        if (!payButtonItem.A03 && !z2) {
            throw AnonymousClass001.A0N("Pay button was in an incorrect processing state");
        }
        FJC A04 = FJC.A04(new PayButtonItem(payButtonItem.A00, payButtonItem.A01, payButtonItem.A02, z));
        this.A0M = A04;
        A0M(this, KOy.A0D, A04);
        if (!z) {
            A0S(this, false);
        }
        JQz.A1A(this.A1S.A03, (Object) null);
    }

    public final boolean A0r() {
        Integer num;
        ECPPaymentRequest A0W;
        CheckoutConfiguration checkoutConfiguration;
        C3029Jgs c3029Jgs = this.A1Q;
        boolean A0U = A0U();
        boolean z = false;
        boolean A07 = c3029Jgs.A07();
        if (!A0U) {
            if (A07) {
                if (c3029Jgs.A07()) {
                    num = 0S2.A0j;
                }
                throw AnonymousClass001.A0q("OTC State is not known");
            }
            num = 0S2.A0Y;
            if (num == 0S2.A01) {
                z = 4YV.A1a(checkoutConfiguration.A02, true, false);
            }
            return z;
        }
        if (A07) {
            if (c3029Jgs.A07()) {
                num = 0S2.A01;
            }
            throw AnonymousClass001.A0q("OTC State is not known");
        }
        num = 0S2.A0C;
        if (num == 0S2.A01 && c3029Jgs.A06() && (A0W = JQz.A0W(this.A11)) != null && (checkoutConfiguration = A0W.A01) != null) {
            z = 4YV.A1a(checkoutConfiguration.A02, true, false);
        }
        return z;
    }

    public final boolean A0s() {
        CreditCard creditCard;
        String AkU;
        L07 l07;
        if (!this.A0a) {
            return false;
        }
        C3038Jh1 c3038Jh1 = this.A1R;
        FJC A0X = JQz.A0X(c3038Jh1.A08);
        Parcelable parcelable = null;
        if (A0X != null && (l07 = (L07) A0X.A01) != null) {
            parcelable = (PaymentMethod) l07.A01;
        }
        if (!(parcelable instanceof CreditCard) || (creditCard = (CreditCard) parcelable) == null || !c3038Jh1.A0O(creditCard, false)) {
            return false;
        }
        if ((creditCard instanceof TokenizedCard) && ((TokenizedCard) creditCard).A01.BGM() == Qtm.A02) {
            return false;
        }
        MPh mPh = creditCard.A01;
        return mPh == null || (AkU = mPh.AkU()) == null || !7zL.A1V(AkU);
    }
}
