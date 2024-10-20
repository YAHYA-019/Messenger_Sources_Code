package com.facebook.messaging.media.prefetch;

import X.1BK;
import X.7zM;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: XMACacheData.class */
public final class XMACacheData implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new 82M(40);
    public static final long serialVersionUID = 2;
    public final String dashManifest;
    public final String progressiveUrl;
    public final long timeStamp;

    public XMACacheData(Parcel parcel) {
        this.dashManifest = parcel.readString();
        this.progressiveUrl = parcel.readString();
        this.timeStamp = parcel.readLong();
    }

    public XMACacheData(String str, String str2) {
        this.dashManifest = str;
        this.progressiveUrl = str2;
        this.timeStamp = System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof XMACacheData)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        XMACacheData xMACacheData = (XMACacheData) obj;
        String str = this.progressiveUrl;
        String str2 = xMACacheData.progressiveUrl;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.dashManifest;
        String str4 = xMACacheData.dashManifest;
        return str3 == null ? str4 == null : str3.equals(str4) && this.timeStamp == xMACacheData.timeStamp;
    }

    public int hashCode() {
        String str = this.progressiveUrl;
        int hashCode = str == null ? 1 : str.hashCode();
        String str2 = this.dashManifest;
        if (str2 != null) {
            hashCode = 7zM.A05(str2, hashCode * 31);
        }
        return 1BK.A03(Long.valueOf(this.timeStamp), hashCode * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dashManifest);
        parcel.writeString(this.progressiveUrl);
        parcel.writeLong(this.timeStamp);
    }
}
