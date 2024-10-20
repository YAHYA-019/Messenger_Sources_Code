package androidx.work.multiprocess;

import X.0FI;
import X.0Pz;
import X.11T;
import X.4IS;
import X.4IX;
import X.4YV;
import X.AbF;
import X.AnonymousClass001;
import X.C4Ic;
import X.C4Ih;
import X.C4Ii;
import X.C4Kc;
import X.C4Kl;
import X.C4Uv;
import X.C4YH;
import X.Kgj;
import X.KvZ;
import X.LpA;
import X.LqH;
import X.Lrc;
import X.MEe;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.ListenableWorkerImpl;
import androidx.work.multiprocess.RemoteCoroutineWorker;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: ListenableWorkerImpl.class */
public final class ListenableWorkerImpl extends Binder implements IListenableWorkerImpl {
    public final Context A00;
    public final 4IX A01;
    public final MEe A02;
    public final C4YH A03;
    public final C4Ii A04;
    public final Map A05;
    public static final String A08 = 4IS.A01("WM-RemoteWorker ListenableWorkerImpl");
    public static byte[] A06 = new byte[0];
    public static final Object A07 = AnonymousClass001.A0R();

    public ListenableWorkerImpl() {
        int A03 = 0FI.A03(-11090423);
        attachInterface(this, IListenableWorkerImpl.A00);
        0FI.A09(-1523677328, A03);
    }

    public ListenableWorkerImpl(Context context) {
        this();
        int A03 = 0FI.A03(982258764);
        this.A00 = context.getApplicationContext();
        if (C4Uv.A05 == null) {
            synchronized (C4Uv.A04) {
                if (C4Uv.A05 == null) {
                    C4Uv.A05 = new C4Uv(context);
                }
            }
        }
        C4Uv c4Uv = C4Uv.A05;
        this.A01 = c4Uv.A00;
        this.A04 = c4Uv.A03;
        this.A03 = c4Uv.A02;
        this.A02 = c4Uv.A01;
        this.A05 = AnonymousClass001.A0u();
        0FI.A09(-2121848464, A03);
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void BPt(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        Kgj kgj;
        int A03 = 0FI.A03(1868950466);
        try {
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) KvZ.A00(ParcelableInterruptRequest.CREATOR, bArr);
            String str = parcelableInterruptRequest.A01;
            int i = parcelableInterruptRequest.A00;
            4IS.A00().A02(A08, 0Pz.A0j("Interrupting work with id (", str, ")"));
            synchronized (A07) {
                try {
                    kgj = (Kgj) this.A05.remove(str);
                } catch (Throwable th) {
                    0FI.A09(831088484, A03);
                    throw th;
                }
            }
            if (kgj != null) {
                ((C4Ih) this.A04).A01.execute(new LpA(iWorkManagerImplCallback, kgj, i));
            } else {
                Lrc.A01(iWorkManagerImplCallback, A06);
            }
        } catch (Throwable th2) {
            Lrc.A00(iWorkManagerImplCallback, th2);
        }
        0FI.A09(1471530592, A03);
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.4Ks] */
    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void D2W(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
        int A03 = 0FI.A03(-1755017080);
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) KvZ.A00(ParcelableRemoteWorkRequest.CREATOR, bArr);
            ParcelableWorkerParameters parcelableWorkerParameters = parcelableRemoteWorkRequest.A00;
            final 4IX r0 = this.A01;
            final C4Ii c4Ii = this.A04;
            C4YH c4yh = this.A03;
            MEe mEe = this.A02;
            UUID uuid = parcelableWorkerParameters.A05;
            C4Kc c4Kc = parcelableWorkerParameters.A02;
            Set set = parcelableWorkerParameters.A04;
            C4Kl c4Kl = parcelableWorkerParameters.A03;
            int i = parcelableWorkerParameters.A01;
            int i2 = parcelableWorkerParameters.A00;
            Executor executor = r0.A07;
            C4Ic c4Ic = r0.A05;
            final ?? obj = new Object();
            obj.A09 = uuid;
            obj.A02 = c4Kc;
            obj.A08 = AbF.A1E(set);
            obj.A06 = c4Kl;
            obj.A01 = i;
            obj.A00 = i2;
            obj.A0A = executor;
            obj.A07 = c4Ii;
            obj.A05 = c4Ic;
            obj.A04 = c4yh;
            obj.A03 = mEe;
            String obj2 = obj.A09.toString();
            final String str = parcelableRemoteWorkRequest.A01;
            4IS.A00().A02(A08, 0Pz.A0z("Executing work request (", obj2, ", ", str, ")"));
            int A032 = 0FI.A03(337897770);
            final Context context = this.A00;
            4YV.A1N(context, str);
            11T.A0F(c4Ii, 4);
            final ?? obj3 = new Object();
            final Kgj kgj = new Kgj(obj3);
            C4Ih c4Ih = (C4Ih) c4Ii;
            c4Ih.A02.execute(new Runnable() { // from class: X.Lr8
                public static final String __redex_internal_original_name = "RemoteWorkerWrapperKt$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    IllegalStateException A0N;
                    C4Ks c4Ks = obj3;
                    4IX r02 = r0;
                    Context context2 = context;
                    String str2 = str;
                    WorkerParameters workerParameters = obj;
                    C4Ii c4Ii2 = c4Ii;
                    Kgj kgj2 = kgj;
                    7zP.A1L(workerParameters, 4, kgj2);
                    try {
                        if (c4Ks.isCancelled()) {
                            return;
                        }
                        C4Ky A01 = r02.A05.A01(context2, workerParameters, str2);
                        if (A01 == null) {
                            String A0W = 0Pz.A0W("Unable to create an instance of ", str2);
                            4IS.A00();
                            android.util.Log.e(ListenableWorkerImpl.A08, A0W);
                            A0N = AnonymousClass001.A0N(A0W);
                        } else {
                            if (A01 instanceof RemoteListenableWorker) {
                                c4Ks.addListener(new LpC(A01, c4Ks, kgj2), ((C4Ih) c4Ii2).A01);
                                RemoteCoroutineWorker remoteCoroutineWorker = (RemoteCoroutineWorker) ((RemoteListenableWorker) A01);
                                7zO.A1W(remoteCoroutineWorker, 2aG.A02(0DK.A02(2aN.A00, remoteCoroutineWorker.A01)), 25);
                                c4Ks.A05(remoteCoroutineWorker.A00);
                                return;
                            }
                            String A0j = 0Pz.A0j(str2, " does not extend ", RemoteListenableWorker.class.getName());
                            4IS.A00();
                            android.util.Log.e(ListenableWorkerImpl.A08, A0j);
                            A0N = AnonymousClass001.A0N(A0j);
                        }
                        c4Ks.A07(A0N);
                    } catch (Throwable th) {
                        c4Ks.A07(th);
                    }
                }
            });
            synchronized (A07) {
                try {
                    this.A05.put(obj2, kgj);
                } catch (Throwable th) {
                    0FI.A09(1701600975, A032);
                    throw th;
                }
            }
            ListenableFuture listenableFuture = kgj.A00;
            0FI.A09(339534567, A032);
            listenableFuture.addListener(new LqH(iWorkManagerImplCallback, this, listenableFuture, obj2), c4Ih.A01);
        } catch (Throwable th2) {
            Lrc.A00(iWorkManagerImplCallback, th2);
        }
        0FI.A09(-693993270, A03);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        0FI.A09(1651783307, 0FI.A03(-2054242654));
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = 0FI.A03(280652047);
        String str = IListenableWorkerImpl.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    D2W(IWorkManagerImplCallback.Stub.A00(parcel), parcel.createByteArray());
                } else if (i == 2) {
                    BPt(IWorkManagerImplCallback.Stub.A00(parcel), parcel.createByteArray());
                }
                i3 = -1482498243;
                0FI.A09(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = -749961473;
                0FI.A09(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        0FI.A09(-1470443649, A03);
        return onTransact;
    }
}
