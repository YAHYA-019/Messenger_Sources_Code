package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.43R, reason: invalid class name */
/* loaded from: 43R.class */
public final class C43R {
    public 43Q A00;
    public int A02;
    public AtomicReference A03;
    public final C00i A05 = new 1BQ(16385);
    public boolean A04 = false;
    public final List A06 = Collections.synchronizedList(new ArrayList());
    public AtomicReference A01 = new AtomicReference(40H.A07);
    public final double[] A07 = new double[7];

    private 40H A00() {
        43Q r0 = this.A00;
        if (r0 != null) {
            double AYQ = r0.AYQ();
            double[] dArr = this.A07;
            double d = dArr[0];
            if (d == 0.0d) {
                d = ((2yD) this.A05.get()).Auz(36591815692714101L, 100000L);
                dArr[0] = d;
            }
            if (AYQ > d) {
                return 40H.A02;
            }
            double AYQ2 = this.A00.AYQ();
            double d2 = dArr[1];
            if (d2 == 0.0d) {
                d2 = ((2yD) this.A05.get()).Auz(36591815692451953L, 1000L);
                dArr[1] = d2;
            }
            if (AYQ2 > d2) {
                return 40H.A06;
            }
            double AYQ3 = this.A00.AYQ();
            double d3 = dArr[2];
            if (d3 == 0.0d) {
                d3 = ((2yD) this.A05.get()).Auz(36591815692517490L, 500L);
                dArr[2] = d3;
            }
            if (AYQ3 > d3) {
                return 40H.A05;
            }
            double AYQ4 = this.A00.AYQ();
            double d4 = dArr[3];
            if (d4 == 0.0d) {
                d4 = ((2yD) this.A05.get()).Auz(36591815692583027L, 250L);
                dArr[3] = d4;
            }
            if (AYQ4 > d4) {
                return 40H.A04;
            }
            if (this.A00.AYQ() > 0.0d) {
                return 40H.A03;
            }
        }
        return 40H.A07;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v3 ??, still in use, count: 2, list:
          (r310v3 ??) from 0x00f3: PHI (r310v1 ??) = (r310v0 ??), (r310v3 ??) binds: [B:15:0x0078, B:33:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          (r310v3 ?? I:X.43Q) from 0x00f0: IPUT (r310v3 ?? I:X.43Q), (r301v0 'this' ?? I:X.43R A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0261] X.43R.A00 X.43Q
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
    public void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v3 ??, still in use, count: 2, list:
          (r310v3 ??) from 0x00f3: PHI (r310v1 ??) = (r310v0 ??), (r310v3 ??) binds: [B:15:0x0078, B:33:0x00ee] A[DONT_GENERATE, DONT_INLINE]
          (r310v3 ?? I:X.43Q) from 0x00f0: IPUT (r310v3 ?? I:X.43Q), (r301v0 'this' ?? I:X.43R A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0261] X.43R.A00 X.43Q
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
