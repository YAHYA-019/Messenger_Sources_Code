package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.MusicTrackParams;

/* loaded from: ComposerMusicData.class */
public final class ComposerMusicData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(46);
    public final int A00;
    public final int A01;
    public final MediaData A02;
    public final MusicTrackParams A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public ComposerMusicData(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = AbN.A1U(parcel);
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
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
        this.A0B = parcel.readString();
    }

    public ComposerMusicData(MediaData mediaData, MusicTrackParams musicTrackParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z) {
        C1pq.A08("artist", str);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A07 = str4;
        this.A02 = mediaData;
        C1pq.A08("musicAssetId", str5);
        this.A08 = str5;
        this.A03 = musicTrackParams;
        this.A09 = str6;
        this.A0A = str7;
        C1pq.A08("songTitle", str8);
        this.A0B = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMusicData)) {
                return false;
            }
            ComposerMusicData composerMusicData = (ComposerMusicData) obj;
            if (!11T.A0O(this.A04, composerMusicData.A04) || !11T.A0O(this.A05, composerMusicData.A05) || !11T.A0O(this.A06, composerMusicData.A06) || this.A00 != composerMusicData.A00 || this.A01 != composerMusicData.A01 || this.A0C != composerMusicData.A0C || !11T.A0O(this.A07, composerMusicData.A07) || !11T.A0O(this.A02, composerMusicData.A02) || !11T.A0O(this.A08, composerMusicData.A08) || !11T.A0O(this.A03, composerMusicData.A03) || !11T.A0O(this.A09, composerMusicData.A09) || !11T.A0O(this.A0A, composerMusicData.A0A) || !11T.A0O(this.A0B, composerMusicData.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A03, C1pq.A04(this.A08, C1pq.A04(this.A02, C1pq.A04(this.A07, C1pq.A02((((C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04))) * 31) + this.A00) * 31) + this.A01, this.A0C))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0C ? 1 : 0);
        1BL.A13(parcel, this.A07);
        DKH.A10(parcel, this.A02, i);
        parcel.writeString(this.A08);
        MusicTrackParams musicTrackParams = this.A03;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        parcel.writeString(this.A0B);
    }
}
