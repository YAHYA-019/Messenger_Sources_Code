package com.facebook.messaging.push.flags;

import X.11T;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: ServerMessageAlertFlags.class */
public final class ServerMessageAlertFlags implements Parcelable {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public static final ServerMessageAlertFlags A06 = new ServerMessageAlertFlags(false, false, false, false);
    public static final ServerMessageAlertFlags A05 = new ServerMessageAlertFlags(true, true, true, true);
    public static final ServerMessageAlertFlags A04 = new ServerMessageAlertFlags(false, false, false, true);
    public static final Parcelable.Creator CREATOR = new 82M(79);

    public ServerMessageAlertFlags(Parcel parcel) {
        this.A01 = C53v.A0S(parcel);
        this.A02 = C53v.A0S(parcel);
        this.A00 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
    }

    public ServerMessageAlertFlags(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
        this.A03 = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            ServerMessageAlertFlags serverMessageAlertFlags = (ServerMessageAlertFlags) obj;
            if (this.A01 != serverMessageAlertFlags.A01 || this.A02 != serverMessageAlertFlags.A02 || this.A00 != serverMessageAlertFlags.A00 || this.A03 != serverMessageAlertFlags.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.A01 ? 1 : 0) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(ServerMessageAlertFlags.class);
        stringHelper.add("isDisableSound", this.A01);
        stringHelper.add("isDisableVibrate", this.A02);
        stringHelper.add("isDisableLightScreen", this.A00);
        stringHelper.add("isNotifyAggressively", this.A03);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
