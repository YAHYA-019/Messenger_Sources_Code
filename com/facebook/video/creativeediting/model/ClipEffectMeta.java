package com.facebook.video.creativeediting.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ClipEffectMeta.class */
public final class ClipEffectMeta implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(0);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ClipEffectMeta(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    public ClipEffectMeta(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ClipEffectMeta)) {
                return false;
            }
            ClipEffectMeta clipEffectMeta = (ClipEffectMeta) obj;
            if (!11T.A0O(this.A00, clipEffectMeta.A00) || !11T.A0O(this.A01, clipEffectMeta.A01) || !11T.A0O(this.A02, clipEffectMeta.A02) || !11T.A0O(this.A03, clipEffectMeta.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
