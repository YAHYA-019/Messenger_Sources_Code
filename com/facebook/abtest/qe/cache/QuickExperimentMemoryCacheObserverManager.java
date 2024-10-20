package com.facebook.abtest.qe.cache;

import X.1pU;
import X.C15h;
import X.DBP;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Map;

/* loaded from: QuickExperimentMemoryCacheObserverManager.class */
public final class QuickExperimentMemoryCacheObserverManager {
    public boolean A00;
    public boolean A01;
    public final Map A02;
    public final C15h A03 = new DBP(this, 0);

    public QuickExperimentMemoryCacheObserverManager() {
        1pU r0 = new 1pU();
        r0.A02(MapMakerInternalMap.Strength.A01);
        this.A02 = r0.A00();
        this.A00 = false;
        this.A01 = false;
    }
}
