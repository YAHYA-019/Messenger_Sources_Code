package androidx.compose.foundation.lazy;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Dt;
import X.AnonymousClass001;
import X.L7h;
import X.MEQ;
import kotlin.jvm.functions.Function2;

/* loaded from: LazyListState$scrollToItem$2.class */
public final class LazyListState$scrollToItem$2 extends 0DO implements Function2 {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public int label;
    public final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, 0DR r303, int i, int i2) {
        super(2, r303);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new LazyListState$scrollToItem$2(this.this$0, r303, this.$index, this.$scrollOffset);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        LazyListState lazyListState = this.this$0;
        int i = this.$index;
        int i2 = this.$scrollOffset;
        L7h l7h = lazyListState.A0A;
        if (l7h.A03.ArX() != i || l7h.A04.ArX() != i2) {
            lazyListState.A0D.A01();
        }
        L7h.A00(l7h, i, i2);
        l7h.A00 = null;
        MEQ meq = lazyListState.A03;
        if (meq != null) {
            meq.ATg();
        }
        return 04S.A00;
    }
}
