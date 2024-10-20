package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.1BL;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.Haw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Entity.class */
public final class Entity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(61);
    public final String A00;
    public final String A01;

    public Entity(Haw haw) {
        this.A00 = haw.A00;
        this.A01 = haw.A01;
    }

    public Entity(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    public Entity(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Entity)) {
                return false;
            }
            Entity entity = (Entity) obj;
            if (!11T.A0O(this.A00, entity.A00) || !11T.A0O(this.A01, entity.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}