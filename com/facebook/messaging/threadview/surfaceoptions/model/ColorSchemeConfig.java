package com.facebook.messaging.threadview.surfaceoptions.model;

import X.11T;
import X.C1pq;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: ColorSchemeConfig.class */
public final class ColorSchemeConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(83);
    public final ThreadViewColorScheme A00;

    public ColorSchemeConfig(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = (ThreadViewColorScheme) ThreadViewColorScheme.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ColorSchemeConfig) && 11T.A0O(this.A00, ((ColorSchemeConfig) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
    }
}
