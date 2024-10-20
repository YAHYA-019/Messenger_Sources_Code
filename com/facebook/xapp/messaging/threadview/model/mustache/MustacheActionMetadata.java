package com.facebook.xapp.messaging.threadview.model.mustache;

import X.0Pz;
import X.11T;
import X.5PP;
import X.82N;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MustacheActionMetadata.class */
public final class MustacheActionMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(34);
    public final String A00;
    public final String A01;
    public final Integer A02;

    public MustacheActionMetadata(String str, Integer num, String str2) {
        11T.A0F(str, 1);
        11T.A0F(num, 3);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = num;
    }

    public static String A00(Integer num) {
        return 1 - num.intValue() != 0 ? "NONE" : "XMA_WEB_URL";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MustacheActionMetadata)) {
                return false;
            }
            MustacheActionMetadata mustacheActionMetadata = (MustacheActionMetadata) obj;
            if (!11T.A0O(this.A01, mustacheActionMetadata.A01) || !11T.A0O(this.A00, mustacheActionMetadata.A00) || this.A02 != mustacheActionMetadata.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A00;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A02;
        return hashCode2 + A00(num).hashCode() + num.intValue();
    }

    public String toString() {
        String str = this.A01;
        String str2 = this.A00;
        Integer num = this.A02;
        return 0Pz.A11("MustacheActionMetadata(title=", str, ", actionUrl=", str2, ", ctaType=", num != null ? A00(num) : "null");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(A00(this.A02));
    }
}
