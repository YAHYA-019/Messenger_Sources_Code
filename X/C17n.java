package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: X.17n, reason: invalid class name */
/* loaded from: 17n.class */
public class C17n {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Context A05;
    public Handler A06;
    public 0Gp A07;
    public AnonymousClass090 A08;
    public C03L A09;
    public RealtimeSinceBootClock A0A;
    public C16i A0B;
    public C16k A0C;
    public C16q A0D;
    public C16v A0E;
    public C08p A0F;
    public 17I A0G;
    public 17K A0H;
    public C04O A0I;
    public 09L A0J;
    public 17U A0K;
    public 17V A0L;
    public 17W A0M;
    public C17l A0N;
    public C0kq A0O;
    public C17u A0P;
    public C1Ak A0Q;
    public AnonymousClass098 A0R;
    public 09M A0S;
    public 18X A0T;
    public 18Y A0U;
    public 19I A0V;
    public 19M A0W;
    public 0Up A0X;
    public String A0Y;
    public String A0Z;
    public java.util.Map A0a;
    public Executor A0b;
    public AtomicBoolean A0c;
    public AtomicInteger A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public long A0q;
    public BroadcastReceiver A0r;
    public BroadcastReceiver A0s;
    public Method A0t;
    public volatile long A11;
    public volatile Pair A12;
    public volatile C08q A13;
    public volatile 18Q A14;
    public volatile 18Q A15;
    public volatile 18T A16;
    public volatile long A17;
    public final Object A10 = A02(this);
    public final 17H A0z = new 0lU(this);
    public final AtomicLong A0y = new AtomicLong();
    public final Runnable A0x = new 17Y(this);
    public final Runnable A0u = new 17Z(this);
    public final Runnable A0v = new Runnable() { // from class: X.17b
        public static final String __redex_internal_original_name = "FbnsConnectionManager$7";

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            C17n c17n = C17n.this;
            if (!c17n.A0N.CxA()) {
                C03L c03l = c17n.A09;
                if (c03l != null) {
                    c03l.BZR("keep_alive", "should_not_be_connected");
                }
                c17n.A0G(C18e.A05);
                return;
            }
            boolean A0Y = c17n.A0Y();
            C03L c03l2 = c17n.A09;
            if (A0Y) {
                if (c03l2 != null) {
                    c03l2.BZR("keep_alive", "send ping");
                }
                c17n.A0T(null);
                return;
            }
            if (c03l2 != null) {
                c03l2.BZR("keep_alive", "not connected");
            }
            18Q r0 = c17n.A14;
            if (r0 == null || !r0.A05()) {
                c17n.A0L();
                19M r02 = c17n.A0W;
                synchronized (r02) {
                    0fH.A0m("ConnectionRetryManager", "ensure scheduled");
                    Future future = r02.A09;
                    if (future != null) {
                        if (!future.isDone()) {
                            z = false;
                        }
                    }
                    if (r02.A06 == null) {
                        r02.A02();
                    } else {
                        r02.A01();
                    }
                    z = true;
                }
                if (z) {
                    c17n.A0E.A0F = C16m.KEEPALIVE;
                }
            }
        }
    };
    public final Runnable A0w = new Runnable() { // from class: X.17c
        public static final String __redex_internal_original_name = "FbnsConnectionManager$8";

        @Override // java.lang.Runnable
        public void run() {
            C17n c17n = C17n.this;
            boolean z = c17n.A0l;
            String str = c17n.A0Y;
            if (!z) {
                0fH.A0n(str, "ping unreceived");
                c17n.A0F(c17n.A14, C18e.A0A, C18f.CONNECTION_LOST);
                return;
            }
            0fH.A0n(str, "ping unreceived. Try to send a ping from client to server");
            18Q r0 = c17n.A14;
            if (r0 == null || !AnonymousClass001.A1W(r0.A0d, C08t.CONNECTED)) {
                return;
            }
            try {
                c17n.A0H();
                C17n.A07(c17n, r0);
            } catch (0Mb e) {
                0fH.A0u(c17n.A0Y, "Error sending ping to server. Disconnecting", e);
                c17n.A0F(c17n.A14, C18e.A0A, C18f.CONNECTION_LOST);
            }
        }
    };

    public C17n() {
    }

    public C17n(boolean z) {
        this.A0o = z;
    }

    private int A00() {
        boolean z = this.A0c.get();
        17V r0 = this.A0L;
        int An3 = z ? r0.An3() : r0.AYY();
        0fH.A0a(Integer.valueOf(An3), AnonymousClass001.A0K(), String.valueOf(z), this.A0Y, "state/keepalive; seconds=%d, isPersistent=%b, isAppFg=%s");
        return An3;
    }

    private Pair A01(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                java.util.Map map = this.A0a;
                String str = subscribeTopic.A01;
                if (!map.containsKey(str)) {
                    map.put(str, subscribeTopic);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                SubscribeTopic subscribeTopic2 = (SubscribeTopic) it2.next();
                java.util.Map map2 = this.A0a;
                String str2 = subscribeTopic2.A01;
                if (map2.containsKey(str2)) {
                    map2.remove(str2);
                }
            }
        }
        18Q r0 = this.A14;
        if (r0 == null) {
            return null;
        }
        java.util.Map map3 = this.A0a;
        java.util.Map map4 = r0.A0M;
        synchronized (map4) {
            arrayList = null;
            for (SubscribeTopic subscribeTopic3 : map3.values()) {
                String str3 = subscribeTopic3.A01;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, subscribeTopic3);
                    if (arrayList == null) {
                        arrayList = AnonymousClass001.A0s();
                    }
                    arrayList.add(subscribeTopic3);
                }
            }
            Iterator A0y = AnonymousClass001.A0y(map4);
            arrayList2 = null;
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                if (!map3.containsKey(A0z.getKey())) {
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass001.A0s();
                    }
                    arrayList2.add((SubscribeTopic) A0z.getValue());
                    A0y.remove();
                }
            }
            16Q.A01(AnonymousClass001.A1Q(map3.size(), map4.size()));
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        0fH.A0f(arrayList, arrayList2, "MqttClient", "topic diff %s %s");
        return new Pair(arrayList, arrayList2);
    }

    public static Object A02(C17n c17n) {
        c17n.A0Y = "FbnsConnectionManager";
        c17n.A0c = new AtomicBoolean(false);
        c17n.A0a = new HashMap();
        c17n.A0e = false;
        c17n.A0p = false;
        c17n.A0I = C04N.A00();
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c7, code lost:
    
        if (r0.A02.equals(r0.A02) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02a3, code lost:
    
        if (r0.isConnected() == false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(android.content.Intent r301, X.C17n r302) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A03(android.content.Intent, X.17n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0256, code lost:
    
        if (((android.os.SystemClock.elapsedRealtime() - r0) / 1000) >= r302.A0F.A03().A0P) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0279, code lost:
    
        if (r0.isConnected() == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.0Gp r301, X.C17n r302, X.C18f r303) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A04(X.0Gp, X.17n, X.18f):void");
    }

    public static void A05(C17n c17n) {
        18Q r0 = c17n.A15;
        if (r0 != null) {
            c17n.A15 = null;
            c17n.A00 = 0;
            r0.A0c = null;
            C18e c18e = C18e.A01;
            synchronized (r0) {
                18Q.A01(r0, C18a.DISCONNECT, c18e, (Throwable) null);
            }
        }
    }

    public static void A06(C17n c17n) {
        18Q A0C;
        18Q r0;
        0fH.A0j(c17n.A0Y, "running connect internal now");
        C17v.A00(C17y.A03, (C17v) c17n.A0E.A05(C1Au.class));
        c17n.A0y.set(SystemClock.elapsedRealtime());
        int i = c17n.A0F.A03().A0J;
        0fH.A0g(Integer.valueOf(i), c17n.A0Y, "thread/set_priority; priority=%d");
        Thread.currentThread().setPriority(i);
        c17n.A0L();
        if (c17n.A15 != null) {
            0fH.A0m(c17n.A0Y, "connect/switch_to_preemptive_connection");
            0fH.A17(c17n.A0Y, "Using preemptive client op %d", new Object[]{Integer.valueOf(c17n.A00)});
            A0C = c17n.A15;
            c17n.A15 = null;
            c17n.A00 = 0;
        } else {
            A0C = c17n.A0C();
        }
        synchronized (c17n) {
            r0 = c17n.A14;
            c17n.A14 = A0C;
        }
        if (r0 != null) {
            0fH.A0n(c17n.A0Y, "connecting new client without disconnecting old one");
            c17n.A0F(r0, C18e.A04, C18f.DISCONNECTED);
        }
        c17n.A01 = System.currentTimeMillis();
        0fH.A0l(c17n.A0Y, "connection/connecting");
        c17n.A0N.Bqm();
    }

    public static void A07(C17n c17n, 18Q r302) {
        if (r302 != null) {
            C08t c08t = r302.A0d;
            C08t c08t2 = C08t.CONNECTED;
            if (AnonymousClass001.A1W(c08t, c08t2)) {
                18X r0 = c17n.A0T;
                C17u c17u = c17n.A0P;
                if (r0 != null) {
                    c17u.A01(r302, c17n.A0T, C18v.PINGRESP, "callPing", -1, c17n.A0F.A03().A0M);
                } else {
                    c17u.A02(r302, C18v.PINGRESP, "callPing", -1, c17n.A0F.A03().A0M);
                }
                synchronized (r302) {
                    if (!AnonymousClass001.A1W(r302.A0d, c08t2)) {
                        throw new 0Mb(C18h.A0Z);
                    }
                    0fH.A0j("MqttClient", "send/ping");
                    r302.A0N.execute(new 18N(r302));
                }
            }
        }
    }

    public static void A08(C17n c17n, 18Q r302, C18f c18f) {
        0fH.A0l(c17n.A0Y, "connection/reconnect");
        c17n.A0F(r302, C18e.A04, c18f);
        A06(c17n);
    }

    public int A09(18X r302, 18Y r303, Integer num, String str, byte[] bArr) {
        0Gp A0B = A0B(r302, r303, num, str, null, bArr, this.A0F.A03().A0M, 0L);
        if (A0B.A06()) {
            return ((AnonymousClass184) A0B.A05()).B0K();
        }
        return -1;
    }

    public int A0A(18Y r302, Integer num, String str, byte[] bArr) {
        0Gp A0B = A0B(null, r302, num, str, null, bArr, this.A0F.A03().A0M, 0L);
        if (A0B.A06()) {
            return ((AnonymousClass184) A0B.A05()).B0K();
        }
        return -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r337v0 ??, still in use, count: 3, list:
          (r337v0 ??) from 0x01f3: PHI (r337v1 ??) = (r337v0 ??), (r337v2 ??), (r337v3 ??) binds: [B:63:0x01cd, B:49:0x01ec, B:31:0x016f] A[DONT_GENERATE, DONT_INLINE]
          (r337v0 ?? I:X.0kl) from 0x019d: INVOKE (r337v0 ?? I:X.0kl) VIRTUAL call: X.0kl.A00():void A[Catch: 0Mb -> 0x0230, MD:():void (m)]
          (r337v0 ?? I:X.0kl) from 0x01ac: IGET (r0v112 ?? I:int) = (r337v0 ?? I:X.0kl) A[Catch: 0Mb -> 0x0230] X.0kl.A01 int
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
    public X.0Gp A0B(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r337v0 ??, still in use, count: 3, list:
          (r337v0 ??) from 0x01f3: PHI (r337v1 ??) = (r337v0 ??), (r337v2 ??), (r337v3 ??) binds: [B:63:0x01cd, B:49:0x01ec, B:31:0x016f] A[DONT_GENERATE, DONT_INLINE]
          (r337v0 ?? I:X.0kl) from 0x019d: INVOKE (r337v0 ?? I:X.0kl) VIRTUAL call: X.0kl.A00():void A[Catch: 0Mb -> 0x0230, MD:():void (m)]
          (r337v0 ?? I:X.0kl) from 0x01ac: IGET (r0v112 ?? I:int) = (r337v0 ?? I:X.0kl) A[Catch: 0Mb -> 0x0230] X.0kl.A01 int
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

    /* JADX WARN: Code restructure failed: missing block: B:121:0x05e9, code lost:
    
        if (r339.equals("") != false) goto L125;
     */
    /* JADX WARN: Type inference failed for: r0v401, types: [X.18q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.18Q A0C() {
        /*
            Method dump skipped, instructions count: 2942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A0C():X.18Q");
    }

    public HashSet A0D() {
        HashSet hashSet;
        java.util.Map map = this.A0a;
        synchronized (map) {
            hashSet = new HashSet(map.keySet());
        }
        return hashSet;
    }

    public List A0E(18Q r302) {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.concurrent.Future] */
    public Future A0F(18Q r302, C18e c18e, C18f c18f) {
        synchronized (this) {
            if (this.A14 == r302) {
                this.A14 = null;
            } else {
                0fH.A0j(this.A0Y, "Disconnecting old client after a new one already created");
            }
        }
        boolean z = false;
        AnonymousClass177 anonymousClass177 = AnonymousClass177.A01;
        if (r302 != null) {
            z = AnonymousClass001.A1W(r302.A0d, C08t.DISCONNECTED);
            r302.A0c = null;
            synchronized (r302) {
                anonymousClass177 = 18Q.A01(r302, C18a.DISCONNECT, c18e, (Throwable) null);
            }
            this.A02 = System.currentTimeMillis();
        }
        0fH.A0a(c18e, c18f, Boolean.valueOf(z), this.A0Y, "MQTT disconnectInternal sender: %s reason: %s disconnected: %b");
        if (z) {
            this.A0N.Bqt(0Go.A00);
            return anonymousClass177;
        }
        A04(0Go.A00, this, c18f);
        return anonymousClass177;
    }

    public Future A0G(C18e c18e) {
        19M r0 = this.A0W;
        synchronized (r0) {
            0fH.A0m("ConnectionRetryManager", "stop retry");
            19M.A00(r0);
        }
        A05(this);
        return A0F(this.A14, c18e, C18f.BY_REQUEST);
    }

    public void A0H() {
        this.A0M.A00();
        if (this.A0g || (this.A0k && this.A0c.get())) {
            this.A0M.A01();
        } else {
            this.A0K.A05();
        }
    }

    public void A0I() {
        0uN r0 = new 0uN(this, 7);
        this.A0s = r0;
        AnonymousClass023.A01(r0, this.A05, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), this.A06);
        0uN r02 = new 0uN(this, 8);
        this.A0r = r02;
        AnonymousClass023.A02(r02, this.A05, new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"), this.A06, null, false);
        17I r03 = this.A0G;
        17H r04 = this.A0z;
        synchronized (r03) {
            r03.A03.add(r04);
        }
        this.A0R.A03();
    }

    public void A0J() {
        this.A0K.A03();
        this.A0M.A00();
        this.A0K.A04();
        17I r0 = this.A0G;
        17H r02 = this.A0z;
        synchronized (r0) {
            r0.A03.remove(r02);
        }
        BroadcastReceiver broadcastReceiver = this.A0s;
        if (broadcastReceiver != null) {
            try {
                this.A05.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                0fH.A0v(this.A0Y, "Failed to unregister broadcast receiver", e);
            }
            this.A0s = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.A0r;
        if (broadcastReceiver2 != null) {
            try {
                this.A05.unregisterReceiver(broadcastReceiver2);
            } catch (IllegalArgumentException e2) {
                0fH.A0v(this.A0Y, "Failed to unregister broadcast receiver", e2);
            }
            this.A0r = null;
        }
        this.A0R.A04();
        this.A0Q.A04();
    }

    public void A0K() {
        synchronized (this.A0a) {
            final Pair A01 = A01(null, null);
            if (A01 != null) {
                this.A0b.execute(new Runnable() { // from class: X.17d
                    public static final String __redex_internal_original_name = "FbnsConnectionManager$9";

                    @Override // java.lang.Runnable
                    public void run() {
                        C17n c17n = this;
                        Pair pair = A01;
                        c17n.A0b((List) pair.first);
                        c17n.A0c((List) pair.second);
                    }
                });
            }
        }
    }

    public void A0L() {
        int A00 = A00();
        if (this.A0d.getAndSet(A00) != A00) {
            A0H();
        }
    }

    public void A0M(C16m c16m) {
        A0L();
        this.A0E.A0F = c16m;
        this.A0W.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
    
        if (r0.A05() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0N(X.C16m r302) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A0N(X.16m):void");
    }

    public void A0O(C16m c16m, String str) {
        List list;
        18Q r0 = this.A14;
        if (!this.A0N.CxA()) {
            0fH.A0j(this.A0Y, "connection/should_not_connect");
            A0G(C18e.A07);
            return;
        }
        if (this.A0g || (this.A0k && this.A0c.get())) {
            list = this.A0M;
            synchronized (list) {
                try {
                    if (!((17W) list).A00) {
                        list.A01();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            17U r02 = this.A0K;
            synchronized (r02) {
                if (r02.A03) {
                    0fH.A0g(AnonymousClass002.A0H(r02.A01 - SystemClock.elapsedRealtime()), "KeepaliveManager", "keepalive/no_op; nextWakeupSec=%d");
                } else {
                    r02.A05();
                }
            }
        }
        if (r0 == null || !AnonymousClass001.A1W(r0.A0d, C08t.CONNECTED)) {
            18Q r03 = this.A14;
            if (r03 != null && r03.A05()) {
                0fH.A0d(str, c16m, this.A0Y, "connection/already_connecting; kicked_by: %s reason: %s");
                return;
            }
        } else if (!((String) ((Pair) this.A0J.Asq()).first).equals(r0.A0e)) {
            0fH.A0j(this.A0Y, "connection/reconnect_due_to_auth_change");
            A0G(C18e.A02);
        } else if (this.A04 > this.A03) {
            0fH.A0j(this.A0Y, "connection/reconnect_due_to_network_change");
        } else {
            boolean equals = c16m.equals(C16m.FORCE_KICK);
            String str2 = this.A0Y;
            if (!equals) {
                0fH.A0j(str2, "connection/already_connected");
                return;
            }
            0fH.A0j(str2, "connection/force_kick_reconnecting");
            0fH.A0j(this.A0Y, "Connecting Immediately via force kick");
            this.A0E.A0F = C16m.CONNECT_NOW;
            19M r04 = this.A0W;
            synchronized (r04) {
                if (r04.A07 == null) {
                    0fH.A0n("ConnectionRetryManager", "No force reconnect runnable set. Completing early from kickNow()");
                } else {
                    Handler handler = r04.A0F;
                    if (handler == null || handler.getLooper().getThread() != Thread.currentThread()) {
                        r04.A0H.submit(r04.A07);
                    } else {
                        r04.A07.run();
                    }
                }
            }
        }
        0fH.A0e(str, c16m.toString(), this.A0Y, "connection/kick_connect; kicked_by: %s reason: %s");
        list = this.A0I.A01;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((04P) it.next()).CrL(str);
            }
        }
        A0M(c16m);
    }

    public void A0P(PrintWriter printWriter) {
        printWriter.println(0Pz.A0j("[ ", this.A0Y, " ]"));
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("keepAliveIntervalSeconds=");
        printWriter.println(AnonymousClass001.A0a(this.A0d, A0k));
        NetworkInfo A01 = this.A0G.A01();
        0Pz.A1E(printWriter, "networkInfo=", A01 != null ? A01.toString() : "null");
        if (this.A12 != null) {
            String A0j = 0Pz.A0j(this.A12.first.toString(), "@", this.A12.second.toString());
            printWriter.println(0Pz.A0V("lastConnectLostTime=", new Date((System.currentTimeMillis() + this.A11) - SystemClock.elapsedRealtime())));
            0Pz.A1E(printWriter, "lastConnectLostReason=", A0j);
        }
        18Q r0 = this.A14;
        if (r0 == null) {
            printWriter.println("mMqttClient=null");
            return;
        }
        synchronized (r0) {
            printWriter.println("[ MqttClient ]");
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("state=");
            printWriter.println(AnonymousClass001.A0a(r0.A0d, A0k2));
            0Pz.A1E(printWriter, "lastMessageSent=", 18Q.A00(r0.A0Y));
            0Pz.A1E(printWriter, "lastMessageReceived=", 18Q.A00(r0.A0X));
            0Pz.A1E(printWriter, "connectionEstablished=", 18Q.A00(r0.A0V));
            0Pz.A1E(printWriter, "lastPing=", 18Q.A00(r0.A0Z));
            0Pz.A1E(printWriter, "peer=", r0.A0G.B6r());
        }
    }

    public void A0Q(Boolean bool) {
    }

    public void A0R(Boolean bool) {
    }

    public void A0S(Boolean bool, List list, List list2) {
    }

    public void A0T(String str) {
        String str2;
        0fH.A0l(this.A0Y, "send/keepalive");
        18Q r0 = this.A14;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if ((elapsedRealtime - this.A17) / 1000 >= this.A0F.A03().A00) {
                this.A17 = elapsedRealtime;
                C0Ai.A03.A02 = str;
                AnonymousClass090 anonymousClass090 = this.A08;
                this.A0G.A03();
                if (!anonymousClass090.A00) {
                    A07(this, r0);
                    return;
                }
                if (this.A0c.get()) {
                    C17v.A00(16D.A06, (C17v) this.A0E.A05(C1Aq.class));
                } else {
                    C17v.A00(16D.A01, (C17v) this.A0E.A05(C1Aq.class));
                }
                if (r0 == null || !AnonymousClass001.A1W(r0.A0d, C08t.CONNECTED)) {
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - r0.A0a;
                C16v c16v = this.A0E;
                try {
                    str2 = C16t.A00(null, null, null, C16v.A00(c16v), (C1Ar) c16v.A05(C1Ar.class), C16v.A01(c16v, elapsedRealtime2), null, null, false, true).toString();
                } catch (JSONException unused) {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                0fH.A0i(str2, this.A0Y, "send/health_stats; stats=%s");
                try {
                    try {
                        A09(this.A0T, this.A0U, 0S2.A01, "/mqtt_health_stats", str2.getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                        throw AnonymousClass001.A0T("UTF-8 not supported");
                    }
                } catch (0Mb unused3) {
                }
            }
        } catch (0Mb e) {
            0fH.A0s(this.A0Y, "exception/send_keepalive", e);
            A0F(r0, C18e.A0J, C18f.CONNECTION_LOST);
        }
    }

    public void A0U(String str, Integer num, String str2) {
        try {
            A0A(null, num, str, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw AnonymousClass001.A0T("UTF-8 not supported");
        }
    }

    public void A0V(List list) {
    }

    public void A0W(List list) {
    }

    public void A0X(List list, List list2, boolean z) {
        Boolean valueOf;
        synchronized (this.A10) {
            boolean compareAndSet = this.A0c.compareAndSet(AnonymousClass001.A1O(z ? 1 : 0), z);
            if (compareAndSet) {
                A0L();
                18Q r0 = this.A14;
                if (r0 != null) {
                    synchronized (r0) {
                        try {
                            r0.A0G.Cp1(z);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
            }
            boolean z2 = !z ? !this.A0h : !this.A0i;
            Integer num = null;
            if (compareAndSet) {
                valueOf = Boolean.valueOf(z);
                num = Integer.valueOf(A00());
            } else {
                valueOf = null;
            }
            0fH.A0Z(valueOf, num, list, list2, this.A0Y, "send/publish/t_fs; appState=%s, keepaliveSec=%s subscribe %s unsubscribe %s");
            synchronized (this.A0a) {
                try {
                    Pair A01 = A01(list, list2);
                    if (valueOf != null || num != null || A01 != null) {
                        this.A0b.execute(new C17a(A01, this, valueOf, num, z2));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.AnonymousClass001.A1W(r0.A0d, X.C08t.CONNECTED) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0Y() {
        /*
            r301 = this;
            r0 = r301
            X.18Q r0 = r0.A14
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r302
            X.08t r0 = r0.A0d
            r303 = r0
            X.08t r0 = X.C08t.CONNECTED
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L24
        L1f:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L24:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A0Y():boolean");
    }

    public boolean A0Z(long j) {
        String str;
        String str2;
        Future<?> submit;
        try {
            18Q r0 = this.A14;
            if (r0 == null || !r0.A05()) {
                A0L();
                0fH.A0j(this.A0Y, "Connecting Immediately");
                this.A0E.A0F = C16m.CONNECT_NOW;
                19M r02 = this.A0W;
                Handler handler = r02.A0F;
                if (handler == null || handler.getLooper().getThread() != Thread.currentThread()) {
                    submit = r02.A0H.submit(r02.A08);
                } else {
                    r02.A08.run();
                    submit = AnonymousClass177.A01;
                }
                if (submit != null) {
                    submit.get(j, TimeUnit.MILLISECONDS);
                }
            }
            18Q r03 = this.A14;
            if (r03 == null) {
                0fH.A0j(this.A0Y, "connection/client/failed_to_init");
                return false;
            }
            C08t c08t = r03.A0d;
            C08t c08t2 = C08t.CONNECTED;
            if (AnonymousClass001.A1W(c08t, c08t2)) {
                return true;
            }
            r03.A03(j);
            return AnonymousClass001.A1W(r03.A0d, c08t2);
        } catch (InterruptedException unused) {
            0fH.A0n(this.A0Y, "exception/connect_interrupted");
            AnonymousClass001.A13();
            return false;
        } catch (CancellationException e) {
            e = e;
            str = this.A0Y;
            str2 = "exception/cancellation";
            0fH.A0q(str, str2, e);
            return false;
        } catch (ExecutionException e2) {
            0fH.A0v(this.A0Y, "exception/execution_exception", e2);
            return false;
        } catch (TimeoutException e3) {
            e = e3;
            str = this.A0Y;
            str2 = "exception/timeout";
            0fH.A0q(str, str2, e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw 1;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0a(X.18Y r302, java.lang.String r303, java.lang.String r304, byte[] r305, long r306, long r308) {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A0Y
            r310 = r0
            r0 = r303
            r311 = r0
            r0 = r303
            r1 = r310
            java.lang.String r2 = "send/publishAndWait; topic=%s"
            X.0fH.A0i(r0, r1, r2)
            java.lang.Integer r0 = X.0S2.A01
            r312 = r0
            r0 = r301
            X.08p r0 = r0.A0F
            X.08q r0 = r0.A03()
            r313 = r0
            r0 = r313
            int r0 = r0.A0M
            r314 = r0
            r0 = r301
            r1 = 0
            r2 = r302
            r3 = r312
            r4 = r303
            r5 = r304
            r6 = r305
            r7 = r314
            r8 = r308
            X.0Gp r0 = r0.A0B(r1, r2, r3, r4, r5, r6, r7, r8)
            r315 = r0
            r0 = r315
            boolean r0 = r0.A06()
            r316 = r0
            r0 = r316
            if (r0 != 0) goto L47
            r0 = 0
            return r0
        L47:
            r0 = r315
            java.lang.Object r0 = r0.A05()     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r313 = r0
            r0 = r313
            X.184 r0 = (X.AnonymousClass184) r0     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r313 = r0
            r0 = r313
            r1 = r306
            r0.DA7(r1)     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r0 = r301
            java.lang.String r0 = r0.A0Y     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r317 = r0
            java.lang.String r0 = "send/publishAndWait; topic=%s, operation=%s"
            r310 = r0
            r0 = r315
            java.lang.Object r0 = r0.A05()     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r313 = r0
            r0 = r303
            r1 = r313
            r2 = r317
            r3 = r310
            X.0fH.A0f(r0, r1, r2, r3)     // Catch: java.util.concurrent.TimeoutException -> L7c java.util.concurrent.ExecutionException -> L7d
            r0 = 1
            return r0
        L7c:
            throw r0
        L7d:
            r317 = move-exception
            r0 = r301
            java.lang.String r0 = r0.A0Y
            r310 = r0
            r0 = r311
            r1 = r310
            java.lang.String r2 = "send/publishAndWait/failed; topic=%s"
            X.0fH.A0i(r0, r1, r2)
            r0 = r317
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17n.A0a(X.18Y, java.lang.String, java.lang.String, byte[], long, long):boolean");
    }

    public boolean A0b(List list) {
        18Q r0;
        if (list == null || list.isEmpty() || (r0 = this.A14) == null || !r0.A05()) {
            return false;
        }
        try {
            int andIncrement = 18Q.A0j.getAndIncrement() & ((char) (-1));
            this.A0P.A02(r0, C18v.SUBACK, "callSub", andIncrement, this.A0F.A03().A0M);
            synchronized (r0) {
                if (!r0.A05()) {
                    throw new 0Mb(C18h.A0Z);
                }
                r0.A0N.execute(new 18K(r0, list, andIncrement));
            }
            return true;
        } catch (0Mb e) {
            0fH.A0v(this.A0Y, "exception/subscribe", e);
            A0F(r0, C18e.A0J, C18f.CONNECTION_LOST);
            return false;
        }
    }

    public boolean A0c(List list) {
        18Q r0;
        if (list == null || list.isEmpty() || (r0 = this.A14) == null || !r0.A05()) {
            return false;
        }
        try {
            int andIncrement = 18Q.A0j.getAndIncrement() & ((char) (-1));
            this.A0P.A02(r0, C18v.UNSUBACK, "callUnSub", andIncrement, this.A0F.A03().A0M);
            synchronized (r0) {
                if (!r0.A05()) {
                    throw new 0Mb(C18h.A0Z);
                }
                r0.A0N.execute(new 18L(r0, list, andIncrement));
            }
            return true;
        } catch (0Mb e) {
            0fH.A0v(this.A0Y, "exception/unsubscribe", e);
            A0F(r0, C18e.A0J, C18f.CONNECTION_LOST);
            return false;
        }
    }
}
