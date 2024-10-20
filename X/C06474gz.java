package X;

import android.util.SparseArray;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.traffic.ttrc.TrafficTtrcEventListener;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gz.class */
public final class C06474gz implements C4h0 {
    public List A01;
    public Executor A02;
    public final C00i A05 = new 1BQ(84488);
    public final C00i A07 = new 1BQ(68406);
    public final C00i A09 = new 1BQ(32848);
    public final C00i A04 = new 1BQ(16385);
    public final C00i A08 = new 1BQ(49830);
    public final C00i A06 = new 1BV(50186);
    public final Set A0B = Collections.synchronizedSet(new HashSet());
    public final SparseArray A03 = new SparseArray();
    public final Deque A0A = new LinkedList();
    public List A00 = new ArrayList();

    public static int A00(5TY r301) {
        int i = 0;
        if (r301 != null) {
            i = Arrays.hashCode(new Object[]{r301.A03, r301});
        }
        return i;
    }

    public static Executor A01(C06474gz c06474gz) {
        Executor executor;
        synchronized (c06474gz) {
            executor = c06474gz.A02;
            if (executor == null) {
                executor = 1NF.A00();
                c06474gz.A02 = executor;
            }
        }
        return executor;
    }

    public static void A02(5TY r301, C06474gz c06474gz, String str, long j) {
        int A00 = A00(r301);
        C00i c00i = c06474gz.A07;
        ((LightweightQuickPerformanceLogger) c00i.get()).markerPoint(25821186, A00, "onFetch", null, j, TimeUnit.MILLISECONDS);
        ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(25821186, A00, "fetch_type", str);
    }

    public static void A03(C06474gz c06474gz, String str, int i, long j) {
        if (j > 0) {
            ((LightweightQuickPerformanceLogger) c06474gz.A07.get()).markerPoint(25821186, i, str, null, j, TimeUnit.MILLISECONDS);
        }
    }

    public void A04(final 5TY r302) {
        synchronized (this) {
            Deque deque = this.A0A;
            if (deque.contains(r302.A04())) {
                deque.remove(r302.A04());
                A01(this).execute(new Runnable() { // from class: X.6uk
                    public static final String __redex_internal_original_name = "QPLDataNavigationLogger$6";

                    @Override // java.lang.Runnable
                    public void run() {
                        C06474gz c06474gz = this;
                        c06474gz.A09.get();
                        C6ur c6ur = (C6ur) c06474gz.A06.get();
                        String A04 = r302.A04();
                        C04r c04r = c6ur.A00;
                        List<Summary> list = (List) c04r.get(A04);
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        try {
                            for (Summary summary : list) {
                                if (summary != null) {
                                    String str = summary.prefetchPredictionID;
                                    if (!1JF.A0A(str)) {
                                        String[] split = str.split(":");
                                        Hde hde = (Hde) c6ur.A01.get();
                                        String str2 = split[0];
                                        String str3 = split[1];
                                        0fH.A0a(QoH.A03, str2, str3, "LooperLabeler", "label %s for model %s (%s)");
                                        long time = new Date().getTime();
                                        Long A0j = 4YV.A0j();
                                        HashMap A0u = AnonymousClass001.A0u();
                                        A0u.put("LABEL", true);
                                        Hdd hdd = new Hdd(ImmutableMap.copyOf((java.util.Map) A0u), A0j, time);
                                        HaB haB = hde.A00;
                                        haB.A01.execute(new J1s(hdd, haB, str2, str3));
                                    }
                                }
                            }
                            c04r.remove(A04);
                        } catch (Exception e) {
                            0fH.A0r("GraphQLAdaptivePrefetchManager", "Failed to send looper label ", e);
                        }
                    }
                });
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x0018: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x0008, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:java.util.List) from 0x0015: IPUT (r303v3 ?? I:java.util.List), (r301v0 'this' ?? I:X.4gz A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0023] X.4gz.A01 java.util.List
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
    public void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x0018: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x0008, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:java.util.List) from 0x0015: IPUT (r303v3 ?? I:java.util.List), (r301v0 'this' ?? I:X.4gz A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0023] X.4gz.A01 java.util.List
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

    public void A06(InterfaceC06464gy interfaceC06464gy) {
        synchronized (this) {
            List<InterfaceC06464gy> list = this.A01;
            if (list != null) {
                this.A01 = new ArrayList();
                for (InterfaceC06464gy interfaceC06464gy2 : list) {
                    if (interfaceC06464gy2 != interfaceC06464gy) {
                        this.A01.add(interfaceC06464gy2);
                    }
                }
            }
        }
    }

    @Override // X.C4h0
    public void AE3(5TY r302, String str) {
        A01(this).execute(new 7Rk(this, str, A00(r302), ((C0dr) this.A05.get()).now()));
    }

    @Override // X.C4h0
    public void APD(5TY r302, String str) {
        A01(this).execute(new G5J(this, str, A00(r302), ((C0dr) this.A05.get()).now()));
    }

    @Override // X.InterfaceC06484h1
    public void BsX(5TY r302, int i, int i2) {
        A01(this).execute(new G5q(r302, this, i, i2, 1BL.A09(this.A05)));
    }

    @Override // X.InterfaceC06484h1
    public void Bsi(5TY r302, int i, int i2, boolean z) {
        String str;
        String A00 = DKB.A00(482);
        C00i c00i = this.A08;
        C7z0 A02 = ((5iW) c00i.get()).A02(r302);
        if (A02 != null) {
            A02.Bcr(A00);
        }
        5iW r0 = (5iW) c00i.get();
        if (i2 == 0) {
            if (z) {
                str = "late_fetch";
            }
            str = "parallel_fetch";
        } else {
            if (i2 == 3) {
                str = "prefetch";
            }
            str = "parallel_fetch";
        }
        C7z0 A022 = r0.A02(r302);
        if (A022 != null) {
            A022.Bch("fetch_type", str);
        }
        A01(this).execute(new G5L(r302, this, 1BL.A09(this.A05)));
    }

    @Override // X.C4h0
    public void BtD(5TY r302) {
        synchronized (this) {
            List list = this.A01;
            if (list == null) {
                return;
            }
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                ((InterfaceC06464gy) it.next()).CPM(r302);
            }
        }
    }

    @Override // X.InterfaceC06484h1
    public void CAl(5TY r302, int i) {
        A01(this).execute(new G5N(r302, this, i, 1BL.A09(this.A05)));
    }

    @Override // X.InterfaceC06484h1
    public void CDD(5TY r302, int i) {
        A01(this).execute(new G5M(r302, this, i, 1BL.A09(this.A05)));
    }

    @Override // X.C4h0
    public void CGV(5TY r302, int i) {
        C00i c00i = this.A08;
        C7z0 A02 = ((5iW) c00i.get()).A02(r302);
        if (A02 != null) {
            A02.Bci("ui_render", true);
        }
        5iW r0 = (5iW) c00i.get();
        String str = i == 1 ? "Pre_Render" : "Parallel_Render";
        C7z0 A022 = r0.A02(r302);
        if (A022 != null) {
            A022.Bch("render_type", str);
        }
    }

    @Override // X.InterfaceC06484h1
    public void CMo(5TY r302, int i) {
        long A09 = 1BL.A09(this.A05);
        C00i c00i = this.A09;
        long j = ((3zV) c00i.get()).A04;
        if (1BK.A0N(this.A04).AZk(36311298493319889L)) {
            j = 3zV.A00(A09, j, ((3zV) c00i.get()).A03);
            if (j <= 0) {
                j = A09;
            }
        }
        A01(this).execute(new G5p(r302, this, i, j, A09));
    }

    @Override // X.C4h0
    public void CMs(5TY r302, String str, int i) {
        boolean z;
        List list;
        java.util.Map map;
        synchronized (this) {
            Deque deque = this.A0A;
            if (deque.contains(r302.A04())) {
                z = false;
            } else {
                deque.add(r302.A04());
                z = true;
            }
        }
        if (z) {
            C00i c00i = this.A08;
            5iW r0 = (5iW) c00i.get();
            int A00 = 5iW.A00(r302, "cold");
            C00i c00i2 = r0.A04;
            c00i2.get();
            C7z0 A01 = C47j.A01(A00);
            boolean AZk = ((2yD) 1Bi.A03(16387)).AZk(72339270880133498L);
            Object A03 = r302.A03("ttrc_use_existing_open_trace");
            if (A03 instanceof Boolean) {
                AZk = AnonymousClass001.A1V(A03);
            }
            if (A01 != null && !AZk) {
                A01.Bch("TTRC_OVERRODE_BY", str);
                A01.Bch("TTRC_OVERRODE_BY_PROPS", r302.A04());
            }
            if (A00 == 196685) {
                ((C6tn) r0.A03.get()).A00((C47q) r0.A02.get());
            }
            C00i c00i3 = r0.A05;
            if (((TrafficTtrcEventListener) c00i3.get()).shouldAttachListener(A00)) {
                ((C6tn) r0.A03.get()).A00((C47q) c00i3.get());
            }
            boolean z2 = true;
            Object A032 = r302.A03("ttrc_back_start_on_touch_up");
            if (A032 instanceof Boolean) {
                z2 = AnonymousClass001.A1V(A032);
            }
            if (!AZk || A01 == null) {
                A01 = ((C47j) c00i2.get()).A03(A00, z2, true);
            }
            synchronized (r0) {
                r0.A00.A0B(A00, A01);
            }
            A01.Bch("TTRC_CATEGORY", "cold");
            Object A033 = r302.A03("ttrc_custom_annotations");
            if ((A033 instanceof java.util.Map) && (map = (java.util.Map) A033) != null) {
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    A01.Bch(AnonymousClass001.A0j(A0z), A0z.getValue().toString());
                }
            }
            Object A034 = r302.A03("ttrc_custom_steps");
            if ((A034 instanceof List) && (list = (List) A034) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A01.A7Q(AnonymousClass001.A0i(it));
                }
            }
            A01.Bch("TTRC_STARTED_AT", str);
            A01.Bcg("time_since_user_entered_app", ((1Od) r0.A01.get()).A07());
            A01.A7Q("UI_INITIAL_LOAD");
            r302.A03("DYNAMIC_TTRC");
            synchronized (this) {
                List list2 = this.A01;
                if (list2 != null) {
                    Iterator it2 = new ArrayList(list2).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC06464gy) it2.next()).CP7(r302, 0);
                    }
                }
            }
            C7z0 A02 = ((5iW) c00i.get()).A02(r302);
            if (A02 != null) {
                A02.Bcr("prepare_navigation");
            }
        }
    }

    @Override // X.InterfaceC06484h1
    public void CSL(5TY r302) {
        A01(this).execute(new G4U(r302, this, 1BL.A09(this.A05)));
    }

    @Override // X.C4h0
    public void CbJ(5TY r302, String str) {
        final int A00 = A00(r302);
        final long now = ((C0dr) this.A05.get()).now();
        A01(this).execute(new Runnable() { // from class: X.6uj
            public static final String __redex_internal_original_name = "QPLDataNavigationLogger$8";

            @Override // java.lang.Runnable
            public void run() {
                C06474gz c06474gz = C06474gz.this;
                int i = A00;
                long j = now;
                C06474gz.A03(c06474gz, "receiveAdditional", i, j);
                SparseArray sparseArray = c06474gz.A03;
                Set set = (Set) sparseArray.get(i);
                if (set == null || !set.isEmpty()) {
                    return;
                }
                sparseArray.remove(i);
                ((LightweightQuickPerformanceLogger) c06474gz.A07.get()).markerEnd(25821186, i, (short) 2, j, TimeUnit.MILLISECONDS);
            }
        });
    }

    @Override // X.C4h0
    public void CbN(5TY r302, final String str) {
        final int A00 = A00(r302);
        final boolean add = this.A0B.add(str);
        final long now = ((C0dr) this.A05.get()).now();
        A01(this).execute(new Runnable() { // from class: X.6uh
            public static final String __redex_internal_original_name = "QPLDataNavigationLogger$7";

            @Override // java.lang.Runnable
            public void run() {
                C06474gz c06474gz = C06474gz.this;
                C00i c00i = c06474gz.A07;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c00i.get();
                int i = A00;
                lightweightQuickPerformanceLogger.markerAnnotate(25821186, i, "is_cold_start", add);
                ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(25821186, i, "PRODUCT_TAG", str);
                long j = now;
                C06474gz.A03(c06474gz, "receiveInitial", i, j);
                SparseArray sparseArray = c06474gz.A03;
                Set set = (Set) sparseArray.get(i);
                if (set == null || !set.isEmpty()) {
                    return;
                }
                sparseArray.remove(i);
                ((LightweightQuickPerformanceLogger) c00i.get()).markerEnd(25821186, i, (short) 2, j, TimeUnit.MILLISECONDS);
            }
        });
    }
}
