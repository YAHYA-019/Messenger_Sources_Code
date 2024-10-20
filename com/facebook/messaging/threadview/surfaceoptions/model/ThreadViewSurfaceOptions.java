package com.facebook.messaging.threadview.surfaceoptions.model;

import X.11T;
import X.C1pq;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ThreadViewSurfaceOptions.class */
public final class ThreadViewSurfaceOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(45);
    public final ColorSchemeConfig A00;
    public final DismissConfig A01;
    public final UpButtonConfig A02;

    public ThreadViewSurfaceOptions(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        DismissConfig dismissConfig = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ColorSchemeConfig) parcel.readParcelable(classLoader);
        }
        this.A01 = parcel.readInt() != 0 ? (DismissConfig) parcel.readParcelable(classLoader) : dismissConfig;
        this.A02 = (UpButtonConfig) parcel.readParcelable(classLoader);
    }

    public ThreadViewSurfaceOptions(ColorSchemeConfig colorSchemeConfig, DismissConfig dismissConfig, UpButtonConfig upButtonConfig) {
        this.A00 = colorSchemeConfig;
        this.A01 = dismissConfig;
        C1pq.A08("upButtonConfig", upButtonConfig);
        this.A02 = upButtonConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadViewSurfaceOptions)) {
                return false;
            }
            ThreadViewSurfaceOptions threadViewSurfaceOptions = (ThreadViewSurfaceOptions) obj;
            if (!11T.A0O(this.A00, threadViewSurfaceOptions.A00) || !11T.A0O(this.A01, threadViewSurfaceOptions.A01) || !11T.A0O(this.A02, threadViewSurfaceOptions.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ColorSchemeConfig colorSchemeConfig = this.A00;
        if (colorSchemeConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(colorSchemeConfig, i);
        }
        DismissConfig dismissConfig = this.A01;
        if (dismissConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(dismissConfig, i);
        }
        parcel.writeParcelable(this.A02, i);
    }
}
