package com.facebook.xapp.messaging.reactions.reactors.model;

import X.11T;
import X.82N;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Reactor.class */
public final class Reactor extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(26);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public Reactor(String str, String str2, String str3, boolean z) {
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        11T.A0F(str3, 3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Reactor)) {
                return false;
            }
            Reactor reactor = (Reactor) obj;
            if (!11T.A0O(this.A01, reactor.A01) || !11T.A0O(this.A00, reactor.A00) || !11T.A0O(this.A02, reactor.A02) || this.A03 != reactor.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
