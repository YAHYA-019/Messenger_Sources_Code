package com.facebook.messaging.communitymessaging.threadbans.data;

import X.11T;
import X.7zL;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ThreadBansModel.class */
public final class ThreadBansModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(10);
    public final int A00;

    public ThreadBansModel() {
        this(0);
    }

    public ThreadBansModel(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadBansModel) && this.A00 == ((ThreadBansModel) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
    }
}
