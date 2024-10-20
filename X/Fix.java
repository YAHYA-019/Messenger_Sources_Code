package X;

/* loaded from: Fix.class */
public final class Fix implements 2lL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 63E A01;
    public final /* synthetic */ 6Fs A02;

    public Fix(63E r302, 6Fs r303, int i) {
        this.A01 = r302;
        this.A00 = i;
        this.A02 = r303;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v13 ??, still in use, count: 3, list:
          (r306v13 ??) from 0x068d: PHI (r306v11 ??) = 
          (r306v1 ??)
          (r306v2 ??)
          (r306v3 ??)
          (r306v5 ??)
          (r306v6 ??)
          (r306v7 ??)
          (r306v8 ??)
          (r306v9 ??)
          (r306v10 ??)
          (r306v13 ??)
         binds: [B:266:0x0686, B:255:0x0648, B:246:0x061a, B:232:0x05d5, B:219:0x0583, B:175:0x0478, B:168:0x044c, B:52:0x0192, B:46:0x016d, B:26:0x0104] A[DONT_GENERATE, DONT_INLINE]
          (r306v13 ?? I:android.view.View) from 0x00e4: INVOKE (r0v327 ?? I:android.content.Context) = (r306v13 ?? I:android.view.View) VIRTUAL call: android.view.View.getContext():android.content.Context A[Catch: all -> 0x0695, MD:():android.content.Context (c)]
          (r306v13 ?? I:android.view.View) from 0x00ff: INVOKE (r306v13 ?? I:android.view.View), (r0v331 ?? I:int) STATIC call: X.DKF.A1H(android.view.View, int):void A[Catch: all -> 0x0695]
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
    public android.view.View ALI(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v13 ??, still in use, count: 3, list:
          (r306v13 ??) from 0x068d: PHI (r306v11 ??) = 
          (r306v1 ??)
          (r306v2 ??)
          (r306v3 ??)
          (r306v5 ??)
          (r306v6 ??)
          (r306v7 ??)
          (r306v8 ??)
          (r306v9 ??)
          (r306v10 ??)
          (r306v13 ??)
         binds: [B:266:0x0686, B:255:0x0648, B:246:0x061a, B:232:0x05d5, B:219:0x0583, B:175:0x0478, B:168:0x044c, B:52:0x0192, B:46:0x016d, B:26:0x0104] A[DONT_GENERATE, DONT_INLINE]
          (r306v13 ?? I:android.view.View) from 0x00e4: INVOKE (r0v327 ?? I:android.content.Context) = (r306v13 ?? I:android.view.View) VIRTUAL call: android.view.View.getContext():android.content.Context A[Catch: all -> 0x0695, MD:():android.content.Context (c)]
          (r306v13 ?? I:android.view.View) from 0x00ff: INVOKE (r306v13 ?? I:android.view.View), (r0v331 ?? I:int) STATIC call: X.DKF.A1H(android.view.View, int):void A[Catch: all -> 0x0695]
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
