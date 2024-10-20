package com.facebook.rti.push.service;

import X.05L;
import X.05P;
import X.05S;
import X.05T;
import X.05V;
import X.05X;
import X.05Y;
import X.09C;
import X.09F;
import X.09L;
import X.09M;
import X.09O;
import X.09S;
import X.0Ep;
import X.0Fw;
import X.0Go;
import X.0Gp;
import X.0Gq;
import X.0MY;
import X.0Mb;
import X.0Mf;
import X.0Mi;
import X.0Pz;
import X.0QA;
import X.0QS;
import X.0QV;
import X.0QY;
import X.0Qc;
import X.0RD;
import X.0RW;
import X.0Rw;
import X.0S2;
import X.0Sd;
import X.0TJ;
import X.0TU;
import X.0TV;
import X.0Up;
import X.0Uy;
import X.0eZ;
import X.0fH;
import X.0oL;
import X.0oM;
import X.0qL;
import X.0wZ;
import X.11T;
import X.16C;
import X.16D;
import X.16O;
import X.16Q;
import X.16W;
import X.17P;
import X.17V;
import X.18S;
import X.18Y;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass090;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass096;
import X.AnonymousClass161;
import X.AnonymousClass185;
import X.C01s;
import X.C05O;
import X.C08r;
import X.C08t;
import X.C09D;
import X.C13n;
import X.C15n;
import X.C16f;
import X.C16m;
import X.C16v;
import X.C17l;
import X.C17n;
import X.C17q;
import X.C17v;
import X.C17x;
import X.C18d;
import X.C18e;
import X.C18k;
import X.C18z;
import X.C19f;
import X.C19g;
import X.C19p;
import X.C19q;
import X.C19r;
import X.C19s;
import X.C19u;
import X.C19x;
import X.C1Aq;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FbnsServiceDelegate.class */
public class FbnsServiceDelegate extends MqttPushServiceDelegate {
    public static FbnsServiceDelegate A0E;
    public static final List A0F;
    public static final List A0G;
    public static final Map A0H;
    public 05S A00;
    public FbnsAIDLService A01;
    public C19f A02;
    public 0RW A03;
    public 0RD A04;
    public C19p A05;
    public C19r A06;
    public C19u A07;
    public C19x A08;
    public String A09;
    public Map A0A;
    public final 17V A0B;
    public final C19g A0C;
    public final Object A0D;

    static {
        HashMap hashMap = new HashMap();
        A0H = hashMap;
        hashMap.put("com.instagram.android", 30);
        hashMap.put("com.facebook.lite", 100);
        hashMap.put("com.oculus.horizon", 10);
        A0F = new 0eZ(0);
        A0G = new 0eZ(1);
    }

    public FbnsServiceDelegate(05P r302) {
        super(r302);
        this.A0D = AnonymousClass001.A0R();
        this.A0A = AnonymousClass001.A0u();
        C19g c19g = new C19g();
        this.A0C = c19g;
        this.A0B = new 0Sd(c19g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v1 ??, still in use, count: 2, list:
          (r307v1 ??) from 0x004c: PHI (r307v2 ??) = (r307v1 ??), (r307v4 ??) binds: [B:31:0x005e, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
          (r307v1 ?? I:java.lang.Object) from 0x0060: INVOKE (r0v12 ?? I:java.util.Map), (r1v1 ?? I:java.lang.Object), (r307v1 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0072, MD:(K, V):V (c)]
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
    public static X.C19q A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v1 ??, still in use, count: 2, list:
          (r307v1 ??) from 0x004c: PHI (r307v2 ??) = (r307v1 ??), (r307v4 ??) binds: [B:31:0x005e, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
          (r307v1 ?? I:java.lang.Object) from 0x0060: INVOKE (r0v12 ?? I:java.util.Map), (r1v1 ?? I:java.lang.Object), (r307v1 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0072, MD:(K, V):V (c)]
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

    public static String A04(String str) {
        return 0Fw.A02(str) ? ((AnonymousClass096) C08r.A00).A03 : FbnsService.class.getName();
    }

    private void A05(Intent intent) {
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        05T r0 = this.A00;
        09F A01 = ((AnonymousClass096) C08r.A00).A01(intent, r0);
        if (!str.equals(C05O.A02(this)) && !A01.BXE()) {
            this.A07.A03(new 0QS(this, str), str);
        } else {
            r0.A02(intent);
            05V.A01(intent, r0, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x03ea, code lost:
    
        if (android.text.TextUtils.isEmpty(r308) == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(android.content.Intent r301, com.facebook.rti.push.service.FbnsServiceDelegate r302) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A06(android.content.Intent, com.facebook.rti.push.service.FbnsServiceDelegate):void");
    }

    public static void A07(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2) {
        String str3;
        String str4;
        HashMap A0u = AnonymousClass001.A0u();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            0fH.A0j("FbnsServiceDelegate", "service/register/invalid_input");
            str3 = "reg_fail";
            str4 = "invalid input";
        } else {
            try {
                C19p c19p = fbnsServiceDelegate.A05;
                09C r0 = c19p.A04;
                11T.A0F(str, 0);
                long j = r0.getLong(str, 120000L);
                Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER_RETRY");
                intent.putExtra("pkg_name", str);
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str2);
                c19p.A02.A02(intent);
                05X r02 = new 05X();
                Context context = c19p.A01;
                r02.A0D(intent, context.getClassLoader());
                r02.A0A();
                ((05Y) r02).A08 = c19p.A09;
                PendingIntent A03 = r02.A03(context, 0, 134217728);
                c19p.A08.put(str, A03);
                c19p.A06.A06(context, c19p.A00, 2, SystemClock.elapsedRealtime() + j, A03);
                long j2 = j * 2;
                if (j2 > 86400000) {
                    j2 = 86400000;
                }
                0Mi AP6 = c19p.A04.AP6();
                AP6.CaI(str, j2);
                AP6.AGo("FbnsRegistrarRetry", "PreferencesManager failed to store backOffTimeMs");
            } catch (Exception e) {
                0fH.A0s("FbnsServiceDelegate", "service/register_retry/schedule_failed", e);
                A09(fbnsServiceDelegate, "reg_retry_schedule_fail", str, str2, e.getMessage(), A0u);
            }
            C19u c19u = fbnsServiceDelegate.A07;
            0fH.A0d(str, str2, "RegistrationState", "add app %s %s");
            16Q.A00(str);
            16Q.A00(str2);
            C19s c19s = new C19s();
            c19s.A02 = str;
            c19s.A01 = str2;
            c19s.A00 = AnonymousClass002.A0G();
            C19u.A00(0Pz.A01(c19u.A00, c19u.A01, "registrations"), c19s, str);
            Context applicationContext = ((C05O) fbnsServiceDelegate).A01.getApplicationContext();
            11T.A0A(applicationContext);
            if (16O.A00(applicationContext)) {
                ((MqttPushServiceDelegate) fbnsServiceDelegate).A0C.A0S.BGL();
                throw null;
            }
            try {
                JSONObject A12 = AnonymousClass001.A12();
                A12.putOpt("pkg_name", str);
                A12.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str2);
                String obj = A12.toString();
                18Y r03 = new 0TV(fbnsServiceDelegate, str, str2, A0u);
                0fH.A0g(obj, "FbnsServiceDelegate", "publish /fbns_reg_req=%s");
                try {
                } catch (0Mb unused) {
                }
                try {
                    if (((MqttPushServiceDelegate) fbnsServiceDelegate).A09.A0A(r03, 0S2.A01, "/fbns_reg_req", obj.getBytes("UTF-8")) != -1) {
                        return;
                    }
                    str3 = "reg_fail";
                    str4 = "mqtt not connected";
                } catch (UnsupportedEncodingException unused2) {
                    throw AnonymousClass001.A0T("UTF-8 not supported");
                }
            } catch (JSONException e2) {
                0fH.A0s("FbnsServiceDelegate", "service/register/serialize_exception", e2);
                A09(fbnsServiceDelegate, "reg_fail", str, str2, "serialization exception: unknown client", A0u);
                return;
            }
        }
        A09(fbnsServiceDelegate, str3, str, str2, str4, A0u);
    }

    public static void A08(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3) {
        0fH.A0d(str, str2, "FbnsServiceDelegate", "service/registered; package=%s, token=%s");
        fbnsServiceDelegate.A05.A00(str);
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", "registered");
        if (str2 != null) {
            intent.putExtra("data", str2);
        }
        intent.putExtra("push_renew_trigger", str3);
        fbnsServiceDelegate.A05(intent);
    }

    public static void A09(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map) {
        String str5 = str2;
        fbnsServiceDelegate.A08.A01("registrations", new String[]{str, str2}, 1L);
        C19f c19f = fbnsServiceDelegate.A02;
        long j = ((MqttPushServiceDelegate) fbnsServiceDelegate).A00;
        boolean A00 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A00();
        long j2 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A04.get();
        09C r0 = c19f.A02;
        String str6 = 0Mf.A02.mPrefKey;
        11T.A0F(str6, 0);
        boolean z = r0.getBoolean(str6, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - c19f.A00;
        long j4 = elapsedRealtime - j;
        long j5 = elapsedRealtime - c19f.A04.A05.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        C15n c15n = new C15n("fbns_push_registration_lifecycle", c19f.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        ((0qL) c15n).A08 = str;
        if (str5 == null) {
            str5 = "";
        }
        ((0qL) c15n).A07 = str5;
        ((0qL) c15n).A05 = str4;
        ((0qL) c15n).A00 = elapsedRealtime;
        ((0qL) c15n).A04 = j3;
        ((0qL) c15n).A01 = j4;
        ((0qL) c15n).A02 = j5;
        ((0qL) c15n).A03 = j6;
        ((0qL) c15n).A0A = A00;
        ((0qL) c15n).A06 = str3;
        ((0qL) c15n).A09 = z;
        C15n.A00(c15n, c19f, str, map);
    }

    public static void A0A(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map, long j) {
        fbnsServiceDelegate.A08.A01("notifications", new String[]{str, str3}, 1L);
        C19f c19f = fbnsServiceDelegate.A02;
        long j2 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A00;
        boolean A00 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A00();
        long j3 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A04.get();
        09C r0 = c19f.A02;
        String str5 = 0Mf.A02.mPrefKey;
        11T.A0F(str5, 0);
        boolean z = r0.getBoolean(str5, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - c19f.A00;
        long j5 = elapsedRealtime - j2;
        long j6 = elapsedRealtime - c19f.A04.A05.get();
        long j7 = elapsedRealtime - j3;
        if (j3 < 0) {
            j7 = 0;
        }
        C15n c15n = new C15n("fbns_push_notification_lifecycle", c19f.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        ((0QA) c15n).A08 = str;
        ((0QA) c15n).A07 = str3;
        ((0QA) c15n).A09 = str2;
        ((0QA) c15n).A01 = elapsedRealtime;
        ((0QA) c15n).A05 = j4;
        ((0QA) c15n).A02 = j5;
        ((0QA) c15n).A03 = j6;
        ((0QA) c15n).A04 = j7;
        ((0QA) c15n).A0B = A00;
        ((0QA) c15n).A06 = str4;
        ((0QA) c15n).A00 = j;
        ((0QA) c15n).A0A = z;
        C15n.A00(c15n, c19f, str, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (r0.A00() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0B(java.lang.String r302, java.lang.String r303, java.lang.String r304) {
        /*
            r301 = this;
            r0 = r301
            X.19x r0 = r0.A08
            r305 = r0
            r0 = r302
            r306 = r0
            r0 = r303
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L3c
            r0 = r301
            java.lang.String r0 = X.C05O.A02(r0)
            r308 = r0
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r302
            r3[r4] = r5
            r3 = 1
            r4 = r308
            r2[r3] = r4
            r2 = 2
            r3 = r303
            r1[r2] = r3
            r309 = r0
            java.lang.String r0 = "services"
            r310 = r0
            r0 = 1
            r311 = r0
            r0 = r305
            r1 = r310
            r2 = r309
            r3 = r311
            r0.A01(r1, r2, r3)
        L3c:
            r0 = r301
            X.19f r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9f
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0B
            boolean r0 = r0.get()
            r313 = r0
            r0 = r301
            long r0 = r0.A00
            r314 = r0
            r0 = r301
            X.17K r0 = r0.A07
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L70
            r0 = r308
            boolean r0 = r0.A00()
            r316 = r0
            r0 = 1
            r317 = r0
            r0 = r316
            if (r0 != 0) goto L73
        L70:
            r0 = 0
            r317 = r0
        L73:
            r0 = r301
            X.17K r0 = r0.A07
            r308 = r0
            r0 = r308
            if (r0 == 0) goto La0
            r0 = r308
            java.util.concurrent.atomic.AtomicLong r0 = r0.A04
            r308 = r0
            r0 = r308
            long r0 = r0.get()
            r318 = r0
        L8c:
            r0 = r305
            r1 = r306
            r2 = r307
            r3 = r304
            r4 = 0
            r5 = r314
            r6 = r318
            r7 = r313
            r8 = r317
            r0.A01(r1, r2, r3, r4, r5, r6, r7, r8)
        L9f:
            return
        La0:
            r0 = 0
            r318 = r0
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0B(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C05O
    public IBinder A0H(Intent intent) {
        0fH.A0h(intent.toString(), "FbnsServiceDelegate", "onBind with intent: %s");
        A0B("bind", intent.getAction(), intent.getStringExtra("caller"));
        C18k c18k = new C18k(intent, this.A00, "fbns_aidl_auth_domain");
        String A00 = 05S.A00(intent);
        if (c18k.BXF()) {
            this.A08.A01("fbns_ipc_auth", new String[]{"authorised", "secure", A00, intent.getAction()}, 1L);
            return this.A01;
        }
        0fH.A14("FbnsServiceDelegate", "onBind invalid signature: %s", new Object[]{intent.toString()});
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("cntr", C05O.A02(this));
        A0u.put("clr", A00);
        05S r0 = this.A00;
        int i = 0;
        if (A00 != null) {
            try {
                PackageManager packageManager = r0.A00.getPackageManager();
                if (packageManager != null) {
                    i = Integer.parseInt(packageManager.getPackageInfo(A00, 0).versionName.split("\\.", 2)[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                0fH.A0r("FbnsSecurityContextHelper", "requested package not found on the device", e);
            } catch (NumberFormatException e2) {
                0fH.A0z("FbnsSecurityContextHelper", "Failed to parse major version for package: %s", e2, new Object[]{A00});
            }
        }
        A0u.put("ver", String.valueOf(i));
        this.A02.A01("bind", "TRUSTED_APP_AUTH_INVALID", intent.getAction(), A0u, ((MqttPushServiceDelegate) this).A00, super.A07.A04.get(), super.A0B.get(), super.A07.A00());
        this.A08.A01("fbns_ipc_auth", new String[]{"unauthorized", "secure", A00, intent.getAction()}, 1L);
        return null;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate, X.C05O
    public void A0I() {
        super.A0I();
    }

    @Override // X.C05O
    public void A0J(Intent intent) {
        A0B("rebind", intent.getAction(), intent.getStringExtra("caller"));
        super.A0J(intent);
    }

    @Override // X.C05O
    public boolean A0K(Intent intent) {
        A0B("unbind", intent.getAction(), intent.getStringExtra("caller"));
        return ((C05O) this).A01.A08(intent);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0N() {
        super.A0N();
        if (A0E == this) {
            A0E = null;
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0Q(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println(0Pz.A0j("[ ", "FbnsServiceDelegate", " ]"));
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            Context applicationContext = ((C05O) this).A01.getApplicationContext();
            11T.A0A(applicationContext);
            0Fw.A01(applicationContext, A0s, A0s2);
            ArrayList A0s3 = AnonymousClass001.A0s();
            A0q(A0s3);
            printWriter.println(AnonymousClass001.A0Z(A0s, "validCompatibleApps=", AnonymousClass001.A0k()));
            printWriter.println(AnonymousClass001.A0Z(A0s2, "enabledCompatibleApps=", AnonymousClass001.A0k()));
            printWriter.println(AnonymousClass001.A0Z(A0s3, "registeredApps=", AnonymousClass001.A0k()));
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("notificationCounter=");
            printWriter.println(AnonymousClass001.A0a(super.A05.A02, A0k));
        } catch (Exception unused) {
        }
        super.A0Q(fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v186, types: [X.19r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v234, types: [java.lang.Object, X.0QY] */
    /* JADX WARN: Type inference failed for: r0v267, types: [java.lang.Object, X.18T] */
    /* JADX WARN: Type inference failed for: r0v269, types: [X.18l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v286, types: [X.19I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v289, types: [java.lang.Object, X.16L] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.09M, X.19a] */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public C17q A0R() {
        FbnsServiceDelegate fbnsServiceDelegate = A0E;
        if (fbnsServiceDelegate != null) {
            fbnsServiceDelegate.A0X();
        }
        A0E = this;
        AnonymousClass096 anonymousClass096 = (AnonymousClass096) C08r.A00;
        05P r0 = ((C05O) this).A01;
        11T.A0A(r0.getApplicationContext());
        final AnonymousClass094 A02 = anonymousClass096.A02();
        Context applicationContext = r0.getApplicationContext();
        11T.A0A(applicationContext);
        this.A03 = new 0RW(applicationContext, A02);
        0oM r02 = new 0oM(this, 0);
        0oM r03 = new 0oM(this, 1);
        0oM r04 = new 0oM(this, 2);
        Context applicationContext2 = r0.getApplicationContext();
        11T.A0A(applicationContext2);
        05S r05 = new 05S(applicationContext2, (C01s) null, (05L) null, false);
        final boolean A022 = 0Fw.A02(C05O.A02(this));
        AnonymousClass092 anonymousClass092 = anonymousClass096.A00;
        if (anonymousClass092.A00 == null) {
            throw AnonymousClass001.A0T("MqttIdManagerBuilder not bound in Fbns Config Manager");
        }
        anonymousClass092.A00();
        final Context applicationContext3 = r0.getApplicationContext();
        11T.A0A(applicationContext3);
        ?? r06 = new 09M(applicationContext3, A02, A022) { // from class: X.19a
            public C09D A00;
            public AnonymousClass186 A01;
            public CountDownLatch A02 = AnonymousClass001.A11();
            public Context A03;
            public final boolean A04;

            {
                this.A01 = 0lV.A01;
                this.A04 = A022;
                this.A03 = applicationContext3;
                09C A01 = 0Pz.A01(applicationContext3, A02, "ids");
                this.A00 = A01;
                this.A01 = new 0lV(A01.getString("/settings/mqtt/id/mqtt_device_id", ""), this.A00.getString("/settings/mqtt/id/mqtt_device_secret", ""), Long.valueOf(this.A00.getLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE)).longValue());
                this.A02.countDown();
                A00();
                String str = (String) ((Pair) this.A01).first;
                if ((str == null || str.equals("")) && this.A04) {
                    D6V(new 0lV(C04I.A00().toString(), "", System.currentTimeMillis()));
                }
            }

            private void A00() {
                try {
                    this.A02.await();
                } catch (InterruptedException e) {
                    0fH.A0r("FbnsServiceIdManager", "Waiting for mqtt device id and secret was interrupted", e);
                }
            }

            public String AXB() {
                return "567310203415052";
            }

            public String AXE() {
                return "MQTT";
            }

            public String Ahk() {
                String str;
                synchronized (this) {
                    A00();
                    str = (String) ((Pair) this.A01).second;
                }
                return str;
            }

            public String BGL() {
                throw AnonymousClass001.A0T("Tokenbinding not implemented for legacy auth");
            }

            public boolean CXE() {
                throw AnonymousClass001.A0T("Tokenbinding not implemented for legacy auth");
            }

            public byte[] CXM(Socket socket) {
                throw AnonymousClass001.A0T("Tokenbinding not implemented for legacy auth");
            }

            public void CqH(C0l6 c0l6, boolean z) {
                C17f c17f;
                09C r07 = this.A00;
                09C r08 = r07;
                if (r08.contains("/settings/mqtt/id/is_using_secure_auth")) {
                    boolean z2 = false;
                    if (z != r08.getBoolean("/settings/mqtt/id/is_using_secure_auth", false)) {
                        z2 = true;
                        0Mi AP6 = r07.AP6();
                        AP6.Ca3("/settings/mqtt/id/is_using_secure_auth", z);
                        AP6.AGo("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
                    }
                    c17f = c0l6.A00;
                    if (!z2) {
                        return;
                    }
                } else {
                    0Mi AP62 = r07.AP6();
                    AP62.Ca3("/settings/mqtt/id/is_using_secure_auth", z);
                    AP62.AGo("FbnsServiceIdManager", "PreferencesManager failed to store isSecureAuth");
                    c17f = c0l6.A00;
                }
                c17f.A00.A02.A0N.Bs8();
            }

            public boolean D6V(AnonymousClass186 anonymousClass186) {
                A00();
                if (this.A01.equals(anonymousClass186)) {
                    return false;
                }
                0Mi AP6 = this.A00.AP6();
                0lV r07 = (0lV) anonymousClass186;
                AP6.CaM("/settings/mqtt/id/mqtt_device_id", (String) ((Pair) r07).first);
                AP6.CaM("/settings/mqtt/id/mqtt_device_secret", (String) ((Pair) r07).second);
                AP6.CaI("/settings/mqtt/id/timestamp", r07.A00);
                AP6.AGo("FbnsServiceIdManager", "PreferencesManager failed to store device id, secret, and timestamp.");
                this.A01 = anonymousClass186;
                return true;
            }

            public String getDeviceId() {
                String str;
                synchronized (this) {
                    A00();
                    str = (String) ((Pair) this.A01).first;
                }
                return str;
            }
        };
        this.A09 = r06.getDeviceId();
        Context applicationContext4 = r0.getApplicationContext();
        11T.A0A(applicationContext4);
        0TJ r07 = new 0TJ(applicationContext4);
        Context applicationContext5 = r0.getApplicationContext();
        11T.A0A(applicationContext5);
        Integer num = 0S2.A01;
        09C A01 = 0Pz.A01(applicationContext5, A02, "analytics");
        11T.A0A(r0.getApplicationContext());
        boolean z = true;
        int i = 1;
        if (!(!09O.A00(r0).A02)) {
            i = 10000;
        }
        0Mi AP6 = A01.AP6();
        if (new Random().nextInt(LogcatReader.DEFAULT_WAIT_TIME) >= i) {
            z = false;
        }
        0Mf r08 = 0Mf.A0A;
        Integer valueOf = Integer.valueOf(i);
        r08.A01(AP6, valueOf);
        0Mf r09 = 0Mf.A09;
        Boolean valueOf2 = Boolean.valueOf(z);
        r09.A01(AP6, valueOf2);
        0fH.A0e(valueOf, valueOf2, "FbnsServiceDelegate", "initialize default analyticsSamplingRate %d, log_analytic_events %b");
        Iterator A0y = AnonymousClass001.A0y(A0H);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            Object value = A0z.getValue();
            if (value != null && !r08.mWrapper.A00().isInstance(value)) {
                throw AnonymousClass002.A0B(value);
            }
            r08.mWrapper.A03(AP6, value, 0Pz.A0j("LOG_SR", "/", A0j));
            0fH.A0e(A0j, value, "FbnsServiceDelegate", "initialize %s analyticsSamplingRate override as %d");
        }
        AP6.AGo("FbnsServiceDelegate", "PreferencesManager failed to commit analytics config values");
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        int i2 = 1;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        0Mf r010 = 0Mf.A08;
        16W r011 = new 0Qc(countDownLatch, atomicInteger);
        if (!r010.mWrapper.A00().isInstance(-1)) {
            throw AnonymousClass002.A0B(-1);
        }
        r010.mWrapper.A04(r011, A01, -1, r010.mPrefKey);
        long j = 5;
        try {
            countDownLatch.await(j, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0fH.A0r("FbnsServiceDelegate", "Waiting for current health sample rate fetch in initHealthStatsAnalytics was interrupted", e);
        }
        int i3 = atomicInteger.get();
        if (i3 < 0 || i3 > 10000) {
            11T.A0A(r0.getApplicationContext());
            if (!(!09O.A00(r0).A02)) {
                i2 = 10000;
            }
            Integer valueOf3 = Integer.valueOf(i3);
            Integer valueOf4 = Integer.valueOf(i2);
            0fH.A0e(valueOf3, valueOf4, "FbnsServiceDelegate", "initialize/reset healthSamplingRate, oldRate %d newRate %d");
            0Mi AP62 = A01.AP6();
            r010.A01(AP62, valueOf4);
            AP62.AGo("FbnsServiceDelegate", "PreferencesManager failed to commit health stats sampling rate");
        } else {
            i2 = i3;
        }
        AtomicLong atomicLong = new AtomicLong(-1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        String str = 0Mf.A01.mPrefKey;
        11T.A0F(str, 0);
        try {
            atomicLong.set(Long.parseLong(A01.getString(str, "")));
        } catch (NumberFormatException unused) {
        }
        countDownLatch2.countDown();
        try {
            countDownLatch2.await(j, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            0fH.A0r("FbnsServiceDelegate", "Waiting for logger user id fetch was interrupted", e2);
        }
        Long valueOf5 = Long.valueOf(atomicLong.get());
        ?? obj = new Object();
        obj.A00 = A01;
        this.A06 = obj;
        0fH.A0e(Integer.valueOf(i2), valueOf, "FbnsServiceDelegate", "configureAnalytics current healthSampleRate: %d analyticsSampleRate: %d");
        boolean A1R = AnonymousClass001.A1R(new Random().nextInt(LogcatReader.DEFAULT_WAIT_TIME), i2);
        AnonymousClass092 anonymousClass0922 = anonymousClass096.A02;
        if (anonymousClass0922.A00 == null) {
            throw AnonymousClass001.A0T("IMqttStatsLogSwitcher not bound in FBNS Config Manager");
        }
        AnonymousClass090 anonymousClass090 = (AnonymousClass090) anonymousClass0922.A00();
        Context applicationContext6 = r0.getApplicationContext();
        11T.A0A(applicationContext6);
        anonymousClass090.A00 = A1R;
        0fH.A0h(r07.A01.A0T, "FbnsServiceDelegate", "mAnalyticsEndpoint: %s");
        Executor executor = AnonymousClass161.A04;
        AnonymousClass161 anonymousClass161 = new AnonymousClass161(applicationContext6, new 0oL(r07, this, 1));
        09S r012 = new 09S(applicationContext6, 09O.A00(applicationContext6), "MQTT", (String) null, (Map) null);
        final String deviceId = r06.getDeviceId();
        Context applicationContext7 = r0.getApplicationContext();
        11T.A0A(applicationContext7);
        ?? obj2 = new Object();
        ((0QY) obj2).A00 = A01;
        String A00 = AnonymousClass185.A00(A0T());
        0oL r013 = new 0oL(r07, this, 0);
        16C r014 = C13n.A0E;
        09O A002 = 09O.A00(applicationContext7);
        C13n c13n = new C13n(applicationContext7, anonymousClass161, A01, r013, new C16f() { // from class: X.0yh
            @Override // X.C16f
            public /* bridge */ /* synthetic */ Object get() {
                String str2 = deviceId;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unset";
                }
                return str2;
            }
        }, obj2, A00, new 09S(applicationContext7, A002, "MQTT", (String) null, (Map) null).A01(), A002.A01, A002.A00);
        this.A08 = new C19x(anonymousClass161);
        Context applicationContext8 = r0.getApplicationContext();
        11T.A0A(applicationContext8);
        final C09D A012 = 0Pz.A01(applicationContext8, A02, "ids");
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        Context applicationContext9 = r0.getApplicationContext();
        11T.A0A(applicationContext9);
        Context applicationContext10 = r0.getApplicationContext();
        11T.A0A(applicationContext10);
        C17n c17n = new C17n(AnonymousClass001.A1N(16O.A00(applicationContext10) ? 1 : 0));
        C17l c17l = super.A0D;
        09L r015 = new 09L(A012) { // from class: X.1B1
            public 09N A00;
            public boolean A01;
            public final C09D A02;
            public final ReentrantLock A03;

            {
                this.A00 = 09N.A00;
                ReentrantLock reentrantLock = new ReentrantLock();
                this.A03 = reentrantLock;
                this.A01 = false;
                this.A02 = A012;
                reentrantLock.lock();
                CountDownLatch A11 = AnonymousClass001.A11();
                09C r016 = (09C) A012;
                this.A00 = 09N.A00(r016.getString("/settings/mqtt/id/connection_key", ""), r016.getString("/settings/mqtt/id/connection_secret", ""));
                A11.countDown();
                try {
                    A11.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException e3) {
                    0fH.A0r("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e3);
                }
                reentrantLock.unlock();
            }

            public void AFO() {
            }

            public String Acp() {
                return "device_auth";
            }

            public String Adr() {
                return "";
            }

            public 09N Asq() {
                09N r016;
                synchronized (this) {
                    try {
                        ReentrantLock reentrantLock = this.A03;
                        reentrantLock.lock();
                        r016 = this.A00;
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        this.A03.unlock();
                        throw th;
                    }
                }
                return r016;
            }

            public void CnD(String str2) {
            }

            public boolean D6U(09N r302) {
                boolean z2;
                synchronized (this) {
                    ReentrantLock reentrantLock = this.A03;
                    reentrantLock.lock();
                    if (this.A00.equals(r302)) {
                        reentrantLock.unlock();
                        z2 = false;
                    } else {
                        CountDownLatch A11 = AnonymousClass001.A11();
                        0wK r016 = new 0wK(r302, this, A11);
                        0Mi AP63 = this.A02.AP6();
                        AP63.CaM("/settings/mqtt/id/connection_key", (String) ((Pair) r302).first);
                        AP63.CaM("/settings/mqtt/id/connection_secret", (String) ((Pair) r302).second);
                        AP63.AGn(r016);
                        try {
                            A11.await(5, TimeUnit.SECONDS);
                        } catch (InterruptedException e3) {
                            0fH.A0r("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e3);
                        }
                        try {
                            z2 = this.A01;
                            reentrantLock.unlock();
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                }
                return z2;
            }

            public void clear() {
                synchronized (this) {
                    D6U(09N.A00);
                }
            }
        };
        ?? obj5 = new Object();
        Handler A07 = AnonymousClass001.A07();
        ?? obj6 = new Object();
        0RW r016 = this.A03;
        C19g c19g = this.A0C;
        if (c19g.A02 == null) {
            c19g.A02 = r07;
        }
        17V r017 = this.A0B;
        18S r018 = new 18S();
        0wZ r019 = new 0wZ(anonymousClass090);
        0Up r020 = new 0Up(this);
        C17q c17q = new C17q();
        c17q.A01(r05, r012, new C17x(applicationContext9, A07, null, null, c13n, obj6, r019, r016, A02, null, r02, r04, r03, r04, null, null, r07, r015, r017, c17l, c17n, r06, r018, obj3, obj4, obj5, null, r020, num, valueOf5, null, null, null, null, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), new 0QV());
        return c17q;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public 0MY A0S(Intent intent, int i, int i2) {
        return super.A0S(intent, i, i2);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public Integer A0T() {
        return 0S2.A01;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public String A0U() {
        return "FBNS_ALWAYS";
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public Future A0V(C18e c18e) {
        A0B("stop", c18e.toString(), null);
        return super.A0V(c18e);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.17z, java.lang.Object] */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0W() {
        LinkedList<C19s> A01 = this.A07.A01();
        this.A07.A02();
        A09(this, "credentials_updated", "", "", null, Collections.singletonMap("package_size", String.valueOf(A01.size())));
        ?? obj = new Object();
        05P r0 = ((C05O) this).A01;
        Context applicationContext = r0.getApplicationContext();
        11T.A0A(applicationContext);
        AnonymousClass096 anonymousClass096 = (AnonymousClass096) C08r.A00;
        11T.A0A(r0.getApplicationContext());
        A0f(C16m.CREDENTIALS_UPDATED, obj.A00(applicationContext, anonymousClass096.A02()));
        for (C19s c19s : A01) {
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
            intent.putExtra("pkg_name", c19s.A02);
            intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, c19s.A01);
            intent.setClassName(C05O.A02(this), AnonymousClass001.A0Y(this));
            A06(intent, this);
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0Y() {
        super.A0Y();
        super.A05.A0I = "S";
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0Z() {
        super.A0Z();
        0TU r0 = super.A0C;
        C19u c19u = r0.A03;
        C19f c19f = r0.A01;
        C19p c19p = r0.A02;
        05S r02 = r0.A00;
        0RD r03 = new 0RD(r02, r0.A05, this, AnonymousClass001.A0u());
        Context applicationContext = ((C05O) this).A01.getApplicationContext();
        11T.A0A(applicationContext);
        FbnsAIDLService fbnsAIDLService = new FbnsAIDLService(applicationContext, new 0Uy(this), this.A03);
        this.A07 = c19u;
        this.A02 = c19f;
        this.A05 = c19p;
        this.A00 = r02;
        this.A04 = r03;
        0fH.A0g(false, "FbnsLiteNotificationDeliveryHelper", "mDisablePersistVoipNotif is set to %b");
        this.A01 = fbnsAIDLService;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0a() {
        this.A04.A04((Handler) null);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0b() {
        0RD r0 = this.A04;
        BroadcastReceiver broadcastReceiver = ((0Ep) r0).A00;
        if (broadcastReceiver != null) {
            05L.A02.A07(broadcastReceiver, ((0Ep) r0).A04);
            ((0Ep) r0).A00 = null;
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0c(int i) {
        this.A04.A05(TimeUnit.SECONDS, i);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0d(Intent intent, 0MY r303) {
        StringBuilder A0o;
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action) || "com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action) || "com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
            String stringExtra2 = intent.getStringExtra("pkg_name");
            String A00 = 05S.A00(intent);
            String str = "com.facebook.rti.fbns.intent.UNREGISTER".equals(action) ? "unreg_fail" : "reg_fail";
            if (TextUtils.isEmpty(stringExtra2)) {
                A0o = AnonymousClass001.A0o("Empty package name for ");
                AnonymousClass001.A1D(action, " from ", A00, A0o);
            } else {
                String A02 = "com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action) ? C05O.A02(this) : stringExtra2;
                if (!A02.equals(A00)) {
                    A0o = AnonymousClass001.A0o("Package mismatch for ");
                    AnonymousClass001.A1D(action, " from ", A00, A0o);
                    A0o.append(": packageName ");
                    A0o.append(A02);
                }
            }
            String obj = A0o.toString();
            0fH.A0n("FbnsServiceDelegate", obj);
            A09(this, str, stringExtra2, stringExtra, obj, Collections.emptyMap());
            return;
        }
        String action2 = intent.getAction();
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action2)) {
            A0f(C16m.FBNS_REGISTER, r303);
            A06(intent, this);
        } else if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action2)) {
            A0f(C16m.FBNS_REGISTER_RETRY, r303);
            String stringExtra3 = intent.getStringExtra("pkg_name");
            String stringExtra4 = intent.getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID);
            A07(this, stringExtra3, stringExtra4);
            A09(this, "reg_retry_legacy", stringExtra3, stringExtra4, null, AnonymousClass001.A0u());
        } else {
            if (!"com.facebook.rti.fbns.intent.UNREGISTER".equals(action2)) {
                0fH.A0k("FbnsServiceDelegate", "service/doIntent/unrecognized_action");
                return;
            }
            A0f(C16m.FBNS_UNREGISTER, r303);
            String stringExtra5 = intent.getStringExtra("pkg_name");
            C19u c19u = this.A07;
            0fH.A0g(stringExtra5, "RegistrationState", "remove app %s");
            16Q.A00(stringExtra5);
            09C A01 = 0Pz.A01(c19u.A00, c19u.A01, "registrations");
            11T.A0F(stringExtra5, 0);
            String string = A01.getString(stringExtra5, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    C19s A002 = C19s.A00(string);
                    if (!A002.A04) {
                        A002.A04 = true;
                        C19u.A00(A01, A002, stringExtra5);
                    }
                } catch (JSONException e) {
                    0fH.A0s("RegistrationState", "Parse failed", e);
                }
            }
            Intent intent2 = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
            intent2.setPackage(stringExtra5);
            intent2.addCategory(stringExtra5);
            intent2.putExtra("receive_type", "unregistered");
            A05(intent2);
            this.A07.A03(new 0Rw(this, stringExtra5), stringExtra5);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Context applicationContext = ((C05O) this).A01.getApplicationContext();
        11T.A0A(applicationContext);
        0Fw.A01(applicationContext, A0s, A0s2);
        ArrayList A0s3 = AnonymousClass001.A0s();
        A0q(A0s3);
        C16v c16v = super.A05;
        c16v.A0K = C16v.A02(A0s);
        c16v.A0H = C16v.A02(A0s2);
        c16v.A0J = C16v.A02(A0s3);
    }

    /* JADX WARN: Removed duplicated region for block: B:629:0x0dbe A[Catch: JSONException -> 0x130d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x130d, blocks: (B:9:0x004e, B:11:0x0057, B:13:0x0067, B:17:0x0079, B:21:0x008b, B:24:0x0096, B:25:0x009b, B:26:0x00a0, B:29:0x00a7, B:31:0x00b2, B:33:0x00bb, B:35:0x00c7, B:37:0x00d0, B:39:0x00dc, B:41:0x00e5, B:43:0x00ec, B:46:0x00f6, B:47:0x00fd, B:51:0x0115, B:53:0x011b, B:55:0x0129, B:56:0x012e, B:59:0x014b, B:60:0x0153, B:61:0x015a, B:65:0x016d, B:67:0x0173, B:69:0x0181, B:71:0x0188, B:72:0x018d, B:74:0x01a9, B:75:0x01b1, B:76:0x01b7, B:77:0x01be, B:79:0x01d5, B:81:0x01dc, B:83:0x01e1, B:85:0x01e6, B:86:0x01eb, B:88:0x01fb, B:89:0x0202, B:91:0x0212, B:93:0x0223, B:95:0x0233, B:97:0x0243, B:99:0x024c, B:101:0x0254, B:102:0x025b, B:106:0x026e, B:108:0x027a, B:110:0x0281, B:111:0x0286, B:113:0x02a4, B:145:0x034c, B:147:0x0358, B:149:0x0364, B:151:0x036b, B:152:0x0370, B:154:0x0390, B:155:0x0398, B:156:0x039f, B:160:0x03b2, B:162:0x03b9, B:163:0x03be, B:164:0x03c3, B:166:0x03ea, B:167:0x03f2, B:168:0x03f8, B:170:0x040d, B:172:0x0414, B:174:0x0419, B:175:0x041e, B:177:0x042e, B:179:0x043e, B:181:0x0447, B:183:0x044f, B:184:0x0456, B:188:0x0469, B:202:0x04a3, B:204:0x04af, B:206:0x04be, B:210:0x04d0, B:212:0x04dd, B:214:0x04eb, B:216:0x04f1, B:217:0x04f6, B:219:0x0504, B:221:0x0509, B:223:0x0512, B:224:0x0519, B:225:0x051e, B:226:0x0523, B:229:0x052a, B:231:0x0536, B:233:0x053f, B:235:0x054b, B:237:0x0554, B:239:0x0560, B:241:0x0569, B:243:0x0575, B:245:0x057e, B:247:0x058a, B:249:0x0593, B:251:0x059f, B:253:0x05a8, B:255:0x05b4, B:257:0x05bd, B:259:0x05c9, B:261:0x05d2, B:263:0x05de, B:267:0x05ec, B:271:0x05fa, B:272:0x0601, B:273:0x0608, B:275:0x0611, B:277:0x061d, B:279:0x0626, B:281:0x0632, B:283:0x063b, B:285:0x064f, B:288:0x0679, B:290:0x0688, B:292:0x069b, B:294:0x06a4, B:296:0x06b0, B:300:0x06be, B:301:0x06c5, B:303:0x06ce, B:305:0x06da, B:309:0x06e8, B:310:0x06ef, B:312:0x06f8, B:314:0x0704, B:318:0x0712, B:322:0x0720, B:324:0x0729, B:326:0x0730, B:327:0x0735, B:328:0x073c, B:331:0x0748, B:332:0x074f, B:334:0x0756, B:335:0x075b, B:341:0x0778, B:342:0x077f, B:344:0x0786, B:346:0x078c, B:347:0x0791, B:349:0x079a, B:350:0x07a0, B:351:0x07a7, B:354:0x07ca, B:356:0x07d5, B:357:0x07db, B:358:0x07e2, B:360:0x07eb, B:362:0x07f2, B:365:0x07fe, B:367:0x0807, B:369:0x0822, B:370:0x0827, B:372:0x082e, B:373:0x0833, B:376:0x083a, B:378:0x0840, B:379:0x0845, B:380:0x084a, B:381:0x0851, B:383:0x085a, B:385:0x0862, B:387:0x086a, B:389:0x0871, B:392:0x0879, B:394:0x0882, B:396:0x089d, B:397:0x08a2, B:398:0x08a7, B:400:0x08b3, B:406:0x08d6, B:407:0x08dd, B:409:0x08e6, B:413:0x0896, B:417:0x081b, B:420:0x08ed, B:423:0x0901, B:427:0x0919, B:428:0x0920, B:429:0x0927, B:431:0x0933, B:433:0x0952, B:435:0x0959, B:437:0x0963, B:439:0x096f, B:441:0x097c, B:443:0x0985, B:444:0x098a, B:446:0x098f, B:447:0x0996, B:450:0x09a2, B:451:0x09a9, B:453:0x09b4, B:455:0x09bc, B:457:0x09ca, B:459:0x09d2, B:460:0x09d7, B:461:0x09de, B:463:0x09e9, B:464:0x09f0, B:465:0x09f7, B:467:0x0a07, B:469:0x0a0f, B:470:0x0a14, B:472:0x0a3f, B:474:0x0a46, B:476:0x0a4d, B:477:0x0a54, B:478:0x0a5b, B:481:0x0a67, B:482:0x0a6e, B:483:0x0a75, B:485:0x0a7e, B:487:0x0a85, B:489:0x0a8c, B:493:0x0aa1, B:495:0x0aa8, B:496:0x0aad, B:497:0x0ab4, B:499:0x0abc, B:501:0x0ac6, B:503:0x0acf, B:505:0x0ad8, B:506:0x0add, B:508:0x0ae2, B:509:0x0ae9, B:512:0x0af5, B:513:0x0afc, B:515:0x0b07, B:517:0x0b0f, B:519:0x0b18, B:521:0x0b20, B:522:0x0b25, B:524:0x0b4b, B:525:0x0b53, B:529:0x0b67, B:531:0x0c77, B:533:0x0b6f, B:534:0x0b74, B:537:0x0b86, B:538:0x0b8d, B:540:0x0ba1, B:542:0x0ba8, B:543:0x0bad, B:546:0x0bb9, B:547:0x0bc0, B:548:0x0bc7, B:549:0x0bce, B:550:0x0bd5, B:551:0x0bdc, B:553:0x0be6, B:554:0x0bed, B:556:0x0bf6, B:558:0x0c01, B:560:0x0c08, B:561:0x0c0d, B:562:0x0c14, B:563:0x0c1b, B:565:0x0c39, B:567:0x0c40, B:568:0x0c45, B:569:0x0c4c, B:570:0x0c53, B:572:0x0c5f, B:576:0x0c9e, B:578:0x0ca5, B:579:0x0cac, B:580:0x0cb4, B:582:0x0cc3, B:585:0x0cd7, B:589:0x0ce6, B:591:0x0cee, B:592:0x0cf3, B:595:0x0cff, B:597:0x0d0a, B:599:0x0d12, B:600:0x0d17, B:603:0x0d23, B:605:0x0d33, B:607:0x0d3b, B:608:0x0d40, B:609:0x0d47, B:612:0x0d53, B:613:0x0d5a, B:614:0x0d61, B:616:0x0d87, B:617:0x0d8c, B:620:0x0d96, B:621:0x0d9d, B:623:0x0da6, B:625:0x0dad, B:626:0x0db2, B:629:0x0dbe, B:630:0x0dc5, B:631:0x0dcc, B:633:0x0de3, B:634:0x0dea, B:635:0x0df1, B:637:0x0e14, B:639:0x0e1b, B:640:0x0e20, B:641:0x0e27, B:643:0x0e2f, B:644:0x0e34, B:645:0x0e3b, B:646:0x0e42, B:647:0x0e47, B:649:0x0e50, B:650:0x0e5a, B:651:0x0e63, B:652:0x0e6a, B:653:0x0e73, B:654:0x0e7a, B:658:0x0e8b, B:660:0x0ea9, B:661:0x0eb1, B:662:0x0eb8, B:666:0x0ecb, B:667:0x0ed2, B:668:0x0ed9, B:669:0x0ee0, B:670:0x0ee7, B:672:0x0f0c, B:673:0x0f11, B:675:0x0f19, B:676:0x0f1e, B:677:0x0f25, B:679:0x0f30, B:681:0x0f37, B:683:0x0f40, B:684:0x0f45, B:686:0x0f55, B:688:0x0f5d, B:690:0x0f6b, B:692:0x0f73, B:694:0x0f7a, B:696:0x0f8f, B:698:0x0f96, B:703:0x0fa2, B:704:0x0fa9, B:705:0x0fb0, B:706:0x0fb7, B:709:0x0fcd, B:710:0x0fd2, B:711:0x0fd9, B:712:0x0fe0, B:713:0x0fe7, B:715:0x1002, B:716:0x1009, B:718:0x1012, B:742:0x1096, B:745:0x121b, B:746:0x1220, B:748:0x122d, B:749:0x1234, B:750:0x123b, B:752:0x124d, B:754:0x1254, B:757:0x125e, B:759:0x126b, B:760:0x1273, B:763:0x127f, B:764:0x1286, B:765:0x128d, B:767:0x1295, B:768:0x129a, B:772:0x12ab, B:774:0x12c9, B:777:0x109e, B:779:0x10a1, B:780:0x1016, B:782:0x12df, B:783:0x12e4, B:784:0x12eb, B:786:0x10a4, B:787:0x10a9, B:791:0x10bd, B:792:0x10c4, B:793:0x10cb, B:796:0x10e1, B:797:0x10e6, B:798:0x10ed, B:799:0x10f4, B:800:0x10fb, B:802:0x111e, B:804:0x1125, B:806:0x112c, B:807:0x1133, B:808:0x1138, B:810:0x113f, B:834:0x11ab, B:837:0x11b5, B:838:0x11bc, B:839:0x11c3, B:840:0x11ca, B:841:0x11d1, B:842:0x11d8, B:843:0x11df, B:845:0x11e9, B:846:0x11f0, B:848:0x11f9, B:850:0x1200, B:851:0x1205, B:853:0x1214, B:860:0x130c, B:861:0x1143, B:864:0x12d3, B:869:0x07b6, B:870:0x07be, B:873:0x0671, B:874:0x0681, B:875:0x065f, B:880:0x1303, B:115:0x02ac, B:117:0x02b5, B:118:0x02ba, B:121:0x02c1, B:123:0x02ca, B:126:0x02d6, B:127:0x02dd, B:129:0x02ed, B:131:0x02f4, B:132:0x02f9, B:135:0x0316, B:138:0x0325, B:140:0x032c, B:141:0x0331, B:190:0x0471, B:192:0x047a, B:193:0x047f, B:196:0x0486, B:198:0x048f), top: B:8:0x004e, inners: #0, #2, #3, #5, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0e73 A[Catch: JSONException -> 0x130d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x130d, blocks: (B:9:0x004e, B:11:0x0057, B:13:0x0067, B:17:0x0079, B:21:0x008b, B:24:0x0096, B:25:0x009b, B:26:0x00a0, B:29:0x00a7, B:31:0x00b2, B:33:0x00bb, B:35:0x00c7, B:37:0x00d0, B:39:0x00dc, B:41:0x00e5, B:43:0x00ec, B:46:0x00f6, B:47:0x00fd, B:51:0x0115, B:53:0x011b, B:55:0x0129, B:56:0x012e, B:59:0x014b, B:60:0x0153, B:61:0x015a, B:65:0x016d, B:67:0x0173, B:69:0x0181, B:71:0x0188, B:72:0x018d, B:74:0x01a9, B:75:0x01b1, B:76:0x01b7, B:77:0x01be, B:79:0x01d5, B:81:0x01dc, B:83:0x01e1, B:85:0x01e6, B:86:0x01eb, B:88:0x01fb, B:89:0x0202, B:91:0x0212, B:93:0x0223, B:95:0x0233, B:97:0x0243, B:99:0x024c, B:101:0x0254, B:102:0x025b, B:106:0x026e, B:108:0x027a, B:110:0x0281, B:111:0x0286, B:113:0x02a4, B:145:0x034c, B:147:0x0358, B:149:0x0364, B:151:0x036b, B:152:0x0370, B:154:0x0390, B:155:0x0398, B:156:0x039f, B:160:0x03b2, B:162:0x03b9, B:163:0x03be, B:164:0x03c3, B:166:0x03ea, B:167:0x03f2, B:168:0x03f8, B:170:0x040d, B:172:0x0414, B:174:0x0419, B:175:0x041e, B:177:0x042e, B:179:0x043e, B:181:0x0447, B:183:0x044f, B:184:0x0456, B:188:0x0469, B:202:0x04a3, B:204:0x04af, B:206:0x04be, B:210:0x04d0, B:212:0x04dd, B:214:0x04eb, B:216:0x04f1, B:217:0x04f6, B:219:0x0504, B:221:0x0509, B:223:0x0512, B:224:0x0519, B:225:0x051e, B:226:0x0523, B:229:0x052a, B:231:0x0536, B:233:0x053f, B:235:0x054b, B:237:0x0554, B:239:0x0560, B:241:0x0569, B:243:0x0575, B:245:0x057e, B:247:0x058a, B:249:0x0593, B:251:0x059f, B:253:0x05a8, B:255:0x05b4, B:257:0x05bd, B:259:0x05c9, B:261:0x05d2, B:263:0x05de, B:267:0x05ec, B:271:0x05fa, B:272:0x0601, B:273:0x0608, B:275:0x0611, B:277:0x061d, B:279:0x0626, B:281:0x0632, B:283:0x063b, B:285:0x064f, B:288:0x0679, B:290:0x0688, B:292:0x069b, B:294:0x06a4, B:296:0x06b0, B:300:0x06be, B:301:0x06c5, B:303:0x06ce, B:305:0x06da, B:309:0x06e8, B:310:0x06ef, B:312:0x06f8, B:314:0x0704, B:318:0x0712, B:322:0x0720, B:324:0x0729, B:326:0x0730, B:327:0x0735, B:328:0x073c, B:331:0x0748, B:332:0x074f, B:334:0x0756, B:335:0x075b, B:341:0x0778, B:342:0x077f, B:344:0x0786, B:346:0x078c, B:347:0x0791, B:349:0x079a, B:350:0x07a0, B:351:0x07a7, B:354:0x07ca, B:356:0x07d5, B:357:0x07db, B:358:0x07e2, B:360:0x07eb, B:362:0x07f2, B:365:0x07fe, B:367:0x0807, B:369:0x0822, B:370:0x0827, B:372:0x082e, B:373:0x0833, B:376:0x083a, B:378:0x0840, B:379:0x0845, B:380:0x084a, B:381:0x0851, B:383:0x085a, B:385:0x0862, B:387:0x086a, B:389:0x0871, B:392:0x0879, B:394:0x0882, B:396:0x089d, B:397:0x08a2, B:398:0x08a7, B:400:0x08b3, B:406:0x08d6, B:407:0x08dd, B:409:0x08e6, B:413:0x0896, B:417:0x081b, B:420:0x08ed, B:423:0x0901, B:427:0x0919, B:428:0x0920, B:429:0x0927, B:431:0x0933, B:433:0x0952, B:435:0x0959, B:437:0x0963, B:439:0x096f, B:441:0x097c, B:443:0x0985, B:444:0x098a, B:446:0x098f, B:447:0x0996, B:450:0x09a2, B:451:0x09a9, B:453:0x09b4, B:455:0x09bc, B:457:0x09ca, B:459:0x09d2, B:460:0x09d7, B:461:0x09de, B:463:0x09e9, B:464:0x09f0, B:465:0x09f7, B:467:0x0a07, B:469:0x0a0f, B:470:0x0a14, B:472:0x0a3f, B:474:0x0a46, B:476:0x0a4d, B:477:0x0a54, B:478:0x0a5b, B:481:0x0a67, B:482:0x0a6e, B:483:0x0a75, B:485:0x0a7e, B:487:0x0a85, B:489:0x0a8c, B:493:0x0aa1, B:495:0x0aa8, B:496:0x0aad, B:497:0x0ab4, B:499:0x0abc, B:501:0x0ac6, B:503:0x0acf, B:505:0x0ad8, B:506:0x0add, B:508:0x0ae2, B:509:0x0ae9, B:512:0x0af5, B:513:0x0afc, B:515:0x0b07, B:517:0x0b0f, B:519:0x0b18, B:521:0x0b20, B:522:0x0b25, B:524:0x0b4b, B:525:0x0b53, B:529:0x0b67, B:531:0x0c77, B:533:0x0b6f, B:534:0x0b74, B:537:0x0b86, B:538:0x0b8d, B:540:0x0ba1, B:542:0x0ba8, B:543:0x0bad, B:546:0x0bb9, B:547:0x0bc0, B:548:0x0bc7, B:549:0x0bce, B:550:0x0bd5, B:551:0x0bdc, B:553:0x0be6, B:554:0x0bed, B:556:0x0bf6, B:558:0x0c01, B:560:0x0c08, B:561:0x0c0d, B:562:0x0c14, B:563:0x0c1b, B:565:0x0c39, B:567:0x0c40, B:568:0x0c45, B:569:0x0c4c, B:570:0x0c53, B:572:0x0c5f, B:576:0x0c9e, B:578:0x0ca5, B:579:0x0cac, B:580:0x0cb4, B:582:0x0cc3, B:585:0x0cd7, B:589:0x0ce6, B:591:0x0cee, B:592:0x0cf3, B:595:0x0cff, B:597:0x0d0a, B:599:0x0d12, B:600:0x0d17, B:603:0x0d23, B:605:0x0d33, B:607:0x0d3b, B:608:0x0d40, B:609:0x0d47, B:612:0x0d53, B:613:0x0d5a, B:614:0x0d61, B:616:0x0d87, B:617:0x0d8c, B:620:0x0d96, B:621:0x0d9d, B:623:0x0da6, B:625:0x0dad, B:626:0x0db2, B:629:0x0dbe, B:630:0x0dc5, B:631:0x0dcc, B:633:0x0de3, B:634:0x0dea, B:635:0x0df1, B:637:0x0e14, B:639:0x0e1b, B:640:0x0e20, B:641:0x0e27, B:643:0x0e2f, B:644:0x0e34, B:645:0x0e3b, B:646:0x0e42, B:647:0x0e47, B:649:0x0e50, B:650:0x0e5a, B:651:0x0e63, B:652:0x0e6a, B:653:0x0e73, B:654:0x0e7a, B:658:0x0e8b, B:660:0x0ea9, B:661:0x0eb1, B:662:0x0eb8, B:666:0x0ecb, B:667:0x0ed2, B:668:0x0ed9, B:669:0x0ee0, B:670:0x0ee7, B:672:0x0f0c, B:673:0x0f11, B:675:0x0f19, B:676:0x0f1e, B:677:0x0f25, B:679:0x0f30, B:681:0x0f37, B:683:0x0f40, B:684:0x0f45, B:686:0x0f55, B:688:0x0f5d, B:690:0x0f6b, B:692:0x0f73, B:694:0x0f7a, B:696:0x0f8f, B:698:0x0f96, B:703:0x0fa2, B:704:0x0fa9, B:705:0x0fb0, B:706:0x0fb7, B:709:0x0fcd, B:710:0x0fd2, B:711:0x0fd9, B:712:0x0fe0, B:713:0x0fe7, B:715:0x1002, B:716:0x1009, B:718:0x1012, B:742:0x1096, B:745:0x121b, B:746:0x1220, B:748:0x122d, B:749:0x1234, B:750:0x123b, B:752:0x124d, B:754:0x1254, B:757:0x125e, B:759:0x126b, B:760:0x1273, B:763:0x127f, B:764:0x1286, B:765:0x128d, B:767:0x1295, B:768:0x129a, B:772:0x12ab, B:774:0x12c9, B:777:0x109e, B:779:0x10a1, B:780:0x1016, B:782:0x12df, B:783:0x12e4, B:784:0x12eb, B:786:0x10a4, B:787:0x10a9, B:791:0x10bd, B:792:0x10c4, B:793:0x10cb, B:796:0x10e1, B:797:0x10e6, B:798:0x10ed, B:799:0x10f4, B:800:0x10fb, B:802:0x111e, B:804:0x1125, B:806:0x112c, B:807:0x1133, B:808:0x1138, B:810:0x113f, B:834:0x11ab, B:837:0x11b5, B:838:0x11bc, B:839:0x11c3, B:840:0x11ca, B:841:0x11d1, B:842:0x11d8, B:843:0x11df, B:845:0x11e9, B:846:0x11f0, B:848:0x11f9, B:850:0x1200, B:851:0x1205, B:853:0x1214, B:860:0x130c, B:861:0x1143, B:864:0x12d3, B:869:0x07b6, B:870:0x07be, B:873:0x0671, B:874:0x0681, B:875:0x065f, B:880:0x1303, B:115:0x02ac, B:117:0x02b5, B:118:0x02ba, B:121:0x02c1, B:123:0x02ca, B:126:0x02d6, B:127:0x02dd, B:129:0x02ed, B:131:0x02f4, B:132:0x02f9, B:135:0x0316, B:138:0x0325, B:140:0x032c, B:141:0x0331, B:190:0x0471, B:192:0x047a, B:193:0x047f, B:196:0x0486, B:198:0x048f), top: B:8:0x004e, inners: #0, #2, #3, #5, #6, #8, #9 }] */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.C16h r302, java.lang.Long r303, java.lang.String r304, byte[] r305, int r306, long r307) {
        /*
            Method dump skipped, instructions count: 4971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0e(X.16h, java.lang.Long, java.lang.String, byte[], int, long):void");
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0f(C16m c16m, 0MY r303) {
        A0B("start", c16m.toString(), r303.A03);
        super.A0f(c16m, r303);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0g(C08t c08t) {
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0h(C18d c18d) {
        C19u c19u = this.A07;
        boolean A1P = AnonymousClass001.A1P(((System.currentTimeMillis() - 0Pz.A01(c19u.A00, c19u.A01, "fbns_state").getLong("auto_reg_retry", 0L)) > 86400000L ? 1 : ((System.currentTimeMillis() - 0Pz.A01(c19u.A00, c19u.A01, "fbns_state").getLong("auto_reg_retry", 0L)) == 86400000L ? 0 : -1)));
        if (C18d.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(c18d) && A1P) {
            C19u c19u2 = this.A07;
            0Mi AP6 = 0Pz.A01(c19u2.A00, c19u2.A01, "fbns_state").AP6();
            AP6.CaI("auto_reg_retry", System.currentTimeMillis());
            AP6.AGo("RegistrationState", "PreferencesManager failed to store auth failed register time.");
            LinkedList<C19s> A01 = this.A07.A01();
            this.A07.A02();
            A09(this, "authfail_auto_register", "", "", null, Collections.singletonMap("package_size", String.valueOf(A01.size())));
            for (C19s c19s : A01) {
                Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
                intent.putExtra("pkg_name", c19s.A02);
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, c19s.A01);
                intent.setClassName(C05O.A02(this), AnonymousClass001.A0Y(this));
                A06(intent, this);
            }
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public void A0i(C18z c18z) {
        ((AtomicLong) ((C17v) super.A05.A05(C1Aq.class)).A01(16D.A02)).addAndGet(this.A04.A02());
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public boolean A0m(Intent intent) {
        boolean z = true;
        if (intent != null) {
            String A00 = 05S.A00(intent);
            if (!C05O.A02(this).equals(A00)) {
                this.A08.A00("verify_sender_failed", A00);
                z = false;
            }
        }
        return z;
    }

    public 0Gp A0n(String str, String str2) {
        0Gp r304;
        C19q A03 = A03(this, str2);
        synchronized (C19q.A02) {
            17P r0 = (17P) A03.A00.remove(str);
            if (r0 != null) {
                new 0wZ(r0);
            } else {
                r304 = 0Go.A00;
            }
        }
        return r304;
    }

    public void A0o(0Gq r302, 17P r303, String str, String str2) {
        0Gp r0 = r303.A01;
        0Gp r02 = r303.A03;
        String obj = r302.toString();
        long j = r303.A00;
        0wZ A01 = r02.A06() ? 0Gp.A01(System.currentTimeMillis() - AnonymousClass001.A05(r02.A05())) : 0Go.A00;
        String str3 = r303.A06;
        this.A03.BZQ(0Pz.A0W("Error: Fail to deliver notifId = ", str));
        if (A01.A06()) {
            this.A08.A01("fbns_e2e_latency", new String[]{"discard", C05O.A02(this), str2}, AnonymousClass001.A05(A01.A05()));
        }
        this.A08.A01("fbns_latency", new String[]{"discard", C05O.A02(this), str2}, j);
        HashMap A04 = 0Gp.A04(r0);
        A04.put("src", str3);
        A0A(this, "discard", str, str2, obj, A04, j);
    }

    public void A0p(0Gp r302, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str4)) {
            this.A03.BZQ(str4);
        }
        HashMap A04 = 0Gp.A04(r302);
        A04.put("src", str5);
        A0A(this, "fail", str3, str, str2, A04, 0L);
    }

    public void A0q(ArrayList arrayList) {
        synchronized (this) {
            Iterator it = this.A07.A01().iterator();
            while (it.hasNext()) {
                arrayList.add(((C19s) it.next()).A02);
            }
        }
    }
}
