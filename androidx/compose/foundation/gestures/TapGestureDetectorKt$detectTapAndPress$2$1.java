package androidx.compose.foundation.gestures;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.2aI;
import X.C0Bd;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: TapGestureDetectorKt$detectTapAndPress$2$1.class */
public final class TapGestureDetectorKt$detectTapAndPress$2$1 extends 0Ml implements Function2 {
    public final /* synthetic */ 2aI $$this$coroutineScope;
    public final /* synthetic */ C0Bd $onPress;
    public final /* synthetic */ Function1 $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1(PressGestureScopeImpl pressGestureScopeImpl, 0DR r303, Function1 function1, C0Bd c0Bd, 2aI r306) {
        super(2, r303);
        this.$$this$coroutineScope = r306;
        this.$onPress = c0Bd;
        this.$onTap = function1;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final 0DR create(Object obj, 0DR r303) {
        2aI r0 = this.$$this$coroutineScope;
        C0Bd c0Bd = this.$onPress;
        TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1(this.$pressScope, r303, this.$onTap, c0Bd, r0);
        tapGestureDetectorKt$detectTapAndPress$2$1.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
