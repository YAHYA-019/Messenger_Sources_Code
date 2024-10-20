package com.facebook.payments.p2p.service.model.cards;

import X.1BL;
import X.AbN;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.PaymentCard;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchPaymentCardsResult.class */
public final class FetchPaymentCardsResult implements Parcelable {
    public static final FetchPaymentCardsResult A02 = new FetchPaymentCardsResult(null, ImmutableList.of());
    public static final Parcelable.Creator CREATOR = FKd.A00(9);
    public final PaymentCard A00;
    public final ImmutableList A01;

    public FetchPaymentCardsResult(Parcel parcel) {
        this.A00 = (PaymentCard) 1BL.A0C(parcel, PaymentCard.class);
        this.A01 = AbN.A0e(parcel, PaymentCard.class);
    }

    public FetchPaymentCardsResult(PaymentCard paymentCard, List list) {
        this.A00 = paymentCard;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A01);
    }
}
