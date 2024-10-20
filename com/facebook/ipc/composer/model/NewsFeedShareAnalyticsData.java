package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.EOx;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NewsFeedShareAnalyticsData.class */
public final class NewsFeedShareAnalyticsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(1);
    public final EOx A00;
    public final String A01;
    public final String A02;

    public NewsFeedShareAnalyticsData(EOx eOx, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = eOx;
    }

    public NewsFeedShareAnalyticsData(Parcel parcel) {
        EOx eOx = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? EOx.values()[parcel.readInt()] : eOx;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof NewsFeedShareAnalyticsData)) {
                return false;
            }
            NewsFeedShareAnalyticsData newsFeedShareAnalyticsData = (NewsFeedShareAnalyticsData) obj;
            if (!11T.A0O(this.A01, newsFeedShareAnalyticsData.A01) || !11T.A0O(this.A02, newsFeedShareAnalyticsData.A02) || this.A00 != newsFeedShareAnalyticsData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A03(this.A01));
        return (A04 * 31) + C3o5.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        C3o5.A0e(parcel, this.A00);
    }
}
