package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2ul, reason: invalid class name */
/* loaded from: 2ul.class */
public final class C2ul {
    public static C2ul A08;
    public C2ur A00;
    public final Context A01;
    public final IntentFilter A02;
    public final C2uh A03;
    public final Set A04;
    public final Handler A05;
    public final C2un A06;
    public final Set A07;

    public C2ul(Context context, C2un c2un) {
        C2uh c2uh = new C2uh("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.A04 = new HashSet();
        this.A00 = null;
        this.A03 = c2uh;
        this.A02 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A07 = new LinkedHashSet();
        this.A06 = c2un;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.2ur, android.content.BroadcastReceiver] */
    public final void A00(C2uf c2uf) {
        synchronized (this) {
            this.A03.A03("registerListener", new Object[0]);
            Set set = this.A04;
            set.add(c2uf);
            if (!set.isEmpty() && this.A00 == null) {
                ?? r0 = new BroadcastReceiver() { // from class: X.2ur
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        int A01 = 0FI.A01(-603892414);
                        C2ul c2ul = C2ul.this;
                        Bundle bundleExtra = intent.getBundleExtra("session_state");
                        if (bundleExtra != null) {
                            K8r A00 = 3NT.A00(bundleExtra);
                            c2ul.A03.A01("ListenerRegistryBroadcastReceiver.onReceive: %s", A00);
                            c2ul.A01(A00);
                        }
                        0FI.A0D(1890028192, A01, intent);
                    }
                };
                this.A00 = r0;
                int i = Build.VERSION.SDK_INT;
                Context context = this.A01;
                IntentFilter intentFilter = this.A02;
                if (i >= 33) {
                    context.registerReceiver(r0, intentFilter, 2);
                } else {
                    context.registerReceiver(r0, intentFilter);
                }
            }
            if (set.isEmpty()) {
                C2ur c2ur = this.A00;
                if (c2ur != null) {
                    this.A01.unregisterReceiver(c2ur);
                    this.A00 = null;
                }
            }
        }
    }

    public final void A01(3NT r302) {
        synchronized (this) {
            Iterator it = new LinkedHashSet(this.A07).iterator();
            while (it.hasNext()) {
                ((C2ue) it.next()).CNC(r302);
            }
            Iterator it2 = new HashSet(this.A04).iterator();
            while (it2.hasNext()) {
                ((C2uf) it2.next()).CNC(r302);
            }
        }
    }
}
