package X;

import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import java.util.Locale;

/* renamed from: X.48b, reason: invalid class name */
/* loaded from: 48b.class */
public final class C48b {
    public final C00i A02 = new 1BQ(46);
    public final C5S5 A00 = (C5S5) 1Bi.A03(67922);
    public final AnonymousClass046 A03 = (AnonymousClass046) 1Bn.A0A(16669);
    public final 1CO A01 = (1CO) 1Bi.A03(16387);

    public static MontageStickerOverlayBounds A00(C5at c5at, int i) {
        return new MontageStickerOverlayBounds(((1qX) c5at).mResultSet.getDouble(i, 3), ((1qX) c5at).mResultSet.getDouble(i, 4), ((1qX) c5at).mResultSet.getDouble(i, 5), ((1qX) c5at).mResultSet.getDouble(i, 6), ((1qX) c5at).mResultSet.getDouble(i, 7));
    }

    public static Integer A01(Integer num) {
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public static String A02(Integer num) {
        int intValue = num.intValue();
        return String.format(Locale.US, "%08X", Integer.valueOf(((intValue & 255) << 24) | ((intValue >> 8) & 16777215)));
    }

    private String A03(Long l, String str, String str2) {
        0AC r0 = (0AC) this.A02.get();
        return l != null ? r0.A03(l, str, str2) : r0.A04(str, str2);
    }

    public static void A04(C48b c48b, Exception exc, String str, String str2) {
        0fH.A0r(0Pz.A0W("MsysMontageCardConverter_", str2), str, exc);
        AnonymousClass047 ACu = c48b.A03.ACu(0Pz.A0W("MsysMontageCardConverter_", str2), 13250707);
        ACu.Cmr(exc);
        ACu.report();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (((X.1qX) r302).mResultSet.getBoolean(r303, 44) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.montage.model.MontageBucketPreview A05(X.C48a r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            X.48c r0 = r0.A06(r1, r2)
            r304 = r0
            r0 = r304
            com.facebook.messaging.montage.model.MontageCard r0 = r0.A00()
            r305 = r0
            r0 = r302
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r306 = r0
            r0 = 46
            r307 = r0
            r0 = r306
            r1 = r303
            r2 = r307
            boolean r0 = r0.getBoolean(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L42
            r0 = r302
            com.facebook.msys.mci.CQLResultSet r0 = r0.mResultSet
            r306 = r0
            r0 = r306
            r1 = r303
            r2 = 44
            boolean r0 = r0.getBoolean(r1, r2)
            r307 = r0
            r0 = 1
            r309 = r0
            r0 = r307
            if (r0 == 0) goto L45
        L42:
            r0 = 0
            r309 = r0
        L45:
            r0 = r305
            com.facebook.messaging.montage.model.MontageUser r0 = r0.A08
            com.facebook.user.model.UserKey r0 = r0.A01
            r310 = r0
            r0 = r305
            long r0 = r0.A03
            r311 = r0
            com.facebook.messaging.montage.model.MontageBucketKey r0 = new com.facebook.messaging.montage.model.MontageBucketKey
            r313 = r0
            r0 = r313
            r1 = r311
            r0.<init>(r1)
            com.facebook.messaging.montage.model.MontageBucketPreview r0 = new com.facebook.messaging.montage.model.MontageBucketPreview
            r306 = r0
            r0 = r306
            r1 = r313
            r2 = 0
            r3 = r305
            r4 = r310
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r309
            r9 = r309
            r10 = r308
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48b.A05(X.48a, int):com.facebook.messaging.montage.model.MontageBucketPreview");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v33 ??, still in use, count: 2, list:
          (r313v33 ??) from 0x080e: PHI (r313v32 ??) = (r313v31 ??), (r313v33 ??) binds: [B:67:0x080c, B:42:0x07b2] A[DONT_GENERATE, DONT_INLINE]
          (r313v33 ?? I:X.5en) from 0x07ac: IPUT (r0v698 ?? I:android.net.Uri), (r313v33 ?? I:X.5en) A[Catch: Exception -> 0x0db1] X.5en.A0E android.net.Uri
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
    public X.C48c A06(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v33 ??, still in use, count: 2, list:
          (r313v33 ??) from 0x080e: PHI (r313v32 ??) = (r313v31 ??), (r313v33 ??) binds: [B:67:0x080c, B:42:0x07b2] A[DONT_GENERATE, DONT_INLINE]
          (r313v33 ?? I:X.5en) from 0x07ac: IPUT (r0v698 ?? I:android.net.Uri), (r313v33 ?? I:X.5en) A[Catch: Exception -> 0x0db1] X.5en.A0E android.net.Uri
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v6 ??, still in use, count: 2, list:
          (r311v6 ??) from 0x006f: PHI (r311v5 ??) = (r311v4 ??), (r311v6 ??) binds: [B:19:0x0050, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
          (r311v6 ?? I:java.lang.Object) from 0x0069: INVOKE (r0v7 ?? I:java.util.Map), (r0v70 ?? I:java.lang.Object), (r311v6 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0126, MD:(K, V):V (c)]
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
    public com.google.common.collect.ImmutableList A07(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v6 ??, still in use, count: 2, list:
          (r311v6 ??) from 0x006f: PHI (r311v5 ??) = (r311v4 ??), (r311v6 ??) binds: [B:19:0x0050, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
          (r311v6 ?? I:java.lang.Object) from 0x0069: INVOKE (r0v7 ?? I:java.util.Map), (r0v70 ?? I:java.lang.Object), (r311v6 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0126, MD:(K, V):V (c)]
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
