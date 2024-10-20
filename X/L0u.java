package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;

/* loaded from: L0u.class */
public final class L0u {
    public KuM A00;
    public KuM A01;
    public final LNu A02;
    public final KuM A03;
    public final KuM A04;
    public final MBB A06;
    public final MN4 A08;
    public final LMQ A09;
    public final Object A0A;
    public final MN4 A07 = KvA.A01(false);
    public final 9Mc A05 = new 9Mc();

    public L0u(MBB mbb, Object obj, Object obj2) {
        this.A06 = mbb;
        this.A0A = obj2;
        this.A02 = new LNu((KuM) null, mbb, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.A08 = KvA.A01(obj);
        this.A09 = new LMQ(obj2, 1500.0f);
        KuM kuM = this.A02.A02;
        KuM kuM2 = kuM instanceof C2821Jad ? KdI.A00 : kuM instanceof C2822Jae ? KdI.A02 : kuM instanceof C2823Jaf ? KdI.A04 : KdI.A06;
        11T.A0I(kuM2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A03 = kuM2;
        KuM kuM3 = this.A02.A02;
        KuM kuM4 = kuM3 instanceof C2821Jad ? KdI.A01 : kuM3 instanceof C2822Jae ? KdI.A03 : kuM3 instanceof C2823Jaf ? KdI.A05 : KdI.A07;
        11T.A0I(kuM4, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A04 = kuM4;
        this.A00 = kuM2;
        this.A01 = kuM4;
    }

    public static final Object A00(L0u l0u, MDy mDy, Object obj, Object obj2, 0DR r305) {
        LNu lNu = l0u.A02;
        Object value = lNu.A05.getValue();
        LMV lmv = l0u.A06;
        LMF lmf = new LMF(mDy, (KuM) lmv.A01.invoke(obj2), lmv, value, obj);
        long j = lNu.A01;
        return 2aG.A00(r305, new AJh(KMR.A01, l0u.A05, null, new Animatable$runAnimation$2(l0u, lmf, obj2, null, null, j)));
    }
}
