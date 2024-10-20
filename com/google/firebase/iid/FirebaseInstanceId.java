package com.google.firebase.iid;

import X.1BK;
import X.1BL;
import X.1cQ;
import X.1eA;
import X.1eC;
import X.1eZ;
import X.1fY;
import X.2LJ;
import X.31G;
import X.31H;
import X.31I;
import X.3K7;
import X.AnonymousClass001;
import X.C1bL;
import X.C1c9;
import X.C1e4;
import X.C1e8;
import X.C1ed;
import X.C1ee;
import X.C1g2;
import X.C4Ez;
import X.C4F5;
import X.JRS;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.acra.constants.ActionId;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FirebaseInstanceId.class */
public class FirebaseInstanceId {
    public static 1eA A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public 1eZ A00;
    public boolean A01;
    public final C1bL A02;
    public final C1ee A03;
    public final C1e4 A04;
    public final 1fY A05;
    public final C1ed A06;
    public final Executor A07;

    /* JADX WARN: Type inference failed for: r0v42, types: [X.1ed] */
    public FirebaseInstanceId(C1bL c1bL, C1c9 c1c9, 1cQ r304) {
        boolean z;
        C1bL.A01(c1bL);
        Context context = c1bL.A00;
        C1e4 c1e4 = new C1e4(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = C1e8.A00;
        long j = 30;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, j, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, j, timeUnit, new LinkedBlockingQueue(), threadFactory);
        this.A01 = false;
        if (C1e4.A01(c1bL) == null) {
            throw AnonymousClass001.A0N("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (A08 == null) {
                C1bL.A01(c1bL);
                A08 = new 1eA(context);
            }
        }
        this.A02 = c1bL;
        this.A04 = c1e4;
        1eZ r306 = this.A00;
        if (r306 == null) {
            C1bL.A01(c1bL);
            r306 = (1eZ) c1bL.A02.A02(1eZ.class);
            r306 = (r306 == null || r306.A01.A03() == 0) ? new 1eZ(c1bL, c1e4, r304, threadPoolExecutor) : r306;
            this.A00 = r306;
        }
        this.A00 = r306;
        this.A07 = threadPoolExecutor2;
        final 1eA r0 = A08;
        this.A06 = new Object(r0) { // from class: X.1ed
            public final 1eA A01;
            public int A00 = 0;
            public final java.util.Map A02 = new 0QO(0);

            {
                this.A01 = r0;
            }

            public static final String A00(C1ed c1ed) {
                String string;
                1eA r02 = c1ed.A01;
                synchronized (r02) {
                    string = r02.A01.getString("topic_operation_queue", "");
                }
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                String[] split = string.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
                    return null;
                }
                return split[1];
            }
        };
        C1ee c1ee = new C1ee(c1c9, this);
        this.A03 = c1ee;
        this.A05 = new 1fY(threadPoolExecutor);
        if (c1ee.A00()) {
            if (!A08(A00(C1e4.A01(this.A02), "*"))) {
                C1ed c1ed = this.A06;
                synchronized (c1ed) {
                    z = C1ed.A00(c1ed) != null;
                }
                if (!z) {
                    return;
                }
            }
            A03(this);
        }
    }

    public static C1g2 A00(String str, String str2) {
        C1g2 c1g2;
        C1g2 c1g22;
        1eA r0 = A08;
        synchronized (r0) {
            c1g2 = null;
            String string = r0.A01.getString(1eA.A01(str, str2), null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        new C1g2(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        Log.w("FirebaseInstanceId", 1BL.A0u("Failed to parse token: ", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 23)));
                    }
                } else {
                    new C1g2(string, null, 0L);
                }
                c1g2 = c1g22;
            }
        }
        return c1g2;
    }

    public static final Object A01(C4Ez c4Ez, FirebaseInstanceId firebaseInstanceId) {
        try {
            try {
                return C4F5.A01(c4Ez, TimeUnit.MILLISECONDS, LocationComponentOptions.STALE_STATE_DELAY_MS);
            } catch (InterruptedException | TimeoutException unused) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A06();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw cause;
        }
    }

    public static String A02() {
        31H r304;
        1eC r0;
        Context context;
        Throwable e;
        File A04;
        1eA r02 = A08;
        synchronized (r02) {
            Map map = r02.A03;
            r304 = (31H) map.get("");
            if (r304 == null) {
                try {
                    r0 = r02.A02;
                    context = r02.A00;
                    e = null;
                    try {
                        A04 = 1eC.A04(context);
                    } catch (2LJ e2) {
                        e = e2;
                    }
                } catch (2LJ unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C1bL.A00()).A06();
                    r304 = r02.A02.A07(r02.A00);
                }
                try {
                    if (A04.exists()) {
                        try {
                            r304 = 1eC.A02(A04);
                        } catch (2LJ | IOException e3) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e3);
                                Log.d("FirebaseInstanceId", 1BL.A0u("Failed to read key from file, retrying: ", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 40)));
                            }
                            try {
                                r304 = 1eC.A02(A04);
                            } catch (IOException e4) {
                                String valueOf2 = String.valueOf(e4);
                                Log.w("FirebaseInstanceId", 1BL.A0u("IID file exists, but failed to read from it: ", valueOf2, AnonymousClass001.A0l(1BK.A02(valueOf2) + 45)));
                                throw new Exception(e4);
                            }
                        }
                        1eC.A06(context, r304);
                        map.put("", r304);
                    }
                    r304 = 1eC.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                } catch (2LJ e5) {
                    e = e5;
                }
                if (r304 == null) {
                    if (e == null) {
                        r304 = r0.A07(context);
                    }
                    throw e;
                }
                1eC.A00(context, r304, false);
                map.put("", r304);
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(r304.A01.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + ActionId.MISSED_EVENT);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static final void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A07(0L);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v3 ??, still in use, count: 2, list:
          (r305v3 ??) from 0x0035: PHI (r305v1 ??) = (r305v0 ??), (r305v3 ??) binds: [B:6:0x000c, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r305v3 ?? I:java.util.concurrent.ScheduledExecutorService) from 0x0032: SPUT (r305v3 ?? I:java.util.concurrent.ScheduledExecutorService) A[Catch: all -> 0x0049] com.google.firebase.iid.FirebaseInstanceId.A09 java.util.concurrent.ScheduledExecutorService
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
    public static void A04(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v3 ??, still in use, count: 2, list:
          (r305v3 ??) from 0x0035: PHI (r305v1 ??) = (r305v0 ??), (r305v3 ??) binds: [B:6:0x000c, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r305v3 ?? I:java.util.concurrent.ScheduledExecutorService) from 0x0032: SPUT (r305v3 ?? I:java.util.concurrent.ScheduledExecutorService) A[Catch: all -> 0x0049] com.google.firebase.iid.FirebaseInstanceId.A09 java.util.concurrent.ScheduledExecutorService
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

    public static FirebaseInstanceId getInstance(C1bL c1bL) {
        C1bL.A01(c1bL);
        return (FirebaseInstanceId) c1bL.A02.A02(FirebaseInstanceId.class);
    }

    public String A05(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw AnonymousClass001.A0G("MAIN_THREAD");
        }
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        C4Ez c4Ez = new C4Ez();
        c4Ez.A0C(null);
        Executor executor = this.A07;
        31G r0 = new 31G(this, str, str2);
        C4Ez c4Ez2 = new C4Ez();
        c4Ez.A03.A00(new JRS(r0, c4Ez2, executor));
        C4Ez.A01(c4Ez);
        return ((3K7) A01(c4Ez2, this)).A00;
    }

    public final void A06() {
        synchronized (this) {
            A08.A02();
            if (this.A03.A00()) {
                A03(this);
            }
        }
    }

    public final void A07(long j) {
        synchronized (this) {
            A04(new 31I(this, this.A06, Math.min(Math.max(30, j << 1), A0A)), j);
            this.A01 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r0.equals(r302.A02) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(X.C1g2 r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L47
            r0 = r301
            X.1e4 r0 = r0.A04
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.A05()
            r304 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r305 = r0
            r0 = r302
            long r0 = r0.A00
            r307 = r0
            long r0 = X.C1g2.A03
            r309 = r0
            r0 = r307
            r1 = r309
            long r0 = r0 + r1
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = r311
            if (r0 > 0) goto L47
            r0 = r302
            java.lang.String r0 = r0.A02
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.equals(r1)
            r312 = r0
            r0 = 0
            r311 = r0
            r0 = 0
            r303 = r0
            r0 = r312
            if (r0 != 0) goto L4a
        L47:
            r0 = 1
            r311 = r0
        L4a:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.A08(X.1g2):boolean");
    }
}
