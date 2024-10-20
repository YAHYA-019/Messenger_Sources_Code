package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.DKD;
import X.JQx;
import X.LGn;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SavePasswordResult.class */
public final class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(66);
    public final PendingIntent A00;

    public SavePasswordResult(PendingIntent pendingIntent) {
        AbstractC00481b7.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return AbstractC09524qc.A00(this.A00, ((SavePasswordResult) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A00, 1, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
