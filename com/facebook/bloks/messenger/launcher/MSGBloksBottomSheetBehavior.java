package com.facebook.bloks.messenger.launcher;

import X.11T;
import X.AnonymousClass002;
import X.C04v;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MSGBloksBottomSheetBehavior.class */
public final class MSGBloksBottomSheetBehavior extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(49);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public MSGBloksBottomSheetBehavior() {
        this(true, true, true);
    }

    public MSGBloksBottomSheetBehavior(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MSGBloksBottomSheetBehavior)) {
                return false;
            }
            MSGBloksBottomSheetBehavior mSGBloksBottomSheetBehavior = (MSGBloksBottomSheetBehavior) obj;
            if (this.A00 != mSGBloksBottomSheetBehavior.A00 || this.A01 != mSGBloksBottomSheetBehavior.A01 || this.A02 != mSGBloksBottomSheetBehavior.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass002.A00(this.A00 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
