package androidx.work.multiprocess.parcelable;

import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C3098Jj0;
import X.C4Kc;
import X.C4Kq;
import X.C4Kr;
import X.C4P3;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ParcelableResult.class */
public final class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(35);
    public final C4Kr A00;

    public ParcelableResult(C4Kr c4Kr) {
        this.A00 = c4Kr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParcelableResult(Parcel parcel) {
        C4Kr c4Kr;
        int readInt = parcel.readInt();
        C4Kc c4Kc = new ParcelableData(parcel).A00;
        if (readInt == 1) {
            c4Kr = new Object();
        } else if (readInt == 2) {
            c4Kr = new C4P3(c4Kc);
        } else {
            if (readInt != 3) {
                throw 4YV.A0h("Unknown result type ", readInt);
            }
            c4Kr = new C4Kq(c4Kc);
        }
        this.A00 = c4Kr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C4Kr c4Kr = this.A00;
        if (c4Kr instanceof C3098Jj0) {
            i2 = 1;
        } else if (c4Kr instanceof C4P3) {
            i2 = 2;
        } else {
            if (!(c4Kr instanceof C4Kq)) {
                throw 1BL.A0h(c4Kr, "Unknown Result ", AnonymousClass001.A0k());
            }
            i2 = 3;
        }
        parcel.writeInt(i2);
        new ParcelableData(c4Kr.A00()).writeToParcel(parcel, i);
    }
}
