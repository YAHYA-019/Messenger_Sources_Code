package com.facebook.messaging.service.model;

import X.1BL;
import X.AnonymousClass219;
import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: UpdateVanishModeSelectionParams.class */
public final class UpdateVanishModeSelectionParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(23);
    public final long A00;
    public final ThreadKey A01;
    public final AnonymousClass219 A02;

    public UpdateVanishModeSelectionParams(Parcel parcel) {
        this.A01 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        Enum A07 = C53v.A07(parcel, AnonymousClass219.class);
        A07.getClass();
        this.A02 = (AnonymousClass219) A07;
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        C53v.A0J(parcel, this.A02);
        parcel.writeLong(this.A00);
    }
}
