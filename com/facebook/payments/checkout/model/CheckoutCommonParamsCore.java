package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.EMD;
import X.FKZ;
import X.GKf;
import X.Qpg;
import X.Qun;
import X.Ret;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.configuration.model.CheckoutEntity;
import com.facebook.payments.checkout.configuration.model.CheckoutInfoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.CheckoutItem;
import com.facebook.payments.checkout.configuration.model.CheckoutOptionsPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CouponCodeCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.FreeTrialCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.MemoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.NotesCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.PriceAmountInputCheckoutPurchaseInfoExtension;
import com.facebook.payments.contactinfo.model.EmailInfoCheckoutParams;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.countdowntimer.model.PaymentsCountdownTimerParams;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CheckoutCommonParamsCore.class */
public final class CheckoutCommonParamsCore implements GKf, Parcelable {
    public static volatile Qun A0o;
    public static volatile PaymentsPriceTableParams A0p;
    public static volatile TermsAndPoliciesParams A0q;
    public static volatile PaymentsDecoratorParams A0r;
    public static volatile ImmutableList A0s;
    public static volatile ImmutableList A0t;
    public static volatile Integer A0u;
    public static final Parcelable.Creator CREATOR = FKZ.A00(4);
    public final Intent A00;
    public final Intent A01;
    public final Intent A02;
    public final CheckoutConfigPrice A03;
    public final CheckoutEntity A04;
    public final CheckoutInfoCheckoutPurchaseInfoExtension A05;
    public final CheckoutInformation A06;
    public final CouponCodeCheckoutPurchaseInfoExtension A07;
    public final FreeTrialCheckoutPurchaseInfoExtension A08;
    public final MemoCheckoutPurchaseInfoExtension A09;
    public final NotesCheckoutPurchaseInfoExtension A0A;
    public final Qun A0B;
    public final PriceAmountInputCheckoutPurchaseInfoExtension A0C;
    public final CheckoutAnalyticsParams A0D;
    public final CheckoutEntryPointType A0E;
    public final EMD A0F;
    public final PaymentsPriceTableParams A0G;
    public final PaymentsPrivacyData A0H;
    public final SelectedPaymentMethodInput A0I;
    public final TermsAndPoliciesParams A0J;
    public final EmailInfoCheckoutParams A0K;
    public final PaymentsDecoratorParams A0L;
    public final PaymentItemType A0M;
    public final PaymentsCountdownTimerParams A0N;
    public final ImmutableList A0O;
    public final ImmutableList A0P;
    public final ImmutableList A0Q;
    public final ImmutableList A0R;
    public final ImmutableList A0S;
    public final Integer A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final Set A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    public CheckoutCommonParamsCore(Ret ret) {
        this.A0b = ret.A0b;
        this.A00 = ret.A00;
        CheckoutAnalyticsParams checkoutAnalyticsParams = ret.A0D;
        C1pq.A08("checkoutAnalyticsParams", checkoutAnalyticsParams);
        this.A0D = checkoutAnalyticsParams;
        this.A0O = ret.A0O;
        this.A04 = ret.A04;
        this.A05 = ret.A05;
        this.A06 = ret.A06;
        this.A0P = ret.A0P;
        this.A0Q = ret.A0Q;
        this.A0R = ret.A0R;
        EMD emd = ret.A0F;
        C1pq.A08("checkoutStyle", emd);
        this.A0F = emd;
        this.A03 = ret.A03;
        this.A07 = ret.A07;
        this.A01 = ret.A01;
        this.A0U = ret.A0U;
        this.A0K = ret.A0K;
        this.A0E = ret.A0E;
        this.A08 = ret.A08;
        this.A0c = ret.A0c;
        this.A0d = ret.A0d;
        this.A09 = ret.A09;
        this.A0V = ret.A0V;
        this.A0A = ret.A0A;
        this.A0W = ret.A0W;
        this.A0B = ret.A0B;
        this.A0X = ret.A0X;
        PaymentItemType paymentItemType = ret.A0M;
        C1pq.A08("paymentItemType", paymentItemType);
        this.A0M = paymentItemType;
        this.A0Y = ret.A0Y;
        this.A0N = ret.A0N;
        this.A0L = ret.A0L;
        this.A0G = ret.A0G;
        this.A0H = ret.A0H;
        this.A0C = ret.A0C;
        this.A0S = ret.A0S;
        this.A0Z = ret.A0Z;
        this.A0I = ret.A0I;
        this.A0e = ret.A0e;
        this.A0f = ret.A0f;
        this.A0g = ret.A0g;
        this.A0h = ret.A0h;
        this.A0i = ret.A0i;
        this.A0j = ret.A0j;
        this.A0k = ret.A0k;
        this.A0l = ret.A0l;
        this.A02 = ret.A02;
        this.A0J = ret.A0J;
        this.A0T = ret.A0T;
        this.A0m = ret.A0m;
        this.A0n = ret.A0n;
        this.A0a = Collections.unmodifiableSet(ret.A0a);
    }

    public CheckoutCommonParamsCore(Intent intent, Intent intent2, Intent intent3, Qun qun, CheckoutAnalyticsParams checkoutAnalyticsParams, CheckoutEntryPointType checkoutEntryPointType, EMD emd, PaymentsPriceTableParams paymentsPriceTableParams, SelectedPaymentMethodInput selectedPaymentMethodInput, PaymentsDecoratorParams paymentsDecoratorParams, PaymentItemType paymentItemType, PaymentsCountdownTimerParams paymentsCountdownTimerParams, ImmutableList immutableList, Integer num, String str, String str2, String str3, Set set, boolean z, boolean z2) {
        this.A0b = true;
        this.A00 = intent;
        this.A0D = checkoutAnalyticsParams;
        this.A0O = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        this.A0P = null;
        this.A0Q = null;
        this.A0R = null;
        C1pq.A08("checkoutStyle", emd);
        this.A0F = emd;
        this.A03 = null;
        this.A07 = null;
        this.A01 = intent2;
        this.A0U = null;
        this.A0K = null;
        this.A0E = checkoutEntryPointType;
        this.A08 = null;
        this.A0c = true;
        this.A0d = false;
        this.A09 = null;
        this.A0V = null;
        this.A0A = null;
        this.A0W = str;
        this.A0B = qun;
        this.A0X = null;
        C1pq.A08("paymentItemType", paymentItemType);
        this.A0M = paymentItemType;
        this.A0Y = str2;
        this.A0N = paymentsCountdownTimerParams;
        this.A0L = paymentsDecoratorParams;
        this.A0G = paymentsPriceTableParams;
        this.A0H = null;
        this.A0C = null;
        this.A0S = immutableList;
        this.A0Z = str3;
        this.A0I = selectedPaymentMethodInput;
        this.A0e = z;
        this.A0f = false;
        this.A0g = false;
        this.A0h = false;
        this.A0i = true;
        this.A0j = z2;
        this.A0k = false;
        this.A0l = false;
        this.A02 = intent3;
        this.A0J = null;
        this.A0T = num;
        this.A0m = false;
        this.A0n = false;
        this.A0a = Collections.unmodifiableSet(set);
    }

    public CheckoutCommonParamsCore(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A0b = AnonymousClass001.A1Q(parcel.readInt(), 1);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Intent) parcel.readParcelable(A0e);
        }
        this.A0D = (CheckoutAnalyticsParams) parcel.readParcelable(A0e);
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            int readInt = parcel.readInt();
            CheckoutConfigPrice[] checkoutConfigPriceArr = new CheckoutConfigPrice[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = DKG.A02(parcel, CheckoutConfigPrice.CREATOR, checkoutConfigPriceArr, i2);
            }
            this.A0O = ImmutableList.copyOf(checkoutConfigPriceArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (CheckoutEntity) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (CheckoutInformation) CheckoutInformation.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            int readInt2 = parcel.readInt();
            CheckoutItem[] checkoutItemArr = new CheckoutItem[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = DKG.A02(parcel, CheckoutItem.CREATOR, checkoutItemArr, i3);
            }
            this.A0P = ImmutableList.copyOf(checkoutItemArr);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            int readInt3 = parcel.readInt();
            CheckoutOptionsPurchaseInfoExtension[] checkoutOptionsPurchaseInfoExtensionArr = new CheckoutOptionsPurchaseInfoExtension[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = DKG.A02(parcel, CheckoutOptionsPurchaseInfoExtension.CREATOR, checkoutOptionsPurchaseInfoExtensionArr, i4);
            }
            this.A0Q = ImmutableList.copyOf(checkoutOptionsPurchaseInfoExtensionArr);
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            int readInt4 = parcel.readInt();
            Qpg[] qpgArr = new Qpg[readInt4];
            for (int i5 = 0; i5 < readInt4; i5++) {
                qpgArr[i5] = Qpg.values()[parcel.readInt()];
            }
            this.A0R = ImmutableList.copyOf(qpgArr);
        }
        this.A0F = EMD.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (CheckoutConfigPrice) CheckoutConfigPrice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Intent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (EmailInfoCheckoutParams) EmailInfoCheckoutParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = CheckoutEntryPointType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readParcelable(A0e);
        }
        this.A0c = 1BM.A07(parcel);
        this.A0d = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = Qun.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = parcel.readString();
        }
        this.A0M = DKG.A0l(parcel);
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (PaymentsCountdownTimerParams) PaymentsCountdownTimerParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (PaymentsDecoratorParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (PaymentsPriceTableParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = (PaymentsPrivacyData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            int readInt5 = parcel.readInt();
            CheckoutProduct[] checkoutProductArr = new CheckoutProduct[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbI.A01(parcel, A0e, checkoutProductArr, i6);
            }
            this.A0S = ImmutableList.copyOf(checkoutProductArr);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = (SelectedPaymentMethodInput) parcel.readParcelable(A0e);
        }
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = 1BM.A07(parcel);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A0l = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Intent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (TermsAndPoliciesParams) parcel.readParcelable(A0e);
        }
        this.A0T = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        this.A0m = 1BM.A07(parcel);
        this.A0n = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt6 = parcel.readInt();
        while (i < readInt6) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0a = Collections.unmodifiableSet(A0v);
    }

    @Override // X.GKf
    public boolean A80() {
        return this.A0b;
    }

    @Override // X.GKf
    public Intent AbV() {
        return this.A00;
    }

    @Override // X.GKf
    public CheckoutAnalyticsParams Ac8() {
        return this.A0D;
    }

    @Override // X.GKf
    public ImmutableList AcA() {
        return this.A0O;
    }

    @Override // X.GKf
    public CheckoutEntity AcB() {
        return this.A04;
    }

    @Override // X.GKf
    public CheckoutInfoCheckoutPurchaseInfoExtension AcC() {
        return this.A05;
    }

    @Override // X.GKf
    public CheckoutInformation AcD() {
        return this.A06;
    }

    @Override // X.GKf
    public ImmutableList AcE() {
        return this.A0P;
    }

    @Override // X.GKf
    public ImmutableList AcF() {
        if (this.A0a.contains("checkoutOptionsPurchaseInfoExtensions")) {
            return this.A0Q;
        }
        if (A0s == null) {
            synchronized (this) {
                if (A0s == null) {
                    A0s = ImmutableList.of();
                }
            }
        }
        return A0s;
    }

    @Override // X.GKf
    public ImmutableList AcH() {
        if (this.A0a.contains("checkoutRowOrderGuideline")) {
            return this.A0R;
        }
        if (A0t == null) {
            synchronized (this) {
                if (A0t == null) {
                    A0t = ImmutableList.of();
                }
            }
        }
        return A0t;
    }

    @Override // X.GKf
    public EMD AcK() {
        return this.A0F;
    }

    @Override // X.GKf
    public CheckoutConfigPrice AcL() {
        return this.A03;
    }

    @Override // X.GKf
    public CouponCodeCheckoutPurchaseInfoExtension Aeo() {
        return this.A07;
    }

    @Override // X.GKf
    public Intent Ahc() {
        return this.A01;
    }

    @Override // X.GKf
    public String Ahm() {
        return this.A0U;
    }

    @Override // X.GKf
    public EmailInfoCheckoutParams AjJ() {
        return this.A0K;
    }

    @Override // X.GKf
    public CheckoutEntryPointType Ak8() {
        return this.A0E;
    }

    @Override // X.GKf
    public FreeTrialCheckoutPurchaseInfoExtension Ana() {
        return this.A08;
    }

    @Override // X.GKf
    public MemoCheckoutPurchaseInfoExtension AwV() {
        return this.A09;
    }

    @Override // X.GKf
    public String Awj() {
        return this.A0V;
    }

    @Override // X.GKf
    public NotesCheckoutPurchaseInfoExtension AzW() {
        return this.A0A;
    }

    @Override // X.GKf
    public String B0V() {
        return this.A0W;
    }

    @Override // X.GKf
    public Qun B0W() {
        if (this.A0a.contains("orderStatusModel")) {
            return this.A0B;
        }
        if (A0o == null) {
            synchronized (this) {
                if (A0o == null) {
                    A0o = Qun.A01;
                }
            }
        }
        return A0o;
    }

    @Override // X.GKf
    public String B1o() {
        return this.A0X;
    }

    @Override // X.GKf
    public PaymentItemType B1z() {
        return this.A0M;
    }

    @Override // X.GKf
    public String B21() {
        return this.A0Y;
    }

    @Override // X.GKf
    public PaymentsCountdownTimerParams B27() {
        return this.A0N;
    }

    @Override // X.GKf
    public PaymentsDecoratorParams B28() {
        if (this.A0a.contains("paymentsDecoratorParams")) {
            return this.A0L;
        }
        if (A0r == null) {
            synchronized (this) {
                if (A0r == null) {
                    A0r = PaymentsDecoratorParams.A00();
                }
            }
        }
        return A0r;
    }

    @Override // X.GKf
    public PaymentsPriceTableParams B2J() {
        if (this.A0a.contains("paymentsPriceTableParams")) {
            return this.A0G;
        }
        if (A0p == null) {
            synchronized (this) {
                if (A0p == null) {
                    A0p = new PaymentsPriceTableParams(false, true, false);
                }
            }
        }
        return A0p;
    }

    @Override // X.GKf
    public PaymentsPrivacyData B2K() {
        return this.A0H;
    }

    @Override // X.GKf
    public PriceAmountInputCheckoutPurchaseInfoExtension B4b() {
        return this.A0C;
    }

    @Override // X.GKf
    public ImmutableList B50() {
        return this.A0S;
    }

    @Override // X.GKf
    public String B6N() {
        return this.A0Z;
    }

    @Override // X.GKf
    public SelectedPaymentMethodInput B9k() {
        return this.A0I;
    }

    @Override // X.GKf
    public Intent BDX() {
        return this.A02;
    }

    @Override // X.GKf
    public TermsAndPoliciesParams BEh() {
        if (this.A0a.contains("termsAndPoliciesParams")) {
            return this.A0J;
        }
        if (A0q == null) {
            synchronized (this) {
                if (A0q == null) {
                    A0q = TermsAndPoliciesParams.A05;
                }
            }
        }
        return A0q;
    }

    @Override // X.GKf
    public int BG0() {
        Integer num;
        if (this.A0a.contains("title")) {
            num = this.A0T;
        } else {
            if (A0u == null) {
                synchronized (this) {
                    if (A0u == null) {
                        A0u = 2131963138;
                    }
                }
            }
            num = A0u;
        }
        return num.intValue();
    }

    @Override // X.GKf
    public boolean BR9() {
        return this.A0c;
    }

    @Override // X.GKf
    public boolean BSx() {
        return this.A0d;
    }

    @Override // X.GKf
    public boolean CxJ() {
        return this.A0e;
    }

    @Override // X.GKf
    public boolean Cxd() {
        return this.A0f;
    }

    @Override // X.GKf
    public boolean Cxm() {
        return this.A0g;
    }

    @Override // X.GKf
    public boolean Cxw() {
        return this.A0h;
    }

    @Override // X.GKf
    public boolean CyS() {
        return this.A0i;
    }

    @Override // X.GKf
    public boolean CyV() {
        return this.A0j;
    }

    @Override // X.GKf
    public boolean Cyb() {
        return this.A0k;
    }

    @Override // X.GKf
    public boolean Cyo() {
        return this.A0l;
    }

    @Override // X.GKf
    public boolean D8c() {
        return this.A0m;
    }

    @Override // X.GKf
    public boolean D8k() {
        return this.A0n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutCommonParamsCore)) {
                return false;
            }
            CheckoutCommonParamsCore checkoutCommonParamsCore = (CheckoutCommonParamsCore) obj;
            if (this.A0b != checkoutCommonParamsCore.A0b || !11T.A0O(this.A00, checkoutCommonParamsCore.A00) || !11T.A0O(this.A0D, checkoutCommonParamsCore.A0D) || !11T.A0O(this.A0O, checkoutCommonParamsCore.A0O) || !11T.A0O(this.A04, checkoutCommonParamsCore.A04) || !11T.A0O(this.A05, checkoutCommonParamsCore.A05) || !11T.A0O(this.A06, checkoutCommonParamsCore.A06) || !11T.A0O(this.A0P, checkoutCommonParamsCore.A0P) || !11T.A0O(AcF(), checkoutCommonParamsCore.AcF()) || !11T.A0O(AcH(), checkoutCommonParamsCore.AcH()) || this.A0F != checkoutCommonParamsCore.A0F || !11T.A0O(this.A03, checkoutCommonParamsCore.A03) || !11T.A0O(this.A07, checkoutCommonParamsCore.A07) || !11T.A0O(this.A01, checkoutCommonParamsCore.A01) || !11T.A0O(this.A0U, checkoutCommonParamsCore.A0U) || !11T.A0O(this.A0K, checkoutCommonParamsCore.A0K) || this.A0E != checkoutCommonParamsCore.A0E || !11T.A0O(this.A08, checkoutCommonParamsCore.A08) || this.A0c != checkoutCommonParamsCore.A0c || this.A0d != checkoutCommonParamsCore.A0d || !11T.A0O(this.A09, checkoutCommonParamsCore.A09) || !11T.A0O(this.A0V, checkoutCommonParamsCore.A0V) || !11T.A0O(this.A0A, checkoutCommonParamsCore.A0A) || !11T.A0O(this.A0W, checkoutCommonParamsCore.A0W) || B0W() != checkoutCommonParamsCore.B0W() || !11T.A0O(this.A0X, checkoutCommonParamsCore.A0X) || this.A0M != checkoutCommonParamsCore.A0M || !11T.A0O(this.A0Y, checkoutCommonParamsCore.A0Y) || !11T.A0O(this.A0N, checkoutCommonParamsCore.A0N) || !11T.A0O(B28(), checkoutCommonParamsCore.B28()) || !11T.A0O(B2J(), checkoutCommonParamsCore.B2J()) || !11T.A0O(this.A0H, checkoutCommonParamsCore.A0H) || !11T.A0O(this.A0C, checkoutCommonParamsCore.A0C) || !11T.A0O(this.A0S, checkoutCommonParamsCore.A0S) || !11T.A0O(this.A0Z, checkoutCommonParamsCore.A0Z) || !11T.A0O(this.A0I, checkoutCommonParamsCore.A0I) || this.A0e != checkoutCommonParamsCore.A0e || this.A0f != checkoutCommonParamsCore.A0f || this.A0g != checkoutCommonParamsCore.A0g || this.A0h != checkoutCommonParamsCore.A0h || this.A0i != checkoutCommonParamsCore.A0i || this.A0j != checkoutCommonParamsCore.A0j || this.A0k != checkoutCommonParamsCore.A0k || this.A0l != checkoutCommonParamsCore.A0l || !11T.A0O(this.A02, checkoutCommonParamsCore.A02) || !11T.A0O(BEh(), checkoutCommonParamsCore.BEh()) || BG0() != checkoutCommonParamsCore.BG0() || this.A0m != checkoutCommonParamsCore.A0m || this.A0n != checkoutCommonParamsCore.A0n) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(AcH(), C1pq.A04(AcF(), C1pq.A04(this.A0P, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A0O, C1pq.A04(this.A0D, C1pq.A04(this.A00, C1pq.A05(this.A0b))))))))));
        int A042 = C1pq.A04(this.A0K, C1pq.A04(this.A0U, C1pq.A04(this.A01, C1pq.A04(this.A07, C1pq.A04(this.A03, (A04 * 31) + C3o5.A03(this.A0F))))));
        int A043 = C1pq.A04(this.A0W, C1pq.A04(this.A0A, C1pq.A04(this.A0V, C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A04(this.A08, (A042 * 31) + C3o5.A03(this.A0E)), this.A0c), this.A0d)))));
        int A044 = C1pq.A04(this.A0X, (A043 * 31) + C3o5.A03(B0W()));
        return C1pq.A02(C1pq.A02((C1pq.A04(BEh(), C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A04(this.A0Z, C1pq.A04(this.A0S, C1pq.A04(this.A0C, C1pq.A04(this.A0H, C1pq.A04(B2J(), C1pq.A04(B28(), C1pq.A04(this.A0N, C1pq.A04(this.A0Y, (A044 * 31) + DKF.A04(this.A0M)))))))))), this.A0e), this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A0l))) * 31) + BG0(), this.A0m), this.A0n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0b ? 1 : 0);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeParcelable(this.A0D, i);
        ImmutableList immutableList = this.A0O;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((CheckoutConfigPrice) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        CheckoutInformation checkoutInformation = this.A06;
        if (checkoutInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutInformation.writeToParcel(parcel, i);
        }
        ImmutableList immutableList2 = this.A0P;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                ((CheckoutItem) A0Y2.next()).writeToParcel(parcel, i);
            }
        }
        ImmutableList immutableList3 = this.A0Q;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                ((CheckoutOptionsPurchaseInfoExtension) A0Y3.next()).writeToParcel(parcel, i);
            }
        }
        ImmutableList immutableList4 = this.A0R;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                7zN.A0z(parcel, (Qpg) A0Y4.next());
            }
        }
        7zN.A0z(parcel, this.A0F);
        CheckoutConfigPrice checkoutConfigPrice = this.A03;
        if (checkoutConfigPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutConfigPrice.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A01, i);
        1BL.A13(parcel, this.A0U);
        EmailInfoCheckoutParams emailInfoCheckoutParams = this.A0K;
        if (emailInfoCheckoutParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            emailInfoCheckoutParams.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A0E);
        C3o5.A0d(parcel, this.A08, i);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        C3o5.A0d(parcel, this.A09, i);
        1BL.A13(parcel, this.A0V);
        C3o5.A0d(parcel, this.A0A, i);
        1BL.A13(parcel, this.A0W);
        C3o5.A0e(parcel, this.A0B);
        1BL.A13(parcel, this.A0X);
        7zN.A0z(parcel, this.A0M);
        1BL.A13(parcel, this.A0Y);
        PaymentsCountdownTimerParams paymentsCountdownTimerParams = this.A0N;
        if (paymentsCountdownTimerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentsCountdownTimerParams.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A0L, i);
        C3o5.A0d(parcel, this.A0G, i);
        C3o5.A0d(parcel, this.A0H, i);
        C3o5.A0d(parcel, this.A0C, i);
        ImmutableList immutableList5 = this.A0S;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y5 = AbL.A0Y(parcel, immutableList5);
            while (A0Y5.hasNext()) {
                parcel.writeParcelable((CheckoutProduct) A0Y5.next(), i);
            }
        }
        1BL.A13(parcel, this.A0Z);
        C3o5.A0d(parcel, this.A0I, i);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0l ? 1 : 0);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A0J, i);
        C3o5.A0f(parcel, this.A0T);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A0a);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
