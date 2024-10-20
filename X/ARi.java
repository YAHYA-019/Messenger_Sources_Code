package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: ARi.class */
public final class ARi extends C00q implements Function1 {
    public final /* synthetic */ C1rn[] $cardTranslationYInPxs;
    public final /* synthetic */ C1rn[] $cardVisibilityPercentages;
    public final /* synthetic */ C2lh $firstVisibleItemPosition;
    public final /* synthetic */ C5it $framePerformanceLogger;
    public final /* synthetic */ 1Br $quickPerformanceLogger$delegate;
    public final /* synthetic */ 4NU $recyclerViewRef;
    public final /* synthetic */ Jtz $snapHelper;
    public final /* synthetic */ float $statusBarHeightInPx;
    public final /* synthetic */ C2k5 $this_render;
    public final /* synthetic */ C8i2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARi(C5it c5it, 1Br r303, C2k5 c2k5, 4NU r305, C2lh c2lh, Jtz jtz, C8i2 c8i2, C1rn[] c1rnArr, C1rn[] c1rnArr2, float f) {
        super(1);
        this.$recyclerViewRef = r305;
        this.$snapHelper = jtz;
        this.$framePerformanceLogger = c5it;
        this.$firstVisibleItemPosition = c2lh;
        this.$quickPerformanceLogger$delegate = r303;
        this.this$0 = c8i2;
        this.$cardVisibilityPercentages = c1rnArr;
        this.$cardTranslationYInPxs = c1rnArr2;
        this.$statusBarHeightInPx = f;
        this.$this_render = c2k5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RecyclerView recyclerView = (RecyclerView) obj;
        if (recyclerView != null) {
            4NU r0 = this.$recyclerViewRef;
            1sP.A00();
            r0.A00 = recyclerView;
            if (1BL.A0Q().AZk(2342168768862835667L) || recyclerView.A0G == null) {
                this.$snapHelper.A05(recyclerView);
            }
            C5it c5it = this.$framePerformanceLogger;
            Jtz jtz = this.$snapHelper;
            C2lh c2lh = this.$firstVisibleItemPosition;
            recyclerView.A1F(new 8Dv(c5it, this.$quickPerformanceLogger$delegate, this.$this_render, c2lh, jtz, this.this$0, this.$cardVisibilityPercentages, this.$cardTranslationYInPxs, this.$statusBarHeightInPx));
        }
        return 04S.A00;
    }
}
