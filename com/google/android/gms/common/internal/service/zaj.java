package com.google.android.gms.common.internal.service;

import X.0FI;
import X.L6l;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

/* loaded from: zaj.class */
public abstract class zaj extends zab implements IInterface {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
        0FI.A09(-1204874047, 0FI.A03(-1305547757));
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(849353602);
        boolean z = true;
        if (i == 1) {
            int readInt = parcel.readInt();
            L6l.A00(parcel);
            int A032 = 0FI.A03(-822115855);
            ((zad) this).A00.Cu3(new Status(readInt, null));
            0FI.A09(1503561097, A032);
            i3 = 696936820;
        } else {
            z = false;
            i3 = -30056247;
        }
        0FI.A09(i3, A03);
        return z;
    }
}
