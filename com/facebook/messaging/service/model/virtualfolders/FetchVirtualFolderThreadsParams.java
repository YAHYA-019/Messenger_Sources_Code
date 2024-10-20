package com.facebook.messaging.service.model.virtualfolders;

import X.1BL;
import X.1Hk;
import X.7zN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchVirtualFolderThreadsParams.class */
public final class FetchVirtualFolderThreadsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(31);
    public final int A00;
    public final 1Hk A01;

    public FetchVirtualFolderThreadsParams(1Hk r302, int i) {
        this.A00 = i;
        C1pq.A08("virtualFolderName", r302);
        this.A01 = r302;
    }

    public FetchVirtualFolderThreadsParams(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = 1Hk.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FetchVirtualFolderThreadsParams)) {
                return false;
            }
            FetchVirtualFolderThreadsParams fetchVirtualFolderThreadsParams = (FetchVirtualFolderThreadsParams) obj;
            if (this.A00 != fetchVirtualFolderThreadsParams.A00 || this.A01 != fetchVirtualFolderThreadsParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00 + 31;
        return (i * 31) + C3o5.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchVirtualFolderThreadsParams{maxToFetch=");
        A0k.append(this.A00);
        A0k.append(", virtualFolderName=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        7zN.A0z(parcel, this.A01);
    }
}
