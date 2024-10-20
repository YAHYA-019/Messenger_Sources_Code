package com.facebook.rtc.interfaces;

import X.11T;
import X.4YW;
import X.7zU;
import X.C1pq;
import X.DKH;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CallSurfaceLoggingParams.class */
public final class CallSurfaceLoggingParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(90);
    public final String A00;
    public final String A01;
    public final String A02;

    public CallSurfaceLoggingParams(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = DKH.A0l(parcel);
    }

    public CallSurfaceLoggingParams(String str, String str2) {
        this.A00 = "Thread";
        C1pq.A08("callTrigger", str);
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallSurfaceLoggingParams)) {
                return false;
            }
            CallSurfaceLoggingParams callSurfaceLoggingParams = (CallSurfaceLoggingParams) obj;
            if (!11T.A0O(this.A00, callSurfaceLoggingParams.A00) || !11T.A0O(this.A01, callSurfaceLoggingParams.A01) || !11T.A0O(this.A02, callSurfaceLoggingParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        4YW.A0E(parcel, this.A02);
    }
}
