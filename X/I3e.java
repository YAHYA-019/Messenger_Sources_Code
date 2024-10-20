package X;

import java.util.HashMap;

/* loaded from: I3e.class */
public final class I3e {
    public HiH A00;
    public final C00i A02 = 1BV.A00(116021);
    public final C00i A03 = 1BV.A00(98744);
    public final C00i A01 = 1BV.A00(693);
    public final HashMap A04 = AnonymousClass001.A0u();

    public static final I3e A00() {
        return new I3e();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v5 ??, still in use, count: 2, list:
          (r304v5 ??) from 0x0023: PHI (r304v6 ??) = (r304v2 ??), (r304v3 ??), (r304v5 ??), (r304v7 ??) binds: [B:26:0x0095, B:14:0x005b, B:20:0x0088, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r304v5 ?? I:X.HiH) from 0x008f: IPUT (r304v5 ?? I:X.HiH), (r301v0 'this' ?? I:X.I3e A[IMMUTABLE_TYPE, THIS]) X.I3e.A00 X.HiH
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
    public java.lang.Object A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v5 ??, still in use, count: 2, list:
          (r304v5 ??) from 0x0023: PHI (r304v6 ??) = (r304v2 ??), (r304v3 ??), (r304v5 ??), (r304v7 ??) binds: [B:26:0x0095, B:14:0x005b, B:20:0x0088, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r304v5 ?? I:X.HiH) from 0x008f: IPUT (r304v5 ?? I:X.HiH), (r301v0 'this' ?? I:X.I3e A[IMMUTABLE_TYPE, THIS]) X.I3e.A00 X.HiH
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0 == r303) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.lang.Class r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r303
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            java.util.HashMap r0 = r0.A04
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.put(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1b
            r0 = 0
            r305 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L1e
        L1b:
            r0 = 1
            r305 = r0
        L1e:
            r0 = r305
            java.lang.String r1 = "Service for %s already registered"
            r2 = r302
            com.google.common.base.Preconditions.checkState(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3e.A02(java.lang.Class, java.lang.Object):void");
    }
}
