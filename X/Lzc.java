package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* loaded from: Lzc.class */
public final class Lzc extends 0DP {
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzc(NestedScrollNode nestedScrollNode, 0DR r303) {
        super(r303);
        this.this$0 = nestedScrollNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.CCy(this, 0L, 0L);
    }
}
