package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.00a, reason: invalid class name */
/* loaded from: 00a.class */
public final class C00a {
    public static C00a A03;
    public static final AtomicInteger A04 = new AtomicInteger();
    public final Context A00;
    public final 00T A01;
    public final 00V A02;

    public C00a(Context context, 00T r303, 00V r304) {
        this.A00 = context;
        this.A01 = r303;
        this.A02 = r304;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v1 ??, still in use, count: 2, list:
          (r305v1 ??) from 0x004a: PHI (r305v2 ??) = (r305v1 ??), (r305v0 ??) binds: [B:28:0x0047, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
          (r305v1 ?? I:X.00a) from 0x0047: SPUT (r305v1 ?? I:X.00a) A[Catch: all -> 0x004f] X.00a.A03 X.00a
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
    public static X.C00a A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v1 ??, still in use, count: 2, list:
          (r305v1 ??) from 0x004a: PHI (r305v2 ??) = (r305v1 ??), (r305v0 ??) binds: [B:28:0x0047, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
          (r305v1 ?? I:X.00a) from 0x0047: SPUT (r305v1 ?? I:X.00a) A[Catch: all -> 0x004f] X.00a.A03 X.00a
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

    public static File A01(C00a c00a, String str) {
        File A00;
        Context context = c00a.A00;
        if (C02r.A01(context, str) && (A00 = C02r.A00(context, str)) != null) {
            return A00;
        }
        if (!C02t.A00(context) || AnonymousClass036.A01(str) != 0S2.A0N) {
            return null;
        }
        String A02 = c00a.A02(str);
        if (A02 != null) {
            return c00a.A02.A02(str, A02);
        }
        0fH.A17("VoltronModuleManager", "Hash not found for module %s", new Object[]{str});
        return null;
    }

    public String A02(String str) {
        if (AnonymousClass036.A01(str) != 0S2.A0N) {
            return null;
        }
        00Y.A00().A08(this.A00);
        return 00Y.A00().A03(str);
    }

    public void A03(String str) {
        synchronized (this) {
            A04(str, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x02fb, code lost:
    
        if (r0.A09(r302) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02fe, code lost:
    
        r327 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0808, code lost:
    
        r0 = (java.lang.String[]) r0.toArray(new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x081c, code lost:
    
        X.0fH.A0a(r302, r0, r0, "FbVoltronModuleLoader", "dependent modules loaded: %s (%d) %s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0823, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x082a, code lost:
    
        if (r0 == null) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0833, code lost:
    
        r0.C3z(r0, r302, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x083c, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x084c, code lost:
    
        if (r0.hasNext() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0858, code lost:
    
        r0 = (java.lang.String) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0881, code lost:
    
        X.0fH.A0b(r0, java.lang.Integer.valueOf(r0.hashCode()), java.lang.Integer.valueOf(r327), "FbVoltronModuleLoader", "endLoadModule: %s (%s) %d");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0888, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x088f, code lost:
    
        if (r0 == null) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0894, code lost:
    
        r0.C4k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x08a9, code lost:
    
        X.0fH.A0d(r302, r0, "FbVoltronModuleLoader", "loadTopLevelModuleEnd: %s (%d)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x08b0, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x08b7, code lost:
    
        if (r0 == null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x08c0, code lost:
    
        r0.C4i(r0, r302, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x08c9, code lost:
    
        if (r316 == null) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x08ce, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x08da, code lost:
    
        r0.A06[r0] = r316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08df, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0994, code lost:
    
        r316 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0a5e, code lost:
    
        throw r316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x08e2, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x08e5, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x08f5, code lost:
    
        if (r0.get(r0) != false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08fa, code lost:
    
        r0.set(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0906, code lost:
    
        r0 = r0.A01.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0918, code lost:
    
        if (r0.hasNext() == false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0924, code lost:
    
        r0 = (X.0EF) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0949, code lost:
    
        r0.A01.execute(new X.0Jo(r0, X.AnonymousClass036.getModuleName(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0968, code lost:
    
        if (X.0fH.A01.BTv(3) == false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0989, code lost:
    
        X.0fH.A0d(java.lang.Integer.valueOf(r0), X.AnonymousClass036.getModuleName(r0), "AppModuleStateCache", "setModuleLoaded: index = %d (%s)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0990, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x099c, code lost:
    
        r316 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x09a9, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x09c7, code lost:
    
        r0 = (java.lang.String) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x09ce, code lost:
    
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x09fa, code lost:
    
        X.0fH.A0b(r0, java.lang.Integer.valueOf(r0.hashCode()), java.lang.Integer.valueOf(r327), "FbVoltronModuleLoader", "endLoadModule: %s (%s) %d");
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0a01, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0a08, code lost:
    
        if (r0 != null) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0a0d, code lost:
    
        r0.C4k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0a17, code lost:
    
        r0 = r301.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0a1f, code lost:
    
        if (r327 == 0) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0a22, code lost:
    
        r307 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0a3e, code lost:
    
        X.0fH.A0d(r302, java.lang.Integer.valueOf(r0), "FbVoltronModuleLoader", "loadTopLevelModuleEnd: %s (%d)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0a45, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0a4c, code lost:
    
        if (r0 != null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0a55, code lost:
    
        r0.C4i(r0, r302, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0309, code lost:
    
        r0 = new java.util.LinkedList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0313, code lost:
    
        r0 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0327, code lost:
    
        if (X.AnonymousClass036.A00(r302) != 17) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x033c, code lost:
    
        if (X.C02r.A01(r0.A00, r302) == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0348, code lost:
    
        X.0fH.A0h(r302, "FbVoltronModuleLoader", "skipping dex loading for %s since it's dex optimized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0358, code lost:
    
        if (r0.isEmpty() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x035d, code lost:
    
        r0.add(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0365, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0377, code lost:
    
        if (r0.hasNext() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0383, code lost:
    
        r0 = (java.lang.String) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0391, code lost:
    
        r330 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0396, code lost:
    
        if (r0.A02 == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0399, code lost:
    
        r330 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x039c, code lost:
    
        r315 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03b2, code lost:
    
        if (X.AnonymousClass036.A01(r0) == X.0S2.A0N) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03c6, code lost:
    
        X.00Y.A00().A08(r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03d3, code lost:
    
        r319 = X.00Y.A00().A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x03e2, code lost:
    
        if (r319 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x03e8, code lost:
    
        r323 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0418, code lost:
    
        r0 = X.AnonymousClass036.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0428, code lost:
    
        if (r0 == X.0S2.A01) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0434, code lost:
    
        if (r0 == X.0S2.A0C) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x044a, code lost:
    
        if (r323 == null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0456, code lost:
    
        if (r323.exists() != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x049b, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x04f6, code lost:
    
        r0 = new X.03V(r0.A00, new java.io.File((java.io.File) X.00V.A00(r0, r0, r319), X.0Pz.A0j("lib-compressed", java.io.File.separator, android.os.Build.CPU_ABI)), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0501, code lost:
    
        monitor-enter(X.0gC.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0509, code lost:
    
        if (X.0gC.A00 == null) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0510, code lost:
    
        r0 = X.0gC.A00(r0, r323, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0519, code lost:
    
        if (r0 != null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x051c, code lost:
    
        r310 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0531, code lost:
    
        monitor-exit(X.0gC.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0534, code lost:
    
        if (r310 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0543, code lost:
    
        X.0fH.A0g(r0, "FbVoltronModuleLoader", "Did not loadNativeLibraries for module name = %s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0548, code lost:
    
        r0 = X.00Y.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x054f, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0559, code lost:
    
        r0 = r0.A05.contains(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0564, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x056d, code lost:
    
        if ((!r0) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0591, code lost:
    
        X.0fH.A0g(r0, "FbVoltronModuleLoader", "Completed loadNativeLibraries for module name = %s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x05a1, code lost:
    
        X.0fH.A0d(r0, r0, "FbVoltronModuleLoader", "native lib loaded: %s (%d)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05a8, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x05af, code lost:
    
        if (r0 == null) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05b6, code lost:
    
        r0.C8Q(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0527, code lost:
    
        X.0gC.A02(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x052d, code lost:
    
        r310 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x07a4, code lost:
    
        throw X.0Pz.A08("FbSoLoader.init() was not called prior to loading additional asset: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x07a5, code lost:
    
        r313 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0574, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0582, code lost:
    
        if (r315 >= r330) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x05c9, code lost:
    
        if (r0.A03 != false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x05da, code lost:
    
        r313 = X.AnonymousClass001.A0G(X.0Pz.A0W("SoLoader unable to to load lib in - ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0488, code lost:
    
        r0.A00.getAssets().open(X.0Pz.A0j(r0, java.io.File.separator, "libs.txt")).close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0494, code lost:
    
        r323 = X.AnonymousClass001.A0B(r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x03ee, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x03f5, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0407, code lost:
    
        if (X.C02r.A01(r0, r0) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x040c, code lost:
    
        r323 = X.C02r.A00(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0415, code lost:
    
        if (r323 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x043e, code lost:
    
        r323 = r0.A02(r0, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x03dd, code lost:
    
        r319 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x07e1, code lost:
    
        X.0fH.A0g(r302, "FbVoltronModuleLoader", "Loaded store %s");
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x07e8, code lost:
    
        r316 = r0;
        r327 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0604, code lost:
    
        r0 = com.facebook.common.dextricks.DexStore.findOpened((java.io.File) r0.A04.A03(r302, X.00Y.A00().A03(r302)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x060d, code lost:
    
        if (r0 == null) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x061c, code lost:
    
        r0 = r0.loadAll(1, null, r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0645, code lost:
    
        X.0fH.A0a(r302, r0.odexSchemeName, java.lang.Integer.valueOf(r0.loadResult), "FbVoltronModuleLoader", "Loaded store %s: Scheme %s, Result: %d");
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x064c, code lost:
    
        r0 = r0.mLoadedDexFiles;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0651, code lost:
    
        r0 = r0.loadManifest();
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x065a, code lost:
    
        if (r0 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0681, code lost:
    
        ((X.00Z) r0).A00 = (dalvik.system.DexFile[]) r0.toArray(new dalvik.system.DexFile[r0.size()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x068f, code lost:
    
        if (r0.isEmpty() != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x069d, code lost:
    
        X.0fH.A0d(r302, r0, "FbVoltronModuleLoader", "dex loaded: %s (%d)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x06a4, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x06ab, code lost:
    
        if (r0 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x06b2, code lost:
    
        r0.Btd(r0, r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x06bb, code lost:
    
        r0 = r0.dexes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x06c0, code lost:
    
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x06c5, code lost:
    
        r0 = new java.lang.String[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x06d2, code lost:
    
        ((X.00Z) r0).A01 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x06d8, code lost:
    
        r326 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x06e1, code lost:
    
        if (r326 >= r0) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x06f6, code lost:
    
        r0[r326] = r0[r326].canaryClass;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x06fb, code lost:
    
        r326 = r326 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0704, code lost:
    
        r0.addFirst(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x070e, code lost:
    
        r0 = new java.util.ArrayDeque();
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0715, code lost:
    
        r0.add(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0724, code lost:
    
        if (r0.isEmpty() != false) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x072e, code lost:
    
        r0 = (java.lang.String) r0.removeFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x073a, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0740, code lost:
    
        r315 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0747, code lost:
    
        r0 = X.AnonymousClass036.A1W(r0, r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0750, code lost:
    
        if (r0 == null) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0755, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x075d, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0764, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0776, code lost:
    
        if (r0.hasNext() == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0779, code lost:
    
        r0 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0784, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x078c, code lost:
    
        r0.addFirst(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0135, code lost:
    
        if (r0 != X.0S2.A0C) goto L65;
     */
    /* JADX WARN: Type inference failed for: r0v106, types: [X.00Z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(java.lang.String r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 2665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00a.A04(java.lang.String, boolean):void");
    }
}
