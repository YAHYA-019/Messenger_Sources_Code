package com.facebook.payments.p2p.model;

import X.0Pz;
import X.0S2;
import X.1BL;
import X.C53v;
import X.EMf;
import X.ERI;
import X.FKZ;
import X.GLm;
import X.R2x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.VerifyField;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: PaymentCard.class */
public class PaymentCard implements FbPaymentCard {
    public static final Parcelable.Creator CREATOR = FKZ.A00(93);
    public final int A00;
    public final int A01;
    public final Address A02;
    public final EMf A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final ImmutableList A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public PaymentCard(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = (Address) 1BL.A0C(parcel, Address.class);
        this.A04 = parcel.readString();
        String readString = parcel.readString();
        this.A0A = readString == null ? "NONE" : readString;
        this.A0D = C53v.A0S(parcel);
        this.A03 = parcel.readSerializable();
        this.A07 = C53v.A0S(parcel);
        this.A08 = C53v.A0S(parcel);
        this.A0B = C53v.A0S(parcel);
        this.A09 = C53v.A03(parcel, VerifyField.class);
        this.A0C = C53v.A0S(parcel);
    }

    public PaymentCard(Address address, EMf eMf, ImmutableList immutableList, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3) {
        str3.getClass();
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = address;
        this.A04 = str;
        this.A0A = str2;
        this.A0D = z3;
        this.A03 = eMf == null ? EMf.A03 : eMf;
        this.A07 = false;
        this.A08 = false;
        this.A0B = z;
        this.A09 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A0C = z2;
    }

    public PaymentCard(P2pCreditCardWrapper p2pCreditCardWrapper) {
        Enum r303;
        P2pCreditCard p2pCreditCard = p2pCreditCardWrapper.mP2pCreditCard;
        this.A05 = p2pCreditCard.mCredentialId;
        this.A06 = p2pCreditCard.mLastFourDigits;
        this.A00 = p2pCreditCard.mExpirationMonth;
        this.A01 = p2pCreditCard.mExpirationYear;
        this.A02 = p2pCreditCard.mAddress;
        this.A04 = FbPaymentCardType.forValue(p2pCreditCard.mAssociation).mPaymentCardType.humanReadableName;
        this.A0A = "NONE";
        this.A0D = p2pCreditCardWrapper.mIsZipVerified;
        String str = p2pCreditCardWrapper.mMethodCategory;
        Enum[] values = EMf.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                r303 = EMf.A03;
                break;
            }
            r303 = values[i2];
            if (r303.name().equalsIgnoreCase(str)) {
                break;
            } else {
                i = i2 + 1;
            }
        }
        this.A03 = r303;
        this.A07 = p2pCreditCardWrapper.mCommercePaymentEligible;
        this.A08 = p2pCreditCardWrapper.mPersonalTransferEligible;
        this.A0B = p2pCreditCardWrapper.mIsDefaultReceiving;
        this.A09 = ImmutableList.of();
        this.A0C = false;
    }

    public boolean A00() {
        if (this instanceof PartialPaymentCard) {
            throw new IllegalAccessError("Cannot access IsDefaultReceiving for locally constructed PaymentCard");
        }
        return this.A0B;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public Country AZA() {
        return null;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String AZB() {
        return this.A02.mPostalCode;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String Abv() {
        return null;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String Af2() {
        return "CREDIT_CARD";
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public String Ai2(Resources resources) {
        return R2x.A00(this);
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public Drawable AiM(Context context) {
        return null;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String Al9() {
        String valueOf = String.valueOf(this.A00);
        if (valueOf.length() < 2) {
            valueOf = 0Pz.A0W(ConstantsKt.CAMERA_ID_FRONT, valueOf);
        }
        return valueOf;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String AlA() {
        return String.valueOf(this.A01);
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public Integer Alg() {
        if ((this instanceof PartialPaymentCard) || !this.A0A.equals("CARTE_BANACAIRE")) {
            return null;
        }
        return 0S2.A00;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public FbPaymentCardType Alh() {
        return FbPaymentCardType.forValue(this.A04);
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public String At4() {
        return this.A06;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentMethod
    public ERI BHR() {
        return ERI.A03;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public /* bridge */ /* synthetic */ GLm BHS() {
        return ERI.A03;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public ImmutableList BJ9() {
        return this.A09;
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public boolean BMx() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int parseInt = Integer.parseInt(Al9());
        int parseInt2 = Integer.parseInt(String.valueOf(this.A01));
        return i > parseInt2 || (i == parseInt2 && i2 > parseInt);
    }

    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    public boolean BWD() {
        return this.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r301.A09.contains(com.facebook.payments.paymentmethods.model.VerifyField.ZIP) != false) goto L6;
     */
    @Override // com.facebook.payments.paymentmethods.model.FbPaymentCard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BXR() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A09
            r303 = r0
            com.facebook.payments.paymentmethods.model.VerifyField r0 = com.facebook.payments.paymentmethods.model.VerifyField.ZIP
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r305
            if (r0 == 0) goto L24
        L20:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L24:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2p.model.PaymentCard.BXR():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PaymentCard paymentCard = (PaymentCard) obj;
            if (this.A05 != paymentCard.A05 || !this.A06.equals(paymentCard.A06) || this.A00 != paymentCard.A00 || this.A01 != paymentCard.A01 || !this.A02.equals(paymentCard.A02) || !this.A04.equals(paymentCard.A04) || this.A0D != paymentCard.A0D || !this.A03.equals(paymentCard.A03)) {
                return false;
            }
            boolean z = this.A07;
            if (paymentCard instanceof PartialPaymentCard) {
                throw new IllegalAccessError("Cannot access CommercePaymentEligible for locally constructed PaymentCard");
            }
            if (z != paymentCard.A07 || this.A08 != paymentCard.A08 || this.A0B != paymentCard.A00() || this.A0C != paymentCard.A0C) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.payments.paymentmethods.model.PaymentOption
    public String getId() {
        return String.valueOf(this.A05);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02, this.A04, Boolean.valueOf(this.A0D), this.A03, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Boolean.valueOf(this.A0B), this.A09, Boolean.valueOf(this.A0C)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("credential_id", this.A05);
        stringHelper.add("number", this.A06);
        stringHelper.add("expire_month", this.A00);
        stringHelper.add("expire_year", this.A01);
        stringHelper.add("address", this.A02.toString());
        stringHelper.add("association", this.A04);
        stringHelper.add("zip_verified", this.A0D);
        stringHelper.add("method_category", this.A03);
        stringHelper.add("commerce_payment_eligible", this.A07);
        stringHelper.add("personal_transfer_eligible", this.A08);
        stringHelper.add("is_default_receiving", this.A0B);
        stringHelper.add("verify_fields", this.A09.toString());
        stringHelper.add("is_soft_disabled", this.A0C);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeSerializable(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        C53v.A0C(parcel, this.A09);
        parcel.writeInt(this.A0C ? 1 : 0);
    }
}
