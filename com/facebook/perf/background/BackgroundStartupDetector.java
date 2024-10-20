package com.facebook.perf.background;

import X.0C4;
import X.0fH;
import X.0lP;
import X.0lQ;
import X.11T;
import X.AnonymousClass001;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: BackgroundStartupDetector.class */
public final class BackgroundStartupDetector extends Handler implements Application.ActivityLifecycleCallbacks {
    public static volatile boolean A08 = true;
    public static 0C4 A09;
    public static 0lQ A0A;
    public static String A0B;
    public static volatile int A0F;
    public static volatile int A0G;
    public static volatile BackgroundStartupDetector A0H;
    public static volatile Boolean A0I;
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public static final 0lP A0D = new Object();
    public static final CopyOnWriteArraySet A0E = new CopyOnWriteArraySet();
    public static ArrayList A0C = AnonymousClass001.A0s();

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        BackgroundStartupDetector backgroundStartupDetector;
        int i;
        11T.A0F(message, 0);
        switch (message.what) {
            case 49181:
                if (!this.A06) {
                    this.A06 = true;
                    this.A00 = 0;
                }
                if (!this.A05) {
                    0fH.A0j(A0B, "ColdStartQueue drained. No activity created.");
                    0lP r0 = A0D;
                    int i2 = 1;
                    if (this.A07) {
                        i2 = 2;
                    }
                    r0.A01(i2);
                    0lP.A00(true);
                    return;
                }
                int i3 = this.A01;
                String str = A0B;
                if (i3 <= 0) {
                    0fH.A0j(str, "ColdStartQueue drained. Activity created but not resumed. Maybe it redirected? Waiting for next activity or ColdStartQueue drain...");
                    this.A05 = false;
                    this.A07 = true;
                    backgroundStartupDetector = A0H;
                    i = 49181;
                    break;
                } else {
                    0fH.A0j(str, "ColdStartQueue drained. Activity created & resumed.");
                    0lP r02 = A0D;
                    int i4 = 3;
                    if (this.A07) {
                        i4 = 4;
                    }
                    r02.A01(i4);
                    return;
                }
            case 49182:
                if (!this.A04) {
                    this.A04 = true;
                    0fH.A0j(A0B, "ActivityCreateQueue drained. Activity not started. Maybe it redirected? Waiting for next activity or ActivityCreateQueue drain...");
                    backgroundStartupDetector = A0H;
                    i = 49182;
                    break;
                } else {
                    if (this.A02 == 0 && this.A01 == 0 && !this.A03) {
                        0fH.A0n(A0B, "ActivityCreateQueue drained. Activity likely self-finished or redirected to another process.");
                        0lP.A00(true);
                        A0G++;
                        0fH.A0g(Integer.valueOf(A0G), A0B, "backgroundedCount=%d");
                        return;
                    }
                    return;
                }
            default:
                return;
        }
        sendMessageDelayed(Message.obtain(backgroundStartupDetector, i), 200L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        11T.A0F(activity, 0);
        String A0X = AnonymousClass001.A0X(activity);
        11T.A0A(A0X);
        0fH.A0d(A0X, Boolean.valueOf(this.A05), A0B, "Activity#onCreate %s; mAnyActivityCreated=%b");
        this.A03 = false;
        if (!this.A05) {
            this.A05 = true;
            if (!this.A06) {
                A0D.A01(4);
            }
        }
        if (this.A02 == 0) {
            0lP.A00(false);
            this.A04 = false;
            0fH.A0j(A0B, "Waiting for onStart or ActivityCreateQueue Drain...");
            removeMessages(49182);
            sendEmptyMessage(49182);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        11T.A0F(activity, 0);
        0fH.A0a(AnonymousClass001.A0X(activity), Integer.valueOf(this.A02), Integer.valueOf(this.A01 - 1), A0B, "Activity#onPause %s; mActivityStartCount=%d, mActivityResumeCount=%d");
        this.A01--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        11T.A0F(activity, 0);
        0fH.A0a(AnonymousClass001.A0X(activity), Integer.valueOf(this.A02), Integer.valueOf(this.A01 + 1), A0B, "Activity#onResume %s; mActivityStartCount=%d, mActivityResumeCount=%d");
        this.A01++;
        A08 = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        11T.A0F(activity, 0);
        0fH.A0a(AnonymousClass001.A0X(activity), Integer.valueOf(this.A02 + 1), Integer.valueOf(this.A01), A0B, "Activity#onStart %s; mActivityStartCount=%d, mActivityResumeCount=%d");
        this.A02++;
        this.A00++;
        0lP.A00(false);
        removeMessages(49182);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        11T.A0F(activity, 0);
        0fH.A0Y(AnonymousClass001.A0X(activity), Integer.valueOf(this.A02 - 1), Integer.valueOf(this.A01), Boolean.valueOf(this.A03), A0B, "Activity#onStop %s; mActivityStartCount=%d, mActivityResumeCount=%d, mActivityIsRecreating=%b");
        int i = this.A02 - 1;
        this.A02 = i;
        if (i == 0 && this.A01 == 0 && !this.A03) {
            A0G++;
            A08 = true;
            0fH.A0j(A0B, "Last activity stopped.");
            0fH.A0g(Integer.valueOf(A0G), A0B, "backgroundedCount=%d");
            0lP.A00(true);
        }
    }
}
