package com.google.android.gms.wearable.internal;

import X.0Pz;
import X.1BJ;
import X.AbM;
import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzcj.class */
public final class zzcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(67);
    public final int A00;
    public final String A01;

    public zzcj(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzcj)) {
                return false;
            }
            zzcj zzcjVar = (zzcj) obj;
            if (this.A00 != zzcjVar.A00) {
                return false;
            }
            String str = this.A01;
            String str2 = zzcjVar.A01;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbM.A05(Integer.valueOf(this.A00), this.A01);
    }

    public final String toString() {
        String str;
        int i = this.A00;
        switch (i) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = 1BJ.A00(125);
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = 0Pz.A0T("Unrecognized state value: ", i);
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.A01, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        JQy.A16(parcel, this.A01, A0E);
    }
}
