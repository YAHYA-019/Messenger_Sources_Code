package X;

import android.os.Handler;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.46v, reason: invalid class name */
/* loaded from: 46v.class */
public final class C46v {
    public static final WeakHashMap A04 = new WeakHashMap();
    public final Handler A00;
    public final Printer A01 = new Printer() { // from class: X.4Oi
        @Override // android.util.Printer
        public void println(String str) {
            List list = C46v.this.A02;
            synchronized (list) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < list.size()) {
                        ((1Np) list.get(i2)).C6k(str);
                        i = i2 + 1;
                    }
                }
            }
        }
    };
    public final Runnable A03 = new Runnable() { // from class: X.4Oh
        public static final String __redex_internal_original_name = "LooperLogMessagesDispatcher$2";

        @Override // java.lang.Runnable
        public void run() {
            boolean isEmpty;
            C46v c46v = C46v.this;
            List list = c46v.A02;
            synchronized (list) {
                isEmpty = list.isEmpty();
            }
            c46v.A00.getLooper().setMessageLogging(isEmpty ? null : c46v.A01);
        }
    };
    public final List A02 = new ArrayList();

    public C46v(Handler handler) {
        this.A00 = handler;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0034: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:9:0x0015, B:18:0x002f] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:java.lang.Object) from 0x0030: INVOKE (r0v4 ?? I:java.util.AbstractMap), (r301v0 ?? I:java.lang.Object), (r304v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0038, MD:(K, V):V (c)]
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
    public static X.C46v A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x0034: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:9:0x0015, B:18:0x002f] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:java.lang.Object) from 0x0030: INVOKE (r0v4 ?? I:java.util.AbstractMap), (r301v0 ?? I:java.lang.Object), (r304v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0038, MD:(K, V):V (c)]
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

    public void A01(1Np r302) {
        boolean isEmpty;
        if (r302 != null) {
            List list = this.A02;
            synchronized (list) {
                isEmpty = list.isEmpty();
                list.add(r302);
            }
            if (isEmpty) {
                this.A00.post(this.A03);
            }
        }
    }

    public void A02(1Np r302) {
        boolean isEmpty;
        if (r302 != null) {
            List list = this.A02;
            synchronized (list) {
                list.remove(r302);
                isEmpty = list.isEmpty();
            }
            if (isEmpty) {
                this.A00.post(this.A03);
            }
        }
    }
}
