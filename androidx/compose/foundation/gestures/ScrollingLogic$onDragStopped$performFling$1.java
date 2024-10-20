package androidx.compose.foundation.gestures;

import X.04S;
import X.0DO;
import X.0DR;
import X.L8V;
import kotlin.jvm.functions.Function2;

/* loaded from: ScrollingLogic$onDragStopped$performFling$1.class */
public final class ScrollingLogic$onDragStopped$performFling$1 extends 0DO implements Function2 {
    public /* synthetic */ long J$0;
    public long J$1;
    public int label;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, 0DR r303) {
        super(2, r303);
        this.this$0 = scrollingLogic;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, r303);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((L8V) obj).A00;
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(new L8V(((L8V) obj).A00), (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
