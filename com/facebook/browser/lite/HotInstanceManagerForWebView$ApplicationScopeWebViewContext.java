package com.facebook.browser.lite;

import X.0fH;
import X.7zL;
import X.Kyp;
import X.LAK;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: HotInstanceManagerForWebView$ApplicationScopeWebViewContext.class */
public class HotInstanceManagerForWebView$ApplicationScopeWebViewContext extends ContextWrapper {
    public WeakReference mActivityWeakRef;
    public final Context mApplicationContext;

    public HotInstanceManagerForWebView$ApplicationScopeWebViewContext(Context context, Activity activity) {
        super(context);
        this.mActivityWeakRef = 7zL.A14(activity);
        this.mApplicationContext = context;
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        Context context = (Context) this.mActivityWeakRef.get();
        if (context == null) {
            context = this.mApplicationContext;
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        Context context = (Context) this.mActivityWeakRef.get();
        if (context == null) {
            context = this.mApplicationContext;
        }
        return context.getSystemService(str);
    }

    public void setActivityContext(Activity activity) {
        this.mActivityWeakRef = 7zL.A14(activity);
    }

    public void startActivityForResult(String str, Intent intent, int i, Bundle bundle) {
        Object obj = this.mActivityWeakRef.get();
        if (obj == null) {
            0fH.A0o("HotInstanceManagerForWebView", "startActivityForResult called when activity is null");
            return;
        }
        LAK lak = Kyp.A04;
        try {
            obj.getClass().getMethod("startActivityForResult", String.class, Intent.class, Integer.TYPE, Bundle.class).invoke(obj, str, intent, Integer.valueOf(i), bundle);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            0fH.A0w("HotInstanceManagerForWebView", "Error while opening activity.startActivityForResult:", e);
        }
    }
}
