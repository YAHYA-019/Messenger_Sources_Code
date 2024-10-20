package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.Constants;
import java.util.List;

/* renamed from: X.3q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3q8.class */
public abstract class AbstractC01153q8 {
    public static int A00(Parcel parcel) {
        return A01(parcel, 20293);
    }

    public static int A01(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void A02(Bundle bundle, Parcel parcel, int i) {
        if (bundle != null) {
            int A01 = A01(parcel, i);
            parcel.writeBundle(bundle);
            A03(parcel, A01);
        }
    }

    public static void A03(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void A04(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        parcel.writeInt(i2);
    }

    public static void A05(Parcel parcel, int i, long j) {
        parcel.writeInt(i | Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        parcel.writeLong(j);
    }

    public static void A06(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A07(Parcel parcel, Parcelable parcelable, int i, int i2) {
        if (parcelable != null) {
            int A01 = A01(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A03(parcel, A01);
        }
    }

    public static void A08(Parcel parcel, String str, int i) {
        if (str != null) {
            int A01 = A01(parcel, i);
            parcel.writeString(str);
            A03(parcel, A01);
        }
    }

    public static void A09(Parcel parcel, List list, int i) {
        if (list != null) {
            int A01 = A01(parcel, i);
            parcel.writeStringList(list);
            A03(parcel, A01);
        }
    }

    public static void A0A(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int A01 = A01(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                A03(parcel, A01);
                return;
            }
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
            i2 = i3 + 1;
        }
    }

    public static void A0B(Parcel parcel, byte[] bArr, int i) {
        if (bArr != null) {
            int A01 = A01(parcel, i);
            parcel.writeByteArray(bArr);
            A03(parcel, A01);
        }
    }

    public static void A0C(Parcel parcel, Parcelable[] parcelableArr, int i, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int A01 = A01(parcel, i);
        int length = parcelableArr.length;
        parcel.writeInt(length);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                A03(parcel, A01);
                return;
            }
            Parcelable parcelable = parcelableArr[i4];
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
            i3 = i4 + 1;
        }
    }
}
