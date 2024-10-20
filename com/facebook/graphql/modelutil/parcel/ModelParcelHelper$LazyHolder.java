package com.facebook.graphql.modelutil.parcel;

import X.1BL;
import X.AnonymousClass001;
import X.FJ8;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

/* loaded from: ModelParcelHelper$LazyHolder.class */
public final class ModelParcelHelper$LazyHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(85);
    public final Parcelable A00;
    public final int A01;

    public ModelParcelHelper$LazyHolder(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        Preconditions.checkState(AnonymousClass001.A1Q(readInt, 2));
        this.A00 = 1BL.A0C(parcel, FJ8.class);
    }

    public ModelParcelHelper$LazyHolder(Object obj) {
        if (!(obj instanceof Parcelable)) {
            throw AnonymousClass001.A0L("Object param must implement a serialization format");
        }
        this.A00 = (Parcelable) obj;
        this.A01 = 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        Preconditions.checkState(AnonymousClass001.A1Q(i2, 2));
        parcel.writeParcelable(this.A00, 0);
    }
}
