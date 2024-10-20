package androidx.work.multiprocess.parcelable;

import X.0QD;
import X.11T;
import X.4UJ;
import X.7zL;
import X.AbN;
import X.C4Ka;
import X.C4Ke;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: ParcelableConstraints.class */
public final class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(30);
    public final C4Ke A00;

    public ParcelableConstraints(C4Ke c4Ke) {
        this.A00 = c4Ke;
    }

    public ParcelableConstraints(Parcel parcel) {
        LinkedHashSet A15 = 7zL.A15();
        Integer A04 = C4Ka.A04(parcel.readInt());
        11T.A0F(A04, 0);
        boolean A1U = AbN.A1U(parcel);
        boolean A1U2 = AbN.A1U(parcel);
        boolean A1U3 = AbN.A1U(parcel);
        boolean A1U4 = AbN.A1U(parcel);
        if (parcel.readInt() == 1) {
            for (4UJ r0 : C4Ka.A06(parcel.createByteArray())) {
                A15.add(new 4UJ(r0.A01, r0.A00));
            }
        }
        long readLong = parcel.readLong();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(readLong);
        this.A00 = new C4Ke(A04, 0QD.A0f(A15), timeUnit.toMillis(parcel.readLong()), millis, A1U2, A1U4, A1U, A1U3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4Ke c4Ke = this.A00;
        parcel.writeInt(C4Ka.A01(c4Ke.A02));
        parcel.writeInt(c4Ke.A04 ? 1 : 0);
        parcel.writeInt(c4Ke.A05 ? 1 : 0);
        parcel.writeInt(c4Ke.A07 ? 1 : 0);
        parcel.writeInt(c4Ke.A06 ? 1 : 0);
        int i2 = 1;
        Set set = c4Ke.A03;
        if (!(!set.isEmpty())) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeByteArray(C4Ka.A07(set));
        }
        parcel.writeLong(c4Ke.A00);
        parcel.writeLong(c4Ke.A01);
    }
}
