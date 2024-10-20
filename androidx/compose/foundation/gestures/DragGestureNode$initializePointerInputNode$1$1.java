package androidx.compose.foundation.gestures;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.C00m;
import X.C0Bd;
import X.MNc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: DragGestureNode$initializePointerInputNode$1$1.class */
public final class DragGestureNode$initializePointerInputNode$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ MNc $$this$SuspendingPointerInputModifierNode;
    public final /* synthetic */ Function2 $onDrag;
    public final /* synthetic */ C00m $onDragCancel;
    public final /* synthetic */ Function1 $onDragEnd;
    public final /* synthetic */ C0Bd $onDragStart;
    public final /* synthetic */ C00m $shouldAwaitTouchSlop;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$1(DragGestureNode dragGestureNode, MNc mNc, 0DR r304, C00m c00m, C00m c00m2, Function1 function1, Function2 function2, C0Bd c0Bd) {
        super(2, r304);
        this.this$0 = dragGestureNode;
        this.$$this$SuspendingPointerInputModifierNode = mNc;
        this.$onDragStart = c0Bd;
        this.$onDragEnd = function1;
        this.$onDragCancel = c00m;
        this.$shouldAwaitTouchSlop = c00m2;
        this.$onDrag = function2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        DragGestureNode dragGestureNode = this.this$0;
        MNc mNc = this.$$this$SuspendingPointerInputModifierNode;
        C0Bd c0Bd = this.$onDragStart;
        DragGestureNode$initializePointerInputNode$1$1 dragGestureNode$initializePointerInputNode$1$1 = new DragGestureNode$initializePointerInputNode$1$1(dragGestureNode, mNc, r303, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDragEnd, this.$onDrag, c0Bd);
        dragGestureNode$initializePointerInputNode$1$1.L$0 = obj;
        return dragGestureNode$initializePointerInputNode$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (X.2aG.A05((X.2aI) r306) == false) goto L45;
     */
    /* JADX WARN: Failed to calculate best type for var: r306v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r306v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
    	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 306, insn: 0x00d2: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r306 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:46:0x00d2 */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0Pn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r306v0, types: [X.2aI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
