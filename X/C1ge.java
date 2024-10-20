package X;

import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.ohai.OhaiPlugin;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1ge, reason: invalid class name */
/* loaded from: 1ge.class */
public final class C1ge extends 1Uj {
    public 1yR A00;
    public 3Js A01;
    public Mailbox A02;
    public SlimMailbox A03;
    public final C1gc A05;
    public final C1gf A04 = new C1gf();
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();

    public C1ge(C1gc c1gc) {
        this.A05 = c1gc;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v2 ??, still in use, count: 2, list:
          (r312v2 ??) from 0x0194: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??) binds: [B:142:0x018f, B:73:0x0164] A[DONT_GENERATE, DONT_INLINE]
          (r312v2 ?? I:com.facebook.msys.mca.SlimMailbox) from 0x0166: IPUT (r312v2 ?? I:com.facebook.msys.mca.SlimMailbox), (r301v0 ?? I:X.1ge) A[Catch: all -> 0x03e8] X.1ge.A03 com.facebook.msys.mca.SlimMailbox
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
    public static com.facebook.msys.mca.SlimMailbox A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v2 ??, still in use, count: 2, list:
          (r312v2 ??) from 0x0194: PHI (r312v1 ??) = (r312v0 ??), (r312v2 ??) binds: [B:142:0x018f, B:73:0x0164] A[DONT_GENERATE, DONT_INLINE]
          (r312v2 ?? I:com.facebook.msys.mca.SlimMailbox) from 0x0166: IPUT (r312v2 ?? I:com.facebook.msys.mca.SlimMailbox), (r301v0 ?? I:X.1ge) A[Catch: all -> 0x03e8] X.1ge.A03 com.facebook.msys.mca.SlimMailbox
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

    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, X.3Hn] */
    public static void A01(C1ge c1ge) {
        int i;
        3L4[] r0;
        synchronized (c1ge) {
            if (!(c1ge.A04.A00(0S2.A0Y) == C1gg.A02)) {
                throw AnonymousClass001.A0J("clean_up_ready can only result in destroyed phase");
            }
            c1ge.A03 = null;
            c1ge.A02 = null;
            ConcurrentLinkedQueue concurrentLinkedQueue = c1ge.A06;
            r0 = (3L4[]) concurrentLinkedQueue.toArray(new 3L4[0]);
            concurrentLinkedQueue.clear();
        }
        synchronized (c1ge) {
            1yR r02 = c1ge.A00;
            if (r02 != null) {
                1yQ r03 = r02.A00.A00;
                int andIncrement = C1Y6.A04.getAndIncrement();
                1YC r04 = r03.A00;
                r04.A08("com.facebook.msys.config.plugins.interfaces.flipper.FlipperPluginInterfaceSpec", "msys.config.flipper.FlipperPluginInterfaceSpec", "maybeDisconnectFlipperPlugin", andIncrement);
                r04.A02((Exception) null, "msys.config.flipper.FlipperPluginInterfaceSpec", "maybeDisconnectFlipperPlugin", andIncrement);
                c1ge.A00 = null;
            }
        }
        C1gc c1gc = c1ge.A05;
        1gR r05 = c1gc.A00;
        QuickPerformanceLogger quickPerformanceLogger = r05.A01.A0D;
        if (1aY.A00(quickPerformanceLogger) instanceof C00161aa) {
            1aY.A00.markerPoint(53084161, "CLEAN_UP_START");
        }
        NetworkSession A01 = MsysInfraNoSqliteObjectHolder.A01();
        AuthData authData = r05.A03;
        if (A01 != null) {
            C2yd c2yd = (C2yd) c1gc.A0a.get();
            if (c2yd != null) {
                1fC r06 = c2yd.A00;
                if (!"NONE".equalsIgnoreCase(((2yD) r06.A0B.get()).BCz(36881051674870812L, "NONE"))) {
                    1eQ r07 = (1eQ) r06.A05.get();
                    synchronized (r07) {
                        try {
                            C00j.A05("DGWNSPUnregister", -534948819);
                            r07.A00.unregister(A01, authData);
                            C00j.A01(-1264528207);
                        } catch (Throwable th) {
                            C00j.A01(-1131613018);
                            throw th;
                        }
                    }
                }
                ((OhaiPlugin) 1Bi.A03(67097)).unregister(A01, authData);
            }
            if (((C1xu) c1gc.A0V.get()) != null) {
                MqttNetworkSessionPlugin.get().unregister(A01, authData);
            }
        }
        String str = C1il.A01;
        if (str != null) {
            synchronized (MsysInfraNoSqliteObjectHolder.class) {
                MsysInfraNoSqliteObjectHolder msysInfraNoSqliteObjectHolder = MsysInfraNoSqliteObjectHolder.A03;
                HashSet hashSet = msysInfraNoSqliteObjectHolder.A00;
                if (hashSet.contains(str) && hashSet.size() > 1) {
                    hashSet.remove(str);
                } else if (hashSet.contains(str)) {
                    if (msysInfraNoSqliteObjectHolder.A02 != null) {
                        msysInfraNoSqliteObjectHolder.A02.dispose();
                    }
                    hashSet.clear();
                    msysInfraNoSqliteObjectHolder.A02 = null;
                    msysInfraNoSqliteObjectHolder.A01 = null;
                }
            }
        }
        if (1aY.A00(quickPerformanceLogger) instanceof C00161aa) {
            1aY.A00.markerPoint(53084161, "CLEAN_UP_COMPLETE");
            1aY.A03.decrementAndGet();
        }
        synchronized (3Hn.class) {
            if (3Hn.A00 == null) {
                3Hn.A00 = new Object();
            }
        }
        String str2 = r05.A0C;
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            withMarker.annotate("db_file_exist_at_end", str2 != null ? new File(str2).exists() : false);
            withMarker.markerEditingCompleted();
            quickPerformanceLogger.markerEnd(53086316, (short) 2);
        }
        for (3L4 r08 : r0) {
            r08.A00.onCompletion(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, X.3Hn] */
    public static void A02(C1ge c1ge) {
        Mailbox mailbox;
        3L4 r0;
        synchronized (c1ge) {
            mailbox = c1ge.A02;
            r0 = (3L4) c1ge.A06.peek();
        }
        if (mailbox == null) {
            0fH.A12("LazyMailbox", "Mailbox is null, no shutdown has occurred for %s", AnonymousClass001.A0T("Shutdown skipped"), new Object[]{c1ge.A05.A00.A04});
            A01(c1ge);
            return;
        }
        C0k4.A00(r0);
        int intValue = r0.A01.intValue();
        synchronized (3Hn.class) {
            if (3Hn.A00 == null) {
                3Hn.A00 = new Object();
            }
        }
        1gR r02 = c1ge.A05.A00;
        QuickPerformanceLogger quickPerformanceLogger = r02.A01.A0D;
        String str = r02.A0C;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(53086316);
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            withMarker.annotate("bootstrapper_ver", 3);
            withMarker.annotate("mailbox_ver", 3);
            withMarker.annotate("cleanup_type", intValue);
            withMarker.annotate("db_file_exist_at_start", str != null ? new File(str).exists() : false);
            withMarker.markerEditingCompleted();
        }
        Execution.executeAsync(new 38O(c1ge, intValue), null, 1);
    }

    public boolean A05(MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        Object obj = this.A05.A01.get();
        obj.getClass();
        boolean z = true;
        if (!((Boolean) obj).booleanValue() || executionContext == 0) {
            executionContext = 1;
        }
        if (A00(this, mailboxCallback, executionContext) == null) {
            z = false;
        }
        return z;
    }

    public boolean A06(MailboxCallback mailboxCallback) {
        boolean z = true;
        if (A00(this, mailboxCallback, 1) == null) {
            z = false;
        }
        return z;
    }

    public boolean A07(MailboxCallback mailboxCallback) {
        SlimMailbox A00 = A00(this, null, 1);
        if (A00 == null) {
            return false;
        }
        mailboxCallback.onCompletion(A00);
        return true;
    }

    public void A08(MailboxCallback mailboxCallback, int i) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        boolean z;
        Throwable A0J;
        synchronized (this) {
            C1gg A00 = this.A04.A00(0S2.A0N);
            int[] iArr = 1hZ.A00;
            int ordinal = A00.ordinal();
            int i2 = iArr[ordinal];
            if (i2 != 1) {
                if (i2 == 2) {
                    concurrentLinkedQueue = this.A06;
                    new 3L4(mailboxCallback, Integer.valueOf(i));
                } else {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.A06;
                            if (concurrentLinkedQueue2.isEmpty()) {
                                concurrentLinkedQueue2.add(new 3L4(mailboxCallback, Integer.valueOf(i)));
                            } else {
                                A0J = AnonymousClass001.A0J("The queue must be empty because the only way to get here is from the READY phase");
                            }
                        } else {
                            A0J = 1BL.A0h(A00, "calling CLEAN_UP must not return ", AnonymousClass001.A0k());
                        }
                        throw A0J;
                    }
                    concurrentLinkedQueue = this.A06;
                    new 3L4(mailboxCallback, Integer.valueOf(i));
                }
                concurrentLinkedQueue.add(z);
                return;
            }
            int i3 = iArr[ordinal];
            if (i3 == 1) {
                mailboxCallback.onCompletion(null);
            } else {
                if (i3 != 4) {
                    throw 1BL.A0h(A00, "Unsynchronized CLEAN_UP code does not exist for ", AnonymousClass001.A0k());
                }
                A02(this);
            }
        }
    }
}
