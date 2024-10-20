package com.google.android.gms.internal.wearable;

import X.0FI;
import X.0Pz;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.L6m;
import X.Log;
import X.Loh;
import X.Loi;
import X.Loj;
import X.Lok;
import X.Lom;
import X.Lon;
import X.Loo;
import X.Lop;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzas;
import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.internal.zzcj;
import com.google.android.gms.wearable.internal.zzcl;
import com.google.android.gms.wearable.internal.zzfn;
import com.google.android.gms.wearable.internal.zzgp;
import com.google.android.gms.wearable.internal.zzhf;
import com.google.android.gms.wearable.internal.zzhg;
import com.google.android.gms.wearable.internal.zzhu;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzn;
import com.google.android.gms.wearable.zzag;
import java.util.ArrayList;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(8162667, 0FI.A03(64711269));
        return this;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x004c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable.Creator creator;
        zza zzaVar;
        int A03;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int A032 = 0FI.A03(589056034);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i6 = -1878509287;
            0FI.A09(i6, A032);
            return z;
        }
        final zzag zzagVar = (zzag) this;
        int A033 = 0FI.A03(-348426435);
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) JQy.A0R(parcel, DataHolder.CREATOR);
                L6m.A00(parcel);
                int A034 = 0FI.A03(1812322548);
                try {
                    if (zzag.A00(zzagVar, AnonymousClass001.A0e(", rows=", AnonymousClass001.A0n(String.valueOf(dataHolder)), dataHolder.A00), new Lom(dataHolder, zzagVar), "onDataItemChanged")) {
                        i4 = -816918113;
                    } else {
                        dataHolder.close();
                        i4 = 1589278158;
                    }
                    0FI.A09(i4, A034);
                    z = true;
                    i5 = 1351597170;
                    0FI.A09(i5, A033);
                    i6 = 941248919;
                    0FI.A09(i6, A032);
                    return z;
                } catch (Throwable th) {
                    dataHolder.close();
                    0FI.A09(1145681955, A034);
                    throw th;
                }
            case 2:
                zzgp zzgpVar = (zzgp) JQy.A0R(parcel, zzgp.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(-373220625);
                zzag.A00(zzagVar, zzgpVar, new Lon(zzgpVar, zzagVar), "onMessageReceived");
                i3 = 360371095;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 3:
                zzhg zzhgVar = (zzhg) JQy.A0R(parcel, zzhg.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(-2052926344);
                zzag.A00(zzagVar, zzhgVar, new Loo(zzhgVar, zzagVar), "onPeerConnected");
                i3 = 1738658839;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 4:
                zzhg zzhgVar2 = (zzhg) JQy.A0R(parcel, zzhg.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(1310746887);
                zzag.A00(zzagVar, zzhgVar2, new Lop(zzhgVar2, zzagVar), "onPeerDisconnected");
                i3 = -782614330;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzhg.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(830502122);
                zzag.A00(zzagVar, createTypedArrayList, new Log(zzagVar, createTypedArrayList), "onConnectedNodes");
                i3 = 752137825;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 6:
                zzn zznVar = (zzn) JQy.A0R(parcel, zzn.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(204549670);
                zzag.A00(zzagVar, zznVar, new Loi(zznVar, zzagVar), "onNotificationReceived");
                i3 = -1904730170;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 7:
                zzbj zzbjVar = (zzbj) JQy.A0R(parcel, zzbj.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(-886170467);
                zzag.A00(zzagVar, zzbjVar, new Lok(zzbjVar, zzagVar), "onChannelEvent");
                i3 = -399229646;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 8:
                zzas zzasVar = (zzas) JQy.A0R(parcel, zzas.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(-1587546902);
                zzag.A00(zzagVar, zzasVar, new Loh(zzasVar, zzagVar), "onConnectedCapabilityChanged");
                i3 = 1881802868;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 9:
                zzk zzkVar = (zzk) JQy.A0R(parcel, zzk.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(-71720752);
                zzag.A00(zzagVar, zzkVar, new Loj(zzkVar, zzagVar), "onEntityUpdate");
                i3 = -1794785700;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 10:
            case 11:
            case 12:
            default:
                z = false;
                i5 = 208494202;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 13:
                final zzgp zzgpVar2 = (zzgp) JQy.A0R(parcel, zzgp.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    if (queryLocalInterface instanceof zzfn) {
                        zzaVar = (zzfn) queryLocalInterface;
                    } else {
                        zzaVar = new zza(readStrongBinder);
                        0FI.A09(-1279445918, 0FI.A03(-810904493));
                    }
                }
                L6m.A00(parcel);
                A03 = 0FI.A03(-1173511864);
                final zzfn zzfnVar = zzaVar;
                zzag.A00(zzagVar, zzgpVar2, new Runnable() { // from class: X.Lq6
                    public static final String __redex_internal_original_name = "zzv";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfn zzfnVar2 = zzfnVar;
                        int A035 = 0FI.A03(652419260);
                        try {
                            int A036 = 0FI.A03(189960084);
                            int A037 = 0FI.A03(1595873466);
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                            0FI.A09(-2072631953, A037);
                            obtain.writeInt(0);
                            obtain.writeByteArray(null);
                            int A038 = 0FI.A03(122668835);
                            try {
                                zzfnVar2.A00.transact(1, obtain, null, 1);
                                obtain.recycle();
                                0FI.A09(443049027, A038);
                                0FI.A09(-644759487, A036);
                            } catch (Throwable th2) {
                                obtain.recycle();
                                0FI.A09(-1262445610, A038);
                                throw th2;
                            }
                        } catch (RemoteException e) {
                            android.util.Log.e("WearableLS", "Failed to send a response back", e);
                        }
                        0FI.A09(1871946065, A035);
                    }
                }, "onRequestReceived");
                i3 = -874054457;
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 14:
                creator = zzcl.CREATOR;
                JQy.A0R(parcel, creator);
                L6m.A00(parcel);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 15:
                creator = zzcj.CREATOR;
                JQy.A0R(parcel, creator);
                L6m.A00(parcel);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 16:
                final zzhf zzhfVar = (zzhf) JQy.A0R(parcel, zzhf.CREATOR);
                L6m.A00(parcel);
                A03 = 0FI.A03(1836571491);
                Runnable runnable = new Runnable() { // from class: X.Lol
                    public static final String __redex_internal_original_name = "zzt";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhfVar.A00.close();
                    }
                };
                DataHolder dataHolder2 = zzhfVar.A00;
                if (zzag.A00(zzagVar, 0Pz.A0d("DataHolder[rows=", "]", dataHolder2.A00), runnable, "onNodeMigrated")) {
                    i3 = 172541255;
                } else {
                    dataHolder2.close();
                    i3 = 905626531;
                }
                0FI.A09(i3, A03);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
            case 17:
                creator = zzhu.CREATOR;
                JQy.A0R(parcel, creator);
                L6m.A00(parcel);
                z = true;
                i5 = 1351597170;
                0FI.A09(i5, A033);
                i6 = 941248919;
                0FI.A09(i6, A032);
                return z;
        }
    }
}
