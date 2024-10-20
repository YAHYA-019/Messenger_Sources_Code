package com.facebook.payments.confirmation;

import X.11T;
import X.1Du;
import X.2JX;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FJ8;
import X.FKZ;
import X.RJp;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ConfirmationViewParams.class */
public final class ConfirmationViewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(26);
    public final 2JX A00;
    public final ConfirmationMessageParams A01;
    public final HeroImageParams A02;
    public final PostPurchaseAction A03;
    public final ImmutableList A04;
    public final ConfirmationMessageParams A05;

    public ConfirmationViewParams(RJp rJp) {
        this.A00 = null;
        this.A01 = rJp.A00;
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = rJp.A01;
    }

    public ConfirmationViewParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ConfirmationMessageParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ConfirmationMessageParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (HeroImageParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (PostPurchaseAction) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            PostPurchaseAction[] postPurchaseActionArr = new PostPurchaseAction[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, postPurchaseActionArr, i);
            }
            immutableList = ImmutableList.copyOf(postPurchaseActionArr);
        }
        this.A04 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ConfirmationViewParams)) {
                return false;
            }
            ConfirmationViewParams confirmationViewParams = (ConfirmationViewParams) obj;
            if (!11T.A0O(this.A00, confirmationViewParams.A00) || !11T.A0O(this.A01, confirmationViewParams.A01) || !11T.A0O(this.A05, confirmationViewParams.A05) || !11T.A0O(this.A02, confirmationViewParams.A02) || !11T.A0O(this.A03, confirmationViewParams.A03) || !11T.A0O(this.A04, confirmationViewParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A03(this.A00))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0y(parcel, this.A00);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A05, i);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A03, i);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            parcel.writeParcelable((PostPurchaseAction) A0Y.next(), i);
        }
    }
}
