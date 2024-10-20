package androidx.compose.foundation.gestures;

import X.04S;
import X.0DQ;
import X.0DR;
import X.0Ml;
import X.0Pn;
import X.C00m;
import X.C0Bd;
import X.KMT;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: DragGestureDetectorKt$detectDragGestures$9.class */
public final class DragGestureDetectorKt$detectDragGestures$9 extends 0Ml implements Function2 {
    public final /* synthetic */ Function2 $onDrag;
    public final /* synthetic */ C00m $onDragCancel;
    public final /* synthetic */ Function1 $onDragEnd;
    public final /* synthetic */ C0Bd $onDragStart;
    public final /* synthetic */ KMT $orientationLock;
    public final /* synthetic */ 0Pn $overSlop;
    public final /* synthetic */ C00m $shouldAwaitTouchSlop;
    public float F$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$9(KMT kmt, 0DR r303, C00m c00m, C00m c00m2, Function1 function1, Function2 function2, C0Bd c0Bd, 0Pn r309) {
        super(2, r303);
        this.$shouldAwaitTouchSlop = c00m;
        this.$overSlop = r309;
        this.$orientationLock = kmt;
        this.$onDragStart = c0Bd;
        this.$onDrag = function2;
        this.$onDragCancel = c00m2;
        this.$onDragEnd = function1;
    }

    public final 0DR create(Object obj, 0DR r303) {
        C00m c00m = this.$shouldAwaitTouchSlop;
        0Pn r0 = this.$overSlop;
        KMT kmt = this.$orientationLock;
        C0Bd c0Bd = this.$onDragStart;
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(kmt, r303, c00m, this.$onDragCancel, this.$onDragEnd, this.$onDrag, c0Bd, r0);
        dragGestureDetectorKt$detectDragGestures$9.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0646, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r325).A04.A01, r335) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04dc, code lost:
    
        if (r321 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0128, code lost:
    
        if (r0.A0B != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c9, code lost:
    
        if (r315 == 0.0f) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0859, code lost:
    
        if (r321.A01() == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0451  */
    /* JADX WARN: Type inference failed for: r0v65, types: [X.MBc, X.Jcq] */
    /* JADX WARN: Type inference failed for: r321v11, types: [X.0Pn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r321v12 */
    /* JADX WARN: Type inference failed for: r321v19 */
    /* JADX WARN: Type inference failed for: r321v20 */
    /* JADX WARN: Type inference failed for: r321v21 */
    /* JADX WARN: Type inference failed for: r343v3, types: [X.0Pn, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0885 -> B:69:0x0344). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0801 -> B:67:0x0850). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x071e -> B:14:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x04c9 -> B:69:0x0344). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
