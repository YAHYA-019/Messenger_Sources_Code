package com.facebook.messaging.rtc.incall.impl.links.sharedstate.api;

import X.0Pz;
import X.11T;
import X.7zU;
import X.C1pq;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoChatLinkJoiningContext.class */
public final class VideoChatLinkJoiningContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(52);
    public final String A00;

    public VideoChatLinkJoiningContext() {
        this.A00 = "JOIN_LINK";
    }

    public VideoChatLinkJoiningContext(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VideoChatLinkJoiningContext) && 11T.A0O(this.A00, ((VideoChatLinkJoiningContext) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    public String toString() {
        return 0Pz.A0j("VideoChatLinkJoiningContext{joinIntent=", this.A00, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
