package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: BeginSignInResult.class */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(59);
    public final PendingIntent A00;

    public BeginSignInResult(PendingIntent pendingIntent) {
        AbstractC00481b7.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A00, 1, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
