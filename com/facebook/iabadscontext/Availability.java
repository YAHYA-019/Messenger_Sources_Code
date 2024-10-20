package com.facebook.iabadscontext;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: Availability.class */
public final class Availability extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(94);
    public final List A00;
    public final boolean A01;

    public Availability(List list, boolean z) {
        11T.A0F(list, 2);
        this.A01 = z;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Availability)) {
                return false;
            }
            Availability availability = (Availability) obj;
            if (this.A01 != availability.A01 || !11T.A0O(this.A00, availability.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A00(this.A01 ? 1 : 0) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Availability(isAvailable=");
        A0k.append(this.A01);
        A0k.append(", availabilityConditions=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeStringList(this.A00);
    }
}
