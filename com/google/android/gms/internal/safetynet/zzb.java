package com.google.android.gms.internal.safetynet;

import X.0FI;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.KY4;
import X.Ldi;
import X.Ldj;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzm;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1162498016, 0FI.A03(1315444279));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        UnsupportedOperationException A0p;
        int i3;
        int A032;
        int i4;
        boolean z;
        int i5;
        int A033 = 0FI.A03(-1670519701);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i5 = -1419468264;
            0FI.A09(i5, A033);
            return z;
        }
        zzh zzhVar = (zzh) this;
        int A034 = 0FI.A03(-327317852);
        if (i != 1) {
            if (i == 2) {
                parcel.readString();
                A03 = 0FI.A03(330561414);
                A0p = AnonymousClass001.A0p();
                i3 = -1631347409;
            } else if (i == 3) {
                Status status = (Status) JQy.A0R(parcel, Status.CREATOR);
                SafeBrowsingData safeBrowsingData = (SafeBrowsingData) JQy.A0R(parcel, SafeBrowsingData.CREATOR);
                if (zzhVar instanceof zzw) {
                    A032 = 0FI.A03(997629113);
                    ((zzw) zzhVar).A00.A08(new Ldi(status, safeBrowsingData));
                    i4 = 2104267332;
                    0FI.A09(i4, A032);
                    0FI.A09(-1675967967, A034);
                    z = true;
                } else {
                    A03 = 0FI.A03(10410541);
                    A0p = AnonymousClass001.A0p();
                    i3 = 110687571;
                }
            } else if (i == 4) {
                JQy.A0R(parcel, Status.CREATOR);
                parcel.readInt();
                A03 = 0FI.A03(504100917);
                A0p = AnonymousClass001.A0p();
                i3 = -1042925533;
            } else if (i == 6) {
                JQy.A0R(parcel, Status.CREATOR);
                JQy.A0R(parcel, zzf.CREATOR);
                A03 = 0FI.A03(-1732215827);
                A0p = AnonymousClass001.A0p();
                i3 = 2110392790;
            } else if (i == 8) {
                JQy.A0R(parcel, Status.CREATOR);
                JQy.A0R(parcel, zzd.CREATOR);
                A03 = 0FI.A03(-576487706);
                A0p = AnonymousClass001.A0p();
                i3 = 835279620;
            } else if (i == 15) {
                JQy.A0R(parcel, Status.CREATOR);
                JQy.A0R(parcel, com.google.android.gms.safetynet.zzh.CREATOR);
                A03 = 0FI.A03(497120371);
                A0p = AnonymousClass001.A0p();
                i3 = 1233272284;
            } else if (i == 10) {
                JQy.A0R(parcel, Status.CREATOR);
                parcel.readInt();
                A03 = 0FI.A03(938961795);
                A0p = AnonymousClass001.A0p();
                i3 = -682690614;
            } else if (i != 11) {
                0FI.A09(-1079990223, A034);
                z = false;
            } else {
                Status status2 = (Status) JQy.A0R(parcel, Status.CREATOR);
                if (zzhVar instanceof zzm) {
                    A032 = 0FI.A03(-498740935);
                    KY4.A00(status2, ((zzm) zzhVar).A00, (Object) null);
                    i4 = -1648228573;
                    0FI.A09(i4, A032);
                    0FI.A09(-1675967967, A034);
                    z = true;
                } else {
                    A03 = 0FI.A03(-2008051377);
                    A0p = AnonymousClass001.A0p();
                    i3 = -94107580;
                }
            }
            0FI.A09(i3, A03);
            throw A0p;
        }
        Status status3 = (Status) JQy.A0R(parcel, Status.CREATOR);
        zza zzaVar = (zza) JQy.A0R(parcel, zza.CREATOR);
        if (!(zzhVar instanceof zzs)) {
            A03 = 0FI.A03(754516985);
            A0p = AnonymousClass001.A0p();
            i3 = 1516216502;
            0FI.A09(i3, A03);
            throw A0p;
        }
        A032 = 0FI.A03(-1438580690);
        ((zzs) zzhVar).A00.A08(new Ldj(status3, zzaVar));
        i4 = 938216723;
        0FI.A09(i4, A032);
        0FI.A09(-1675967967, A034);
        z = true;
        i5 = -283988315;
        0FI.A09(i5, A033);
        return z;
    }
}
