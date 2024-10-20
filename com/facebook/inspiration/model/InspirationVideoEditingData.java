package com.facebook.inspiration.model;

import X.11T;
import X.AbJ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKf;
import X.MRl;
import X.N2D;
import X.NAj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.audiosharing.model.AudioTranscriptionParam;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.facebook.photos.creativeediting.model.audio.AudioTrackParams;

/* loaded from: InspirationVideoEditingData.class */
public final class InspirationVideoEditingData implements Parcelable, NAj {
    public static final Parcelable.Creator CREATOR = new FKf(72);
    public final AudioTranscriptionParam A00;
    public final MusicTrackParams A01;
    public final VideoTrimParams A02;
    public final AudioTrackParams A03;
    public final AudioTrackParams A04;
    public final Float A05;
    public final Float A06;
    public final boolean A07;
    public final boolean A08;

    public InspirationVideoEditingData(N2D n2d) {
        this.A05 = n2d.A05;
        this.A03 = n2d.A03;
        this.A00 = n2d.A00;
        this.A07 = n2d.A07;
        this.A08 = n2d.A08;
        this.A01 = n2d.A01;
        this.A04 = n2d.A04;
        this.A02 = n2d.A02;
        this.A06 = n2d.A06;
    }

    public InspirationVideoEditingData(Parcel parcel) {
        Float f = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = MRl.A0I(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (AudioTrackParams) AudioTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (AudioTranscriptionParam) AudioTranscriptionParam.CREATOR.createFromParcel(parcel);
        }
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = AbJ.A1W(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (AudioTrackParams) AudioTrackParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel);
        }
        this.A06 = parcel.readInt() != 0 ? MRl.A0I(parcel) : f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.N2D, java.lang.Object] */
    public static N2D A00(NAj nAj) {
        return nAj != null ? new N2D(nAj) : new Object();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoEditingData)) {
                return false;
            }
            InspirationVideoEditingData inspirationVideoEditingData = (InspirationVideoEditingData) obj;
            if (!11T.A0O(this.A05, inspirationVideoEditingData.A05) || !11T.A0O(this.A03, inspirationVideoEditingData.A03) || !11T.A0O(this.A00, inspirationVideoEditingData.A00) || this.A07 != inspirationVideoEditingData.A07 || this.A08 != inspirationVideoEditingData.A08 || !11T.A0O(this.A01, inspirationVideoEditingData.A01) || !11T.A0O(this.A04, inspirationVideoEditingData.A04) || !11T.A0O(this.A02, inspirationVideoEditingData.A02) || !11T.A0O(this.A06, inspirationVideoEditingData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A05))), this.A07), this.A08)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationVideoEditingData{audioEnhancementAdjustmentAmount=");
        A0k.append(this.A05);
        A0k.append(", audioTrackParams=");
        A0k.append(this.A03);
        A0k.append(", audioTranscriptionParam=");
        A0k.append(this.A00);
        A0k.append(", isVideoMuted=");
        A0k.append(this.A07);
        A0k.append(", isVolumeManuallyAdjusted=");
        A0k.append(this.A08);
        A0k.append(", musicTrackParams=");
        A0k.append(this.A01);
        A0k.append(", ttsAudioTrackParams=");
        A0k.append(this.A04);
        A0k.append(", videoTrimParams=");
        A0k.append(this.A02);
        A0k.append(", videoVolumeAdjustmentInDB=");
        return AbstractC2327GOs.A0U(this.A06, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A12(parcel, this.A05);
        AudioTrackParams audioTrackParams = this.A03;
        if (audioTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioTrackParams.writeToParcel(parcel, i);
        }
        AudioTranscriptionParam audioTranscriptionParam = this.A00;
        if (audioTranscriptionParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioTranscriptionParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        MusicTrackParams musicTrackParams = this.A01;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        AudioTrackParams audioTrackParams2 = this.A04;
        if (audioTrackParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioTrackParams2.writeToParcel(parcel, i);
        }
        MRl.A0P(parcel, this.A02, i);
        DKH.A12(parcel, this.A06);
    }
}
