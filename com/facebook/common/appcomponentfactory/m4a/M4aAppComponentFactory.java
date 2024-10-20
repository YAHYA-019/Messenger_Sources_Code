package com.facebook.common.appcomponentfactory.m4a;

import X.0FR;
import X.0FS;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0Xp;
import X.0Xq;
import X.0ZA;
import X.0Zi;
import X.0eC;
import X.0eE;
import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.C0dj;
import X.C0f3;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.facebook.base.receiver.AppInitReplayBroadcastReceiver;

/* loaded from: M4aAppComponentFactory.class */
public final class M4aAppComponentFactory extends AppComponentFactory {
    public static final 0ZA Companion = new Object();
    public static final String REPLAY_BROADCAST_RECEIVER = "com.facebook.base.receiver.AppInitReplayBroadcastReceiver";
    public static Application messengerApp;
    public final String tag = "AppComponentFactory";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0ZA] */
    static {
        C0dj.A00 = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // android.app.AppComponentFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r302, java.lang.String r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.appcomponentfactory.m4a.M4aAppComponentFactory.instantiateActivity(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.app.Activity");
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        11T.A0H(classLoader, str);
        C0f3.A00(str, false);
        0fH.A0n(this.tag, "Instantiating Application");
        Application instantiateApplication = super.instantiateApplication(classLoader, str);
        11T.A0A(instantiateApplication);
        messengerApp = instantiateApplication;
        return instantiateApplication;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        11T.A0F(classLoader, 0);
        11T.A0F(str, 1);
        C0f3.A00(str, false);
        0fH.A0n(this.tag, "Instantiating ContentProvider");
        ContentProvider instantiateProvider = super.instantiateProvider(classLoader, str);
        11T.A0A(instantiateProvider);
        return instantiateProvider;
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        StringBuilder A0n;
        11T.A0H(classLoader, str);
        ConditionVariable conditionVariable = 0eE.A00;
        long j = -1;
        C0f3.A00(conditionVariable.block(j) ? str : "AppInitReplayBroadcastReceiver", false);
        0FR.A01(intent);
        0FS.A00.Bch("intentFlags", 0FR.A00(intent, 0FR.A03));
        0FR.A02(intent, 0S2.A0C, str);
        if (!conditionVariable.block(j)) {
            Application application = messengerApp;
            if (application == null) {
                11T.A0L("messengerApp");
                throw 0Q8.createAndThrow();
            }
            if (0Zi.A01(application).A8V) {
                AppInitReplayBroadcastReceiver.A01.push(str);
                str = REPLAY_BROADCAST_RECEIVER;
            } else {
                if (conditionVariable.block(j)) {
                    A0n = AnonymousClass001.A0k();
                    A0n.append("Not blocking BroadcastReceiver (");
                } else {
                    0Pz.A1F(conditionVariable, "Blocking BroadcastReceiver (");
                    0Xq.A00("ReceiverWaitForInit");
                    try {
                        conditionVariable.block();
                        0Xp.A00();
                        A0n = AnonymousClass001.A0n("Unblocked BroadcastReceiver (");
                    } catch (Throwable th) {
                        0Xp.A00();
                        0Pz.A1F(conditionVariable, "Unblocked BroadcastReceiver (");
                        throw th;
                    }
                }
                A0n.append(conditionVariable.hashCode());
                0fH.A0n("InitStatus", AnonymousClass001.A0g(A0n, ')'));
            }
        }
        0fH.A0n(this.tag, "Instantiating BroadcastReceiver");
        BroadcastReceiver instantiateReceiver = super.instantiateReceiver(classLoader, str, intent);
        11T.A0A(instantiateReceiver);
        return instantiateReceiver;
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        11T.A0H(classLoader, str);
        C0f3.A00(str, false);
        if (!0eC.A00.block(-1)) {
            0eC.A00();
        }
        0FR.A01(intent);
        0FR.A02(intent, 0S2.A01, str);
        0fH.A0n(this.tag, "Instantiating Service");
        Service instantiateService = super.instantiateService(classLoader, str, intent);
        11T.A0A(instantiateService);
        return instantiateService;
    }
}
