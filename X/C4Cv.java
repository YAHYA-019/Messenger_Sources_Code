package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4Cv, reason: invalid class name */
/* loaded from: 4Cv.class */
public final class C4Cv {
    public static final C4Cv A00 = new Object();

    public static final 2Q8 A00(1Iw r301, Exception exc) {
        11T.A0F(exc, 1);
        return exc instanceof 2Q8 ? (2Q8) exc : new 2Q8(r301, (String) null, (String) null, exc);
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.3KK, java.lang.Object] */
    public static final void A01(1LI r301, 1Iw r302, Exception exc) {
        Exception exc2;
        1Im A04 = r302.A04();
        11T.A0A(A04);
        1Im r307 = null;
        if (exc instanceof C53x) {
            C53x c53x = (C53x) exc;
            exc2 = c53x.original;
            r307 = c53x.lastHandler;
        } else {
            exc2 = exc;
            if (exc instanceof 2Q8) {
                r307 = ((2Q8) exc).lastHandler;
            }
        }
        2Q8 A002 = A00(r302, exc2);
        String valueOf = String.valueOf(r301.A0a());
        11T.A0F(valueOf, 0);
        A002.componentNameLayoutStack.add(valueOf);
        if (r307 == A04) {
            A002.lastHandler = r307;
            throw A002;
        }
        if (A04 instanceof 1Il) {
            ((1Il) A04).A02(r302, A002);
            throw 0Q8.createAndThrow();
        }
        try {
            11T.A0F(exc2, 1);
            ?? obj = new Object();
            ((3KK) obj).A01 = exc2;
            ((3KK) obj).A00 = r302;
            A02(r302, obj);
        } catch (C53x unused) {
            A002.lastHandler = A04;
            throw A002;
        }
    }

    public static final void A02(1Iw r301, 3KK r302) {
        11T.A0H(r301, r302);
        1Im A04 = r301.A04();
        11T.A0A(A04);
        A04.A00(r302);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v7 ??, still in use, count: 2, list:
          (r303v7 ??) from 0x01aa: PHI (r303v4 ??) = (r303v3 ??), (r303v7 ??) binds: [B:125:0x01a6, B:108:0x018f] A[DONT_GENERATE, DONT_INLINE]
          (r303v7 ?? I:X.3KK) from 0x0191: IPUT (r0v16 ?? I:java.lang.Exception), (r303v7 ?? I:X.3KK) A[Catch: Exception -> 0x01bc, all -> 0x01cd, 53x -> 0x01d7] X.3KK.A01 java.lang.Exception
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
    public static final void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v7 ??, still in use, count: 2, list:
          (r303v7 ??) from 0x01aa: PHI (r303v4 ??) = (r303v3 ??), (r303v7 ??) binds: [B:125:0x01a6, B:108:0x018f] A[DONT_GENERATE, DONT_INLINE]
          (r303v7 ?? I:X.3KK) from 0x0191: IPUT (r0v16 ?? I:java.lang.Exception), (r303v7 ?? I:X.3KK) A[Catch: Exception -> 0x01bc, all -> 0x01cd, 53x -> 0x01d7] X.3KK.A01 java.lang.Exception
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

    public static final void A04(Exception exc) {
        11T.A0F(exc, 0);
        if (exc instanceof C53x) {
            A04(((C53x) exc).original);
            throw null;
        }
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException(exc);
        }
        throw exc;
    }

    public static final boolean A05(1LI r301, 1LI r302, boolean z) {
        if (r301 == r302) {
            return true;
        }
        if (r301 == null || r302 == null) {
            return false;
        }
        return ((r301 instanceof C1rj) && (r302 instanceof C1rj)) ? r301.A0i(r302, z) : r301.A0f(r302);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ef, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x038c, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x009a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x038c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(java.lang.Object r301, java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Cv.A06(java.lang.Object, java.lang.Object):boolean");
    }

    private final boolean A07(Collection collection, Collection collection2, int i) {
        boolean A07;
        if (i < 1) {
            throw AnonymousClass001.A0L("Level cannot be < 1");
        }
        if (collection != collection2) {
            if (collection == null || collection2 == null || collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (i == 1) {
                    Object next = it.next();
                    11T.A0I(next, "null cannot be cast to non-null type com.facebook.litho.Component");
                    A07 = ((1LI) next).A0f((1LI) it2.next());
                } else {
                    A07 = A07((Collection) it.next(), (Collection) it2.next(), i - 1);
                }
                if (!A07) {
                    return false;
                }
            }
        }
        return true;
    }
}
