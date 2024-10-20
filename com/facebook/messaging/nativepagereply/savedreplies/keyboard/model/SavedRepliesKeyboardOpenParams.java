package com.facebook.messaging.nativepagereply.savedreplies.keyboard.model;

import X.11T;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SavedRepliesKeyboardOpenParams.class */
public final class SavedRepliesKeyboardOpenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(46);
    public final Integer A00;
    public final String A01;

    public SavedRepliesKeyboardOpenParams(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt() == 0 ? null : 7zU.A0e(parcel, 3);
    }

    public SavedRepliesKeyboardOpenParams(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SavedRepliesKeyboardOpenParams)) {
                return false;
            }
            SavedRepliesKeyboardOpenParams savedRepliesKeyboardOpenParams = (SavedRepliesKeyboardOpenParams) obj;
            if (!11T.A0O(this.A01, savedRepliesKeyboardOpenParams.A01) || this.A00 != savedRepliesKeyboardOpenParams.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return (A03 * 31) + C3o5.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(AbN.A01(parcel, this.A00));
    }
}
