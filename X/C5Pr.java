package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger;
import com.facebook.messaging.analytics.reliability.AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.Publicity;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.send.SendError;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.logging.MontagePostReliabilityLogging;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.smartcapture.logging.MC;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Pr, reason: invalid class name */
/* loaded from: 5Pr.class */
public final class C5Pr implements 1UN, CallerContextable {
    public static final String __redex_internal_original_name = "SendMessageManager";
    public Context A00;
    public 1BY A01;
    public Runnable A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public Object[] A06;
    public 5Ps A07;
    public final FbUserSession A08;
    public final 1PA A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0P;
    public final C00i A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final C00i A0U;
    public final C00i A0V;
    public final C00i A0W;
    public final C00i A0X;
    public final C00i A0Z;
    public final C00i A0a;
    public final C00i A0b;
    public final C00i A0c;
    public final C00i A0d;
    public final C00i A0e;
    public final C00i A0g;
    public final C2mf A0h;
    public final C1ko A0i;
    public final C1ko A0j;
    public final LinkedHashMultimap A0k;
    public final LinkedHashMultimap A0l;
    public final java.util.Map A0m;
    public final Set A0n;
    public final Set A0o;
    public final Set A0p;
    public final 1PA A0q;
    public final 1PA A0r;
    public final C00i A0s;
    public final C00i A0t;
    public final C00i A0u;
    public final C00i A0v;
    public final C00i A0w;
    public final C00i A0x;
    public final C00i A0y;
    public final C00i A0z;
    public final C00i A10;
    public final C00i A11;
    public final C00i A12;
    public final C00i A13;
    public final C00i A14;
    public final C00i A15;
    public final C00i A16;
    public final C00i A0O = new 1BQ(16688);
    public final C00i A0f = new 1BQ(16461);
    public final C00i A0Y = new 1BQ(16476);
    public final C00i A0T = new 1BQ(84488);
    public final C00i A0H = new 1BQ(84675);
    public final C00i A0N = new 1BQ(16822);

    public C5Pr(1BO r302, FbUserSession fbUserSession) {
        this.A0B = new 1BV(this.A01, 33031);
        this.A0A = new 1BV(this.A01, 16487);
        this.A0y = new 1BV(this.A01, 67490);
        this.A11 = new 1BV(this.A01, 147507);
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        1HH r0 = new 1HH(A00, 65728);
        this.A0w = r0;
        this.A10 = new 1BV(this.A01, 17019);
        this.A0g = new 1BQ(16772);
        this.A0t = new 1BQ(33226);
        this.A0Q = new 1BQ(85048);
        this.A0U = new 1BV(this.A01, 115935);
        this.A0P = new 1BQ(83168);
        this.A0I = new 1BQ(49642);
        this.A0e = new 1BV(this.A01, 67329);
        this.A0s = new 1BQ(49381);
        this.A0x = new 1BQ(49660);
        this.A12 = new 1BQ(84456);
        this.A0S = new 1BQ(16385);
        this.A0a = new 1BV(this.A01, 65897);
        this.A0G = new 1BQ(83603);
        this.A0L = new 1BQ(84679);
        this.A0u = new 1BV(this.A01, 65574);
        this.A13 = new 1BV(this.A01, 83968);
        this.A16 = new 1BQ(84039);
        this.A0z = new 1BV(this.A01, 84559);
        this.A0M = new 1BV(this.A01, 83655);
        this.A0R = new 1BV(this.A01, 67228);
        this.A0v = new 1BV(this.A01, 32840);
        this.A0D = new 1BQ(66266);
        this.A0d = new 1BQ(66655);
        this.A0F = new 1BQ(66265);
        this.A0X = new 1BV(this.A01, 116182);
        1Bn.A0E((Context) null, this.A01, 387);
        this.A07 = null;
        this.A0n = new HashSet();
        this.A0o = new HashSet();
        this.A0m = new HashMap();
        this.A0E = new 1BQ(16511);
        this.A01 = new 1BY(r302);
        this.A08 = fbUserSession;
        ((1UP) 1Bi.A03(66348)).A01(this);
        this.A0K = new 1HH(FbInjector.A00(), 84595);
        this.A0C = new 1BQ(67724);
        Integer num = 1Lo.A05;
        this.A0V = new 1MV(fbUserSession, (1BY) null, 114688);
        this.A0Z = new 1MV(fbUserSession, (1BY) null, 84594);
        this.A15 = new 1MV(fbUserSession, (1BY) null, 84516);
        this.A0b = new 1MV(fbUserSession, (1BY) null, 84628);
        this.A0J = new 1MV(fbUserSession, (1BY) null, 82477);
        this.A0W = new 1MV(fbUserSession, (1BY) null, 49713);
        this.A0c = new 1MV(fbUserSession, (1BY) null, 84536);
        1MV r02 = new 1MV(fbUserSession, (1BY) null, 17094);
        this.A14 = r02;
        this.A0k = LinkedHashMultimap.A00();
        this.A0l = LinkedHashMultimap.A00();
        this.A06 = ((C2me) r02.get()).A03;
        this.A0h = ((C2me) r02.get()).A01;
        this.A0p = ((C2me) r02.get()).A02;
        C1k8 c1k8 = new C1k8();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c1k8.A05(300L, timeUnit);
        this.A0j = c1k8.A02();
        C1k8 c1k82 = new C1k8();
        c1k82.A05(600L, timeUnit);
        this.A0i = c1k82.A02();
        1P9 r03 = new 1P9((1I7) r0.get());
        r03.A05(new D0R(this, 11), "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        this.A09 = r03.A02();
        1P9 r04 = new 1P9((1I7) r0.get());
        r04.A05(new D0R(this, 12), "com.facebook.orca.media.upload.MEDIA_UPLOAD_STATUS_CHANGED");
        1PA A02 = r04.A02();
        this.A0q = A02;
        A02.A00();
        1P9 r05 = new 1P9((1I7) r0.get());
        r05.A05(new D0R(this, 13), 1BJ.A00(MC.android_payment.CONFIG_ID));
        1PA A022 = r05.A02();
        this.A0r = A022;
        A022.A00();
        this.A02 = new 5Py(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x016d, code lost:
    
        if (r0.contains(r0) != false) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00ec. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.messaging.model.messages.Message A00(X.C2mj r302) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Pr.A00(X.2mj):com.facebook.messaging.model.messages.Message");
    }

    public static 5Ps A01(C5Pr c5Pr) {
        5Ps r302 = c5Pr.A07;
        if (r302 == null) {
            r302 = ((82O) c5Pr.A0u.get()).A0K((ScheduledExecutorService) c5Pr.A0f.get());
            c5Pr.A07 = r302;
        }
        return r302;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.messaging.service.model.SendMessageParams A02(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Pr.A02(com.facebook.messaging.model.messages.Message):com.facebook.messaging.service.model.SendMessageParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0262  */
    /* JADX WARN: Type inference failed for: r0v309, types: [X.4xs, X.4xr] */
    /* JADX WARN: Type inference failed for: r0v313, types: [X.4xp] */
    /* JADX WARN: Type inference failed for: r0v654, types: [X.1ED] */
    /* JADX WARN: Type inference failed for: r325v18, types: [X.1m1] */
    /* JADX WARN: Type inference failed for: r325v19 */
    /* JADX WARN: Type inference failed for: r325v21, types: [com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger] */
    /* JADX WARN: Type inference failed for: r325v28, types: [com.facebook.messaging.analytics.reliability.AggregatedReliabilityLogger] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.1FX A03(X.5Pz r301, com.facebook.messaging.model.messages.Message r302, final X.C5Pr r303, final X.C7rh r304, com.facebook.messaging.send.trigger.NavigationTrigger r305, java.lang.String r306, java.lang.String r307, final boolean r308) {
        /*
            Method dump skipped, instructions count: 3195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Pr.A03(X.5Pz, com.facebook.messaging.model.messages.Message, X.5Pr, X.7rh, com.facebook.messaging.send.trigger.NavigationTrigger, java.lang.String, java.lang.String, boolean):X.1FX");
    }

    public static void A04(1UG r301, IF1 if1, MontagePostReliabilityLogging montagePostReliabilityLogging) {
        r301.A7R("creation_session_id", montagePostReliabilityLogging.A08);
        r301.A7R(JQw.A00(ActionId.DATA_LOAD_START), ((FbNetworkManager) if1.A03.get()).A0F());
        r301.A7R(1BJ.A00(88), ((FbDataConnectionManager) if1.A01.get()).A05().name());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v4 ??, still in use, count: 2, list:
          (r309v4 ??) from 0x0090: PHI (r309v2 ??) = (r309v1 ??), (r309v4 ??) binds: [B:12:0x006c, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]
          (r309v4 ?? I:java.lang.Object) from 0x008a: INVOKE (r0v24 ?? I:java.util.Map), (r0v22 ?? I:java.lang.Object), (r309v4 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x019e, MD:(K, V):V (c)]
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
    private void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v4 ??, still in use, count: 2, list:
          (r309v4 ??) from 0x0090: PHI (r309v2 ??) = (r309v1 ??), (r309v4 ??) binds: [B:12:0x006c, B:18:0x0088] A[DONT_GENERATE, DONT_INLINE]
          (r309v4 ?? I:java.lang.Object) from 0x008a: INVOKE (r0v24 ?? I:java.util.Map), (r0v22 ?? I:java.lang.Object), (r309v4 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x019e, MD:(K, V):V (c)]
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

    private void A06(Message message) {
        C2mj c2mj;
        PendingSendQueueKey A0F = A0F(message);
        synchronized (this.A06) {
            c2mj = (C2mj) this.A0h.A01.get(A0F);
        }
        if (c2mj != null) {
            String str = message.A1g;
            c2mj.A02(str);
            synchronized (c2mj) {
                Preconditions.checkArgument(Objects.equal(message.A0V, c2mj.A05.A01));
                if (!Objects.equal(str, c2mj.A02)) {
                    c2mj.A02 = str;
                    c2mj.A01 = c2mj.A04.now();
                    c2mj.A00 = 0;
                }
            }
        }
    }

    public static void A07(Message message, C5Pr c5Pr) {
        String str = message.A1g;
        0fH.A0g(str, __redex_internal_original_name, "[onSendSuccess] %s");
        synchronized (c5Pr.A06) {
            c5Pr.A0p.remove(c5Pr.A0F(message));
            c5Pr.A05 = false;
            c5Pr.A0n.remove(message);
            c5Pr.A03 = null;
            c5Pr.A0o.remove(str);
            c5Pr.A04 = false;
            PendingSendQueueKey A0F = c5Pr.A0F(message);
            java.util.Map map = c5Pr.A0h.A01;
            C2mj c2mj = (C2mj) map.get(A0F);
            if (c2mj != null) {
                C2mj.A00(c2mj);
                if (c2mj.A01()) {
                    map.remove(A0F);
                }
            }
            A0B(c5Pr);
        }
        ((COz) c5Pr.A0Z.get()).A04(str, 203);
        A01(c5Pr).A00();
        IF1 if1 = (IF1) c5Pr.A0V.get();
        String A02 = IF1.A02(message);
        if (A02 != null) {
            HashMap hashMap = if1.A04;
            if (hashMap.containsKey(A02)) {
                MontagePostReliabilityLogging montagePostReliabilityLogging = (MontagePostReliabilityLogging) hashMap.get(IF1.A02(message));
                1UG A08 = 1BK.A08(1BK.A07(if1.A02), AbstractC00603o4.A00(ActionId.ASNYC_FAILED));
                if (A08.isSampled() && montagePostReliabilityLogging != null) {
                    A04(A08, if1, montagePostReliabilityLogging);
                    A08.A7R("publish_method", "MULTIMEDIA");
                    A08.A7R("composer_type", "status");
                    A08.A7R("params", montagePostReliabilityLogging.toString());
                    A08.BZL();
                }
            }
        }
        53D r0 = (53D) c5Pr.A16.get();
        ThreadKey threadKey = message.A0V;
        11T.A0F(threadKey, 0);
        0fH.A0g(threadKey, "TrackingCodesManager", "detachTrackingCodes for %s");
        r0.A03.remove(threadKey);
        A0C(c5Pr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v16 ??, still in use, count: 2, list:
          (r305v16 ??) from 0x0434: PHI (r305v10 ??) = (r305v9 ??), (r305v16 ??) binds: [B:223:0x0410, B:229:0x042c] A[DONT_GENERATE, DONT_INLINE]
          (r305v16 ?? I:java.lang.Object) from 0x042e: INVOKE (r0v173 ?? I:java.util.Map), (r0v171 ?? I:java.lang.Object), (r305v16 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x04d7, MD:(K, V):V (c)]
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
    public static void A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v16 ??, still in use, count: 2, list:
          (r305v16 ??) from 0x0434: PHI (r305v10 ??) = (r305v9 ??), (r305v16 ??) binds: [B:223:0x0410, B:229:0x042c] A[DONT_GENERATE, DONT_INLINE]
          (r305v16 ?? I:java.lang.Object) from 0x042e: INVOKE (r0v173 ?? I:java.util.Map), (r0v171 ?? I:java.lang.Object), (r305v16 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x04d7, MD:(K, V):V (c)]
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v7 ??, still in use, count: 2, list:
          (r316v7 ??) from 0x03e6: PHI (r316v6 ??) = (r316v5 ??), (r316v7 ??) binds: [B:273:0x03c2, B:279:0x03de] A[DONT_GENERATE, DONT_INLINE]
          (r316v7 ?? I:java.lang.Object) from 0x03e0: INVOKE (r0v12 ?? I:java.util.Map), (r0v405 ?? I:java.lang.Object), (r316v7 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x045b, MD:(K, V):V (c)]
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
    public static void A09(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v7 ??, still in use, count: 2, list:
          (r316v7 ??) from 0x03e6: PHI (r316v6 ??) = (r316v5 ??), (r316v7 ??) binds: [B:273:0x03c2, B:279:0x03de] A[DONT_GENERATE, DONT_INLINE]
          (r316v7 ?? I:java.lang.Object) from 0x03e0: INVOKE (r0v12 ?? I:java.util.Map), (r0v405 ?? I:java.lang.Object), (r316v7 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x045b, MD:(K, V):V (c)]
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

    public static void A0A(ThreadKey threadKey, C5Pr c5Pr) {
        long j;
        String str;
        2Jy A0H = 4YU.A0H("queue_failure");
        if (threadKey.A06 == C1yg.GROUP || threadKey.A1I()) {
            j = threadKey.A04;
            str = "thread_fbid";
        } else {
            j = threadKey.A02;
            str = "other_user_id";
        }
        A0H.A0C(str, j);
        8EU.A00(1BK.A06(c5Pr.A0g)).A03(A0H);
    }

    public static void A0B(C5Pr c5Pr) {
        synchronized (c5Pr.A06) {
            for (C2mj c2mj : Collections.unmodifiableCollection(c5Pr.A0h.A01.values())) {
                if (c2mj.A07 == -1) {
                    c2mj.A07 = 0L;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ab, code lost:
    
        r0.putParcelable("sendMessageParams", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d9, code lost:
    
        X.1Kd.A0E(r0, X.4YU.A0M(r0, com.facebook.common.callercontext.CallerContext.A06(X.C5Pr.class), X.4YU.A0L(r301.A0B), "send", true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e1, code lost:
    
        r306 = -1096283116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e6, code lost:
    
        r305 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0209, code lost:
    
        throw r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014a, code lost:
    
        r301.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        r0 = r301.A02(r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017e, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0187, code lost:
    
        r301.A03 = r310.A1g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018e, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0194, code lost:
    
        r1 = r310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0199, code lost:
    
        r0 = new X.C46p(r1, r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019d, code lost:
    
        r0 = X.1BK.A05();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(final X.C5Pr r301) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Pr.A0C(X.5Pr):void");
    }

    private boolean A0D(Message message) {
        C81P BIH;
        C2mj c2mj;
        long j;
        C5ak A00 = C00653oY.A00((C00653oY) ((C2me) this.A14.get()).A00.get(), message);
        Object[] objArr = this.A06;
        synchronized (objArr) {
            BIH = ((5HO) this.A0J.get()).BIH(message);
        }
        if (A00 == C5ak.VIDEO_CLIP && BIH.A00 == C81O.FAILED && !((5Hw) this.A0x.get()).A01(BIH.A01.A06)) {
            return false;
        }
        C81O c81o = BIH.A00;
        C81O c81o2 = C81O.FAILED;
        if (c81o == c81o2 && 1BK.A0N(this.A0S).AZk(36313368667166956L) && 5Hw.A00(BIH)) {
            return false;
        }
        if (((A00 == C5ak.PHOTOS || A00 == C5ak.AUDIO_CLIP) && c81o == c81o2 && !((5Hw) this.A0x.get()).A01(BIH.A01.A06)) || A00 == C5ak.PAYMENT) {
            return false;
        }
        synchronized (objArr) {
            c2mj = (C2mj) this.A0h.A01.get(A0F(message));
        }
        if (c2mj == null) {
            return false;
        }
        synchronized (c2mj) {
            j = c2mj.A01;
        }
        return 1BL.A09(this.A0T) - j <= 1BK.A0N(this.A0S).Auy(36592236599050778L) * 60000;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002b. Please report as an issue. */
    private boolean A0E(Message message) {
        C00i c00i = this.A0J;
        C81O c81o = ((5HO) c00i.get()).BIH(message).A00;
        switch (c81o.ordinal()) {
            case 1:
                throw 1BL.A0h(c81o, "Unexpected state: ", AnonymousClass001.A0k());
            case 3:
                A06(message);
                if (A0D(message) && ((2zS) this.A0C.get()).A05()) {
                    0fH.A0j(__redex_internal_original_name, "Retrying media uploads for message");
                    ((5HO) c00i.get()).AQd(message);
                    AggregatedReliabilityLogger aggregatedReliabilityLogger = (AggregatedReliabilityLogger) this.A0s.get();
                    synchronized (aggregatedReliabilityLogger) {
                        C11814xl c11814xl = aggregatedReliabilityLogger.A04;
                        synchronized (c11814xl) {
                            if (C11814xl.A04(c11814xl) && C11814xl.A06(message)) {
                                LinkedHashMap linkedHashMap = c11814xl.A00;
                                String str = message.A1g;
                                AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = (AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo) linkedHashMap.get(str);
                                if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo == null) {
                                    aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = C11814xl.A00(c11814xl, message);
                                    if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo != null) {
                                        c11814xl.A00.put(str, aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo);
                                    }
                                }
                                aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.preparationAttempts++;
                                C11814xl.A03(c11814xl);
                            }
                        }
                    }
                    A05(message);
                    return false;
                }
                return true;
            case 5:
                0fH.A0j(__redex_internal_original_name, "Starting media uploads for message");
                ((5HO) c00i.get()).AQd(message);
                return false;
            default:
                A06(message);
                return true;
        }
    }

    public PendingSendQueueKey A0F(Message message) {
        int i;
        C2me c2me = (C2me) this.A14.get();
        C00j.A05("SendStateHelper.queueKeyForMessage", -1991898437);
        try {
            PendingSendQueueKey pendingSendQueueKey = message.A0P;
            if (pendingSendQueueKey != null) {
                i = 926763059;
            } else {
                int ordinal = C00653oY.A00((C00653oY) c2me.A00.get(), message).ordinal();
                new PendingSendQueueKey(ordinal != 8 ? (ordinal == 6 || ordinal == 7) ? C2mh.LIGHT_MEDIA : C2mh.NORMAL : C2mh.VIDEO, message.A0V);
                i = -393678082;
            }
            C00j.A01(i);
            return pendingSendQueueKey;
        } catch (Throwable th) {
            C00j.A01(-1593097238);
            throw th;
        }
    }

    public 1FX A0G(Message message, String str) {
        2eH A0b;
        C45d c45d = (C45d) this.A0P.get();
        String str2 = message.A1g;
        ThreadKey threadKey = message.A0V;
        c45d.A0K(threadKey, "start_async_send", str2);
        threadKey.getClass();
        Preconditions.checkArgument(AnonymousClass001.A1W(message.A04(), C1q8.A0M));
        5PI r0 = new 5PI(message);
        r0.A06(Publicity.A02);
        r0.A21 = true;
        Message A0U = 4YU.A0U(r0);
        ThreadKey threadKey2 = A0U.A0V;
        Preconditions.checkArgument(!ThreadKey.A0q(threadKey2));
        boolean A0m = ThreadKey.A0m(threadKey2);
        if (!A0m) {
            C00i c00i = this.A0Z;
            SettableFuture A02 = ((COz) c00i.get()).A02(A0U);
            ((COz) c00i.get()).A03(A0U.A1g, 100);
            if (A0M(A0U)) {
                A08(A0U, this);
                return A02;
            }
            ((ExecutorService) this.A0f.get()).submit((Runnable) new D8Q(message, this));
            return A02;
        }
        this.A13.get();
        java.util.Map map = this.A0m;
        synchronized (map) {
            if (map.containsKey(threadKey2)) {
                A0b = 4YV.A0b(this.A0Y, new D3b(A0U, this, str), (ListenableFuture) map.get(threadKey2));
            } else {
                CaP caP = (CaP) this.A0c.get();
                1GU r02 = caP.A00;
                r02.AAs();
                threadKey2.getClass();
                Preconditions.checkArgument(A0m);
                1FV A0j = 4YU.A0j();
                java.util.Map map2 = caP.A0G;
                String str3 = A0U.A1g;
                map2.put(str3, A0j);
                try {
                    CreateCustomizableGroupParams A00 = CaP.A00(A0U, caP, str, caP.A0E.A01());
                    String str4 = CN5.A01(threadKey2, caP.A0D).A02;
                    BOq bOq = str4.equals("omnipicker_create_pending_thread") ? BOq.A0M : str4.equals("dummy_card") ? BOq.A05 : str4.equals("action_recents_tab_create_group") ? BOq.A0W : str4.equals("action_groups_tab_create_group") ? BOq.A08 : str4.equals("action_groups_tab_create_group_event") ? BOq.A0A : str4.equals("groups_tab_gysc") ? BOq.A0C : str4.equals("groups_tab_create_group_item") ? BOq.A0B : str4.equals("groups_tab_header_blue_button") ? BOq.A0D : str4.equals("thread_settings_create_group") ? BOq.A0d : str4.equals("thread_settings_create_group_from_group_thread") ? BOq.A0Q : str4.equals("threadlist_menu") ? BOq.A0b : str4.equals("threadlist_header") ? BOq.A0a : str4.equals("trusted_intent") ? BOq.A0e : str4.equals("single_picker") ? BOq.A0Y : str4.equals("chat_preview_full_create_new_chat") ? BOq.A03 : str4.equals("one_to_one_thread_view") ? BOq.A0V : str4.equals(AbE.A00(416)) ? BOq.A02 : str4.equals("messenger_groups_tab_chaining") ? BOq.A09 : str4.equals(AbE.A00(535)) ? BOq.A0E : str4.equals("omnipicker_chat_head_permanent_row") ? BOq.A0R : str4.equals("thread_view_banner") ? BOq.A0Z : str4.equals("omnipicker_permanent_row") ? BOq.A0T : str4.equals("highschool_create_group") ? BOq.A0K : str4.equals("search_null_state_create_group") ? BOq.A0X : str4.equals("messenger_sms_bridge_create_group") ? BOq.A0P : str4.equals("work_synced_group_opt_in_row") ? BOq.A0h : BOq.A0f;
                    caP.A0A.A06(bOq, BOP.A03, BO3.A01, A00.A05(), null);
                    ((CreateGroupAggregatedLatencyLogger) caP.A02.get()).A01(A00.A00);
                    1Kd.A0D(caP.A05, new D4Q(1, bOq, A00, A0U, caP), caP.A0B.A01(A00, true));
                } catch (2LC e) {
                    CaP.A01(A0U, e, caP);
                    r02.AAs();
                    1FX r03 = (1FX) map2.remove(str3);
                    if (r03 != null) {
                        r03.setException(e);
                    }
                }
                A0b = 4YV.A0b(this.A0Y, new D3c(this, str, 1), A0j);
            }
            map.put(threadKey2, A0b);
        }
        return A0b;
    }

    public ListenableFuture A0H(5Pz r302, Message message, NavigationTrigger navigationTrigger, String str) {
        return A03(r302, message, this, null, navigationTrigger, str, null, false);
    }

    public ListenableFuture A0I(5Pz r302, Message message, NavigationTrigger navigationTrigger, String str, boolean z) {
        return A03(r302, message, this, null, navigationTrigger, str, null, z);
    }

    public List A0J(ThreadKey threadKey) {
        List A05;
        synchronized (this.A06) {
            LinkedHashMultimap linkedHashMultimap = this.A0l;
            if (((AbstractMapBasedMultimap) linkedHashMultimap).A01.containsKey(threadKey)) {
                Iterator it = linkedHashMultimap.AUe(threadKey).iterator();
                long A09 = 1BL.A09(this.A0T);
                while (it.hasNext()) {
                    Message A0V = 4YU.A0V(it);
                    Long l = (Long) this.A0j.Apt(A0V.A1g);
                    if (l == null || A09 - l.longValue() > LocationComponentOptions.STALE_STATE_DELAY_MS) {
                        0fH.A0i(A0V, __redex_internal_original_name, "Clearing out expired recently sent message %s");
                        it.remove();
                    }
                }
            }
            A05 = 1JW.A05(1JW.A02(1qE.A01(linkedHashMultimap.AUe(threadKey), this.A0k.AUe(threadKey))));
        }
        return A05;
    }

    public void A0K(Message message, String str) {
        5Q2 r312;
        boolean z;
        AnonymousClass539 anonymousClass539;
        4YU.A0Q(this.A0Q).A0k(message.A1g, "retry_send");
        long A08 = 1BL.A08(this.A0t);
        5PI r0 = new 5PI(message);
        r0.A05(C1q8.A0M);
        r0.A07(SendError.A08);
        r0.A0P = A0F(message);
        r0.A05 = A08;
        r0.A04 = A08;
        Message A0U = 4YU.A0U(r0);
        1Uv r02 = (1Uv) this.A0O.get();
        Intent A0A = 4YU.A0A("com.facebook.orca.ACTION_MESSAGE_TYPE_UPDATED");
        A0A.putExtra("outgoing_message", A0U);
        1Uv.A02(A0A, r02);
        ThreadKey threadKey = A0U.A0V;
        if (ThreadKey.A0q(threadKey)) {
            Cbb cbb = (Cbb) this.A0e.get();
            z = true;
            Preconditions.checkArgument(AnonymousClass001.A1T(threadKey));
            Cbb.A01(A0U, threadKey, cbb);
            if (!((1SI) cbb.A05.get()).A09()) {
                Bundle A05 = 1BK.A05();
                A05.putParcelable("message", A0U);
                1Kd.A0D(cbb.A04, new ApF(4YU.A0j(), cbb, 1), 4YU.A0M(A05, CallerContext.A06(Cbb.class), 4YU.A0L(cbb.A01), "TincanRetrySendMessage", true));
                return;
            }
            r312 = (5Q2) cbb.A03.get();
            anonymousClass539 = AnonymousClass539.A6x;
        } else if (!ThreadKey.A0S(threadKey) && !((2rT) this.A0D.get()).A02(threadKey)) {
            A0G(A0U, str);
            return;
        } else {
            r312 = (5Q2) this.A0W.get();
            z = true;
            anonymousClass539 = AnonymousClass539.A6y;
        }
        r312.A05(A0U, (C7rh) null, anonymousClass539, z, false);
    }

    public void A0L(ThreadKey threadKey) {
        synchronized (this.A06) {
            LinkedHashMultimap linkedHashMultimap = this.A0l;
            if (((AbstractMapBasedMultimap) linkedHashMultimap).A01.containsKey(threadKey)) {
                linkedHashMultimap.Cdw(threadKey);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (X.C1q7.A0A(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0M(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A12
            java.lang.Object r0 = r0.get()
            X.53G r0 = (X.53G) r0
            r303 = r0
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0V
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.A02(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L38
            r0 = r301
            X.00i r0 = r0.A0N
            java.lang.Object r0 = r0.get()
            r0 = r302
            boolean r0 = X.C1q7.A0A(r0)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L3b
        L38:
            r0 = 1
            r305 = r0
        L3b:
            r0 = r305
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5Pr.A0M(com.facebook.messaging.model.messages.Message):boolean");
    }

    public void AFz() {
        1PA r0 = this.A09;
        if (r0.A03()) {
            r0.A01();
        }
        for (C2mj c2mj : Collections.unmodifiableCollection(this.A0h.A01.values())) {
            if (c2mj != null) {
                0fH.A0g(c2mj.A05, __redex_internal_original_name, "mark pending send queueKey: %s as no retry user logout");
                c2mj.A07 = -2;
            }
        }
        this.A0q.A01();
        this.A0r.A01();
        ((Executor) this.A0f.get()).execute(new D6a(this));
    }
}
