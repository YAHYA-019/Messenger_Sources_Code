package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.2a1, reason: invalid class name */
/* loaded from: 2a1.class */
public abstract class C2a1 implements C2a2 {
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C2a1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C2a1.class, Object.class, "_parentHandle$volatile");

    private final int A00(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        if (obj instanceof C2a5) {
            if (((C2a5) obj).A00) {
                return 0;
            }
            atomicReferenceFieldUpdater = A01;
            obj2 = C2a4.A00;
        } else {
            if (!(obj instanceof 48G)) {
                return 0;
            }
            atomicReferenceFieldUpdater = A01;
            obj2 = ((48G) obj).A00;
        }
        if (!C2am.A00(this, obj, obj2, atomicReferenceFieldUpdater)) {
            return -1;
        }
        A0G();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c7, code lost:
    
        if (r309 != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f8, code lost:
    
        if (r309.A00.BQI(new X.5Tx(r303, r309, r310, r301), false, false) == X.C2a7.A00) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0205, code lost:
    
        r309 = A05(r309);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020e, code lost:
    
        if (r309 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0211, code lost:
    
        r304 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fe, code lost:
    
        if (r304 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0204, code lost:
    
        return X.C2a4.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01fb, code lost:
    
        r304 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0237, code lost:
    
        return A02(r303, r310, r301);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object A01(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.A01(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v2 ??, still in use, count: 2, list:
          (r310v2 ??) from 0x004e: PHI (r310v3 ??) = (r310v1 ??), (r310v2 ??) binds: [B:166:0x00a2, B:162:0x008b] A[DONT_GENERATE, DONT_INLINE]
          (r310v2 ?? I:java.util.AbstractCollection) from 0x008d: INVOKE (r310v2 ?? I:java.util.AbstractCollection), (r0v12 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0327, MD:(E):boolean (c)]
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
    public static final java.lang.Object A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v2 ??, still in use, count: 2, list:
          (r310v2 ??) from 0x004e: PHI (r310v3 ??) = (r310v1 ??), (r310v2 ??) binds: [B:166:0x00a2, B:162:0x008b] A[DONT_GENERATE, DONT_INLINE]
          (r310v2 ?? I:java.util.AbstractCollection) from 0x008d: INVOKE (r310v2 ?? I:java.util.AbstractCollection), (r0v12 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0327, MD:(E):boolean (c)]
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

    public static final String A03(Object obj) {
        String str = "Active";
        if (obj instanceof AnonymousClass451) {
            if (AnonymousClass451.A03.get(obj) != null) {
                str = "Cancelling";
            } else if (AnonymousClass451.A01.get(obj) != 0) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof C2a6)) {
                return obj instanceof C2s6 ? "Cancelled" : "Completed";
            }
            if (!((C2a6) obj).BQN()) {
                return "New";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r307 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Throwable A04(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Throwable
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r302
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = 0
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.A0E()
            r305 = r0
            X.4cX r0 = new X.4cX
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = 0
            r3 = r301
            r0.<init>(r1, r2, r3)
        L26:
            r0 = r302
            return r0
        L28:
            r0 = r302
            X.2a1 r0 = (X.C2a1) r0
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.A0B()
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof X.AnonymousClass451
            r303 = r0
            r0 = 0
            r307 = r0
            r0 = r303
            if (r0 == 0) goto L89
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass451.A03
            r305 = r0
            r0 = r305
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r307 = r0
        L51:
            r0 = r307
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L63
            r0 = r307
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L84
        L63:
            r0 = r306
            java.lang.String r0 = A03(r0)
            r305 = r0
            java.lang.String r0 = "Parent job is "
            r1 = r305
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r305 = r0
            X.4cX r0 = new X.4cX
            r304 = r0
            r0 = r304
            r1 = r305
            r2 = r307
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = r302
            r0.<init>(r1, r2, r3)
        L84:
            r0 = r304
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L89:
            r0 = r306
            boolean r0 = r0 instanceof X.C2s6
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La8
            r0 = r306
            r305 = r0
            r0 = r306
            X.2s6 r0 = (X.C2s6) r0
            r305 = r0
            r0 = r305
            java.lang.Throwable r0 = r0.A00
            r307 = r0
            goto L51
        La8:
            r0 = r306
            boolean r0 = r0 instanceof X.C2a6
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r304 = r0
            r0 = r306
            java.lang.String r1 = "Cannot be cancelling child in this state: "
            r2 = r304
            java.lang.IllegalStateException r0 = X.1BL.A0h(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.A04(java.lang.Object):java.lang.Throwable");
    }

    public static final 2aA A05(2aE r301) {
        while (r301.A04()) {
            2aE A002 = 2aE.A00(r301);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 2aE.A01;
                Object obj = atomicReferenceFieldUpdater.get(r301);
                while (true) {
                    A002 = (2aE) obj;
                    if (A002.A04()) {
                        obj = atomicReferenceFieldUpdater.get(A002);
                    }
                }
            }
            r301 = A002;
        }
        while (true) {
            r301 = r301.A03();
            if (!r301.A04()) {
                if (r301 instanceof 2aA) {
                    return (2aA) r301;
                }
                if (r301 instanceof C44y) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C44y A06(C2a6 c2a6) {
        2aE Atz = c2a6.Atz();
        if (Atz == null) {
            if (!(c2a6 instanceof C2a5)) {
                if (!(c2a6 instanceof 2aC)) {
                    throw 1BL.A0h(c2a6, "State should have list: ", AnonymousClass001.A0k());
                }
                A09((2aC) c2a6);
                return null;
            }
            Atz = new 2aE();
        }
        return Atz;
    }

    private final void A07(Object obj, C2a6 c2a6) {
        C2s6 c2s6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        C2a8 c2a8 = (C2a8) atomicReferenceFieldUpdater.get(this);
        if (c2a8 != null) {
            c2a8.dispose();
            atomicReferenceFieldUpdater.set(this, C2a7.A00);
        }
        Throwable th = null;
        if ((obj instanceof C2s6) && (c2s6 = (C2s6) obj) != null) {
            th = c2s6.A00;
        }
        if (c2a6 instanceof 2aC) {
            try {
                ((2aC) c2a6).A05(th);
                return;
            } catch (Throwable th2) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Exception in completion handler ");
                A0k.append(c2a6);
                RuntimeException runtimeException = new RuntimeException(AnonymousClass001.A0Z(this, " for ", A0k), th2);
                if (!(this instanceof C2ak)) {
                    throw runtimeException;
                }
                EZF.A00(((C2ak) this).A00, runtimeException);
                return;
            }
        }
        C44y Atz = c2a6.Atz();
        if (Atz != null) {
            Object A02 = Atz.A02();
            11T.A0I(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            RuntimeException runtimeException2 = null;
            for (2aD r311 = (2aE) A02; !11T.A0O(r311, Atz); r311 = ((2aE) r311).A03()) {
                if (r311 instanceof 2aC) {
                    2aD r0 = r311;
                    try {
                        r0.A05(th);
                    } catch (Throwable th3) {
                        if (runtimeException2 != null) {
                            C0ra.A01(runtimeException2, th3);
                        } else {
                            StringBuilder A0k2 = AnonymousClass001.A0k();
                            A0k2.append("Exception in completion handler ");
                            A0k2.append(r0);
                            runtimeException2 = new RuntimeException(AnonymousClass001.A0Z(this, " for ", A0k2), th3);
                        }
                    }
                }
            }
            if (runtimeException2 != null) {
                if (!(this instanceof C2ak)) {
                    throw runtimeException2;
                }
                EZF.A00(((C2ak) this).A00, runtimeException2);
            }
        }
    }

    private final void A08(Throwable th, C44y c44y) {
        C2a9 c2a9;
        Object A02 = c44y.A02();
        11T.A0I(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        RuntimeException runtimeException = null;
        for (2aD r304 = (2aE) A02; !11T.A0O(r304, c44y); r304 = ((2aE) r304).A03()) {
            if (r304 instanceof 2aB) {
                2aD r0 = r304;
                try {
                    r0.A05(th);
                } catch (Throwable th2) {
                    if (runtimeException != null) {
                        C0ra.A01(runtimeException, th2);
                    } else {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("Exception in completion handler ");
                        A0k.append(r0);
                        runtimeException = new RuntimeException(AnonymousClass001.A0Z(this, " for ", A0k), th2);
                    }
                }
            }
        }
        if (runtimeException != null) {
            if (!(this instanceof C2ak)) {
                throw runtimeException;
            }
            EZF.A00(((C2ak) this).A00, runtimeException);
        }
        if (A0M() || (c2a9 = (C2a9) A00.get(this)) == null || c2a9 == C2a7.A00) {
            return;
        }
        c2a9.AF1(th);
    }

    private final void A09(2aC r302) {
        2aE r0 = new 2aE();
        2aE.A01.set(r0, r302);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 2aE.A00;
        atomicReferenceFieldUpdater.set(r0, r302);
        while (true) {
            if (r302.A02() != r302) {
                break;
            } else if (C2am.A00(r302, r302, r0, atomicReferenceFieldUpdater)) {
                2aE.A01(r0, r302);
                break;
            }
        }
        C2am.A00(this, r302, r302.A03(), A01);
    }

    private final boolean A0A(Object obj, 2aC r303, C44y c44y) {
        2aE A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AnonymousClass452 anonymousClass452 = new AnonymousClass452(obj, this, r303);
        do {
            A002 = 2aE.A00(c44y);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = 2aE.A01;
                Object obj2 = atomicReferenceFieldUpdater2.get(c44y);
                while (true) {
                    A002 = (2aE) obj2;
                    if (!A002.A04()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater2.get(A002);
                }
            }
            2aE.A01.set(r303, A002);
            atomicReferenceFieldUpdater = 2aE.A00;
            atomicReferenceFieldUpdater.set(r303, c44y);
            ((AnonymousClass453) anonymousClass452).A00 = c44y;
        } while (!C2am.A00(A002, c44y, anonymousClass452, atomicReferenceFieldUpdater));
        boolean z = false;
        if (anonymousClass452.A00(A002) == null) {
            z = true;
        }
        return z;
    }

    private void A0I(Object obj) {
        if (this instanceof C2ak) {
            C2ak c2ak = (C2ak) this;
            if (!(obj instanceof C2s6)) {
                c2ak.A0R(obj);
                return;
            }
            C2s6 c2s6 = (C2s6) obj;
            Throwable th = c2s6.A00;
            boolean z = false;
            if (C2s6.A01.get(c2s6) != 0) {
                z = true;
            }
            c2ak.A0T(th, z);
        }
    }

    public final Object A0B() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C2al)) {
                return obj;
            }
            ((C2al) obj).A00(this);
        }
    }

    public final Object A0C(Object obj) {
        Object A012;
        C2s6 c2s6;
        do {
            A012 = A01(A0B(), obj);
            if (A012 == C2a4.A02) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Job ");
                A0k.append(this);
                String A0Z = AnonymousClass001.A0Z(obj, " is already complete or completing, but is being completed with ", A0k);
                Throwable th = null;
                if ((obj instanceof C2s6) && (c2s6 = (C2s6) obj) != null) {
                    th = c2s6.A00;
                }
                throw new IllegalStateException(A0Z, th);
            }
        } while (A012 == C2a4.A03);
        return A012;
    }

    public final Object A0D(0DR r302) {
        Object A0B;
        do {
            A0B = A0B();
            if (!(A0B instanceof C2a6)) {
                if (A0B instanceof C2s6) {
                    throw ((C2s6) A0B).A00;
                }
                return C2a4.A00(A0B);
            }
        } while (A00(A0B) < 0);
        String str = C2s7.__redex_internal_original_name;
        final 0DR A02 = 0DT.A02(r302);
        final C2s7 c2s7 = new C2s7(A02, this) { // from class: X.4ca
            public static final String __redex_internal_original_name = "JobSupport$AwaitContinuation";
            public final C2a1 A00;

            {
                this.A00 = this;
            }

            @Override // X.C2s7
            public String A0D() {
                return "AwaitContinuation";
            }

            @Override // X.C2s7
            public Throwable A0E(C2a2 c2a2) {
                Throwable th;
                Object A0B2 = this.A00.A0B();
                return (!(A0B2 instanceof AnonymousClass451) || (th = (Throwable) AnonymousClass451.A03.get(A0B2)) == null) ? A0B2 instanceof C2s6 ? ((C2s6) A0B2).A00 : c2a2.AbX() : th;
            }
        };
        c2s7.A0F();
        AnonymousClass459.A01(c2s7, BQH(new 2aC(c2s7) { // from class: X.3l2
            public final C2s7 A00;

            {
                this.A00 = c2s7;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                A05((Throwable) obj);
                return 04S.A00;
            }
        }));
        return c2s7.A0C();
    }

    public String A0E() {
        return this instanceof C2ak ? 0Pz.A0W(getClass().getSimpleName(), " was cancelled") : "Job was cancelled";
    }

    public String A0F() {
        return AnonymousClass001.A0X(this);
    }

    public void A0G() {
        if (this instanceof C3l5) {
            C3l5 c3l5 = (C3l5) this;
            try {
                C2ar.A00(04S.A00, 0DT.A02(c3l5.A00));
            } catch (Throwable th) {
                c3l5.resumeWith(new 0DV(th));
                throw th;
            }
        }
    }

    public void A0H(Object obj) {
    }

    public void A0J(Throwable th) {
        A0N(th);
    }

    public final void A0K(C2a2 c2a2) {
        if (c2a2 != null) {
            c2a2.start();
            C2a9 AAy = c2a2.AAy(this);
            A00.set(this, AAy);
            if (!(!(A0B() instanceof C2a6))) {
                return;
            } else {
                AAy.dispose();
            }
        }
        A00.set(this, C2a7.A00);
    }

    public boolean A0L() {
        return this instanceof C2a0;
    }

    public boolean A0M() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        if (r304 == X.C2a4.A04) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b5, code lost:
    
        if (r304 != X.C2a4.A06) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f2, code lost:
    
        A0H(r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r304 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r304 != X.C2a4.A04) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r0 = X.C2s6.A01;
        r304 = A01(r0, new X.C2s6(A04(r302), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r304 == X.C2a4.A03) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r304 != r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r310 = null;
        r311 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        r0 = A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if ((r0 instanceof X.AnonymousClass451) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013d, code lost:
    
        if ((r0 instanceof X.C2a6) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (r311 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0011, code lost:
    
        if (A0L() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0145, code lost:
    
        r311 = A04(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014c, code lost:
    
        r0 = (X.C2a6) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0162, code lost:
    
        if (r0.BQN() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ba, code lost:
    
        r304 = A01(r0, new X.C2s6(r311, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d2, code lost:
    
        if (r304 == r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01dd, code lost:
    
        if (r304 == X.C2a4.A03) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        r0 = A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0207, code lost:
    
        throw X.1BL.A0h(r0, "Cannot happen in ", X.AnonymousClass001.A0k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0165, code lost:
    
        r0 = A06(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016f, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0190, code lost:
    
        if (X.C2am.A00(r301, r0, new X.AnonymousClass451(r311, r0), X.C2a1.A01) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if ((r0 instanceof X.C2a6) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        A08(r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019b, code lost:
    
        r304 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e3, code lost:
    
        r304 = X.C2a4.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r0 = (X.AnonymousClass451) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        if (X.AnonymousClass451.A02.get(r0) != X.C2a4.A05) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
    
        r304 = X.C2a4.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if ((r0 instanceof X.AnonymousClass451) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ce, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
    
        r0 = X.AnonymousClass451.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
    
        r305 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e6, code lost:
    
        if (r0.get(r0) == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e9, code lost:
    
        r305 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ee, code lost:
    
        if (r311 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f2, code lost:
    
        r311 = A04(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fa, code lost:
    
        r0.A00(r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0107, code lost:
    
        r0 = (java.lang.Throwable) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0114, code lost:
    
        if ((!r305) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0117, code lost:
    
        r310 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (X.AnonymousClass451.A01.get(r0) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011c, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
    
        if (r310 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0122, code lost:
    
        A08(r310, r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
    
        if (r304 == r0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0N(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.A0N(java.lang.Object):boolean");
    }

    public final boolean A0O(Object obj) {
        Object A012;
        boolean z;
        do {
            A012 = A01(A0B(), obj);
            if (A012 == C2a4.A02) {
                z = false;
            } else {
                z = true;
                if (A012 != C2a4.A04) {
                }
            }
            return z;
        } while (A012 == C2a4.A03);
        A0H(A012);
        return true;
    }

    public boolean A0P(Throwable th) {
        if (this instanceof 2Zz) {
            return false;
        }
        if (!(th instanceof CancellationException)) {
            if (!A0N(th)) {
                return false;
            }
            if ((this instanceof C2a0) && !((C2a0) this).A00) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C2a2
    public final C2a9 AAy(C2a1 c2a1) {
        C2a8 BQI = BQI(new 2aA(c2a1), true, true);
        11T.A0I(BQI, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C2a9) BQI;
    }

    @Override // X.C2a2
    public void AE0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new 4cX(A0E(), (Throwable) null, this);
        }
        A0J(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r302 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r302 == null) goto L10;
     */
    @Override // X.C2a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.CancellationException AbX() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.AbX():java.util.concurrent.CancellationException");
    }

    @Override // X.C2a2
    public C2a2 B1H() {
        C2a9 c2a9 = (C2a9) A00.get(this);
        if (c2a9 != null) {
            return c2a9.B1H();
        }
        return null;
    }

    @Override // X.C2a2
    public final C2a8 BQH(Function1 function1) {
        return BQI(function1, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x017a, code lost:
    
        if (r306 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r306 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.2aE, X.44y] */
    @Override // X.C2a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C2a8 BQI(kotlin.jvm.functions.Function1 r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.BQI(kotlin.jvm.functions.Function1, boolean, boolean):X.2a8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (((X.C2a6) r0).BQN() == false) goto L6;
     */
    @Override // X.C2a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQN() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.A0B()
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.C2a6
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L20
            r0 = r302
            X.2a6 r0 = (X.C2a6) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.BQN()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            r303 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2a1.BQN():boolean");
    }

    @Override // X.C2a2
    public final boolean BRC() {
        return !(A0B() instanceof C2a6);
    }

    @Override // X.C2a2
    public final Object BXZ(0DR r302) {
        while (true) {
            Object A0B = A0B();
            if (!(A0B instanceof C2a6)) {
                2sD.A00(r302.getContext());
                break;
            }
            if (A00(A0B) >= 0) {
                String str = C2s7.__redex_internal_original_name;
                final C2s7 c2s7 = new C2s7(1, 0DT.A02(r302));
                c2s7.A0F();
                AnonymousClass459.A01(c2s7, BQH(new 2aC(c2s7) { // from class: X.456
                    public final 0DR A00;

                    {
                        this.A00 = c2s7;
                    }

                    public void A05(Throwable th) {
                        this.A00.resumeWith(04S.A00);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        A05((Throwable) obj);
                        return 04S.A00;
                    }
                }));
                Object A0C = c2s7.A0C();
                0Ds r0 = 0Ds.A02;
                if (A0C != r0) {
                    A0C = 04S.A00;
                }
                if (A0C == r0) {
                    return A0C;
                }
            }
        }
        return 04S.A00;
    }

    public Object fold(Object obj, Function2 function2) {
        11T.A0F(function2, 2);
        return function2.invoke(obj, this);
    }

    public 0DD get(0DH r302) {
        return 0DK.A00(this, r302);
    }

    public final 0DH getKey() {
        return C2a2.A00;
    }

    @Override // X.C2a2
    public final boolean isCancelled() {
        Object A0B = A0B();
        if (A0B instanceof C2s6) {
            return true;
        }
        return (A0B instanceof AnonymousClass451) && AnonymousClass451.A03.get(A0B) != null;
    }

    public 0DE minusKey(0DH r302) {
        return 0DK.A01(this, r302);
    }

    public 0DE plus(0DE r302) {
        return 0DK.A02(this, r302);
    }

    @Override // X.C2a2
    public final boolean start() {
        int A002;
        boolean z;
        do {
            A002 = A00(A0B());
            z = false;
            if (A002 == 0) {
                break;
            }
            z = true;
        } while (A002 != 1);
        return z;
    }

    public String toString() {
        return 0Pz.A0Y(0Pz.A0Z(A0F(), A03(A0B()), '{', '}'), 1BK.A12(this), '@');
    }
}
