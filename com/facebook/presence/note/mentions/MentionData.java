package com.facebook.presence.note.mentions;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MentionData.class */
public final class MentionData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(55);
    public final int A00;
    public final String A01;
    public final String A02;

    public MentionData(String str, String str2, int i) {
        1BL.A1F(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MentionData)) {
                return false;
            }
            MentionData mentionData = (MentionData) obj;
            if (!11T.A0O(this.A02, mentionData.A02) || !11T.A0O(this.A01, mentionData.A01) || this.A00 != mentionData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
