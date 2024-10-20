package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzcf;
import java.util.Collections;
import java.util.List;

/* loaded from: K6i.class */
public final class K6i extends K6n {
    public zzce A00;
    public final LFj A01;
    public final L2H A02;
    public final L22 A03;

    public K6i(L9t l9t) {
        super(l9t);
        this.A03 = new L22(l9t.A04);
        this.A01 = new LFj(this);
        this.A02 = new K6o(l9t, this);
    }

    public static final void A00(K6i k6i) {
        k6i.A03.A00 = SystemClock.elapsedRealtime();
        k6i.A02.A01(AnonymousClass001.A05(Kz3.A06.A00));
    }

    public final void A0J() {
        L0g.A00();
        A0I();
        try {
            C2B7.A00().A02(((LCw) this).A00.A00, this.A01);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.A00 != null) {
            this.A00 = null;
            K6c k6c = ((LCw) this).A00.A06;
            L9t.A02(k6c);
            k6c.A0I();
            L0g.A00();
            K6k k6k = k6c.A00;
            L0g.A00();
            k6k.A0I();
            LCw.A0A(k6k, "Service disconnected", 2);
        }
    }

    public final boolean A0K(L2Y l2y) {
        AbstractC00481b7.A02(l2y);
        L0g.A00();
        A0I();
        zzce zzceVar = this.A00;
        if (zzceVar == null) {
            return false;
        }
        String str = (String) (l2y.A05 ? Kz3.A0N : Kz3.A0M).A00;
        List emptyList = Collections.emptyList();
        try {
            java.util.Map map = l2y.A04;
            long j = l2y.A02;
            zzcf zzcfVar = (zzcf) zzceVar;
            int A03 = 0FI.A03(-1871983851);
            int A032 = 0FI.A03(-2115548688);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            0FI.A09(-1648238637, A032);
            obtain.writeMap(map);
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeTypedList(emptyList);
            int A033 = 0FI.A03(2049074816);
            Parcel obtain2 = Parcel.obtain();
            try {
                zzcfVar.A00.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                0FI.A09(687312579, A033);
                0FI.A09(1728345890, A03);
                A00(this);
                return true;
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                0FI.A09(790498842, A033);
                throw th;
            }
        } catch (RemoteException unused) {
            LCw.A0A(this, "Failed to send hits to AnalyticsService", 2);
            return false;
        }
    }
}
