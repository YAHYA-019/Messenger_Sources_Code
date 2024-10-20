package com.facebook.profilo.multiprocess;

import X.0FI;
import X.0Gx;
import X.0H4;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.ipc.IProfiloMultiProcessTraceListener;
import com.facebook.profilo.ipc.IProfiloMultiProcessTraceService;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.util.Iterator;
import java.util.List;

/* loaded from: ProfiloMultiProcessTraceServiceImpl.class */
public final class ProfiloMultiProcessTraceServiceImpl extends Binder implements 0Gx, IProfiloMultiProcessTraceService {
    public final SparseArray A00;

    public ProfiloMultiProcessTraceServiceImpl() {
        this(0);
        int A03 = 0FI.A03(-285691361);
        this.A00 = new SparseArray(0);
        0FI.A09(-1011155476, A03);
    }

    public ProfiloMultiProcessTraceServiceImpl(int i) {
        int A03 = 0FI.A03(835381719);
        attachInterface(this, "com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
        0FI.A09(-1535492582, A03);
    }

    private void A00(TraceContext traceContext, int i) {
        int i2;
        SparseArray clone;
        int A03 = 0FI.A03(-1152971675);
        SparseArray sparseArray = this.A00;
        synchronized (sparseArray) {
            try {
                clone = sparseArray.clone();
            } catch (Throwable th) {
                th = th;
                i2 = -486387893;
            }
        }
        int size = clone.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                0FI.A09(-230244603, A03);
                return;
            }
            IProfiloMultiProcessTraceListener iProfiloMultiProcessTraceListener = (IProfiloMultiProcessTraceListener) clone.valueAt(i4);
            if (iProfiloMultiProcessTraceListener != null) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (traceContext != null) {
                                try {
                                    iProfiloMultiProcessTraceListener.DA5(traceContext.A06);
                                } catch (RemoteException unused) {
                                    synchronized (sparseArray) {
                                        try {
                                            sparseArray.remove(clone.keyAt(i4));
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i2 = 946254027;
                                            0FI.A09(i2, A03);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        } else if (traceContext != null) {
                            iProfiloMultiProcessTraceListener.onTraceAbort(traceContext);
                        }
                    } else if (traceContext != null) {
                        iProfiloMultiProcessTraceListener.onTraceStop(traceContext);
                    }
                } else if (traceContext != null) {
                    iProfiloMultiProcessTraceListener.onTraceStart(traceContext);
                }
            }
            i3 = i4 + 1;
        }
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceService
    public void CRC(long j, int i) {
        int i2;
        int A03 = 0FI.A03(1936890469);
        int A032 = 0FI.A03(-1944644427);
        boolean z = true;
        if (Binder.getCallingUid() != Process.myUid()) {
            z = false;
            Log.e("ProfiloMultiProcessTraceServiceImpl", "UID of caller is different from UID of listener");
        }
        0FI.A09(-2104514617, A032);
        if (z) {
            int callingPid = Binder.getCallingPid();
            SparseArray sparseArray = this.A00;
            synchronized (sparseArray) {
                try {
                    if (((IProfiloMultiProcessTraceListener) sparseArray.get(callingPid)) == null) {
                        Log.e("ProfiloMultiProcessTraceServiceImpl", "Unknown listener sent trace abort in secondary");
                        i2 = -773353956;
                    } else {
                        0H4 r0 = 0H4.A0C;
                        if (r0 == null) {
                            i2 = 520329523;
                        } else {
                            Iterator it = r0.A0B().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                TraceContext traceContext = (TraceContext) it.next();
                                if (traceContext.A06 == j) {
                                    0H4.A07(r0, traceContext.A0B, traceContext.A01, 0, i | ((-1) << (-1)), traceContext.A05);
                                    break;
                                }
                            }
                            i2 = 97671473;
                        }
                    }
                } catch (Throwable th) {
                    0FI.A09(-1332906130, A03);
                    throw th;
                }
            }
        } else {
            i2 = 1154176488;
        }
        0FI.A09(i2, A03);
    }

    public void CRF(TraceContext traceContext) {
        int A03 = 0FI.A03(1254792233);
        A00(traceContext, 0);
        0FI.A09(749827866, A03);
    }

    public void CRG(TraceContext traceContext) {
        0FI.A09(476565859, 0FI.A03(-1014289658));
    }

    @Override // com.facebook.profilo.ipc.IProfiloMultiProcessTraceService
    public void CcO(IProfiloMultiProcessTraceListener iProfiloMultiProcessTraceListener) {
        int i;
        int i2;
        int A03 = 0FI.A03(805729410);
        int A032 = 0FI.A03(-1944644427);
        boolean z = true;
        if (Binder.getCallingUid() != Process.myUid()) {
            z = false;
            Log.e("ProfiloMultiProcessTraceServiceImpl", "UID of caller is different from UID of listener");
        }
        0FI.A09(-2104514617, A032);
        if (z) {
            int callingPid = Binder.getCallingPid();
            SparseArray sparseArray = this.A00;
            synchronized (sparseArray) {
                try {
                    if (sparseArray.get(callingPid) != null) {
                        i2 = 1405122721;
                    } else {
                        sparseArray.put(callingPid, iProfiloMultiProcessTraceListener);
                        0H4 r0 = 0H4.A0C;
                        if (r0 == null) {
                            i2 = -1490498473;
                        } else {
                            List<TraceContext> A0B = r0.A0B();
                            if (!A0B.isEmpty()) {
                                for (TraceContext traceContext : A0B) {
                                    if ((traceContext.A02 & ExternalProviders.A06.A01) != 0) {
                                        try {
                                            iProfiloMultiProcessTraceListener.onTraceStart(traceContext);
                                        } catch (RemoteException unused) {
                                            synchronized (sparseArray) {
                                                try {
                                                    sparseArray.remove(callingPid);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i = -165993526;
                                                    0FI.A09(i, A03);
                                                    throw th;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i2 = -1685209922;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 1276855034;
                }
            }
        } else {
            i2 = -379711468;
        }
        0FI.A09(i2, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1315957551, 0FI.A03(1431318740));
        return this;
    }

    public void onTraceAbort(TraceContext traceContext) {
        int A03 = 0FI.A03(704364162);
        A00(traceContext, 2);
        0FI.A09(-2037965405, A03);
    }

    public void onTraceStop(TraceContext traceContext) {
        int size;
        int A03 = 0FI.A03(-790101250);
        A00(traceContext, 1);
        A00(traceContext, 3);
        SparseArray sparseArray = this.A00;
        synchronized (sparseArray) {
            try {
                size = sparseArray.size();
            } catch (Throwable th) {
                0FI.A09(-1040840966, A03);
                throw th;
            }
        }
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8126500, 0, 0L), "num_connected_processes"), String.valueOf(size));
        0FI.A09(-273491228, A03);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(-1530826872);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
                if (i == 1) {
                    CcO(ProfiloMultiProcessTraceListenerImpl.A00(parcel.readStrongBinder()));
                } else if (i == 2) {
                    CRC(parcel.readLong(), parcel.readInt());
                }
                parcel2.writeNoException();
                i3 = 1727197235;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.profilo.ipc.IProfiloMultiProcessTraceService");
                i3 = 8790207;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-2007215651, A03);
        return onTransact;
    }
}
