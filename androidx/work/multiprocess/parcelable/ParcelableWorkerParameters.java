package androidx.work.multiprocess.parcelable;

import X.1BK;
import X.AbF;
import X.C4Kc;
import X.C4Kl;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.Set;
import java.util.UUID;

/* loaded from: ParcelableWorkerParameters.class */
public final class ParcelableWorkerParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(44);
    public final int A00;
    public final int A01;
    public final C4Kc A02;
    public final C4Kl A03;
    public final Set A04;
    public final UUID A05;

    public ParcelableWorkerParameters(Parcel parcel) {
        this.A05 = UUID.fromString(parcel.readString());
        this.A02 = new ParcelableData(parcel).A00;
        this.A04 = AbF.A1E(parcel.createStringArrayList());
        this.A03 = new ParcelableRuntimeExtras(parcel).A00;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public ParcelableWorkerParameters(WorkerParameters workerParameters) {
        this.A05 = workerParameters.A09;
        this.A02 = workerParameters.A02;
        this.A04 = workerParameters.A08;
        this.A03 = workerParameters.A06;
        this.A01 = workerParameters.A01;
        this.A00 = workerParameters.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras, java.lang.Object] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05.toString());
        new ParcelableData(this.A02).writeToParcel(parcel, i);
        parcel.writeStringList(1BK.A17(this.A04));
        C4Kl c4Kl = this.A03;
        ?? obj = new Object();
        obj.A00 = c4Kl;
        obj.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
