package com.google.android.exoplayer2.metadata.mp4;

import X.6Y2;
import X.6Yl;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOn;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: SmtaMetadataEntry.class */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = LGn.A00(50);
    public final float A00;
    public final int A01;

    public SmtaMetadataEntry(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
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
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.A00 != smtaMetadataEntry.A00 || this.A01 != smtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC2327GOs.A08(Float.valueOf(this.A00)) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("smta: captureFrameRate=");
        A0k.append(this.A00);
        A0k.append(", svcTemporalLayerCount=");
        return GOn.A1B(A0k, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
