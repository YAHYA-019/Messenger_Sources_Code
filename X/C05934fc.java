package X;

import X.5Ct;
import X.C05934fc;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.facebook.jni.HybridData;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.4fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fc.class */
public final class C05934fc extends AnonymousClass013 {
    public final long A00;
    public final Handler A01;
    public final 0KB A02;
    public final C05914fa A03;
    public final boolean A04;
    public final boolean A05;

    public C05934fc(C05914fa c05914fa, AnonymousClass010 anonymousClass010) {
        super(anonymousClass010);
        this.A02 = new DS2(this, 1);
        this.A03 = c05914fa;
        1Dn A05 = A05(1Dn.class);
        boolean z = true;
        this.A05 = AbstractC06024fl.A00 && A05 != null && (EndToEnd.A04() || ((2yD) A05.A02.get()).AZk(36317642165005912L));
        if (A05 == null || (!EndToEnd.A04() && !((2yD) A05.A02.get()).AZk(36317642165071449L))) {
            z = false;
        }
        this.A04 = z;
        this.A00 = A05 != null ? ((2yD) A05.A02.get()).Auy(36599117141840365L) : 60000L;
        this.A01 = anonymousClass010.AYc();
    }

    @Override // X.AnonymousClass014
    public String getName() {
        return "ObjectCountDebugger";
    }

    @Override // X.AnonymousClass014
    public void init() {
        if (this.A05) {
            ActivityThread.currentActivityThread().getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.fixie.fixes.memory.leak.ObjectCountDebugger$2
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    5Ct.A04.A00(activity.getClass());
                    if (activity instanceof FragmentActivity) {
                        ((FragmentActivity) activity).BDe().A1K(C05934fc.this.A02, true);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    if (activity instanceof FragmentActivity) {
                        ((FragmentActivity) activity).BDe().A1J(C05934fc.this.A02);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
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
            });
            Activity A00 = 07R.A00();
            if (A00 != null) {
                5Ct.A04.A00(A00.getClass());
                if (A00 instanceof FragmentActivity) {
                    ((FragmentActivity) A00).BDe().A1K(this.A02, true);
                }
            }
            if (this.A04 && this.A03 != null) {
                this.A01.postDelayed(new Runnable() { // from class: X.4l3
                    public static final String __redex_internal_original_name = "ObjectCountDebugger$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (C05934fc.this.A03 != null) {
                            5Ct r0 = 5Ct.A04;
                            Class[] clsArr = {1Iw.class, ComponentTree.class, C23N.class, LithoView.class, 2iK.class, C3s4.class, AbstractC08294mh.class, C5op.class, 5To.class, 5Tt.class, HybridData.class};
                            synchronized (r0) {
                                int i = 0;
                                do {
                                    Class cls = clsArr[i];
                                    if (cls != null && r0.A00 < 133 && r0.A01.add(cls)) {
                                        Class[] clsArr2 = r0.A02;
                                        int i2 = r0.A00;
                                        r0.A00 = i2 + 1;
                                        clsArr2[i2] = cls;
                                    }
                                    i++;
                                } while (i < 11);
                            }
                        }
                    }
                }, this.A00);
            }
            A07();
        }
    }
}
