package com.facebook.messaging.msys.core;

import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Kd;
import X.1Lo;
import X.1MV;
import X.1TC;
import X.1Tf;
import X.3aB;
import X.5Q2;
import X.C00i;
import X.C1zL;
import X.C5fm;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: MsysMultiCacheAdapter.class */
public final class MsysMultiCacheAdapter implements 1Tf {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A04;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0C;
    public final C00i A05 = new 1BQ(16688);
    public final C00i A06 = new 1BQ(16680);
    public final C00i A02 = new 1BQ(66266);
    public final C00i A0B = new 1BV((1BY) null, 16671);
    public final C00i A03 = new 1BQ(65755);
    public final C00i A0A = new 1BV((1BY) null, 116182);

    public MsysMultiCacheAdapter(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A08 = new 1MV(fbUserSession, (1BY) null, 68485);
        this.A0C = new 1MV(fbUserSession, (1BY) null, 115024);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 49879);
        this.A09 = new 1MV(fbUserSession, (1BY) null, 16682);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 33148);
    }

    public static Parcelable A00(1TC r301, String str) {
        Parcelable parcelable = r301.A00.getParcelable(str);
        parcelable.getClass();
        return parcelable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    private OperationResult A01(ThreadKey threadKey, C1zL c1zL, ImmutableList immutableList) {
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                try {
                    1Kd.A00(builderWithExpectedSize.build()).get();
                    return OperationResult.A00;
                } catch (InterruptedException | ExecutionException e) {
                    return new OperationResult(e);
                }
            }
            UserKey userKey = (UserKey) immutableList.get(i2);
            ?? obj = new Object();
            ((5Q2) this.A08.get()).A06(threadKey, c1zL, new 3aB(threadKey, this, userKey, (SettableFuture) obj), 1BK.A0n(userKey.id), (Long) null);
            builderWithExpectedSize.m11011add((Object) obj);
            i = i2 + 1;
        }
    }

    public static 5Q2 A02(MsysMultiCacheAdapter msysMultiCacheAdapter) {
        return (5Q2) msysMultiCacheAdapter.A08.get();
    }

    public static C5fm A03(5Q2 r301) {
        return (C5fm) r301.A02.get();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v41 ??, still in use, count: 3, list:
          (r310v41 ??) from 0x1df4: PHI (r310v42 ??) = (r310v41 ??), (r310v45 ??) binds: [B:221:0x1db7, B:188:0x1def] A[DONT_GENERATE, DONT_INLINE]
          (r310v41 ?? I:com.google.common.util.concurrent.SettableFuture) from 0x1d98: INVOKE 
          (r0v2375 ?? I:X.CxV)
          (r0v2360 ?? I:X.5fm)
          (r310v41 ?? I:com.google.common.util.concurrent.SettableFuture)
          (r0v2372 ?? I:long)
          (r0v2374 ?? I:long)
         DIRECT call: X.CxV.<init>(X.5fm, com.google.common.util.concurrent.SettableFuture, long, long):void A[Catch: InterruptedException | ExecutionException -> 0x1e4e, InterruptedException | ExecutionException -> 0x1e4e]
          (r310v41 ?? I:X.1FX) from 0x1db9: INVOKE (r310v41 ?? I:X.1FX), (r0v2378 ?? I:java.lang.Runnable), (r0v2380 ?? I:java.util.concurrent.Executor) VIRTUAL call: X.1FX.addListener(java.lang.Runnable, java.util.concurrent.Executor):void A[Catch: InterruptedException | ExecutionException -> 0x1e4e, InterruptedException | ExecutionException -> 0x1e4e]
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
    public com.facebook.fbservice.service.OperationResult BMR(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v41 ??, still in use, count: 3, list:
          (r310v41 ??) from 0x1df4: PHI (r310v42 ??) = (r310v41 ??), (r310v45 ??) binds: [B:221:0x1db7, B:188:0x1def] A[DONT_GENERATE, DONT_INLINE]
          (r310v41 ?? I:com.google.common.util.concurrent.SettableFuture) from 0x1d98: INVOKE 
          (r0v2375 ?? I:X.CxV)
          (r0v2360 ?? I:X.5fm)
          (r310v41 ?? I:com.google.common.util.concurrent.SettableFuture)
          (r0v2372 ?? I:long)
          (r0v2374 ?? I:long)
         DIRECT call: X.CxV.<init>(X.5fm, com.google.common.util.concurrent.SettableFuture, long, long):void A[Catch: InterruptedException | ExecutionException -> 0x1e4e, InterruptedException | ExecutionException -> 0x1e4e]
          (r310v41 ?? I:X.1FX) from 0x1db9: INVOKE (r310v41 ?? I:X.1FX), (r0v2378 ?? I:java.lang.Runnable), (r0v2380 ?? I:java.util.concurrent.Executor) VIRTUAL call: X.1FX.addListener(java.lang.Runnable, java.util.concurrent.Executor):void A[Catch: InterruptedException | ExecutionException -> 0x1e4e, InterruptedException | ExecutionException -> 0x1e4e]
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
