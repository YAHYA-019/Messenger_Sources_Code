package com.facebook.payments.invoice.creation.v2.model;

import X.11T;
import X.1BJ;
import X.7zU;
import X.AbE;
import X.AbN;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.MediaItem;

/* loaded from: ImageData.class */
public final class ImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(56);
    public final MediaItem A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public ImageData(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A04 = AbN.A1U(parcel);
        this.A00 = parcel.readInt() == 0 ? null : (MediaItem) MediaItem.CREATOR.createFromParcel(parcel);
        this.A03 = parcel.readString();
    }

    public ImageData(MediaItem mediaItem, String str, String str2, String str3) {
        C1pq.A08("imageID", str);
        this.A01 = str;
        C1pq.A08(AbE.A00(178), str2);
        this.A02 = str2;
        this.A04 = false;
        this.A00 = mediaItem;
        C1pq.A08(1BJ.A00(563), str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ImageData)) {
                return false;
            }
            ImageData imageData = (ImageData) obj;
            if (!11T.A0O(this.A01, imageData.A01) || !11T.A0O(this.A02, imageData.A02) || this.A04 != imageData.A04 || !11T.A0O(this.A00, imageData.A00) || !11T.A0O(this.A03, imageData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A01)), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        MediaItem mediaItem = this.A00;
        if (mediaItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
    }
}
