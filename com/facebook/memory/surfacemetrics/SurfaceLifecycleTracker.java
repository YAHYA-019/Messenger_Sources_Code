package com.facebook.memory.surfacemetrics;

import X.06Z;
import X.0KB;
import X.0fH;
import X.C5qj;
import X.C5ql;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: SurfaceLifecycleTracker.class */
public final class SurfaceLifecycleTracker extends 0KB implements Application.ActivityLifecycleCallbacks {
    public static final AtomicInteger A06 = new AtomicInteger(1);
    public final Set A05 = new HashSet();
    public final Map A02 = new WeakHashMap();
    public final Map A03 = new WeakHashMap();
    public final Map A04 = new WeakHashMap();
    public final Object A01 = new Object();
    public C5qj A00 = null;

    private void A00(Set set) {
        int i;
        Integer valueOf;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C5qj c5qj = (C5qj) it.next();
                if (c5qj != null) {
                    Set<C5ql> set2 = this.A05;
                    synchronized (set2) {
                        for (C5ql c5ql : set2) {
                            0fH.A07(C5ql.class, c5qj.A02, "Destroyed surface: %s ");
                            HashSet hashSet = c5ql.A02;
                            synchronized (hashSet) {
                                try {
                                    i = c5qj.A00;
                                    valueOf = Integer.valueOf(i);
                                    hashSet.remove(valueOf);
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            QuickPerformanceLogger quickPerformanceLogger = c5ql.A00;
                            quickPerformanceLogger.markerPoint(21379434, i, "destroy_surface");
                            quickPerformanceLogger.markerEnd(21379434, i, (short) 2);
                            HashMap hashMap = c5ql.A01;
                            synchronized (hashMap) {
                                try {
                                    hashMap.remove(valueOf);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                    }
                }
                it.remove();
            }
        }
    }

    public void A0C(Fragment fragment, 06Z r303) {
        Map map = this.A04;
        synchronized (map) {
            Set set = (Set) map.remove(fragment);
            if (set == null) {
                map.remove(fragment);
            } else {
                A00(set);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Map map = this.A02;
        synchronized (map) {
            if (!map.containsKey(activity)) {
                map.put(activity, Collections.newSetFromMap(new WeakHashMap()));
                if (activity instanceof FragmentActivity) {
                    ((FragmentActivity) activity).BDe().A1K(this, true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Map map = this.A03;
        synchronized (map) {
            Set set = (Set) map.remove(activity);
            if (set == null) {
                map.remove(activity);
            } else {
                A00(set);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
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
}
