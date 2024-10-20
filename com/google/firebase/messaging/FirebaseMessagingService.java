package com.google.firebase.messaging;

import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.C1bL;
import X.C4r2;
import X.C7xy;
import X.JRr;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: FirebaseMessagingService.class */
public class FirebaseMessagingService extends C4r2 {
    public static final Queue A00 = new ArrayDeque(10);

    public static void A02(Intent intent, String str) {
        String str2;
        Bundle A05 = 1BK.A05();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A05.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A05.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A05.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A05.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A05.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A05.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A05.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (ConstantsKt.CAMERA_ID_BACK.equals(JRr.A03(extras, "gcm.n.e")) || JRr.A03(extras, "gcm.n.icon") != null) {
                    str2 = "display";
                    A05.putString("_nmc", str2);
                }
            }
            str2 = "data";
            A05.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(A05);
            StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(str) + 22 + 1BK.A02(valueOf));
            A0l.append("Sending event=");
            A0l.append(str);
            Log.d("FirebaseMessaging", 1BL.A0u(" params=", valueOf, A0l));
        }
        C1bL A002 = C1bL.A00();
        C1bL.A01(A002);
        A002.A02.A02(C7xy.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static boolean A03(Intent intent) {
        boolean z = false;
        if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            z = ConstantsKt.CAMERA_ID_BACK.equals(intent.getStringExtra("google.c.a.e"));
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v1 ??, still in use, count: 3, list:
          (r310v1 ??) from 0x04c4: PHI (r310v2 ??) = (r310v1 ??), (r310v3 ??) binds: [B:584:0x04bf, B:128:0x047d] A[DONT_GENERATE, DONT_INLINE]
          (r310v1 ?? I:X.Inn) from 0x048e: INVOKE (r0v135 ?? I:X.J4t), (r310v1 ?? I:X.Inn) DIRECT call: X.J4t.<init>(X.Inn):void A[Catch: all -> 0x0d72, MD:(X.Inn):void (m)]
          (r310v1 ?? I:X.Inn) from 0x04c1: IPUT (r0v140 ?? I:X.4Ez), (r310v1 ?? I:X.Inn) A[Catch: all -> 0x0d72] X.Inn.A00 X.4Ez
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
    @Override // X.C4r2
    public final void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v1 ??, still in use, count: 3, list:
          (r310v1 ??) from 0x04c4: PHI (r310v2 ??) = (r310v1 ??), (r310v3 ??) binds: [B:584:0x04bf, B:128:0x047d] A[DONT_GENERATE, DONT_INLINE]
          (r310v1 ?? I:X.Inn) from 0x048e: INVOKE (r0v135 ?? I:X.J4t), (r310v1 ?? I:X.Inn) DIRECT call: X.J4t.<init>(X.Inn):void A[Catch: all -> 0x0d72, MD:(X.Inn):void (m)]
          (r310v1 ?? I:X.Inn) from 0x04c1: IPUT (r0v140 ?? I:X.4Ez), (r310v1 ?? I:X.Inn) A[Catch: all -> 0x0d72] X.Inn.A00 X.4Ez
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

    public void A07(RemoteMessage remoteMessage) {
    }
}
