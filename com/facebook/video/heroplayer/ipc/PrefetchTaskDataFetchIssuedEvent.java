package com.facebook.video.heroplayer.ipc;

import X.6Cy;
import X.6Cz;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PrefetchTaskDataFetchIssuedEvent.class */
public final class PrefetchTaskDataFetchIssuedEvent extends 6Cy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(11);
    public static final long serialVersionUID = 7839888635267517754L;
    public final String mIsFollowupPrefetch;
    public final String mStreamType;
    public final String mVideoId;

    public PrefetchTaskDataFetchIssuedEvent(Parcel parcel) {
        super(6Cz.A0W);
        this.mVideoId = parcel.readString();
        this.mIsFollowupPrefetch = parcel.readString();
        this.mStreamType = parcel.readString();
    }

    public PrefetchTaskDataFetchIssuedEvent(String str, String str2, String str3) {
        super(6Cz.A0W);
        this.mVideoId = str;
        this.mIsFollowupPrefetch = str2;
        this.mStreamType = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mVideoId);
        parcel.writeString(this.mIsFollowupPrefetch);
        parcel.writeString(this.mStreamType);
    }
}
