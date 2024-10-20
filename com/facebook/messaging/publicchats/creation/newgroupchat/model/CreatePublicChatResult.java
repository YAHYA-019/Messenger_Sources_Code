package com.facebook.messaging.publicchats.creation.newgroupchat.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.BmO;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreatePublicChatResult.class */
public final class CreatePublicChatResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(30);
    public final String A00;
    public final String A01;

    public CreatePublicChatResult(BmO bmO) {
        this.A00 = bmO.A00;
        this.A01 = bmO.A01;
    }

    public CreatePublicChatResult(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreatePublicChatResult)) {
                return false;
            }
            CreatePublicChatResult createPublicChatResult = (CreatePublicChatResult) obj;
            if (!11T.A0O(this.A00, createPublicChatResult.A00) || !11T.A0O(this.A01, createPublicChatResult.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    public String toString() {
        return 0Pz.A0z("CreatePublicChatResult{inviteUri=", this.A00, ", threadFbId=", this.A01, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
