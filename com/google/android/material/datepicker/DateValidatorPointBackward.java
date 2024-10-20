package com.google.android.material.datepicker;

import X.DKD;
import X.GOp;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: DateValidatorPointBackward.class */
public final class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = LGm.A00(77);
    public final long A00;

    public DateValidatorPointBackward(long j) {
        this.A00 = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean BX7(long j) {
        return GOp.A1U((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof DateValidatorPointBackward)) {
                return false;
            }
            if (this.A00 != ((DateValidatorPointBackward) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return DKD.A04(Long.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }
}
