package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ggn, reason: case insensitive filesystem */
/* loaded from: Ggn.class */
public final class C2539Ggn extends ETq {
    public final AtomicReference A00;
    public final HkU A01;
    public final Ha0 A02;
    public final boolean A03;

    public C2539Ggn(HkU hkU, Ha0 ha0, IEy iEy, boolean z) {
        1BK.A1K(ha0, 2, hkU);
        this.A02 = ha0;
        this.A03 = z;
        this.A01 = hkU;
        this.A00 = GOn.A1L(iEy);
    }

    public void A00() {
        AtomicReference atomicReference = this.A00;
        IEy iEy = (IEy) atomicReference.get();
        if (iEy != null) {
            IEy.A03(iEy);
            iEy.A02.Bn2();
        }
        atomicReference.set(null);
    }

    public void A01(int i) {
        IEy iEy = (IEy) this.A00.get();
        if (iEy != null) {
            Ha0 ha0 = this.A02;
            long j = i;
            long j2 = ha0.A00;
            long uptimeMillis = SystemClock.uptimeMillis();
            ha0.A00 = uptimeMillis;
            long j3 = uptimeMillis - j2;
            ArrayList arrayList = ha0.A01;
            if (7zM.A1b(arrayList)) {
                HtP htP = (HtP) arrayList.get(DKC.A06(arrayList));
                htP.A00 += j;
                htP.A01 += j3;
            }
            HtP htP2 = arrayList.isEmpty() ? null : (HtP) arrayList.get(0);
            long j4 = iEy.A00 + j;
            iEy.A00 = j4;
            JOu jOu = iEy.A02;
            jOu.Bm4(j4);
            jOu.CEI(((float) iEy.A00) / ((float) iEy.A07.A00));
            if (htP2 != null) {
                jOu.CRg(htP2);
            }
        }
    }

    public void A02(Exception exc, java.util.Map map, int i, boolean z) {
        AbK.A1S(exc, map);
        AtomicReference atomicReference = this.A00;
        IEy iEy = (IEy) atomicReference.get();
        if (iEy != null) {
            this.A01.A06.A00(exc);
            IEy.A01(H9V.A03, iEy, exc, "Failed to complete POST request", map, i, IEy.A00(exc), z);
        }
        atomicReference.set(null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v4 ??, still in use, count: 6, list:
          (r318v4 ??) from 0x01df: PHI (r318v2 ??) = (r318v1 ??), (r318v4 ??) binds: [B:168:0x01da, B:103:0x01df] A[DONT_GENERATE, DONT_INLINE]
          (r318v4 ?? I:X.Hh9) from 0x00c4: IPUT (r0v186 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A00 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x00ed: IPUT (r0v181 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A01 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x0110: IPUT (r0v178 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A03 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x0133: IPUT (r0v175 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A02 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x01b9: IPUT (r1v24 ?? I:java.util.HashMap), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A04 java.util.HashMap
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v4 ??, still in use, count: 6, list:
          (r318v4 ??) from 0x01df: PHI (r318v2 ??) = (r318v1 ??), (r318v4 ??) binds: [B:168:0x01da, B:103:0x01df] A[DONT_GENERATE, DONT_INLINE]
          (r318v4 ?? I:X.Hh9) from 0x00c4: IPUT (r0v186 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A00 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x00ed: IPUT (r0v181 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A01 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x0110: IPUT (r0v178 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A03 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x0133: IPUT (r0v175 ?? I:java.lang.String), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A02 java.lang.String
          (r318v4 ?? I:X.Hh9) from 0x01b9: IPUT (r1v24 ?? I:java.util.HashMap), (r318v4 ?? I:X.Hh9) A[Catch: Exception -> 0x01bf, IOException -> 0x01d0, HD7 -> 0x034c] X.Hh9.A04 java.util.HashMap
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
