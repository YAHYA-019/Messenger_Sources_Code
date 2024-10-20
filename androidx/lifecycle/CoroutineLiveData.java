package androidx.lifecycle;

import X.04S;
import X.0DR;
import X.0Dt;
import X.2Zs;
import X.2aI;
import X.2aK;
import X.2aN;
import X.4ZJ;
import X.7zM;
import X.AIe;
import X.AJV;
import X.AnonymousClass001;
import X.C2a2;
import X.JTs;

/* loaded from: CoroutineLiveData.class */
public final class CoroutineLiveData extends MediatorLiveData {
    public BlockRunner blockRunner;

    public final Object clearSource$lifecycle_livedata_release(0DR r302) {
        AIe A01;
        int i;
        if (AIe.A03(9, r302)) {
            A01 = (AIe) r302;
            int i2 = A01.A00;
            int i3 = (-1) << (-1);
            if ((i2 & i3) != 0) {
                A01.A00 = i2 - i3;
                Object obj = A01.A02;
                i = A01.A00;
                if (i == 0 && i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
                return 04S.A00;
            }
        }
        A01 = AIe.A01(this, r302, 9);
        Object obj2 = A01.A02;
        i = A01.A00;
        if (i == 0) {
        }
        0Dt.A00(obj2);
        return 04S.A00;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            C2a2 c2a2 = blockRunner.cancellationJob;
            if (c2a2 != null) {
                c2a2.AE0(null);
            }
            blockRunner.cancellationJob = null;
            if (blockRunner.runningJob == null) {
                blockRunner.runningJob = 2aK.A04(new AJV(blockRunner, null, 12), blockRunner.scope);
            }
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner blockRunner = this.blockRunner;
        if (blockRunner != null) {
            if (blockRunner.cancellationJob != null) {
                throw AnonymousClass001.A0N("Cancel call cannot happen without a maybeRun");
            }
            2aI r0 = blockRunner.scope;
            2Zs r02 = 2aN.A00;
            blockRunner.cancellationJob = 7zM.A1G(4ZJ.A00.A01(), new JTs(blockRunner, (0DR) null, 24), r0);
        }
    }
}
