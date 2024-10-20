package com.google.android.gms.location;

import X.1BL;
import X.4YU;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: LocationRequest.class */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(34);
    public int A01 = ActionId.DATA_LOAD_START;
    public long A03 = 3600000;
    public long A04 = 600000;
    public boolean A07 = false;
    public long A05 = Long.MAX_VALUE;
    public int A02 = (-1) >>> 1;
    public float A00 = 0.0f;
    public long A06 = 0;

    public static void A00(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder A0l = AnonymousClass001.A0l(38);
        A0l.append("invalid interval: ");
        A0l.append(j);
        throw 1BL.A0d(A0l);
    }

    public final void A01(int i) {
        if (i != 100 && i != 102 && i != 104) {
            throw AnonymousClass001.A0L(AnonymousClass001.A0e("invalid quality: ", AnonymousClass001.A0l(28), i));
        }
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LocationRequest)) {
                return false;
            }
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A01 != locationRequest.A01) {
                return false;
            }
            long j = this.A03;
            long j2 = locationRequest.A03;
            if (j != j2 || this.A04 != locationRequest.A04 || this.A07 != locationRequest.A07 || this.A05 != locationRequest.A05 || this.A02 != locationRequest.A02 || this.A00 != locationRequest.A00) {
                return false;
            }
            long j3 = this.A06;
            if (j3 < j) {
                j3 = j;
            }
            long j4 = locationRequest.A06;
            if (j4 < j2) {
                j4 = j2;
            }
            if (j3 != j4) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return JR0.A0N(Integer.valueOf(this.A01), Long.valueOf(this.A03), Float.valueOf(this.A00), Long.valueOf(this.A06));
    }

    public final String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Request[");
        int i = this.A01;
        A0k.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i != 105) {
            A0k.append(" requested=");
            A0k.append(this.A03);
            A0k.append("ms");
        }
        A0k.append(" fastest=");
        A0k.append(this.A04);
        A0k.append("ms");
        long j = this.A06;
        if (j > this.A03) {
            4YU.A1T(" maxWait=", "ms", A0k, j);
        }
        float f = this.A00;
        if (f > 0.0f) {
            A0k.append(" smallestDisplacement=");
            A0k.append(f);
            A0k.append("m");
        }
        long j2 = this.A05;
        if (j2 != Long.MAX_VALUE) {
            4YU.A1T(" expireIn=", "ms", A0k, j2 - SystemClock.elapsedRealtime());
        }
        int i2 = this.A02;
        if (i2 != ((-1) >>> 1)) {
            A0k.append(" num=");
            A0k.append(i2);
        }
        return AnonymousClass001.A0g(A0k, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A01);
        AbstractC01153q8.A05(parcel, 2, this.A03);
        AbstractC01153q8.A05(parcel, 3, this.A04);
        AbstractC01153q8.A06(parcel, 4, this.A07);
        AbstractC01153q8.A05(parcel, 5, this.A05);
        AbstractC01153q8.A04(parcel, 6, this.A02);
        float f = this.A00;
        parcel.writeInt(262151);
        parcel.writeFloat(f);
        AbstractC01153q8.A05(parcel, 8, this.A06);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
