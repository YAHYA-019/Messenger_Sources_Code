package com.facebook.presence.api.model;

import X.11T;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RichStatusMention.class */
public final class RichStatusMention extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(51);
    public final long A00;
    public final long A01;
    public final long A02;

    public RichStatusMention(long j, long j2, long j3) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RichStatusMention)) {
                return false;
            }
            RichStatusMention richStatusMention = (RichStatusMention) obj;
            if (this.A02 != richStatusMention.A02 || this.A01 != richStatusMention.A01 || this.A00 != richStatusMention.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(this.A01, AnonymousClass002.A01(this.A02));
        long j = this.A00;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
