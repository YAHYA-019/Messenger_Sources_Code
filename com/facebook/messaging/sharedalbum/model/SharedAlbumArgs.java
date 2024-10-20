package com.facebook.messaging.sharedalbum.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zM;
import X.7zQ;
import X.AnonymousClass002;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SharedAlbumArgs.class */
public final class SharedAlbumArgs extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(35);
    public final long A00;
    public final ThreadKey A01;
    public final Integer A02;
    public final String A03;

    public SharedAlbumArgs(ThreadKey threadKey, Integer num, String str, long j) {
        1BK.A1K(threadKey, 3, num);
        this.A00 = j;
        this.A03 = str;
        this.A01 = threadKey;
        this.A02 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharedAlbumArgs)) {
                return false;
            }
            SharedAlbumArgs sharedAlbumArgs = (SharedAlbumArgs) obj;
            if (this.A00 != sharedAlbumArgs.A00 || !11T.A0O(this.A03, sharedAlbumArgs.A03) || !11T.A0O(this.A01, sharedAlbumArgs.A01) || this.A02 != sharedAlbumArgs.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = AnonymousClass002.A05(this.A01, (7zQ.A02(this.A00) + 1BL.A05(this.A03)) * 31);
        int intValue = this.A02.intValue();
        return A05 + 7zM.A04(1 != intValue ? "BACK" : "CLOSE", intValue);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(1 - this.A02.intValue() != 0 ? "BACK" : "CLOSE");
    }
}
