package com.google.android.gms.internal.location;

import X.0FI;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzap;
import com.google.android.gms.location.zzaq;

/* loaded from: zzbe.class */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(31);
    public int A00;
    public PendingIntent A01;
    public zzai A02;
    public zzbc A03;
    public zzap A04;
    public zzaq A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.location.zzap] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.location.zzai] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.location.zzaq] */
    public zzbe(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, zzbc zzbcVar, int i) {
        IInterface zzbVar;
        IInterface zzbVar2;
        this.A00 = i;
        this.A03 = zzbcVar;
        IInterface iInterface = null;
        if (iBinder == null) {
            zzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof zzaq) {
                zzbVar = (zzaq) queryLocalInterface;
            } else {
                zzbVar = new zzb("com.google.android.gms.location.ILocationListener", iBinder);
                0FI.A09(147939916, 0FI.A03(1722998234));
            }
        }
        this.A05 = zzbVar;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            zzbVar2 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof zzap) {
                zzbVar2 = (zzap) queryLocalInterface2;
            } else {
                zzbVar2 = new zzb("com.google.android.gms.location.ILocationCallback", iBinder2);
                0FI.A09(40883946, 0FI.A03(-1821358649));
            }
        }
        this.A04 = zzbVar2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof zzai) {
                iInterface = (zzai) queryLocalInterface3;
            } else {
                iInterface = new zzb("com.google.android.gms.location.internal.IFusedLocationProviderCallback", iBinder3);
                0FI.A09(-911171265, 0FI.A03(-1820971121));
            }
        }
        this.A02 = iInterface;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        IBinder asBinder3;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A07(parcel, this.A03, 2, i);
        zzaq zzaqVar = this.A05;
        if (zzaqVar != null && (asBinder3 = zzaqVar.asBinder()) != null) {
            int A01 = AbstractC01153q8.A01(parcel, 3);
            parcel.writeStrongBinder(asBinder3);
            AbstractC01153q8.A03(parcel, A01);
        }
        AbstractC01153q8.A07(parcel, this.A01, 4, i);
        zzap zzapVar = this.A04;
        if (zzapVar != null && (asBinder2 = zzapVar.asBinder()) != null) {
            int A012 = AbstractC01153q8.A01(parcel, 5);
            parcel.writeStrongBinder(asBinder2);
            AbstractC01153q8.A03(parcel, A012);
        }
        zzai zzaiVar = this.A02;
        if (zzaiVar != null && (asBinder = zzaiVar.asBinder()) != null) {
            int A013 = AbstractC01153q8.A01(parcel, 6);
            parcel.writeStrongBinder(asBinder);
            AbstractC01153q8.A03(parcel, A013);
        }
        AbstractC01153q8.A03(parcel, A0E);
    }
}
