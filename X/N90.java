package X;

import android.content.Context;
import com.facebook.surfaces.fb.PrewarmingJobsQueue;

/* loaded from: N90.class */
public final class N90 implements Runnable {
    public static final String __redex_internal_original_name = "PrewarmingJobsQueue$4";
    public final /* synthetic */ 5Tc A00;
    public final /* synthetic */ 5TY A01;
    public final /* synthetic */ 5Fi A02;
    public final /* synthetic */ N1S A03;
    public final /* synthetic */ PrewarmingJobsQueue A04;

    public N90(5Tc r302, 5TY r303, 5Fi r304, N1S n1s, PrewarmingJobsQueue prewarmingJobsQueue) {
        this.A04 = prewarmingJobsQueue;
        this.A02 = r304;
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = n1s;
    }

    @Override // java.lang.Runnable
    public void run() {
        PrewarmingJobsQueue prewarmingJobsQueue = this.A04;
        if (PrewarmingJobsQueue.A04(this.A02, prewarmingJobsQueue)) {
            return;
        }
        5Tc r0 = this.A00;
        5TY r02 = this.A01;
        long j = this.A03.A00;
        if (5Tf.A0A(r02) && 5Tf.A08((Context) prewarmingJobsQueue.A02.get(), r0, r02, j)) {
            return;
        }
        PrewarmingJobsQueue.A02(prewarmingJobsQueue);
        PrewarmingJobsQueue.A03(prewarmingJobsQueue);
    }
}
