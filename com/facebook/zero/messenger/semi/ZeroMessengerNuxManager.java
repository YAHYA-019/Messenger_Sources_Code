package com.facebook.zero.messenger.semi;

import X.0LS;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2BQ;
import X.2BS;
import X.2ZE;
import X.DKB;
import android.content.Context;
import android.content.Intent;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.zero.messenger.optin.ui.ZeroMessengerOptinActivity;
import java.util.Random;

/* loaded from: ZeroMessengerNuxManager.class */
public final class ZeroMessengerNuxManager {
    public 2BS A00;
    public final 1Br A0B = 1Bq.A00(16922);
    public final 1Br A03 = 1Bq.A00(16923);
    public final 1Br A01 = 1Bq.A00(99939);
    public final 1Br A07 = 1Bu.A00(16430);
    public final 1Br A09 = 1Bq.A00(98453);
    public final 1Br A04 = 1Bq.A00(16385);
    public final 1Br A05 = 1Bq.A00(16511);
    public final 1Br A06 = 1Bq.A00(84491);
    public final 1Br A02 = 1Bq.A00(33013);
    public final 1Br A08 = 1Bq.A00(115227);
    public final QuickPerformanceLogger A0C = (QuickPerformanceLogger) 1Bi.A03(16520);
    public final Runnable A0A = new 2ZE(this);

    private final int A00(Integer num, String str, int i) {
        String str2;
        int nextInt = new Random().nextInt();
        QuickPerformanceLogger quickPerformanceLogger = this.A0C;
        quickPerformanceLogger.markerStart(i, nextInt);
        switch (num.intValue()) {
            case 0:
                str2 = "FROM_TOKEN_FETCH";
                break;
            case 1:
                str2 = "FROM_APP_INIT";
                break;
            default:
                str2 = "FROM_INBOX_LIFECYCLE";
                break;
        }
        quickPerformanceLogger.markerPoint(i, nextInt, str2);
        quickPerformanceLogger.markerAnnotate(i, nextInt, "nux_type", str);
        return nextInt;
    }

    public static final 2BQ A01(ZeroMessengerNuxManager zeroMessengerNuxManager) {
        return (2BQ) zeroMessengerNuxManager.A0B.A00.get();
    }

    private final void A02(Context context, Integer num, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ZeroMessengerOptinActivity.class);
        intent.putExtra("extra_feature_qpl_instance_key", String.valueOf(A00(num, str, 238958692)));
        intent.putExtra("extra_feature", str);
        intent.putExtra(DKB.A00(370), str2);
        0LS.A0A(context, intent);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v10 ??, still in use, count: 3, list:
          (r309v10 ??) from 0x00dd: PHI (r309v9 ??) = (r309v1 ??), (r309v10 ??) binds: [B:204:0x0199, B:43:0x00d7] A[DONT_GENERATE, DONT_INLINE]
          (r309v10 ?? I:android.content.Intent) from 0x00cb: INVOKE (r309v10 ?? I:android.content.Intent), (r0v237 ?? I:java.lang.String), (r0v236 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent A[Catch: all -> 0x044d, MD:(java.lang.String, java.lang.String):android.content.Intent (c)]
          (r309v10 ?? I:android.content.Intent) from 0x00d9: INVOKE (r309v10 ?? I:android.content.Intent), (r0v240 ?? I:java.lang.String), (r0v20 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent A[Catch: all -> 0x044d, MD:(java.lang.String, java.lang.String):android.content.Intent (c)]
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
    public static final void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v10 ??, still in use, count: 3, list:
          (r309v10 ??) from 0x00dd: PHI (r309v9 ??) = (r309v1 ??), (r309v10 ??) binds: [B:204:0x0199, B:43:0x00d7] A[DONT_GENERATE, DONT_INLINE]
          (r309v10 ?? I:android.content.Intent) from 0x00cb: INVOKE (r309v10 ?? I:android.content.Intent), (r0v237 ?? I:java.lang.String), (r0v236 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent A[Catch: all -> 0x044d, MD:(java.lang.String, java.lang.String):android.content.Intent (c)]
          (r309v10 ?? I:android.content.Intent) from 0x00d9: INVOKE (r309v10 ?? I:android.content.Intent), (r0v240 ?? I:java.lang.String), (r0v20 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent A[Catch: all -> 0x044d, MD:(java.lang.String, java.lang.String):android.content.Intent (c)]
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
