package com.facebook.messaging.screenshotdetection;

import X.5FE;
import X.C04w;
import com.facebook.inject.FbInjector;
import java.util.Collections;
import java.util.Set;

/* loaded from: ThreadScreenshotDetector.class */
public final class ThreadScreenshotDetector extends 5FE {
    public final Set A00;

    public ThreadScreenshotDetector() {
        super(FbInjector.A00());
        this.A00 = Collections.synchronizedSet(new C04w());
    }

    public void A06() {
        super.A02();
    }

    public void A07() {
        super.A03();
    }

    public String BB2() {
        return "ThreadScreenshotDetector";
    }
}
