package com.facebook.timeline.majorlifeevent.creation.media.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DefaultContent.class */
public final class DefaultContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(80);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public DefaultContent(int i, String str, String str2, String str3) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public DefaultContent(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DefaultContent)) {
                return false;
            }
            DefaultContent defaultContent = (DefaultContent) obj;
            if (this.A00 != defaultContent.A00 || !11T.A0O(this.A01, defaultContent.A01) || !11T.A0O(this.A02, defaultContent.A02) || !11T.A0O(this.A03, defaultContent.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, this.A00 + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
