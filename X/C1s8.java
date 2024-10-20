package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.1s8, reason: invalid class name */
/* loaded from: 1s8.class */
public final class C1s8 {
    public final 1sD A00;
    public final 1sG A01;
    public final 1sE A02;
    public final 1sC A03;
    public final C1s9 A04;
    public final C1s9 A05;
    public final 1sB A06;

    public C1s8() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r308 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        r303 = r302.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        r0 = new X.1sC(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r302 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r310 = r302.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r310 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r311 = r302.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r311 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r311 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r302 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r303 = new X.1sG();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (r0.A00 == r0.A00) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r301.A05 = r0;
        r301.A04 = r0;
        r301.A06 = r308;
        r301.A03 = r0;
        r301.A00 = r310;
        r301.A02 = r311;
        r301.A01 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
    
        throw X.AnonymousClass001.A0L("The same InitialState cannot be used for both resolve and layout states");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r303 = r302.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r303 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r310 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r302 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r302 != null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1s8(X.C1s8 r302) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1s8.<init>(X.1s8):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1sB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.1sD, java.lang.Object] */
    public C1s8(C2yq c2yq, C2yq c2yq2) {
        1BL.A1F(c2yq, c2yq2);
        C1s9 c1s9 = new C1s9(c2yq, null);
        C1s9 c1s92 = new C1s9(c2yq2, null);
        ?? obj = new Object();
        1sC r0 = new 1sC((1sC) null);
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        1sG r02 = new 1sG();
        if (c1s9.A00 == c1s92.A00) {
            throw AnonymousClass001.A0L("The same InitialState cannot be used for both resolve and layout states");
        }
        this.A05 = c1s9;
        this.A04 = c1s92;
        this.A06 = obj;
        this.A03 = r0;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = r02;
    }

    public final C2ko A00(String str) {
        C2ko c2ko;
        11T.A0F(str, 0);
        1sE r0 = this.A02;
        synchronized (r0) {
            try {
                java.util.Map map = r0.A00;
                c2ko = map != null ? (C2ko) map.get(str) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2ko;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[LOOP:0: B:24:0x0064->B:26:0x0072, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.2Yv A01(X.2Yv r302, java.lang.String r303, boolean r304) {
        /*
            r301 = this;
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r305
            X.11T.A0F(r0, r1)
            r0 = r304
            if (r0 == 0) goto L19
            r0 = r301
            X.1s9 r0 = r0.A04
            r306 = r0
        L13:
            r0 = r306
            monitor-enter(r0)
            goto L22
        L19:
            r0 = r301
            X.1s9 r0 = r0.A05
            r306 = r0
            goto L13
        L22:
            r0 = r306
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r306
            java.util.Map r0 = r0.A05     // Catch: java.lang.Throwable -> L89
            r307 = r0
            r0 = r306
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r307
            r1 = r303
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L91
            r308 = r0
            r0 = r308
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L91
            r308 = r0
            r0 = r306
            monitor-exit(r0)
            r0 = r308
            if (r0 == 0) goto L87
            r0 = r308
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L87
            r0 = r302
            X.2Yv r0 = r0.A01()
            r302 = r0
            r0 = r308
            java.util.Iterator r0 = r0.iterator()
            r308 = r0
        L64:
            r0 = r308
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L87
            r0 = r308
            java.lang.Object r0 = r0.next()
            X.2l4 r0 = (X.C2l4) r0
            r307 = r0
            r0 = r302
            r1 = r307
            r0.A02(r1)
            goto L64
        L87:
            r0 = r302
            return r0
        L89:
            r307 = move-exception
            r0 = r306
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r307
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r307 = move-exception
            r0 = r306
            monitor-exit(r0)
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1s8.A01(X.2Yv, java.lang.String, boolean):X.2Yv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.AbstractCollection] */
    public final Object A02(Object obj, String str, int i, boolean z) {
        Object obj2;
        11T.A0F(obj, 2);
        C1s9 c1s9 = z ? this.A04 : this.A05;
        synchronized (c1s9) {
            try {
                C2cg c2cg = new C2cg(str, i);
                java.util.Map map = c1s9.A02;
                obj2 = null;
                if (map != null) {
                    C2ck c2ck = (C2ck) map.get(c2cg);
                    if (c2ck != null && C28q.A02(c2ck.A01, obj)) {
                        if (c2ck.A00 != obj.hashCode()) {
                            C00m c00m = JSi.A06;
                            1Lc r0 = 1Lc.A03;
                            long currentTimeMillis = System.currentTimeMillis();
                            if (r0.compareTo(1LZ.A00()) >= 0) {
                                Set set = 1LZ.A00;
                                if (!set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    C0ty c0ty = null;
                                    while (true) {
                                        boolean z2 = true;
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        String[] strArr = ((1LV) next).A00;
                                        if (!02L.A0C("Litho.DebugInfo", strArr) && !02L.A0C("*", strArr)) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            if (c0ty == null) {
                                                new ArrayList();
                                            }
                                            c0ty.add(next);
                                        }
                                    }
                                    if (c0ty == null) {
                                        c0ty = C0ty.A00;
                                    }
                                    if (!c0ty.isEmpty()) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "StateHandler:MutableTypeUsedAsCachedValueDep");
                                        linkedHashMap.put("description", "Unexpected mutable value used as CachedValue dep");
                                        linkedHashMap.put(Property.SYMBOL_Z_ORDER_SOURCE, obj.getClass().getName());
                                        Jux jux = new Jux(r0, "Litho.DebugInfo", (String) c00m.invoke(), linkedHashMap, currentTimeMillis);
                                        Iterator it2 = c0ty.iterator();
                                        while (it2.hasNext()) {
                                            ((1LV) it2.next()).A02(jux);
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = c2ck.A02;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj2;
    }

    public final void A03() {
        1sG r302 = this.A02;
        synchronized (r302) {
            try {
                r302.A01();
            } catch (Throwable th) {
                throw th;
            }
        }
        r302 = this.A01;
        synchronized (r302) {
            r302.A00.clear();
        }
    }

    public final void A04() {
        1sE r0 = this.A02;
        synchronized (r0) {
            r0.A01();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v12 ??, still in use, count: 2, list:
          (r314v12 ??) from 0x00c2: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??) binds: [B:35:0x00a9, B:39:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ?? I:java.lang.Object) from 0x00bc: INVOKE (r0v180 ?? I:java.util.Map), (r0v76 ?? I:java.lang.Object), (r314v12 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00ec, MD:(K, V):V (c)]
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
    public final void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v12 ??, still in use, count: 2, list:
          (r314v12 ??) from 0x00c2: PHI (r314v11 ??) = (r314v10 ??), (r314v12 ??) binds: [B:35:0x00a9, B:39:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          (r314v12 ?? I:java.lang.Object) from 0x00bc: INVOKE (r0v180 ?? I:java.util.Map), (r0v76 ?? I:java.lang.Object), (r314v12 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00ec, MD:(K, V):V (c)]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v5 ??, still in use, count: 2, list:
          (r305v5 ??) from 0x005c: PHI (r305v4 ??) = (r305v3 ??), (r305v5 ??) binds: [B:12:0x0044, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
          (r305v5 ?? I:java.lang.Object) from 0x0056: INVOKE (r0v11 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r305v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0069, MD:(K, V):V (c)]
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
    public final void A06(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v5 ??, still in use, count: 2, list:
          (r305v5 ??) from 0x005c: PHI (r305v4 ??) = (r305v3 ??), (r305v5 ??) binds: [B:12:0x0044, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
          (r305v5 ?? I:java.lang.Object) from 0x0056: INVOKE (r0v11 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r305v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0069, MD:(K, V):V (c)]
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r306 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(X.C23N r302) {
        /*
            r301 = this;
            r0 = r301
            X.1sC r0 = r0.A03
            r303 = r0
            r0 = r302
            int r0 = r0.A0A
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A00 = r1
            java.util.HashSet r0 = new java.util.HashSet
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r302
            X.1tv r0 = r0.A0L
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L30
            r0 = r306
            java.util.List r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L35
        L30:
            X.0ty r0 = X.C0ty.A00
            r306 = r0
        L35:
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L3e:
            r0 = r307
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L99
            r0 = r307
            java.lang.Object r0 = r0.next()
            X.3mB r0 = (X.C3mB) r0
            r308 = r0
            r0 = r308
            X.66s r0 = r0.Aps()
            r309 = r0
            r0 = r305
            r1 = r309
            boolean r0 = r0.add(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L89
            r0 = r303
            java.util.Map r0 = r0.A01
            r310 = r0
            r0 = r308
            X.3lE r0 = r0.Cba()
            r306 = r0
            r0 = r310
            r1 = r309
            r2 = r306
            java.lang.Object r0 = r0.put(r1, r2)
            goto L3e
        L89:
            r0 = r309
            java.lang.String r0 = r0.A00
            r306 = r0
            java.lang.String r0 = "Cannot record render data for KComponent, found another Component with the same key: "
            r1 = r306
            java.lang.RuntimeException r0 = X.0Pz.A08(r0, r1)
            throw r0
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1s8.A07(X.23N):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v7 ??, still in use, count: 2, list:
          (r309v7 ??) from 0x005a: PHI (r309v2 ??) = (r309v1 ??), (r309v7 ??) binds: [B:12:0x003d, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]
          (r309v7 ?? I:java.lang.Object) from 0x0054: INVOKE (r0v9 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r309v7 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00ab, MD:(K, V):V (c)]
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
    public final void A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v7 ??, still in use, count: 2, list:
          (r309v7 ??) from 0x005a: PHI (r309v2 ??) = (r309v1 ??), (r309v7 ??) binds: [B:12:0x003d, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]
          (r309v7 ?? I:java.lang.Object) from 0x0054: INVOKE (r0v9 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r309v7 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00ab, MD:(K, V):V (c)]
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

    public final void A09(Object obj, Object obj2, String str, int i, boolean z) {
        11T.A0F(str, 0);
        11T.A0F(obj, 2);
        C1s9 c1s9 = z ? this.A04 : this.A05;
        synchronized (c1s9) {
            try {
                C2cg c2cg = new C2cg(str, i);
                if (obj2 == null) {
                    java.util.Map map = c1s9.A02;
                    if (map != null) {
                        map.remove(c2cg);
                    }
                } else {
                    if (c1s9.A02 == null) {
                        c1s9.A02 = new LinkedHashMap();
                    }
                    C2ck c2ck = new C2ck(obj, obj.hashCode(), obj2);
                    java.util.Map map2 = c1s9.A02;
                    if (map2 != null) {
                        map2.put(c2cg, c2ck);
                    }
                }
            } finally {
                C1s9 c1s92 = c1s9;
            }
        }
    }

    public final void A0A(List list, List list2) {
        1sE r0 = this.A02;
        synchronized (r0) {
            A04();
            if (list != null) {
                this.A01.A02(list);
            }
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    1tT r02 = (1tT) it.next();
                    1LI r03 = r02.A03;
                    11T.A0I(r03, "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent");
                    C1rj c1rj = (C1rj) r03;
                    1Iw r04 = r02.A04;
                    this.A01.A01(r04, c1rj, r04.A0C());
                    c1rj.A1G(r04, r0);
                }
            }
        }
        this.A01.A00();
    }

    public final boolean A0B(String str, Function1 function1, int i, boolean z) {
        11T.A0F(function1, 0);
        C1s9 c1s9 = z ? this.A04 : this.A05;
        java.util.Map map = c1s9.A08;
        boolean z2 = false;
        if (map.get(str) != null) {
            synchronized (c1s9) {
                try {
                    2kD r0 = (2kD) map.get(str);
                    List list = null;
                    if (r0 == null) {
                        return false;
                    }
                    2Yv r02 = r0.A01;
                    List list2 = (List) c1s9.A09.get(str);
                    if (list2 != null) {
                        new ArrayList(list2);
                    }
                    C2ld c2ld = (C2ld) r02;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            c2ld = ((6CS) it.next()).BIF(c2ld);
                        }
                    }
                    if (c2ld != null) {
                        Object A0J = 0QD.A0J(c2ld.A00, i);
                        Object invoke = function1.invoke(A0J);
                        if (A0J != null ? A0J.equals(invoke) : invoke == null) {
                            z2 = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z2;
    }
}
