package com.facebook.video.heroplayer.ipc;

import X.AbJ;
import X.AnonymousClass001;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoProtocolProps.class */
public final class VideoProtocolProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(14);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public VideoProtocolProps() {
        this.A00 = "";
        this.A01 = false;
        this.A02 = false;
    }

    public VideoProtocolProps(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = AbJ.A1W(parcel);
    }

    public VideoProtocolProps(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("subscriptionUrl: '");
        A0k.append(this.A00);
        A0k.append("', broadcasterForcedPlayback: ");
        A0k.append(this.A01);
        A0k.append(", isVideoEligible: ");
        A0k.append(this.A02);
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
