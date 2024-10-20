package com.facebook.messaging.media.resharehub.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ReshareHubExtensionParams.class */
public final class ReshareHubExtensionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(25);
    public final ThreadKey A00;
    public final Integer A01;
    public final String A02;

    public ReshareHubExtensionParams(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = 7zU.A0e(parcel, 2);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt() == 0 ? null : (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public ReshareHubExtensionParams(ThreadKey threadKey, Integer num, String str) {
        C1pq.A08("entry", num);
        this.A01 = num;
        C1pq.A08("sessionId", str);
        this.A02 = str;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReshareHubExtensionParams)) {
                return false;
            }
            ReshareHubExtensionParams reshareHubExtensionParams = (ReshareHubExtensionParams) obj;
            if (this.A01 != reshareHubExtensionParams.A01 || !11T.A0O(this.A02, reshareHubExtensionParams.A02) || !11T.A0O(this.A00, reshareHubExtensionParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C3o5.A04(this.A01) + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.intValue());
        parcel.writeString(this.A02);
        ThreadKey threadKey = this.A00;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
    }
}
