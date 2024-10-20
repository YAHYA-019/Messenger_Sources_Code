package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Lpn.class */
public final /* synthetic */ class Lpn implements Runnable {
    public static final String __redex_internal_original_name = "MediaPeriodQueue2$$ExternalSyntheticLambda0";
    public final /* synthetic */ JT8 A00;
    public final /* synthetic */ 6YR A01;
    public final /* synthetic */ ImmutableList.Builder A02;

    public /* synthetic */ Lpn(JT8 jt8, 6YR r303, ImmutableList.Builder builder) {
        this.A00 = jt8;
        this.A02 = builder;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JT8 jt8 = this.A00;
        ImmutableList.Builder builder = this.A02;
        jt8.A0B.D7K(this.A01, builder.build());
    }
}
