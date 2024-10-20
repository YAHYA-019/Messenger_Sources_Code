package androidx.work.multiprocess.parcelable;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* loaded from: ParcelableRemoteWorkRequest.class */
public final class ParcelableRemoteWorkRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(34);
    public final ParcelableWorkerParameters A00;
    public final String A01;

    public ParcelableRemoteWorkRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new ParcelableWorkerParameters(parcel);
    }

    public ParcelableRemoteWorkRequest(WorkerParameters workerParameters, String str) {
        this.A01 = str;
        this.A00 = new ParcelableWorkerParameters(workerParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }
}
