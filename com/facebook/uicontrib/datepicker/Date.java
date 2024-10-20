package com.facebook.uicontrib.datepicker;

import X.2Go;
import X.4YU;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;

/* loaded from: Date.class */
public class Date implements Parcelable {
    public static final Date A00 = new Date(Integer.valueOf(Calendar.getInstance().get(2) + 1), Integer.valueOf(Calendar.getInstance().get(5)), Calendar.getInstance().get(1));
    public static final Parcelable.Creator CREATOR = FKe.A00(90);
    public final Integer dayOfMonth;
    public final Integer month;
    public final int year;

    public Date() {
        this.year = 0;
        this.month = null;
        this.dayOfMonth = null;
    }

    public Date(Parcel parcel) {
        this.year = parcel.readInt();
        int readInt = parcel.readInt();
        Integer num = null;
        this.month = readInt == 0 ? null : Integer.valueOf(readInt);
        int readInt2 = parcel.readInt();
        this.dayOfMonth = readInt2 != 0 ? Integer.valueOf(readInt2) : num;
    }

    public Date(Integer num, Integer num2, int i) {
        this.year = i;
        this.month = num;
        this.dayOfMonth = num2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Date)) {
                return false;
            }
            Date date = (Date) obj;
            if (this.year == date.year && 2Go.A00(this.month, date.month) && 2Go.A00(this.dayOfMonth, date.dayOfMonth)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(Integer.valueOf(this.year), this.month, this.dayOfMonth);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        Integer num = this.month;
        int i2 = 0;
        parcel.writeInt(num == null ? 0 : num.intValue());
        Integer num2 = this.dayOfMonth;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        parcel.writeInt(i2);
    }
}
