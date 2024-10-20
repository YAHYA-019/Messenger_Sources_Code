package com.facebook.messaging.montage.util.colors;

import X.07I;
import X.11T;
import X.CST;
import X.GOn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: MontageBackgroundColor.class */
public final class MontageBackgroundColor implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(31);
    public int A00;
    public int[] A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageBackgroundColor)) {
                return false;
            }
            MontageBackgroundColor montageBackgroundColor = (MontageBackgroundColor) obj;
            if (this.A00 != montageBackgroundColor.A00) {
                return false;
            }
            int[] iArr = this.A01;
            int length = iArr.length;
            int[] iArr2 = montageBackgroundColor.A01;
            if (length != iArr2.length) {
                return false;
            }
            Collection A1M = GOn.A1M(0, length - 1);
            if (!(A1M instanceof Collection) || !A1M.isEmpty()) {
                07I it = A1M.iterator();
                while (it.hasNext()) {
                    int A00 = it.A00();
                    if (iArr[A00] != iArr2[A00]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public String toString() {
        int[] iArr = this.A01;
        int length = iArr.length;
        String[] strArr = new String[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                String arrays = Arrays.toString(strArr);
                11T.A0A(arrays);
                return arrays;
            }
            strArr[i2] = Integer.toHexString(iArr[i2]);
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        int[] iArr = this.A01;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.A00);
    }
}
