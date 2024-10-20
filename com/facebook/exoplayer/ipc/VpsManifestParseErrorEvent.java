package com.facebook.exoplayer.ipc;

import android.os.Parcel;

/* loaded from: VpsManifestParseErrorEvent.class */
public final class VpsManifestParseErrorEvent extends VideoPlayerServiceEvent {
    public Exception A00;
    public String A01;

    @Override // com.facebook.exoplayer.ipc.VideoPlayerServiceEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A00);
    }
}
