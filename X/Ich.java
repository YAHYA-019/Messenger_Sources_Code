package X;

import java.util.Iterator;

/* loaded from: Ich.class */
public final class Ich implements JLE {
    public HG3 A00;
    public HzO A01;
    public JMu A02;
    public final I1d A03;

    public Ich(I1d i1d) {
        this.A03 = i1d;
    }

    public void A00(JMu jMu, JMv jMv, JNP jnp) {
        A01(jMu, jMv, jnp, null, null, true, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v31 ??, still in use, count: 17, list:
          (r317v31 ??) from 0x0292: PHI (r317v13 ??) = (r317v12 ??), (r317v31 ??) binds: [B:422:0x0407, B:121:0x028d] A[DONT_GENERATE, DONT_INLINE]
          (r317v31 ?? I:X.HG3) from 0x0216: IPUT (r0v106 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A00 int
          (r317v31 ?? I:X.HG3) from 0x0221: IPUT (r0v486 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A01 int
          (r317v31 ?? I:X.HG3) from 0x022c: IPUT (r0v488 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A07 boolean
          (r317v31 ?? I:X.HG3) from 0x0233: IPUT (r0v0 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A08 boolean
          (r317v31 ?? I:X.HG3) from 0x023e: IPUT (r0v490 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A09 boolean
          (r317v31 ?? I:X.HG3) from 0x0245: IPUT (r0v492 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0A boolean
          (r317v31 ?? I:X.HG3) from 0x024c: IPUT (r0v494 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A06 boolean
          (r317v31 ?? I:X.HG3) from 0x0253: IPUT (r0v496 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A03 int
          (r317v31 ?? I:X.HG3) from 0x025a: IPUT (r0v498 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A02 int
          (r317v31 ?? I:X.HG3) from 0x0261: IPUT (r0v500 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0E float[]
          (r317v31 ?? I:X.HG3) from 0x0268: IPUT (r0v502 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0C float[]
          (r317v31 ?? I:X.HG3) from 0x026f: IPUT (r0v504 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0D float[]
          (r317v31 ?? I:X.HG3) from 0x0276: IPUT (r0v506 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0B float[]
          (r317v31 ?? I:X.HG3) from 0x027d: IPUT (r0v112 ?? I:X.HWs), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A04 X.HWs
          (r317v31 ?? I:X.HG3) from 0x0288: IPUT (r306v0 ?? I:java.lang.Runnable), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A05 java.lang.Runnable
          (r317v31 ?? I:X.HG3) from 0x028f: IPUT (r317v31 ?? I:X.HG3), (r301v0 'this' ?? I:X.Ich A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0a25] X.Ich.A00 X.HG3
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v31 ??, still in use, count: 17, list:
          (r317v31 ??) from 0x0292: PHI (r317v13 ??) = (r317v12 ??), (r317v31 ??) binds: [B:422:0x0407, B:121:0x028d] A[DONT_GENERATE, DONT_INLINE]
          (r317v31 ?? I:X.HG3) from 0x0216: IPUT (r0v106 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A00 int
          (r317v31 ?? I:X.HG3) from 0x0221: IPUT (r0v486 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A01 int
          (r317v31 ?? I:X.HG3) from 0x022c: IPUT (r0v488 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A07 boolean
          (r317v31 ?? I:X.HG3) from 0x0233: IPUT (r0v0 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A08 boolean
          (r317v31 ?? I:X.HG3) from 0x023e: IPUT (r0v490 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A09 boolean
          (r317v31 ?? I:X.HG3) from 0x0245: IPUT (r0v492 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0A boolean
          (r317v31 ?? I:X.HG3) from 0x024c: IPUT (r0v494 ?? I:boolean), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A06 boolean
          (r317v31 ?? I:X.HG3) from 0x0253: IPUT (r0v496 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A03 int
          (r317v31 ?? I:X.HG3) from 0x025a: IPUT (r0v498 ?? I:int), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A02 int
          (r317v31 ?? I:X.HG3) from 0x0261: IPUT (r0v500 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0E float[]
          (r317v31 ?? I:X.HG3) from 0x0268: IPUT (r0v502 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0C float[]
          (r317v31 ?? I:X.HG3) from 0x026f: IPUT (r0v504 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0D float[]
          (r317v31 ?? I:X.HG3) from 0x0276: IPUT (r0v506 ?? I:float[]), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A0B float[]
          (r317v31 ?? I:X.HG3) from 0x027d: IPUT (r0v112 ?? I:X.HWs), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A04 X.HWs
          (r317v31 ?? I:X.HG3) from 0x0288: IPUT (r306v0 ?? I:java.lang.Runnable), (r317v31 ?? I:X.HG3) A[Catch: all -> 0x0a25] X.HG3.A05 java.lang.Runnable
          (r317v31 ?? I:X.HG3) from 0x028f: IPUT (r317v31 ?? I:X.HG3), (r301v0 'this' ?? I:X.Ich A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0a25] X.Ich.A00 X.HG3
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

    public void AAv(JMu jMu) {
        JMu jMu2 = this.A02;
        if (jMu2 != null && jMu2 != jMu) {
            this.A03.A00(HBq.A02);
        }
        this.A02 = jMu;
        Hy0 hy0 = jMu.B76().A01;
        HJQ hjq = Hy0.A0D;
        Object A0d = 1BK.A0d();
        java.util.Map map = hy0.A00;
        Object obj = map.get(hjq);
        if (obj != null) {
            A0d = obj;
        }
        if (AnonymousClass001.A1V(A0d) || this.A01 != null) {
            return;
        }
        HzO hzO = new HzO(hy0);
        HJQ hjq2 = Hy0.A08;
        Object A0d2 = 1BK.A0d();
        Object obj2 = map.get(hjq2);
        if (obj2 != null) {
            A0d2 = obj2;
        }
        hzO.A01 = AnonymousClass001.A1V(A0d2);
        this.A01 = hzO;
    }

    public void AN3() {
        HzO hzO = this.A01;
        if (hzO != null) {
            java.util.Map map = hzO.A04;
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                ((HsY) A1A.next()).A01();
            }
            map.clear();
            this.A01 = null;
        }
        this.A02 = null;
    }

    public void BOo(I9U i9u) {
    }

    public void release() {
    }
}
