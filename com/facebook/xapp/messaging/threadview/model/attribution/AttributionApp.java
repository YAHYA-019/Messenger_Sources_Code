package com.facebook.xapp.messaging.threadview.model.attribution;

import X.11T;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AttributionApp.class */
public final class AttributionApp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(64);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AttributionApp(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public AttributionApp(String str, String str2, String str3) {
        C1pq.A08("appId", str);
        this.A00 = str;
        C1pq.A08("appName", str2);
        this.A02 = str2;
        this.A03 = "";
        C1pq.A08("iconUrl", str3);
        this.A01 = str3;
        if (this.A00.length() <= 0 && str3.length() <= 0) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AttributionApp)) {
                return false;
            }
            AttributionApp attributionApp = (AttributionApp) obj;
            if (!11T.A0O(this.A00, attributionApp.A00) || !11T.A0O(this.A02, attributionApp.A02) || !11T.A0O(this.A03, attributionApp.A03) || !11T.A0O(this.A01, attributionApp.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
