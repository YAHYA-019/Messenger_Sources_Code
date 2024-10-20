package com.facebook.payments.invoice.protocol;

import X.1BL;
import X.AnonymousClass001;
import X.FKZ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.cart.model.SimpleCartScreenConfig;
import com.google.common.base.Preconditions;

/* loaded from: InvoiceConfigResult.class */
public final class InvoiceConfigResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(61);
    public final Uri A00;
    public final SimpleCartScreenConfig A01;

    public InvoiceConfigResult(Uri uri) {
        Preconditions.checkArgument(AnonymousClass001.A1T(uri));
        this.A01 = null;
        this.A00 = uri;
    }

    public InvoiceConfigResult(Parcel parcel) {
        this.A01 = (SimpleCartScreenConfig) 1BL.A0C(parcel, SimpleCartScreenConfig.class);
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
    }

    public InvoiceConfigResult(SimpleCartScreenConfig simpleCartScreenConfig) {
        this.A01 = simpleCartScreenConfig;
        this.A00 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
