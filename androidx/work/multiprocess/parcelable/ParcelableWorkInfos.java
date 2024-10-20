package androidx.work.multiprocess.parcelable;

import X.4YV;
import X.AnonymousClass001;
import X.Ktq;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: ParcelableWorkInfos.class */
public final class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(40);
    public final List A00;

    public ParcelableWorkInfos(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(4YV.A0e(this));
        int length = readParcelableArray.length;
        this.A00 = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            this.A00.add(((ParcelableWorkInfo) readParcelableArray[i2]).A00);
            i = i2 + 1;
        }
    }

    public ParcelableWorkInfos(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[list.size()];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                parcel.writeParcelableArray(parcelableWorkInfoArr, i);
                return;
            } else {
                parcelableWorkInfoArr[i3] = new ParcelableWorkInfo((Ktq) list.get(i3));
                i2 = i3 + 1;
            }
        }
    }
}
