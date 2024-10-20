package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.os.Process;
import com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.49t, reason: invalid class name */
/* loaded from: 49t.class */
public final class C49t extends Handler {
    public PrivacyControlledUploader A00;
    public 4AR A01;
    public Iterator A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final 0QO A07;
    public final C49v A08;
    public final C49n A09;
    public final C49p A0A;
    public final HandlerThread A0B;
    public final boolean A0C;
    public static final C03z A0E = C03z.A00();
    public static final C49u A0D = new Object();

    public C49t(Context context, HandlerThread handlerThread, C49n c49n, C49p c49p) {
        super(handlerThread.getLooper());
        this.A07 = new 0QO(2);
        this.A03 = false;
        this.A05 = false;
        this.A08 = new C49v(this);
        this.A06 = context;
        this.A0B = handlerThread;
        this.A09 = c49n;
        this.A0A = c49p;
        this.A0C = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        RuntimeException e;
        Parcelable parcelable;
        String str;
        0V0.A00("exitStateMachine");
        try {
            Context context = this.A06;
            C49n c49n = this.A09;
            int i = c49n.A00;
            String str2 = c49n.A02;
            boolean z = this.A04;
            0QO r0 = this.A07;
            if (i != -1) {
                Intent intent = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN").setPackage(context.getPackageName());
                Bundle bundle = new Bundle();
                bundle.putInt("job_id", i);
                bundle.putString("hack_action", str2);
                bundle.putBoolean("will_retry", z);
                int size = r0.size();
                ArrayList arrayList = new ArrayList(size);
                ArrayList arrayList2 = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    File file = (File) r0.A06(i2);
                    arrayList.add(r0.A04(i2));
                    arrayList2.add(file != null ? file.getAbsolutePath() : null);
                }
                bundle.putStringArrayList("successful_processes", arrayList);
                bundle.putStringArrayList("newest_files_uploaded", arrayList2);
                Intent putExtras = intent.putExtras(bundle);
                Intent intent2 = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN.token");
                intent2.setPackage(context.getPackageName());
                try {
                    parcelable = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 30 ? 1140850688 : 1073741824);
                } catch (SecurityException e2) {
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    int myUid = Process.myUid();
                    String nameForUid = packageManager.getNameForUid(myUid);
                    int callingUid = Binder.getCallingUid();
                    String nameForUid2 = packageManager.getNameForUid(callingUid);
                    Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                    while (true) {
                        parcelable = null;
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        PackageInfo next = it.next();
                        if (next.applicationInfo.uid == myUid) {
                            str = next.packageName;
                            break;
                        }
                    }
                    0fH.A17("UploadServiceBus", "%s, ctx_pm=%s, uid=%d, uid_pn=%s, calling_uid=%d, calling_uid_pn=%s, pi_pn=%s", new Object[]{e2.getMessage(), packageName, Integer.valueOf(myUid), nameForUid, Integer.valueOf(callingUid), nameForUid2, str});
                }
                try {
                    context.sendBroadcast(putExtras.putExtra("uploader_service_broadcast_auth_token", parcelable));
                } catch (RuntimeException e3) {
                    e = e3;
                    if (e instanceof SecurityException) {
                        0fH.A0w("UploadServiceBus", "Analytics2 not allowed in this application.", e);
                    } else {
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            while (cause.getCause() != null) {
                                cause = cause.getCause();
                            }
                            if (cause instanceof DeadObjectException) {
                                0fH.A0r("UploadServiceBus", "Failed to send broadcast. Handler may have died", e);
                            }
                        }
                    }
                }
                this.A0A.Bwz();
                if (this.A0C) {
                    this.A0B.quit();
                }
                return;
            }
            e = AnonymousClass001.A0L("jobId = -1");
            throw e;
        } finally {
            0V1.A00();
        }
    }

    private void A01(String str, Throwable th) {
        0fH.A0g(false, "UploadJobHandler", "UploadJobHandler#signalVoluntaryTermination needsReschedule: %s");
        this.A0A.CUy(false);
        A00();
        throw new RuntimeException(0Pz.A0W(1BJ.A00(266), str), th);
    }

    public void A02() {
        synchronized (this) {
            if (!this.A05) {
                this.A05 = true;
                sendMessage(obtainMessage(1));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v3 ??, still in use, count: 4, list:
          (r319v3 ??) from 0x03ae: PHI (r319v2 ??) = (r319v1 ??), (r319v3 ??) binds: [B:183:0x0416, B:159:0x03a9] A[DONT_GENERATE, DONT_INLINE]
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x039e: IPUT (r0v39 ?? I:X.1Rb), (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) A[Catch: all -> 0x0441] com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader.A01 X.1Rb
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x03a5: IPUT (r1v18 ?? I:X.49u), (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) A[Catch: all -> 0x0441] com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader.A00 X.49u
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x03ab: IPUT 
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader)
          (r301v0 'this' ?? I:X.49t A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0441] X.49t.A00 com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader
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
    @Override // android.os.Handler
    public void handleMessage(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r319v3 ??, still in use, count: 4, list:
          (r319v3 ??) from 0x03ae: PHI (r319v2 ??) = (r319v1 ??), (r319v3 ??) binds: [B:183:0x0416, B:159:0x03a9] A[DONT_GENERATE, DONT_INLINE]
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x039e: IPUT (r0v39 ?? I:X.1Rb), (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) A[Catch: all -> 0x0441] com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader.A01 X.1Rb
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x03a5: IPUT (r1v18 ?? I:X.49u), (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) A[Catch: all -> 0x0441] com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader.A00 X.49u
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader) from 0x03ab: IPUT 
          (r319v3 ?? I:com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader)
          (r301v0 'this' ?? I:X.49t A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0441] X.49t.A00 com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader
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
}
