package com.facebook.ipc.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.InspirationVideoSegment;
import com.google.common.collect.ImmutableList;

/* loaded from: SmartTrimTrimmerBackupData.class */
public final class SmartTrimTrimmerBackupData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(43);
    public final InspirationVideoSegment A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public SmartTrimTrimmerBackupData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt() == 0 ? null : (InspirationVideoSegment) InspirationVideoSegment.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        InspirationEditingData[] inspirationEditingDataArr = new InspirationEditingData[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationEditingDataArr, i2);
        }
        this.A01 = ImmutableList.copyOf(inspirationEditingDataArr);
        int readInt2 = parcel.readInt();
        InspirationEditingData[] inspirationEditingDataArr2 = new InspirationEditingData[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, inspirationEditingDataArr2, i);
        }
        this.A02 = ImmutableList.copyOf(inspirationEditingDataArr2);
    }

    public SmartTrimTrimmerBackupData(InspirationVideoSegment inspirationVideoSegment, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A00 = inspirationVideoSegment;
        C1pq.A08("redoStack", immutableList);
        this.A01 = immutableList;
        C1pq.A08("undoStack", immutableList2);
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SmartTrimTrimmerBackupData)) {
                return false;
            }
            SmartTrimTrimmerBackupData smartTrimTrimmerBackupData = (SmartTrimTrimmerBackupData) obj;
            if (!11T.A0O(this.A00, smartTrimTrimmerBackupData.A00) || !11T.A0O(this.A01, smartTrimTrimmerBackupData.A01) || !11T.A0O(this.A02, smartTrimTrimmerBackupData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationVideoSegment inspirationVideoSegment = this.A00;
        if (inspirationVideoSegment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationVideoSegment.writeToParcel(parcel, i);
        }
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationEditingData) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationEditingData) A0b2.next(), i);
        }
    }
}
