package com.facebook.composer.media;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.video.creativeediting.model.VideoCreativeEditingData;

/* loaded from: ComposerMediaLinkedReelMetaData.class */
public final class ComposerMediaLinkedReelMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(0);
    public final MediaData A00;
    public final VideoCreativeEditingData A01;
    public final String A02;
    public final String A03;

    public ComposerMediaLinkedReelMetaData(Parcel parcel) {
        VideoCreativeEditingData videoCreativeEditingData = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? (VideoCreativeEditingData) VideoCreativeEditingData.CREATOR.createFromParcel(parcel) : videoCreativeEditingData;
    }

    public ComposerMediaLinkedReelMetaData(MediaData mediaData, VideoCreativeEditingData videoCreativeEditingData, String str, String str2) {
        this.A02 = str;
        this.A00 = mediaData;
        this.A03 = str2;
        this.A01 = videoCreativeEditingData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMediaLinkedReelMetaData)) {
                return false;
            }
            ComposerMediaLinkedReelMetaData composerMediaLinkedReelMetaData = (ComposerMediaLinkedReelMetaData) obj;
            if (!11T.A0O(this.A02, composerMediaLinkedReelMetaData.A02) || !11T.A0O(this.A00, composerMediaLinkedReelMetaData.A00) || !11T.A0O(this.A03, composerMediaLinkedReelMetaData.A03) || !11T.A0O(this.A01, composerMediaLinkedReelMetaData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A03(this.A02))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        DKH.A10(parcel, this.A00, i);
        1BL.A13(parcel, this.A03);
        VideoCreativeEditingData videoCreativeEditingData = this.A01;
        if (videoCreativeEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCreativeEditingData.writeToParcel(parcel, i);
        }
    }
}
