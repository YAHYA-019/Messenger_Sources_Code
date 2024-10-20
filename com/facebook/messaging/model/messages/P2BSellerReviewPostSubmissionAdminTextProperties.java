package com.facebook.messaging.model.messages;

import X.CSY;
import X.DJg;
import android.os.Parcel;

/* loaded from: P2BSellerReviewPostSubmissionAdminTextProperties.class */
public final class P2BSellerReviewPostSubmissionAdminTextProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new CSY(12);
    public final String A00;
    public final String A01;

    public P2BSellerReviewPostSubmissionAdminTextProperties(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
