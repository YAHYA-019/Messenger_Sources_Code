package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SellTargetData.class */
public final class SellTargetData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(12);
    public final StoryCrossPostSetting A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public SellTargetData(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (StoryCrossPostSetting) parcel.readParcelable(4YV.A0e(this));
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        while (i < readInt2) {
            i = AbH.A00(parcel, strArr2, i);
        }
        this.A02 = ImmutableList.copyOf(strArr2);
    }

    public SellTargetData(StoryCrossPostSetting storyCrossPostSetting, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A00 = storyCrossPostSetting;
        C1pq.A08("storyTargetIds", immutableList);
        this.A01 = immutableList;
        C1pq.A08("targetIds", immutableList2);
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SellTargetData)) {
                return false;
            }
            SellTargetData sellTargetData = (SellTargetData) obj;
            if (!11T.A0O(this.A00, sellTargetData.A00) || !11T.A0O(this.A01, sellTargetData.A01) || !11T.A0O(this.A02, sellTargetData.A02)) {
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
        4YW.A0D(parcel, this.A00, i);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
    }
}
