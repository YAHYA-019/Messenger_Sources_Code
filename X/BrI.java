package X;

import android.content.Context;
import com.facebook.abtest.qe.cache.QuickExperimentMemoryCacheObserverManager;
import com.facebook.inject.FbInjector;

/* loaded from: BrI.class */
public final class BrI {
    public Context A00;
    public final QuickExperimentMemoryCacheObserverManager A01;
    public final BrJ A02;
    public final 1I7 A03;

    public BrI() {
        boolean z = 1FX.GENERATE_CANCELLATION_CAUSES;
        this.A02 = (BrJ) 1Bn.A0A(83300);
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A03 = (1I7) 1Hv.A02(A00, 65731);
        this.A01 = (QuickExperimentMemoryCacheObserverManager) 1Bi.A03(49338);
    }
}
