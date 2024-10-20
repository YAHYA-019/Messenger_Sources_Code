package X;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.s;
import com.google.android.play.integrity.internal.f;
import com.google.android.play.integrity.internal.h;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: Lra.class */
public abstract class Lra implements Runnable {
    public static final String __redex_internal_original_name = "l";
    public final 4FE A00;

    public Lra() {
        this.A00 = null;
    }

    public Lra(4FE r302) {
        this.A00 = r302;
    }

    public void A00(Exception exc) {
        4FE r0 = this.A00;
        if (r0 != null) {
            r0.A02(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String A0s;
        List list;
        IInterface queryLocalInterface;
        try {
            if (this instanceof K93) {
                L8E l8e = ((K93) this).A00.A00;
                l8e.A06.A00("unlinkToDeath", new Object[0]);
                l8e.A01.asBinder().unlinkToDeath(l8e.A05, 0);
                l8e.A01 = null;
                l8e.A02 = false;
                return;
            }
            if (this instanceof K95) {
                K95 k95 = (K95) this;
                L8E l8e2 = k95.A01.A00;
                IBinder iBinder = k95.A00;
                if (iBinder == null) {
                    queryLocalInterface = null;
                } else {
                    queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (!(queryLocalInterface instanceof h)) {
                        new f(iBinder);
                    }
                }
                l8e2.A01 = queryLocalInterface;
                Kox kox = l8e2.A06;
                kox.A00("linkToDeath", new Object[0]);
                try {
                    l8e2.A01.asBinder().linkToDeath(l8e2.A05, 0);
                } catch (RemoteException e) {
                    if (android.util.Log.isLoggable("PlayCore", 6)) {
                        android.util.Log.e("PlayCore", 0Pz.A0j(kox.A00, " : ", "linkToDeath failed"), e);
                    }
                }
                l8e2.A02 = false;
                list = l8e2.A09;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else {
                if (this instanceof K92) {
                    L8E l8e3 = ((K92) this).A00;
                    if (l8e3.A01 != null) {
                        l8e3.A06.A00("Unbind from service.", new Object[0]);
                        l8e3.A03.unbindService(l8e3.A00);
                        l8e3.A02 = false;
                        l8e3.A01 = null;
                        l8e3.A00 = null;
                    }
                    L8E.A00(l8e3);
                    return;
                }
                if (!(this instanceof K94)) {
                    K96 k96 = (K96) this;
                    try {
                        Kjj kjj = k96.A02;
                        IInterface iInterface = kjj.A01.A01;
                        byte[] bArr = k96.A03;
                        Bundle A05 = 1BK.A05();
                        A05.putString("package.name", kjj.A02);
                        A05.putByteArray("nonce", bArr);
                        A05.putInt("playcore.integrity.version.major", 1);
                        A05.putInt("playcore.integrity.version.minor", 1);
                        A05.putInt("playcore.integrity.version.patch", 0);
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        A0s2.add(new K91(System.currentTimeMillis()));
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        Iterator it2 = A0s2.iterator();
                        while (it2.hasNext()) {
                            KRq kRq = (KRq) it2.next();
                            Bundle A052 = 1BK.A05();
                            A052.putInt("event_type", 3);
                            A052.putLong("event_timestamp", ((K91) kRq).A00);
                            A0s3.add(A052);
                        }
                        A05.putParcelableArrayList("event_timestamps", 1BK.A17(A0s3));
                        s sVar = new s(k96.A00, kjj);
                        f fVar = (f) iInterface;
                        int A03 = 0FI.A03(-1142241991);
                        int A032 = 0FI.A03(495236924);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
                        0FI.A09(-1299367711, A032);
                        JQy.A13(A05, sVar, obtain);
                        int A033 = 0FI.A03(581613889);
                        try {
                            fVar.A00.transact(2, obtain, null, 1);
                            obtain.recycle();
                            0FI.A09(-2122573271, A033);
                            0FI.A09(-1909476450, A03);
                            return;
                        } catch (Throwable th) {
                            obtain.recycle();
                            0FI.A09(-1965590401, A033);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        Kox kox2 = k96.A02.A00;
                        Object[] objArr = {k96.A01};
                        if (android.util.Log.isLoggable("PlayCore", 6)) {
                            String str = kox2.A00;
                            try {
                                A0s = String.format(Locale.US, "requestIntegrityToken(%s)", objArr);
                            } catch (IllegalFormatException e3) {
                                A0s = JQz.A0s("requestIntegrityToken(%s)", e3, objArr);
                            }
                            android.util.Log.e("PlayCore", 0Pz.A0j(str, " : ", A0s), e2);
                        }
                        k96.A00.A02(new K2E(-100, e2));
                        return;
                    }
                }
                K94 k94 = (K94) this;
                L8E l8e4 = k94.A01;
                Lra lra = k94.A00;
                if (l8e4.A01 != null || l8e4.A02) {
                    if (!l8e4.A02) {
                        lra.run();
                        return;
                    } else {
                        l8e4.A06.A00("Waiting to bind to the service.", new Object[0]);
                        l8e4.A09.add(lra);
                        return;
                    }
                }
                Kox kox3 = l8e4.A06;
                kox3.A00("Initiate binding to the service.", new Object[0]);
                list = l8e4.A09;
                list.add(lra);
                ServiceConnection lFf = new LFf(l8e4);
                l8e4.A00 = lFf;
                l8e4.A02 = true;
                if (l8e4.A03.bindService(l8e4.A04, lFf, 1)) {
                    return;
                }
                kox3.A00("Failed to bind to the service.", new Object[0]);
                l8e4.A02 = false;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((Lra) it3.next()).A00(new Lx2());
                }
            }
            list.clear();
        } catch (Exception e4) {
            A00(e4);
        }
    }
}
