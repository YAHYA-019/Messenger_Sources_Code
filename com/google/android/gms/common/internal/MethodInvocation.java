package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: MethodInvocation.class */
public final class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(83);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public MethodInvocation(String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = j;
        this.A06 = j2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i4;
        this.A04 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A04(parcel, 2, this.A01);
        AbstractC01153q8.A04(parcel, 3, this.A02);
        AbstractC01153q8.A05(parcel, 4, this.A05);
        AbstractC01153q8.A05(parcel, 5, this.A06);
        AbstractC01153q8.A08(parcel, this.A07, 6);
        AbstractC01153q8.A08(parcel, this.A08, 7);
        AbstractC01153q8.A04(parcel, 8, this.A03);
        AbstractC01153q8.A04(parcel, 9, this.A04);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
