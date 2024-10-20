package X;

import com.google.common.collect.ImmutableList;

/* loaded from: AF5.class */
public final class AF5 implements Runnable {
    public static final String __redex_internal_original_name = "RecommendedPublicChannelsLoader$loadRecommendedChannelsFromDb$1$1";
    public final /* synthetic */ 9Zf A00;
    public final /* synthetic */ ImmutableList.Builder A01;

    public AF5(9Zf r302, ImmutableList.Builder builder) {
        this.A01 = builder;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImmutableList build = this.A01.build();
        9Zf r0 = this.A00;
        AY5 ay5 = r0.A02;
        if (ay5 != null) {
            11T.A0D(build);
            ay5.C97(new 8Kh(build));
        }
        9KB r02 = r0.A01;
        if (r02 != null) {
            11T.A0D(build);
            11T.A0F(build, 0);
            8Gt r03 = r02.A00;
            if (r03.A1V()) {
                8D9 r04 = (8D9) r03.A0E.getValue();
                7zP.A0O(r04.A01).A00(r04.A00, build);
            }
        }
    }
}
