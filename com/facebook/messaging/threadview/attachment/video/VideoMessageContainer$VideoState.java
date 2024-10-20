package com.facebook.messaging.threadview.attachment.video;

import X.AnonymousClass001;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoMessageContainer$VideoState.class */
public final class VideoMessageContainer$VideoState implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(75);
    public final int A00;
    public final boolean A01;

    public VideoMessageContainer$VideoState(Parcel parcel) {
        this.A01 = AnonymousClass001.A1P(parcel.readInt());
        this.A00 = parcel.readInt();
    }

    public VideoMessageContainer$VideoState(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
