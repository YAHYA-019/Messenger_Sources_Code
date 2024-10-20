package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.messengereffectservicehost.MessengerEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.hybridlogsink.HybridLogSink;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: I8q.class */
public final class I8q {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AREngineController A04;
    public HybridLogSink A05;
    public Hie A06;
    public final HgT A07;
    public final Context A08;
    public final AssetManager A09;
    public final AndroidAsyncExecutorFactory A0A;
    public final AndroidAsyncExecutorFactory A0B;
    public volatile EffectServiceHost A0C;

    public I8q(Context context, Hie hie, HgT hgT, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A07 = hgT;
        this.A08 = context;
        this.A09 = context.getResources().getAssets();
        this.A0A = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A0B = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A06 = hie;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v6 ??, still in use, count: 2, list:
          (r302v6 ??) from 0x005d: PHI (r302v2 ??) = (r302v1 ??), (r302v6 ??) binds: [B:6:0x0008, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE]
          (r302v6 ?? I:com.facebook.cameracore.mediapipeline.engine.AREngineController) from 0x005a: IPUT (r302v6 ?? I:com.facebook.cameracore.mediapipeline.engine.AREngineController), (r301v0 ?? I:X.I8q) A[Catch: all -> 0x0061] X.I8q.A04 com.facebook.cameracore.mediapipeline.engine.AREngineController
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
    public static com.facebook.cameracore.mediapipeline.engine.AREngineController A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v6 ??, still in use, count: 2, list:
          (r302v6 ??) from 0x005d: PHI (r302v2 ??) = (r302v1 ??), (r302v6 ??) binds: [B:6:0x0008, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE]
          (r302v6 ?? I:com.facebook.cameracore.mediapipeline.engine.AREngineController) from 0x005a: IPUT (r302v6 ?? I:com.facebook.cameracore.mediapipeline.engine.AREngineController), (r301v0 ?? I:X.I8q) A[Catch: all -> 0x0061] X.I8q.A04 com.facebook.cameracore.mediapipeline.engine.AREngineController
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

    public static void A01(I8q i8q) {
        synchronized (i8q) {
            if (i8q.A0C != null) {
                i8q.A0C.destroy();
                i8q.A0C = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerDataProviderConfigWithSlam] */
    public EffectServiceHost A02() {
        if (this.A0C == null) {
            synchronized (this) {
                if (this.A0C == null) {
                    Hie hie = this.A06;
                    Context applicationContext = this.A08.getApplicationContext();
                    HfZ hfZ = hie.A02;
                    hfZ.A03 = new Object();
                    WorldTrackerDataProviderConfig worldTrackerDataProviderConfig = new WorldTrackerDataProviderConfig();
                    ?? obj = new Object();
                    obj.config = worldTrackerDataProviderConfig;
                    obj.isARCoreEnabled = false;
                    obj.useFirstframe = false;
                    obj.slamFactoryProvider = null;
                    hfZ.A00 = obj;
                    this.A0C = new MessengerEffectServiceHost(applicationContext, hie.A03, hie.A04, hie.A01, hie.A05, new EffectServiceHostConfig(hfZ), hie.A06, hie.A00, null);
                }
            }
        }
        return this.A0C;
    }

    public void finalize() {
        int A03 = 0FI.A03(-1139031947);
        A01(this);
        0FI.A09(1757090259, A03);
    }
}
