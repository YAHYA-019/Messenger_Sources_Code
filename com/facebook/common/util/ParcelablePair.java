package com.facebook.common.util;

import X.0Pz;
import X.4nW;
import X.AnonymousClass001;
import X.C0ph;
import X.F0W;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: ParcelablePair.class */
public class ParcelablePair extends Pair implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C0ph(1);

    public ParcelablePair(Parcel parcel) {
        super(F0W.A00(parcel), F0W.A00(parcel));
    }

    public static 4nW A00(Object... objArr) {
        return new 4nW(objArr);
    }

    public Object[] A01() {
        return new Object[]{((Pair) this).first, ((Pair) this).second};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.util.Pair
    public boolean equals(Object obj) {
        if (obj instanceof ParcelablePair) {
            return Arrays.equals(A01(), ((ParcelablePair) obj).A01());
        }
        return false;
    }

    @Override // android.util.Pair
    public int hashCode() {
        return Arrays.hashCode(A01());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return A00(A01());
    }

    @Override // android.util.Pair
    public String toString() {
        return 0Pz.A0W(AnonymousClass001.A0X(this), Arrays.toString(A01()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(((Pair) this).first);
        parcel.writeValue(((Pair) this).second);
    }
}
