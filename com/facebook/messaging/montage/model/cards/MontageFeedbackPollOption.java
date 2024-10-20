package com.facebook.messaging.montage.model.cards;

import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;

/* loaded from: MontageFeedbackPollOption.class */
public final class MontageFeedbackPollOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(13);
    public ImmutableSet A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public MontageFeedbackPollOption(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public MontageFeedbackPollOption(ImmutableSet immutableSet, String str, int i, int i2, int i3) {
        this.A04 = str;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = immutableSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }
}
