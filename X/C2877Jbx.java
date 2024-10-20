package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbx, reason: case insensitive filesystem */
/* loaded from: Jbx.class */
public final class C2877Jbx extends LO7 implements MN3 {
    public C2883Jc4 A00 = new C2883Jc4();
    public final MED A01;
    public final C00m A02;

    public C2877Jbx(MED med, C00m c00m) {
        this.A02 = c00m;
        this.A01 = med;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v4 ??, still in use, count: 3, list:
          (r317v4 ??) from 0x0092: PHI (r317v3 ??) = (r317v2 ??), (r317v4 ??) binds: [B:18:0x0078, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r317v4 ?? I:X.KoS) from 0x0088: IPUT (r1v64 ?? I:int), (r317v4 ?? I:X.KoS) A[Catch: all -> 0x03e1] X.KoS.A00 int
          (r317v4 ?? I:java.lang.Object) from 0x008f: INVOKE (r0v141 ?? I:X.L32), (r317v4 ?? I:java.lang.Object) VIRTUAL call: X.L32.A02(java.lang.Object):void A[Catch: all -> 0x03e1, MD:(java.lang.Object):void (m)]
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
    /* JADX WARN: Not initialized variable reg: 311, insn: 0x03e3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r311 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:171:0x03e3 */
    public static final X.C2883Jc4 A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v4 ??, still in use, count: 3, list:
          (r317v4 ??) from 0x0092: PHI (r317v3 ??) = (r317v2 ??), (r317v4 ??) binds: [B:18:0x0078, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r317v4 ?? I:X.KoS) from 0x0088: IPUT (r1v64 ?? I:int), (r317v4 ?? I:X.KoS) A[Catch: all -> 0x03e1] X.KoS.A00 int
          (r317v4 ?? I:java.lang.Object) from 0x008f: INVOKE (r0v141 ?? I:X.L32), (r317v4 ?? I:java.lang.Object) VIRTUAL call: X.L32.A02(java.lang.Object):void A[Catch: all -> 0x03e1, MD:(java.lang.Object):void (m)]
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

    public static MED A01(Object obj) {
        LNr lNr = ((C2877Jbx) obj).A01;
        if (lNr == null) {
            lNr = LNr.A00;
            11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        }
        return lNr;
    }

    @Override // X.MN3
    public C2883Jc4 Afs() {
        Snapshot A00 = LEY.A00();
        L2v A02 = Snapshot.A02(A00, this.A00);
        if (A02 != null) {
            return A00((C2883Jc4) A02, this, A00, this.A02, false);
        }
        throw AnonymousClass001.A0N("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public L2v Amc() {
        return this.A00;
    }

    public void CZ0(L2v l2v) {
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (C2883Jc4) l2v;
    }

    public Object getValue() {
        Function1 A08 = LEY.A00().A08();
        if (A08 != null) {
            A08.invoke(this);
        }
        Snapshot A00 = LEY.A00();
        L2v A02 = Snapshot.A02(A00, this.A00);
        if (A02 != null) {
            return A00((C2883Jc4) A02, this, A00, this.A02, true).A04;
        }
        throw AnonymousClass001.A0N("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public String toString() {
        LEY.A07(this.A00);
        C2883Jc4 c2883Jc4 = (C2883Jc4) LEY.A07(this.A00);
        return 0Pz.A0F(hashCode(), "DerivedState(value=", c2883Jc4.A04(this, LEY.A00()) ? String.valueOf(c2883Jc4.A04) : "<Not calculated>", ")@");
    }
}
