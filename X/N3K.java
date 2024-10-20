package X;

import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;

/* loaded from: N3K.class */
public final class N3K {
    public final HnJ A00;
    public final 2An A01;
    public final GeneratedHyperThriftClassLookup A02;

    public N3K(HnJ hnJ, GeneratedHyperThriftClassLookup generatedHyperThriftClassLookup, 2An r304) {
        this.A02 = generatedHyperThriftClassLookup;
        this.A00 = hnJ;
        this.A01 = r304;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v3 ??, still in use, count: 3, list:
          (r318v3 ??) from 0x1d43: PHI (r318v1 ??) = (r318v0 ??), (r318v3 ??) binds: [B:69:0x1d00, B:84:0x1d3e] A[DONT_GENERATE, DONT_INLINE]
          (r318v3 ?? I:android.util.SparseIntArray) from 0x1d30: INVOKE (r318v3 ?? I:android.util.SparseIntArray), (r0v1153 ?? I:int), (r2v8 ?? I:int) VIRTUAL call: android.util.SparseIntArray.put(int, int):void A[Catch: all -> 0x010c, MD:(int, int):void (c)]
          (r318v3 ?? I:android.util.SparseIntArray) from 0x1d40: IPUT (r318v3 ?? I:android.util.SparseIntArray), (r0v13 ?? I:X.N0q) A[Catch: all -> 0x010c] X.N0q.A00 android.util.SparseIntArray
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
    public static com.facebook.hyperthrift.HyperThriftBase A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v3 ??, still in use, count: 3, list:
          (r318v3 ??) from 0x1d43: PHI (r318v1 ??) = (r318v0 ??), (r318v3 ??) binds: [B:69:0x1d00, B:84:0x1d3e] A[DONT_GENERATE, DONT_INLINE]
          (r318v3 ?? I:android.util.SparseIntArray) from 0x1d30: INVOKE (r318v3 ?? I:android.util.SparseIntArray), (r0v1153 ?? I:int), (r2v8 ?? I:int) VIRTUAL call: android.util.SparseIntArray.put(int, int):void A[Catch: all -> 0x010c, MD:(int, int):void (c)]
          (r318v3 ?? I:android.util.SparseIntArray) from 0x1d40: IPUT (r318v3 ?? I:android.util.SparseIntArray), (r0v13 ?? I:X.N0q) A[Catch: all -> 0x010c] X.N0q.A00 android.util.SparseIntArray
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r303 == 8) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02bd, code lost:
    
        if (r303 != 11) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r313v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r313v1, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r313v2 */
    /* JADX WARN: Type inference failed for: r313v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object A01(X.N0x r302, byte r303) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N3K.A01(X.N0x, byte):java.lang.Object");
    }
}
