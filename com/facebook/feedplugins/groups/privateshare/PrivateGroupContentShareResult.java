package com.facebook.feedplugins.groups.privateshare;

import X.11T;
import X.1BL;
import X.7zM;
import X.C04v;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PrivateGroupContentShareResult.class */
public final class PrivateGroupContentShareResult extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(79);
    public final String A00;
    public final Set A01;

    public PrivateGroupContentShareResult(String str, Set set) {
        11T.A0F(str, 2);
        this.A01 = set;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PrivateGroupContentShareResult)) {
                return false;
            }
            PrivateGroupContentShareResult privateGroupContentShareResult = (PrivateGroupContentShareResult) obj;
            if (!11T.A0O(this.A01, privateGroupContentShareResult.A01) || !11T.A0O(this.A00, privateGroupContentShareResult.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 1BL.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A0S = C3o5.A0S(parcel, this.A01);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
        parcel.writeString(this.A00);
    }
}
