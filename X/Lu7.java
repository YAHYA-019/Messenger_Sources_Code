package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* loaded from: Lu7.class */
public final /* synthetic */ class Lu7 implements Consumer {
    public final /* synthetic */ AtomicInteger A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ BiFunction A02;
    public final /* synthetic */ KZA A03;

    public /* synthetic */ Lu7(AtomicInteger atomicInteger, AtomicReference atomicReference, BiFunction biFunction, KZA kza) {
        this.A03 = kza;
        this.A01 = atomicReference;
        this.A02 = biFunction;
        this.A00 = atomicInteger;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v0 ??, still in use, count: 7, list:
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ?? I:X.KtK) from 0x00df: IGET (r0v128 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: AccessDeniedException -> 0x0117, IOException -> 0x0283] X.KtK.A02 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x00fe: IGET (r0v136 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: AccessDeniedException -> 0x0117, IOException -> 0x0283] X.KtK.A00 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x01af: IGET (r0v95 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: all -> 0x0251] X.KtK.A02 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x01ce: IGET (r0v103 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: all -> 0x0251] X.KtK.A00 X.Ksc
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
    @Override // java.util.function.Consumer
    public final void accept(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v0 ??, still in use, count: 7, list:
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ??) from 0x01f8: PHI (r315v1 ??) = (r315v0 ??), (r315v0 ??), (r315v0 ??), (r315v2 ??) binds: [B:124:0x01e6, B:127:0x01f3, B:77:0x010f, B:27:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r315v0 ?? I:X.KtK) from 0x00df: IGET (r0v128 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: AccessDeniedException -> 0x0117, IOException -> 0x0283] X.KtK.A02 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x00fe: IGET (r0v136 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: AccessDeniedException -> 0x0117, IOException -> 0x0283] X.KtK.A00 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x01af: IGET (r0v95 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: all -> 0x0251] X.KtK.A02 X.Ksc
          (r315v0 ?? I:X.KtK) from 0x01ce: IGET (r0v103 ?? I:X.Ksc) = (r315v0 ?? I:X.KtK) A[Catch: all -> 0x0251] X.KtK.A00 X.Ksc
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
