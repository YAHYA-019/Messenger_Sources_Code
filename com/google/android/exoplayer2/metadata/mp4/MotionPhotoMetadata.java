package com.google.android.exoplayer2.metadata.mp4;

import X.6Y2;
import X.6Yl;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKB;
import X.GOm;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: MotionPhotoMetadata.class */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(47);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void CXq(6Y2 r302) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.A02 != motionPhotoMetadata.A02 || this.A01 != motionPhotoMetadata.A01 || this.A00 != motionPhotoMetadata.A00 || this.A04 != motionPhotoMetadata.A04 || this.A03 != motionPhotoMetadata.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        return AnonymousClass002.A03(this.A03, AnonymousClass002.A02(this.A04, AnonymousClass002.A02(this.A00, AnonymousClass002.A02(this.A01, AbstractC2326GOr.A03((int) (j ^ (j >>> 32)))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Motion photo metadata: photoStartPosition=");
        A0k.append(this.A02);
        A0k.append(DKB.A00(ActionId.ASNYC_FAILED));
        A0k.append(this.A01);
        A0k.append(", photoPresentationTimestampUs=");
        A0k.append(this.A00);
        A0k.append(", videoStartPosition=");
        A0k.append(this.A04);
        A0k.append(GOm.A00(ActionId.LEGACY_MARKER));
        return AnonymousClass001.A0h(A0k, this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
