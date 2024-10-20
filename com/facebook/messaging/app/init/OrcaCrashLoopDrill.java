package com.facebook.messaging.app.init;

import X.1BQ;
import X.1Bn;
import X.C00i;
import X.C5H9;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.io.File;

/* loaded from: OrcaCrashLoopDrill.class */
public final class OrcaCrashLoopDrill {
    public File A00;
    public final C00i A01;
    public final C00i A02;
    public final Context A04;
    public final C5H9 A05 = (C5H9) 1Bn.A0A(148053);
    public final C00i A03 = new 1BQ(16385);

    public OrcaCrashLoopDrill() {
        Context A00 = FbInjector.A00();
        this.A04 = A00;
        this.A02 = new 1BQ(99390);
        this.A01 = new 1BQ(16458);
        this.A00 = new File(A00.getApplicationInfo().dataDir, "crash_loop_drill");
    }
}
