package com.facebook.messaging.model.send;

import X.1BL;
import X.C2mh;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PendingSendQueueKey.class */
public final class PendingSendQueueKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(26);
    public final C2mh A00;
    public final ThreadKey A01;

    public PendingSendQueueKey(C2mh c2mh, ThreadKey threadKey) {
        threadKey.getClass();
        c2mh.getClass();
        this.A01 = threadKey;
        this.A00 = c2mh;
    }

    public PendingSendQueueKey(Parcel parcel) {
        this.A01 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A00 = (C2mh) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PendingSendQueueKey pendingSendQueueKey = (PendingSendQueueKey) obj;
            if (this.A00 != pendingSendQueueKey.A00 || !this.A01.equals(pendingSendQueueKey.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeSerializable(this.A00);
    }
}
