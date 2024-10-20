package com.google.android.play.core.appupdate.internal;

import X.0FI;
import X.4FE;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.K2C;
import X.Klu;
import X.KzJ;
import X.L0P;
import X.L8R;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.appupdate.zzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(188433676, 0FI.A03(995504929));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int i3;
        boolean z;
        int i4;
        int i5;
        int A032 = 0FI.A03(-89171206);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i5 = 1702442475;
            0FI.A09(i5, A032);
            return z;
        }
        zzg zzgVar = (zzg) this;
        int A033 = 0FI.A03(-514105484);
        if (i == 2) {
            Bundle bundle = (Bundle) JQy.A0R(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw JQy.A0P(dataAvail);
            }
            zzq zzqVar = (zzq) zzgVar;
            A03 = 0FI.A03(599897333);
            int A034 = 0FI.A03(1851581448);
            L8R l8r = zzqVar.A03.A00;
            4FE r0 = zzqVar.A00;
            l8r.A02(r0);
            zzqVar.A01.A01("onRequestInfo", new Object[0]);
            0FI.A09(2058404792, A034);
            if (bundle.getInt("error.code", -2) != 0) {
                r0.A02(new K2C(bundle.getInt("error.code", -2)));
                i3 = 679895007;
            } else {
                L0P l0p = zzqVar.A04;
                bundle.getInt("version.code", -1);
                int i6 = bundle.getInt("update.availability");
                bundle.getInt("install.status", 0);
                if (bundle.getInt("client.version.staleness", -1) != -1) {
                    bundle.getInt("client.version.staleness");
                }
                bundle.getInt("in.app.update.priority", 0);
                bundle.getLong("bytes.downloaded");
                bundle.getLong("total.bytes.to.download");
                bundle.getLong("additional.size.required");
                KzJ.A00(AnonymousClass001.A0D(l0p.A02.A00.getFilesDir(), "assetpacks"));
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
                PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
                PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
                PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
                HashMap A0u = AnonymousClass001.A0u();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                HashSet A0v = AnonymousClass001.A0v();
                if (integerArrayList != null) {
                    A0v.addAll(integerArrayList);
                }
                A0u.put("blocking.destructive.intent", A0v);
                ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                HashSet A0v2 = AnonymousClass001.A0v();
                if (integerArrayList2 != null) {
                    A0v2.addAll(integerArrayList2);
                }
                A0u.put("nonblocking.destructive.intent", A0v2);
                ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                HashSet A0v3 = AnonymousClass001.A0v();
                if (integerArrayList3 != null) {
                    A0v3.addAll(integerArrayList3);
                }
                A0u.put("blocking.intent", A0v3);
                ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                HashSet A0v4 = AnonymousClass001.A0v();
                if (integerArrayList4 != null) {
                    A0v4.addAll(integerArrayList4);
                }
                A0u.put("nonblocking.intent", A0v4);
                r0.A03(new Klu(pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, A0u, i6));
                i3 = 1129250259;
            }
        } else {
            if (i != 3) {
                z = false;
                i4 = -1002535477;
                0FI.A09(i4, A033);
                i5 = 745564069;
                0FI.A09(i5, A032);
                return z;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            int dataAvail2 = parcel.dataAvail();
            if (dataAvail2 > 0) {
                throw JQy.A0P(dataAvail2);
            }
            zzq zzqVar2 = (zzq) zzgVar;
            A03 = 0FI.A03(-1694609288);
            zzqVar2.A03.A00.A02(zzqVar2.A00);
            zzqVar2.A01.A01("onCompleteUpdate", AnonymousClass001.A1Z());
            i3 = 258448820;
        }
        0FI.A09(i3, A03);
        z = true;
        i4 = 1836726901;
        0FI.A09(i4, A033);
        i5 = 745564069;
        0FI.A09(i5, A032);
        return z;
    }
}
