package com.facebook.messaging.groups.create.model;

import X.11T;
import X.4YW;
import X.7zL;
import X.7zN;
import X.AbG;
import X.AbK;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;

/* loaded from: LoggingParams.class */
public final class LoggingParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(71);
    public final TriState A00;
    public final String A01;

    public LoggingParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = TriState.values()[parcel.readInt()];
        this.A01 = AbK.A15(parcel, parcel.readInt());
    }

    public LoggingParams(TriState triState, String str) {
        C1pq.A08("isPendingMontageThread", triState);
        this.A00 = triState;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LoggingParams)) {
                return false;
            }
            LoggingParams loggingParams = (LoggingParams) obj;
            if (this.A00 != loggingParams.A00 || !11T.A0O(this.A01, loggingParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C3o5.A03(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this.A00);
        4YW.A0E(parcel, this.A01);
    }
}
