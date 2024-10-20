package com.google.android.material.datepicker;

import X.1BL;
import X.DKD;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: DateValidatorPointForward.class */
public final class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = LGm.A00(78);
    public final long A00;

    public DateValidatorPointForward(long j) {
        this.A00 = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean BX7(long j) {
        return 1BL.A1S((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof DateValidatorPointForward)) {
                return false;
            }
            if (this.A00 != ((DateValidatorPointForward) obj).A00) {
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
