package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4r2, reason: invalid class name */
/* loaded from: 4r2.class */
public abstract class C4r2 extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04;

    public C4r2() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4Eq(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A04 = new Object();
        this.A01 = 0;
    }

    public static final void A04(Intent intent, C4r2 c4r2) {
        if (intent != null) {
            FirebaseInstanceIdReceiver.A02(intent);
        }
        synchronized (c4r2.A04) {
            int i = c4r2.A01 - 1;
            c4r2.A01 = i;
            if (i == 0) {
                c4r2.stopSelfResult(c4r2.A00);
            }
        }
    }

    public abstract void A05(Intent intent);

    public boolean A06(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                android.util.Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!FirebaseMessagingService.A03(intent)) {
            return true;
        }
        if (ConstantsKt.CAMERA_ID_BACK.equals(intent.getStringExtra("google.c.a.tc"))) {
            C1bL A00 = C1bL.A00();
            C1bL.A01(A00);
            A00.A02.A02(C7xy.class);
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            android.util.Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        FirebaseMessagingService.A02(intent, "_no");
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 2, list:
          (r304v4 ??) from 0x003d: PHI (r304v3 ??) = (r304v2 ??), (r304v4 ??) binds: [B:15:0x002c, B:19:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:android.os.Binder) from 0x003a: IPUT (r304v4 ?? I:android.os.Binder), (r301v0 'this' ?? I:X.4r2 A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0041] X.4r2.A02 android.os.Binder
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
    @Override // android.app.Service
    public final android.os.IBinder onBind(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 2, list:
          (r304v4 ??) from 0x003d: PHI (r304v3 ??) = (r304v2 ??), (r304v4 ??) binds: [B:15:0x002c, B:19:0x0039] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:android.os.Binder) from 0x003a: IPUT (r304v4 ?? I:android.os.Binder), (r301v0 'this' ?? I:X.4r2 A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0041] X.4r2.A02 android.os.Binder
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A01 = C08o.A01(this, 1517681828);
        int A04 = 0FI.A04(738615142);
        synchronized (this.A04) {
            try {
                this.A00 = i2;
                this.A01++;
            } catch (Throwable th) {
                0FI.A0A(1602681485, A04);
                C08o.A03(1320837126, A01);
                throw th;
            }
        }
        Intent intent2 = (Intent) C4Es.A00().A03.poll();
        int i4 = 2;
        if (intent2 == null) {
            A04(intent, this);
            0FI.A0A(-2060694170, A04);
            i3 = 91601060;
        } else if (A06(intent2)) {
            A04(intent, this);
            0FI.A0A(787172333, A04);
            i3 = -1187603945;
        } else {
            this.A03.execute(new JRt(intent2, intent, this));
            i4 = 3;
            0FI.A0A(-327106842, A04);
            i3 = -368383253;
        }
        C08o.A03(i3, A01);
        return i4;
    }
}
