package com.google.firebase.iid;

import X.AnonymousClass001;
import X.LGm;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: zzm.class */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(83);
    public Messenger A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        NullPointerException A0Q;
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger != null) {
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((zzm) obj).A00;
                if (messenger2 != null) {
                    return binder.equals(messenger2.getBinder());
                }
                A0Q = AnonymousClass001.A0Q("asBinder");
            } else {
                A0Q = AnonymousClass001.A0Q("asBinder");
            }
            throw A0Q;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        Messenger messenger = this.A00;
        if (messenger != null) {
            return messenger.getBinder().hashCode();
        }
        throw AnonymousClass001.A0Q("asBinder");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger == null) {
            throw AnonymousClass001.A0Q("asBinder");
        }
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
