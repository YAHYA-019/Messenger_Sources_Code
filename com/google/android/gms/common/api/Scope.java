package com.google.android.gms.common.api;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: Scope.class */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new LGn(79);
    public final int A00;
    public final String A01;

    public Scope(int i, String str) {
        AbstractC00481b7.A06(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.A01.equals(((Scope) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A08(parcel, this.A01, 2);
        AbstractC01153q8.A03(parcel, A01);
    }
}
