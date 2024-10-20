package com.facebook.stories.model;

import X.11T;
import X.C1pq;
import X.DKI;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AvailablePageVoice.class */
public final class AvailablePageVoice implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(66);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AvailablePageVoice(Parcel parcel) {
        this.A04 = DKI.A0k(parcel, this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public AvailablePageVoice(boolean z, String str, String str2, String str3, String str4) {
        this.A04 = z;
        C1pq.A08("pageAccessToken", str);
        this.A00 = str;
        C1pq.A08("pageId", str2);
        this.A01 = str2;
        C1pq.A08("pageName", str3);
        this.A02 = str3;
        C1pq.A08("profilePictureUrl", str4);
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AvailablePageVoice)) {
                return false;
            }
            AvailablePageVoice availablePageVoice = (AvailablePageVoice) obj;
            if (this.A04 != availablePageVoice.A04 || !11T.A0O(this.A00, availablePageVoice.A00) || !11T.A0O(this.A01, availablePageVoice.A01) || !11T.A0O(this.A02, availablePageVoice.A02) || !11T.A0O(this.A03, availablePageVoice.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A05(this.A04)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
