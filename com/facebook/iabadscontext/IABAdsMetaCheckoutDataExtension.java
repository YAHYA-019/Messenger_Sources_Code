package com.facebook.iabadscontext;

import X.11T;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABAdsMetaCheckoutDataExtension.class */
public final class IABAdsMetaCheckoutDataExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(0);
    public final MetaCheckoutExperienceType A00;

    public IABAdsMetaCheckoutDataExtension(MetaCheckoutExperienceType metaCheckoutExperienceType) {
        11T.A0F(metaCheckoutExperienceType, 1);
        this.A00 = metaCheckoutExperienceType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABAdsMetaCheckoutDataExtension) && this.A00 == ((IABAdsMetaCheckoutDataExtension) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
