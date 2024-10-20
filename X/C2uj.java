package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.acra.constants.ActionId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2uj, reason: invalid class name */
/* loaded from: 2uj.class */
public final class C2uj {
    public static final java.util.Map A0D = new HashMap();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final C2uh A06;
    public final C2ui A0C;
    public final List A09 = new ArrayList();
    public final Set A0A = new HashSet();
    public final Object A07 = new Object();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.2uk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2uj c2uj = C2uj.this;
            C2uh c2uh = c2uj.A06;
            c2uh.A03(JQw.A00(337), new Object[0]);
            c2uj.A08.get();
            c2uh.A03(JQw.A00(ActionId.CONTROLLER_INITIATED), "SplitInstallService");
            List<C51l> list = c2uj.A09;
            for (C51l c51l : list) {
                RemoteException remoteException = new RemoteException(String.valueOf("SplitInstallService").concat(" : Binder has died."));
                4FE r0 = c51l.A00;
                if (r0 != null) {
                    r0.A02(remoteException);
                }
            }
            list.clear();
            synchronized (c2uj.A07) {
                C2uj.A00(c2uj);
            }
        }
    };
    public final AtomicInteger A0B = new AtomicInteger(0);
    public final WeakReference A08 = new WeakReference(null);

    public C2uj(Context context, Intent intent, C2uh c2uh, C2ui c2ui) {
        this.A03 = context;
        this.A06 = c2uh;
        this.A04 = intent;
        this.A0C = c2ui;
    }

    public static final void A00(C2uj c2uj) {
        Set set = c2uj.A0A;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((4FE) it.next()).A02(new RemoteException(String.valueOf("SplitInstallService").concat(" : Binder has died.")));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        java.util.Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("SplitInstallService")) {
                HandlerThread handlerThread = new HandlerThread("SplitInstallService", 10);
                handlerThread.start();
                map.put("SplitInstallService", new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get("SplitInstallService");
        }
        return handler;
    }

    public final void A02(4FE r302) {
        synchronized (this.A07) {
            this.A0A.remove(r302);
        }
        A01().post(new C51t(this));
    }

    public final void A03(4FE r302, C51l c51l) {
        A01().post(new C51m(c51l.A00, r302, this, c51l));
    }
}
