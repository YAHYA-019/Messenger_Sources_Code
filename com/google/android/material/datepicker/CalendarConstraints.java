package com.google.android.material.datepicker;

import X.0Ig;
import X.AnonymousClass001;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: CalendarConstraints.class */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(75);
    public Month A00;
    public final int A01;
    public final int A02;
    public final DateValidator A03;
    public final Month A04;
    public final Month A05;

    /* loaded from: CalendarConstraints$DateValidator.class */
    public interface DateValidator extends Parcelable {
        boolean BX7(long j);
    }

    public CalendarConstraints(DateValidator dateValidator, Month month, Month month2, Month month3) {
        this.A05 = month;
        this.A04 = month2;
        this.A00 = month3;
        this.A03 = dateValidator;
        if (month3 != null) {
            Calendar calendar = month.A06;
            Calendar calendar2 = month3.A06;
            if (calendar.compareTo(calendar2) > 0) {
                throw AnonymousClass001.A0L("start Month cannot be after current Month");
            }
            if (calendar2.compareTo(month2.A06) > 0) {
                throw AnonymousClass001.A0L("current Month cannot be after end Month");
            }
        }
        if (!(month.A06 instanceof GregorianCalendar)) {
            throw AnonymousClass001.A0L("Only Gregorian calendars are supported.");
        }
        int i = month2.A04 - month.A04;
        this.A01 = (i * 12) + (month2.A03 - month.A03) + 1;
        this.A02 = i + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CalendarConstraints)) {
                return false;
            }
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            if (this.A05.equals(calendarConstraints.A05) && this.A04.equals(calendarConstraints.A04) && 0Ig.A00(this.A00, calendarConstraints.A00) && this.A03.equals(calendarConstraints.A03)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0N(this.A05, this.A04, this.A00, this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(this.A03, 0);
    }
}
