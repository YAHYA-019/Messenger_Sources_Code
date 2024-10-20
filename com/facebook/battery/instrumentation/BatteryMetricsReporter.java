package com.facebook.battery.instrumentation;

import X.0Lm;
import X.0NZ;
import X.0OE;
import X.1BQ;
import X.1BV;
import X.1CO;
import X.1HH;
import X.6AI;
import X.C00i;
import X.C05624ed;
import X.C1Ur;
import X.C5b7;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: BatteryMetricsReporter.class */
public final class BatteryMetricsReporter implements Runnable {
    public static final long A0P = TimeUnit.SECONDS.toMillis(3);
    public Context A00;
    public 6AI A01;
    public 0NZ A02;
    public 0Lm A03;
    public C5b7 A04;
    public C5b7 A05;
    public C5b7 A06;
    public 0OE A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public final C00i A0D;
    public final C00i A0F;
    public final C00i A0G;
    public final int A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public volatile CountDownLatch A0N;
    public volatile boolean A0O;
    public final C00i A0H = FbInjector.A00;
    public final C00i A0C = new 1BQ(67199);
    public final C00i A0E = new 1BV(49798);

    public BatteryMetricsReporter() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A0L = new 1HH(A00, 65731);
        this.A0M = new 1BQ(16465);
        this.A0K = new 1BQ(16960);
        1BQ r0 = new 1BQ(49192);
        this.A0G = r0;
        this.A0F = new 1BQ(49791);
        this.A0J = new 1BQ(16616);
        this.A0B = 10;
        this.A0N = new CountDownLatch(0);
        this.A0O = false;
        this.A0A = false;
        this.A08 = false;
        this.A09 = false;
        this.A0D = new 1BQ(49759);
        this.A0I = C1Ur.A00((1CO) ((C05624ed) r0.get()).A00.get(), 600, 36592331089117844L);
    }

    public static void A00(BatteryMetricsReporter batteryMetricsReporter) {
        synchronized (batteryMetricsReporter) {
            batteryMetricsReporter.A0O = true;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v39 ??, still in use, count: 2, list:
          (r316v39 ??) from 0x0716: PHI (r316v38 ??) = (r316v37 ??), (r316v39 ??) binds: [B:248:0x0731, B:241:0x0712] A[DONT_GENERATE, DONT_INLINE]
          (r316v39 ?? I:X.0Ht) from 0x0713: INVOKE (r316v39 ?? I:X.0Ht), (r0v471 ?? I:X.0Ht) VIRTUAL call: X.0Ht.A0D(X.0Ht):void A[Catch: all -> 0x0a8c]
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
    public static void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v39 ??, still in use, count: 2, list:
          (r316v39 ??) from 0x0716: PHI (r316v38 ??) = (r316v37 ??), (r316v39 ??) binds: [B:248:0x0731, B:241:0x0712] A[DONT_GENERATE, DONT_INLINE]
          (r316v39 ?? I:X.0Ht) from 0x0713: INVOKE (r316v39 ?? I:X.0Ht), (r0v471 ?? I:X.0Ht) VIRTUAL call: X.0Ht.A0D(X.0Ht):void A[Catch: all -> 0x0a8c]
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

    /* JADX WARN: Code restructure failed: missing block: B:160:0x021d, code lost:
    
        if (r311 == null) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0270  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.battery.instrumentation.BatteryMetricsReporter.run():void");
    }
}
