package com.facebook.ipc.model;

import X.AnonymousClass001;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NuxStep.class */
public class NuxStep implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(59);
    public final int isCurrent;
    public final String name;

    public NuxStep() {
        this.name = null;
        this.isCurrent = 0;
    }

    public NuxStep(Parcel parcel) {
        this.name = parcel.readString();
        this.isCurrent = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NuxStep{name='");
        A0k.append(this.name);
        A0k.append('\'');
        A0k.append(", isCurrent=");
        A0k.append(this.isCurrent);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.isCurrent);
    }
}
