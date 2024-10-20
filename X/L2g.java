package X;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.inject.FbInjector;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;

/* loaded from: L2g.class */
public final class L2g {
    public int A00;
    public int A01;
    public long A02;
    public BluetoothAdapter A03;
    public BluetoothLeScanner A04;
    public HZa A05;
    public PzQ A06;
    public C0dp A07;
    public C0dr A08;
    public boolean A09;
    public final L0E A0A;
    public final List A0C = AnonymousClass001.A0s();
    public final List A0B = AbF.A1F();

    public L2g(HZa hZa, L0E l0e, C0dp c0dp, C0dr c0dr) {
        this.A07 = c0dp;
        this.A08 = c0dr;
        this.A05 = hZa;
        this.A0A = l0e;
    }

    public static void A00() {
        Throwable th;
        synchronized (L2g.class) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                new KQc(QpV.A02);
            } else if (!defaultAdapter.isEnabled()) {
                new KQc(QpV.A0A);
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public void A01() {
        synchronized (this) {
            ScanCallback scanCallback = this.A06;
            if (scanCallback != null) {
                try {
                    try {
                        this.A09 = false;
                        this.A04.flushPendingScanResults(scanCallback);
                        BluetoothLeScanner bluetoothLeScanner = this.A04;
                        PzQ pzQ = this.A06;
                        11T.A0F(pzQ, 0);
                        0Hq r0 = 0Hp.A00;
                        int hashCode = pzQ.hashCode();
                        synchronized (r0) {
                            try {
                                SparseArray sparseArray = r0.A00;
                                Boolean bool = (Boolean) sparseArray.get(hashCode);
                                if (bool != null) {
                                    sparseArray.remove(hashCode);
                                    0Hr r302 = bool.booleanValue() ? r0.A02 : r0.A01;
                                    int i = r302.A01 - 1;
                                    r302.A01 = i;
                                    if (i == 0) {
                                        r302.A02 += SystemClock.uptimeMillis() - r302.A03;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        bluetoothLeScanner.stopScan((ScanCallback) pzQ);
                        Object A0R = AnonymousClass001.A0R();
                        try {
                            synchronized (A0R) {
                                AnonymousClass001.A07().post(new S6X(A0R));
                                A0R.wait(200L);
                            }
                        } catch (Exception e) {
                            0fH.A0G(L2g.class, "Exception waiting for main looper", e);
                        }
                        if (0fH.A01.BTv(3)) {
                            List list = this.A0C;
                            synchronized (list) {
                                try {
                                    0fH.A04(L2g.class, Integer.valueOf(this.A01), Long.valueOf(this.A08.now() - this.A02), JQx.A0p(list), "stopScanning: scanMode=%d, duration=%d, scanResults: %d");
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                        L0E l0e = this.A0A;
                        if (l0e != null) {
                            synchronized (l0e) {
                                try {
                                    List list2 = l0e.A01;
                                    ListIterator listIterator = list2.listIterator();
                                    while (listIterator.hasNext()) {
                                        if (((WeakReference) listIterator.next()).get() == this) {
                                            listIterator.remove();
                                        }
                                    }
                                    if (list2.size() == 0) {
                                        0fH.A0j("BleScannerFailsafe", AbstractC00603o4.A00(394));
                                        Context context = FbInjector.A03;
                                        11T.A0A(context);
                                        Context applicationContext = context.getApplicationContext();
                                        11T.A0I(applicationContext, AnonymousClass000.A00(6));
                                        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(l0e.A00);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        0fH.A0H(L2g.class, "Couldn't stop scanning", e2);
                    }
                    this.A06 = null;
                } catch (Throwable th4) {
                    this.A06 = null;
                    throw th4;
                }
            }
        }
    }
}
