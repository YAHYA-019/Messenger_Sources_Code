package com.facebook.messaging.communitymessaging.communitycontainers.model;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: SingleUnreadCommunityChannelMetadata.class */
public final class SingleUnreadCommunityChannelMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C2xc(13);
    public final ThreadSummary A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(SingleUnreadCommunityChannelMetadata.class, "SingleUnreadCommunityChannelMetadata");
    }

    public SingleUnreadCommunityChannelMetadata(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 1);
        this.A00 = threadSummary;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SingleUnreadCommunityChannelMetadata) && 11T.A0O(this.A00, ((SingleUnreadCommunityChannelMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SingleUnreadCommunityChannelMetadata(singleUnreadCommunityChannelThreadSummary=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
