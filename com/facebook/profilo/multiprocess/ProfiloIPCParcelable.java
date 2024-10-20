package com.facebook.profilo.multiprocess;

import X.C0ph;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProfiloIPCParcelable.class */
public final class ProfiloIPCParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0ph(3);
    public final IBinder A00;

    public ProfiloIPCParcelable(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public ProfiloIPCParcelable(Parcel parcel) {
        this.A00 = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00);
    }
}
