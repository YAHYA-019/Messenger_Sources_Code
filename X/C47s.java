package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* renamed from: X.47s, reason: invalid class name */
/* loaded from: 47s.class */
public class C47s implements C47t {
    public long A00;
    public long A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final C47l A07;
    public final QuickPerformanceLogger A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final C47n A0E;
    public final C47v A0F;
    public final 45R A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r325v4 ??, still in use, count: 2, list:
          (r325v4 ??) from 0x00d2: PHI (r325v3 ??) = (r325v2 ??), (r325v4 ??) binds: [B:8:0x00b5, B:12:0x00c4] A[DONT_GENERATE, DONT_INLINE]
          (r325v4 ?? I:X.47v) from 0x00c4: SPUT (r325v4 ?? I:X.47v) A[Catch: all -> 0x00ca] X.47v.A02 X.47v
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
    public C47s(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r325v4 ??, still in use, count: 2, list:
          (r325v4 ??) from 0x00d2: PHI (r325v3 ??) = (r325v2 ??), (r325v4 ??) binds: [B:8:0x00b5, B:12:0x00c4] A[DONT_GENERATE, DONT_INLINE]
          (r325v4 ?? I:X.47v) from 0x00c4: SPUT (r325v4 ?? I:X.47v) A[Catch: all -> 0x00ca] X.47v.A02 X.47v
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

    private final C47y A03(String str) {
        C47y c47y;
        synchronized (this) {
            c47y = (C47y) this.A0A.get(str);
        }
        return c47y;
    }

    private Integer A04() {
        Integer num;
        synchronized (this) {
            num = this.A02;
            if (num == null) {
                11T.A0L("traceState");
                throw 0Q8.createAndThrow();
            }
        }
        return num;
    }

    private final void A05() {
        String A0j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = this.A0A;
        for (C47y c47y : hashMap.values()) {
            int intValue = c47y.A00.intValue();
            if (intValue == 4) {
                arrayList.add(c47y.A06);
            } else if (intValue == 0) {
                arrayList3.add(c47y.A06);
            } else if (intValue == 1 || intValue == 2) {
                arrayList4.add(c47y.A06);
            }
        }
        for (Map.Entry entry : this.A09.entrySet()) {
            Object key = entry.getKey();
            Integer num = ((5VD) entry.getValue()).A00;
            if (num == 0S2.A0C) {
                arrayList2.add(key);
            } else if (num == 0S2.A00) {
                arrayList5.add(key);
            }
        }
        Bcj("revoked_queries", (String[]) arrayList.toArray(new String[0]));
        Bcj("revoked_steps", (String[]) arrayList2.toArray(new String[0]));
        Bcj("pending_cache_and_network_queries", (String[]) arrayList3.toArray(new String[0]));
        Bcj("pending_network_queries", (String[]) arrayList4.toArray(new String[0]));
        Bcj("pending_steps", (String[]) arrayList5.toArray(new String[0]));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (C47y c47y2 : hashMap.values()) {
            if (c47y2.A00 == 0S2.A0N) {
                if (!c47y2.A03 || c47y2.A02) {
                    arrayList7.add(c47y2.A06);
                } else {
                    arrayList6.add(c47y2.A06);
                }
            }
        }
        if ((!arrayList6.isEmpty()) || (!arrayList7.isEmpty())) {
            if (arrayList7.isEmpty()) {
                A0j = "CACHE";
            } else if (arrayList6.isEmpty()) {
                A0j = "NETWORK";
            } else {
                0RC.A0x(arrayList6);
                0RC.A0x(arrayList7);
                A0j = 0Pz.A0j(0QD.A0K(", ", "", "", arrayList6, C4YA.A00, -1), ", ", 0QD.A0K(", ", "", "", arrayList7, C4YB.A00, -1));
            }
            Bch("ttrc_source", A0j);
        }
        ArrayList arrayList8 = new ArrayList();
        for (C47y c47y3 : hashMap.values()) {
            if (c47y3.A03) {
                arrayList8.add(c47y3.A06);
            }
        }
        if (!arrayList8.isEmpty()) {
            0RC.A0x(arrayList8);
            Bch("ttrc_cache_rendered", 0QD.A0K(", ", "", "", arrayList8, (Function1) null, -1));
        }
    }

    private final void A06() {
        try {
            A0C();
            A0B(0S2.A0N);
        } catch (6BP e) {
            A0G("Point not found", (short) 3);
            A0B(0S2.A0Y);
            int i = this.A06;
            String A0W = 0Pz.A0W("TTRCTrace | ", String.valueOf(i));
            String[] strArr = ((6BP) e).knownPoints;
            String A03 = strArr != null ? 02L.A03(", ", (Function1) null, strArr) : "null";
            C47n c47n = this.A0E;
            c47n.Ca5("ttrc_qpl_points_known", A03);
            c47n.Ca5("ttrc_qpl_points_submitted", 0QD.A0K(", ", "", "", this.A0D, (Function1) null, -1));
            Locale locale = Locale.US;
            String format = String.format(locale, "%d:%d", Arrays.copyOf(AnonymousClass001.A1b(Integer.valueOf(i), this.A05), 2));
            11T.A0A(format);
            c47n.Ca5("ttrc_qpl_markerid_sumbited", format);
            String format2 = String.format(locale, "%d:%d", Arrays.copyOf(AnonymousClass001.A1b(Integer.valueOf(((6BP) e).markerId), ((6BP) e).instanceKey), 2));
            11T.A0A(format2);
            c47n.Ca5("ttrc_qpl_markerid_known", format2);
            c47n.Cg0(A0W, "Error while ending trace", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (A0A() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        A06();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A07() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0I     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L7a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L21
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0H     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L7a
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L21
            goto L77
        L21:
            r0 = r301
            java.util.HashMap r0 = r0.A0A     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7a
            r304 = r0
        L32:
            r0 = r304
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L7a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L66
            r0 = r304
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            X.47y r0 = (X.C47y) r0     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r302
            java.lang.Integer r0 = r0.A00     // Catch: java.lang.Throwable -> L7a
            r305 = r0
            java.lang.Integer r0 = X.0S2.A0N     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r305
            r1 = r302
            if (r0 == r1) goto L32
            java.lang.Integer r0 = X.0S2.A0Y     // Catch: java.lang.Throwable -> L7a
            r302 = r0
            r0 = r305
            r1 = r302
            if (r0 != r1) goto L77
            goto L32
        L66:
            r0 = r301
            boolean r0 = r0.A0A()     // Catch: java.lang.Throwable -> L7a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L77
            r0 = r301
            r0.A05()     // Catch: java.lang.Throwable -> L7a
            r0 = r301
            r0.A06()     // Catch: java.lang.Throwable -> L7a
        L77:
            r0 = r301
            monitor-exit(r0)
            return
        L7a:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47s.A07():void");
    }

    private final void A08(long j) {
        if (this.A04 || !A0A()) {
            return;
        }
        if (A04() == 0S2.A00 || A04() == 0S2.A0C) {
            Iterator it = this.A0A.values().iterator();
            while (it.hasNext()) {
                Integer num = ((C47y) it.next()).A00;
                if (num != 0S2.A0N && num != 0S2.A0Y && num != 0S2.A0C) {
                    return;
                }
            }
            Bcu("time_to_initial_content", null, j);
            this.A04 = true;
        }
    }

    public static final void A09(C47s c47s, String str) {
        synchronized (c47s) {
            c47s.A0G(str, (short) 3);
            if (c47s.A0H()) {
                c47s.A0B(0S2.A0Y);
            }
            int i = c47s.A06;
            String A0E = 0Pz.A0E(i, "marker_id:", ",error:", str);
            String A0x = 0Pz.A0x("marker_id:", ",instance_key:", ",error:", str, i, c47s.A05);
            c47s.A0E.Cg0(0Pz.A0W("TTRCTrace|", String.valueOf(i)), A0E, new Throwable(A0x));
        }
    }

    private final boolean A0A() {
        Iterator it = this.A09.values().iterator();
        while (it.hasNext()) {
            Integer num = ((5VD) it.next()).A00;
            if (num != 0S2.A01 && num != 0S2.A0C) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a5, code lost:
    
        if (r302 == X.0S2.A0Y) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0050, code lost:
    
        if (r302 == X.0S2.A0N) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0B(java.lang.Integer r302) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47s.A0B(java.lang.Integer):boolean");
    }

    public void A0C() {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerEndAtPointForUserFlow(i, i2, (short) 2, this.A03);
        this.A0F.A03(i, i2, this.A01, this.A00, (short) 2);
        this.A0G.A04(this);
    }

    public final void A0D(long j, String str, boolean z) {
        C47y A03;
        11T.A0F(str, 0);
        if (!A0I(0S2.A0C) || (A03 = A03(str)) == null) {
            return;
        }
        Integer num = 0S2.A0N;
        int intValue = A03.A00.intValue();
        if (intValue == 2 || intValue == 0 || intValue == 1) {
            A03.A00 = num;
            A03.A02 = z;
            String A0W = 0Pz.A0W("ttnc_for_", A03.A06);
            if (!A03.A03 || z) {
                C47s c47s = A03.A07;
                c47s.A03 = A0W;
                c47s.A00 = j;
            }
            A03.A07.Bcu(A0W, null, j);
            A03.A00();
            A08(j);
            A07();
        }
    }

    public void A0E(String str, long j) {
        synchronized (this) {
            if (A0H()) {
                A05();
                HashMap hashMap = this.A0A;
                if (!hashMap.isEmpty() || !this.A09.isEmpty()) {
                    boolean z = true;
                    for (C47y c47y : hashMap.values()) {
                        Integer num = c47y.A00;
                        if (num != 0S2.A0C || c47y.A01) {
                            if (num != 0S2.A0N && num != 0S2.A0Y) {
                                z = false;
                            }
                        }
                    }
                    if (z && A0A()) {
                        for (C47y c47y2 : hashMap.values()) {
                            if (c47y2.A00 == 0S2.A0C) {
                                c47y2.A00();
                            }
                        }
                        A06();
                    }
                }
                A0B(0S2.A0j);
                A0G(str, (short) 4);
                long j2 = j - this.A01;
                if (j2 > 5000) {
                    this.A08.markEventBuilder(21364739, String.valueOf(this.A06)).annotate("duration", j2).setLevel(5).report();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r314 != r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(java.lang.String r302, long r303, long r305, long r307, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47s.A0F(java.lang.String, long, long, long, boolean, boolean):void");
    }

    public void A0G(String str, short s) {
        if (str != null && str.length() != 0) {
            MarkerEditor withMarker = this.A08.withMarker(this.A06, this.A05);
            withMarker.annotate("end_reason", str);
            withMarker.markerEditingCompleted();
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerEndForUserFlow(i, i2, s);
        this.A0F.A03(i, i2, this.A01, this.A00, s);
        this.A0G.A04(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (A04() == X.0S2.A0C) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0H() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.lang.Integer r0 = r0.A04()     // Catch: java.lang.Throwable -> L39
            r302 = r0
            java.lang.Integer r0 = X.0S2.A00     // Catch: java.lang.Throwable -> L39
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L31
            r0 = r301
            java.lang.Integer r0 = r0.A04()     // Catch: java.lang.Throwable -> L39
            r302 = r0
            java.lang.Integer r0 = X.0S2.A01     // Catch: java.lang.Throwable -> L39
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L31
            r0 = r301
            java.lang.Integer r0 = r0.A04()     // Catch: java.lang.Throwable -> L39
            r304 = r0
            java.lang.Integer r0 = X.0S2.A0C     // Catch: java.lang.Throwable -> L39
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L34
        L31:
            r0 = 1
            r305 = r0
        L34:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L39:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47s.A0H():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (A0B(r302) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0I(java.lang.Integer r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.lang.Integer r0 = r0.A04()     // Catch: java.lang.Throwable -> L23
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto L1b
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0B(r1)     // Catch: java.lang.Throwable -> L23
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1e
        L1b:
            r0 = 1
            r305 = r0
        L1e:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L23:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47s.A0I(java.lang.Integer):boolean");
    }

    @Override // X.C47t
    public void A6Y(String str) {
        synchronized (this) {
            A7A(str, TimeUnit.MILLISECONDS, -1);
        }
    }

    @Override // X.C47t
    public void A7A(String str, TimeUnit timeUnit, long j) {
        boolean z;
        synchronized (this) {
            11T.A0F(str, 0);
            if (A0I(0S2.A01)) {
                HashMap hashMap = this.A0A;
                if (hashMap.containsKey(str)) {
                    A09(this, 0Pz.A0W("Attempted to Add Query Twice for: ", str));
                } else {
                    if (j == -1) {
                        new C47y(this, str);
                    } else {
                        new C47y(this, str, timeUnit.toMillis(j));
                    }
                    hashMap.put(str, z);
                }
            }
        }
    }

    @Override // X.C47t
    public void A7Q(String str) {
        synchronized (this) {
            11T.A0F(str, 0);
            if (A0I(0S2.A01)) {
                HashMap hashMap = this.A09;
                if (hashMap.containsKey(str)) {
                    A09(this, 0Pz.A0W("Attempted to Add Additional Step Twice for: ", str));
                } else {
                    hashMap.put(str, new 5VD());
                }
            }
        }
    }

    @Override // X.C47t
    public void AD9(long j, String str, boolean z, long j2) {
        synchronized (this) {
            11T.A0F(str, 0);
            A0F(str, j, j2, -1, z, false);
        }
    }

    @Override // X.C47t
    public void ARr(String str) {
        synchronized (this) {
            long now = this.A07.now();
            if (A0H()) {
                A0B(0S2.A0Y);
                A05();
                A0G(str, (short) 3);
                EventBuilder level = this.A08.markEventBuilder(21364738, String.valueOf(this.A06)).annotate("duration", now - this.A01).setLevel(3);
                if (str != null) {
                    level.annotate("message", str);
                }
                level.report();
            }
        }
    }

    @Override // X.C47t
    public int ArT() {
        return this.A05;
    }

    @Override // X.C47t
    public long BE7() {
        return BHJ();
    }

    @Override // X.C47t
    public long BHJ() {
        return C47u.A00(this.A06, this.A05);
    }

    @Override // X.C47t
    public boolean BU8(boolean z) {
        return this.A08.isMarkerOn(this.A06, this.A05, true);
    }

    @Override // X.C47t
    public void BYG() {
        BYH("leftSurface");
    }

    @Override // X.C47t
    public void BYH(String str) {
        synchronized (this) {
            A0E(str, this.A07.now());
        }
    }

    @Override // X.C47t
    public void Bce(String str, double d) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, d);
        this.A0F.A04(i, i2, str, d);
    }

    @Override // X.C47t
    public void Bcf(String str, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i2 = this.A06;
        int i3 = this.A05;
        quickPerformanceLogger.markerAnnotate(i2, i3, str, i);
        if (str != null) {
            this.A0F.A05(i2, i3, str, i);
        }
    }

    @Override // X.C47t
    public void Bcg(String str, long j) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, j);
        if (str != null) {
            this.A0F.A06(i, i2, str, j);
        }
    }

    @Override // X.C47t
    public void Bch(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        if (str == null || str2 == null) {
            return;
        }
        this.A0F.A07(i, i2, str, str2);
    }

    @Override // X.C47t
    public void Bci(String str, boolean z) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, z);
        if (str != null) {
            this.A0F.A09(i, i2, str, z);
        }
    }

    @Override // X.C47t
    public void Bcj(String str, String[] strArr) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        int i = this.A06;
        int i2 = this.A05;
        quickPerformanceLogger.markerAnnotate(i, i2, str, strArr);
        if (strArr != null) {
            this.A0F.A0A(i, i2, str, strArr);
        }
    }

    @Override // X.C47t
    public void Bco() {
        synchronized (this) {
            QuickPerformanceLogger quickPerformanceLogger = this.A08;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerDropForUserFlow(i, i2);
            this.A0F.A01(i, i2);
            A0B(0S2.A0u);
            this.A0G.A04(this);
        }
    }

    @Override // X.C47t
    public void Bcr(String str) {
        synchronized (this) {
            QuickPerformanceLogger quickPerformanceLogger = this.A08;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerPoint(i, i2, str);
            this.A0F.A08(i, i2, str == null ? "Unknown name" : str, null, this.A07.now());
            this.A0D.add(str);
        }
    }

    @Override // X.C47t
    public void Bcs(String str, long j) {
        synchronized (this) {
            QuickPerformanceLogger quickPerformanceLogger = this.A08;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS);
            this.A0F.A08(i, i2, str == null ? "Unknown name" : str, null, j);
            this.A0D.add(str);
        }
    }

    @Override // X.C47t
    public void Bct(String str, String str2) {
        synchronized (this) {
            QuickPerformanceLogger quickPerformanceLogger = this.A08;
            int i = this.A06;
            int i2 = this.A05;
            quickPerformanceLogger.markerPoint(i, i2, str, str2);
            this.A0F.A08(i, i2, str, str2, this.A07.now());
            this.A0D.add(str);
        }
    }

    @Override // X.C47t
    public void Bcu(String str, String str2, long j) {
        if (this instanceof C47r) {
            C47r c47r = (C47r) this;
            synchronized (this) {
                if (str != null) {
                    QuickPerformanceLogger quickPerformanceLogger = c47r.A08;
                    int i = ((C47s) c47r).A06;
                    int i2 = ((C47s) c47r).A05;
                    quickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS, 1);
                    c47r.A00.onMarkerPoint(i, i2, str, null, j);
                }
                c47r.A0D.add(str);
            }
        }
        synchronized (this) {
            QuickPerformanceLogger quickPerformanceLogger2 = this.A08;
            int i3 = this.A06;
            int i4 = this.A05;
            quickPerformanceLogger2.markerPoint(i3, i4, str, null, j, TimeUnit.MILLISECONDS);
            this.A0F.A08(i3, i4, str == null ? "Unknown name" : str, null, j);
            this.A0D.add(str);
        }
    }

    @Override // X.C47t
    public void Bf9(String str, boolean z) {
        synchronized (this) {
            BfA(this.A07.now(), str, z);
        }
    }

    @Override // X.C47t
    public void BfA(long j, String str, boolean z) {
        synchronized (this) {
            11T.A0F(str, 0);
            A0D(j, str, z);
        }
    }

    @Override // X.C47t
    public void CaV(String str) {
        synchronized (this) {
            11T.A0F(str, 0);
            long now = this.A07.now();
            if (A0I(0S2.A0C)) {
                C47y A03 = A03(str);
                if (A03 != null) {
                    Integer num = 0S2.A0Y;
                    int intValue = A03.A00.intValue();
                    if (intValue == 2 || intValue == 0 || intValue == 1) {
                        A03.A00 = num;
                        A08(now);
                        A07();
                    }
                }
            }
        }
    }

    @Override // X.C47t
    public void D2X(String str) {
        synchronized (this) {
            long now = this.A07.now();
            if (A0I(0S2.A0C)) {
                5VD r0 = (5VD) this.A09.get(str);
                if (r0 != null && r0.A00 == 0S2.A00) {
                    r0.A00 = 0S2.A01;
                    String A0W = 0Pz.A0W("step_completed_", str);
                    if (this.A00 <= now) {
                        this.A03 = A0W;
                        this.A00 = now;
                    }
                    Bcu(A0W, null, now);
                    A08(this.A00);
                    A07();
                }
            }
        }
    }

    @Override // X.C47t
    public void D2Y(String str) {
        synchronized (this) {
            long now = this.A07.now();
            Integer num = 0S2.A0C;
            if (A0I(num)) {
                5VD r0 = (5VD) this.A09.get(str);
                if (r0 != null && r0.A00 == 0S2.A00) {
                    r0.A00 = num;
                    A08(Math.max(this.A00, now));
                    A07();
                }
            }
        }
    }

    @Override // X.C47t
    public MarkerEditor DAi() {
        MarkerEditor withMarker = this.A08.withMarker(this.A06, this.A05);
        11T.A0A(withMarker);
        return withMarker;
    }

    @Override // X.C47t
    public int getMarkerId() {
        return this.A06;
    }

    public String toString() {
        return 0Pz.A0A('_', this.A06, this.A05);
    }
}
