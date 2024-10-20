package X;

import com.facebook.messaging.quickpromotion.plugins.threadlistmsys.threadlistbanner.ThreadListQPMsysBannerImplementation;
import com.google.common.base.Preconditions;

/* renamed from: X.3dq, reason: invalid class name */
/* loaded from: 3dq.class */
public final class C3dq implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3dq(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 2:
                Preconditions.checkState(false, "should not reached");
                throw 0Q8.createAndThrow();
            case 3:
                ((ThreadListQPMsysBannerImplementation) this.A02).A00 = null;
                ((2Ws) this.A01).Bks("msys_quick_promotion");
                return;
            default:
                return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r320v11 ??, still in use, count: 4, list:
          (r320v11 ??) from 0x057b: PHI (r320v10 ??) = (r320v9 ??), (r320v11 ??) binds: [B:238:0x05ab, B:229:0x0579] A[DONT_GENERATE, DONT_INLINE]
          (r320v11 ?? I:X.2Tx) from 0x0552: IGET (r0v726 ?? I:X.2To) = (r320v11 ?? I:X.2Tx) A[Catch: all -> 0x0fd4] X.2Tx.A00 X.2To
          (r320v11 ?? I:java.lang.Object) from 0x055d: INVOKE (r0v724 ?? I:java.util.AbstractMap), (r0v726 ?? I:java.lang.Object), (r320v11 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0fd4, MD:(K, V):V (c)]
          (r320v11 ?? I:java.lang.Object) from 0x0563: INVOKE (r0v730 ?? I:java.lang.String) = (r320v11 ?? I:java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[Catch: all -> 0x0fd4, MD:():java.lang.String (c)]
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
    public /* bridge */ /* synthetic */ void onSuccess(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r320v11 ??, still in use, count: 4, list:
          (r320v11 ??) from 0x057b: PHI (r320v10 ??) = (r320v9 ??), (r320v11 ??) binds: [B:238:0x05ab, B:229:0x0579] A[DONT_GENERATE, DONT_INLINE]
          (r320v11 ?? I:X.2Tx) from 0x0552: IGET (r0v726 ?? I:X.2To) = (r320v11 ?? I:X.2Tx) A[Catch: all -> 0x0fd4] X.2Tx.A00 X.2To
          (r320v11 ?? I:java.lang.Object) from 0x055d: INVOKE (r0v724 ?? I:java.util.AbstractMap), (r0v726 ?? I:java.lang.Object), (r320v11 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0fd4, MD:(K, V):V (c)]
          (r320v11 ?? I:java.lang.Object) from 0x0563: INVOKE (r0v730 ?? I:java.lang.String) = (r320v11 ?? I:java.lang.Object) VIRTUAL call: java.lang.Object.toString():java.lang.String A[Catch: all -> 0x0fd4, MD:():java.lang.String (c)]
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
