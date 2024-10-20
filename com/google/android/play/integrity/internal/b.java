package com.google.android.play.integrity.internal;

import X.0FI;
import X.4FE;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.K2E;
import X.K8i;
import X.K92;
import X.L8E;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.integrity.s;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: b.class */
public abstract class b extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        0FI.A09(-1313686943, 0FI.A03(163954456));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int A03 = 0FI.A03(277221383);
        if (i <= 16777215) {
            JQx.A18(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i4 = 487345273;
            0FI.A09(i4, A03);
            return z;
        }
        s sVar = (s) this;
        int A032 = 0FI.A03(1735054892);
        if (i == 2) {
            BaseBundle baseBundle = (BaseBundle) JQy.A0R(parcel, Bundle.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw JQy.A0P(dataAvail);
            }
            int A033 = 0FI.A03(-1001810849);
            L8E l8e = sVar.A02.A01;
            4FE r0 = sVar.A00;
            Object obj = l8e.A07;
            synchronized (obj) {
                l8e.A0A.remove(r0);
            }
            synchronized (obj) {
                AtomicInteger atomicInteger = l8e.A0B;
                if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                    l8e.A01().post(new K92(l8e));
                } else {
                    l8e.A06.A00("Leaving the connection open for other ongoing calls.", AnonymousClass001.A1Z());
                }
            }
            sVar.A01.A00("onRequestIntegrityToken", AnonymousClass001.A1Z());
            int i6 = baseBundle.getInt("error");
            if (i6 != 0) {
                r0.A02(new K2E(i6, (Throwable) null));
                i5 = -1670897561;
            } else {
                String string = baseBundle.getString("token");
                if (string == null) {
                    r0.A02(new K2E(-100, (Throwable) null));
                    i5 = 360108791;
                } else {
                    r0.A03(new K8i(string));
                    i5 = 1453337108;
                }
            }
            0FI.A09(i5, A033);
            z = true;
            i3 = -2013443003;
        } else {
            z = false;
            i3 = -1004332104;
        }
        0FI.A09(i3, A032);
        i4 = 1606579641;
        0FI.A09(i4, A03);
        return z;
    }
}
