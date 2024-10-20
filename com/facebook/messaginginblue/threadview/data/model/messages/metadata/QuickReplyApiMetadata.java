package com.facebook.messaginginblue.threadview.data.model.messages.metadata;

import X.0Pz;
import X.11T;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: QuickReplyApiMetadata.class */
public final class QuickReplyApiMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(5);
    public final String A00;

    public QuickReplyApiMetadata(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
    }

    public QuickReplyApiMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof QuickReplyApiMetadata) && 11T.A0O(this.A00, ((QuickReplyApiMetadata) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    public String toString() {
        return 0Pz.A0j("QuickReplyApiMetadata{adId=", this.A00, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
    }
}
