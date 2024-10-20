package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ym.class */
public final class C12064ym {
    public 1BY A00;
    public final FbUserSession A01;
    public final C0dp A02;
    public final 4yJ A03;
    public final C00i A04;
    public final C1r2 A05;
    public final C12084yo A06;
    public final C12074yn A07;

    public C12064ym(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        C12074yn c12074yn = (C12074yn) 1Bn.A0E((Context) null, (1BY) null, 49415);
        C12084yo c12084yo = (C12084yo) 1Bn.A0E((Context) null, (1BY) null, 49416);
        4yJ r0 = (4yJ) 1Bi.A03(68336);
        C1r2 c1r2 = (C1r2) 1Bi.A03(66485);
        1Bi.A03(83605);
        this.A01 = fbUserSession;
        this.A02 = c0dp;
        Integer num = 1Lo.A05;
        this.A04 = new 1MV(fbUserSession, (1BY) null, 49346);
        this.A07 = c12074yn;
        this.A06 = c12084yo;
        this.A03 = r0;
        this.A05 = c1r2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v5 ??, still in use, count: 4, list:
          (r310v5 ??) from 0x00f9: PHI (r310v2 ??) = (r310v1 ??), (r310v5 ??) binds: [B:107:0x0141, B:50:0x00f5] A[DONT_GENERATE, DONT_INLINE]
          (r310v5 ?? I:X.BuN) from 0x00e5: IPUT (r0v92 ?? I:boolean), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A02 boolean
          (r310v5 ?? I:X.BuN) from 0x00eb: IPUT (r302v0 ?? I:com.google.common.collect.ImmutableList), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A01 com.google.common.collect.ImmutableList
          (r310v5 ?? I:X.BuN) from 0x00f6: IPUT (r1v13 ?? I:boolean), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A04 boolean
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
    public com.google.common.collect.ImmutableList A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v5 ??, still in use, count: 4, list:
          (r310v5 ??) from 0x00f9: PHI (r310v2 ??) = (r310v1 ??), (r310v5 ??) binds: [B:107:0x0141, B:50:0x00f5] A[DONT_GENERATE, DONT_INLINE]
          (r310v5 ?? I:X.BuN) from 0x00e5: IPUT (r0v92 ?? I:boolean), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A02 boolean
          (r310v5 ?? I:X.BuN) from 0x00eb: IPUT (r302v0 ?? I:com.google.common.collect.ImmutableList), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A01 com.google.common.collect.ImmutableList
          (r310v5 ?? I:X.BuN) from 0x00f6: IPUT (r1v13 ?? I:boolean), (r310v5 ?? I:X.BuN) A[Catch: all -> 0x01ef] X.BuN.A04 boolean
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
