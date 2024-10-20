package androidx.lifecycle;

import X.0Uv;
import X.0Ux;
import X.11T;
import X.AnonymousClass001;
import X.C0ty;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.List;

/* loaded from: ProcessLifecycleInitializer.class */
public final class ProcessLifecycleInitializer implements 0Ux {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object create(Context context) {
        11T.A0F(context, 0);
        0Uv A00 = 0Uv.A00(context);
        11T.A0A(A00);
        if (!A00.A02.contains(getClass())) {
            throw AnonymousClass001.A0N("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!LifecycleDispatcher.initialized.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            11T.A0I(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new Object());
        }
        final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.newInstance;
        processLifecycleOwner.handler = new Handler();
        processLifecycleOwner.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        11T.A0I(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                11T.A0F(activity, 0);
                if (Build.VERSION.SDK_INT < 29) {
                    Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                    11T.A0I(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
                    ReportFragment reportFragment = (ReportFragment) findFragmentByTag;
                    ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                    ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
                    reportFragment.processListener = processLifecycleOwner2.initializationListener;
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i = processLifecycleOwner2.resumedCounter - 1;
                processLifecycleOwner2.resumedCounter = i;
                if (i == 0) {
                    Handler handler = processLifecycleOwner2.handler;
                    11T.A0D(handler);
                    handler.postDelayed(processLifecycleOwner2.delayedPauseRunnable, 700L);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                11T.A0F(activity, 0);
                final ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        ProcessLifecycleOwner processLifecycleOwner3 = ProcessLifecycleOwner.this;
                        int i = processLifecycleOwner3.startedCounter + 1;
                        processLifecycleOwner3.startedCounter = i;
                        if (i == 1 && processLifecycleOwner3.stopSent) {
                            processLifecycleOwner3.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
                            processLifecycleOwner3.stopSent = false;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
                int i = processLifecycleOwner2.startedCounter - 1;
                processLifecycleOwner2.startedCounter = i;
                if (i == 0 && processLifecycleOwner2.pauseSent) {
                    processLifecycleOwner2.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner2.stopSent = true;
                }
            }
        });
        return processLifecycleOwner;
    }

    public List dependencies() {
        return C0ty.A00;
    }
}
