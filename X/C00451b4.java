package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b4.class */
public final class C00451b4 extends 1Km implements C0mi {
    public C15h A00;
    public int A01;
    public final SparseArray A02;
    public final C0dr A03;
    public final 3oO A04;
    public final List A05;
    public final boolean A06;
    public final int A07;
    public final C02S A08;

    public C00451b4(C0dr c0dr, C02q c02q, C00441b3 c00441b3, 1Hl r305, Set set, C15h c15h) {
        C02S c02s;
        SparseArray sparseArray = new SparseArray();
        this.A02 = sparseArray;
        this.A03 = c0dr;
        this.A00 = c15h;
        this.A07 = r305.A01;
        boolean z = r305.A0T;
        this.A06 = true;
        this.A04 = z ? new 3oO(c0dr, c02q, c00441b3, r305.A08) : null;
        if (r305.A0H) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC00471b6 interfaceC00471b6 = (InterfaceC00471b6) it.next();
                if (interfaceC00471b6.isEnabled()) {
                    1bY AKq = interfaceC00471b6.AKq();
                    1bZ r0 = new 1bZ(this.A03, AKq);
                    arrayList.add(r0);
                    int i = AKq.A01[0];
                    List list = (List) sparseArray.get(i);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(i, list);
                    }
                    list.add(r0);
                }
            }
            this.A05 = arrayList;
            SparseArray sparseArray2 = this.A02;
            int size = sparseArray2.size() + 2;
            int[] iArr = new int[size];
            iArr[0] = 46333953;
            iArr[1] = 46342759;
            for (int i2 = 2; i2 < size; i2++) {
                iArr[i2] = sparseArray2.keyAt(i2 - 2);
            }
            c02s = new C02S(iArr, null);
        } else {
            this.A05 = Collections.emptyList();
            c02s = C02S.A03;
        }
        this.A08 = c02s;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v3 ??, still in use, count: 9, list:
          (r314v3 ??) from 0x026f: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??) binds: [B:19:0x007b, B:100:0x0267] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ?? I:X.5Cd) from 0x0156: IPUT (r0v165 ?? I:long[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A02 long[]
          (r314v3 ?? I:X.5Cd) from 0x0164: IPUT (r0v168 ?? I:java.lang.String[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A04 java.lang.String[]
          (r314v3 ?? I:X.5Cd) from 0x018b: IGET (r0v226 ?? I:long[]) = (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A02 long[]
          (r314v3 ?? I:X.5Cd) from 0x01c0: IGET (r0v210 ?? I:java.lang.String[]) = (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A04 java.lang.String[]
          (r314v3 ?? I:X.5Cd) from 0x0245: IPUT (r0v186 ?? I:long[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A03 long[]
          (r314v3 ?? I:X.5Cd) from 0x0251: IPUT (r0v189 ?? I:double[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A01 double[]
          (r314v3 ?? I:X.5Cd) from 0x025e: IPUT (r0v192 ?? I:java.lang.String[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A05 java.lang.String[]
          (r314v3 ?? I:java.lang.Object) from 0x0269: INVOKE (r0v90 ?? I:java.util.Map), (r1v39 ?? I:java.lang.Object), (r314v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x033f, MD:(K, V):V (c)]
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
    public static void A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v3 ??, still in use, count: 9, list:
          (r314v3 ??) from 0x026f: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??) binds: [B:19:0x007b, B:100:0x0267] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ?? I:X.5Cd) from 0x0156: IPUT (r0v165 ?? I:long[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A02 long[]
          (r314v3 ?? I:X.5Cd) from 0x0164: IPUT (r0v168 ?? I:java.lang.String[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A04 java.lang.String[]
          (r314v3 ?? I:X.5Cd) from 0x018b: IGET (r0v226 ?? I:long[]) = (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A02 long[]
          (r314v3 ?? I:X.5Cd) from 0x01c0: IGET (r0v210 ?? I:java.lang.String[]) = (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A04 java.lang.String[]
          (r314v3 ?? I:X.5Cd) from 0x0245: IPUT (r0v186 ?? I:long[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A03 long[]
          (r314v3 ?? I:X.5Cd) from 0x0251: IPUT (r0v189 ?? I:double[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A01 double[]
          (r314v3 ?? I:X.5Cd) from 0x025e: IPUT (r0v192 ?? I:java.lang.String[]), (r314v3 ?? I:X.5Cd) A[Catch: all -> 0x033f] X.5Cd.A05 java.lang.String[]
          (r314v3 ?? I:java.lang.Object) from 0x0269: INVOKE (r0v90 ?? I:java.util.Map), (r1v39 ?? I:java.lang.Object), (r314v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x033f, MD:(K, V):V (c)]
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

    public static void A03(C00451b4 c00451b4) {
        ArrayList A00;
        C15h c15h = c00451b4.A00;
        c15h.getClass();
        C02543vf c02543vf = (C02543vf) c15h.get();
        ArrayList arrayList = new ArrayList();
        for (1bZ r0 : c00451b4.A05) {
            String str = r0.A01.A00;
            synchronized (r0) {
                A00 = r0.A00();
                r0.A02.clear();
            }
            arrayList.add(new 4oJ(str, A00));
        }
        c02543vf.A00(arrayList);
        c00451b4.A01 = 0;
        3oO r02 = c00451b4.A04;
        if (r02 != null) {
            r02.A03.execute(new LlM(r02));
        }
    }

    @Override // X.C0mi
    public 02V Au5() {
        return 02V.A01;
    }

    @Override // X.C0mi
    public C02S Au6() {
        return this.A08;
    }

    @Override // X.C0mi
    public void C5i(C03b c03b) {
        synchronized (this) {
            A02(c03b, this);
        }
    }

    @Override // X.C0mi
    public String getName() {
        return "local_aggregation";
    }
}
