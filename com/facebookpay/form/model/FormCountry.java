package com.facebookpay.form.model;

import X.11T;
import X.1BL;
import X.4YW;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import java.util.Iterator;
import java.util.List;

/* loaded from: FormCountry.class */
public final class FormCountry implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(89);
    public final Country A00;
    public final List A01;

    public FormCountry(Country country, List list) {
        1BL.A1F(country, list);
        this.A00 = country;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Iterator A09 = 4YW.A09(parcel, this.A01);
        while (A09.hasNext()) {
            ((FormField) A09.next()).writeToParcel(parcel, i);
        }
    }
}
