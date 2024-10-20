package X;

import java.util.List;

/* loaded from: I92.class */
public final class I92 {
    public RQo A00;
    public I7e A01;
    public HAQ A02;
    public volatile JNO A03;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 2, list:
          (r308v2 ??) from 0x003e: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:9:0x0028, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:X.JGC) from 0x003b: IPUT (r308v2 ?? I:X.JGC), (r0v11 ?? I:com.facebook.cameracore.camerasdk.fboptic.Camera1Device) A[Catch: Gtz -> 0x02ad] com.facebook.cameracore.camerasdk.fboptic.Camera1Device.A05 X.JGC
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
    public static void A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v2 ??, still in use, count: 2, list:
          (r308v2 ??) from 0x003e: PHI (r308v1 ??) = (r308v0 ??), (r308v2 ??) binds: [B:9:0x0028, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r308v2 ?? I:X.JGC) from 0x003b: IPUT (r308v2 ?? I:X.JGC), (r0v11 ?? I:com.facebook.cameracore.camerasdk.fboptic.Camera1Device) A[Catch: Gtz -> 0x02ad] com.facebook.cameracore.camerasdk.fboptic.Camera1Device.A05 X.JGC
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

    public static void A01(I92 i92, HAQ haq, IEp iEp) {
        String focusMode;
        if (i92.A03 != null) {
            JNO jno = i92.A03;
            if (haq == null) {
                List Amr = jno.Amr();
                haq = null;
                if (!Amr.isEmpty()) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        List list = HMF.A00;
                        if (i2 >= list.size()) {
                            break;
                        }
                        if (Amr.contains(list.get(i2))) {
                            haq = (HAQ) list.get(i2);
                            break;
                        }
                        i = i2 + 1;
                    }
                }
            }
            String A0b = AnonymousClass001.A0b(haq, HOG.A03);
            if (A0b != null) {
                synchronized (iEp) {
                    focusMode = iEp.A00.getFocusMode();
                }
                if (!A0b.equals(focusMode)) {
                    iEp.A0B(A0b);
                }
            } else {
                haq = null;
            }
            i92.A02 = haq;
        }
    }

    public void A02() {
        synchronized (this) {
            try {
                IEg iEg = IEg.A0O;
                if (iEg.A0K != null) {
                    iEg.A0K.setPreviewCallbackWithBuffer(null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Gtz unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r305 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(X.Hz3 r302, X.Hqd r303) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I92.A03(X.Hz3, X.Hqd):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r0.A05 != (r302 == X.H9F.FRONT ? X.HCB.A03 : X.HCB.A02)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(X.H9F r302) {
        /*
            r301 = this;
            r0 = r301
            X.JNO r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L32
            X.IEg r0 = X.IEg.A0O
            r304 = r0
            r0 = r304
            android.hardware.Camera r0 = r0.A0K
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L32
            r0 = r304
            X.HCB r0 = r0.A05
            r305 = r0
            X.H9F r0 = X.H9F.FRONT
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L3a
            X.HCB r0 = X.HCB.A03
            r304 = r0
        L29:
            r0 = 1
            r306 = r0
            r0 = r305
            r1 = r304
            if (r0 == r1) goto L37
        L32:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L37:
            r0 = r306
            return r0
        L3a:
            X.HCB r0 = X.HCB.A02
            r304 = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I92.A04(X.H9F):boolean");
    }
}
