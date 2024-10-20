package com.facebook.common.memory.frameworkoemleakfix.di;

import X.11T;
import X.1Bq;
import X.1Br;
import android.app.Application;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: FrameworkOemLeakFixHelper.class */
public final class FrameworkOemLeakFixHelper {
    public final Application A00;
    public final 1Br A01;

    public FrameworkOemLeakFixHelper() {
        Context A00 = FbInjector.A00();
        11T.A0I(A00, "null cannot be cast to non-null type android.app.Application");
        this.A00 = (Application) A00;
        this.A01 = 1Bq.A00(16385);
    }
}
