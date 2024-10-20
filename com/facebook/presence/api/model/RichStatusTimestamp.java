package com.facebook.presence.api.model;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RichStatusTimestamp.class */
public final class RichStatusTimestamp implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(52);
    public final long A00;
    public final Integer A01;

    public RichStatusTimestamp(Integer num, long j) {
        11T.A0F(num, 2);
        this.A00 = j;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        switch (this.A01.intValue()) {
            case 0:
                str = "RELATIVE";
                break;
            case 1:
                str = "ABSOLUTE";
                break;
            default:
                str = "ABSOLUTE_OF_DAY";
                break;
        }
        parcel.writeString(str);
    }
}
