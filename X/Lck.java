package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* loaded from: Lck.class */
public final class Lck implements MKw {
    public Bundle A01;
    public final Context A05;
    public final 2AE A06;
    public final K2P A07;
    public final Lcl A08;
    public final Lcl A09;
    public final java.util.Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final Set A0D = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult A02 = null;
    public ConnectionResult A03 = null;
    public boolean A04 = false;
    public int A00 = 0;

    public Lck(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass283 anonymousClass283, 2AE r306, K2P k2p, 2A9 r308, ArrayList arrayList, ArrayList arrayList2, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, Lock lock) {
        this.A05 = context;
        this.A07 = k2p;
        this.A0B = lock;
        this.A0C = looper;
        this.A06 = r306;
        this.A08 = new Lcl(context, looper, googleApiAvailabilityLight, null, k2p, new Lci(this), null, arrayList2, map2, map4, lock);
        this.A09 = new Lcl(context, looper, googleApiAvailabilityLight, anonymousClass283, k2p, new Lcj(this), r308, arrayList, map, map3, lock);
        0QO r0 = new 0QO(0);
        Iterator A1B = 1BK.A1B(map2);
        while (A1B.hasNext()) {
            r0.put(A1B.next(), this.A08);
        }
        Iterator A1B2 = 1BK.A1B(map);
        while (A1B2.hasNext()) {
            r0.put(A1B2.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(r0);
    }

    private final void A00() {
        Set set = this.A0D;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C3041Jh6) ((MCs) it.next())).A01.release();
        }
        set.clear();
    }

    private final void A01(ConnectionResult connectionResult) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.DBV(connectionResult);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(Lck lck) {
        ConnectionResult connectionResult = lck.A02;
        if (connectionResult != null) {
            int i = connectionResult.A01;
            ConnectionResult connectionResult2 = lck.A03;
            if (i != 0) {
                if (connectionResult2 != null) {
                    if (connectionResult2.A01 == 0) {
                        lck.A09.DBm();
                        connectionResult = lck.A02;
                        AbstractC00481b7.A02(connectionResult);
                    } else {
                        if (lck.A09.A00 < lck.A08.A00) {
                            connectionResult = connectionResult2;
                        }
                    }
                    lck.A01(connectionResult);
                    return;
                }
                return;
            }
            if (connectionResult2 != null) {
                int i2 = connectionResult2.A01;
                if (!AnonymousClass001.A1O(i2) && i2 != 4) {
                    if (lck.A00 == 1) {
                        lck.A00();
                        return;
                    } else {
                        lck.A01(connectionResult2);
                        lck.A08.DBm();
                        return;
                    }
                }
                int i3 = lck.A00;
                if (i3 != 1) {
                    if (i3 != 2) {
                        android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", JQx.A0m());
                        lck.A00 = 0;
                    } else {
                        K2P k2p = lck.A07;
                        AbstractC00481b7.A02(k2p);
                        k2p.DBY(lck.A01);
                    }
                }
                lck.A00();
                lck.A00 = 0;
            }
        }
    }

    @Override // X.MKw
    public final K4s DBd(K4s k4s) {
        Object obj = this.A0A.get(k4s.A00);
        AbstractC00481b7.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        Lcl lcl = this.A09;
        if (obj.equals(lcl)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                2AE r0 = this.A06;
                k4s.A0B(new Status(r0 == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r0.BB1(), Kaz.A00 | 134217728), null, null, 4));
                return k4s;
            }
        } else {
            lcl = this.A08;
        }
        lcl.DBd(k4s);
        return k4s;
    }

    @Override // X.MKw
    public final K4s DBg(K4s k4s) {
        Object obj = this.A0A.get(k4s.A00);
        AbstractC00481b7.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        Lcl lcl = this.A09;
        if (obj.equals(lcl)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                2AE r0 = this.A06;
                k4s.A0B(new Status(r0 == null ? null : PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r0.BB1(), Kaz.A00 | 134217728), null, null, 4));
                return k4s;
            }
        } else {
            lcl = this.A08;
        }
        return lcl.DBg(k4s);
    }

    @Override // X.MKw
    public final void DBl() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.DBl();
        this.A09.DBl();
    }

    @Override // X.MKw
    public final void DBm() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.DBm();
        this.A09.DBm();
        A00();
    }

    @Override // X.MKw
    public final void DBn(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.A09.DBn(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.A08.DBn(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // X.MKw
    public final void DBo() {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1Q = AnonymousClass001.A1Q(this.A00, 2);
            lock.unlock();
            this.A09.DBm();
            this.A03 = new ConnectionResult(4);
            if (A1Q) {
                new C28w(this.A0C).post(new Llu(this));
            } else {
                A00();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r301.A00 == 1) goto L21;
     */
    @Override // X.MKw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean DBp() {
        /*
            r301 = this;
            r0 = r301
            java.util.concurrent.locks.Lock r0 = r0.A0B
            r302 = r0
            r0 = r302
            r0.lock()
            r0 = r301
            X.Lcl r0 = r0.A08     // Catch: java.lang.Throwable -> L68
            r303 = r0
            r0 = r303
            X.MKv r0 = r0.A0E     // Catch: java.lang.Throwable -> L68
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof X.Lcf
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L5f
            r0 = r301
            X.Lcl r0 = r0.A09     // Catch: java.lang.Throwable -> L68
            r303 = r0
            r0 = r303
            X.MKv r0 = r0.A0E     // Catch: java.lang.Throwable -> L68
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof X.Lcf
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5c
            r0 = r301
            com.google.android.gms.common.ConnectionResult r0 = r0.A03     // Catch: java.lang.Throwable -> L68
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L51
            r0 = r303
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L68
            r307 = r0
            r0 = 4
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 != r1) goto L51
            goto L5c
        L51:
            r0 = r301
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L68
            r304 = r0
            r0 = r304
            r1 = r306
            if (r0 != r1) goto L5f
        L5c:
            r0 = 1
            r305 = r0
        L5f:
            r0 = r302
            r0.unlock()
            r0 = r305
            return r0
        L68:
            r303 = move-exception
            r0 = r302
            r0.unlock()
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lck.DBp():boolean");
    }

    @Override // X.MKw
    public final boolean DBq(MCs mCs) {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean A1Q = AnonymousClass001.A1Q(this.A00, 2);
                lock.unlock();
                boolean z = true;
                if (A1Q || DBp()) {
                    Lcl lcl = this.A09;
                    if (!(lcl.A0E instanceof Lcf)) {
                        this.A0D.add(mCs);
                        if (this.A00 == 0) {
                            this.A00 = 1;
                        }
                        this.A03 = null;
                        lcl.DBl();
                        lock.unlock();
                        return z;
                    }
                }
                z = false;
                lock.unlock();
                return z;
            } finally {
                lock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
