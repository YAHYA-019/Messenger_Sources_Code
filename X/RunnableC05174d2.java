package X;

import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4d2.class */
public final class RunnableC05174d2 implements Runnable {
    public static final String __redex_internal_original_name = "ReadThroughCachedMsysStoriesDataAccess$loadMontageCardsByStoryIds$1";
    public final /* synthetic */ ImmutableList.Builder A00;
    public final /* synthetic */ Function1 A01;

    public RunnableC05174d2(ImmutableList.Builder builder, Function1 function1) {
        this.A01 = function1;
        this.A00 = builder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function1 function1 = this.A01;
        ImmutableList build = this.A00.build();
        11T.A0A(build);
        function1.invoke(build);
    }
}
