package com.facebook.messaging.encryptedbackups.hsm.ui.viewdata;

import X.11T;
import X.7zL;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PinSetupViewData$FragmentResult.class */
public final class PinSetupViewData$FragmentResult extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(41);
    public final int A00;
    public final boolean A01;

    public PinSetupViewData$FragmentResult(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PinSetupViewData$FragmentResult)) {
                return false;
            }
            PinSetupViewData$FragmentResult pinSetupViewData$FragmentResult = (PinSetupViewData$FragmentResult) obj;
            if (this.A00 != pinSetupViewData$FragmentResult.A00 || this.A01 != pinSetupViewData$FragmentResult.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
