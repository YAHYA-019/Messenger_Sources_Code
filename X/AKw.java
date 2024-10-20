package X;

/* loaded from: AKw.class */
public final class AKw extends C00q implements C00m {
    public final /* synthetic */ C2lh $isScrolling;
    public final /* synthetic */ C2lh $isSongPaused;
    public final /* synthetic */ 9cG $lazyCollectionController;
    public final /* synthetic */ C2lh $shouldRestart;
    public final /* synthetic */ C2lh $startingTimeMs;
    public final /* synthetic */ C2k5 $this_render;
    public final /* synthetic */ long $totalDistance;
    public final /* synthetic */ 8Zv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKw(C2k5 c2k5, C2lh c2lh, C2lh c2lh2, C2lh c2lh3, C2lh c2lh4, 9cG r307, 8Zv r308, long j) {
        super(0);
        this.$isScrolling = c2lh;
        this.$lazyCollectionController = r307;
        this.this$0 = r308;
        this.$startingTimeMs = c2lh2;
        this.$shouldRestart = c2lh3;
        this.$this_render = c2k5;
        this.$totalDistance = j;
        this.$isSongPaused = c2lh4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C2lh c2lh = this.$isScrolling;
        9cG r0 = this.$lazyCollectionController;
        8Zv r02 = this.this$0;
        C2lh c2lh2 = this.$startingTimeMs;
        C2lh c2lh3 = this.$shouldRestart;
        return new 9VU(this.$this_render, c2lh, c2lh2, c2lh3, this.$isSongPaused, r0, r02, this.$totalDistance);
    }
}
