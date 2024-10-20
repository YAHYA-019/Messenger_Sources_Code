package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: ClientIdentity.class */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(81);
    public final int A00;
    public final String A01;

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ClientIdentity)) {
                return false;
            }
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (clientIdentity.A00 != this.A00 || !AbstractC09524qc.A00(clientIdentity.A01, this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A00);
        A0k.append(":");
        return AnonymousClass001.A0d(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        JQy.A16(parcel, this.A01, A0E);
    }
}
