package com.facebook.quicksilver.screenshot;

import X.5FE;
import com.facebook.inject.FbInjector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: QuicksilverScreenshotDetector.class */
public final class QuicksilverScreenshotDetector extends 5FE {
    public final Set A00;

    public QuicksilverScreenshotDetector() {
        super(FbInjector.A00());
        this.A00 = Collections.synchronizedSet(new HashSet());
    }

    public final void A06() {
        super.A02();
    }

    public final void A07() {
        super.A03();
    }

    public String BB2() {
        return "QuicksilverScreenshotDetector";
    }
}
