package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BJ;
import X.1BL;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoMediaStickerMeta.class */
public final class VideoMediaStickerMeta implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(60);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public VideoMediaStickerMeta(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public VideoMediaStickerMeta(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoMediaStickerMeta)) {
                return false;
            }
            VideoMediaStickerMeta videoMediaStickerMeta = (VideoMediaStickerMeta) obj;
            if (!11T.A0O(this.A01, videoMediaStickerMeta.A01) || !11T.A0O(this.A02, videoMediaStickerMeta.A02) || !11T.A0O(this.A00, videoMediaStickerMeta.A00) || !11T.A0O(this.A03, videoMediaStickerMeta.A03) || !11T.A0O(this.A04, videoMediaStickerMeta.A04) || !11T.A0O(this.A05, videoMediaStickerMeta.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoMediaStickerMeta{id=");
        A0k.append(this.A01);
        A0k.append(", imageAssetId=");
        A0k.append(this.A02);
        A0k.append(1BJ.A00(63));
        A0k.append(this.A00);
        A0k.append(", name=");
        A0k.append(this.A03);
        A0k.append(", style=");
        A0k.append(this.A04);
        A0k.append(", type=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        C3o5.A0f(parcel, this.A00);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
