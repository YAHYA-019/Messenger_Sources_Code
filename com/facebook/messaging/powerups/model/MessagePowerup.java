package com.facebook.messaging.powerups.model;

import X.5aU;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MessagePowerup.class */
public final class MessagePowerup implements Parcelable {
    public static volatile 5aU A02;
    public static final Parcelable.Creator CREATOR = new 82M(78);
    public final 5aU A00;
    public final Set A01;

    public MessagePowerup(5aU r302, Set set) {
        this.A00 = r302;
        this.A01 = Collections.unmodifiableSet(set);
    }

    public MessagePowerup(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readInt() == 0 ? null : 5aU.values()[parcel.readInt()];
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
    }

    public 5aU A00() {
        if (this.A01.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A00;
        }
        if (A02 == null) {
            synchronized (this) {
                if (A02 == null) {
                    A02 = 5aU.A0G;
                }
            }
        }
        return A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessagePowerup) && A00() == ((MessagePowerup) obj).A00());
    }

    public int hashCode() {
        5aU A00 = A00();
        return (A00 == null ? -1 : A00.ordinal()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        5aU r0 = this.A00;
        if (r0 == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = r0.ordinal();
        }
        parcel.writeInt(ordinal);
        Set set = this.A01;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }
}
