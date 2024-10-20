package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0cm;
import android.util.Log;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.HashMap;

/* loaded from: ClassFailureStapler.class */
public final class ClassFailureStapler extends DalvikInternals.ClassInitFailureHook {
    public static final String TAG = "ClassFailureStapler";
    public final HashMap mSeenFailures = AnonymousClass001.A0u();

    public static void install() {
        DalvikInternals.setClassInitFailureHook(new ClassFailureStapler());
    }

    public static void tryInstall() {
        if (C0cm.A00) {
            Log.d(TAG, "not installing class failure stapler: ART in use");
            return;
        }
        try {
            install();
            Log.i(TAG, "installed class failure stapler");
        } catch (Throwable th) {
            Log.w(TAG, "failed to install class failure stapler; proceeding", th);
        }
    }

    @Override // com.facebook.common.dextricks.DalvikInternals.ClassInitFailureHook
    public void onClassInitFailure(Class cls, Throwable th) {
        synchronized (this) {
            if (th instanceof NoClassDefFoundError) {
                Throwable th2 = (Throwable) this.mSeenFailures.get(cls);
                if (th2 != null) {
                    th.initCause(th2);
                }
            } else {
                this.mSeenFailures.put(cls, th);
            }
        }
    }
}
