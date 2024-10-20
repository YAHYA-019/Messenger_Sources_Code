package androidx.compose.foundation.gestures;

import X.04S;
import X.0DE;
import X.0DQ;
import X.0DR;
import X.0Ml;
import kotlin.jvm.functions.Function2;

/* loaded from: ForEachGestureKt$awaitEachGesture$2.class */
public final class ForEachGestureKt$awaitEachGesture$2 extends 0Ml implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ 0DE $currentContext;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(0DR r302, 0DE r303, Function2 function2) {
        super(2, r302);
        this.$currentContext = r303;
        this.$block = function2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(r303, this.$currentContext, this.$block);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[Catch: CancellationException -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:16:0x005f, B:18:0x0066, B:19:0x006c, B:21:0x0075, B:25:0x00a9, B:26:0x00af, B:27:0x00b6, B:43:0x0094, B:45:0x00a4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0102 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
