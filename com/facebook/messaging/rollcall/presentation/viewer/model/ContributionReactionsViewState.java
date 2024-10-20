package com.facebook.messaging.rollcall.presentation.viewer.model;

import X.11T;
import X.1BL;
import X.C04v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMultimap;

/* loaded from: ContributionReactionsViewState.class */
public final class ContributionReactionsViewState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(47);
    public final ImmutableMultimap A00;
    public final String A01;

    public ContributionReactionsViewState(ImmutableMultimap immutableMultimap, String str) {
        11T.A0F(immutableMultimap, 1);
        this.A00 = immutableMultimap;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContributionReactionsViewState)) {
                return false;
            }
            ContributionReactionsViewState contributionReactionsViewState = (ContributionReactionsViewState) obj;
            if (!11T.A0O(this.A00, contributionReactionsViewState.A00) || !11T.A0O(this.A01, contributionReactionsViewState.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + 1BL.A05(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A01);
    }
}
