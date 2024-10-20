package com.facebook.video.heroplayer.ipc;

import X.6Cy;
import X.6Cz;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PrefetchTaskDataFetchCompletedEvent.class */
public final class PrefetchTaskDataFetchCompletedEvent extends 6Cy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(10);
    public static final long serialVersionUID = 8765432109876543210L;
    public final String mBytesCalculationOrigin;
    public final long mDurationPrefetchedMs;
    public final String mIsFollowupPrefetch;
    public final long mNetworkBytesPrefetched;
    public final String mStreamType;
    public final long mTotalBytesPrefetched;
    public final String mVideoId;

    public PrefetchTaskDataFetchCompletedEvent(Parcel parcel) {
        super(6Cz.A0V);
        this.mVideoId = parcel.readString();
        this.mIsFollowupPrefetch = parcel.readString();
        this.mStreamType = parcel.readString();
        this.mTotalBytesPrefetched = parcel.readLong();
        this.mNetworkBytesPrefetched = parcel.readLong();
        this.mDurationPrefetchedMs = parcel.readLong();
        this.mBytesCalculationOrigin = parcel.readString();
    }

    public PrefetchTaskDataFetchCompletedEvent(String str, String str2, String str3, String str4, long j, long j2, long j3) {
        super(6Cz.A0V);
        this.mVideoId = str;
        this.mIsFollowupPrefetch = str2;
        this.mStreamType = str3;
        this.mTotalBytesPrefetched = j;
        this.mNetworkBytesPrefetched = j2;
        this.mDurationPrefetchedMs = j3;
        this.mBytesCalculationOrigin = str4;
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
        parcel.writeLong(this.mTotalBytesPrefetched);
        parcel.writeLong(this.mNetworkBytesPrefetched);
        parcel.writeLong(this.mDurationPrefetchedMs);
        parcel.writeString(this.mBytesCalculationOrigin);
    }
}
