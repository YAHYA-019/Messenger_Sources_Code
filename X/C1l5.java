package X;

import android.os.HandlerThread;

/* renamed from: X.1l5, reason: invalid class name */
/* loaded from: 1l5.class */
public final class C1l5 implements 1RP {
    public 1lU A00;
    public 1lU A01;
    public final 1RL A02;
    public final 1KT A03;
    public final 1KT A04;
    public final C1Qs A05;
    public final 1Nu A06;
    public final C1l4 A07;
    public final C1l6 A08;

    public C1l5(HandlerThread handlerThread, 1RL r303, 1KT r304, 1KT r305, C1O1 c1o1, C1Qs c1Qs, 1Nu r308, C1l4 c1l4) {
        this.A08 = new C1l6(handlerThread.getLooper(), c1o1, this);
        this.A04 = r304;
        this.A03 = r305;
        this.A07 = c1l4;
        this.A05 = c1Qs;
        this.A06 = r308;
        this.A02 = r303;
    }

    public void Bgk(1Sv r302) {
        C1l6 c1l6 = this.A08;
        String str = r302 != null ? r302.A02 : null;
        C1l6.A03(c1l6);
        c1l6.sendMessage(c1l6.obtainMessage(4, str));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v7 ??, still in use, count: 2, list:
          (r304v7 ??) from 0x0039: PHI (r304v5 ??) = (r304v4 ??), (r304v7 ??) binds: [B:8:0x0029, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
          (r304v7 ?? I:java.util.Stack) from 0x0036: IPUT (r304v7 ?? I:java.util.Stack), (r0v1 ?? I:X.1l6) A[Catch: all -> 0x0050] X.1l6.A02 java.util.Stack
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
    public void CZE(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v7 ??, still in use, count: 2, list:
          (r304v7 ??) from 0x0039: PHI (r304v5 ??) = (r304v4 ??), (r304v7 ??) binds: [B:8:0x0029, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
          (r304v7 ?? I:java.util.Stack) from 0x0036: IPUT (r304v7 ?? I:java.util.Stack), (r0v1 ?? I:X.1l6) A[Catch: all -> 0x0050] X.1l6.A02 java.util.Stack
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

    public void CZF(C1ke c1ke) {
        boolean z;
        C1l6 c1l6 = this.A08;
        String str = c1ke.A05;
        String str2 = c1ke.A06;
        07S r0 = c1ke.A03;
        C1l6.A04(c1l6, r0, "event.queued", str, str2);
        C1l5 c1l5 = c1l6.A06;
        if (!c1l5.A05.AjW()) {
            c1l6.sendMessage(c1l6.obtainMessage(1, 1, 0, c1ke));
            return;
        }
        long j = c1ke.A00;
        synchronized (c1l6.A05) {
            C3R2 c3r2 = c1l6.A01;
            if (c3r2 == null || c3r2.A05 || c3r2.A08.length <= c3r2.A02 || c3r2.A09.length <= c3r2.A01) {
                int A82 = c1l5.A06.A82();
                synchronized (C3R2.A0B) {
                    try {
                        c3r2 = C3R2.A0A;
                        if (c3r2 != null) {
                            C3R2.A0A = c3r2.A03;
                            c3r2.A03 = null;
                        } else {
                            new C3R2(A82);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                c1l6.A01 = c3r2;
                z = true;
            } else {
                z = false;
            }
            if (!c3r2.A05) {
                07S[] r02 = c3r2.A08;
                int length = r02.length;
                int i = c3r2.A02;
                if (length > i) {
                    07S[] r03 = c3r2.A09;
                    int length2 = r03.length;
                    int i2 = c3r2.A01;
                    if (length2 > i2) {
                        if (j == -2 || j == -4) {
                            r03[i2] = r0;
                            c3r2.A06[i2] = j;
                            c3r2.A01 = i2 + 1;
                            c3r2.A04 = true;
                        } else {
                            r02[i] = r0;
                            c3r2.A07[i] = j;
                            c3r2.A02 = i + 1;
                        }
                        if (z) {
                            c1l6.sendMessage(c1l6.obtainMessage(1, 2, 0, c3r2));
                        }
                    }
                }
            }
            th = AnonymousClass001.A0N("Batch cannot accept more events");
            throw th;
        }
    }

    public void D1y(1kY r302) {
        C1l6 c1l6 = this.A08;
        C1l6.A03(c1l6);
        C0k4.A01("Cannot start a session with null batchSession", r302);
        c1l6.sendMessage(c1l6.obtainMessage(3, r302));
    }

    public void D5D() {
        C1l6 c1l6 = this.A08;
        C1l6.A03(c1l6);
        c1l6.sendMessage(c1l6.obtainMessage(9));
    }
}
