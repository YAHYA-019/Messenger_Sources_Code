package com.facebook.tigon.internal;

import X.0Pz;
import X.1Bi;
import X.23D;
import X.AnonymousClass001;
import X.C01s;
import com.facebook.tigon.TigonErrorReporter;

/* loaded from: TigonCrashReporter.class */
public class TigonCrashReporter {
    public final TigonErrorReporter mErrorReporter = new 23D((C01s) 1Bi.A03(16511));

    public void crashReport(String str, Throwable th) {
        this.mErrorReporter.softReport(0Pz.A0W("Tigon: ", th != null ? AnonymousClass001.A0X(th) : str), str, th);
    }
}
