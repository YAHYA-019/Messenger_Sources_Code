package com.facebook.acra.anr.processmonitor.detector;

import X.04W;
import X.04Z;
import X.0Dm;
import X.0fH;
import X.AnonymousClass001;
import X.C04Y;
import X.C04a;
import X.C04m;
import X.C0ft;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.acra.anr.IANRDetector;
import com.facebook.acra.anr.StackTraceDumper;
import com.facebook.acra.anr.base.AbstractANRDetector;
import com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor;
import com.facebook.acra.anr.processmonitor.ProcessErrorStateListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: ProcessErrorMonitorANRDetector.class */
public class ProcessErrorMonitorANRDetector extends AbstractANRDetector implements ProcessErrorStateListener {
    public static final String LOG_TAG = "ProcessErrorMonitorANRDetector";
    public static final int START_DELAY_MS = 4000;
    public static ProcessErrorMonitorANRDetector sInstance;
    public final ProcessAnrErrorMonitor mAnrErrorMonitor;
    public long mDetectorStartTime;
    public boolean mErrorCleared;
    public boolean mFirstStart;
    public boolean mInAnr;
    public final Object mReportLock;
    public boolean mShouldReport;

    /* loaded from: ProcessErrorMonitorANRDetector$ThreadProvider.class */
    public class ThreadProvider {
        public static void runOnNewThread(Runnable runnable) {
            new Thread(runnable, "ProcessErrorMonitorANRDetectorThread").start();
        }
    }

    public ProcessErrorMonitorANRDetector(C04a c04a, int i) {
        super(c04a);
        this.mFirstStart = true;
        this.mReportLock = AnonymousClass001.A0R();
        this.mAnrErrorMonitor = new ProcessAnrErrorMonitor(c04a.A01, c04a.A04, false, i, true, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endAndProcessANRDataCapture() {
        synchronized (this) {
            0fH.A0j(LOG_TAG, "Recovered from ANR");
            if (this.mInAnr) {
                this.mInAnr = false;
                ThreadProvider.runOnNewThread(new Runnable() { // from class: com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (ProcessErrorMonitorANRDetector.this) {
                            ProcessErrorMonitorANRDetector processErrorMonitorANRDetector = ProcessErrorMonitorANRDetector.this;
                            if (!processErrorMonitorANRDetector.mErrorCleared) {
                                processErrorMonitorANRDetector.notifyStateListeners(C04m.A02);
                            }
                        }
                    }
                });
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x001b: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:6:0x000a, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector) from 0x0018: SPUT (r304v3 ?? I:com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector) A[Catch: all -> 0x001f] com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.sInstance com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector
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
    public static com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector getInstance(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v3 ??, still in use, count: 2, list:
          (r304v3 ??) from 0x001b: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:6:0x000a, B:11:0x0018] A[DONT_GENERATE, DONT_INLINE]
          (r304v3 ?? I:com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector) from 0x0018: SPUT (r304v3 ?? I:com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector) A[Catch: all -> 0x001f] com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.sInstance com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector
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

    public static void resetInstance() {
        synchronized (ProcessErrorMonitorANRDetector.class) {
            sInstance = null;
        }
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public void collectStackTrace() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        Exception exc = new Exception("ANR detected by ProcessErrorMonitorAnrDetector");
        exc.setStackTrace(stackTrace);
        0fH.A0s(LOG_TAG, "Generating ANR Report", exc);
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public void notifyStateListeners(C04m c04m) {
        04Z r0 = this.mANRConfig.A00;
        C04m c04m2 = C04m.A03;
        if (c04m != c04m2) {
            C04m c04m3 = C04m.A02;
            if (c04m != c04m3) {
                c04m3 = C04m.A04;
            }
            0Dm.A01(((C04Y) r0).A00, c04m3);
            return;
        }
        boolean A09 = C0ft.A09();
        boolean z = C0ft.A04 == null ? false : C0ft.A04.A06;
        0Dm.A01(((C04Y) r0).A00, c04m2);
        this.mInForegroundV1 = z;
        this.mInForegroundV2 = A09;
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onCheckFailed() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onCheckPerformed() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onErrorCleared() {
        boolean z;
        synchronized (this) {
            z = this.mShouldReport;
            if (!this.mErrorCleared) {
                this.mErrorCleared = true;
                notifyStateListeners(C04m.A04);
            }
        }
        synchronized (this.mReportLock) {
            anrHasEnded(z);
        }
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public boolean onErrorDetectOnOtherProcess(String str, String str2, String str3) {
        return true;
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onErrorDetected(String str, String str2) {
        boolean z;
        String str3;
        synchronized (this) {
            z = true;
            this.mInAnr = true;
            this.mErrorCleared = false;
            notifyStateListeners(C04m.A03);
            if (!this.mInForegroundV2 && !this.mInForegroundV1) {
                z = false;
            }
            boolean shouldCollectAndUploadANRReportsNow = shouldCollectAndUploadANRReportsNow();
            this.mShouldReport = shouldCollectAndUploadANRReportsNow;
            if (shouldCollectAndUploadANRReportsNow) {
                04W r0 = this.mANRConfig.A03;
                long uptimeMillis = SystemClock.uptimeMillis();
                r0.A0O = str;
                r0.A0P = str2;
                r0.A08 = uptimeMillis;
                04W.A00(r0);
            }
            str3 = LOG_TAG;
            0fH.A0a(Boolean.valueOf(this.mShouldReport), Boolean.valueOf(this.mInForegroundV1), Boolean.valueOf(this.mInForegroundV2), str3, "Should report is %b inForegroundV1 is %b inForegroundV2 is %b");
        }
        0fH.A0j(str3, "ANR detected");
        this.mANRConfig.A02.post(new Runnable() { // from class: com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector.1
            @Override // java.lang.Runnable
            public void run() {
                ProcessErrorMonitorANRDetector.this.endAndProcessANRDataCapture();
            }
        });
        if (this.mShouldReport) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            StackTraceDumper.dumpStackTraces(byteArrayOutputStream, null, null);
            String obj = byteArrayOutputStream.toString();
            synchronized (this.mReportLock) {
                try {
                    startReport(obj, null, null, false);
                } catch (IOException unused) {
                }
            }
            return;
        }
        if (z) {
            04W r02 = this.mANRConfig.A03;
            boolean z2 = this.mInForegroundV1;
            boolean z3 = this.mInForegroundV2;
            r02.A0S = z2;
            r02.A0T = z3;
            04W.A00(r02);
        }
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onMaxChecksReachedAfterError() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onMaxChecksReachedBeforeError() {
    }

    @Override // com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
    public void onStart() {
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void pause() {
        this.mAnrErrorMonitor.pause();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void resume() {
        this.mAnrErrorMonitor.resume();
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector
    public void start(long j) {
        synchronized (this) {
            if (this.mDetectorStartTime <= 0) {
                this.mDetectorStartTime = j;
            }
            if (this.mFirstStart) {
                this.mFirstStart = false;
                this.mAnrErrorMonitor.startMonitoringAfterDelay(this, 4000L);
            }
        }
    }

    @Override // com.facebook.acra.anr.base.AbstractANRDetector, com.facebook.acra.anr.IANRDetector
    public void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener) {
        synchronized (this) {
            this.mAnrErrorMonitor.stopMonitoring();
        }
        if (aNRDetectorStopListener != null) {
            aNRDetectorStopListener.onStop();
        }
    }
}
