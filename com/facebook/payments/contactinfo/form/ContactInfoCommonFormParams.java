package com.facebook.payments.contactinfo.form;

import X.1BL;
import X.AnonymousClass001;
import X.C53v;
import X.DKG;
import X.ELP;
import X.Eq5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.contactinfo.model.ContactInfo;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.form.model.PaymentsFormDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: ContactInfoCommonFormParams.class */
public final class ContactInfoCommonFormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(33);
    public final int A00;
    public final ContactInfo A01;
    public final ELP A02;
    public final PaymentsDecoratorParams A03;
    public final PaymentsFormDecoratorParams A04;
    public final PaymentsLoggingSessionData A05;
    public final PaymentItemType A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public ContactInfoCommonFormParams(Eq5 eq5) {
        ELP elp = eq5.A01;
        elp.getClass();
        this.A02 = elp;
        ContactInfo contactInfo = eq5.A00;
        this.A01 = contactInfo;
        if (contactInfo != null) {
            Preconditions.checkArgument(AnonymousClass001.A1W(contactInfo.Ae2().mContactInfoFormStyle, elp));
        }
        this.A03 = (PaymentsDecoratorParams) MoreObjects.firstNonNull(eq5.A02, PaymentsDecoratorParams.A02());
        PaymentsFormDecoratorParams paymentsFormDecoratorParams = eq5.A03;
        this.A04 = paymentsFormDecoratorParams != null ? paymentsFormDecoratorParams : new PaymentsFormDecoratorParams(false, false, false, false);
        this.A05 = eq5.A04;
        PaymentItemType paymentItemType = eq5.A05;
        paymentItemType.getClass();
        this.A06 = paymentItemType;
        this.A00 = 0;
        this.A08 = null;
        this.A09 = null;
        this.A07 = eq5.A06;
        this.A0A = false;
        this.A0B = false;
    }

    public ContactInfoCommonFormParams(Parcel parcel) {
        this.A02 = C53v.A07(parcel, ELP.class);
        this.A01 = (ContactInfo) 1BL.A0C(parcel, ContactInfo.class);
        this.A03 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A04 = (PaymentsFormDecoratorParams) 1BL.A0C(parcel, PaymentsFormDecoratorParams.class);
        this.A05 = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.A06 = DKG.A0k(parcel);
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readInt() == 0 ? null : C53v.A01(parcel);
        this.A0A = C53v.A0S(parcel);
        this.A0B = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        C53v.A0J(parcel, this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        C53v.A0M(parcel, this.A07);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
    }
}
