package com.google.android.gms.internal.base;

import X.0FI;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: zab.class */
public abstract class zab extends Binder implements IInterface {
    public zab(String str) {
        int A03 = 0FI.A03(1502747780);
        attachInterface(this, str);
        0FI.A09(1912880798, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(int r302, android.os.Parcel r303, android.os.Parcel r304, int r305) {
        /*
            r301 = this;
            r0 = r301
            r306 = r0
            r0 = r301
            com.google.android.gms.signin.internal.zad r0 = (com.google.android.gms.signin.internal.zad) r0
            r306 = r0
            r0 = 532833864(0x1fc26648, float:8.2331406E-20)
            r307 = r0
            r0 = r307
            int r0 = X.0FI.A03(r0)
            r308 = r0
            r0 = r302
            switch(r0) {
                case 3: goto L54;
                case 4: goto L75;
                case 5: goto L40;
                case 6: goto L75;
                case 7: goto L7d;
                case 8: goto L9e;
                case 9: goto Ldb;
                default: goto L40;
            }
        L40:
            r0 = 0
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = -1661156465(0xffffffff9cfcc38f, float:-1.6726512E-21)
            r307 = r0
        L4a:
            r0 = r307
            r1 = r308
            X.0FI.A09(r0, r1)
            r0 = r309
            return r0
        L54:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.ConnectionResult.CREATOR
            r310 = r0
            r0 = r303
            int r0 = r0.readInt()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L6d
            r0 = r310
            r1 = r303
            java.lang.Object r0 = r0.createFromParcel(r1)
        L6d:
            android.os.Parcelable$Creator r0 = com.google.android.gms.signin.internal.zaa.CREATOR
            r310 = r0
            goto Le0
        L75:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            r310 = r0
            goto Le0
        L7d:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            r310 = r0
            r0 = r303
            int r0 = r0.readInt()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L96
            r0 = r310
            r1 = r303
            java.lang.Object r0 = r0.createFromParcel(r1)
        L96:
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            r310 = r0
            goto Le0
        L9e:
            android.os.Parcelable$Creator r0 = com.google.android.gms.signin.internal.zak.CREATOR
            r310 = r0
            r0 = r303
            int r0 = r0.readInt()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lcb
            r0 = 0
            r307 = r0
            r0 = 0
            r311 = r0
        Lb4:
            r0 = r311
            com.google.android.gms.signin.internal.zak r0 = (com.google.android.gms.signin.internal.zak) r0
            r311 = r0
            r0 = r303
            X.L6l.A00(r0)
            r0 = r306
            r1 = r311
            r0.DBZ(r1)
            goto Lf8
        Lcb:
            r0 = r310
            r1 = r303
            java.lang.Object r0 = r0.createFromParcel(r1)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r311 = r0
            goto Lb4
        Ldb:
            android.os.Parcelable$Creator r0 = com.google.android.gms.signin.internal.zag.CREATOR
            r310 = r0
        Le0:
            r0 = r303
            int r0 = r0.readInt()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lf4
            r0 = r310
            r1 = r303
            java.lang.Object r0 = r0.createFromParcel(r1)
        Lf4:
            r0 = r303
            X.L6l.A00(r0)
        Lf8:
            r0 = r304
            r0.writeNoException()
            r0 = 1
            r309 = r0
            r0 = 1582938461(0x5e59b95d, float:3.9221683E18)
            r307 = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zab.A00(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-75446214, 0FI.A03(-1937372195));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A00;
        int i3;
        int A03 = 0FI.A03(-187010873);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            A00 = true;
            i3 = 984591939;
            0FI.A09(i3, A03);
            return A00;
        }
        A00 = A00(i, parcel, parcel2, i2);
        i3 = 714703134;
        0FI.A09(i3, A03);
        return A00;
    }
}
