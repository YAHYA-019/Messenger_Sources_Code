package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.facebook.inject.FbInjector;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4A7, reason: invalid class name */
/* loaded from: 4A7.class */
public final class C4A7 {
    public static final IntentFilter A05 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public Intent A00;
    public final 4AP A02;
    public final Context A04;
    public final Object A03 = new Object();
    public boolean A01 = false;

    public C4A7() {
        Context A00 = FbInjector.A00();
        A00.getClass();
        this.A04 = A00;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        this.A02 = new 4AP(A00, intentFilter, new C4A9() { // from class: X.4A8
            @Override // X.C4A9
            public void CFd(Context context, Intent intent, Collection collection) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((52O) it.next()).CD4(intent);
                }
            }
        });
    }

    public static Intent A00(final C4A7 c4a7) {
        Intent intent;
        synchronized (c4a7) {
            if (c4a7.A01) {
                intent = c4a7.A00;
            } else {
                intent = null;
                try {
                    Intent A00 = AnonymousClass023.A00(new BroadcastReceiver() { // from class: X.4C8
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent2) {
                            List emptyList;
                            int A01 = 0FI.A01(926313603);
                            C4A7 c4a72 = C4A7.this;
                            IntentFilter intentFilter = C4A7.A05;
                            synchronized (c4a72) {
                                c4a72.A00 = intent2;
                            }
                            4AP r0 = c4a72.A02;
                            synchronized (r0) {
                                Looper myLooper = Looper.myLooper();
                                emptyList = myLooper == null ? Collections.emptyList() : r0.A01(myLooper);
                            }
                            Iterator it = emptyList.iterator();
                            while (it.hasNext()) {
                                ((52O) it.next()).Bky();
                            }
                            0FI.A0D(1381924752, A01, intent2);
                        }
                    }, c4a7.A04, A05);
                    c4a7.A00 = A00;
                    c4a7.A01 = true;
                    return A00;
                } catch (IllegalArgumentException unused) {
                    return null;
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    if (message == null || !message.contains("Unable to find app for caller")) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return intent;
        }
    }

    public float A01() {
        Intent A00 = A00(this);
        float f = -1.0f;
        if (A00 != null) {
            int intExtra = A00.getIntExtra("level", -1);
            int intExtra2 = A00.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 >= 0) {
                f = intExtra / intExtra2;
            }
        }
        return f;
    }

    public Integer A02() {
        Intent A00 = A00(this);
        if (A00 != null) {
            int intExtra = A00.getIntExtra("status", 1);
            if (intExtra == 2) {
                int intExtra2 = A00.getIntExtra("plugged", -1);
                if (intExtra2 == 1) {
                    return 0S2.A0Y;
                }
                if (intExtra2 == 2) {
                    return 0S2.A0N;
                }
                if (intExtra2 == 4) {
                    return 0S2.A0j;
                }
            } else {
                if (intExtra == 3) {
                    return 0S2.A01;
                }
                if (intExtra == 4) {
                    return 0S2.A0C;
                }
                if (intExtra == 5) {
                    return 0S2.A0u;
                }
            }
        }
        return 0S2.A00;
    }

    public void A03(52O r302) {
        synchronized (this.A03) {
            this.A02.A02((Handler) null, r302);
        }
    }

    public boolean A04(int i) {
        int intExtra;
        Intent A00 = A00(this);
        boolean z = false;
        if (A00 != null && (intExtra = A00.getIntExtra("status", 1)) != 1 && intExtra != 2 && intExtra != 5) {
            int intExtra2 = A00.getIntExtra("level", -1);
            int intExtra3 = A00.getIntExtra("scale", -1);
            if (intExtra2 >= 0 && intExtra3 >= 0 && (intExtra2 / intExtra3) * 100.0f < i) {
                z = true;
            }
        }
        return z;
    }
}
