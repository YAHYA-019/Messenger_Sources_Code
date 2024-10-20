package X;

import com.facebook.inject.FbInjector;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1va, reason: invalid class name */
/* loaded from: 1va.class */
public final class C1va {
    public 06Z A00;
    public WeakReference A01;
    public WeakReference A02;
    public boolean A03;
    public C1vn A04;
    public volatile GLk A0I;
    public final C15h A0F = new C3j6(2);
    public final C00i A0C = new 1BV(16430);
    public final C00i A06 = new 1BQ(49736);
    public final C00i A0A = new 1BQ(33013);
    public final C00i A09 = new 1BQ(99390);
    public final C00i A05 = new 1BQ(16458);
    public final C00i A08 = new 1BQ(100325);
    public final C00i A0D = new 1BQ(16520);
    public final C00i A07 = new 1BQ(99940);
    public final C00i A0G = new 1BV(16454);
    public final C00i A0B = new 1BQ(66351);
    public final C00i A0H = new 1BV(320);
    public final C00i A0E = new 1HH(FbInjector.A00(), 99435);

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x0060: PHI (r302v1 ??) = (r302v0 ??), (r302v4 ??) binds: [B:2:0x0006, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:X.1vn) from 0x005d: IPUT (r302v4 ?? I:X.1vn), (r301v0 ?? I:X.1va) X.1va.A04 X.1vn
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
    public static X.C1vn A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v4 ??, still in use, count: 2, list:
          (r302v4 ??) from 0x0060: PHI (r302v1 ??) = (r302v0 ??), (r302v4 ??) binds: [B:2:0x0006, B:8:0x0053] A[DONT_GENERATE, DONT_INLINE]
          (r302v4 ?? I:X.1vn) from 0x005d: IPUT (r302v4 ?? I:X.1vn), (r301v0 ?? I:X.1va) X.1va.A04 X.1vn
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

    public static void A01(final C1va c1va) {
        0fH.A0n("RageShakeDetector", "maybeDisableDetector");
        ((1GU) c1va.A05.get()).AAs();
        if (c1va.A02 == null && c1va.A01 == null) {
            ((Executor) c1va.A0G.get()).execute(new Runnable() { // from class: X.3os
                public static final String __redex_internal_original_name = "RageShakeDetector$$ExternalSyntheticLambda4";

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    C1va c1va2 = C1va.this;
                    0fH.A0n("RageShakeDetector", "disableDetector");
                    if (c1va2.A03) {
                        c1va2.A03 = false;
                        C1vn A00 = C1va.A00(c1va2);
                        if (!A00.A01) {
                            throw AnonymousClass001.A0N("Already disabled");
                        }
                        A00.A01 = false;
                        0fH.A0n("RageShakeAsyncSensorRegistration", "stopReceiving");
                        Future future = A00.A00;
                        if (future != null) {
                            future.cancel(false);
                        }
                        A00.A00 = ((ScheduledExecutorService) A00.A05.get()).schedule(A00.A06, 2, TimeUnit.SECONDS);
                        str = "Disabled";
                    } else {
                        str = "disableDetector: already disabled";
                    }
                    0fH.A0n("RageShakeDetector", str);
                }
            });
        } else {
            0fH.A0n("RageShakeDetector", "maybeDisableDetector: context present");
        }
    }

    public static void A02(final C1va c1va) {
        0fH.A0n("RageShakeDetector", "maybeEnableDetector");
        ((1GU) c1va.A05.get()).AAs();
        if (c1va.A03) {
            0fH.A0n("RageShakeDetector", "maybeEnableDetector: already enabled");
        } else {
            ((Executor) c1va.A0G.get()).execute(new Runnable() { // from class: X.1vb
                public static final String __redex_internal_original_name = "RageShakeDetector$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String str2;
                    C1va c1va2 = C1va.this;
                    if (((Boolean) c1va2.A0F.get()).booleanValue()) {
                        str = "RageShakeDetector";
                        if (c1va2.A03) {
                            str2 = "setupOnRageShakeEnabled: already enabled";
                        } else if (c1va2.A02 == null && c1va2.A01 == null) {
                            str2 = "setupOnRageShakeEnabled: no context";
                        } else {
                            c1va2.A03 = true;
                            C1vn A00 = C1va.A00(c1va2);
                            if (A00.A01) {
                                throw AnonymousClass001.A0N("Already enabled");
                            }
                            A00.A01 = true;
                            0fH.A0n("RageShakeAsyncSensorRegistration", "startReceiving");
                            Future future = A00.A00;
                            if (future != null) {
                                future.cancel(false);
                            }
                            A00.A00 = ((ExecutorService) A00.A05.get()).submit(A00.A06);
                            str2 = "Enabled";
                        }
                    } else {
                        str = "RageShakeDetector";
                        str2 = "maybeEnableDetector: RageShake not available (async path)";
                    }
                    0fH.A0n(str, str2);
                }
            });
        }
    }
}
