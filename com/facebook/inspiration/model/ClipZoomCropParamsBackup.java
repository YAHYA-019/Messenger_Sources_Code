package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.google.common.collect.ImmutableList;

/* loaded from: ClipZoomCropParamsBackup.class */
public final class ClipZoomCropParamsBackup implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(40);
    public final InspirationZoomCropParams A00;
    public final ImmutableList A01;

    public ClipZoomCropParamsBackup(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        InspirationVideoCropParams[] inspirationVideoCropParamsArr = new InspirationVideoCropParams[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, inspirationVideoCropParamsArr, i);
        }
        this.A01 = ImmutableList.copyOf(inspirationVideoCropParamsArr);
        this.A00 = parcel.readInt() == 0 ? null : (InspirationZoomCropParams) InspirationZoomCropParams.CREATOR.createFromParcel(parcel);
    }

    public ClipZoomCropParamsBackup(InspirationZoomCropParams inspirationZoomCropParams, ImmutableList immutableList) {
        C1pq.A08("videoCropParams", immutableList);
        this.A01 = immutableList;
        this.A00 = inspirationZoomCropParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ClipZoomCropParamsBackup)) {
                return false;
            }
            ClipZoomCropParamsBackup clipZoomCropParamsBackup = (ClipZoomCropParamsBackup) obj;
            if (!11T.A0O(this.A01, clipZoomCropParamsBackup.A01) || !11T.A0O(this.A00, clipZoomCropParamsBackup.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoCropParams) A0b.next(), i);
        }
        InspirationZoomCropParams inspirationZoomCropParams = this.A00;
        if (inspirationZoomCropParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationZoomCropParams.writeToParcel(parcel, i);
        }
    }
}
