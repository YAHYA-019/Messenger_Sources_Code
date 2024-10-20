package com.facebookpay.form.cell.text.formatter;

import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;

/* loaded from: PhoneFormatter.class */
public final class PhoneFormatter extends PhoneNumberFormattingTextWatcher implements TextFormatter {
    public static final Parcelable.Creator CREATOR = LGp.A00(77);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
