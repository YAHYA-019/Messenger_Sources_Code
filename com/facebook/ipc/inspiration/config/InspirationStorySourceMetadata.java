package com.facebook.ipc.inspiration.config;

import X.11T;
import X.1BL;
import X.4YV;
import X.4YW;
import X.AbK;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationStorySourceMetadata.class */
public final class InspirationStorySourceMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(35);
    public final String A00;
    public final boolean A01;

    public InspirationStorySourceMetadata(Parcel parcel) {
        this.A01 = 4YV.A1U(C3o5.A01(parcel, this));
        this.A00 = AbK.A15(parcel, parcel.readInt());
    }

    public InspirationStorySourceMetadata(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStorySourceMetadata)) {
                return false;
            }
            InspirationStorySourceMetadata inspirationStorySourceMetadata = (InspirationStorySourceMetadata) obj;
            if (this.A01 != inspirationStorySourceMetadata.A01 || !11T.A0O(this.A00, inspirationStorySourceMetadata.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A05(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationStorySourceMetadata{isFromPageBucket=");
        A0k.append(this.A01);
        A0k.append(", storyId=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        4YW.A0E(parcel, this.A00);
    }
}
