package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.2fy, reason: invalid class name */
/* loaded from: 2fy.class */
public final class C2fy implements Runnable {
    public static final String __redex_internal_original_name = "ReadThroughCachedMsysStoriesDataAccess$loadMontageBucketPreviewByUserIdOptimistically$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2TA A01;

    public C2fy(2TA r302, long j) {
        this.A01 = r302;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2TA r0 = this.A01;
        ImmutableList of = ImmutableList.of((Object) Long.valueOf(this.A00));
        11T.A0A(of);
        r0.BYk(of);
    }
}
