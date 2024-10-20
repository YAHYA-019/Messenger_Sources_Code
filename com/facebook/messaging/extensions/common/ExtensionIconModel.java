package com.facebook.messaging.extensions.common;

import X.2MQ;
import X.7zL;
import X.7zN;
import X.C1pq;
import X.C1td;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ExtensionIconModel.class */
public final class ExtensionIconModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(58);
    public final int A00;
    public final 2MQ A01;
    public final C1td A02;

    public ExtensionIconModel(2MQ r302, C1td c1td, int i) {
        this.A02 = c1td;
        C1pq.A08("mIGButtonIconName", r302);
        this.A01 = r302;
        this.A00 = i;
    }

    public ExtensionIconModel(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) == 0 ? null : C1td.values()[parcel.readInt()];
        this.A01 = 2MQ.values()[parcel.readInt()];
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ExtensionIconModel)) {
                return false;
            }
            ExtensionIconModel extensionIconModel = (ExtensionIconModel) obj;
            if (this.A02 != extensionIconModel.A02 || this.A01 != extensionIconModel.A01 || this.A00 != extensionIconModel.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A03 = C3o5.A03(this.A02) + 31;
        2MQ r0 = this.A01;
        if (r0 != null) {
            i = r0.ordinal();
        }
        return (((A03 * 31) + i) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        C1td c1td = this.A02;
        if (c1td == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = c1td.ordinal();
        }
        parcel.writeInt(ordinal);
        7zN.A0z(parcel, this.A01);
        parcel.writeInt(this.A00);
    }
}
