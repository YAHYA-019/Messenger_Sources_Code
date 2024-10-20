package com.google.android.material.datepicker;

import X.LGm;
import X.LeN;
import X.LeO;
import X.MIx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: CompositeDateValidator.class */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final MIx A00;
    public final List A01;
    public static final MIx A03 = new LeN();
    public static final MIx A02 = new LeO();
    public static final Parcelable.Creator CREATOR = LGm.A00(76);

    public CompositeDateValidator(MIx mIx, List list) {
        this.A01 = list;
        this.A00 = mIx;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean BX7(long j) {
        return this.A00.BX8(this.A01, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CompositeDateValidator)) {
                return false;
            }
            CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
            if (this.A01.equals(compositeDateValidator.A01) && this.A00.Apm() == compositeDateValidator.A00.Apm()) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00.Apm());
    }
}
