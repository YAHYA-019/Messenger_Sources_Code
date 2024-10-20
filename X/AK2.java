package X;

/* loaded from: AK2.class */
public final /* synthetic */ class AK2 extends 01I implements C00m {
    public final /* synthetic */ C00m $boundsProvider;
    public final /* synthetic */ MKq $childCoordinates;
    public final /* synthetic */ C2903Jcp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AK2(C2903Jcp c2903Jcp, MKq mKq, C00m c00m) {
        super(0, 11U.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.this$0 = c2903Jcp;
        this.$childCoordinates = mKq;
        this.$boundsProvider = c00m;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        return C2903Jcp.A00(this.this$0, this.$childCoordinates, this.$boundsProvider);
    }
}
