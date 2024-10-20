package X;

/* loaded from: M16.class */
public final class M16 extends C00q implements C00m {
    public final /* synthetic */ Lsx $hitTestResult;
    public final /* synthetic */ MK0 $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ LPR $this_hit;
    public final /* synthetic */ AbstractC2938JdR this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M16(LPR lpr, Lsx lsx, MK0 mk0, AbstractC2938JdR abstractC2938JdR, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = abstractC2938JdR;
        this.$this_hit = lpr;
        this.$hitTestSource = mk0;
        this.$pointerPosition = j;
        this.$hitTestResult = lsx;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        AbstractC2938JdR abstractC2938JdR = this.this$0;
        LPR lpr = this.$this_hit;
        MK0 mk0 = this.$hitTestSource;
        AbstractC2938JdR.A0A(KUk.A00(lpr, mk0.AQo()), this.$hitTestResult, mk0, abstractC2938JdR, this.$pointerPosition, this.$isTouchEvent, this.$isInLayer);
        return 04S.A00;
    }
}
