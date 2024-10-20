package X;

import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: X.53h, reason: invalid class name */
/* loaded from: 53h.class */
public final class C53h {
    public 7rK A00;
    public 7rK A01;
    public 7rK A02;
    public final View A03;
    public final C53i A04 = C53i.A01();

    public C53h(View view) {
        this.A03 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r305v16 */
    /* JADX WARN: Type inference failed for: r305v17 */
    /* JADX WARN: Type inference failed for: r305v4 */
    /* JADX WARN: Type inference failed for: r305v5, types: [X.7rK, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00() {
        /*
            r301 = this;
            r0 = r301
            android.view.View r0 = r0.A03
            r302 = r0
            r0 = r302
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La0
            r0 = r301
            X.7rK r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La1
            r0 = r301
            X.7rK r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L32
            X.7rK r0 = new X.7rK
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r301
            r1 = r305
            r0.A02 = r1
        L32:
            r0 = r305
            r1 = 0
            r0.A00 = r1
            r0 = 0
            r306 = r0
            r0 = r305
            r1 = 0
            r0.A02 = r1
            r0 = r305
            r1 = 0
            r0.A01 = r1
            r0 = r305
            r1 = 0
            r0.A03 = r1
            r0 = r302
            android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
            r304 = r0
            r0 = 1
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L66
            r0 = r305
            r1 = r307
            r0.A02 = r1
            r0 = r305
            r1 = r304
            r0.A00 = r1
        L66:
            r0 = r302
            android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L7c
            r0 = r305
            r1 = r307
            r0.A03 = r1
            r0 = r305
            r1 = r304
            r0.A01 = r1
        L7c:
            r0 = r305
            boolean r0 = r0.A02
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L94
            r0 = r305
            boolean r0 = r0.A03
            r306 = r0
            r0 = r306
            if (r0 == 0) goto La1
        L94:
            r0 = r302
            int[] r0 = r0.getDrawableState()
            r304 = r0
            r0 = r303
            r1 = r305
            r2 = r304
            X.C53b.A02(r0, r1, r2)
        La0:
            return
        La1:
            r0 = r301
            X.7rK r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L94
            r0 = r301
            X.7rK r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La0
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53h.A00():void");
    }

    public void A01() {
        this.A01 = null;
        A00();
        A00();
    }

    /* JADX WARN: Type inference failed for: r303v3, types: [X.7rK, java.lang.Object] */
    public void A02(int i) {
        ColorStateList A03;
        C53i c53i = this.A04;
        if (c53i == null || (A03 = c53i.A03(this.A03.getContext(), i)) == null) {
            this.A01 = null;
        } else {
            7rK r303 = this.A01;
            7rK r3032 = r303;
            if (r303 == null) {
                ?? obj = new Object();
                this.A01 = obj;
                r3032 = obj;
            }
            r3032.A00 = A03;
            r3032.A02 = true;
        }
        A00();
        A00();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v2 ??, still in use, count: 2, list:
          (r312v2 ??) from 0x0089: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??) binds: [B:15:0x0076, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
          (r312v2 ?? I:X.7rK) from 0x0086: IPUT (r312v2 ?? I:X.7rK), (r301v0 'this' ?? I:X.53h A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x00f7] X.53h.A01 X.7rK
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v2 ??, still in use, count: 2, list:
          (r312v2 ??) from 0x0089: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??) binds: [B:15:0x0076, B:18:0x0084] A[DONT_GENERATE, DONT_INLINE]
          (r312v2 ?? I:X.7rK) from 0x0086: IPUT (r312v2 ?? I:X.7rK), (r301v0 'this' ?? I:X.53h A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x00f7] X.53h.A01 X.7rK
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
