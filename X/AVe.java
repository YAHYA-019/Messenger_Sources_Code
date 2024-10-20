package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AVe.class */
public final class AVe extends C00q implements Function2 {
    public final /* synthetic */ C2lh $focusedItem;
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $itemHorizontalPadding;
    public final /* synthetic */ 0PI $itemWidth;
    public final /* synthetic */ long $roundedCornerRadius;
    public final /* synthetic */ Exr $spotlightItem;
    public final /* synthetic */ C8dh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVe(C2lh c2lh, C8dh c8dh, Exr exr, 0PI r305, int i, int i2, long j) {
        super(2);
        this.$itemWidth = r305;
        this.$itemHorizontalPadding = i;
        this.$spotlightItem = exr;
        this.this$0 = c8dh;
        this.$focusedItem = c2lh;
        this.$index = i2;
        this.$roundedCornerRadius = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C9sl c9sl = (C9sl) obj;
        1BK.A1M(c9sl, obj2);
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0K = 4YV.A0K(4YV.A0K((2lO) null, num, this.$itemWidth.element | 9221401712017801216L), 0S2.A04, this.$itemHorizontalPadding | 9221401712017801216L);
        Exr exr = this.$spotlightItem;
        C8dh c8dh = this.this$0;
        C2lh c2lh = this.$focusedItem;
        int i = this.$index;
        long j = this.$roundedCornerRadius;
        return 7zN.A0R(new Dvm(7zQ.A0Z(C82m.A05(null, 0S2.A01, num, 100.0f, 0), 0S2.A0Y, new GAc(i, 20, c8dh)), c8dh.A00, exr.A00, new AKd(i, 15, c8dh, exr), j, c8dh.A05, AnonymousClass001.A1Q(7zP.A01(c2lh), i)), 7zQ.A0U(c9sl.A00), c9sl, A0K);
    }
}
