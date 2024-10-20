package X;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6n4, reason: invalid class name */
/* loaded from: 6n4.class */
public final class C6n4 extends C1rj {
    public int A00;
    public 1LI A01;
    public 5zD A02;
    public C6n3 A03;
    public 64Q A04;
    public 7Gu A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public C6n4() {
        super("TextBubbleComponent");
        this.A06 = Collections.emptyList();
    }

    public static 85B A00(1Iw r301) {
        return new 85B(r301, new C6n4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.7XD A01(X.6nU r301, X.C6n3 r302, X.66R r303) {
        /*
            java.lang.String r0 = "getOutline"
            r304 = r0
            r0 = r304
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = r302
            boolean r0 = r0.A0B     // Catch: java.lang.Throwable -> L6b
            r305 = r0
            r0 = r302
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L6b
            r306 = r0
            r0 = r302
            java.lang.Integer r0 = r0.A02     // Catch: java.lang.Throwable -> L6b
            r304 = r0
            r0 = r304
            boolean r0 = X.62G.A00(r0)     // Catch: java.lang.Throwable -> L6b
            r307 = r0
            r0 = r304
            boolean r0 = X.62G.A01(r0)     // Catch: java.lang.Throwable -> L6b
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L34
            r0 = r302
            boolean r0 = r0.A0G     // Catch: java.lang.Throwable -> L6b
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L3e
        L34:
            r0 = 0
            r309 = r0
            r0 = 0
            r304 = r0
            r0 = r307
            if (r0 == 0) goto L41
        L3e:
            r0 = 1
            r309 = r0
        L41:
            r0 = r308
            r1 = r309
            X.66P r0 = X.66P.A00(r0, r1)     // Catch: java.lang.Throwable -> L6b
            r310 = r0
            r0 = 1
            r311 = r0
            r0 = r310
            r1 = r311
            X.11T.A0F(r0, r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r301
            r1 = r310
            r2 = r303
            r3 = r305
            r4 = r311
            r5 = r311
            r6 = r311
            r7 = r311
            X.7XD r0 = r0.A00(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6b
            r304 = r0
            com.facebook.litho.ComponentsSystrace.A01()
            r0 = r304
            return r0
        L6b:
            r304 = move-exception
            com.facebook.litho.ComponentsSystrace.A01()
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6n4.A01(X.6nU, X.6n3, X.66R):X.7XD");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A06, this.A05, Boolean.valueOf(this.A07), 1BK.A0d(), Integer.valueOf(this.A00), Boolean.valueOf(this.A08), this.A03, this.A04, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C6n4 c6n4 = (C6n4) super.A0l();
        1LI r0 = c6n4.A01;
        c6n4.A01 = r0 != null ? r0.A0l() : null;
        return c6n4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v11 ??, still in use, count: 7, list:
          (r303v11 ??) from 0x0759: PHI (r303v3 ??) = (r303v2 ??), (r303v11 ??) binds: [B:336:0x0740, B:266:0x074d] A[DONT_GENERATE, DONT_INLINE]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x03cf: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v104 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x0460: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v91 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x04d2: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v75 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x054d: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v86 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x063c: INVOKE (r0v393 ?? I:int) = (r303v11 ?? I:java.util.AbstractCollection) VIRTUAL call: java.util.AbstractCollection.size():int A[Catch: all -> 0x0730, MD:():int (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x0651: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v73 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0730, MD:(E):boolean (c)]
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
    @Override // X.C1rj
    public X.1LI A0y(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v11 ??, still in use, count: 7, list:
          (r303v11 ??) from 0x0759: PHI (r303v3 ??) = (r303v2 ??), (r303v11 ??) binds: [B:336:0x0740, B:266:0x074d] A[DONT_GENERATE, DONT_INLINE]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x03cf: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v104 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x0460: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v91 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x04d2: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v75 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x054d: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v86 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: Exception -> 0x05f2, all -> 0x05f7, MD:(E):boolean (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x063c: INVOKE (r0v393 ?? I:int) = (r303v11 ?? I:java.util.AbstractCollection) VIRTUAL call: java.util.AbstractCollection.size():int A[Catch: all -> 0x0730, MD:():int (c)]
          (r303v11 ?? I:java.util.AbstractCollection) from 0x0651: INVOKE (r303v11 ?? I:java.util.AbstractCollection), (r1v73 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0730, MD:(E):boolean (c)]
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

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1933296085) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        F5R f5r = (F5R) obj;
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        0Cs r04 = f5r.A01;
        View view = f5r.A00;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
        C6n3 c6n3 = ((C6n4) r02).A03;
        r04.A0a(view, accessibilityNodeInfoCompat);
        0Oe r05 = 0Oe.A08;
        Context context = r03.A0D;
        int i2 = 2131952152;
        if (c6n3.A09) {
            i2 = 2131952150;
        }
        accessibilityNodeInfoCompat.A05(new 0Oe(16, context.getString(i2)));
        return null;
    }
}
