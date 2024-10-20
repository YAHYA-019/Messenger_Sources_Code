package com.facebook.messaging.integrity.frx.ui.nav;

import X.11T;
import X.AnonymousClass001;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: FRXNavState.class */
public final class FRXNavState implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(5);
    public final ArrayList A00;

    public FRXNavState() {
        this.A00 = AnonymousClass001.A0s();
    }

    public FRXNavState(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(FRXPage.CREATOR);
        this.A00 = createTypedArrayList == null ? AnonymousClass001.A0s() : createTypedArrayList;
    }

    public final void A00() {
        ArrayList arrayList = this.A00;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FRXNavState) {
            return 11T.A0O(this.A00, ((FRXNavState) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeTypedList(this.A00);
    }
}
