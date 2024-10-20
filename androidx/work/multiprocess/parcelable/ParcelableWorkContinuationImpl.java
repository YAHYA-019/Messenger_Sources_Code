package androidx.work.multiprocess.parcelable;

import X.0S2;
import X.JQz;
import X.JRe;
import X.L0C;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: ParcelableWorkContinuationImpl.class */
public final class ParcelableWorkContinuationImpl implements Parcelable {
    public static final Integer[] A01 = 0S2.A00(4);
    public static final Parcelable.Creator CREATOR = LGo.A00(38);
    public L0C A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.os.Parcelable, java.lang.Object, androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        L0C l0c = this.A00;
        String str = l0c.A02;
        int i2 = !TextUtils.isEmpty(str) ? 1 : 0;
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeString(str);
        }
        JQz.A16(parcel, l0c.A01);
        List list = l0c.A03;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                parcel.writeParcelable(new ParcelableWorkRequest((JRe) list.get(i3)), i);
            }
        }
        List list2 = l0c.A00;
        int i4 = (list2 == null || list2.isEmpty()) ? 0 : 1;
        parcel.writeInt(i4);
        if (i4 != 0) {
            parcel.writeInt(list2.size());
            for (int i5 = 0; i5 < list2.size(); i5++) {
                L0C l0c2 = (L0C) list2.get(i5);
                ?? obj = new Object();
                obj.A00 = l0c2;
                parcel.writeParcelable(obj, i);
            }
        }
    }
}
