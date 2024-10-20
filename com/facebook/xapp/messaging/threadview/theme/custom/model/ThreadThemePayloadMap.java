package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YU;
import X.4YV;
import X.82N;
import X.AnonymousClass001;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ThreadThemePayloadMap.class */
public final class ThreadThemePayloadMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(39);
    public final ImmutableMap A00;

    public ThreadThemePayloadMap(Parcel parcel) {
        ImmutableMap copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                A0u.put(parcel.readString(), parcel.readParcelable(A0e));
                i = i2 + 1;
            }
            copyOf = ImmutableMap.copyOf((Map) A0u);
        }
        this.A00 = copyOf;
    }

    public ThreadThemePayloadMap(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadThemePayloadMap) && 11T.A0O(this.A00, ((ThreadThemePayloadMap) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ThreadThemePayloadMap{map=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(immutableMap.size());
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeParcelable((Parcelable) A0z.getValue(), i);
        }
    }
}
