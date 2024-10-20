package com.google.android.play.core.review.internal;

import X.0FI;
import X.4FE;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.K8m;
import X.L8D;
import android.app.PendingIntent;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzh;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: zzb.class */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-98202493, 0FI.A03(1002777552));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = 0FI.A03(-171269680);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = 689531107;
            0FI.A09(i4, A03);
            return z;
        }
        zzg zzgVar = (zzg) this;
        int A032 = 0FI.A03(1049212340);
        if (i == 2) {
            BaseBundle baseBundle = (BaseBundle) JQy.A0R(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw JQy.A0P(dataAvail);
            }
            zzh zzhVar = (zzh) zzgVar;
            int A033 = 0FI.A03(1177152271);
            int A034 = 0FI.A03(-976474058);
            L8D l8d = zzhVar.A02.A00;
            if (l8d != null) {
                4FE r0 = zzhVar.A00;
                Object obj = l8d.A07;
                synchronized (obj) {
                    l8d.A0A.remove(r0);
                }
                synchronized (obj) {
                    AtomicInteger atomicInteger = l8d.A0B;
                    if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                        l8d.A01().post(new K8m(l8d));
                    } else {
                        l8d.A06.A00("Leaving the connection open for other ongoing calls.", AnonymousClass001.A1Z());
                    }
                }
            }
            zzhVar.A01.A00("onGetLaunchReviewFlowInfo", AnonymousClass001.A1Z());
            0FI.A09(-263498752, A034);
            zzhVar.A00.A03(new zza((PendingIntent) baseBundle.get("confirmation_intent"), baseBundle.getBoolean("is_review_no_op")));
            0FI.A09(39133478, A033);
            z = true;
            i3 = -23023183;
        } else {
            z = false;
            i3 = 128280352;
        }
        0FI.A09(i3, A032);
        i4 = 1923544143;
        0FI.A09(i4, A03);
        return z;
    }
}
