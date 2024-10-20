package com.facebook.maps.ttrc.common;

import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import X.C01s;
import X.C47t;
import X.GOn;
import X.KOs;
import X.Kex;
import X.Kll;
import X.KrZ;
import X.LjI;
import android.util.Pair;
import com.facebook.quicklog.MarkerEditor;
import java.util.Map;
import java.util.Set;

/* loaded from: MapboxTTRC.class */
public class MapboxTTRC {
    public static C01s sFbErrorReporter;
    public static MapboxTTRC sInstance;
    public static int sStyleImageMissingCount = 1;
    public static C47t sTTRCTrace;
    public static Kex sTTRCTraceProvider;
    public static int sUncategorizedResponseCount = 0;
    public static int sUnknownEndMarkerId = 900;
    public static final Map mSeenUrls = AnonymousClass001.A0u();
    public static final KrZ sMidgardRequests = new KrZ();
    public static final Kll sMidgardRequestTracker = new Kll(new LjI());

    public static void cancel(String str) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                0fH.A0g(str, "MapboxTTRC", "trace cancelled %s");
                sTTRCTrace.BYH(str);
            }
            clearTrace();
        }
    }

    public static void clearTrace() {
        synchronized (MapboxTTRC.class) {
            mSeenUrls.clear();
            KrZ krZ = sMidgardRequests;
            krZ.A02.clear();
            krZ.A00 = 0;
            krZ.A01 = 0;
            sStyleImageMissingCount = 1;
            Kll kll = sMidgardRequestTracker;
            kll.A02 = -1;
            kll.A06.clear();
            kll.A00 = 0;
            kll.A01 = 0;
            kll.A03 = false;
            sUncategorizedResponseCount = 0;
            sTTRCTrace = null;
        }
    }

    public static void fail(String str) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                0fH.A0g(str, "MapboxTTRC", "TTRC trace failed: %s");
                sTTRCTrace.ARr(str);
                sFbErrorReporter.D0v("MapboxTTRC", str);
            }
            clearTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.maps.ttrc.common.MapboxTTRC, java.lang.Object] */
    public static void initialize(C01s c01s, Kex kex) {
        synchronized (MapboxTTRC.class) {
            if (sInstance == null) {
                ?? obj = new Object();
                sTTRCTraceProvider = kex;
                sFbErrorReporter = c01s;
                KOs[] values = KOs.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    mSeenUrls.put(values[i2], new KrZ());
                    i = i2 + 1;
                }
                sInstance = obj;
            }
        }
    }

    public static void onMapStyleLoadFinish() {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                0fH.A0j("MapboxTTRC", "Map style finished loading");
                sTTRCTrace.D2X("style_loaded");
            }
        }
    }

    public static void onMidgardRequest(String str, int i, int i2, int i3, String str2) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                KrZ krZ = sMidgardRequests;
                krZ.A01(str, "Midgard");
                Kll kll = sMidgardRequestTracker;
                C47t c47t = sTTRCTrace;
                if (!kll.A03) {
                    if (kll.A02 == -1) {
                        c47t.Bci("zoom_invalid", true);
                        kll.A05.run();
                        kll.A03 = true;
                    }
                    if (i == kll.A02) {
                        Set set = kll.A06;
                        if (!set.contains(str)) {
                            set.add(str);
                        }
                    }
                }
                String A0T = 0Pz.A0T("midgard_request_", krZ.A00(str));
                MarkerEditor DAi = sTTRCTrace.DAi();
                DAi.point(0Pz.A0j(A0T, "_", "begin"));
                DAi.markerEditingCompleted();
            }
        }
    }

    public static void onMidgardResponse(String str, int i, int i2, int i3) {
        synchronized (MapboxTTRC.class) {
            if (sTTRCTrace != null) {
                KrZ krZ = sMidgardRequests;
                if (!krZ.A02.containsKey(str)) {
                    krZ.A01++;
                }
                Kll kll = sMidgardRequestTracker;
                if (!kll.A03) {
                    Set set = kll.A06;
                    if (set.contains(str)) {
                        int i4 = kll.A01 + 1;
                        kll.A01 = i4;
                        if (i4 == kll.A00) {
                            kll.A05.run();
                            kll.A03 = true;
                        } else {
                            set.remove(str);
                        }
                    }
                }
                String A0T = 0Pz.A0T("midgard_request_", krZ.A00(str));
                MarkerEditor DAi = sTTRCTrace.DAi();
                DAi.point(0Pz.A0j(A0T, "_", "end"));
                DAi.markerEditingCompleted();
                0fH.A0a(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), "MapboxTTRC", "Midgard response for tile: %d %d %d");
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v5 ??, still in use, count: 2, list:
          (r310v5 ??) from 0x0099: PHI (r310v2 ??) = (r310v1 ??), (r310v5 ??) binds: [B:30:0x0080, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
          (r310v5 ?? I:java.lang.Object) from 0x0093: INVOKE (r0v11 ?? I:java.util.Map), (r0v8 ?? I:java.lang.Object), (r310v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0111, MD:(K, V):V (c)]
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
    public static void onUrlRequest(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v5 ??, still in use, count: 2, list:
          (r310v5 ??) from 0x0099: PHI (r310v2 ??) = (r310v1 ??), (r310v5 ??) binds: [B:30:0x0080, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
          (r310v5 ?? I:java.lang.Object) from 0x0093: INVOKE (r0v11 ?? I:java.util.Map), (r0v8 ?? I:java.lang.Object), (r310v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0111, MD:(K, V):V (c)]
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r311 == 999) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void onUrlResponse(int r301, int r302, java.lang.String r303, boolean r304, int r305) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.maps.ttrc.common.MapboxTTRC.onUrlResponse(int, int, java.lang.String, boolean, int):void");
    }

    public static Pair projectCoordinateToTile(double d, double d2, int i) {
        double d3 = 1 << i;
        return GOn.A0G(Double.valueOf(((d2 + 180.0d) * d3) / 360.0d), Double.valueOf(((180.0d - (Math.log(Math.tan(((Math.max(-85.0511287798066d, Math.min(85.0511287798066d, d)) * 3.141592653589793d) / 360.0d) + 0.7853981633974483d)) * 57.29577951308232d)) * d3) / 360.0d));
    }
}
