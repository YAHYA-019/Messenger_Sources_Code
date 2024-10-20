package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.82M;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InboxAdsQuickReply.class */
public final class InboxAdsQuickReply implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(20);
    public final String A00;
    public final String A01;

    public InboxAdsQuickReply(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public InboxAdsQuickReply(String str, String str2) {
        C1pq.A08("contentType", str);
        this.A01 = str;
        C1pq.A08("text", str2);
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxAdsQuickReply)) {
                return false;
            }
            InboxAdsQuickReply inboxAdsQuickReply = (InboxAdsQuickReply) obj;
            if (!11T.A0O(this.A01, inboxAdsQuickReply.A01) || !11T.A0O(this.A00, inboxAdsQuickReply.A00)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
