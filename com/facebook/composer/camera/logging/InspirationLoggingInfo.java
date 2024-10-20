package com.facebook.composer.camera.logging;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.model.InspirationMediaState;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationLoggingInfo.class */
public final class InspirationLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(97);
    public final ImmutableList A00;
    public final String A01;

    public InspirationLoggingInfo(Parcel parcel) {
        this.A01 = AbK.A15(parcel, C3o5.A01(parcel, this));
        int readInt = parcel.readInt();
        InspirationMediaState[] inspirationMediaStateArr = new InspirationMediaState[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(inspirationMediaStateArr);
                return;
            }
            i = DKG.A02(parcel, InspirationMediaState.CREATOR, inspirationMediaStateArr, i2);
        }
    }

    public InspirationLoggingInfo(ImmutableList immutableList, String str) {
        this.A01 = str;
        C1pq.A08("inspirationMediaStates", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationLoggingInfo)) {
                return false;
            }
            InspirationLoggingInfo inspirationLoggingInfo = (InspirationLoggingInfo) obj;
            if (!11T.A0O(this.A01, inspirationLoggingInfo.A01) || !11T.A0O(this.A00, inspirationLoggingInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((InspirationMediaState) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
