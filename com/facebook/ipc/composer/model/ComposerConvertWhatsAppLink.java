package com.facebook.ipc.composer.model;

import X.C1pq;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerConvertWhatsAppLink.class */
public final class ComposerConvertWhatsAppLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(9);
    public final boolean A00;

    public ComposerConvertWhatsAppLink(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    public ComposerConvertWhatsAppLink(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerConvertWhatsAppLink) && this.A00 == ((ComposerConvertWhatsAppLink) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
