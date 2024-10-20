package X;

import android.os.Handler;
import java.util.Set;

/* renamed from: X.3Uy, reason: invalid class name */
/* loaded from: 3Uy.class */
public final class C3Uy implements 1Ns {
    public static volatile C3Uy A08;
    public final int A00;
    public final long A01;
    public final Handler A02;
    public final Runnable A03;
    public final java.util.Map A04;
    public final Set A05;
    public final Set A06;
    public final boolean A07;

    public C3Uy(Handler handler, int i, long j, boolean z) {
        S6S s6s = new S6S(this);
        this.A03 = s6s;
        this.A04 = AnonymousClass001.A0u();
        this.A05 = AnonymousClass001.A0v();
        this.A06 = AnonymousClass001.A0v();
        this.A02 = handler;
        this.A01 = j;
        this.A00 = i;
        handler.postDelayed(s6s, j);
        this.A07 = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 6, list:
          (r304v3 ??) from 0x0064: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:9:0x0015, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:X.Qxx) from 0x0028: IPUT (r302v0 ?? I:java.lang.String), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A03 java.lang.String
          (r304v3 ?? I:X.Qxx) from 0x0048: IPUT (r0v50 ?? I:X.4Bz), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A02 X.4Bz
          (r304v3 ?? I:X.Qxx) from 0x0053: IPUT (r1v11 ?? I:int), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A00 int
          (r304v3 ?? I:X.Qxx) from 0x0058: IPUT (r1v12 ?? I:int), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A01 int
          (r304v3 ?? I:java.lang.Object) from 0x005e: INVOKE (r0v4 ?? I:java.util.Map), (r302v0 ?? I:java.lang.Object), (r304v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00da, MD:(K, V):V (c)]
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
    public boolean BWj(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 6, list:
          (r304v3 ??) from 0x0064: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:9:0x0015, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:X.Qxx) from 0x0028: IPUT (r302v0 ?? I:java.lang.String), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A03 java.lang.String
          (r304v3 ?? I:X.Qxx) from 0x0048: IPUT (r0v50 ?? I:X.4Bz), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A02 X.4Bz
          (r304v3 ?? I:X.Qxx) from 0x0053: IPUT (r1v11 ?? I:int), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A00 int
          (r304v3 ?? I:X.Qxx) from 0x0058: IPUT (r1v12 ?? I:int), (r304v3 ?? I:X.Qxx) A[Catch: all -> 0x00da] X.Qxx.A01 int
          (r304v3 ?? I:java.lang.Object) from 0x005e: INVOKE (r0v4 ?? I:java.util.Map), (r302v0 ?? I:java.lang.Object), (r304v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00da, MD:(K, V):V (c)]
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
