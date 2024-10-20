package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: L8D.class */
public final class L8D {
    public static final java.util.Map A0D = AnonymousClass001.A0u();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final Kov A06;
    public final Kxh A0C;
    public final List A09 = AnonymousClass001.A0s();
    public final Set A0A = AnonymousClass001.A0v();
    public final Object A07 = AnonymousClass001.A0R();
    public final IBinder.DeathRecipient A05 = new LGA(this);
    public final AtomicInteger A0B = DKD.A14();
    public final WeakReference A08 = DKD.A11();

    public L8D(Context context, Intent intent, Kov kov, Kxh kxh) {
        this.A03 = context;
        this.A06 = kov;
        this.A04 = intent;
        this.A0C = kxh;
    }

    public static final void A00(L8D l8d) {
        synchronized (l8d.A07) {
            Set set = l8d.A0A;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((4FE) it.next()).A02(JQy.A0S("com.google.android.finsky.inappreviewservice.InAppReviewService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        java.util.Map map = A0D;
        synchronized (map) {
            JQz.A1O("com.google.android.finsky.inappreviewservice.InAppReviewService", map);
            handler = (Handler) map.get("com.google.android.finsky.inappreviewservice.InAppReviewService");
        }
        return handler;
    }
}
