package com.google.android.gms.common;

import X.0Pz;
import X.3OO;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.C4Ny;
import X.JQw;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: ConnectionResult.class */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new C4Ny(57);
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public ConnectionResult(int i) {
        this(null, null, 1, i);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(pendingIntent, null, 1, i);
    }

    public ConnectionResult(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return JQw.A00(14);
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return 0Pz.A0d("UNKNOWN_ERROR_CODE(", ")", i);
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ConnectionResult)) {
                return false;
            }
            ConnectionResult connectionResult = (ConnectionResult) obj;
            if (this.A01 != connectionResult.A01 || !AbstractC09524qc.A00(this.A02, connectionResult.A02) || !AbstractC09524qc.A00(this.A03, connectionResult.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public String toString() {
        3OO r0 = new 3OO(this);
        r0.A00(A00(this.A01), "statusCode");
        r0.A00(this.A02, "resolution");
        r0.A00(this.A03, "message");
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A04(parcel, 2, this.A01);
        AbstractC01153q8.A07(parcel, this.A02, 3, i);
        AbstractC01153q8.A08(parcel, this.A03, 4);
        AbstractC01153q8.A03(parcel, A01);
    }
}
