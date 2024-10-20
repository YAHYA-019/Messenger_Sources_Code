package com.facebook.messaging.communitymessaging.memberlist.extradata;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RequestToJoinChatInfo.class */
public final class RequestToJoinChatInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(80);
    public final RequestToJoinVersion A00;

    public RequestToJoinChatInfo(RequestToJoinVersion requestToJoinVersion) {
        11T.A0F(requestToJoinVersion, 1);
        this.A00 = requestToJoinVersion;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
