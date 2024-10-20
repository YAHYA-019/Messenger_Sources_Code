package com.facebook.common.util;

import X.C0ph;
import X.F0W;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

/* loaded from: Triplet.class */
public final class Triplet extends ParcelablePair implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0ph(2);
    public final Object A00;

    public Triplet(Parcel parcel) {
        this(F0W.A00(parcel), F0W.A00(parcel), F0W.A00(parcel));
    }

    public Triplet(Object obj, Object obj2, Object obj3) {
        super(obj, obj2);
        this.A00 = obj3;
    }

    @Override // com.facebook.common.util.ParcelablePair
    public Object[] A01() {
        return new Object[]{((Pair) this).first, ((Pair) this).second, this.A00};
    }

    @Override // com.facebook.common.util.ParcelablePair, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
