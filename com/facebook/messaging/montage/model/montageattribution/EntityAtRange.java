package com.facebook.messaging.montage.model.montageattribution;

import X.11T;
import X.4YV;
import X.4YW;
import X.82M;
import X.C1pq;
import X.C7qx;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EntityAtRange.class */
public final class EntityAtRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(62);
    public final int A00;
    public final int A01;
    public final Entity A02;

    public EntityAtRange(C7qx c7qx) {
        this.A02 = c7qx.A02;
        this.A00 = c7qx.A00;
        this.A01 = c7qx.A01;
    }

    public EntityAtRange(Parcel parcel) {
        this.A02 = parcel.readInt() == 0 ? null : (Entity) parcel.readParcelable(4YV.A0e(this));
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public EntityAtRange(Entity entity, int i, int i2) {
        this.A02 = entity;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EntityAtRange)) {
                return false;
            }
            EntityAtRange entityAtRange = (EntityAtRange) obj;
            if (!11T.A0O(this.A02, entityAtRange.A02) || this.A00 != entityAtRange.A00 || this.A01 != entityAtRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
