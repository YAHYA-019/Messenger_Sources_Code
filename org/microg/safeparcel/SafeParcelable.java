package org.microg.safeparcel;

import android.os.Parcelable;

/* loaded from: SafeParcelable.class */
public interface SafeParcelable extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";
    public static final int SAFE_PARCEL_MAGIC = 20293;
    public static final int SAFE_PARCEL_OBJECT_MAGIC = 20293;

    /* loaded from: SafeParcelable$Field.class */
    public @interface Field {
        boolean mayNull();

        Class subClass();

        boolean useValueParcel();

        int value();

        long versionCode();
    }
}
