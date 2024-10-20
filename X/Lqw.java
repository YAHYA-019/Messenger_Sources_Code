package X;

import java.util.List;

/* loaded from: Lqw.class */
public final /* synthetic */ class Lqw implements Runnable {
    public static final String __redex_internal_original_name = "WarmUpPlayerListener$$ExternalSyntheticLambda2";
    public final /* synthetic */ 6Uz A00;
    public final /* synthetic */ 6VS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ Lqw(6Uz r302, 6VS r303, String str, List list, boolean z) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = str;
        this.A03 = list;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6VS r0 = this.A01;
        r0.A00.But(this.A00, this.A02, this.A03, this.A04);
    }
}
