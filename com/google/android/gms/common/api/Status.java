package com.google.android.gms.common.api;

import X.28W;
import X.3OO;
import X.4SW;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.C2xc;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: Status.class */
public final class Status extends AbstractSafeParcelable implements 28W, ReflectedParcelable {
    public final int A00;
    public final PendingIntent A01;
    public final ConnectionResult A02;
    public final String A03;
    public static final Status A09 = new Status(-1, null);
    public static final Status A08 = new Status(0, null);
    public static final Status A07 = new Status(14, null);
    public static final Status A06 = new Status(8, null);
    public static final Status A0A = new Status(15, null);
    public static final Status A04 = new Status(16, null);
    public static final Status A0B = new Status(17, null);
    public static final Status A05 = new Status(18, null);
    public static final Parcelable.Creator CREATOR = new C2xc(72);

    public Status(int i, String str) {
        this(null, null, str, i);
    }

    public Status(PendingIntent pendingIntent, ConnectionResult connectionResult, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = pendingIntent;
        this.A02 = connectionResult;
    }

    public Status BCJ() {
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.A00 == status.A00 && AbstractC09524qc.A00(this.A03, status.A03) && AbstractC09524qc.A00(this.A01, status.A01) && AbstractC09524qc.A00(this.A02, status.A02)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A03, this.A01, this.A02});
    }

    public String toString() {
        3OO r0 = new 3OO(this);
        String str = this.A03;
        if (str == null) {
            str = 4SW.A00(this.A00);
        }
        r0.A00(str, "statusCode");
        r0.A00(this.A01, "resolution");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A00 = AbstractC01153q8.A00(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A08(parcel, this.A03, 2);
        AbstractC01153q8.A07(parcel, this.A01, 3, i);
        AbstractC01153q8.A07(parcel, this.A02, 4, i);
        AbstractC01153q8.A03(parcel, A00);
    }
}
