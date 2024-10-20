package androidx.work.multiprocess.parcelable;

import X.11T;
import X.1BK;
import X.1BL;
import X.AbF;
import X.AbN;
import X.C4Ka;
import X.C4Kf;
import X.JRe;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: ParcelableWorkRequest.class */
public final class ParcelableWorkRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(42);
    public final JRe A00;

    public ParcelableWorkRequest(JRe jRe) {
        this.A00 = jRe;
    }

    public ParcelableWorkRequest(Parcel parcel) {
        String readString = parcel.readString();
        HashSet A1E = AbF.A1E(parcel.createStringArrayList());
        C4Kf c4Kf = new C4Kf(readString, parcel.readString());
        c4Kf.A0H = parcel.readString();
        c4Kf.A0E = C4Ka.A02(parcel.readInt());
        c4Kf.A0C = new ParcelableData(parcel).A00;
        c4Kf.A0D = new ParcelableData(parcel).A00;
        c4Kf.A05 = parcel.readLong();
        c4Kf.A06 = parcel.readLong();
        c4Kf.A04 = parcel.readLong();
        c4Kf.A02 = parcel.readInt();
        c4Kf.A0B = ((ParcelableConstraints) 1BL.A0C(parcel, getClass())).A00;
        c4Kf.A0F = C4Ka.A03(parcel.readInt());
        c4Kf.A03 = parcel.readLong();
        c4Kf.A08 = parcel.readLong();
        c4Kf.A0A = parcel.readLong();
        c4Kf.A0J = AbN.A1U(parcel);
        c4Kf.A0G = C4Ka.A05(parcel.readInt());
        this.A00 = new JRe(c4Kf, A1E, UUID.fromString(readString));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JRe jRe = this.A00;
        parcel.writeString(11T.A02(jRe.A02));
        parcel.writeStringList(1BK.A17(jRe.A01));
        C4Kf c4Kf = jRe.A00;
        parcel.writeString(c4Kf.A0I);
        parcel.writeString(c4Kf.A0H);
        parcel.writeInt(C4Ka.A00(c4Kf.A0E));
        new ParcelableData(c4Kf.A0C).writeToParcel(parcel, i);
        new ParcelableData(c4Kf.A0D).writeToParcel(parcel, i);
        parcel.writeLong(c4Kf.A05);
        parcel.writeLong(c4Kf.A06);
        parcel.writeLong(c4Kf.A04);
        parcel.writeInt(c4Kf.A02);
        parcel.writeParcelable(new ParcelableConstraints(c4Kf.A0B), i);
        int intValue = c4Kf.A0F.intValue();
        int i2 = 1;
        if (intValue == 0) {
            i2 = 0;
        } else if (intValue != 1) {
            throw 1BK.A1F();
        }
        parcel.writeInt(i2);
        parcel.writeLong(c4Kf.A03);
        parcel.writeLong(c4Kf.A08);
        parcel.writeLong(c4Kf.A0A);
        parcel.writeInt(c4Kf.A0J ? 1 : 0);
        int intValue2 = c4Kf.A0G.intValue();
        int i3 = 1;
        if (intValue2 == 0) {
            i3 = 0;
        } else if (intValue2 != 1) {
            throw 1BK.A1F();
        }
        parcel.writeInt(i3);
    }
}
