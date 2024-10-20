package com.facebook.messaging.montage.omnistore;

import X.0WH;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Lo;
import X.1Uv;
import X.6uX;
import X.7zL;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.C00i;
import X.CNI;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.store.converter.MontageFBConverter;
import java.util.Set;

/* loaded from: MontageOmnistoreCacheUpdater.class */
public final class MontageOmnistoreCacheUpdater implements CallerContextable {
    public 1BY A03;
    public final FbUserSession A04;
    public final C00i A05;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final CNI A0C;
    public final 6uX A0D;
    public final C00i A0E;
    public final MontageFBConverter A0F;
    public final 1Uv A0B = AbJ.A0M();
    public final C00i A06 = 1BQ.A02(17085);
    public Set A02 = new 0WH(0);
    public Set A00 = new 0WH(0);
    public Set A01 = new 0WH(0);

    public MontageOmnistoreCacheUpdater(1BO r302, FbUserSession fbUserSession) {
        this.A03 = 7zL.A0Q(r302);
        this.A04 = fbUserSession;
        Context A00 = FbInjector.A00();
        this.A0F = (MontageFBConverter) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85185);
        this.A08 = AbF.A0Q(A00, 66579);
        this.A05 = AbF.A0A(fbUserSession, (1BY) null, 17064);
        this.A0C = (CNI) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85180);
        this.A0D = (6uX) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85200);
        this.A07 = AbF.A0A(fbUserSession, (1BY) null, 17038);
        this.A09 = AbF.A0A(fbUserSession, (1BY) null, 85189);
        this.A0A = AbF.A0A(fbUserSession, (1BY) null, 85184);
        this.A0E = AbH.A0U();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v0 ??, still in use, count: 8, list:
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ?? I:X.BuZ) from 0x011b: IGET (r0v37 ?? I:java.lang.Boolean) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A04 java.lang.Boolean
          (r319v0 ?? I:X.BuZ) from 0x0142: IGET (r0v68 ?? I:long) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A00 long
          (r319v0 ?? I:X.BuZ) from 0x016f: IGET (r0v81 ?? I:com.facebook.messaging.montage.model.MontageBucketInfo) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A01 com.facebook.messaging.montage.model.MontageBucketInfo
          (r319v0 ?? I:X.BuZ) from 0x022a: INVOKE (r0v100 ?? I:X.C7z), (r319v0 ?? I:X.BuZ) VIRTUAL call: X.C7z.A01(X.BuZ):void A[Catch: all -> 0x02a4, MD:(X.BuZ):void (m)]
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
    public static X.BuZ A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v0 ??, still in use, count: 8, list:
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ??) from 0x0265: PHI (r319v1 ??) = (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v0 ??), (r319v2 ??) binds: [B:43:0x0127, B:47:0x0137, B:53:0x0150, B:57:0x0160, B:121:0x0260] A[DONT_GENERATE, DONT_INLINE]
          (r319v0 ?? I:X.BuZ) from 0x011b: IGET (r0v37 ?? I:java.lang.Boolean) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A04 java.lang.Boolean
          (r319v0 ?? I:X.BuZ) from 0x0142: IGET (r0v68 ?? I:long) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A00 long
          (r319v0 ?? I:X.BuZ) from 0x016f: IGET (r0v81 ?? I:com.facebook.messaging.montage.model.MontageBucketInfo) = (r319v0 ?? I:X.BuZ) A[Catch: all -> 0x02a4] X.BuZ.A01 com.facebook.messaging.montage.model.MontageBucketInfo
          (r319v0 ?? I:X.BuZ) from 0x022a: INVOKE (r0v100 ?? I:X.C7z), (r319v0 ?? I:X.BuZ) VIRTUAL call: X.C7z.A01(X.BuZ):void A[Catch: all -> 0x02a4, MD:(X.BuZ):void (m)]
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
}
