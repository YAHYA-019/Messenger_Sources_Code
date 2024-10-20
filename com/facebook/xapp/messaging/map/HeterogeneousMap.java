package com.facebook.xapp.messaging.map;

import X.11T;
import X.AnonymousClass207;
import X.C1zz;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: HeterogeneousMap.class */
public final class HeterogeneousMap implements Parcelable {
    public static final C1zz A01 = new Object();
    public static final HeterogeneousMap A02 = C1zz.A00().A00();
    public static final Parcelable.Creator CREATOR = new C2xc(64);
    public final Map A00;

    public HeterogeneousMap(Map map) {
        this.A00 = map;
    }

    public final Object A00(AnonymousClass207 anonymousClass207) {
        11T.A0F(anonymousClass207, 0);
        return anonymousClass207.A00.cast(this.A00.get(anonymousClass207.A01));
    }

    public final Object A01(AnonymousClass207 anonymousClass207, Object obj) {
        11T.A0F(anonymousClass207, 0);
        Object A00 = A00(anonymousClass207);
        return A00 != null ? A00 : obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeterogeneousMap) {
            return 11T.A0O(this.A00, ((HeterogeneousMap) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeMap(this.A00);
    }
}
