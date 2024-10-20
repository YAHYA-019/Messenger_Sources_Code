package com.google.android.gms.internal.location;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.JQx;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: zzbc.class */
public final class zzbc extends AbstractSafeParcelable {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = LGm.A00(30);
    public long A00;
    public LocationRequest A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.location.zzbc, java.lang.Object] */
    public static zzbc A00(LocationRequest locationRequest) {
        List list = A0B;
        ?? obj = new Object();
        obj.A01 = locationRequest;
        obj.A05 = list;
        obj.A02 = null;
        obj.A06 = false;
        obj.A07 = false;
        obj.A08 = false;
        obj.A03 = null;
        obj.A09 = false;
        obj.A0A = false;
        obj.A04 = null;
        obj.A00 = Long.MAX_VALUE;
        return obj;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzbc) {
            zzbc zzbcVar = (zzbc) obj;
            if (AbstractC09524qc.A00(this.A01, zzbcVar.A01) && AbstractC09524qc.A00(this.A05, zzbcVar.A05) && AbstractC09524qc.A00(this.A02, zzbcVar.A02) && this.A06 == zzbcVar.A06 && this.A07 == zzbcVar.A07 && this.A08 == zzbcVar.A08 && AbstractC09524qc.A00(this.A03, zzbcVar.A03) && this.A09 == zzbcVar.A09 && this.A0A == zzbcVar.A0A) {
                z = JR0.A1X(this.A04, zzbcVar.A04);
            }
        }
        return z;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A01);
        String str = this.A02;
        if (str != null) {
            A0k.append(" tag=");
            A0k.append(str);
        }
        String str2 = this.A03;
        if (str2 != null) {
            A0k.append(" moduleId=");
            A0k.append(str2);
        }
        String str3 = this.A04;
        if (str3 != null) {
            A0k.append(" contextAttributionTag=");
            A0k.append(str3);
        }
        A0k.append(" hideAppOps=");
        A0k.append(this.A06);
        A0k.append(" clients=");
        A0k.append(this.A05);
        A0k.append(" forceCoarseLocation=");
        A0k.append(this.A07);
        if (this.A08) {
            A0k.append(" exemptFromBackgroundThrottle");
        }
        if (this.A09) {
            A0k.append(" locationSettingsIgnored");
        }
        if (this.A0A) {
            A0k.append(" inaccurateLocationsDelayed");
        }
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A01, 1, i);
        AbstractC01153q8.A0A(parcel, this.A05, 5);
        AbstractC01153q8.A08(parcel, this.A02, 6);
        AbstractC01153q8.A06(parcel, 7, this.A06);
        AbstractC01153q8.A06(parcel, 8, this.A07);
        AbstractC01153q8.A06(parcel, 9, this.A08);
        AbstractC01153q8.A08(parcel, this.A03, 10);
        AbstractC01153q8.A06(parcel, 11, this.A09);
        AbstractC01153q8.A06(parcel, 12, this.A0A);
        AbstractC01153q8.A08(parcel, this.A04, 13);
        AbstractC01153q8.A05(parcel, 14, this.A00);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
