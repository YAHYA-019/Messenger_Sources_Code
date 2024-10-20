package com.facebookpay.form.cell.logging;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FormCellLoggingEvents.class */
public final class FormCellLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(69);
    public final FormCellFocusEvents A00;

    public FormCellLoggingEvents(FormCellFocusEvents formCellFocusEvents) {
        11T.A0F(formCellFocusEvents, 1);
        this.A00 = formCellFocusEvents;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
