package com.facebook.common.dextricks;

import X.0FI;
import X.0Fe;
import X.0GT;
import X.AnonymousClass001;
import X.AnonymousClass023;
import X.C01w;
import X.C08o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Messenger;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.endtoend.EndToEnd;

/* loaded from: DexOptimization.class */
public final class DexOptimization {
    public static final String ACTION_OPTIMIZE = "com.facebook.dexopt";
    public static final int JOB_ID = -87105851;
    public static final String OPT_KEY_CLIENT = "client";
    public static final String OPT_KEY_DEX_STORE_ROOT = "dexStoreRoot";
    public static final String PROCESS_NAME = "optsvc";

    /* loaded from: DexOptimization$Client.class */
    public final class Client {
        public static volatile Messenger sOptListener;

        public static Messenger constructClientMessenger(Context context, DexStore dexStore) {
            0GT A00 = 0GT.A00(context);
            return new Messenger(new DexOptimizationMessageHandler(context, getShouldDisableRestartProcessAfterDexOpt(context, dexStore, A00), A00.A0m, A00.A2U));
        }

        public static Messenger getMessenger(Context context, DexStore dexStore) {
            if (sOptListener == null) {
                synchronized (Client.class) {
                    if (sOptListener == null) {
                        sOptListener = constructClientMessenger(context, dexStore);
                    }
                }
            }
            return sOptListener;
        }

        public static boolean getShouldDisableRestartProcessAfterDexOpt(Context context, DexStore dexStore, 0GT r303) {
            return (r303.A12 && dexStore.isReoptimization(context)) || EndToEnd.isRunningEndToEndTest();
        }

        public static void startBackgroundOptimization(Context context, DexStore dexStore) {
            try {
                AnonymousClass001.A1C("starting background optimization");
                0Fe.enqueueWork(context, Service.class, DexOptimization.JOB_ID, new Intent(DexOptimization.ACTION_OPTIMIZE).putExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT, dexStore.root.getAbsolutePath()).putExtra(DexOptimization.OPT_KEY_CLIENT, getMessenger(context, dexStore)));
            } catch (SecurityException e) {
                Mlog.w("Failure to start DexOptimization.Service", e);
            } catch (RuntimeException e2) {
                if (!AnonymousClass001.A1Y(e2)) {
                    throw e2;
                }
                Mlog.w("Failure to start DexOptimization.Service", e2);
            }
        }
    }

    /* loaded from: DexOptimization$Service.class */
    public final class Service extends 0Fe {
        public boolean isScreenOn;
        public OptSvcBroadcastReceiver mReceiver;
        public long unpauseTime;

        /* loaded from: DexOptimization$Service$OptSvcBroadcastReceiver.class */
        public final class OptSvcBroadcastReceiver extends BroadcastReceiver {
            public OptSvcBroadcastReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int i;
                Object[] objArr;
                String str;
                int A01 = 0FI.A01(-1965829126);
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        Service.this.isScreenOn = true;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen on";
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        Service.this.isScreenOn = false;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen off";
                    } else if (DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE.equals(action)) {
                        long longExtra = intent.getLongExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, -1);
                        if (longExtra < 0) {
                            Mlog.w("bogus pause broadcast received", new Object[0]);
                            i = -1976892630;
                            0FI.A0D(i, A01, intent);
                        } else {
                            Service service = Service.this;
                            long max = Math.max(service.unpauseTime, longExtra);
                            service.unpauseTime = max;
                            objArr = new Object[]{Long.valueOf(max), Long.valueOf((System.nanoTime() - max) / 1000000)};
                            str = "pause broadcast received: will unpause at time %s (%s ms from now)";
                        }
                    }
                    Mlog.v(str, objArr);
                }
                i = -1358566438;
                0FI.A0D(i, A01, intent);
            }
        }

        /* loaded from: DexOptimization$Service$OptSvcOptimizationConfigurationProvider.class */
        public final class OptSvcOptimizationConfigurationProvider extends OptimizationConfiguration.Provider {
            public OptimizationConfiguration mPausedConfig;
            public OptimizationConfiguration mScreenOffConfig;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public OptSvcOptimizationConfigurationProvider() {
                /*
                    r301 = this;
                    r0 = r301
                    r1 = r302
                    com.facebook.common.dextricks.DexOptimization.Service.this = r1
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r0 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r303 = r0
                    r0 = r303
                    r0.<init>()
                    com.facebook.common.dextricks.Prio r0 = com.facebook.common.dextricks.Prio.lowest()
                    r304 = r0
                    r0 = r303
                    r1 = r304
                    r0.mPrio = r1
                    r0 = r303
                    r1 = 1
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r0 = r0.setInBackground(r1)
                    r0 = r303
                    r1 = 300(0x12c, float:4.2E-43)
                    r0.mOptTimeSliceMs = r1
                    r0 = r303
                    r1 = 1000(0x3e8, float:1.401E-42)
                    r0.mYieldTimeSliceMs = r1
                    r0 = r303
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.build()
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.<init>(r1)
                    r0 = r301
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.baseline
                    r305 = r0
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r0 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r303 = r0
                    r0 = r303
                    r1 = r305
                    r0.<init>(r1)
                    r0 = r303
                    r1 = 900(0x384, float:1.261E-42)
                    r0.mOptTimeSliceMs = r1
                    r0 = r303
                    r1 = 300(0x12c, float:4.2E-43)
                    r0.mYieldTimeSliceMs = r1
                    r0 = r303
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.build()
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.mScreenOffConfig = r1
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r0 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r303 = r0
                    r0 = r303
                    r1 = r305
                    r0.<init>(r1)
                    r0 = r303
                    r1 = 0
                    r0.mOptTimeSliceMs = r1
                    r0 = r303
                    r1 = 100
                    r0.mYieldTimeSliceMs = r1
                    r0 = r303
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r0.build()
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.mPausedConfig = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimization.Service.OptSvcOptimizationConfigurationProvider.<init>(com.facebook.common.dextricks.DexOptimization$Service):void");
            }

            @Override // com.facebook.common.dextricks.OptimizationConfiguration.Provider
            public OptimizationConfiguration getInstantaneous() {
                long nanoTime = System.nanoTime();
                Service service = Service.this;
                return nanoTime < service.unpauseTime ? this.mPausedConfig : service.isScreenOn ? this.baseline : this.mScreenOffConfig;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onCreate() {
            int A00 = C08o.A00(this, 954401035);
            int A04 = 0FI.A04(1529376969);
            super.onCreate();
            Mlog.v("optsvc created", AnonymousClass001.A1Z());
            this.isScreenOn = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = new OptSvcBroadcastReceiver();
            this.mReceiver = optSvcBroadcastReceiver;
            AnonymousClass023.A00(optSvcBroadcastReceiver, this, intentFilter);
            ((0Fe) this).mInterruptIfStopped = true;
            0FI.A0A(-1148641995, A04);
            C08o.A02(-1359234208, A00);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onDestroy() {
            int A04 = 0FI.A04(1172643408);
            Mlog.v("optsvc being shut down", AnonymousClass001.A1Z());
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = this.mReceiver;
            if (optSvcBroadcastReceiver != null) {
                unregisterReceiver(optSvcBroadcastReceiver);
                this.mReceiver = null;
            }
            super.onDestroy();
            0FI.A0A(1823019804, A04);
            C01w.A00(this);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v7 ??, still in use, count: 4, list:
              (r311v7 ??) from 0x00dd: PHI (r311v3 ??) = (r311v0 ??), (r311v7 ??) binds: [B:66:0x00da, B:52:0x00ce] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ??) from 0x0104: PHI (r311v5 ??) = (r311v1 ??), (r311v7 ??) binds: [B:64:0x0101, B:43:0x00d3] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ??) from 0x0123: PHI (r311v6 ??) = (r311v4 ??), (r311v7 ??) binds: [B:50:0x0123, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ?? I:com.facebook.common.dextricks.SocketLock) from 0x0059: INVOKE (r0v45 ?? I:boolean) = (r311v7 ?? I:com.facebook.common.dextricks.SocketLock) VIRTUAL call: com.facebook.common.dextricks.SocketLock.tryAcquire():boolean A[Catch: all -> 0x00ce, InterruptedException -> 0x00d3, MD:():boolean (m)]
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
        public void onHandleWork(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v7 ??, still in use, count: 4, list:
              (r311v7 ??) from 0x00dd: PHI (r311v3 ??) = (r311v0 ??), (r311v7 ??) binds: [B:66:0x00da, B:52:0x00ce] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ??) from 0x0104: PHI (r311v5 ??) = (r311v1 ??), (r311v7 ??) binds: [B:64:0x0101, B:43:0x00d3] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ??) from 0x0123: PHI (r311v6 ??) = (r311v4 ??), (r311v7 ??) binds: [B:50:0x0123, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
              (r311v7 ?? I:com.facebook.common.dextricks.SocketLock) from 0x0059: INVOKE (r0v45 ?? I:boolean) = (r311v7 ?? I:com.facebook.common.dextricks.SocketLock) VIRTUAL call: com.facebook.common.dextricks.SocketLock.tryAcquire():boolean A[Catch: all -> 0x00ce, InterruptedException -> 0x00d3, MD:():boolean (m)]
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
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
    }
}
