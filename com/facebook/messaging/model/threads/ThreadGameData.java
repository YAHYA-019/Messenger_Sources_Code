package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: ThreadGameData.class */
public final class ThreadGameData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(76);
    public final int A00;
    public final String A01;

    public ThreadGameData(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public ThreadGameData(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadGameData threadGameData = (ThreadGameData) obj;
            if (this.A00 != threadGameData.A00) {
                return false;
            }
            String str = this.A01;
            String str2 = threadGameData.A01;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return (1BL.A06(this.A01) * 31) + this.A00;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("highScoreUserId", this.A01);
        stringHelper.add("highScore", this.A00);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
