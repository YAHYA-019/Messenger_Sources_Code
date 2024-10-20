package com.facebook.ipc.inspiration.model.zoomcrop;

import X.1BM;
import X.AbG;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.CSR;
import X.GKk;
import X.RZS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationZoomCropParams.class */
public final class InspirationZoomCropParams implements Parcelable, GKk {
    public static final Parcelable.Creator CREATOR = new CSR(44);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public InspirationZoomCropParams(RZS rzs) {
        this.A00 = rzs.A00;
        this.A01 = rzs.A01;
        this.A08 = rzs.A08;
        this.A09 = rzs.A09;
        this.A0A = rzs.A0A;
        this.A02 = rzs.A02;
        this.A06 = rzs.A06;
        this.A07 = rzs.A07;
        this.A03 = rzs.A03;
        this.A04 = rzs.A04;
        this.A05 = rzs.A05;
    }

    public InspirationZoomCropParams(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = 1BM.A07(parcel);
        this.A0A = AbJ.A1W(parcel);
        this.A02 = parcel.readFloat();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A05 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationZoomCropParams)) {
                return false;
            }
            InspirationZoomCropParams inspirationZoomCropParams = (InspirationZoomCropParams) obj;
            if (this.A00 != inspirationZoomCropParams.A00 || this.A01 != inspirationZoomCropParams.A01 || this.A08 != inspirationZoomCropParams.A08 || this.A09 != inspirationZoomCropParams.A09 || this.A0A != inspirationZoomCropParams.A0A || this.A02 != inspirationZoomCropParams.A02 || this.A06 != inspirationZoomCropParams.A06 || this.A07 != inspirationZoomCropParams.A07 || this.A03 != inspirationZoomCropParams.A03 || this.A04 != inspirationZoomCropParams.A04 || this.A05 != inspirationZoomCropParams.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(AbM.A00(AbM.A00((((AbM.A00(C1pq.A02(C1pq.A02(C1pq.A02(AbM.A00(Float.floatToIntBits(this.A00) + 31, this.A01), this.A08), this.A09), this.A0A), this.A02) * 31) + this.A06) * 31) + this.A07, this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
    }
}
