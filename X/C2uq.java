package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2uq, reason: invalid class name */
/* loaded from: 2uq.class */
public final class C2uq implements 2uI {
    public final C2ul A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C2ug A02;
    public final C2up A03;
    public final C2uo A04;

    public C2uq(C2ug c2ug, C2up c2up, C2uo c2uo, C2ul c2ul) {
        this.A02 = c2ug;
        this.A00 = c2ul;
        this.A04 = c2uo;
        this.A03 = c2up;
    }

    public final C4Ez AEB(int i) {
        C2ug c2ug = this.A02;
        C2uj c2uj = c2ug.A00;
        if (c2uj == null) {
            return C2ug.A00();
        }
        C2ug.A02.A03("cancelInstall(%d)", AnonymousClass001.A1a(i));
        4FE r0 = new 4FE();
        c2uj.A03(r0, new K8u(r0, r0, c2ug, i));
        return r0.A00;
    }

    public final C4Ez AMW(List list) {
        C2ug c2ug = this.A02;
        C2uj c2uj = c2ug.A00;
        if (c2uj == null) {
            return C2ug.A00();
        }
        C2ug.A02.A03("deferredInstall(%s)", list);
        4FE r0 = new 4FE();
        c2uj.A03(r0, new C51s(r0, r0, c2ug, list));
        return r0.A00;
    }

    public final C4Ez AMX(List list) {
        C2up c2up = this.A03;
        synchronized (C2up.class) {
            HashSet hashSet = new HashSet(c2up.A00());
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= hashSet.add(AnonymousClass001.A0i(it));
            }
            if (z) {
                try {
                    c2up.A00.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
        C2ug c2ug = this.A02;
        C2uj c2uj = c2ug.A00;
        if (c2uj == null) {
            return C2ug.A00();
        }
        C2ug.A02.A03("deferredUninstall(%s)", list);
        4FE r0 = new 4FE();
        c2uj.A03(r0, new K8t(r0, r0, c2ug, list));
        return r0.A00;
    }

    public final Set ArQ() {
        return this.A04.A03();
    }

    public final C4Ez BAF() {
        C2ug c2ug = this.A02;
        C2uj c2uj = c2ug.A00;
        if (c2uj == null) {
            return C2ug.A00();
        }
        C2ug.A02.A03("getSessionStates", new Object[0]);
        4FE r0 = new 4FE();
        c2uj.A03(r0, new C51k(r0, r0, c2ug));
        return r0.A00;
    }

    public final void CcP(C2ue c2ue) {
        synchronized (this) {
            this.A00.A00(c2ue);
        }
    }

    public final boolean D1V(Activity activity, 3NT r303, int i) {
        PendingIntent pendingIntent;
        K8r k8r = (K8r) r303;
        if (k8r.A01 != 8 || (pendingIntent = k8r.A05) == null) {
            return false;
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 100, null, 0, 0, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0175, code lost:
    
        if (r0.containsAll(r0) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C4Ez D1m(X.KpZ r302) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2uq.D1m(X.KpZ):X.4Ez");
    }
}
