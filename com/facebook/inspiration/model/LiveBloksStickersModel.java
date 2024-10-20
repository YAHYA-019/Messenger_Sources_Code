package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbF;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: LiveBloksStickersModel.class */
public final class LiveBloksStickersModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(88);
    public final ImmutableList A00;
    public final String A01;

    public LiveBloksStickersModel(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
    }

    public LiveBloksStickersModel(ImmutableList immutableList, String str) {
        AbF.A1T(str);
        this.A01 = str;
        C1pq.A08("responseIds", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveBloksStickersModel)) {
                return false;
            }
            LiveBloksStickersModel liveBloksStickersModel = (LiveBloksStickersModel) obj;
            if (!11T.A0O(this.A01, liveBloksStickersModel.A01) || !11T.A0O(this.A00, liveBloksStickersModel.A00)) {
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
        parcel.writeString(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
    }
}
