package X;

import X.1BK;
import X.1EC;
import X.KSq;
import X.Lgl;
import X.Lky;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.inject.FbInjector;
import com.facebook.maps.mapbox.FbLocationSource$LifecycleCallback;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: Lgl.class */
public final class Lgl implements MJh {
    public 1BY A00;
    public FbLocationSource$LifecycleCallback A01;
    public final C00i A06 = 1BQ.A00();
    public final C00i A04 = 1BQ.A02(131081);
    public final C15h A07 = new LuE(this, 4);
    public final C00i A05 = 1BQ.A02(131080);
    public final C00i A02 = FbInjector.A00;
    public final C00i A03 = 1BQ.A02(16446);
    public java.util.Map mRequests = AnonymousClass001.A0u();

    public Lgl(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.MJh
    public void At5(MJ4 mj4) {
        L5D A01 = LBf.A01((C5ez) this.A04.get(), "FbLocationSource", -508501132);
        if (A01 != null) {
            KzM.A00(mj4, new Location(A01.A00));
        } else {
            mj4.onFailure(AnonymousClass001.A0T("No last location"));
        }
    }

    @Override // X.MJh
    public void Cec(MJ4 mj4) {
        KSq kSq = (KSq) this.mRequests.remove(mj4);
        if (kSq != null) {
            kSq.A02.A09();
        }
        if (this.mRequests.size() != 0 || this.A01 == null) {
            return;
        }
        ((Application) ((Context) this.A02.get()).getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A01);
        this.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.KSq] */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.facebook.maps.mapbox.FbLocationSource$LifecycleCallback] */
    @Override // X.MJh
    public void Cgy(Looper looper, MJ4 mj4, Kzo kzo) {
        KSq kSq;
        C00i c00i = this.A05;
        if (((C02333uu) c00i.get()).A03() != 0S2.A0N) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Location update failed. Status is:");
            mj4.onFailure(AnonymousClass001.A0T(AnonymousClass001.A0a(((C02333uu) c00i.get()).A01(0S2.A0C, false), A0k)));
            return;
        }
        if (this.A01 == null) {
            this.A01 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.maps.mapbox.FbLocationSource$LifecycleCallback
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    Iterator A1A = 1BK.A1A(Lgl.this.mRequests);
                    while (A1A.hasNext()) {
                        ((KSq) A1A.next()).A02.A09();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    Lgl lgl = Lgl.this;
                    ((1EC) lgl.A03.get()).Cjg(new Lky(lgl), TimeUnit.SECONDS, 1L);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }
            };
            ((Application) ((Context) this.A02.get()).getApplicationContext()).registerActivityLifecycleCallbacks(this.A01);
        }
        if (this.mRequests.containsKey(mj4) && (kSq = (KSq) this.mRequests.remove(mj4)) != null) {
            kSq.A02.A09();
        }
        LDH ldh = (LDH) this.A07.get();
        KmL kmL = new KmL(null, 0S2.A0C, null, Long.valueOf(TimeUnit.SECONDS.toMillis(1BK.A0N(this.A06).Auy(36594139269236594L))), 3.0f, 0.6666667f, 0, 1000L, false, false, true, false);
        LWS lws = new LWS(this, mj4);
        LBf.A03(lws, kmL, ldh, "Mapbox", -1098952941);
        ?? obj = new Object();
        ((KSq) obj).A02 = ldh;
        ((KSq) obj).A01 = kmL;
        ((KSq) obj).A00 = lws;
        ((KSq) obj).A03 = "Mapbox";
        this.mRequests.put(mj4, obj);
    }
}
