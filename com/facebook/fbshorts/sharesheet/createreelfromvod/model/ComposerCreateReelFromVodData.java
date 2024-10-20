package com.facebook.fbshorts.sharesheet.createreelfromvod.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zO;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.model.InspirationEditingData;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.video.creativeediting.model.VideoCreativeEditingData;

/* loaded from: ComposerCreateReelFromVodData.class */
public final class ComposerCreateReelFromVodData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(77);
    public final Uri A00;
    public final InspirationEditingData A01;
    public final MediaData A02;
    public final VideoCreativeEditingData A03;
    public final Boolean A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public ComposerCreateReelFromVodData(Uri uri, InspirationEditingData inspirationEditingData, MediaData mediaData, VideoCreativeEditingData videoCreativeEditingData, Boolean bool, Long l, String str, String str2, String str3) {
        this.A06 = str;
        this.A00 = uri;
        this.A01 = inspirationEditingData;
        this.A04 = bool;
        this.A05 = l;
        this.A07 = str2;
        this.A02 = mediaData;
        this.A08 = str3;
        this.A03 = videoCreativeEditingData;
    }

    public ComposerCreateReelFromVodData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        VideoCreativeEditingData videoCreativeEditingData = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InspirationEditingData) InspirationEditingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = Boolean.valueOf(AbN.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? (VideoCreativeEditingData) VideoCreativeEditingData.CREATOR.createFromParcel(parcel) : videoCreativeEditingData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerCreateReelFromVodData)) {
                return false;
            }
            ComposerCreateReelFromVodData composerCreateReelFromVodData = (ComposerCreateReelFromVodData) obj;
            if (!11T.A0O(this.A06, composerCreateReelFromVodData.A06) || !11T.A0O(this.A00, composerCreateReelFromVodData.A00) || !11T.A0O(this.A01, composerCreateReelFromVodData.A01) || !11T.A0O(this.A04, composerCreateReelFromVodData.A04) || !11T.A0O(this.A05, composerCreateReelFromVodData.A05) || !11T.A0O(this.A07, composerCreateReelFromVodData.A07) || !11T.A0O(this.A02, composerCreateReelFromVodData.A02) || !11T.A0O(this.A08, composerCreateReelFromVodData.A08) || !11T.A0O(this.A03, composerCreateReelFromVodData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A08, C1pq.A04(this.A02, C1pq.A04(this.A07, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A06)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        C3o5.A0d(parcel, this.A00, i);
        InspirationEditingData inspirationEditingData = this.A01;
        if (inspirationEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEditingData.writeToParcel(parcel, i);
        }
        AbN.A0s(parcel, this.A04);
        C3o5.A0g(parcel, this.A05);
        1BL.A13(parcel, this.A07);
        DKH.A10(parcel, this.A02, i);
        1BL.A13(parcel, this.A08);
        VideoCreativeEditingData videoCreativeEditingData = this.A03;
        if (videoCreativeEditingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCreativeEditingData.writeToParcel(parcel, i);
        }
    }
}
