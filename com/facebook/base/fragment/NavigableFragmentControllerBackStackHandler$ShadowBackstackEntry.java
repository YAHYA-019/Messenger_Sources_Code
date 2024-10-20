package com.facebook.base.fragment;

import X.AbN;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NavigableFragmentControllerBackStackHandler$ShadowBackstackEntry.class */
public final class NavigableFragmentControllerBackStackHandler$ShadowBackstackEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(47);
    public final String A00;
    public final boolean A01;

    public NavigableFragmentControllerBackStackHandler$ShadowBackstackEntry(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = AbN.A1U(parcel);
    }

    public NavigableFragmentControllerBackStackHandler$ShadowBackstackEntry(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
