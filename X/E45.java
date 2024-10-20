package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.facebook.graphservice.interfaces.Tree;

/* loaded from: E45.class */
public final class E45 extends FkU implements CallerContextable {
    public static final C0A9 A09;
    public static final CallerContext A0A;
    public static final ContextChain A0B;
    public static final String __redex_internal_original_name = "NTNetworkImage";
    public String A00;
    public CallerContext A01;
    public final C00i A02 = 1BQ.A02(99558);
    public final C00i A03 = 1BQ.A02(99553);
    public final GL7 A04;
    public final FyG A05;
    public final String A06;
    public final C00i A07;
    public final boolean A08;

    static {
        ContextChain contextChain = new ContextChain((ContextChain) null, "i", __redex_internal_original_name);
        A0B = contextChain;
        A0A = new CallerContext(contextChain, E45.class, (String) null, (String) null, (String) null);
        A09 = new C0A9(50);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r304 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00be, code lost:
    
        r301.A06 = r304.getUri();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ca, code lost:
    
        ((X.1iG) r0.get()).A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
    
        if (r304 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E45(X.GL7 r302, X.FyG r303) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E45.<init>(X.GL7, X.FyG):void");
    }

    public static CallerContext A00(ContextChain contextChain, E45 e45) {
        CallerContext callerContext;
        CallerContext callerContext2;
        if (contextChain != null) {
            callerContext = CallerContext.A01(A0A, contextChain);
        } else {
            callerContext = e45.A01;
            if (callerContext == null) {
                FyG fyG = e45.A05;
                if (FJ3.A09(fyG) == null) {
                    callerContext2 = A0A;
                } else {
                    C0A9 c0a9 = A09;
                    callerContext2 = (CallerContext) c0a9.A03(FJ3.A09(fyG));
                    if (callerContext2 == null) {
                        callerContext2 = CallerContext.A02(A0A, A0B, FJ3.A09(fyG));
                        c0a9.A04(FJ3.A09(fyG), callerContext2);
                    }
                }
                e45.A01 = callerContext2;
                return callerContext2;
            }
        }
        return callerContext;
    }

    public static 5SA A01(GL7 gl7, FyG fyG) {
        int i;
        int BDE = gl7.BDE();
        int i2 = 38;
        int i3 = 36;
        int i4 = 45;
        int i5 = 42;
        if (BDE == 50978) {
            i3 = 41;
            i2 = 43;
            i = 44;
            i4 = 42;
            i5 = 45;
        } else {
            i = 40;
            if (BDE != 49843) {
                i = 38;
                i2 = (-1) >>> 1;
                i4 = (-1) >>> 1;
                i5 = (-1) >>> 1;
            }
        }
        int Ad0 = gl7.Ad0(fyG, i3, i4, 7zM.A02(fyG.A00, 2MR.A1g));
        int A00 = GL7.A00(gl7, 0.0f, i2);
        int A002 = GL7.A00(gl7, 0.0f, i);
        int A003 = GL7.A00(gl7, 0.0f, i5);
        if (A00 != 0 || A002 != 0) {
            A003 = Math.max(1, A003);
        } else if (A003 == 0) {
            return null;
        }
        5SA r0 = new 5SA();
        r0.A05(A002, Ad0);
        r0.A02(A00);
        r0.A03(A003);
        return r0;
    }

    public static InterfaceC10344t8 A02(GL7 gl7, int i) {
        Object BI5 = gl7.BI5(i);
        if (BI5 instanceof GMI) {
            return ((GMI) BI5).AqB();
        }
        if (BI5 instanceof BaseModelWithTree) {
            BI5 = F1h.A00((Tree) BI5, C10334t7.class, 537206042);
        } else if (!(BI5 instanceof InterfaceC10344t8)) {
            return null;
        }
        return (InterfaceC10344t8) BI5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v13 ??, still in use, count: 2, list:
          (r312v13 ??) from 0x01ea: PHI (r312v12 ??) = (r312v11 ??), (r312v13 ??) binds: [B:38:0x01cb, B:44:0x01e5] A[DONT_GENERATE, DONT_INLINE]
          (r312v13 ?? I:java.lang.Object) from 0x01e7: INVOKE (r0v92 ?? I:android.util.SparseArray), (r306v0 ?? I:int), (r312v13 ?? I:java.lang.Object) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[Catch: all -> 0x01f0, MD:(int, E):void (c)]
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
    public X.C1rs ACl(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v13 ??, still in use, count: 2, list:
          (r312v13 ??) from 0x01ea: PHI (r312v12 ??) = (r312v11 ??), (r312v13 ??) binds: [B:38:0x01cb, B:44:0x01e5] A[DONT_GENERATE, DONT_INLINE]
          (r312v13 ?? I:java.lang.Object) from 0x01e7: INVOKE (r0v92 ?? I:android.util.SparseArray), (r306v0 ?? I:int), (r312v13 ?? I:java.lang.Object) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[Catch: all -> 0x01f0, MD:(int, E):void (c)]
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
