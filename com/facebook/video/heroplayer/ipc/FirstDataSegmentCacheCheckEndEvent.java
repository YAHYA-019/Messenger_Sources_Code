package com.facebook.video.heroplayer.ipc;

import X.0Pz;
import X.4YT;
import X.4YV;
import X.6Cy;
import X.6Cz;
import X.6DD;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FirstDataSegmentCacheCheckEndEvent.class */
public final class FirstDataSegmentCacheCheckEndEvent extends 6Cy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(7);
    public final 6DD cacheType;
    public final long playerId;
    public final long readByteLength;
    public final long requestLength;
    public final long startPos;
    public final int streamType;
    public final String videoId;

    public FirstDataSegmentCacheCheckEndEvent(6DD r302, String str, int i, long j, long j2, long j3, long j4) {
        super(6Cz.A0B);
        this.videoId = str;
        this.playerId = j;
        this.streamType = i;
        this.cacheType = r302;
        this.startPos = j2;
        this.requestLength = j3;
        this.readByteLength = j4;
    }

    public FirstDataSegmentCacheCheckEndEvent(Parcel parcel) {
        super(6Cz.A0B);
        this.videoId = AbstractC2326GOr.A0g(parcel);
        this.playerId = parcel.readLong();
        this.streamType = parcel.readInt();
        6DD r303 = (6DD) 4YV.A0l(parcel, 6DD.class);
        this.cacheType = r303 == null ? 6DD.A03 : r303;
        this.startPos = parcel.readLong();
        this.requestLength = parcel.readLong();
        this.readByteLength = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 0Pz.A12(0Pz.A0W("videoId=", this.videoId), AnonymousClass001.A0h(AnonymousClass001.A0n(", playerId="), this.playerId), 0Pz.A0T(", streamType=", this.streamType), 0Pz.A0W(4YT.A00(487), this.cacheType.mName), AnonymousClass001.A0h(AnonymousClass001.A0n(", startPos="), this.startPos), AnonymousClass001.A0h(AnonymousClass001.A0n(", requestLength="), this.requestLength), AnonymousClass001.A0h(AnonymousClass001.A0n(", readByteLength="), this.readByteLength));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
        parcel.writeLong(this.playerId);
        parcel.writeInt(this.streamType);
        parcel.writeValue(this.cacheType);
        parcel.writeLong(this.startPos);
        parcel.writeLong(this.requestLength);
        parcel.writeLong(this.readByteLength);
    }
}
