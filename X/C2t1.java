package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.interstitial.api.FQLFetchInterstitialResult;
import com.facebook.interstitial.api.GraphQLInterstitialsResult;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.collect.ArrayListMultimap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* renamed from: X.2t1, reason: invalid class name */
/* loaded from: 2t1.class */
public final class C2t1 implements CallerContextable {
    public static final String __redex_internal_original_name = "InterstitialManager";
    public int A00;
    public int A01;
    public boolean A03;
    public boolean A04;
    public final 1Br A0C = 1Bu.A00(98767);
    public final 1Br A09 = 1Bu.A00(17108);
    public final 1Br A0B = 1Bq.A00(33013);
    public final 1Br A0A = 1Bq.A00(16511);
    public final 1Br A08 = 1Bq.A00(99390);
    public final 1Br A07 = 1Bq.A00(66191);
    public final 1Br A0E = 1Bq.A00(68406);
    public final 1Br A0F = 1Bq.A00(49412);
    public final C2t2 A05 = new C2t2(true);
    public final 1Br A06 = 1Bq.A00(98775);
    public final 1Br A0H = 1Bq.A00(98771);
    public final 1Br A0D = 1Bq.A00(16385);
    public final 1Br A0G = 1Bu.A00(16428);
    public String A02 = "";

    public C2t1() {
        int i = (-1) << (-1);
        this.A00 = i;
        this.A01 = i;
    }

    private final int A00() {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            int i = this.A01;
            if (i == ((-1) << (-1))) {
                i = ((FbSharedPreferences) this.A0B.A00.get()).ArU(2tP.A01, 0);
                this.A01 = i;
            }
            c2t2.A01();
            return i;
        } catch (Throwable th) {
            c2t2.A01();
            throw th;
        }
    }

    public static final 2tJ A01(FbUserSession fbUserSession, C2t1 c2t1, InterstitialTrigger interstitialTrigger, Class cls) {
        0Q8 th;
        ArrayList arrayList;
        int i;
        C00j.A07("InterstitialManager#getBestInterstitialForTrigger(%s)", interstitialTrigger, 215619638);
        try {
            2tJ r311 = null;
            if (((1CO) ((2tK) c2t1.A0C.A00.get()).A00.A00.get()).AZk(2342159130954835751L)) {
                java.util.Map map = ((2tL) 1Lm.A06(fbUserSession, 17107)).A00;
                if (map.containsKey(2tM.class)) {
                    map.get(2tM.class);
                    Object obj = null;
                    obj.getClass();
                    th = 0Q8.createAndThrow();
                    throw th;
                }
                0fH.A07(C2t1.class, interstitialTrigger, "Check if interstitial for trigger is blocked: %s");
            }
            c2t1.A0C(fbUserSession, interstitialTrigger);
            c2t1.A0B(fbUserSession, interstitialTrigger);
            2tO r0 = (2tO) A07(fbUserSession).get(interstitialTrigger);
            if (r0 != null) {
                if (r0.A05) {
                    synchronized (r0) {
                        try {
                            SortedSet sortedSet = r0.A04;
                            arrayList = new ArrayList(sortedSet.size());
                            Iterator it = sortedSet.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C44r) it.next()).A01);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1607101863;
                            break;
                        }
                        2xB r02 = (2xB) it2.next();
                        2tJ A00 = r02.A00();
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c2t1.A0E.A00.get();
                        lightweightQuickPerformanceLogger.markerStart(196627);
                        lightweightQuickPerformanceLogger.markerTag(196627, interstitialTrigger.toString());
                        lightweightQuickPerformanceLogger.markerTag(196627, r02.A02);
                        Integer A04 = A04(c2t1, r02, interstitialTrigger);
                        lightweightQuickPerformanceLogger.markerEnd(196627, (short) 2);
                        if (A04 == 0S2.A00) {
                            if (cls.isInstance(A00)) {
                                r311 = A00;
                            }
                            i = -363059085;
                        }
                    }
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Trigger ");
                    A0k.append(r0.A00);
                    th = AnonymousClass002.A0F(" is not know to be fully restored!", A0k);
                }
                throw th;
            }
            i = 963217352;
            C00j.A01(i);
            return r311;
        } catch (Throwable th3) {
            C00j.A01(2014910559);
            throw th3;
        }
    }

    public static final 2xB A02(FbUserSession fbUserSession, C2t1 c2t1, InterstitialTrigger interstitialTrigger, Class cls, String str) {
        2xB r307;
        C2t2 c2t2 = c2t1.A05;
        c2t2.A00();
        try {
            c2t1.A0C(fbUserSession, interstitialTrigger);
            if (cls != null) {
                c2t1.A0B(fbUserSession, interstitialTrigger);
            }
            2tO r0 = (2tO) A07(fbUserSession).get(interstitialTrigger);
            if (r0 == null) {
                r307 = null;
            } else {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                if (!r0.A05) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Trigger ");
                    A0k.append(r0.A00);
                    th = AnonymousClass002.A0F(" is not know to be fully restored!", A0k);
                    throw th;
                }
                synchronized (r0) {
                    11T.A0F(str, 0);
                    if (!r0.A05) {
                        throw AnonymousClass001.A0N("Before checking contain trigger controllers must be known to be fully restored!");
                    }
                    C44r c44r = (C44r) r0.A03.get(str);
                    r307 = c44r == null ? null : c44r.A01;
                }
            }
            c2t2.A01();
            return r307;
        } catch (Throwable th2) {
            c2t2.A01();
            throw th2;
        }
    }

    public static final 2tO A03(FbUserSession fbUserSession, InterstitialTrigger interstitialTrigger, String str) {
        java.util.Map A07 = A07(fbUserSession);
        2tO r304 = (2tO) A07.get(interstitialTrigger);
        if (r304 == null) {
            r304 = new 2tO(interstitialTrigger, str);
            A07.put(interstitialTrigger, r304);
        }
        return r304;
    }

    public static final Integer A04(C2t1 c2t1, 2xB r302, InterstitialTrigger interstitialTrigger) {
        2xA r0;
        if (r302 != null) {
            2tJ A00 = r302.A00();
            synchronized (r302) {
                r0 = r302.A00;
            }
            if (A00 == null) {
                0fH.A0S(C2t1.class, "Interstitial with id %s is not initialized!", new Object[]{r302.A02});
                return 0S2.A0j;
            }
            if (r0 != null) {
                long Axp = A00.Axp();
                if (Axp > 0) {
                    String Arn = A00.Arn();
                    A0F(c2t1);
                    if (((C0dp) c2t1.A08.A00.get()).now() < ((FbSharedPreferences) c2t1.A0B.A00.get()).Av1(((2tR) 2tQ.A00().A00.get()).A03(Arn), 0L) + Axp) {
                        return 0S2.A0Y;
                    }
                }
                int Avl = r0.Avl();
                return (Avl <= 0 || ((C12044yi) c2t1.A0F.A00.get()).A03("interstitial_views", r302.A02) < Avl) ? A00.BC9(interstitialTrigger) != C4Hx.A02 ? 0S2.A0C : 0S2.A00 : 0S2.A0N;
            }
        }
        return 0S2.A01;
    }

    private final String A05() {
        if (!((2yD) this.A0D.A00.get()).AZk(36325965806195844L)) {
            String A00 = new C30G(26).A00();
            if (A00 == null) {
                A00 = "";
            }
            return A00;
        }
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            String A002 = new C30G(26).A00();
            if (A002 == null) {
                A002 = "";
            }
            c2t2.A01();
            return A002;
        } catch (Throwable th) {
            c2t2.A01();
            throw th;
        }
    }

    private final String A06() {
        String str;
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            String str2 = this.A02;
            str = "";
            if (str.equals(str2)) {
                A0F(this);
                String BD0 = ((FbSharedPreferences) this.A0B.A00.get()).BD0((1G2) ((2tR) 2tQ.A00().A00.get()).A08.getValue());
                str = BD0 != null ? BD0 : "";
                this.A02 = str;
                str2 = str;
            }
            c2t2.A01();
            return str2;
        } catch (Throwable th) {
            c2t2.A01();
            throw th;
        }
    }

    public static final java.util.Map A07(FbUserSession fbUserSession) {
        return ((2tN) 1Lm.A06(fbUserSession, 98776)).A02;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v3 ??, still in use, count: 2, list:
          (r318v3 ??) from 0x012a: PHI (r318v2 ??) = (r318v1 ??), (r318v3 ??) binds: [B:53:0x010f, B:58:0x0122] A[DONT_GENERATE, DONT_INLINE]
          (r318v3 ?? I:java.lang.Object) from 0x0124: INVOKE (r0v61 ?? I:java.util.Map), (r0v54 ?? I:java.lang.Object), (r318v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x01c5, MD:(K, V):V (c)]
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
    public static final java.util.Set A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v3 ??, still in use, count: 2, list:
          (r318v3 ??) from 0x012a: PHI (r318v2 ??) = (r318v1 ??), (r318v3 ??) binds: [B:53:0x010f, B:58:0x0122] A[DONT_GENERATE, DONT_INLINE]
          (r318v3 ?? I:java.lang.Object) from 0x0124: INVOKE (r0v61 ?? I:java.util.Map), (r0v54 ?? I:java.lang.Object), (r318v3 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x01c5, MD:(K, V):V (c)]
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

    private final void A09() {
        int i;
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            if (!this.A03) {
                C00j.A05("InterstitialManager#maybeClearStaleData", 1358087918);
                try {
                    if (A0W()) {
                        0fH.A03(C2t1.class, Integer.valueOf(A00()), 3, A06(), A05(), "Clearing Interstitial Manager for new data version: Data store %d=>%d, Query %s => %s");
                        1Ql edit = ((FbSharedPreferences) this.A0B.A00.get()).edit();
                        11T.A0A(edit);
                        A0F(this);
                        ((2tV) 2tQ.A01().A00.get()).A02(edit);
                        A0I(edit);
                        A0K(edit);
                        FbInjector.A00();
                        1G2 A0D = ((4IL) 1Bn.A0A(33255)).A01().A0D(C09814rl.class.getName());
                        11T.A0A(A0D);
                        edit.Cdj(A0D);
                        edit.commit();
                        this.A03 = true;
                        i = -175188191;
                    } else {
                        this.A03 = true;
                        i = -239521431;
                    }
                    C00j.A01(i);
                } catch (Throwable th) {
                    C00j.A01(1390392689);
                    throw th;
                }
            }
        } finally {
            c2t2.A01();
        }
    }

    public static final void A0A(FbUserSession fbUserSession, C2t1 c2t1) {
        C2t2 c2t2 = c2t1.A05;
        c2t2.A00();
        try {
            C00j.A05("InterstitialManager#RestoreInterstitialDataFromPreferences", 1187471324);
            try {
                c2t1.A0E(fbUserSession, ((2tY) c2t1.A09.A00.get()).A01());
                c2t2.A00();
                try {
                    Iterator it = A07(fbUserSession).values().iterator();
                    while (it.hasNext()) {
                        ((2tO) it.next()).A05 = true;
                    }
                    c2t2.A01();
                    C00j.A01(1109213531);
                } finally {
                    c2t2.A01();
                }
            } catch (Throwable th) {
                C00j.A01(-1965149360);
                throw th;
            }
        } finally {
        }
    }

    private final void A0B(FbUserSession fbUserSession, InterstitialTrigger interstitialTrigger) {
        Collection<String> AUe;
        C00i c00i = this.A09.A00;
        2tX r0 = (2tY) c00i.get();
        int i = interstitialTrigger.A00;
        2tX r02 = r0;
        synchronized (r02) {
            if (r02.A00 == null) {
                ArrayListMultimap arrayListMultimap = new ArrayListMultimap();
                r02.A00 = arrayListMultimap;
                arrayListMultimap.CZw(1043, "11130");
                r02.A00.CZw(1088, "6972");
                r02.A00.CZw(561, "8435");
                r02.A00.CZw(562, "8435");
                r02.A00.CZw(563, "8435");
                r02.A00.CZw(1091, "12180");
                r02.A00.CZw(1097, "12211");
                r02.A00.CZw(798, "9821");
                r02.A00.CZw(21, "11365");
                r02.A00.CZw(901, "10508");
                r02.A00.CZw(911, "10508");
                r02.A00.CZw(37, "4828");
                r02.A00.CZw(48, "7004");
                r02.A00.CZw(49, "7615");
                r02.A00.CZw(18, "4745");
                r02.A00.CZw(17, "4744");
                r02.A00.CZw(16, "4743");
                r02.A00.CZw(15, "2415");
                r02.A00.CZw(19, "2415");
                r02.A00.CZw(593, "2415");
                r02.A00.CZw(594, "2415");
                r02.A00.CZw(24, "2415");
                r02.A00.CZw(1087, "2415");
                r02.A00.CZw(21, "2415");
                r02.A00.CZw(901, "2415");
                r02.A00.CZw(925, "2415");
                r02.A00.CZw(934, "2415");
                r02.A00.CZw(940, "2415");
                r02.A00.CZw(941, "2415");
                r02.A00.CZw(23, "4408");
                r02.A00.CZw(30, "8470");
                r02.A00.CZw(28, "8470");
                r02.A00.CZw(784, "8470");
                r02.A00.CZw(24, "3545");
                r02.A00.CZw(25, "3545");
                r02.A00.CZw(27, "3545");
                r02.A00.CZw(29, "3545");
                r02.A00.CZw(1011, "3545");
                r02.A00.CZw(1025, "3545");
                r02.A00.CZw(26, "3545");
                r02.A00.CZw(1021, "3545");
                r02.A00.CZw(949, "3545");
                r02.A00.CZw(1049, "3545");
                r02.A00.CZw(1050, "3545");
                r02.A00.CZw(24, "10896");
                r02.A00.CZw(37, "5579");
                r02.A00.CZw(21, "3543");
                r02.A00.CZw(22, "3543");
                r02.A00.CZw(21, "5411");
                r02.A00.CZw(22, "5411");
                r02.A00.CZw(616, "7190");
                r02.A00.CZw(989, "11105");
                r02.A00.CZw(176, "1820");
                r02.A00.CZw(198, "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.ON_ATTACH_FRAGMENT), "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.DISPLAYED), "1820");
                r02.A00.CZw(178, "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES), "1820");
                r02.A00.CZw(128, "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.MESSENGER_DELTA_REQUEST), "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.APP_FIRST_VIEW_CONTROLLER), "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.MESSENGER_THREAD_LIST_LOADED), "1820");
                r02.A00.CZw(Integer.valueOf(ActionId.MESSENGER_THREAD_LIST_DISPLAYED), "1820");
                r02.A00.CZw(439, "1820");
                r02.A00.CZw(1084, "12115");
                r02.A00.CZw(1082, "12057");
                r02.A00.CZw(Integer.valueOf(ActionId.ASNYC_FAILED), "9054");
                r02.A00.CZw(1057, "11213");
                r02.A00.CZw(21, "11480");
            }
            AUe = r02.A00.AUe(Integer.valueOf(i));
        }
        for (String str : AUe) {
            2tY r03 = (2tY) c00i.get();
            11T.A0F(fbUserSession, 0);
            11T.A0F(str, 1);
            2tJ A00 = r03.A00(fbUserSession, str);
            if (2tZ.class.isInstance(A00)) {
                11T.A0I(A00, "null cannot be cast to non-null type T of com.facebook.interstitial.manager.InterstitialControllersHolder.getController");
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x0176: PHI (r314v1 ??) = (r314v0 ??), (r314v4 ??) binds: [B:199:0x0170, B:62:0x0116] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:java.util.AbstractCollection) from 0x0172: INVOKE (r314v0 ?? I:java.util.AbstractCollection), (r0v86 ?? I:java.util.Collection) VIRTUAL call: java.util.AbstractCollection.addAll(java.util.Collection):boolean A[Catch: all -> 0x03b9, MD:(java.util.Collection<? extends E>):boolean (c)]
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
    private final void A0C(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v0 ??, still in use, count: 2, list:
          (r314v0 ??) from 0x0176: PHI (r314v1 ??) = (r314v0 ??), (r314v4 ??) binds: [B:199:0x0170, B:62:0x0116] A[DONT_GENERATE, DONT_INLINE]
          (r314v0 ?? I:java.util.AbstractCollection) from 0x0172: INVOKE (r314v0 ?? I:java.util.AbstractCollection), (r0v86 ?? I:java.util.Collection) VIRTUAL call: java.util.AbstractCollection.addAll(java.util.Collection):boolean A[Catch: all -> 0x03b9, MD:(java.util.Collection<? extends E>):boolean (c)]
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

    private final void A0D(FbUserSession fbUserSession, Collection collection) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            if (!collection.isEmpty()) {
                A09();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) 1Bi.A03(68406);
                lightweightQuickPerformanceLogger.markerStart(196632);
                A0F(this);
                1Br A01 = 2tQ.A01();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    2tV r0 = (2tV) A01.A00.get();
                    11T.A0F(str, 0);
                    1G2 A012 = 2tV.A00(r0).A01(str);
                    1G2 A02 = 2tV.A00(r0).A02(str);
                    C00i c00i = r0.A03.A00;
                    String BD0 = ((FbSharedPreferences) c00i.get()).BD0(A012);
                    if (BD0 == null) {
                        BD0 = "";
                    }
                    int ArU = ((FbSharedPreferences) c00i.get()).ArU(A02, 0);
                    if (BD0.length() != 0) {
                        2xA A013 = r0.A01(str, BD0, ArU);
                        if (A013 != null && A013.isValid()) {
                            arrayList.add(A013);
                        }
                    }
                    arrayList2.add(str);
                }
                lightweightQuickPerformanceLogger.markerEnd(196632, (short) 2);
                if (!arrayList2.isEmpty()) {
                    0fH.A07(C2t1.class, arrayList2, "Failed to process Ids: %s");
                }
                A08(fbUserSession, this, arrayList, true);
            }
        } finally {
            c2t2.A01();
        }
    }

    private final void A0E(FbUserSession fbUserSession, Collection collection) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        if (collection != null) {
            try {
                if (!collection.isEmpty()) {
                    C00j.A05("InterstitialManager#restoreControllerIdsIfNeeded", 1738736689);
                    try {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!A0M(fbUserSession, str)) {
                                arrayList.add(str);
                            }
                        }
                        A0D(fbUserSession, arrayList);
                        C00j.A01(-80396740);
                    } catch (Throwable th) {
                        C00j.A01(-2143220614);
                        throw th;
                    }
                }
            } finally {
                c2t2.A01();
            }
        }
    }

    public static final void A0F(C2t1 c2t1) {
        c2t1.A0H.A00.get();
    }

    public static final void A0G(C2t1 c2t1, 1Ql r302, List list, java.util.Map map) {
        int i;
        String A0W;
        C00j.A05("InterstitialManager#cacheInterstitialData", 1747042734);
        try {
            A0F(c2t1);
            2tV r0 = (2tV) 2tQ.A01().A00.get();
            synchronized (r0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    2xA r02 = (2xA) it.next();
                    String Azq = r02.Azq();
                    if (Azq != null) {
                        1G2 A01 = 2tV.A00(r0).A01(Azq);
                        1G2 A02 = 2tV.A00(r0).A02(Azq);
                        if (!(r02 instanceof FQLFetchInterstitialResult)) {
                            if (!(r02 instanceof GraphQLInterstitialsResult)) {
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("Unknown Interstitial Result type: ");
                                throw AnonymousClass001.A0G(AnonymousClass001.A0a(r02.getClass(), A0k));
                                break;
                            }
                            i = 1;
                        } else {
                            i = 0;
                        }
                        try {
                            try {
                                A0W = ((AnonymousClass244) r0.A04.A00.get()).A0W(r02);
                            } catch (Exception e) {
                                1Br.A04(r0.A02).softReport("UserInterstitialRepository", "Failed to serialize interstitial data", e);
                            }
                            if (A0W != null) {
                                r302.CaL(A01, A0W);
                                r302.CaE(A02, i);
                            } else {
                                r302.Cdj(A01);
                                r302.Cdj(A02);
                            }
                        } catch (IOException e2) {
                            1Br.A04(r0.A02).softReport("UserInterstitialRepository", "Failed to serialize interstitial data", e2);
                            r302.Cdj(A01);
                            r302.Cdj(A02);
                        }
                    }
                }
            }
            c2t1.A0L(r302, map);
            c2t1.A0I(r302);
            c2t1.A0J(r302);
            c2t1.A0K(r302);
            C00j.A01(1434990431);
        } catch (Throwable th) {
            C00j.A01(-1206392805);
            throw th;
        }
    }

    public static final void A0H(C2t1 c2t1, Collection collection) {
        C2t2 c2t2 = c2t1.A05;
        c2t2.A00();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((2tO) it.next()).A05 = true;
            }
        } finally {
            c2t2.A01();
        }
    }

    private final void A0I(1Ql r302) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            r302.CaE(2tP.A01, 3);
            this.A01 = (-1) << (-1);
        } finally {
            c2t2.A01();
        }
    }

    private final void A0J(1Ql r302) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            1G2 r0 = 2tP.A00;
            this.A07.A00.get();
            r302.CaE(r0, BuildConstants.A00());
            this.A00 = (-1) << (-1);
        } finally {
            c2t2.A01();
        }
    }

    private final void A0K(1Ql r302) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            A0F(this);
            r302.CaL((1G2) ((2tR) 2tQ.A00().A00.get()).A08.getValue(), A05());
            this.A02 = "";
        } finally {
            c2t2.A01();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6 A[Catch: all -> 0x0367, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x002e, B:7:0x0035, B:55:0x010b, B:57:0x010d, B:60:0x011c, B:61:0x0123, B:62:0x012a, B:63:0x0133, B:65:0x013b, B:67:0x0145, B:72:0x01f6, B:73:0x01fd, B:76:0x020b, B:77:0x0214, B:79:0x021d, B:87:0x023a, B:94:0x0244, B:95:0x024c, B:96:0x0255, B:99:0x0263, B:100:0x026c, B:101:0x0273, B:102:0x027c, B:103:0x0283, B:104:0x028b, B:106:0x0291, B:127:0x02ee, B:129:0x02f1, B:143:0x0350, B:153:0x0363, B:155:0x0366, B:162:0x014d, B:163:0x0155, B:165:0x015c, B:167:0x0162, B:168:0x0169, B:171:0x0177, B:172:0x0180, B:175:0x018c, B:177:0x0195, B:181:0x01bc, B:182:0x01c3, B:183:0x01ca, B:184:0x01d1, B:185:0x01da, B:187:0x01e5, B:190:0x035c, B:109:0x0293, B:110:0x0298, B:111:0x02a1, B:113:0x02a8, B:115:0x02af, B:116:0x02b6, B:119:0x02c4, B:120:0x02cd, B:121:0x02d4, B:122:0x02db, B:124:0x02e4, B:10:0x0038, B:11:0x003d, B:12:0x0044, B:13:0x004d, B:14:0x0054, B:15:0x005b, B:16:0x0062, B:17:0x006b, B:19:0x0074, B:23:0x0086, B:24:0x008b, B:26:0x0093, B:30:0x00a4, B:32:0x00ab, B:34:0x00b4, B:35:0x00ba, B:37:0x00c2, B:38:0x00cb, B:39:0x00d2, B:43:0x00e0, B:44:0x00e5, B:46:0x00ec, B:50:0x00fa, B:81:0x0220, B:83:0x0227, B:85:0x0230, B:131:0x02f4, B:135:0x0320, B:137:0x0329, B:141:0x0339, B:146:0x0346, B:148:0x0319), top: B:4:0x002e, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0L(X.1Ql r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t1.A0L(X.1Ql, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r0 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0M(com.facebook.auth.usersession.FbUserSession r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            X.2t2 r0 = r0.A05
            r304 = r0
            r0 = r304
            r0.A00()
            r0 = 98776(0x181d8, float:1.38415E-40)
            r305 = r0
            r0 = r302
            r1 = r305
            java.lang.Object r0 = X.1Lm.A06(r0, r1)     // Catch: java.lang.Throwable -> L67
            r306 = r0
            r0 = r306
            X.2tN r0 = (X.2tN) r0     // Catch: java.lang.Throwable -> L67
            r306 = r0
            r0 = r306
            java.util.Map r0 = r0.A01     // Catch: java.lang.Throwable -> L67
            r306 = r0
            r0 = r306
            r1 = r303
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L67
            r307 = r0
            r0 = r307
            X.2xB r0 = (X.2xB) r0     // Catch: java.lang.Throwable -> L67
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L5a
            r0 = r307
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L67
            r0 = r307
            boolean r0 = r0.A01     // Catch: java.lang.Throwable -> L4a
            r308 = r0
            r0 = r307
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L52
        L4a:
            r306 = move-exception
            r0 = r307
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            r0 = r306
            throw r0     // Catch: java.lang.Throwable -> L67
        L52:
            r0 = 1
            r305 = r0
            r0 = r308
            if (r0 != 0) goto L60
        L5a:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L60:
            r0 = r304
            r0.A01()
            r0 = r305
            return r0
        L67:
            r306 = move-exception
            r0 = r304
            r0.A01()
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t1.A0M(com.facebook.auth.usersession.FbUserSession, java.lang.String):boolean");
    }

    public final 2tJ A0N(InterstitialTrigger interstitialTrigger) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            return A0O(interstitialTrigger, 2tJ.class);
        } finally {
            c2t2.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r304 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        throw r304;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.2tJ A0O(com.facebook.interstitial.triggers.InterstitialTrigger r302, java.lang.Class r303) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A0G
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1EZ r0 = (X.1EZ) r0
            com.facebook.auth.usersession.FbUserSession r0 = X.1Fw.A04(r0)
            r304 = r0
            r0 = r301
            X.2t2 r0 = r0.A05
            r305 = r0
            r0 = r305
            r0.A00()
            r0 = r304
            r1 = r301
            r2 = r302
            r3 = r303
            X.2tJ r0 = A01(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc7
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lbf
            r0 = r306
            java.lang.String r0 = r0.Arn()     // Catch: java.lang.Throwable -> Lc7
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r307
            r1 = 0
            X.11T.A0F(r0, r1)     // Catch: java.lang.Throwable -> Lc7
            r0 = r301
            X.1Br r0 = r0.A08     // Catch: java.lang.Throwable -> Lc7
            r304 = r0
            r0 = r304
            X.00i r0 = r0.A00     // Catch: java.lang.Throwable -> Lc7
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc7
            r304 = r0
            r0 = r304
            X.0dp r0 = (X.C0dp) r0     // Catch: java.lang.Throwable -> Lc7
            r304 = r0
            r0 = r304
            long r0 = r0.now()     // Catch: java.lang.Throwable -> Lc7
            r308 = r0
            r0 = r305
            r0.A00()     // Catch: java.lang.Throwable -> Lc7
            r0 = r301
            A0F(r0)     // Catch: java.lang.Throwable -> Lb7
            X.1Br r0 = X.2tQ.A00()     // Catch: java.lang.Throwable -> Lb7 java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            X.00i r0 = r0.A00     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            X.2tR r0 = (X.2tR) r0     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            r1 = r307
            X.1G2 r0 = r0.A03(r1)     // Catch: java.lang.Throwable -> Lb7
            r307 = r0
            r0 = r301
            X.1Br r0 = r0.A0B     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            X.00i r0 = r0.A00     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            com.facebook.prefs.shared.FbSharedPreferences r0 = (com.facebook.prefs.shared.FbSharedPreferences) r0     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            X.1Ql r0 = r0.edit()     // Catch: java.lang.Throwable -> Lb7
            r304 = r0
            r0 = r304
            r1 = r307
            r2 = r308
            X.1Qk r0 = r0.CaH(r1, r2)     // Catch: java.lang.Throwable -> Lb7
            r0 = r304
            r0.commit()     // Catch: java.lang.Throwable -> Lb7
            r0 = r305
            r0.A01()     // Catch: java.lang.Throwable -> Lc7
            goto Lbf
        Lb7:
            r304 = move-exception
            r0 = r305
            r0.A01()     // Catch: java.lang.Throwable -> Lc7
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lbf:
            r0 = r305
            r0.A01()
            r0 = r306
            return r0
        Lc7:
            r304 = move-exception
            r0 = r305
            r0.A01()
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t1.A0O(com.facebook.interstitial.triggers.InterstitialTrigger, java.lang.Class):X.2tJ");
    }

    public final 2tJ A0P(InterstitialTrigger interstitialTrigger, Class cls) {
        FbUserSession A03 = 1Br.A03(this.A0G);
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            return A01(A03, this, interstitialTrigger, cls);
        } finally {
            c2t2.A01();
        }
    }

    public final 2tJ A0Q(Class cls, String str) {
        11T.A0F(str, 0);
        FbUserSession A04 = 1Fw.A04((1EZ) this.A0G.A00.get());
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            C00j.A05("InterstitialManager#getInterstitialControllerForId", -515614479);
            try {
                2tY r0 = (2tY) this.A09.A00.get();
                11T.A0F(A04, 0);
                2tJ A00 = r0.A00(A04, str);
                if (cls.isInstance(A00)) {
                    11T.A0I(A00, "null cannot be cast to non-null type T of com.facebook.interstitial.manager.InterstitialControllersHolder.getController");
                    if (A00 != null) {
                        c2t2.A00();
                        try {
                            C00j.A05("InterstitialManager#restoreControllersIfNeeded", -292790351);
                            try {
                                String Arn = A00.Arn();
                                if (!A0M(A04, Arn)) {
                                    List singletonList = Collections.singletonList(Arn);
                                    11T.A0A(singletonList);
                                    A0D(A04, singletonList);
                                }
                                C00j.A01(-1199649006);
                                c2t2.A01();
                            } catch (Throwable th) {
                                C00j.A01(-1156302120);
                                throw th;
                            }
                        } finally {
                            c2t2.A01();
                        }
                    }
                } else {
                    A00 = null;
                }
                C00j.A01(1244761476);
                c2t2.A01();
                return A00;
            } catch (Throwable th2) {
                C00j.A01(428726438);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final 2tJ A0R(String str) {
        11T.A0F(str, 0);
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            return A0Q(2tJ.class, str);
        } finally {
            c2t2.A01();
        }
    }

    public final FcX A0S() {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            return (FcX) 1Br.A0B(this.A06);
        } finally {
            c2t2.A01();
        }
    }

    public final void A0T(FbUserSession fbUserSession) {
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            F6D f6d = (F6D) 1Br.A0B(((2tN) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 98776)).A00);
            String str = F6D.A05;
            0fH.A0j(str, "Clear blocked triggers");
            C01i c01i = f6d.A04;
            ((HashSet) c01i.getValue()).clear();
            try {
                String A0W = ((AnonymousClass243) 1Br.A0B(f6d.A01)).A0W((HashSet) c01i.getValue());
                1Ql A08 = 1Br.A08(f6d.A02);
                A08.CaL((1G2) ((2tR) 1Br.A0B(f6d.A03)).A01.getValue(), A0W);
                A08.commitImmediately();
            } catch (2LD e) {
                1Br.A04(f6d.A00).softReport(str, "Failed to serialize blocked triggers", e);
            }
        } finally {
            c2t2.A01();
        }
    }

    public final void A0U(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            A09();
            c2t2.A00();
            if (this.A04) {
                0fH.A0A(C2t1.class, "maybeUpgradeFromPreviousAppVersion: Bailing since it has already been upgraded");
            } else {
                c2t2.A00();
                try {
                    int i = this.A00;
                    int i2 = (-1) << (-1);
                    if (i == i2) {
                        i = ((FbSharedPreferences) this.A0B.A00.get()).ArU(2tP.A00, i2);
                        this.A00 = i;
                    }
                    c2t2.A01();
                    this.A07.A00.get();
                    int A00 = BuildConstants.A00();
                    if (i != A00) {
                        0fH.A0V(Integer.valueOf(i), C2t1.class, "Upgrading Interstitial Manager for new application version: %d=>%d", Integer.valueOf(A00));
                        C00j.A05("InterstitialManager#forceOnAppUpgrade", -1510863511);
                        try {
                            1Ql edit = ((FbSharedPreferences) this.A0B.A00.get()).edit();
                            11T.A0A(edit);
                            A0A(fbUserSession, this);
                            A0L(edit, A07(fbUserSession));
                            A0J(edit);
                            edit.commit();
                            C00j.A01(1055859861);
                        } catch (Throwable th) {
                            th = th;
                            C00j.A01(844736740);
                            throw th;
                        }
                    }
                    this.A04 = true;
                } catch (Throwable th2) {
                    th = th2;
                    c2t2.A01();
                }
            }
            c2t2.A01();
        } catch (Throwable th3) {
            throw th3;
        } finally {
            c2t2.A01();
        }
    }

    public final void A0V(List list) {
        FbUserSession A04 = 1Fw.A04((1EZ) this.A0G.A00.get());
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            C00j.A05("InterstitialManager#resetEligibleInterstitialsWithFetchResults", -1219541493);
            try {
                1Ql edit = ((FbSharedPreferences) this.A0B.A00.get()).edit();
                11T.A0A(edit);
                c2t2.A00();
                try {
                    A0F(this);
                    ((2tV) 2tQ.A01().A00.get()).A02(edit);
                    c2t2.A01();
                    java.util.Map A07 = A07(A04);
                    A07.clear();
                    A0H(this, A08(A04, this, list, false));
                    A0G(this, edit, list, A07);
                    edit.commit();
                    C00j.A01(2072390080);
                } finally {
                    c2t2.A01();
                }
            } catch (Throwable th) {
                C00j.A01(1389615449);
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (X.11T.A0O(A05(), r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0W() {
        /*
            r301 = this;
            r0 = r301
            X.2t2 r0 = r0.A05
            r302 = r0
            r0 = r302
            r0.A00()
            r0 = r301
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L42
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L3c
            r0 = r301
            int r0 = r0.A00()     // Catch: java.lang.Throwable -> L42
            r305 = r0
            r0 = r301
            java.lang.String r0 = r0.A06()     // Catch: java.lang.Throwable -> L42
            r306 = r0
            r0 = 3
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L3a
            r0 = r301
            java.lang.String r0 = r0.A05()     // Catch: java.lang.Throwable -> L42
            r307 = r0
            r0 = r307
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)     // Catch: java.lang.Throwable -> L42
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3c
        L3a:
            r0 = 1
            r304 = r0
        L3c:
            r0 = r302
            r0.A01()
            r0 = r304
            return r0
        L42:
            r307 = move-exception
            r0 = r302
            r0.A01()
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t1.A0W():boolean");
    }

    public final boolean A0X(FbUserSession fbUserSession, String str) {
        11T.A0H(fbUserSession, str);
        C2t2 c2t2 = this.A05;
        c2t2.A00();
        try {
            return ((2tN) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 98776)).A01.containsKey(str);
        } finally {
            c2t2.A01();
        }
    }
}
