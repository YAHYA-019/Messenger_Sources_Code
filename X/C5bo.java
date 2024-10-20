package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.5bo, reason: invalid class name */
/* loaded from: 5bo.class */
public final class C5bo extends C1rj {
    public FbUserSession A00;
    public C2i8 A01;
    public 2YH A02;
    public 2kT A03;
    public 3xR A04;
    public C2i7 A05;
    public MigColorScheme A06;

    public C5bo() {
        super("FriendsInboxUnitMontageActiveNowItemComponent");
    }

    public static 1Im A00(1Iw r301) {
        return 1LI.A02(r301, C5bo.class, 0S2.A01, "FriendsInboxUnitMontageActiveNowItemComponent", (Object[]) null, 71235917);
    }

    public static 1Im A01(1Iw r301) {
        return 1LI.A02(r301, C5bo.class, 0S2.A01, "FriendsInboxUnitMontageActiveNowItemComponent", (Object[]) null, -1336101728);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v7 ??, still in use, count: 2, list:
          (r318v7 ??) from 0x0218: PHI (r318v4 ??) = (r318v3 ??), (r318v6 ??), (r318v7 ??) binds: [B:59:0x01f8, B:58:0x0202, B:50:0x0218] A[DONT_GENERATE, DONT_INLINE]
          (r318v7 ?? I:java.util.Map) from 0x01ef: INVOKE (r318v7 ?? I:java.util.Map), (r0v226 ?? I:java.lang.Object), (r0v230 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: JSONException -> 0x0200, MD:(K, V):V (c)]
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
    public static final void A0L(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v7 ??, still in use, count: 2, list:
          (r318v7 ??) from 0x0218: PHI (r318v4 ??) = (r318v3 ??), (r318v6 ??), (r318v7 ??) binds: [B:59:0x01f8, B:58:0x0202, B:50:0x0218] A[DONT_GENERATE, DONT_INLINE]
          (r318v7 ?? I:java.util.Map) from 0x01ef: INVOKE (r318v7 ?? I:java.util.Map), (r0v226 ?? I:java.lang.Object), (r0v230 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: JSONException -> 0x0200, MD:(K, V):V (c)]
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

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A05, this.A04, this.A01, this.A06, this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x04a4, code lost:
    
        if (r339 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0632, code lost:
    
        if (r305.length() != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0670  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5bo.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x027a, code lost:
    
        if (r0 != null) goto L43;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 2762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5bo.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C5bq c5bq = (C5bq) r303;
        11T.A0F(r302, 0);
        Context context = r302.A0D;
        11T.A0A(context);
        Object A0E = 1Bn.A0E(context, (1BY) null, 32840);
        if (A0E != null) {
            c5bq.A00 = (3yB) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
