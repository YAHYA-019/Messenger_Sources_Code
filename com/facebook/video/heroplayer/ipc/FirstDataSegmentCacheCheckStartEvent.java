package com.facebook.video.heroplayer.ipc;

import X.0Pz;
import X.6Cy;
import X.6Cz;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FirstDataSegmentCacheCheckStartEvent.class */
public final class FirstDataSegmentCacheCheckStartEvent extends 6Cy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(8);
    public final long playerId;
    public final long requestLength;
    public final long startPos;
    public final int streamType;
    public final String videoId;

    public FirstDataSegmentCacheCheckStartEvent(Parcel parcel) {
        super(6Cz.A0C);
        this.videoId = AbstractC2326GOr.A0g(parcel);
        this.playerId = parcel.readLong();
        this.streamType = parcel.readInt();
        this.startPos = parcel.readLong();
        this.requestLength = parcel.readLong();
    }

    public FirstDataSegmentCacheCheckStartEvent(String str, int i, long j, long j2, long j3) {
        super(6Cz.A0C);
        this.videoId = str;
        this.playerId = j;
        this.streamType = i;
        this.startPos = j2;
        this.requestLength = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 0Pz.A0z(0Pz.A0W("videoId=", this.videoId), AnonymousClass001.A0h(AnonymousClass001.A0n(", playerId="), this.playerId), 0Pz.A0T(", streamType=", this.streamType), AnonymousClass001.A0h(AnonymousClass001.A0n(", startPos="), this.startPos), AnonymousClass001.A0h(AnonymousClass001.A0n(", requestLength="), this.requestLength));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
        parcel.writeLong(this.playerId);
        parcel.writeInt(this.streamType);
        parcel.writeLong(this.startPos);
        parcel.writeLong(this.requestLength);
    }
}
