package com.facebook.inspiration.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationTimelineEditorBackupData.class */
public final class InspirationTimelineEditorBackupData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(69);
    public final InspirationMultiCaptureState A00;
    public final InspirationVideoEditingData A01;
    public final ImmutableList A02;

    public InspirationTimelineEditorBackupData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationVideoEditingData inspirationVideoEditingData = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            InspirationOverlayParamsHolder[] inspirationOverlayParamsHolderArr = new InspirationOverlayParamsHolder[readInt];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                } else {
                    i = DKG.A02(parcel, InspirationOverlayParamsHolder.CREATOR, inspirationOverlayParamsHolderArr, i2);
                }
            }
            this.A02 = ImmutableList.copyOf(inspirationOverlayParamsHolderArr);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationMultiCaptureState) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (InspirationVideoEditingData) parcel.readParcelable(A0e) : inspirationVideoEditingData;
    }

    public InspirationTimelineEditorBackupData(InspirationMultiCaptureState inspirationMultiCaptureState, InspirationVideoEditingData inspirationVideoEditingData, ImmutableList immutableList) {
        this.A02 = immutableList;
        this.A00 = inspirationMultiCaptureState;
        this.A01 = inspirationVideoEditingData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTimelineEditorBackupData)) {
                return false;
            }
            InspirationTimelineEditorBackupData inspirationTimelineEditorBackupData = (InspirationTimelineEditorBackupData) obj;
            if (!11T.A0O(this.A02, inspirationTimelineEditorBackupData.A02) || !11T.A0O(this.A00, inspirationTimelineEditorBackupData.A00) || !11T.A0O(this.A01, inspirationTimelineEditorBackupData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((InspirationOverlayParamsHolder) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
    }
}
