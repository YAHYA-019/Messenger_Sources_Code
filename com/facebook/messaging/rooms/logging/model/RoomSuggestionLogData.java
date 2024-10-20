package com.facebook.messaging.rooms.logging.model;

import X.0J6;
import X.11T;
import X.C1ps;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RoomSuggestionLogData.class */
public final class RoomSuggestionLogData implements Parcelable, C1ps {
    public static final Parcelable.Creator CREATOR = CSS.A00(48);
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public RoomSuggestionLogData(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public RoomSuggestionLogData(String str) {
        this.A02 = -1;
        this.A05 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A04 = "notif_friend_create";
        this.A03 = str;
    }

    @Override // X.C1ps
    public long AsR() {
        return 0J6.A00(Long.valueOf(this.A02), this.A05);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
