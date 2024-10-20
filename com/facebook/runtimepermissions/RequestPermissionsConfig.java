package com.facebook.runtimepermissions;

import X.82N;
import X.C53v;
import X.C5iw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: RequestPermissionsConfig.class */
public final class RequestPermissionsConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(5);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final String[] A0A;

    public RequestPermissionsConfig(C5iw c5iw) {
        this.A04 = c5iw.A04;
        List list = c5iw.A07;
        this.A0A = list.isEmpty() ? null : (String[]) list.toArray(new String[0]);
        this.A02 = c5iw.A02;
        this.A03 = c5iw.A03;
        c5iw.A00.getClass();
        this.A00 = c5iw.A00.intValue();
        this.A01 = c5iw.A01.intValue();
        this.A09 = c5iw.A06;
        this.A08 = false;
        this.A07 = true;
        this.A05 = c5iw.A05;
        this.A06 = true;
    }

    public RequestPermissionsConfig(Parcel parcel) {
        this.A04 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            this.A0A = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.A0A = null;
        }
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A09 = C53v.A0S(parcel);
        this.A08 = C53v.A0S(parcel);
        this.A07 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A06 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A04);
        String[] strArr = this.A0A;
        if (strArr == null || (length = strArr.length) <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(length);
            parcel.writeStringArray(strArr);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
