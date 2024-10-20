package com.facebook.xapp.messaging.threadview.model.writewithai;

import X.11T;
import X.5PP;
import X.82N;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: WriteWithAiMetadata.class */
public final class WriteWithAiMetadata extends C04v implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(37);
    public final boolean A00;

    public WriteWithAiMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WriteWithAiMetadata) && this.A00 == ((WriteWithAiMetadata) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
