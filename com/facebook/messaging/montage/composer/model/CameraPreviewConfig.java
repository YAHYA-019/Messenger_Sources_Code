package com.facebook.messaging.montage.composer.model;

import X.11T;
import X.82M;
import X.AnonymousClass001;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CameraPreviewConfig.class */
public final class CameraPreviewConfig extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(53);
    public final Float A00;

    public CameraPreviewConfig() {
        this(null);
    }

    public CameraPreviewConfig(Float f) {
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CameraPreviewConfig) && 11T.A0O(this.A00, ((CameraPreviewConfig) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }
}
