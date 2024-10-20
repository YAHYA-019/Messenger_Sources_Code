package com.facebook.messaging.model.messages;

import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;

/* loaded from: Publicity.class */
public final class Publicity implements Parcelable {
    public static final Publicity A01;
    public static final Publicity A02;
    public static final Publicity A03;
    public static final ImmutableSet A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    static {
        Publicity publicity = new Publicity("unknown");
        A03 = publicity;
        Publicity publicity2 = new Publicity("local only");
        A02 = publicity2;
        Publicity publicity3 = new Publicity("from server");
        A01 = publicity3;
        A04 = ImmutableSet.A03(publicity, publicity2, publicity3);
        CREATOR = new 82M(46);
    }

    public Publicity(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public Publicity(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((Publicity) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
