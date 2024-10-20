package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BL;
import X.AbM;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKW;
import X.RUk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.caption.InspirationCaptionStickerInfo;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;

/* loaded from: RelativeImageOverlayParams.class */
public final class RelativeImageOverlayParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(20);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final InspirationCaptionStickerInfo A05;
    public final InspirationMusicStickerInfo A06;
    public final InspirationTimedElementParams A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public RelativeImageOverlayParams(RUk rUk) {
        this.A05 = rUk.A05;
        this.A0B = rUk.A0B;
        this.A00 = rUk.A00;
        this.A01 = rUk.A01;
        this.A06 = rUk.A06;
        this.A02 = rUk.A02;
        this.A08 = rUk.A08;
        this.A07 = rUk.A07;
        this.A03 = rUk.A03;
        this.A09 = rUk.A09;
        this.A0A = rUk.A0A;
        this.A04 = rUk.A04;
    }

    public RelativeImageOverlayParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InspirationCaptionStickerInfo) InspirationCaptionStickerInfo.CREATOR.createFromParcel(parcel);
        }
        this.A0B = AbN.A1U(parcel);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InspirationMusicStickerInfo) InspirationMusicStickerInfo.CREATOR.createFromParcel(parcel);
        }
        this.A02 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (InspirationTimedElementParams) InspirationTimedElementParams.CREATOR.createFromParcel(parcel);
        }
        this.A03 = parcel.readFloat();
        this.A09 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0A = C3o5.A0O(parcel);
        this.A04 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RelativeImageOverlayParams)) {
                return false;
            }
            RelativeImageOverlayParams relativeImageOverlayParams = (RelativeImageOverlayParams) obj;
            if (!11T.A0O(this.A05, relativeImageOverlayParams.A05) || this.A0B != relativeImageOverlayParams.A0B || this.A00 != relativeImageOverlayParams.A00 || this.A01 != relativeImageOverlayParams.A01 || !11T.A0O(this.A06, relativeImageOverlayParams.A06) || this.A02 != relativeImageOverlayParams.A02 || !11T.A0O(this.A08, relativeImageOverlayParams.A08) || !11T.A0O(this.A07, relativeImageOverlayParams.A07) || this.A03 != relativeImageOverlayParams.A03 || !11T.A0O(this.A09, relativeImageOverlayParams.A09) || !11T.A0O(this.A0A, relativeImageOverlayParams.A0A) || this.A04 != relativeImageOverlayParams.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(C1pq.A04(this.A0A, C1pq.A04(this.A09, AbM.A00(C1pq.A04(this.A07, C1pq.A04(this.A08, AbM.A00(C1pq.A04(this.A06, AbM.A00(AbM.A00(C1pq.A02(C1pq.A03(this.A05), this.A0B), this.A00), this.A01)), this.A02))), this.A03))), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationCaptionStickerInfo inspirationCaptionStickerInfo = this.A05;
        if (inspirationCaptionStickerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationCaptionStickerInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        InspirationMusicStickerInfo inspirationMusicStickerInfo = this.A06;
        if (inspirationMusicStickerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationMusicStickerInfo.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A02);
        1BL.A13(parcel, this.A08);
        InspirationTimedElementParams inspirationTimedElementParams = this.A07;
        if (inspirationTimedElementParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTimedElementParams.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A03);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        parcel.writeFloat(this.A04);
    }
}
