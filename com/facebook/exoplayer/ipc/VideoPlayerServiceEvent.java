package com.facebook.exoplayer.ipc;

import X.ENF;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoPlayerServiceEvent.class */
public abstract class VideoPlayerServiceEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(66);

    @Override // android.os.Parcelable
    public int describeContents() {
        return (this instanceof VpsVideoCacheDatabaseFullEvent ? ENF.A03 : this instanceof VpsPrefetchStartEvent ? ENF.A07 : this instanceof VpsPrefetchCacheEvictEvent ? ENF.A06 : this instanceof VpsManifestParseErrorEvent ? ENF.A05 : ENF.A02).mValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
