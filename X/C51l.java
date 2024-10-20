package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.acra.constants.ActionId;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.internal.zzbo;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.51l, reason: invalid class name */
/* loaded from: 51l.class */
public abstract class C51l implements Runnable {
    public static final String __redex_internal_original_name = "zzv";
    public final 4FE A00;

    public C51l() {
        this.A00 = null;
    }

    public C51l(4FE r302) {
        this.A00 = r302;
    }

    public void A00() {
        IInterface queryLocalInterface;
        if (this instanceof C51t) {
            C2uj c2uj = ((C51t) this).A00;
            synchronized (c2uj.A07) {
                AtomicInteger atomicInteger = c2uj.A0B;
                if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                    if (c2uj.A01 != null) {
                        c2uj.A06.A03(JQw.A00(200), new Object[0]);
                        c2uj.A03.unbindService(c2uj.A00);
                        c2uj.A02 = false;
                        c2uj.A01 = null;
                        c2uj.A00 = null;
                    }
                    C2uj.A00(c2uj);
                } else {
                    c2uj.A06.A03(JQw.A00(ActionId.VIDEO_DISPLAYED), new Object[0]);
                }
            }
            return;
        }
        if (this instanceof C51m) {
            C51m c51m = (C51m) this;
            final C2uj c2uj2 = c51m.A01;
            synchronized (c2uj2.A07) {
                final 4FE r0 = c51m.A00;
                c2uj2.A0A.add(r0);
                r0.A00.A08(new C51o() { // from class: X.51v
                    @Override // X.C51o
                    public final void Bpv(C4Ez c4Ez) {
                        C2uj c2uj3 = c2uj2;
                        4FE r02 = r0;
                        synchronized (c2uj3.A07) {
                            c2uj3.A0A.remove(r02);
                        }
                    }
                });
                if (c2uj2.A0B.getAndIncrement() > 0) {
                    c2uj2.A06.A03(JQw.A00(ActionId.HEADER_DATA_LOADED), new Object[0]);
                }
                C51l c51l = c51m.A02;
                if (c2uj2.A01 == null && !c2uj2.A02) {
                    C2uh c2uh = c2uj2.A06;
                    c2uh.A03(JQw.A00(ActionId.DISPLAYED), new Object[0]);
                    List<C51l> list = c2uj2.A09;
                    list.add(c51l);
                    C51x c51x = new C51x(c2uj2);
                    c2uj2.A00 = c51x;
                    c2uj2.A02 = true;
                    if (!c2uj2.A03.bindService(c2uj2.A04, c51x, 1)) {
                        c2uh.A03(JQw.A00(46), new Object[0]);
                        c2uj2.A02 = false;
                        for (C51l c51l2 : list) {
                            RuntimeException runtimeException = new RuntimeException() { // from class: X.7wy
                                {
                                    JQw.A00(46);
                                }
                            };
                            4FE r02 = c51l2.A00;
                            if (r02 != null) {
                                r02.A02(runtimeException);
                            }
                        }
                        list.clear();
                    }
                } else if (c2uj2.A02) {
                    c2uj2.A06.A03(JQw.A00(204), new Object[0]);
                    c2uj2.A09.add(c51l);
                } else {
                    c51l.run();
                }
            }
            return;
        }
        if (this instanceof C51s) {
            C51s c51s = (C51s) this;
            try {
                C2ug c2ug = c51s.A01;
                IInterface iInterface = c2ug.A00.A01;
                String str = c2ug.A01;
                ArrayList A01 = C2ug.A01(c51s.A02);
                Bundle bundle = new Bundle();
                bundle.putInt(JQw.A00(329), 11004);
                zzbh zzbhVar = new zzbh(c51s.A00, c2ug);
                0FI.A09(880255504, 0FI.A03(371321985));
                zzbm zzbmVar = (zzbm) iInterface;
                int A03 = 0FI.A03(-1687629948);
                Parcel A00 = zzbmVar.A00();
                A00.writeString(str);
                A00.writeTypedList(A01);
                A00.writeInt(1);
                bundle.writeToParcel(A00, 0);
                A00.writeStrongBinder(zzbhVar);
                zzbmVar.A01(A00, 8);
                0FI.A09(1282849471, A03);
                return;
            } catch (RemoteException e) {
                C2ug.A02.A05(e, 1BJ.A00(1227), c51s.A02);
                c51s.A00.A02(AnonymousClass001.A0U(e));
                return;
            }
        }
        if (!(this instanceof C52A)) {
            C51k c51k = (C51k) this;
            try {
                C2ug c2ug2 = c51k.A01;
                IInterface iInterface2 = c2ug2.A00.A01;
                String str2 = c2ug2.A01;
                zzbh zzbhVar2 = new zzbh(c51k.A00, c2ug2);
                0FI.A09(2043325433, 0FI.A03(-83112058));
                zzbm zzbmVar2 = (zzbm) iInterface2;
                int A032 = 0FI.A03(-414491177);
                Parcel A002 = zzbmVar2.A00();
                A002.writeString(str2);
                A002.writeStrongBinder(zzbhVar2);
                zzbmVar2.A01(A002, 6);
                0FI.A09(2065796331, A032);
                return;
            } catch (RemoteException e2) {
                C2ug.A02.A05(e2, 1BJ.A00(1385), AnonymousClass001.A1Z());
                c51k.A00.A02(AnonymousClass001.A0U(e2));
                return;
            }
        }
        C52A c52a = (C52A) this;
        C2uj c2uj3 = c52a.A01.A00;
        IBinder iBinder = c52a.A00;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            if (!(queryLocalInterface instanceof zzbo)) {
                queryLocalInterface = new zzbm(iBinder);
            }
        }
        c2uj3.A01 = queryLocalInterface;
        C2uh c2uh2 = c2uj3.A06;
        c2uh2.A03("linkToDeath", new Object[0]);
        try {
            c2uj3.A01.asBinder().linkToDeath(c2uj3.A05, 0);
        } catch (RemoteException e3) {
            c2uh2.A05(e3, AnonymousClass000.A00(265), new Object[0]);
        }
        c2uj3.A02 = false;
        List list2 = c2uj3.A09;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2.clear();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A00();
        } catch (Exception e) {
            4FE r0 = this.A00;
            if (r0 != null) {
                r0.A02(e);
            }
        }
    }
}
