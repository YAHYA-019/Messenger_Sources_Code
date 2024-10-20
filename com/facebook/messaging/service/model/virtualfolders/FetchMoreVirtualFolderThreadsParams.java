package com.facebook.messaging.service.model.virtualfolders;

import X.1BL;
import X.1Hk;
import X.7zN;
import X.AbG;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchMoreVirtualFolderThreadsParams.class */
public final class FetchMoreVirtualFolderThreadsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(30);
    public final int A00;
    public final long A01;
    public final 1Hk A02;

    public FetchMoreVirtualFolderThreadsParams(1Hk r302, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        C1pq.A08("virtualFolderName", r302);
        this.A02 = r302;
    }

    public FetchMoreVirtualFolderThreadsParams(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A02 = 1Hk.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FetchMoreVirtualFolderThreadsParams)) {
                return false;
            }
            FetchMoreVirtualFolderThreadsParams fetchMoreVirtualFolderThreadsParams = (FetchMoreVirtualFolderThreadsParams) obj;
            if (this.A01 != fetchMoreVirtualFolderThreadsParams.A01 || this.A00 != fetchMoreVirtualFolderThreadsParams.A00 || this.A02 != fetchMoreVirtualFolderThreadsParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A01 = ((1BL.A01(this.A01) + 31) * 31) + this.A00;
        return (A01 * 31) + C3o5.A03(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchMoreVirtualFolderThreadsParams{endTimeMs=");
        A0k.append(this.A01);
        A0k.append(", maxToFetch=");
        A0k.append(this.A00);
        A0k.append(", virtualFolderName=");
        A0k.append(this.A02);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        7zN.A0z(parcel, this.A02);
    }
}
