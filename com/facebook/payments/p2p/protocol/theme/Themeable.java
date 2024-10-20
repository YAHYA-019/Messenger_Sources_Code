package com.facebook.payments.p2p.protocol.theme;

import X.AnonymousClass001;
import X.FJ8;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: Themeable.class */
public final class Themeable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(4);
    public List A01 = AnonymousClass001.A0s();
    public List A00 = AnonymousClass001.A0s();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FJ8.A0B(parcel, this.A01);
        FJ8.A0B(parcel, this.A00);
    }
}
