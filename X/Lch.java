package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: Lch.class */
public final class Lch implements MKv {
    public IAccountAccessor A00;
    public MQg A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A09;
    public ConnectionResult A0A;
    public final Context A0B;
    public final GoogleApiAvailabilityLight A0C;
    public final Lcl A0D;
    public final 2A9 A0E;
    public final Lock A0G;
    public final AnonymousClass283 A0I;
    public final java.util.Map A0J;
    public int A08 = 0;
    public final Bundle A0H = 1BK.A05();
    public final Set A0K = AnonymousClass001.A0v();
    public final ArrayList A0F = AnonymousClass001.A0s();

    public Lch(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass283 anonymousClass283, Lcl lcl, 2A9 r306, java.util.Map map, Lock lock) {
        this.A0D = lcl;
        this.A0E = r306;
        this.A0J = map;
        this.A0C = googleApiAvailabilityLight;
        this.A0I = anonymousClass283;
        this.A0G = lock;
        this.A0B = context;
    }

    private final void A00() {
        Lcl lcl = this.A0D;
        Lock lock = lcl.A0D;
        lock.lock();
        try {
            lcl.A05.A0G();
            lcl.A0E = new Lcf(lcl);
            lcl.A0E.DBb();
            lcl.A0C.signalAll();
            lock.unlock();
            Kar.A00.execute(new Lls(this));
            MQg mQg = this.A01;
            if (mQg != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    AbstractC00481b7.A02(iAccountAccessor);
                    boolean z = this.A06;
                    K38 k38 = (K38) mQg;
                    try {
                        zaa zaaVar = (zaa) k38.A03();
                        Integer num = k38.A00;
                        AbstractC00481b7.A02(num);
                        int intValue = num.intValue();
                        int A03 = 0FI.A03(-1016209369);
                        Parcel A00 = zaaVar.A00();
                        A00.writeStrongBinder(iAccountAccessor == null ? null : iAccountAccessor.asBinder());
                        A00.writeInt(intValue);
                        A00.writeInt(z ? 1 : 0);
                        zaaVar.A02(A00, 9);
                        0FI.A09(-1790750157, A03);
                    } catch (RemoteException unused) {
                        android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A1B = 1BK.A1B(lcl.A0A);
            while (A1B.hasNext()) {
                Object obj = lcl.A09.get(A1B.next());
                AbstractC00481b7.A02(obj);
                ((2AE) obj).disconnect();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            lcl.A07.DBY(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static final void A01(ConnectionResult connectionResult, AnonymousClass286 anonymousClass286, Lch lch, boolean z) {
        int i;
        int i2 = (-1) >>> 1;
        if ((!z || (((i = connectionResult.A01) != 0 && connectionResult.A02 != null) || lch.A0C.A05(null, null, i) != null)) && lch.A0A == null) {
            lch.A0A = connectionResult;
            lch.A07 = i2;
        }
        lch.A0D.A0A.put(anonymousClass286.A01, connectionResult);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (r301.A02 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(com.google.android.gms.common.ConnectionResult r301, X.Lch r302) {
        /*
            r0 = r302
            java.util.ArrayList r0 = r0.A0F
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 0
            r305 = r0
        Ld:
            r0 = r305
            r1 = r304
            if (r0 >= r1) goto L34
            r0 = r303
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.cancel(r1)
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto Ld
        L34:
            r0 = r303
            r0.clear()
            r0 = r301
            int r0 = r0.A01
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L51
            r0 = r301
            android.app.PendingIntent r0 = r0.A02
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L57
        L51:
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
        L57:
            r0 = r307
            r1 = 1
            r0 = r0 ^ r1
            r307 = r0
            r0 = r302
            r1 = r307
            r0.A05(r1)
            r0 = r302
            X.Lcl r0 = r0.A0D
            r308 = r0
            r0 = r308
            r1 = r301
            r0.A00(r1)
            r0 = r308
            X.MJe r0 = r0.A07
            r1 = r301
            r0.DBV(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lch.A02(com.google.android.gms.common.ConnectionResult, X.Lch):void");
    }

    public static final void A03(Lch lch) {
        lch.A03 = false;
        Lcl lcl = lch.A0D;
        lcl.A05.A03 = Collections.emptySet();
        for (Object obj : lch.A0K) {
            java.util.Map map = lcl.A0A;
            if (!map.containsKey(obj)) {
                map.put(obj, new ConnectionResult(17, null));
            }
        }
    }

    public static final void A04(Lch lch) {
        if (lch.A09 == 0) {
            if (!lch.A03 || lch.A04) {
                ArrayList A0s = AnonymousClass001.A0s();
                lch.A08 = 1;
                Lcl lcl = lch.A0D;
                java.util.Map map = lcl.A09;
                lch.A09 = map.size();
                Iterator A1B = 1BK.A1B(map);
                while (A1B.hasNext()) {
                    Object next = A1B.next();
                    if (!lcl.A0A.containsKey(next)) {
                        A0s.add(map.get(next));
                    } else if (A06(lch)) {
                        lch.A00();
                    }
                }
                if (A0s.isEmpty()) {
                    return;
                }
                lch.A0F.add(Kar.A00.submit(new K2d(lch, A0s)));
            }
        }
    }

    private final void A05(boolean z) {
        MQg mQg = this.A01;
        if (mQg != null) {
            if (mQg.isConnected() && z) {
                K38 k38 = (K38) mQg;
                try {
                    zaa zaaVar = (zaa) k38.A03();
                    Integer num = k38.A00;
                    AbstractC00481b7.A02(num);
                    int intValue = num.intValue();
                    int A03 = 0FI.A03(-886822658);
                    Parcel A00 = zaaVar.A00();
                    A00.writeInt(intValue);
                    zaaVar.A02(A00, 7);
                    0FI.A09(1596129880, A03);
                } catch (RemoteException unused) {
                    android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            mQg.disconnect();
            AbstractC00481b7.A02(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(Lch lch) {
        ConnectionResult connectionResult;
        int i = lch.A09 - 1;
        lch.A09 = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            K2P k2p = lch.A0D.A05;
            StringWriter stringWriter = new StringWriter();
            k2p.A0D("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
            android.util.Log.w("GACConnecting", stringWriter.toString());
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, null);
        } else {
            connectionResult = lch.A0A;
            if (connectionResult == null) {
                return true;
            }
            lch.A0D.A00 = lch.A07;
        }
        A02(connectionResult, lch);
        return false;
    }

    public static final boolean A07(Lch lch, int i) {
        if (lch.A08 == i) {
            return true;
        }
        K2P k2p = lch.A0D.A05;
        StringWriter stringWriter = new StringWriter();
        k2p.A0D("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        android.util.Log.w("GACConnecting", stringWriter.toString());
        android.util.Log.w("GACConnecting", "Unexpected callback in ".concat(lch.toString()));
        android.util.Log.w("GACConnecting", 0Pz.A0T("mRemainingConnections=", lch.A09));
        android.util.Log.e("GACConnecting", 0Pz.A0v("GoogleApiClient connecting is in step ", lch.A08 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ", i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN"), new Exception());
        A02(new ConnectionResult(8, null), lch);
        return false;
    }

    @Override // X.MKv
    public final K4s DBU(K4s k4s) {
        this.A0D.A05.A0F.add(k4s);
        return k4s;
    }

    @Override // X.MKv
    public final K4s DBX(K4s k4s) {
        throw AnonymousClass001.A0N("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [X.MQg, X.2AE] */
    @Override // X.MKv
    public final void DBb() {
        Lcl lcl = this.A0D;
        lcl.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A0u = AnonymousClass001.A0u();
        java.util.Map map = this.A0J;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            AnonymousClass286 anonymousClass286 = (AnonymousClass286) A1B.next();
            AnonymousClass281 anonymousClass281 = anonymousClass286.A01;
            Object obj = lcl.A09.get(anonymousClass281);
            AbstractC00481b7.A02(obj);
            2AE r0 = (2AE) obj;
            boolean A1V = AnonymousClass001.A1V(map.get(anonymousClass286));
            if (r0.ChO()) {
                this.A03 = true;
                if (A1V) {
                    this.A0K.add(anonymousClass281);
                } else {
                    this.A02 = false;
                }
            }
            A0u.put(r0, new Lcn(anonymousClass286, this, A1V));
        }
        if (this.A03) {
            2A9 r02 = this.A0E;
            AbstractC00481b7.A02(r02);
            AnonymousClass283 anonymousClass283 = this.A0I;
            AbstractC00481b7.A02(anonymousClass283);
            K2P k2p = lcl.A05;
            r02.A00 = Integer.valueOf(System.identityHashCode(k2p));
            LcE lcE = new LcE(this);
            this.A01 = anonymousClass283.A01(this.A0B, k2p.A06, lcE, lcE, r02, r02.A01);
        }
        this.A09 = lcl.A09.size();
        this.A0F.add(Kar.A00.submit(new K2c(this, A0u)));
    }

    @Override // X.MKv
    public final void DBe() {
    }

    @Override // X.MKv
    public final void DBh(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    @Override // X.MKv
    public final void DBi(ConnectionResult connectionResult, AnonymousClass286 anonymousClass286, boolean z) {
        if (A07(this, 1)) {
            A01(connectionResult, anonymousClass286, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    @Override // X.MKv
    public final void DBj(int i) {
        A02(new ConnectionResult(8, null), this);
    }

    @Override // X.MKv
    public final boolean DBk() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                arrayList.clear();
                A05(true);
                this.A0D.A00(null);
                return true;
            }
            ((Future) arrayList.get(i2)).cancel(true);
            i = i2 + 1;
        }
    }
}
