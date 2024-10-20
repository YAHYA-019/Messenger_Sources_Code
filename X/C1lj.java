package X;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1lj, reason: invalid class name */
/* loaded from: 1lj.class */
public final class C1lj {
    public static final AtomicInteger A06 = new AtomicInteger(0);
    public 1nK A00;
    public String A02;
    public final C1lh A03;
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();
    public final LinkedList A04 = new LinkedList();
    public boolean A01 = true;

    public C1lj(C1lh c1lh) {
        this.A03 = c1lh;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r320v2 ??, still in use, count: 5, list:
          (r320v2 ??) from 0x01af: PHI (r320v1 ??) = (r320v0 ??), (r320v2 ??), (r320v2 ??) binds: [B:97:0x01aa, B:79:0x0170, B:84:0x0183] A[DONT_GENERATE, DONT_INLINE]
          (r320v2 ??) from 0x01af: PHI (r320v1 ??) = (r320v0 ??), (r320v2 ??), (r320v2 ??) binds: [B:97:0x01aa, B:79:0x0170, B:84:0x0183] A[DONT_GENERATE, DONT_INLINE]
          (r320v2 ?? I:java.lang.Object) from 0x011a: INVOKE (r0v54 ?? I:java.util.LinkedList), (r320v2 ?? I:java.lang.Object) VIRTUAL call: java.util.LinkedList.offer(java.lang.Object):boolean A[Catch: all -> 0x01d1, MD:(E):boolean (c)]
          (r320v2 ?? I:X.4Eh) from 0x0120: IGET (r0v64 ?? I:java.util.concurrent.atomic.AtomicBoolean) = (r320v2 ?? I:X.4Eh) A[Catch: all -> 0x01d1] X.4Eh.A00 java.util.concurrent.atomic.AtomicBoolean
          (r320v2 ?? I:X.4Eh) from 0x013f: INVOKE (r0v69 ?? I:X.4Ei), (r320v2 ?? I:X.4Eh), (r301v0 'this' ?? I:X.1lj A[IMMUTABLE_TYPE, THIS]) DIRECT call: X.4Ei.<init>(X.4Eh, X.1lj):void A[Catch: all -> 0x01d1, MD:(X.4Eh, X.1lj):void (m)]
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
    public final int A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r320v2 ??, still in use, count: 5, list:
          (r320v2 ??) from 0x01af: PHI (r320v1 ??) = (r320v0 ??), (r320v2 ??), (r320v2 ??) binds: [B:97:0x01aa, B:79:0x0170, B:84:0x0183] A[DONT_GENERATE, DONT_INLINE]
          (r320v2 ??) from 0x01af: PHI (r320v1 ??) = (r320v0 ??), (r320v2 ??), (r320v2 ??) binds: [B:97:0x01aa, B:79:0x0170, B:84:0x0183] A[DONT_GENERATE, DONT_INLINE]
          (r320v2 ?? I:java.lang.Object) from 0x011a: INVOKE (r0v54 ?? I:java.util.LinkedList), (r320v2 ?? I:java.lang.Object) VIRTUAL call: java.util.LinkedList.offer(java.lang.Object):boolean A[Catch: all -> 0x01d1, MD:(E):boolean (c)]
          (r320v2 ?? I:X.4Eh) from 0x0120: IGET (r0v64 ?? I:java.util.concurrent.atomic.AtomicBoolean) = (r320v2 ?? I:X.4Eh) A[Catch: all -> 0x01d1] X.4Eh.A00 java.util.concurrent.atomic.AtomicBoolean
          (r320v2 ?? I:X.4Eh) from 0x013f: INVOKE (r0v69 ?? I:X.4Ei), (r320v2 ?? I:X.4Eh), (r301v0 'this' ?? I:X.1lj A[IMMUTABLE_TYPE, THIS]) DIRECT call: X.4Ei.<init>(X.4Eh, X.1lj):void A[Catch: all -> 0x01d1, MD:(X.4Eh, X.1lj):void (m)]
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

    public final void A01() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A05;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            this.A02 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            AnonymousClass001.A1L(this.A05);
            throw th;
        }
    }

    public final void A02(1nK r302, String str) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A05;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = r302;
            this.A02 = str;
            while (true) {
                LinkedList linkedList = this.A04;
                if (linkedList.isEmpty()) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                C4Eh c4Eh = (C4Eh) linkedList.poll();
                StringBuilder sb = new StringBuilder();
                sb.append("Dispatch delayed publish ");
                sb.append(c4Eh);
                0fH.A0j("MqttXplatPublisher", sb.toString());
                if (c4Eh != null && !c4Eh.A04.get() && c4Eh.A00.compareAndSet(true, false) && r302.publish(c4Eh.A03, c4Eh.A05, c4Eh.A02, c4Eh) == -1) {
                    c4Eh.onFailure(0, 0);
                }
            }
        } catch (Throwable th) {
            AnonymousClass001.A1L(this.A05);
            throw th;
        }
    }
}
