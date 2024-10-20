package com.facebook.codelayouts;

import X.AnonymousClass001;
import X.HdG;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: LayoutCache$ActivityCallbacks.class */
public final class LayoutCache$ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ HdG A00;

    public LayoutCache$ActivityCallbacks(HdG hdG) {
        this.A00 = hdG;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Context context;
        HdG hdG = this.A00;
        synchronized (hdG) {
            Map map = hdG.A00;
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Context context2 = (Context) AnonymousClass001.A0z(A0y).getKey();
                if (context2 != activity) {
                    Context context3 = context2;
                    Context context4 = activity;
                    while (true) {
                        context = context4;
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context4 = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    while (context3 instanceof ContextWrapper) {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                    if (context3 == context) {
                    }
                }
                map.remove(context2);
            }
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
}
