package com.facebook.messaging.threadview.surfaceoptions.model;

import X.11T;
import X.C1pq;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UpButtonConfig.class */
public final class UpButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(46);
    public final CustomUpButtonConfig A00;
    public final MigUpButtonConfig A01;
    public final String A02;

    public UpButtonConfig(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CustomUpButtonConfig) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MigUpButtonConfig) parcel.readParcelable(classLoader);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
    }

    public UpButtonConfig(CustomUpButtonConfig customUpButtonConfig, MigUpButtonConfig migUpButtonConfig, String str) {
        this.A00 = customUpButtonConfig;
        this.A01 = migUpButtonConfig;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UpButtonConfig)) {
                return false;
            }
            UpButtonConfig upButtonConfig = (UpButtonConfig) obj;
            if (!11T.A0O(this.A00, upButtonConfig.A00) || !11T.A0O(this.A01, upButtonConfig.A01) || !11T.A0O(this.A02, upButtonConfig.A02)) {
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
        CustomUpButtonConfig customUpButtonConfig = this.A00;
        if (customUpButtonConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(customUpButtonConfig, i);
        }
        MigUpButtonConfig migUpButtonConfig = this.A01;
        if (migUpButtonConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(migUpButtonConfig, i);
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }
}
