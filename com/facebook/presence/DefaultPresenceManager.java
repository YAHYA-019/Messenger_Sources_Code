package com.facebook.presence;

import X.0LZ;
import X.0S2;
import X.0WH;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Du;
import X.1ED;
import X.1EZ;
import X.1Fw;
import X.1GU;
import X.1HG;
import X.1HN;
import X.1I7;
import X.1JU;
import X.1K9;
import X.1Kd;
import X.1Lm;
import X.1Lo;
import X.1Mu;
import X.1P9;
import X.1PA;
import X.1QB;
import X.1Qc;
import X.1UN;
import X.1UP;
import X.1Wa;
import X.1X2;
import X.1X6;
import X.1XZ;
import X.1Xa;
import X.1Xc;
import X.1Xf;
import X.1Xo;
import X.1Xw;
import X.1Y4;
import X.1Y5;
import X.1YC;
import X.1YF;
import X.1YI;
import X.1YN;
import X.1YP;
import X.1YT;
import X.1YU;
import X.1YX;
import X.1Yj;
import X.1Yn;
import X.1qG;
import X.2AV;
import X.2TO;
import X.2yD;
import X.3L2;
import X.3L7;
import X.3L8;
import X.3Lt;
import X.3bR;
import X.3cG;
import X.3cH;
import X.3cM;
import X.3hD;
import X.3hE;
import X.3iW;
import X.4Zf;
import X.5Ch;
import X.5Cp;
import X.5Cz;
import X.5D4;
import X.5D5;
import X.5Ou;
import X.7zZ;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C08214mB;
import X.C0dp;
import X.C0et;
import X.C0ty;
import X.C1Y1;
import X.C1Y6;
import X.C1Y9;
import X.C1mA;
import X.C1mg;
import X.C28v;
import X.C2e2;
import X.C2fo;
import X.C3Qw;
import X.C3dl;
import X.C3iy;
import X.C4u1;
import X.C5ni;
import X.C7l;
import X.I2r;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.presence.plugins.inboxperf.perflogging.PresencePerfLoggingImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.presence.DefaultPresenceManager;
import com.facebook.presence.model.PresenceItem;
import com.facebook.user.model.UserKey;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: DefaultPresenceManager.class */
public final class DefaultPresenceManager implements 1XZ, 1Xa, 1Xc, 1UN {
    public 1Xw A00;
    public 1Xw A01;
    public Boolean A02;
    public Boolean A03;
    public ScheduledFuture A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final 0WH A0B;
    public final 1Xo A0C;
    public final 1Xo A0D;
    public final 1Xo A0E;
    public final 1Xo A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final 1Br A0X;
    public final 1Br A0Y;
    public final 1Br A0Z;
    public final 1Br A0a;
    public final 1Br A0b;
    public final 1Br A0c;
    public final 1HN A0d;
    public final 1YU A0e;
    public final 1Yn A0f;
    public final 1Yj A0g;
    public final 1Xf A0h;
    public final 1YI A0i;
    public final 1YF A0j;
    public final 1Y5 A0k;
    public final 1Mu A0l;
    public final 1Mu A0m;
    public final Object A0n;
    public final Object A0o;
    public final Runnable A0p;
    public final Map A0q;
    public final Set A0r;
    public final ConcurrentMap A0s;
    public final ConcurrentMap A0t;
    public final boolean A0u;
    public final Context A0v;
    public final Context A0w;
    public final 1PA A0x;
    public final 1Br A0y;
    public final 1Br A0z;
    public final 1YT A10;
    public final 1Mu A11;
    public volatile boolean A12;

    public DefaultPresenceManager() {
        1Y4 r304;
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0v = A00;
        Context A002 = FbInjector.A00();
        11T.A0A(A002);
        this.A0w = A002;
        this.A0K = 1HG.A00(A002, 65728);
        this.A0y = 1Bq.A00(16458);
        this.A0J = 1Bq.A00(16431);
        this.A0Z = 1Bq.A00(16432);
        this.A0T = 1Bq.A00(67984);
        this.A0G = 1Bq.A00(99390);
        this.A0Y = 1Bq.A00(16461);
        this.A0N = 1Bq.A00(16385);
        this.A0S = 1Bq.A00(66715);
        this.A0M = 1Bu.A00(83436);
        this.A0I = 1Bq.A00(49709);
        this.A0c = 1Bu.A00(66792);
        this.A0L = 1Bq.A00(83605);
        this.A0W = 1Bq.A00(83604);
        this.A0Q = 1Bq.A00(115564);
        this.A0R = 1Bq.A00(66721);
        this.A0V = 1Bq.A00(66115);
        this.A0X = 1HG.A00(A002, 67720);
        this.A0a = 1Bq.A00(83274);
        this.A0U = 1Bq.A00(66303);
        this.A0P = 1Bq.A00(66302);
        this.A0z = 1Bq.A00(66723);
        this.A0H = 1Bq.A00(65837);
        this.A0O = 1Bq.A00(66347);
        this.A0b = 1Bu.A00(16428);
        this.A0h = new 1Xf();
        this.A11 = new HashMultimap();
        this.A0l = new HashMultimap();
        this.A0m = new HashMultimap();
        this.A0s = new ConcurrentHashMap();
        this.A0t = new ConcurrentHashMap();
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        11T.A0A(synchronizedMap);
        this.A0q = synchronizedMap;
        this.A0E = new 1Xo(10);
        this.A0C = new 1Xo(20);
        this.A0F = new 1Xo(25);
        this.A0D = new 1Xo(10);
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        11T.A0A(newSetFromMap);
        this.A0r = newSetFromMap;
        this.A0n = new Object();
        this.A0B = new 0WH(0);
        this.A0o = new Object();
        this.A0u = ((2yD) this.A0N.A00.get()).AZk(36317530490416480L);
        this.A00 = 1Xw.A03;
        this.A01 = 1Xw.A05;
        C1Y1 c1y1 = (C1Y1) this.A0V.A00.get();
        synchronized (c1y1) {
            r304 = c1y1.A00;
            if (r304 == null) {
                r304 = c1y1.A00() == 0S2.A00 ? (1Y4) 1Bn.A0A(66116) : (C08214mB) 1Bi.A03(66113);
                c1y1.A00 = r304;
            }
        }
        if (r304 == null) {
            throw 1BK.A0h();
        }
        this.A0k = r304;
        this.A0j = new 1YF((C1Y9) C1Y6.A00(A00, "com_facebook_presence_plugins_interfaces_presenceupdate_PresenceUpdateInterfaceSpec", "All", new Object[]{1Fw.A04((1EZ) this.A0b.A00.get())}));
        this.A0i = 1YI.A00(A00);
        this.A10 = new 1YT((1YP) C1Y6.A00(A00, "com_facebook_presence_plugins_interfaces_colorfilter_ColorFilterInterfaceSpec", "All", new Object[0]));
        this.A0e = new 1YU();
        this.A0d = new 3bR(this, 14);
        this.A0p = new 1YX(this);
        1P9 r0 = new 1P9((1I7) this.A0K.A00.get());
        r0.A05(new 3cH(this, 1), "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        r0.A05(new 3cG(this, 26), "com.facebook.contacts.ACTION_CONTACT_SYNC_PROGRESS");
        r0.A05(new 3cG(this, 27), "com.facebook.contacts.ACTION_CONTACT_ADDED");
        r0.A05(new 3cM(this, 23), "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        r0.A05(new 3cM(this, 24), "com.facebook.presence.ACTION_PUSH_RECEIVED");
        r0.A05(new 3cM(this, 25), "com.facebook.presence.ACTION_OTHER_USER_TYPING_CHANGED");
        r0.A05(new 3cM(this, 26), "com.facebook.presence.ACTION_PRESENCE_RECEIVED");
        r0.A05(new 3cM(this, 27), "com.facebook.presence.ACTION_PUSH_STATE_RECEIVED");
        this.A0x = r0.A02();
        this.A0g = new 1Yj(this);
        0fH.A0l("DefaultPresenceManager", "Constructor");
        ((1UP) 1Bi.A03(66348)).A00.add(this);
        if (!((Boolean) this.A0L.A00.get()).booleanValue() || 1BK.A0N(((7zZ) 1Bn.A0A(66791)).A00).AZk(36315374416831299L)) {
            this.A0f = new 1Yn(this);
        } else {
            1Bi.A03(346);
            throw AnonymousClass001.A0Q("subscribe");
        }
    }

    public static final 1GU A00(DefaultPresenceManager defaultPresenceManager) {
        return (1GU) defaultPresenceManager.A0y.A00.get();
    }

    public static final 1qG A01(DefaultPresenceManager defaultPresenceManager) {
        return (1qG) 1Lm.A06(1Fw.A04((1EZ) defaultPresenceManager.A0b.A00.get()), 66713);
    }

    public static final 3L8 A02(DefaultPresenceManager defaultPresenceManager) {
        return ((3Lt) 1Lm.A06(1Br.A03(defaultPresenceManager.A0b), 115571)).A00;
    }

    public static final C2fo A03(DefaultPresenceManager defaultPresenceManager, UserKey userKey) {
        C2fo c2fo;
        if (userKey == null) {
            c2fo = new C2fo();
        } else {
            ConcurrentMap concurrentMap = defaultPresenceManager.A0t;
            c2fo = (C2fo) concurrentMap.get(userKey);
            if (c2fo == null) {
                c2fo = new C2fo();
                c2fo.A06 = userKey;
                C2fo c2fo2 = (C2fo) concurrentMap.putIfAbsent(userKey, c2fo);
                if (c2fo2 != null) {
                    return c2fo2;
                }
            }
        }
        return c2fo;
    }

    public static final C1mA A04(DefaultPresenceManager defaultPresenceManager) {
        return (C1mA) defaultPresenceManager.A0z.A00.get();
    }

    public static final ArrayList A05(DefaultPresenceManager defaultPresenceManager, int i, boolean z) {
        int i2;
        C00j.A05("PresenceManager:getOnlineUsersInternal", 1836070577);
        ArrayList arrayList = new ArrayList();
        try {
            0fH.A0g(Integer.valueOf(i), "DefaultPresenceManager", "getOnlineUsersInternal maxUsers: %s");
            if (A0P(defaultPresenceManager) || z) {
                UserKey userKey = (UserKey) defaultPresenceManager.A0M.A00.get();
                for (Map.Entry entry : defaultPresenceManager.A0t.entrySet()) {
                    UserKey userKey2 = (UserKey) entry.getKey();
                    C2fo c2fo = (C2fo) entry.getValue();
                    if (!11T.A0O(userKey2, userKey)) {
                        if (i >= 0 && arrayList.size() >= i) {
                            break;
                        }
                        if (c2fo.A08) {
                            arrayList.add(userKey2);
                        }
                    }
                }
                i2 = -583716584;
            } else {
                i2 = 178817591;
            }
            C00j.A01(i2);
            return arrayList;
        } catch (Throwable th) {
            C00j.A01(-1348556403);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v7 ??, still in use, count: 2, list:
          (r306v7 ??) from 0x0280: PHI (r306v6 ??) = (r306v5 ??), (r306v7 ??) binds: [B:95:0x027d, B:85:0x0275] A[DONT_GENERATE, DONT_INLINE]
          (r306v7 ?? I:X.0WH) from 0x0276: INVOKE (r306v7 ?? I:X.0WH), (r0v72 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x02e9]
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
    public static final void A06(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v7 ??, still in use, count: 2, list:
          (r306v7 ??) from 0x0280: PHI (r306v6 ??) = (r306v5 ??), (r306v7 ??) binds: [B:95:0x027d, B:85:0x0275] A[DONT_GENERATE, DONT_INLINE]
          (r306v7 ?? I:X.0WH) from 0x0276: INVOKE (r306v7 ?? I:X.0WH), (r0v72 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x02e9]
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

    public static final void A07(0WH r301, 3L7 r302, DefaultPresenceManager defaultPresenceManager, 5Cz r304, UserKey userKey) {
        if (!A00(defaultPresenceManager).BWu() && A04(defaultPresenceManager).A04()) {
            A00(defaultPresenceManager).Ciz(new 3iW(r301, r302, defaultPresenceManager, r304, userKey));
            return;
        }
        A00(defaultPresenceManager).AAs();
        C00i c00i = defaultPresenceManager.A0b.A00;
        FbUserSession A04 = 1Fw.A04((1EZ) c00i.get());
        11T.A0F(A04, 1);
        Set A0B = 1Lo.A0B(FbInjector.A00(), A04, (1BY) null, 347);
        11T.A0A(A0B);
        Iterator it = A0B.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onStateChanged");
        }
        5D4 r0 = (5D4) 1Lm.A06(1Fw.A04((1EZ) c00i.get()), 84474);
        if (1Bi.A03(83604) == C0et.A0P) {
            ((Executor) defaultPresenceManager.A0J.A00.get()).execute(new 5D5(r0, r304, userKey, ((C0dp) defaultPresenceManager.A0G.A00.get()).now()));
        }
        if (r301 != null) {
            boolean z = false;
            int size = r301.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (!((C5ni) r301.A02[size]).A00(r304, userKey)) {
                        r301.A01(size);
                        z = true;
                    }
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
                if (z) {
                    if (r302 == null) {
                        1Mu r02 = defaultPresenceManager.A11;
                        synchronized (r02) {
                            r02.Cfv(r301, userKey);
                        }
                    } else {
                        1Mu r03 = defaultPresenceManager.A0m;
                        synchronized (r03) {
                            r03.Cfv(r301, r302.A00);
                        }
                    }
                }
            }
        }
    }

    public static final void A08(final C2e2 c2e2, DefaultPresenceManager defaultPresenceManager) {
        if (A00(defaultPresenceManager).BWu()) {
            c2e2.CXI();
        } else {
            A00(defaultPresenceManager).Ciz(new Runnable() { // from class: X.3fq
                public static final String __redex_internal_original_name = "DefaultPresenceManager$runOnUIOrExplicitLock$1";

                @Override // java.lang.Runnable
                public final void run() {
                    C2e2.this.CXI();
                }
            });
        }
    }

    public static final void A09(DefaultPresenceManager defaultPresenceManager) {
        A01(defaultPresenceManager).A00("DefaultPresenceManager", "Adding GenericPresenceSubscription (/t_p)", new Object[0]);
        1YN r0 = defaultPresenceManager.A0i.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = r0.A02;
        r02.A08("com.facebook.presence.plugins.interfaces.perflogging.PresencePerfLoggingInterfaceSpec", "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMQTTStartConnecting", andIncrement);
        try {
            if (1YN.A00(r0)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r02.A0A("com.facebook.messaging.presence.plugins.inboxperf.perflogging.PresencePerfLoggingImplementation", "messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", "com.facebook.presence.plugins.interfaces.perflogging.PresencePerfLoggingInterfaceSpec", andIncrement2, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "com.facebook.messaging.presence.plugins.inboxperf.PresenceInboxperfKillSwitch", "markMQTTStartConnecting");
                    try {
                        PresencePerfLoggingImplementation presencePerfLoggingImplementation = r0.A00;
                        1X2 r03 = (1X2) 1Lm.A05(presencePerfLoggingImplementation.A00, 1Fw.A04(PresencePerfLoggingImplementation.A00(presencePerfLoggingImplementation)), 66278);
                        synchronized (r03) {
                            1X2.A02(r03, "mqtt_connect_start", "mqtt_connect_start");
                        }
                        r02.A04((Exception) null, "messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMQTTStartConnecting", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r02.A04((Exception) null, "messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMQTTStartConnecting", andIncrement2);
                    throw th;
                }
            }
            r02.A02((Exception) null, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMQTTStartConnecting", andIncrement);
            C00i c00i = defaultPresenceManager.A0U.A00;
            if (((C1mg) c00i.get()).A00()) {
                return;
            }
            C1mg c1mg = (C1mg) c00i.get();
            if (((1X6) c1mg.A01.A00.get()).A07() || !c1mg.A04) {
                A00(defaultPresenceManager).AAs();
                ScheduledFuture scheduledFuture = defaultPresenceManager.A04;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    defaultPresenceManager.A04 = null;
                }
                if (defaultPresenceManager.A0k.BPV(defaultPresenceManager.A0f)) {
                    synchronized (defaultPresenceManager) {
                        defaultPresenceManager.A0S(1Xw.A07);
                    }
                    defaultPresenceManager.A0R();
                }
            }
        } catch (Throwable th2) {
            r02.A02((Exception) null, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMQTTStartConnecting", andIncrement);
            throw th2;
        }
    }

    public static final void A0A(DefaultPresenceManager defaultPresenceManager) {
        A01(defaultPresenceManager).A00("DefaultPresenceManager", "Clearing all presence cache", new Object[0]);
        for (C2fo c2fo : defaultPresenceManager.A0t.values()) {
            11T.A0D(c2fo);
            defaultPresenceManager.A0M(c2fo);
        }
    }

    public static final void A0B(DefaultPresenceManager defaultPresenceManager) {
        A01(defaultPresenceManager).A00("DefaultPresenceManager", "Clearing generic presence cache", new Object[0]);
        1Xo.A00(defaultPresenceManager.A0C, -1);
        1Xo.A00(defaultPresenceManager.A0F, -1);
        0WH r0 = defaultPresenceManager.A0B;
        synchronized (r0) {
            for (C2fo c2fo : defaultPresenceManager.A0t.values()) {
                if (!r0.contains(c2fo.A06)) {
                    defaultPresenceManager.A0M(c2fo);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f5, code lost:
    
        if (r0.A04 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0C(com.facebook.presence.DefaultPresenceManager r301) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.DefaultPresenceManager.A0C(com.facebook.presence.DefaultPresenceManager):void");
    }

    public static final void A0D(DefaultPresenceManager defaultPresenceManager) {
        C00i c00i = defaultPresenceManager.A0T.A00;
        1X6 r0 = (1X6) c00i.get();
        long Av1 = 1X6.A00(r0).Av1(1X6.A01(r0).A04, 0L);
        if (((1X6) c00i.get()).A07() || Av1 == 0) {
            return;
        }
        ((C7l) defaultPresenceManager.A0a.A00.get()).A01(Av1);
    }

    public static final void A0E(DefaultPresenceManager defaultPresenceManager) {
        synchronized (defaultPresenceManager) {
            defaultPresenceManager.A09 = false;
            if (defaultPresenceManager.A0A) {
                defaultPresenceManager.A0A = false;
                defaultPresenceManager.AQe();
            }
        }
    }

    public static final void A0F(DefaultPresenceManager defaultPresenceManager) {
        synchronized (defaultPresenceManager) {
            defaultPresenceManager.A08 = false;
            if (defaultPresenceManager.A07) {
                defaultPresenceManager.A07 = false;
                defaultPresenceManager.A0R();
            }
        }
    }

    public static final void A0G(final DefaultPresenceManager defaultPresenceManager) {
        int i;
        synchronized (defaultPresenceManager) {
            C00j.A05("DefaultPresenceManager.startUnifiedPresenceSync", 692470317);
            try {
                if (defaultPresenceManager.A05) {
                    i = -1266150832;
                } else {
                    1QB r0 = (1QB) 1Bn.A0A(65841);
                    r0.A04("PresenceStartDataSync");
                    r0.A03 = "Other";
                    r0.A03(ServerW3CShippingAddressConstants.DEFAULT);
                    r0.A01 = new Runnable() { // from class: X.3fr
                        public static final String __redex_internal_original_name = "DefaultPresenceManager$startUnifiedPresenceSync$task$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultPresenceManager defaultPresenceManager2 = DefaultPresenceManager.this;
                            if (defaultPresenceManager2.A05) {
                                return;
                            }
                            1YN r02 = defaultPresenceManager2.A0i.A00.A00;
                            AtomicInteger atomicInteger = C1Y6.A04;
                            int andIncrement = atomicInteger.getAndIncrement();
                            1YC r03 = r02.A02;
                            r03.A08("com.facebook.presence.plugins.interfaces.perflogging.PresencePerfLoggingInterfaceSpec", "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMsysSyncStart", andIncrement);
                            try {
                                if (1YN.A00(r02)) {
                                    int andIncrement2 = atomicInteger.getAndIncrement();
                                    String A0q = 1BL.A0q(r03, "markMsysSyncStart", andIncrement2);
                                    try {
                                        try {
                                            1X2 A07 = 1Fw.A07(r02);
                                            synchronized (A07) {
                                                if (!A07.A05) {
                                                    A07.A05 = true;
                                                    1X2.A02(A07, "msys_sync_start", "msys_sync_start");
                                                }
                                            }
                                            r03.A09(A0q, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMsysSyncStart", andIncrement2);
                                        } catch (Exception e) {
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        r03.A04((Exception) null, A0q, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMsysSyncStart", andIncrement2);
                                        throw th;
                                    }
                                }
                                r03.A02((Exception) null, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMsysSyncStart", andIncrement);
                                3L8 A02 = DefaultPresenceManager.A02(defaultPresenceManager2);
                                1Yj r04 = defaultPresenceManager2.A0g;
                                11T.A0F(r04, 4);
                                C00j.A05("MsysUnifiedPresenceClient.start", -1371748593);
                                try {
                                    I2r i2r = A02.A01;
                                    i2r.A00 = r04;
                                    C00j.A05("MsysUnifiedPresenceClient.enableSync", -2101494075);
                                    try {
                                        C00j.A05("UnifiedPresenceMailboxImpl.enableSync", 856967940);
                                        try {
                                            AtomicBoolean atomicBoolean = i2r.A0E;
                                            synchronized (atomicBoolean) {
                                                if (!atomicBoolean.get()) {
                                                    HeL heL = i2r.A09;
                                                    Gs9 gs9 = i2r.A0A;
                                                    11T.A0F(gs9, 0);
                                                    C21S.A00(gs9, (1Uj) 1Br.A0B(heL.A00));
                                                    atomicBoolean.set(true);
                                                }
                                            }
                                            i2r.A01();
                                            C00j.A01(68279695);
                                            C00j.A01(-1096865610);
                                            C00j.A01(1793574789);
                                            defaultPresenceManager2.A05 = true;
                                        } catch (Throwable th2) {
                                            C00j.A01(-1187915362);
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        C00j.A01(-1249085976);
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    C00j.A01(1547391874);
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                r03.A02((Exception) null, "presence.perflogging.PresencePerfLoggingInterfaceSpec", "markMsysSyncStart", andIncrement);
                                throw th5;
                            }
                        }
                    };
                    ((1Qc) 1Br.A0B(defaultPresenceManager.A0H)).A03(r0.A01(), "KeepExisting");
                    i = -666742048;
                }
                C00j.A01(i);
            } catch (Throwable th) {
                C00j.A01(135378538);
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v6 ??, still in use, count: 2, list:
          (r304v6 ??) from 0x0073: PHI (r304v4 ??) = (r304v3 ??), (r304v6 ??) binds: [B:33:0x006e, B:20:0x0065] A[DONT_GENERATE, DONT_INLINE]
          (r304v6 ?? I:X.0WH) from 0x0067: INVOKE (r304v6 ?? I:X.0WH), (r0v13 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x00b5]
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
    public static final void A0H(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v6 ??, still in use, count: 2, list:
          (r304v6 ??) from 0x0073: PHI (r304v4 ??) = (r304v3 ??), (r304v6 ??) binds: [B:33:0x006e, B:20:0x0065] A[DONT_GENERATE, DONT_INLINE]
          (r304v6 ?? I:X.0WH) from 0x0067: INVOKE (r304v6 ?? I:X.0WH), (r0v13 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x00b5]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x003f: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:21:0x003a, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:X.0WH) from 0x0033: INVOKE (r307v3 ?? I:X.0WH), (r0v9 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x0050]
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
    public static final void A0I(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v3 ??, still in use, count: 2, list:
          (r307v3 ??) from 0x003f: PHI (r307v2 ??) = (r307v1 ??), (r307v3 ??) binds: [B:21:0x003a, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r307v3 ?? I:X.0WH) from 0x0033: INVOKE (r307v3 ?? I:X.0WH), (r0v9 ?? I:java.util.Collection) VIRTUAL call: X.0WH.addAll(java.util.Collection):boolean A[Catch: all -> 0x0050]
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

    public static final void A0J(DefaultPresenceManager defaultPresenceManager, ImmutableList immutableList, boolean z) {
        C00j.A05("DefaultPresenceManager.onPresenceReceivedInternal", 935643860);
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    PresenceItem presenceItem = (PresenceItem) it.next();
                    0fH.A0f(presenceItem, Boolean.valueOf(z), "DefaultPresenceManager", "Received presence: %s, fullList: %b");
                    UserKey userKey = presenceItem.A02;
                    C2fo A03 = A03(defaultPresenceManager, userKey);
                    A03.A08 = presenceItem.A07;
                    A03.A00 = presenceItem.A00;
                    A03.A03 = presenceItem.A01;
                    Long l = presenceItem.A03;
                    long j = 0;
                    A03.A01 = l == null ? 0L : l.longValue();
                    Long l2 = presenceItem.A04;
                    if (l2 != null) {
                        j = l2.longValue();
                    }
                    A03.A02 = j;
                    A03.A04 = currentTimeMillis;
                    A0I(defaultPresenceManager, userKey);
                    1Xf r0 = defaultPresenceManager.A0h;
                    UserKey userKey2 = A03.A06;
                    11T.A09(userKey2);
                    Long l3 = (Long) r0.A01.get(userKey2);
                    if (l3 != null) {
                        A0H(defaultPresenceManager, l3.longValue());
                    }
                }
                A0L(defaultPresenceManager, z);
                if (!A04(defaultPresenceManager).A02()) {
                    A0C(defaultPresenceManager);
                }
                C00j.A01(-1646133869);
                C00j.A01(1395690258);
            } catch (Throwable th) {
                C00j.A01(-124028623);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(795093418);
            throw th2;
        }
    }

    public static final void A0K(DefaultPresenceManager defaultPresenceManager, List list) {
        int i;
        C00j.A05("DefaultPresenceManager.requestOnDemandSync", -693026185);
        try {
            if (list.isEmpty()) {
                i = -706027725;
            } else {
                1QB r0 = (1QB) 1Bn.A0A(65841);
                r0.A04("PresenceOnDemandFetch");
                r0.A03 = "Other";
                r0.A03(ServerW3CShippingAddressConstants.DEFAULT);
                r0.A01 = new 3hE(defaultPresenceManager, list);
                ((1Qc) 1Br.A0B(defaultPresenceManager.A0H)).A03(r0.A01(), "KeepExisting");
                i = -556866685;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(461406920);
            throw th;
        }
    }

    public static final void A0L(DefaultPresenceManager defaultPresenceManager, boolean z) {
        0WH r0;
        0WH r02;
        if (!A00(defaultPresenceManager).BWu() && A04(defaultPresenceManager).A04()) {
            A00(defaultPresenceManager).Ciz(new 3hD(defaultPresenceManager, z));
            return;
        }
        try {
            C00j.A05("PresenceManager:notifyListeners", 2136170711);
            A01(defaultPresenceManager).A00("DefaultPresenceManager", "notifyListeners() fullList = %b", new Object[]{Boolean.valueOf(z)});
            if (z) {
                int i = defaultPresenceManager.A11;
                synchronized (i) {
                    try {
                        C4u1 BXh = i.BXh();
                        r0 = new 0WH(0);
                        if (BXh != null) {
                            r0.addAll(BXh);
                        }
                    } finally {
                        int i2 = i;
                    }
                }
                int size = r0.size();
                for (int i3 = 0; i3 < size; i3++) {
                    A0I(defaultPresenceManager, (UserKey) r0.A02[i3]);
                }
                i = defaultPresenceManager.A0l;
                synchronized (i) {
                    C4u1 BXh2 = i.BXh();
                    r02 = new 0WH(0);
                    if (BXh2 != null) {
                        r02.addAll(BXh2);
                    }
                }
                int size2 = r02.size();
                for (int i4 = 0; i < size2; i4 = i + 1) {
                    A0H(defaultPresenceManager, ((Number) r02.A02[i]).longValue());
                }
            }
            Iterator it = defaultPresenceManager.A0s.keySet().iterator();
            while (it.hasNext()) {
                ((2TO) it.next()).A02();
            }
            C00j.A01(-688765812);
        } catch (Throwable th) {
            C00j.A01(838891238);
            throw th;
        }
    }

    private final void A0M(C2fo c2fo) {
        boolean z = c2fo.A08;
        c2fo.A08 = false;
        synchronized (c2fo) {
            c2fo.A07 = RegularImmutableMap.A03;
        }
        c2fo.A00 = 0;
        c2fo.A03 = -1;
        if (z) {
            FbUserSession A04 = 1Fw.A04((1EZ) this.A0b.A00.get());
            11T.A0F(A04, 1);
            Set A0B = 1Lo.A0B(FbInjector.A00(), A04, (1BY) null, 347);
            11T.A0A(A0B);
            Iterator it = A0B.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onStateChanged");
            }
        }
    }

    private final void A0N(boolean z) {
        Integer num = z ? 0S2.A01 : 0S2.A00;
        3L8 A02 = A02(this);
        Integer num2 = 0S2.A01;
        final boolean A1W = AnonymousClass001.A1W(num, num2);
        final I2r i2r = A02.A01;
        C00j.A05("UnifiedPresenceMailboxImpl.reportUserStatus", -170914369);
        try {
            if (i2r.A02.A2a) {
                if (!((1X6) 1Bi.A03(67984)).A07()) {
                    num2 = 0S2.A0C;
                } else if (A1W) {
                    num2 = 0S2.A00;
                }
                I2r.A00(i2r, num2);
            } else {
                int i = 0;
                if (A1W) {
                    i = 1;
                }
                2AV r0 = i2r.A0C;
                String A03 = 0LZ.A00().A03(Boolean.valueOf(A1W));
                if (A03 == null) {
                    throw 1BK.A0h();
                }
                PrivacyContext privacyContext = i2r.A0B;
                final int i2 = 1;
                r0.A00(new MailboxCallback(i2, i2r, A1W) { // from class: X.3am
                    public final int A00;
                    public final Object A01;
                    public final boolean A02;

                    {
                        this.A00 = i2;
                        this.A01 = i2r;
                        this.A02 = A1W;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r310v0 */
                    /* JADX WARN: Type inference failed for: r310v1 */
                    /* JADX WARN: Type inference failed for: r310v2, types: [java.util.AbstractCollection] */
                    @Override // com.facebook.msys.mca.MailboxCallback
                    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                        Object obj2;
                        if (this.A00 != 0) {
                            ((5Ch) 1Br.A0B(((I2r) this.A01).A07)).A03(this.A02);
                            return;
                        }
                        1qX r02 = (1qX) ((MailboxNullable) obj).value;
                        Function1 function1 = (Function1) this.A01;
                        if (r02 != null) {
                            boolean z2 = this.A02;
                            C03853z9 c03853z9 = (C03853z9) 1Bi.A03(67389);
                            07E A07 = 07C.A07(0, 1qX.A00(r02));
                            obj2 = 1BL.A0z(A07);
                            07I it = A07.iterator();
                            while (it.hasNext()) {
                                int A00 = it.A00();
                                long j = r02.mResultSet.getLong(A00, 2);
                                String string = r02.mResultSet.getString(A00, 5);
                                11T.A0A(string);
                                obj2.add(c03853z9.A02(string, z2 ? r02.mResultSet.getString(A00, 8) : null, j));
                            }
                        } else {
                            obj2 = C0ty.A00;
                        }
                        function1.invoke(obj2);
                    }
                }, privacyContext, A03, i);
            }
            C00j.A01(131635081);
            ((5Ch) 1Br.A0B(A02.A00.A00)).A03(A1W);
        } catch (Throwable th) {
            C00j.A01(-806926963);
            throw th;
        }
    }

    private final boolean A0O() {
        if (this.A0W.A00.get() == C0et.A0U) {
            return true;
        }
        Boolean bool = this.A02;
        if (bool == null) {
            bool = (Boolean) 1Bn.A0A(33058);
            this.A02 = bool;
        }
        return bool.booleanValue();
    }

    public static final boolean A0P(DefaultPresenceManager defaultPresenceManager) {
        1Bn.A0A(66304);
        boolean z = false;
        if (!((1Wa) defaultPresenceManager.A0O.A00.get()).A00() && defaultPresenceManager.BUJ()) {
            z = true;
        }
        return z;
    }

    private final boolean A0Q(UserKey userKey) {
        boolean z = false;
        if (userKey != null) {
            if (((Boolean) this.A0L.A00.get()).booleanValue()) {
                1Br.A0C(this.A0c);
            }
            z = A0P(this);
        }
        return z;
    }

    public void A0R() {
        synchronized (this) {
            if (!((C1mg) this.A0U.A00.get()).A00() && this.A0k.isConnectedOrConnecting() && !A04(this).A02()) {
                if (this.A08) {
                    this.A07 = true;
                } else {
                    this.A08 = true;
                    C00i c00i = this.A0S.A00;
                    c00i.get();
                    1Kd.A0F(new 1K9() { // from class: X.28y
                        public void onFailure(Throwable th) {
                            11T.A0F(th, 0);
                            DefaultPresenceManager defaultPresenceManager = DefaultPresenceManager.this;
                            DefaultPresenceManager.A01(defaultPresenceManager).A00("DefaultPresenceManager", "sendAdditionalContacts() - Failed to send additional contacts", new Object[]{th});
                            DefaultPresenceManager.A0F(defaultPresenceManager);
                        }

                        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                            DefaultPresenceManager defaultPresenceManager = DefaultPresenceManager.this;
                            DefaultPresenceManager.A01(defaultPresenceManager).A00("DefaultPresenceManager", "sendAdditionalContacts() - Succeeded to send additional contacts", new Object[0]);
                            DefaultPresenceManager.A0F(defaultPresenceManager);
                        }
                    }, (((C0et) 1Bi.A03(83604)).ordinal() == 0 ? (1ED) ((C28v) c00i.get()).A03.A00.get() : (1ED) 1Br.A0B(this.A0J)).D3C(new C3iy(this, 0)), 1JU.A01);
                }
            }
        }
    }

    public void A0S(1Xw r302) {
        this.A01 = r302;
        A01(this).A00("DefaultPresenceManager", "setPresenceFullListDownloadState(%s)", new Object[]{r302});
        this.A0e.A05 = r302;
    }

    public void A5m(final Object obj) {
        A08(new C2e2() { // from class: X.2e1
            @Override // X.C2e2
            public void CXI() {
                DefaultPresenceManager defaultPresenceManager = DefaultPresenceManager.this;
                1qG A01 = DefaultPresenceManager.A01(defaultPresenceManager);
                Object obj2 = obj;
                A01.A00("DefaultPresenceManager", "Adding generic presence subscriber (%s)", new Object[]{obj2});
                if (DefaultPresenceManager.A04(defaultPresenceManager).A02()) {
                    DefaultPresenceManager.A0G(defaultPresenceManager);
                } else {
                    defaultPresenceManager.A0r.add(obj2);
                    DefaultPresenceManager.A0C(defaultPresenceManager);
                }
            }
        }, this);
    }

    public void A6g(ThreadKey threadKey, C5ni c5ni) {
        IllegalStateException A0h;
        1Mu r0 = this.A0m;
        synchronized (r0) {
            if (threadKey == null) {
                A0h = 1BK.A0h();
            } else if (c5ni != null) {
                r0.CZw(threadKey, c5ni);
            } else {
                A0h = 1BK.A0h();
            }
            throw A0h;
        }
    }

    public void A6h(C5ni c5ni, UserKey userKey) {
        1Mu r0 = this.A11;
        synchronized (r0) {
            if (c5ni == null) {
                throw 1BK.A0h();
            }
            r0.CZw(userKey, c5ni);
        }
    }

    public void A77(2TO r302) {
        A01(this).A00("DefaultPresenceManager", "addPresenceListener(listener=%s)", new Object[]{r302});
        this.A0s.put(r302, true);
    }

    public void A7D(UserKey userKey) {
        if (userKey.equals(this.A0M.A00.get())) {
            return;
        }
        1BV r0 = new 1BV(115116);
        C2fo c2fo = (C2fo) this.A0t.get(userKey);
        if (!A04(this).A02()) {
            if (this.A0W.A00.get() == C0et.A0C) {
                3L2 r02 = (3L2) r0.get();
                boolean A01 = ((C3Qw) 1Br.A0B(r02.A00)).A01();
                2yD A07 = 1Br.A07(r02.A01);
                if (!A01) {
                }
            }
            if (this.A0E.A04(userKey, userKey) == null || this.A0D.A02(userKey) != null) {
            }
            if (!A04(this).A02()) {
                A0R();
                return;
            }
            try {
                String str = userKey.id;
                11T.A0A(str);
                List asList = Arrays.asList(1BK.A0n(str));
                11T.A0A(asList);
                A0K(this, asList);
                return;
            } catch (NumberFormatException e) {
                0fH.A0r("DefaultPresenceManager", "User id format is not numeric. ", e);
                return;
            }
        }
        if (c2fo != null && c2fo.A03 >= 0) {
            return;
        }
        if (this.A0E.A04(userKey, userKey) == null) {
        }
    }

    public void AFz() {
        A01(this).A00("DefaultPresenceManager", "Clearing all additional contacts", new Object[0]);
        0WH r0 = this.A0B;
        synchronized (r0) {
            1Xo.A00(this.A0E, -1);
            1Xo.A00(this.A0D, -1);
            1Xo.A00(this.A0C, -1);
            1Xo.A00(this.A0F, -1);
            r0.clear();
        }
    }

    public void AQe() {
        synchronized (this) {
            if (this.A09) {
                this.A0A = true;
            } else {
                this.A09 = true;
                1Kd.A0F(new C3dl(this, 12), ((1ED) this.A0J.A00.get()).D3B(new Runnable() { // from class: X.512
                    public static final String __redex_internal_original_name = "DefaultPresenceManager$ensureUserDataLoaded$future$1";

                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
                    
                        if ((r0.intValue() & 134217728) == 0) goto L52;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 684
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass512.run():void");
                    }
                }), (Executor) this.A0Z.A00.get());
            }
        }
    }

    public Long Asz(UserKey userKey) {
        C2fo c2fo;
        Long l = null;
        if (A0P(this) && (c2fo = (C2fo) this.A0t.get(userKey)) != null) {
            long j = c2fo.A03;
            if (j > 0) {
                long j2 = j * 1000;
                if (Math.abs(((C0dp) this.A0G.A00.get()).now() - j2) <= 15552000000L && !A0O()) {
                    l = Long.valueOf(j2);
                }
            }
        }
        return l;
    }

    public String At0(UserKey userKey) {
        Long Asz = Asz(userKey);
        if (Asz != null) {
            return ((5Ou) this.A0I.A00.get()).A0J(0S2.A0K, Asz.longValue());
        }
        return null;
    }

    public 5Cz B4F(UserKey userKey, int i) {
        Integer num;
        int i2;
        if (userKey == null) {
            0fH.A0o("DefaultPresenceManager", "userKey is null");
        } else {
            C2fo c2fo = (C2fo) this.A0t.get(userKey);
            if (c2fo != null) {
                if (!A0Q(userKey) || (!c2fo.A08 && (i <= 0 || !DAK(userKey, i)))) {
                    num = 0S2.A01;
                    i2 = 0;
                } else {
                    num = 0S2.A00;
                    i2 = c2fo.A00;
                }
                return new 5Cz(c2fo.A05, c2fo.A07, num, i2, c2fo.A01, c2fo.A02, c2fo.A03 >= 0 ? TimeUnit.SECONDS.toMillis(c2fo.A03) : -1, c2fo.A09);
            }
        }
        5Cz r0 = 5Cz.A08;
        11T.A0B(r0);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.0ty] */
    public List B6M(int i) {
        ArrayList arrayList;
        Long Asz;
        if (A0P(this)) {
            arrayList = new ArrayList();
            for (UserKey userKey : this.A0t.keySet()) {
                if (!11T.A0O(userKey, this.A0M.A00.get()) && (Asz = Asz(userKey)) != null) {
                    long abs = Math.abs(((C0dp) this.A0G.A00.get()).now() - Asz.longValue());
                    if (abs / 1000 >= 60 && abs <= i * 60000 && B4F(userKey, -1).A06 != 0S2.A00) {
                        11T.A0D(userKey);
                        arrayList.add(userKey);
                    }
                }
            }
        } else {
            arrayList = C0ty.A00;
            11T.A0I(arrayList, "null cannot be cast to non-null type kotlin.collections.Collection<com.facebook.user.model.UserKey>");
        }
        return arrayList;
    }

    public String BB2() {
        return "DefaultPresenceManager";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r303.booleanValue() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BUJ() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0O()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L42
            r0 = r301
            java.lang.Boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L37
            r0 = r301
            X.1Br r0 = r0.A0T
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1X6 r0 = (X.1X6) r0
            boolean r0 = r0.A07()
            r302 = r0
            r0 = r302
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r303
            if (r0 != 0) goto L37
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        L37:
            r0 = r303
            boolean r0 = r0.booleanValue()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L46
        L42:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L46:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.DefaultPresenceManager.BUJ():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2 A[Catch: Exception -> 0x021a, all -> 0x0234, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x021a, blocks: (B:41:0x0114, B:42:0x0119, B:45:0x0125, B:48:0x012f, B:51:0x01b2, B:53:0x01e4, B:54:0x01e9, B:61:0x01ba, B:62:0x01c1, B:63:0x01c8, B:65:0x01d1, B:66:0x01d8, B:67:0x01dd, B:67:0x01dd, B:69:0x0139, B:74:0x019e, B:74:0x019e, B:76:0x01a3, B:77:0x014a, B:79:0x015c, B:90:0x0199, B:98:0x0205, B:100:0x0212, B:102:0x0219), top: B:40:0x0114, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba A[Catch: Exception -> 0x021a, all -> 0x0234, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x021a, blocks: (B:41:0x0114, B:42:0x0119, B:45:0x0125, B:48:0x012f, B:51:0x01b2, B:53:0x01e4, B:54:0x01e9, B:61:0x01ba, B:62:0x01c1, B:63:0x01c8, B:65:0x01d1, B:66:0x01d8, B:67:0x01dd, B:67:0x01dd, B:69:0x0139, B:74:0x019e, B:74:0x019e, B:76:0x01a3, B:77:0x014a, B:79:0x015c, B:90:0x0199, B:98:0x0205, B:100:0x0212, B:102:0x0219), top: B:40:0x0114, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BX3(com.facebook.user.model.UserKey r302) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.DefaultPresenceManager.BX3(com.facebook.user.model.UserKey):boolean");
    }

    public void CeM(Object obj) {
        A08(new 4Zf(this, obj), this);
    }

    public void Cek(ThreadKey threadKey, C5ni c5ni) {
        1Mu r0 = this.A0m;
        synchronized (r0) {
            r0.remove(threadKey, c5ni);
        }
    }

    public void Cel(C5ni c5ni, UserKey userKey) {
        1Mu r0 = this.A11;
        synchronized (r0) {
            r0.remove(userKey, c5ni);
        }
    }

    public void Cez(2TO r302) {
        A01(this).A00("DefaultPresenceManager", "removePresenceReceivedListener(listener=%s)", new Object[]{r302});
        this.A0s.remove(r302);
    }

    public boolean DAK(UserKey userKey, int i) {
        boolean z = false;
        if (A0Q(userKey)) {
            long now = ((C0dp) this.A0G.A00.get()).now() - TimeUnit.MINUTES.toMillis(i);
            Long Asz = Asz(userKey);
            if (Asz != null && Asz.longValue() >= now) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0172 A[Catch: Exception -> 0x01d4, all -> 0x01ee, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x01d4, blocks: (B:41:0x00f1, B:42:0x00f6, B:45:0x0102, B:48:0x010c, B:51:0x0172, B:52:0x0179, B:54:0x0180, B:55:0x0187, B:56:0x018c, B:56:0x018c, B:59:0x019b, B:60:0x01a0, B:67:0x0194, B:68:0x0116, B:73:0x0161, B:73:0x0161, B:75:0x0166, B:76:0x0127, B:78:0x0139, B:86:0x015c, B:94:0x01bf, B:96:0x01cc, B:98:0x01d3), top: B:40:0x00f1, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194 A[Catch: Exception -> 0x01d4, all -> 0x01ee, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x01d4, blocks: (B:41:0x00f1, B:42:0x00f6, B:45:0x0102, B:48:0x010c, B:51:0x0172, B:52:0x0179, B:54:0x0180, B:55:0x0187, B:56:0x018c, B:56:0x018c, B:59:0x019b, B:60:0x01a0, B:67:0x0194, B:68:0x0116, B:73:0x0161, B:73:0x0161, B:75:0x0166, B:76:0x0127, B:78:0x0139, B:86:0x015c, B:94:0x01bf, B:96:0x01cc, B:98:0x01d3), top: B:40:0x00f1, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init() {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.DefaultPresenceManager.init():void");
    }

    public void onAppActive() {
        A01(this).A00("DefaultPresenceManager", "onAppActive()", new Object[0]);
        5Ch r0 = (5Ch) this.A0Q.A00.get();
        if (r0.A02.compareAndSet(false, true)) {
            String A05 = 0LZ.A00().A05(true);
            11T.A0A(A05);
            5Ch.A01(r0, true, (Boolean) null, (Boolean) null, 0S2.A0C, A05);
        }
        if (A04(this).A03()) {
            A0N(true);
        } else {
            this.A0j.A00(true);
        }
        ((Executor) this.A0Y.A00.get()).execute(new 5Cp(this));
        A0D(this);
    }

    public void onAppPaused() {
        A01(this).A00("DefaultPresenceManager", "onAppPaused()", new Object[0]);
    }

    public void onAppStopped() {
        A01(this).A00("DefaultPresenceManager", "onAppStopped()", new Object[0]);
        5Ch r0 = (5Ch) this.A0Q.A00.get();
        if (r0.A02.compareAndSet(true, false)) {
            String A04 = 0LZ.A00().A04(true);
            11T.A0A(A04);
            5Ch.A01(r0, false, (Boolean) null, (Boolean) null, 0S2.A0C, A04);
        }
        if (A04(this).A03()) {
            A0N(false);
        } else {
            this.A0j.A00(false);
        }
        ((Executor) this.A0Y.A00.get()).execute(new Runnable() { // from class: X.5or
            public static final String __redex_internal_original_name = "DefaultPresenceManager$onAppStopped$1";

            @Override // java.lang.Runnable
            public final void run() {
                DefaultPresenceManager defaultPresenceManager = DefaultPresenceManager.this;
                if (DefaultPresenceManager.A04(defaultPresenceManager).A02()) {
                    return;
                }
                boolean z = false;
                if (((5Cq) defaultPresenceManager.A0P.A00.get()).A00.A00.get() != C0et.A0C) {
                    z = true;
                }
                if (z) {
                    1qG A01 = DefaultPresenceManager.A01(defaultPresenceManager);
                    Object obj = defaultPresenceManager.A0n;
                    A01.A00("DefaultPresenceManager", "onAppStopped() - removeGenericPresenceSubscription(%s)", new Object[]{obj});
                    defaultPresenceManager.CeM(obj);
                }
                DefaultPresenceManager.A0A(defaultPresenceManager);
                DefaultPresenceManager.A0L(defaultPresenceManager, true);
                if (defaultPresenceManager.A0k.BT4()) {
                    DefaultPresenceManager.A01(defaultPresenceManager).A00("DefaultPresenceManager", "onAppStopped() - setPresenceFullListDownloadState(PresenceDownloadState.TP_DISABLED)", new Object[0]);
                    defaultPresenceManager.A0S(1Xw.A05);
                    DefaultPresenceManager.A0B(defaultPresenceManager);
                    DefaultPresenceManager.A0L(defaultPresenceManager, true);
                }
            }
        });
    }

    public void onDeviceActive() {
    }

    public void onDeviceStopped() {
    }
}
