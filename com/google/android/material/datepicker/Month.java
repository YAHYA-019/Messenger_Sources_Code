package com.google.android.material.datepicker;

import X.AbM;
import X.LBq;
import X.LGm;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: Month.class */
public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(79);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Calendar A06;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar A02 = LBq.A02(calendar);
        this.A06 = A02;
        this.A03 = A02.get(2);
        this.A04 = A02.get(1);
        this.A02 = A02.getMaximum(7);
        this.A01 = A02.getActualMaximum(5);
        this.A05 = A02.getTimeInMillis();
    }

    public static Month A00(long j) {
        Calendar A03 = LBq.A03((Calendar) null);
        A03.setTimeInMillis(j);
        return new Month(A03);
    }

    public int A01() {
        Calendar calendar = this.A06;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += this.A02;
        }
        return firstDayOfWeek;
    }

    public String A02(Context context) {
        String str = this.A00;
        if (str == null) {
            str = DateUtils.formatDateTime(context, this.A06.getTimeInMillis() - TimeZone.getDefault().getOffset(r0), 36);
            this.A00 = str;
        }
        return str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A06.compareTo(((Month) obj).A06);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Month)) {
                return false;
            }
            Month month = (Month) obj;
            if (this.A03 == month.A03 && this.A04 == month.A04) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(Integer.valueOf(this.A03), Integer.valueOf(this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }
}
