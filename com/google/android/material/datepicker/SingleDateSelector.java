package com.google.android.material.datepicker;

import X.AnonymousClass001;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: SingleDateSelector.class */
public final class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = LGm.A00(80);
    public Long A00;

    @Override // com.google.android.material.datepicker.DateSelector
    public ArrayList B9f() {
        ArrayList A0s = AnonymousClass001.A0s();
        Long l = this.A00;
        if (l != null) {
            A0s.add(l);
        }
        return A0s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
    }
}
