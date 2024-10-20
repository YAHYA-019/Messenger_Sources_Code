package androidx.compose.foundation.gestures;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.Kts;
import kotlin.jvm.functions.Function2;

/* loaded from: TapGestureDetectorKt$awaitSecondDown$2.class */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends 0Ml implements Function2 {
    public final /* synthetic */ Kts $firstUp;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(Kts kts, 0DR r303) {
        super(2, r303);
        this.$firstUp = kts;
    }

    public final 0DR create(Object obj, 0DR r303) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, r303);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x009a -> B:6:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            r301 = this;
            X.0Ds r0 = X.0Ds.A02
            r303 = r0
            r0 = r301
            int r0 = r0.label
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L40
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L9f
            r0 = r301
            long r0 = r0.J$0
            r306 = r0
            r0 = r301
            java.lang.Object r0 = r0.L$0
            X.MNe r0 = (X.MNe) r0
            r308 = r0
            r0 = r302
            X.0Dt.A00(r0)
        L29:
            r0 = r302
            X.Kts r0 = (X.Kts) r0
            r302 = r0
            r0 = r302
            long r0 = r0.A0A
            r309 = r0
            r0 = r309
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r304 = r0
            r0 = r304
            if (r0 < 0) goto L76
            r0 = r302
            return r0
        L40:
            r0 = r302
            X.0Dt.A00(r0)
            r0 = r301
            java.lang.Object r0 = r0.L$0
            X.MNe r0 = (X.MNe) r0
            r308 = r0
            r0 = r301
            X.Kts r0 = r0.$firstUp
            long r0 = r0.A0A
            r306 = r0
            r0 = r308
            r311 = r0
            r0 = r308
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.Jcq r0 = r0.A04
            r311 = r0
            r0 = r311
            X.LPQ r0 = X.LDX.A02(r0)
            r0 = 40
            long r0 = (long) r0
            r312 = r0
            r0 = r306
            r1 = r312
            long r0 = r0 + r1
            r306 = r0
        L76:
            r0 = r301
            r1 = r308
            r0.L$0 = r1
            r0 = r301
            r1 = r306
            r0.J$0 = r1
            r0 = r301
            r1 = r305
            r0.label = r1
            X.KMa r0 = X.KMa.A03
            r311 = r0
            r0 = r308
            r1 = r311
            r2 = r301
            r3 = r305
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r0, r1, r2, r3)
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L29
            r0 = r303
            return r0
        L9f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
