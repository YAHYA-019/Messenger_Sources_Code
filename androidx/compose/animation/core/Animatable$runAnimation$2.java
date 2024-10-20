package androidx.compose.animation.core;

import X.04S;
import X.0DO;
import X.0DR;
import X.L0u;
import X.MKm;
import kotlin.jvm.functions.Function1;

/* loaded from: Animatable$runAnimation$2.class */
public final class Animatable$runAnimation$2 extends 0DO implements Function1 {
    public final /* synthetic */ MKm $animation;
    public final /* synthetic */ Function1 $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ L0u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(L0u l0u, MKm mKm, Object obj, 0DR r305, Function1 function1, long j) {
        super(1, r305);
        this.this$0 = l0u;
        this.$initialVelocity = obj;
        this.$animation = mKm;
        this.$startTime = j;
        this.$block = function1;
    }

    public final 0DR create(0DR r302) {
        L0u l0u = this.this$0;
        Object obj = this.$initialVelocity;
        return new Animatable$runAnimation$2(l0u, this.$animation, obj, r302, this.$block, this.$startTime);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((0DR) obj).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v0 ??, still in use, count: 4, list:
          (r308v0 ??) from 0x0179: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:89:0x0170, B:7:0x0175] A[DONT_GENERATE, DONT_INLINE]
          (r308v0 ?? I:java.lang.Object) from 0x013f: INVOKE 
          (r0v79 ?? I:X.ARN)
          (r1v7 ?? I:int)
          (r0v76 ?? I:java.lang.Object)
          (r308v0 ?? I:java.lang.Object)
          (r0v78 ?? I:java.lang.Object)
          (r307v0 ?? I:java.lang.Object)
         DIRECT call: X.ARN.<init>(int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void A[Catch: CancellationException -> 0x01d5]
          (r308v0 ?? I:java.lang.Object) from 0x0145: IPUT 
          (r308v0 ?? I:java.lang.Object)
          (r301v0 'this' ?? I:androidx.compose.animation.core.Animatable$runAnimation$2 A[IMMUTABLE_TYPE, THIS])
         A[Catch: CancellationException -> 0x01d5] androidx.compose.animation.core.Animatable$runAnimation$2.L$0 java.lang.Object
          (r308v0 ?? I:X.LNu) from 0x0168: INVOKE (r0v88 ?? I:java.lang.Object) = 
          (r0v72 ?? I:X.MKm)
          (r308v0 ?? I:X.LNu)
          (r301v0 'this' ?? I:X.0DR A[IMMUTABLE_TYPE, THIS])
          (r0v79 ?? I:kotlin.jvm.functions.Function1)
          (r0v74 ?? I:long)
         STATIC call: androidx.compose.animation.core.SuspendAnimationKt.A01(X.MKm, X.LNu, X.0DR, kotlin.jvm.functions.Function1, long):java.lang.Object A[Catch: CancellationException -> 0x01d5, MD:(X.MKm, X.LNu, X.0DR, kotlin.jvm.functions.Function1, long):java.lang.Object (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v0 ??, still in use, count: 4, list:
          (r308v0 ??) from 0x0179: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:89:0x0170, B:7:0x0175] A[DONT_GENERATE, DONT_INLINE]
          (r308v0 ?? I:java.lang.Object) from 0x013f: INVOKE 
          (r0v79 ?? I:X.ARN)
          (r1v7 ?? I:int)
          (r0v76 ?? I:java.lang.Object)
          (r308v0 ?? I:java.lang.Object)
          (r0v78 ?? I:java.lang.Object)
          (r307v0 ?? I:java.lang.Object)
         DIRECT call: X.ARN.<init>(int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void A[Catch: CancellationException -> 0x01d5]
          (r308v0 ?? I:java.lang.Object) from 0x0145: IPUT 
          (r308v0 ?? I:java.lang.Object)
          (r301v0 'this' ?? I:androidx.compose.animation.core.Animatable$runAnimation$2 A[IMMUTABLE_TYPE, THIS])
         A[Catch: CancellationException -> 0x01d5] androidx.compose.animation.core.Animatable$runAnimation$2.L$0 java.lang.Object
          (r308v0 ?? I:X.LNu) from 0x0168: INVOKE (r0v88 ?? I:java.lang.Object) = 
          (r0v72 ?? I:X.MKm)
          (r308v0 ?? I:X.LNu)
          (r301v0 'this' ?? I:X.0DR A[IMMUTABLE_TYPE, THIS])
          (r0v79 ?? I:kotlin.jvm.functions.Function1)
          (r0v74 ?? I:long)
         STATIC call: androidx.compose.animation.core.SuspendAnimationKt.A01(X.MKm, X.LNu, X.0DR, kotlin.jvm.functions.Function1, long):java.lang.Object A[Catch: CancellationException -> 0x01d5, MD:(X.MKm, X.LNu, X.0DR, kotlin.jvm.functions.Function1, long):java.lang.Object (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
}
