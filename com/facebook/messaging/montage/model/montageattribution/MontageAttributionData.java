package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.C4Ny;
import X.HeG;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MontageAttributionData.class */
public final class MontageAttributionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(27);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public MontageAttributionData(HeG heG) {
        this.A00 = heG.A00;
        this.A01 = heG.A01;
        this.A02 = heG.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MontageAttributionData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            ImageAtRange[] imageAtRangeArr = new ImageAtRange[readInt];
            for (int i = 0; i < readInt; i++) {
                imageAtRangeArr[i] = parcel.readParcelable(classLoader);
            }
            this.A00 = ImmutableList.copyOf(imageAtRangeArr);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            EntityAtRange[] entityAtRangeArr = new EntityAtRange[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                entityAtRangeArr[i2] = parcel.readParcelable(classLoader);
            }
            immutableList = ImmutableList.copyOf(entityAtRangeArr);
        }
        this.A01 = immutableList;
        this.A02 = C3o5.A0O(parcel);
    }

    public MontageAttributionData(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageAttributionData)) {
                return false;
            }
            MontageAttributionData montageAttributionData = (MontageAttributionData) obj;
            if (!11T.A0O(this.A00, montageAttributionData.A00) || !11T.A0O(this.A01, montageAttributionData.A01) || !11T.A0O(this.A02, montageAttributionData.A02)) {
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
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeParcelable((ImageAtRange) A0b.next(), i);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                parcel.writeParcelable((EntityAtRange) A0b2.next(), i);
            }
        }
        1BL.A13(parcel, this.A02);
    }
}
