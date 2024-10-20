package com.facebook.messaging.media.download.params;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zV;
import X.AnonymousClass002;
import X.C04v;
import X.CSV;
import X.RVI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: SaveMultipleMediaParams.class */
public final class SaveMultipleMediaParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(16);
    public final Integer A00;
    public final List A01;
    public final boolean A02;

    public SaveMultipleMediaParams(Integer num, List list, boolean z) {
        11T.A0F(num, 2);
        this.A01 = list;
        this.A00 = num;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SaveMultipleMediaParams)) {
                return false;
            }
            SaveMultipleMediaParams saveMultipleMediaParams = (SaveMultipleMediaParams) obj;
            if (!11T.A0O(this.A01, saveMultipleMediaParams.A01) || this.A00 != saveMultipleMediaParams.A00 || this.A02 != saveMultipleMediaParams.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A01);
        Integer num = this.A00;
        return 7zV.A03(num, RVI.A01(num), A03) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A09 = 4YW.A09(parcel, this.A01);
        while (A09.hasNext()) {
            ((SaveMediaParams) A09.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(RVI.A01(this.A00));
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
