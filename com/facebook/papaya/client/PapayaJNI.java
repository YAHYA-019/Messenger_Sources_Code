package com.facebook.papaya.client;

import X.11T;
import X.5hH;
import X.7zL;
import X.7zP;
import X.7zT;
import X.AnonymousClass001;
import X.C0il;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;

/* loaded from: PapayaJNI.class */
public final class PapayaJNI extends HybridClassBase {
    public static final PapayaJNI INSTANCE = new HybridClassBase();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.jni.HybridClassBase, com.facebook.papaya.client.PapayaJNI] */
    static {
        C0il.A0B("papaya");
    }

    public static final void addLogSink(String str, 5hH r302, LogSink logSink) {
        7zT.A1S(str, r302, logSink);
        nativeAddLogSink(str, r302.value, logSink);
    }

    public static final void cancelAllExecutors() {
        nativeCancelAllExecutors();
    }

    public static final void cancelExecutor(String str, String str2) {
        11T.A0H(str, str2);
        nativeCancelExecutor(str, str2);
    }

    public static final void initialize(String str, ImmutableSet immutableSet, Context context, ComponentName componentName, String str2, String str3, ImmutableMap immutableMap) {
        synchronized (PapayaJNI.class) {
            7zT.A1S(str, immutableSet, context);
            7zP.A1L(componentName, 3, immutableMap);
            Context applicationContext = context.getApplicationContext();
            11T.A0A(applicationContext);
            nativeInitialize(str, immutableSet, applicationContext, componentName, str2, str3, immutableMap);
        }
    }

    public static final native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static final native void nativeCancelAllExecutors();

    public static final native void nativeCancelExecutor(String str, String str2);

    public static final native void nativeInitialize(String str, Set set, Context context, ComponentName componentName, String str2, String str3, Map map);

    public static final native void nativeRegisterEngine(String str, IEngineFactory iEngineFactory);

    public static final native void nativeReset();

    public static final native void nativeResetScheduler();

    public static final native void nativeRun(Map map);

    public static final native void nativeSetCallback(ICallback iCallback);

    public static final native void nativeStop();

    public static final native void nativeSubmitExecutor(String str, String str2);

    public static final native void nativeUninitialize();

    public static final void registerEngine(String str, IEngineFactory iEngineFactory) {
        11T.A0H(str, iEngineFactory);
        nativeRegisterEngine(str, iEngineFactory);
    }

    public static final void reset() {
        nativeReset();
    }

    public static final void resetScheduler() {
        nativeResetScheduler();
    }

    public static final void run(PapayaRestrictions papayaRestrictions) {
        11T.A0F(papayaRestrictions, 0);
        if (!7zL.A1X(Looper.myLooper(), Looper.getMainLooper())) {
            throw AnonymousClass001.A0N("Papaya.run() may only be invoked from background thread!");
        }
        nativeRun(papayaRestrictions.A00());
    }

    public static final void setCallback(ICallback iCallback) {
        11T.A0F(iCallback, 0);
        nativeSetCallback(iCallback);
    }

    public static final void stop() {
        if (!7zL.A1X(Looper.myLooper(), Looper.getMainLooper())) {
            throw AnonymousClass001.A0N("Papaya.stop() may only be invoked from background thread!");
        }
        nativeStop();
    }

    public static final void submitExecutor(String str, String str2) {
        11T.A0H(str, str2);
        nativeSubmitExecutor(str, str2);
    }

    public static final void uninitialize() {
        nativeUninitialize();
    }
}
