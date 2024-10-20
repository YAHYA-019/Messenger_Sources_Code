package com.facebook.xapp.messaging.threadview.model.xma.citations;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AISearchSource.class */
public final class AISearchSource extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(69);
    public final String A00;
    public final String A01;
    public final String A02;

    public AISearchSource(String str, String str2, String str3) {
        1BL.A1H(str, str2, str3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AISearchSource)) {
                return false;
            }
            AISearchSource aISearchSource = (AISearchSource) obj;
            if (!11T.A0O(this.A02, aISearchSource.A02) || !11T.A0O(this.A01, aISearchSource.A01) || !11T.A0O(this.A00, aISearchSource.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
