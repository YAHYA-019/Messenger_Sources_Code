package com.facebook.profilo.multiprocess;

import X.0FI;
import X.0H4;
import X.0Pz;
import X.0Tr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0ld;
import X.C0m4;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener;
import com.facebook.profilo.ipc.IProfiloMultiProcessTraceService;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: ProfiloMultiProcessTraceListenerImpl.class */
public final class ProfiloMultiProcessTraceListenerImpl extends Binder implements C0m4, IProfiloMultiProcessTraceListener {
    public IProfiloMultiProcessTraceService A00;
    public final HashMap A01;

    public ProfiloMultiProcessTraceListenerImpl() {
        this(0);
        int A03 = 0FI.A03(-1288247727);
        this.A01 = AnonymousClass001.A0u();
        0FI.A09(1858616048, A03);
    }

    public ProfiloMultiProcessTraceListenerImpl(int i) {
        int A03 = 0FI.A03(-1700600152);
        attachInterface(this, "com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
        0FI.A09(752003360, A03);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener$Stub$Proxy, java.lang.Object, com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener] */
    public static IProfiloMultiProcessTraceListener A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IProfiloMultiProcessTraceListener)) {
            return (IProfiloMultiProcessTraceListener) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = 0FI.A03(-1543957421);
        obj.A00 = iBinder;
        0FI.A09(-1889045360, A03);
        return obj;
    }

    private void A01() {
        synchronized (this) {
            int A03 = 0FI.A03(69579572);
            this.A00 = null;
            0FI.A09(-235434113, A03);
        }
    }

    private boolean A02() {
        int A03 = 0FI.A03(1197914342);
        boolean z = true;
        if (Binder.getCallingUid() != Process.myUid()) {
            z = false;
            Log.e("ProfiloMultiProcessTraceListenerImpl", "UID of caller is different from UID of listener");
        }
        0FI.A09(-547652694, A03);
        return z;
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void CFc(IProfiloMultiProcessTraceService iProfiloMultiProcessTraceService) {
        int i;
        int A03 = 0FI.A03(-992970326);
        if (A02()) {
            synchronized (this) {
                try {
                    this.A00 = iProfiloMultiProcessTraceService;
                } catch (Throwable th) {
                    0FI.A09(-1188091436, A03);
                    throw th;
                }
            }
            try {
                synchronized (this) {
                    try {
                        this.A00.CcO(this);
                    } catch (Throwable th2) {
                        0FI.A09(-743416045, A03);
                        throw th2;
                    }
                }
            } catch (RemoteException unused) {
                A01();
            }
            i = -1144711224;
        } else {
            i = -414715261;
        }
        0FI.A09(i, A03);
    }

    @Override // X.C0m4
    public void CRJ(TraceContext traceContext, int i) {
        int i2;
        int A03 = 0FI.A03(339504157);
        HashMap hashMap = this.A01;
        synchronized (hashMap) {
            try {
                CountDownLatch countDownLatch = (CountDownLatch) hashMap.get(Long.valueOf(traceContext.A06));
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    hashMap.remove(Long.valueOf(traceContext.A06));
                }
            } catch (Throwable th) {
                0FI.A09(154389192, A03);
                throw th;
            }
        }
        try {
        } catch (RemoteException unused) {
            A01();
        }
        synchronized (this) {
            try {
                IProfiloMultiProcessTraceService iProfiloMultiProcessTraceService = this.A00;
                if (iProfiloMultiProcessTraceService == null) {
                    i2 = -2110295355;
                } else {
                    iProfiloMultiProcessTraceService.CRC(traceContext.A06, i);
                    i2 = 119649642;
                }
            } catch (Throwable th2) {
                0FI.A09(-1800080562, A03);
                throw th2;
            }
        }
        0FI.A09(i2, A03);
    }

    @Override // X.C0m4
    public void CRK(TraceContext traceContext) {
        CountDownLatch countDownLatch;
        int i;
        int A03 = 0FI.A03(936142770);
        long j = traceContext.A06;
        int A032 = 0FI.A03(-2121771009);
        HashMap hashMap = this.A01;
        synchronized (hashMap) {
            try {
                countDownLatch = (CountDownLatch) hashMap.get(Long.valueOf(j));
            } catch (Throwable th) {
                0FI.A09(-1039508583, A032);
                throw th;
            }
        }
        if (countDownLatch == null) {
            i = 1957562891;
        } else {
            countDownLatch.countDown();
            i = 795111174;
        }
        0FI.A09(i, A032);
        0FI.A09(-1763976283, A03);
    }

    @Override // X.C0m4
    public void CRL(TraceContext traceContext, Throwable th) {
        int A03 = 0FI.A03(1252042321);
        CRJ(traceContext, 8);
        0FI.A09(1764261891, A03);
    }

    @Override // X.C0m4
    public void CRM(TraceContext traceContext) {
        0FI.A09(217330980, 0FI.A03(-851942497));
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void DA5(long j) {
        int i;
        Long valueOf;
        CountDownLatch countDownLatch;
        int i2;
        int A03 = 0FI.A03(1290806219);
        if (A02()) {
            HashMap hashMap = this.A01;
            synchronized (hashMap) {
                try {
                    valueOf = Long.valueOf(j);
                    countDownLatch = (CountDownLatch) hashMap.get(valueOf);
                } catch (Throwable th) {
                    th = th;
                    i = -303834439;
                }
            }
            if (countDownLatch == null) {
                i2 = -1786122101;
            } else {
                try {
                    countDownLatch.await(5, TimeUnit.MINUTES);
                } catch (Exception unused) {
                }
                synchronized (hashMap) {
                    try {
                        hashMap.remove(valueOf);
                    } catch (Throwable th2) {
                        th = th2;
                        i = 402003534;
                        0FI.A09(i, A03);
                        throw th;
                    }
                }
                i2 = 1508858733;
            }
        } else {
            i2 = 1930330186;
        }
        0FI.A09(i2, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(2043779956, 0FI.A03(-2001458459));
        return this;
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceAbort(TraceContext traceContext) {
        int i;
        int A03 = 0FI.A03(-1487147206);
        if (A02()) {
            0H4 r0 = 0H4.A0C;
            if (r0 == null) {
                i = -181490466;
            } else {
                0H4.A07(r0, Long.valueOf(traceContext.A06), 0Tr.A00, 0, 2, traceContext.A05);
                HashMap hashMap = this.A01;
                synchronized (hashMap) {
                    try {
                        hashMap.remove(Long.valueOf(traceContext.A06));
                    } catch (Throwable th) {
                        0FI.A09(-1050354720, A03);
                        throw th;
                    }
                }
                i = 1140658230;
            }
        } else {
            i = -1773653082;
        }
        0FI.A09(i, A03);
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceStart(TraceContext traceContext) {
        int i;
        IllegalArgumentException A04;
        int A03 = 0FI.A03(96175303);
        if (A02()) {
            0H4 r0 = 0H4.A0C;
            if (r0 == null) {
                i = -1199604506;
            } else {
                HashMap hashMap = this.A01;
                synchronized (hashMap) {
                    try {
                        Long valueOf = Long.valueOf(traceContext.A06);
                        traceContext.A0B = valueOf;
                        if (!hashMap.containsKey(valueOf)) {
                            int i2 = 0Tr.A00;
                            int i3 = traceContext.A03;
                            Object obj = r0.A01.get(i2);
                            if (obj != null) {
                                C0ld c0ld = (C0ld) r0.A04.get();
                                if (c0ld != null) {
                                    Buffer[] A08 = 0H4.A08(c0ld, r0, traceContext.A08);
                                    long j = traceContext.A06;
                                    String str = traceContext.A0D;
                                    if (0H4.A06(r0, new TraceContext(c0ld, traceContext.A08, A08[0], r0.A0A(str), obj, traceContext.A0B, str, r0.A02, A08, i2, traceContext.A02, traceContext.A03, traceContext.A00, traceContext.A04, j, traceContext.A05), i3)) {
                                        hashMap.put(Long.valueOf(traceContext.A06), AnonymousClass001.A11());
                                    } else {
                                        i = -2115359557;
                                    }
                                } else {
                                    A04 = AnonymousClass001.A0L("No config available");
                                }
                            } else {
                                A04 = 0Pz.A04("Unregistered controller for id = ", i2);
                            }
                            throw A04;
                        }
                        i = -1630590431;
                    } catch (Throwable th) {
                        0FI.A09(502393630, A03);
                        throw th;
                    }
                }
            }
        } else {
            i = -1228103772;
        }
        0FI.A09(i, A03);
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener
    public void onTraceStop(TraceContext traceContext) {
        int i;
        int A03 = 0FI.A03(-1949919233);
        if (A02()) {
            0H4 r0 = 0H4.A0C;
            if (r0 == null) {
                i = 2030762139;
            } else {
                if (!r0.A0F(Long.valueOf(traceContext.A06), 0Tr.A00, traceContext.A05)) {
                    HashMap hashMap = this.A01;
                    synchronized (hashMap) {
                        try {
                            hashMap.remove(Long.valueOf(traceContext.A06));
                        } catch (Throwable th) {
                            0FI.A09(1197349285, A03);
                            throw th;
                        }
                    }
                }
                i = 2128687375;
            }
        } else {
            i = 1377863948;
        }
        0FI.A09(i, A03);
    }

    /* JADX WARN: Type inference failed for: r314v1, types: [com.facebook.profilo.ipc.IProfiloMultiProcessTraceService$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IProfiloMultiProcessTraceService iProfiloMultiProcessTraceService;
        int A03 = 0FI.A03(-1498424839);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iProfiloMultiProcessTraceService = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof IProfiloMultiProcessTraceService)) {
                            ?? obj = new Object();
                            int A032 = 0FI.A03(-1878909366);
                            obj.A00 = readStrongBinder;
                            0FI.A09(2058609843, A032);
                            iProfiloMultiProcessTraceService = obj;
                        } else {
                            iProfiloMultiProcessTraceService = (IProfiloMultiProcessTraceService) queryLocalInterface;
                        }
                    }
                    CFc(iProfiloMultiProcessTraceService);
                } else if (i == 2) {
                    onTraceStart((TraceContext) AnonymousClass002.A0I(parcel, TraceContext.CREATOR));
                } else if (i == 3) {
                    onTraceStop((TraceContext) AnonymousClass002.A0I(parcel, TraceContext.CREATOR));
                } else if (i == 4) {
                    onTraceAbort((TraceContext) AnonymousClass002.A0I(parcel, TraceContext.CREATOR));
                } else if (i == 5) {
                    DA5(parcel.readLong());
                }
                parcel2.writeNoException();
                i3 = 1294838050;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener");
                i3 = -436317488;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(1964285259, A03);
        return onTransact;
    }
}
