package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1fj, reason: invalid class name */
/* loaded from: 1fj.class */
public final class C1fj {
    public Runnable A00;
    public Runnable A01;
    public Runnable A02;
    public final C00i A0E = new 1BQ(67765);
    public final C00i A0F = new 1BQ(16456);
    public final C00i A05 = new 1BQ(16662);
    public final C00i A06 = new 1BV(16453);
    public final WeakHashMap A0D = new WeakHashMap();
    public boolean A03 = false;
    public final Object A08 = new Object();
    public final WeakHashMap A0B = new WeakHashMap();
    public final WeakHashMap A0C = new WeakHashMap();
    public final Object A07 = new Object();
    public final C00i A04 = new 1BV(16466);
    public final Set A09 = 1Bi.A06(74);
    public final Set A0A = 1Bi.A06(75);

    public C1fj() {
        this.A05.get();
        if (1Bi.A03(83604) == C0et.A0C) {
            for (1FQ r0 : this.A09) {
                synchronized (this.A08) {
                    ((ExecutorService) this.A04.get()).execute(new 3hY(this, r0, AnonymousClass001.A1O(this.A0D.isEmpty() ? 1 : 0)));
                }
            }
            if (this.A0A.isEmpty()) {
                return;
            }
            synchronized (this.A08) {
                ((ExecutorService) this.A04.get()).execute(new Runnable() { // from class: X.3eg
                    public static final String __redex_internal_original_name = "BusySignalHandler$1";

                    @Override // java.lang.Runnable
                    public void run() {
                        C1fj c1fj = C1fj.this;
                        synchronized (c1fj.A07) {
                            Iterator it = c1fj.A0A.iterator();
                            while (it.hasNext()) {
                                c1fj.A0C.put((1FR) it.next(), null);
                            }
                        }
                    }
                });
            }
        }
    }

    public void A00(ListenableFuture listenableFuture, Integer num) {
        final Object obj = new Object();
        A01(num, obj);
        listenableFuture.addListener(new Runnable() { // from class: X.2rn
            public static final String __redex_internal_original_name = "BusySignalHandler$2";

            @Override // java.lang.Runnable
            public void run() {
                C1fj.this.A02(obj);
            }
        }, (Executor) this.A0F.get());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v11 ??, still in use, count: 2, list:
          (r308v11 ??) from 0x0131: PHI (r308v10 ??) = (r308v9 ??), (r308v11 ??) binds: [B:45:0x011d, B:49:0x012c] A[DONT_GENERATE, DONT_INLINE]
          (r308v11 ?? I:java.lang.Runnable) from 0x012e: IPUT (r308v11 ?? I:java.lang.Runnable), (r301v0 'this' ?? I:X.1fj A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0142] X.1fj.A01 java.lang.Runnable
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v11 ??, still in use, count: 2, list:
          (r308v11 ??) from 0x0131: PHI (r308v10 ??) = (r308v9 ??), (r308v11 ??) binds: [B:45:0x011d, B:49:0x012c] A[DONT_GENERATE, DONT_INLINE]
          (r308v11 ?? I:java.lang.Runnable) from 0x012e: IPUT (r308v11 ?? I:java.lang.Runnable), (r301v0 'this' ?? I:X.1fj A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0142] X.1fj.A01 java.lang.Runnable
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

    public void A02(Object obj) {
        obj.getClass();
        0fH.A0g(obj, "BusySignalHandler", "endSignal: key = %s");
        this.A05.get();
        if (1Bi.A03(83604) == C0et.A0C) {
            A03(obj);
        } else {
            ((1FP) this.A0E.get()).CfJ(obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v12 ??, still in use, count: 2, list:
          (r304v12 ??) from 0x00a2: PHI (r304v11 ??) = (r304v10 ??), (r304v12 ??) binds: [B:38:0x0091, B:42:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r304v12 ?? I:java.lang.Runnable) from 0x009f: IPUT (r304v12 ?? I:java.lang.Runnable), (r301v0 'this' ?? I:X.1fj A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x00f7] X.1fj.A00 java.lang.Runnable
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
    public void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v12 ??, still in use, count: 2, list:
          (r304v12 ??) from 0x00a2: PHI (r304v11 ??) = (r304v10 ??), (r304v12 ??) binds: [B:38:0x0091, B:42:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r304v12 ?? I:java.lang.Runnable) from 0x009f: IPUT (r304v12 ?? I:java.lang.Runnable), (r301v0 'this' ?? I:X.1fj A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x00f7] X.1fj.A00 java.lang.Runnable
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
