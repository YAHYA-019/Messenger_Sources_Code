package androidx.work.multiprocess.parcelable;

import X.11T;
import X.1BK;
import X.7zT;
import X.AnonymousClass001;
import X.C4Ka;
import X.C4Kb;
import X.C4Kc;
import X.C4Ke;
import X.Ktq;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: ParcelableWorkInfo.class */
public final class ParcelableWorkInfo implements Parcelable {
    public static final String[] A01 = new String[0];
    public static final Parcelable.Creator CREATOR = LGo.A00(39);
    public final Ktq A00;

    public ParcelableWorkInfo(Ktq ktq) {
        this.A00 = ktq;
    }

    public ParcelableWorkInfo(Parcel parcel) {
        UUID fromString = UUID.fromString(parcel.readString());
        C4Kb A02 = C4Ka.A02(parcel.readInt());
        C4Kc c4Kc = new ParcelableData(parcel).A00;
        HashSet A0w = AnonymousClass001.A0w(parcel.createStringArray());
        C4Kc c4Kc2 = new ParcelableData(parcel).A00;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        7zT.A1T(fromString, A02, c4Kc);
        11T.A0F(c4Kc2, 5);
        this.A00 = new Ktq(C4Ke.A08, c4Kc, c4Kc2, null, A02, A0w, fromString, readInt, readInt2, -256, 0L, Long.MAX_VALUE);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Ktq ktq = this.A00;
        parcel.writeString(ktq.A06.toString());
        parcel.writeInt(C4Ka.A00(ktq.A04));
        new ParcelableData(ktq.A02).writeToParcel(parcel, i);
        parcel.writeStringArray((String[]) 1BK.A17(ktq.A05).toArray(A01));
        new ParcelableData(ktq.A03).writeToParcel(parcel, i);
        parcel.writeInt(ktq.A01);
        parcel.writeInt(ktq.A00);
    }
}
