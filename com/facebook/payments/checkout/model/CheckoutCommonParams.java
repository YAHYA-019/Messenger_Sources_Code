package com.facebook.payments.checkout.model;

import X.1BK;
import X.1BL;
import X.1qE;
import X.24X;
import X.2DM;
import X.4YV;
import X.C53v;
import X.D3Q;
import X.DKC;
import X.DKH;
import X.EMD;
import X.FKZ;
import X.GKf;
import X.Qpa;
import X.Qun;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.configuration.model.CheckoutConfigPrice;
import com.facebook.payments.checkout.configuration.model.CheckoutEntity;
import com.facebook.payments.checkout.configuration.model.CheckoutInfoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.CheckoutOptionsPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CouponCodeCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.FreeTrialCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.MemoCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.NotesCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.PriceAmountInputCheckoutPurchaseInfoExtension;
import com.facebook.payments.contactinfo.model.ContactInfoType;
import com.facebook.payments.contactinfo.model.EmailInfoCheckoutParams;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.countdowntimer.model.PaymentsCountdownTimerParams;
import com.google.common.base.Absent;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Currency;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: CheckoutCommonParams.class */
public final class CheckoutCommonParams implements GKf, Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(3);
    public final Parcelable A00;
    public final Parcelable A01;
    public final CheckoutCommonParamsCore A02;
    public final 2DM A03;
    public final ImmutableSet A04;
    public final ImmutableSet A05;
    public final Currency A06;
    public final JSONObject A07;
    public final JSONObject A08;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f7, code lost:
    
        if (r0.AcF().isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
    
        if (r0.A0A != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x014b, code lost:
    
        if (r0.A09 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0175, code lost:
    
        if (r0.A0C != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01a8, code lost:
    
        if (r0.A07 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b2, code lost:
    
        if (r301.A04.isEmpty() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CheckoutCommonParams(X.FEn r302) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.checkout.model.CheckoutCommonParams.<init>(X.FEn):void");
    }

    public CheckoutCommonParams(Parcel parcel) {
        24X r303;
        this.A05 = C53v.A06(parcel, Qpa.class.getClassLoader());
        this.A06 = (Currency) parcel.readSerializable();
        JSONObject jSONObject = null;
        try {
            String readString = parcel.readString();
            if (readString != null) {
                jSONObject = DKC.A1F(readString);
            }
        } catch (JSONException unused) {
        }
        this.A07 = jSONObject;
        JSONObject jSONObject2 = null;
        try {
            String readString2 = parcel.readString();
            if (readString2 != null) {
                jSONObject2 = DKC.A1F(readString2);
            }
        } catch (JSONException unused2) {
        }
        this.A08 = jSONObject2;
        this.A04 = C53v.A06(parcel, ContactInfoType.class.getClassLoader());
        try {
            r303 = DKH.A0c(parcel);
        } catch (Exception unused3) {
            r303 = null;
        }
        this.A03 = (2DM) r303;
        Class<?> cls = getClass();
        this.A00 = 1BL.A0C(parcel, cls);
        this.A02 = (CheckoutCommonParamsCore) 1BL.A0C(parcel, CheckoutCommonParamsCore.class);
        this.A01 = 1BL.A0C(parcel, cls);
    }

    public CheckoutOptionsPurchaseInfoExtension A00(String str) {
        1qE A03 = 1qE.A00(this.A02.AcF()).A03(new D3Q(str, this, 3));
        Iterator it = ((Iterable) A03.A00.or(A03)).iterator();
        return (CheckoutOptionsPurchaseInfoExtension) (it.hasNext() ? 1BK.A0a(it.next()) : Absent.INSTANCE).get();
    }

    @Override // X.GKf
    public boolean A80() {
        return this.A02.A0b;
    }

    @Override // X.GKf
    public Intent AbV() {
        return this.A02.A00;
    }

    @Override // X.GKf
    public CheckoutAnalyticsParams Ac8() {
        return this.A02.A0D;
    }

    @Override // X.GKf
    public ImmutableList AcA() {
        return this.A02.A0O;
    }

    @Override // X.GKf
    public CheckoutEntity AcB() {
        return this.A02.A04;
    }

    @Override // X.GKf
    public CheckoutInfoCheckoutPurchaseInfoExtension AcC() {
        return this.A02.A05;
    }

    @Override // X.GKf
    public CheckoutInformation AcD() {
        return this.A02.A06;
    }

    @Override // X.GKf
    public ImmutableList AcE() {
        return this.A02.A0P;
    }

    @Override // X.GKf
    public ImmutableList AcF() {
        return this.A02.AcF();
    }

    @Override // X.GKf
    public ImmutableList AcH() {
        return this.A02.AcH();
    }

    @Override // X.GKf
    public EMD AcK() {
        return this.A02.A0F;
    }

    @Override // X.GKf
    public CheckoutConfigPrice AcL() {
        return this.A02.A03;
    }

    @Override // X.GKf
    public CouponCodeCheckoutPurchaseInfoExtension Aeo() {
        return this.A02.A07;
    }

    @Override // X.GKf
    public Intent Ahc() {
        return this.A02.A01;
    }

    @Override // X.GKf
    public String Ahm() {
        return this.A02.A0U;
    }

    @Override // X.GKf
    public EmailInfoCheckoutParams AjJ() {
        return this.A02.A0K;
    }

    @Override // X.GKf
    public CheckoutEntryPointType Ak8() {
        return this.A02.A0E;
    }

    @Override // X.GKf
    public FreeTrialCheckoutPurchaseInfoExtension Ana() {
        return this.A02.A08;
    }

    @Override // X.GKf
    public MemoCheckoutPurchaseInfoExtension AwV() {
        return this.A02.A09;
    }

    @Override // X.GKf
    public String Awj() {
        return this.A02.A0V;
    }

    @Override // X.GKf
    public NotesCheckoutPurchaseInfoExtension AzW() {
        return this.A02.A0A;
    }

    @Override // X.GKf
    public String B0V() {
        return this.A02.A0W;
    }

    @Override // X.GKf
    public Qun B0W() {
        return this.A02.B0W();
    }

    @Override // X.GKf
    public String B1o() {
        return this.A02.A0X;
    }

    @Override // X.GKf
    public PaymentItemType B1z() {
        return this.A02.A0M;
    }

    @Override // X.GKf
    public String B21() {
        return this.A02.A0Y;
    }

    @Override // X.GKf
    public PaymentsCountdownTimerParams B27() {
        return this.A02.A0N;
    }

    @Override // X.GKf
    public PaymentsDecoratorParams B28() {
        return this.A02.B28();
    }

    @Override // X.GKf
    public PaymentsPriceTableParams B2J() {
        return this.A02.B2J();
    }

    @Override // X.GKf
    public PaymentsPrivacyData B2K() {
        return this.A02.A0H;
    }

    @Override // X.GKf
    public PriceAmountInputCheckoutPurchaseInfoExtension B4b() {
        return this.A02.A0C;
    }

    @Override // X.GKf
    public ImmutableList B50() {
        return this.A02.A0S;
    }

    @Override // X.GKf
    public String B6N() {
        return this.A02.A0Z;
    }

    @Override // X.GKf
    public SelectedPaymentMethodInput B9k() {
        return this.A02.A0I;
    }

    @Override // X.GKf
    public Intent BDX() {
        return this.A02.A02;
    }

    @Override // X.GKf
    public TermsAndPoliciesParams BEh() {
        return this.A02.BEh();
    }

    @Override // X.GKf
    public int BG0() {
        return this.A02.BG0();
    }

    @Override // X.GKf
    public boolean BR9() {
        return this.A02.A0c;
    }

    @Override // X.GKf
    public boolean BSx() {
        return this.A02.A0d;
    }

    @Override // X.GKf
    public boolean CxJ() {
        return this.A02.A0e;
    }

    @Override // X.GKf
    public boolean Cxd() {
        return this.A02.A0f;
    }

    @Override // X.GKf
    public boolean Cxm() {
        return this.A02.A0g;
    }

    @Override // X.GKf
    public boolean Cxw() {
        return this.A02.A0h;
    }

    @Override // X.GKf
    public boolean CyS() {
        return this.A02.A0i;
    }

    @Override // X.GKf
    public boolean CyV() {
        return this.A02.A0j;
    }

    @Override // X.GKf
    public boolean Cyb() {
        return this.A02.A0k;
    }

    @Override // X.GKf
    public boolean Cyo() {
        return this.A02.A0l;
    }

    @Override // X.GKf
    public boolean D8c() {
        return this.A02.A0m;
    }

    @Override // X.GKf
    public boolean D8k() {
        return this.A02.A0n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0R(parcel, this.A05);
        parcel.writeSerializable(this.A06);
        parcel.writeString(4YV.A0u(this.A07));
        parcel.writeString(4YV.A0u(this.A08));
        C53v.A0R(parcel, this.A04);
        C53v.A0A(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }
}
