package X;

import android.os.Handler;
import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.proxygen.utils.CircularEventLog;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.JoT, reason: case insensitive filesystem */
/* loaded from: JoT.class */
public final class C3263JoT extends 1PV implements 1PX {
    public Handler A00;
    public 1PA A01;
    public 1PA A02;
    public 1I7 A03;
    public 1I7 A04;
    public Li2 A05;
    public Rwu A06;
    public 1Od A07;
    public 2Ao A08;
    public C20g A09;
    public C3lq A0A;
    public 2Ar A0B;
    public FbNetworkManager A0C;
    public FbDataConnectionManager A0D;
    public C5ez A0E;
    public String A0G;
    public final C3264JoU A0H;
    public final C0dr A0I;
    public final boolean A0K;
    public final QuickPerformanceLogger A0L;
    public final Set A0M = AnonymousClass001.A0v();
    public Integer A0F = 0S2.A0Y;
    public final boolean A0J = true;

    public C3263JoT(Handler handler, 1I7 r303, 1I7 r304, 1Od r305, 2Ao r306, FbDataConnectionManager fbDataConnectionManager, 2Ar r308, FbNetworkManager fbNetworkManager, C0dp c0dp, C0dr c0dr, C5ez c5ez, NetworkStatusMonitor networkStatusMonitor, CircularEventLog circularEventLog, QuickPerformanceLogger quickPerformanceLogger, String str, ScheduledExecutorService scheduledExecutorService, int i, boolean z) {
        this.A03 = r303;
        this.A04 = r304;
        this.A00 = handler;
        this.A0C = fbNetworkManager;
        this.A0D = fbDataConnectionManager;
        this.A08 = r306;
        this.A0B = r308;
        this.A0E = c5ez;
        this.A07 = r305;
        this.A0L = quickPerformanceLogger;
        this.A0I = c0dr;
        this.A0K = z;
        this.A0H = new C3264JoU(c0dp, c0dr, networkStatusMonitor, circularEventLog, quickPerformanceLogger, str, scheduledExecutorService, i, z);
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, X.RSj] */
    private void A00() {
        L5A l5a;
        String str;
        FbNetworkManager fbNetworkManager = this.A0C;
        if (fbNetworkManager != null) {
            Integer A00 = C3Ol.A00(fbNetworkManager.A0A());
            Integer num = this.A0F;
            2Ao r0 = this.A08;
            String str2 = this.A0G;
            if (A00 == num) {
                if (num == 0S2.A0C && RbH.A00(r0).equals(str2)) {
                    str = "Ignoring irrelevant network conn. change: cell -> cell, same towerId.";
                } else if (num == 0S2.A01) {
                    str = "Ignoring irrelevant network conn. change: wifi -> wifi, no wifi tracking.";
                } else if (num == 0S2.A00) {
                    str = "Ignoring irrelevant network conn. change: noconn -> noconn";
                }
                0fH.A0j("CloudSeederUtil", str);
                return;
            }
            this.A0F = A00;
            int i = 0;
            Integer num2 = 0S2.A0C;
            if (A00 == num2) {
                if (fbNetworkManager.A0A() != null) {
                    i = fbNetworkManager.A0A().getSubtype();
                }
                this.A0G = RbH.A00(r0);
            }
            long now = this.A0I.now();
            if (this.A0K) {
                l5a = this.A0H.A05();
                if (l5a != null) {
                    Integer num3 = this.A0F;
                    synchronized (l5a) {
                        try {
                            l5a.A04.add(new RKi(num3, i, now));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            String str3 = null;
            Integer num4 = this.A0F;
            if (num4 == num2) {
                str3 = AbstractC09674qv.A00(i);
            }
            if (this.A0J) {
                l5a = this.A0H;
                Long valueOf = Long.valueOf(now);
                String A01 = C3Ol.A01(num4);
                synchronized (l5a) {
                    if (!l5a.A0J.isEmpty()) {
                        L4w l4w = l5a.A01;
                        if (l4w != null) {
                            RRZ rrz = l4w.A04;
                            ?? obj = new Object();
                            ((RSj) obj).A00 = valueOf;
                            ((RSj) obj).A02 = A01;
                            ((RSj) obj).A01 = str3;
                            rrz.A06.A0E.post(new SAf((RSj) obj, rrz));
                        }
                    }
                }
            }
        }
    }

    public static void A01(C3263JoT c3263JoT) {
        synchronized (c3263JoT) {
            FbNetworkManager fbNetworkManager = c3263JoT.A0C;
            if (fbNetworkManager != null && C01573rm.A04.A03.get()) {
                0fH.A0d(C3Ol.A01(c3263JoT.A0F), C3Ol.A01(C3Ol.A00(fbNetworkManager.A0A())), "TransientNetworkDataCollector", "Entered handleNetworkConnectivityChange: %s to %s");
                c3263JoT.A00();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.RSO, java.lang.Object] */
    public static void A02(C3263JoT c3263JoT, 40H r302) {
        synchronized (c3263JoT) {
            long now = c3263JoT.A0I.now();
            if (c3263JoT.A0K) {
                L5A A05 = c3263JoT.A0H.A05();
                if (A05 != null) {
                    String name = r302.name();
                    synchronized (A05) {
                        try {
                            A05.A03.add(new RHz(name, now));
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
            }
            if (c3263JoT.A0J) {
                C3264JoU c3264JoU = c3263JoT.A0H;
                Long valueOf = Long.valueOf(now);
                String name2 = r302.name();
                synchronized (c3264JoU) {
                    try {
                        if (!c3264JoU.A0J.isEmpty()) {
                            L4w l4w = c3264JoU.A01;
                            if (l4w != null) {
                                RRX rrx = l4w.A03;
                                ?? obj = new Object();
                                ((RSO) obj).A00 = valueOf;
                                ((RSO) obj).A01 = name2;
                                rrx.A05.A0E.post(new SAe((RSO) obj, rrx));
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
    }

    public boolean BWp(File file) {
        String absolutePath;
        boolean contains;
        synchronized (this) {
            if (file == null) {
                contains = false;
            } else {
                Set set = this.A0M;
                try {
                    absolutePath = file.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = file.getAbsolutePath();
                }
                contains = set.contains(absolutePath);
            }
        }
        return contains;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v33 ??, still in use, count: 2, list:
          (r309v33 ??) from 0x014b: PHI (r309v26 ??) = (r309v25 ??), (r309v33 ??) binds: [B:78:0x0137, B:82:0x0146] A[DONT_GENERATE, DONT_INLINE]
          (r309v33 ?? I:X.20g) from 0x0148: IPUT (r309v33 ?? I:X.20g), (r301v0 'this' ?? I:X.JoT A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0373] X.JoT.A09 X.20g
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
    public void D1X(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v33 ??, still in use, count: 2, list:
          (r309v33 ??) from 0x014b: PHI (r309v26 ??) = (r309v25 ??), (r309v33 ??) binds: [B:78:0x0137, B:82:0x0146] A[DONT_GENERATE, DONT_INLINE]
          (r309v33 ?? I:X.20g) from 0x0148: IPUT (r309v33 ?? I:X.20g), (r301v0 'this' ?? I:X.JoT A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0373] X.JoT.A09 X.20g
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

    public void D2i(File file) {
        String absolutePath;
        String absolutePath2;
        String absolutePath3;
        synchronized (this) {
            0fH.A0j("TransientNetworkDataCollector", "stopDataCollection");
            if (file != null) {
                Set set = this.A0M;
                try {
                    absolutePath = file.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = file.getAbsolutePath();
                }
                if (set.contains(absolutePath)) {
                    try {
                        absolutePath2 = file.getCanonicalPath();
                    } catch (IOException unused2) {
                        absolutePath2 = file.getAbsolutePath();
                    }
                    set.remove(absolutePath2);
                    if (set.isEmpty()) {
                        0fH.A0j("TransientNetworkDataCollector", "Disable receivers");
                        1PA r0 = this.A02;
                        if (r0 != null) {
                            r0.A01();
                        }
                        1PA r02 = this.A01;
                        if (r02 != null) {
                            r02.A01();
                        }
                        C20g c20g = this.A09;
                        if (c20g != null) {
                            Set set2 = this.A08.A0C;
                            synchronized (set2) {
                                set2.remove(c20g);
                            }
                        }
                        Rwu rwu = this.A06;
                        if (rwu != null) {
                            rwu.A01.A01();
                            this.A06 = null;
                        }
                        Li2 li2 = this.A05;
                        if (li2 != null) {
                            li2.close();
                            this.A05 = null;
                        }
                        if (this.A0A != null) {
                            this.A0B.A00().A0K.remove(this.A0A);
                        }
                    }
                    C3264JoU c3264JoU = this.A0H;
                    c3264JoU.A0B(file);
                    c3264JoU.A09(file);
                } else {
                    try {
                        absolutePath3 = file.getCanonicalPath();
                    } catch (IOException unused3) {
                        absolutePath3 = file.getAbsolutePath();
                    }
                    RbH.A01(this.A0L, "MismatchedTraceEndFile", absolutePath3);
                    0fH.A14("TransientNetworkDataCollector", "No-Op: No active tracing record found for %s!", new Object[]{file});
                }
            } else {
                RbH.A01(this.A0L, "NullExtraDataFile", "Failed to start trace");
                0fH.A0k("TransientNetworkDataCollector", "Null extraDataFile!");
            }
        }
    }
}
