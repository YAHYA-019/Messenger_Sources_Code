package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: Lcl.class */
public final class Lcl implements MKw, 2A3 {
    public int A00;
    public final Context A02;
    public final GoogleApiAvailabilityLight A03;
    public final AnonymousClass283 A04;
    public final K2P A05;
    public final K5m A06;
    public final MJe A07;
    public final 2A9 A08;
    public final java.util.Map A09;
    public final java.util.Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile MKv A0E;
    public final java.util.Map A0A = AnonymousClass001.A0u();
    public ConnectionResult A01 = null;

    public Lcl(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass283 anonymousClass283, K2P k2p, MJe mJe, 2A9 r308, ArrayList arrayList, java.util.Map map, java.util.Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = googleApiAvailabilityLight;
        this.A09 = map;
        this.A08 = r308;
        this.A0B = map2;
        this.A04 = anonymousClass283;
        this.A05 = k2p;
        this.A07 = mJe;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A06 = new K5m(looper, this);
                this.A0C = lock.newCondition();
                this.A0E = new Lcg(this);
                return;
            }
            ((LcF) arrayList.get(i2)).A00 = this;
            i = i2 + 1;
        }
    }

    public final void A00(ConnectionResult connectionResult) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = connectionResult;
            this.A0E = new Lcg(this);
            this.A0E.DBb();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Bqg(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.DBh(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void Bqv(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.DBj(i);
        } finally {
            lock.unlock();
        }
    }

    public final void DBW(ConnectionResult connectionResult, AnonymousClass286 anonymousClass286, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.DBi(connectionResult, anonymousClass286, z);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.MKw
    public final K4s DBd(K4s k4s) {
        k4s.A07();
        this.A0E.DBU(k4s);
        return k4s;
    }

    @Override // X.MKw
    public final K4s DBg(K4s k4s) {
        k4s.A07();
        return this.A0E.DBX(k4s);
    }

    @Override // X.MKw
    public final void DBl() {
        this.A0E.DBe();
    }

    @Override // X.MKw
    public final void DBm() {
        this.A0E.DBk();
        this.A0A.clear();
    }

    @Override // X.MKw
    public final void DBn(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        printWriter.append((CharSequence) str).append("mState=").println(this.A0E);
        Iterator A1B = 1BK.A1B(this.A0B);
        while (A1B.hasNext()) {
            String valueOf = String.valueOf(str);
            AnonymousClass286 anonymousClass286 = (AnonymousClass286) A1B.next();
            printWriter.append((CharSequence) str).append((CharSequence) anonymousClass286.A02).println(":");
            Object obj = this.A09.get(anonymousClass286.A01);
            AbstractC00481b7.A02(obj);
            2AD r0 = (2AE) obj;
            String concat = valueOf.concat("  ");
            2AD r02 = r0;
            synchronized (r02.A0J) {
                i = r02.A02;
                iInterface = r02.A06;
            }
            synchronized (r02.A0K) {
                iGmsServiceBroker = r02.A09;
            }
            printWriter.append((CharSequence) concat).append("mConnectState=");
            printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
            printWriter.append(" mService=");
            if (iInterface == null) {
                printWriter.append("null");
            } else {
                printWriter.append((CharSequence) r02.A05()).append("@").append((CharSequence) 1BK.A12(iInterface.asBinder()));
            }
            printWriter.append(" mServiceBroker=");
            if (iGmsServiceBroker == null) {
                printWriter.println("null");
            } else {
                printWriter.append("IGmsServiceBroker@").println(1BK.A12(iGmsServiceBroker.asBinder()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(1BJ.A00(61), Locale.US);
            if (r02.A04 > 0) {
                PrintWriter append = printWriter.append((CharSequence) concat).append("lastConnectedTime=");
                long j = r02.A04;
                String A1E = AbI.A1E(simpleDateFormat, j);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(j);
                append.println(1BL.A0u(" ", A1E, A0k));
            }
            if (r02.A03 > 0) {
                printWriter.append((CharSequence) concat).append("lastSuspendedCause=");
                int i2 = r02.A00;
                printWriter.append((CharSequence) (i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
                PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                long j2 = r02.A03;
                String A1E2 = AbI.A1E(simpleDateFormat, j2);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                A0k2.append(j2);
                append2.println(1BL.A0u(" ", A1E2, A0k2));
            }
            if (r02.A05 > 0) {
                printWriter.append((CharSequence) concat).append("lastFailedStatus=").append((CharSequence) 4SW.A00(r02.A01));
                PrintWriter append3 = printWriter.append(" lastFailedTime=");
                long j3 = r02.A05;
                String A1E3 = AbI.A1E(simpleDateFormat, j3);
                StringBuilder A0k3 = AnonymousClass001.A0k();
                A0k3.append(j3);
                append3.println(1BL.A0u(" ", A1E3, A0k3));
            }
        }
    }

    @Override // X.MKw
    public final void DBo() {
    }

    @Override // X.MKw
    public final boolean DBp() {
        return this.A0E instanceof Lcf;
    }

    @Override // X.MKw
    public final boolean DBq(MCs mCs) {
        return false;
    }
}
