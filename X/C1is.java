package X;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.device.DeviceConditionHelper;
import com.facebook.device.resourcemonitor.DataUsageBytes;
import com.facebook.quicksilver.QuicksilverActivity;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.1is, reason: invalid class name */
/* loaded from: 1is.class */
public final class C1is {
    public long A00;
    public C1it A01;
    public C1it A02;
    public C1it A03;
    public int A04;
    public C2vp A05;
    public C2vp A06;
    public C1it A07;
    public C1it A08;
    public C1it A09;
    public C1it A0A;
    public C1it A0B;
    public C1it A0C;
    public C1it A0D;
    public DataUsageBytes A0E;
    public final C00i A0O;
    public final java.util.Map A0Q;
    public final java.util.Map A0R;
    public final C00i A0T;
    public final C00i A0U;
    public final C00i A0V;
    public final C00i A0d;
    public final List A0h;
    public final Set A0i;
    public final C00i A0Z = new 1BQ(16971);
    public final C00i A0N = new 1BQ(32849);
    public final C00i A0a = new 1BQ(16972);
    public final C00i A0M = new 1BQ(16961);
    public final C00i A0L = new 1BQ(16768);
    public final C00i A0F = new 1BQ(99390);
    public final C00i A0c = new 1BV(16459);
    public final C00i A0g = new 1BQ(16458);
    public final C00i A0J = new 1BQ(16849);
    public final C00i A0G = new 1BQ(17093);
    public final C00i A0f = new 1BV(116395);
    public final C00i A0X = new 1BQ(66401);
    public final C00i A0P = new 1BQ(16772);
    public final C00i A0I = new 1BQ(49228);
    public final C00i A0W = new 1BQ(17134);
    public final C00i A0b = new 1BQ(17137);
    public final C00i A0e = new 1BQ(66098);
    public final C00i A0Y = new 1BQ(66097);
    public final C00i A0K = new 1BQ(16385);
    public final C00i A0H = new 1BQ(83603);
    public final C00i A0S = new 1BQ(16387);

    public C1is() {
        1BQ r0 = new 1BQ(66333);
        this.A0O = r0;
        this.A0d = new 1BV(66155);
        this.A0T = new 1BQ(66823);
        this.A0U = new 1BQ(66821);
        this.A0V = new 1BQ(66338);
        HashSet hashSet = new HashSet();
        this.A0i = hashSet;
        this.A0R = new HashMap();
        this.A0h = new ArrayList();
        this.A01 = new C1it(null);
        this.A09 = new C1it(null);
        this.A07 = new C1it(null);
        this.A08 = new C1it(null);
        this.A0B = new C1it(null);
        this.A0C = new C1it(null);
        this.A0A = new C1it(null);
        this.A0D = new C1it(null);
        this.A02 = new C1it(null);
        this.A03 = new C1it(null);
        this.A0Q = Collections.synchronizedMap(new HashMap());
        this.A04 = 0;
        if (((C1iu) r0.get()).A05) {
            return;
        }
        Set A06 = 1Bi.A06(281);
        Set A0I = 1Bn.A0I(209);
        hashSet.addAll(A06);
        hashSet.addAll(A0I);
    }

    public static Object A00(C2vk c2vk, Object obj) {
        Object obj2;
        if (c2vk.A00 == obj) {
            return c2vk.A01;
        }
        Object obj3 = obj;
        while (true) {
            obj2 = obj3;
            if (!(obj2 instanceof C2vn)) {
                break;
            }
            Fragment fragment = ((QuicksilverActivity) ((C2vn) obj2)).A02;
            if (fragment == null) {
                break;
            }
            obj3 = fragment;
        }
        c2vk.A00 = obj;
        c2vk.A01 = obj2;
        return obj2;
    }

    public static String A01(Context context) {
        String AWg;
        return (!(context instanceof 1lN) || (AWg = ((1lN) context).AWg()) == null) ? "unknown" : AWg;
    }

    public static String A02(C1is c1is, Object obj) {
        String A00;
        if (obj == null) {
            return null;
        }
        if (obj instanceof 2jQ) {
            2jQ r0 = (2jQ) obj;
            if (!TextUtils.isEmpty(r0.AyB())) {
                A00 = r0.AyB();
                return A00;
            }
        }
        A00 = C01e.A00(obj.getClass());
        if (A00 != null && (A00.equals("InboxActivity") || A00.equals("MsysThreadViewActivity") || A00.equals("MsysThreadViewFragment") || A00.equals("thread_act"))) {
            C00i c00i = c1is.A0K;
            if (((2yD) c00i.get()).AZk(36316641432775013L) || ((2yD) c00i.get()).AZk(36320592803216930L)) {
                return "unknown";
            }
        }
        return A00;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r333v4 ??, still in use, count: 2, list:
          (r333v4 ??) from 0x037b: PHI (r333v2 ??) = (r333v1 ??), (r333v4 ??) binds: [B:126:0x02d3, B:116:0x0376] A[DONT_GENERATE, DONT_INLINE]
          (r333v4 ?? I:X.3IV) from 0x0378: IPUT (r0v141 ?? I:long), (r333v4 ?? I:X.3IV) A[Catch: all -> 0x0410] X.3IV.A00 long
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
    private void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r333v4 ??, still in use, count: 2, list:
          (r333v4 ??) from 0x037b: PHI (r333v2 ??) = (r333v1 ??), (r333v4 ??) binds: [B:126:0x02d3, B:116:0x0376] A[DONT_GENERATE, DONT_INLINE]
          (r333v4 ?? I:X.3IV) from 0x0378: IPUT (r0v141 ?? I:long), (r333v4 ?? I:X.3IV) A[Catch: all -> 0x0410] X.3IV.A00 long
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

    public static void A04(C1is c1is, String str, java.util.Map map) {
        String str2;
        Stack stack;
        C00i c00i = c1is.A0G;
        C2mT c2mT = (C2mT) c00i.get();
        synchronized (c2mT.A05) {
            if (!c2mT.A02.empty() && str != null && ((2wE) c2mT.A02.peek()).A02 != null && ((2wE) c2mT.A02.peek()).A02.equals(str)) {
                c2mT.A02.pop();
            }
            if (!c2mT.A02.isEmpty()) {
                c2mT.A02.peek();
            }
        }
        HashMap hashMap = new HashMap();
        Optional A01 = ((C2mT) c00i.get()).A01();
        if (A01.isPresent()) {
            str2 = ((2wE) A01.get()).A02;
            hashMap.put("dest_module_class", ((2wE) A01.get()).A01);
            hashMap.put("dest_fragment_hash", ((2wE) A01.get()).A00);
            A01.get();
            hashMap.putAll(((2wE) A01.get()).A03);
        } else {
            str2 = null;
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        C2mT c2mT2 = (C2mT) c00i.get();
        synchronized (c2mT2.A05) {
            stack = (Stack) c2mT2.A02.clone();
        }
        c1is.A06(str, str2, hashMap);
        C2mT c2mT3 = (C2mT) c00i.get();
        synchronized (c2mT3.A05) {
            c2mT3.A02 = stack;
        }
    }

    public static void A05(C1is c1is, String str, java.util.Map map, boolean z) {
        String str2;
        String str3;
        Stack stack;
        C00i c00i = c1is.A0G;
        Optional A01 = ((C2mT) c00i.get()).A01();
        Integer num = null;
        if (A01.isPresent()) {
            str3 = ((2wE) A01.get()).A02;
            str2 = ((2wE) A01.get()).A01;
        } else {
            str2 = null;
            str3 = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_modal", Boolean.valueOf(z));
        hashMap.put("source_module_class", str2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (hashMap.containsKey("dest_fragment_hash") && (hashMap.get("dest_fragment_hash") instanceof Integer)) {
            num = (Integer) hashMap.get("dest_fragment_hash");
        }
        C2mT c2mT = (C2mT) c00i.get();
        synchronized (c2mT.A05) {
            stack = (Stack) c2mT.A02.clone();
        }
        c1is.A06(str3, str, hashMap);
        C2mT c2mT2 = (C2mT) c00i.get();
        synchronized (c2mT2.A05) {
            c2mT2.A02 = stack;
        }
        C2mT c2mT3 = (C2mT) c00i.get();
        synchronized (c2mT3.A05) {
            String str4 = null;
            if (!c2mT3.A02.isEmpty()) {
                c2mT3.A02.peek();
            }
            Stack stack2 = c2mT3.A02;
            if (map != null) {
                str4 = (String) map.get("dest_module_class");
            }
            stack2.push(new 2wE(num, str, str4, map));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.2vk] */
    private void A06(String str, String str2, java.util.Map map) {
        C00j.A05("NavigationLogger.reportNavigationEvent", 1303030775);
        try {
            A0D(null, new Object(), null, null, 1Fw.A04((1EZ) 1Bn.A0E((Context) null, (1BY) null, 16428)), str, str2, null, map, false);
            C00j.A01(388536452);
        } catch (Throwable th) {
            C00j.A01(-813562701);
            throw th;
        }
    }

    public String A07() {
        String str;
        if (((C1iu) this.A0O.get()).A05) {
            return null;
        }
        2Ko r0 = (2Ko) this.A0a.get();
        synchronized (2Kk.A00) {
            str = (String) r0.A00.A00();
        }
        return str;
    }

    public void A08(Activity activity, final FbUserSession fbUserSession) {
        C00j.A05("NavigationLogger.reportActivityPaused", -762550296);
        try {
            final C1iy c1iy = (C1iy) this.A0L.get();
            synchronized (2Kk.A00) {
                Set set = c1iy.A0M;
                if (set.remove(activity) && set.isEmpty()) {
                    long now = ((C0dp) c1iy.A07.get()).now();
                    if (c1iy.A01 != null) {
                        0fH.A0o("NavigationLoggerActivityCore", "Previous sendToBackgroundDetector is still alive");
                        ((1vU) c1iy.A0J.get()).A02(c1iy.A01);
                        c1iy.A01 = null;
                    }
                    C00i c00i = c1iy.A0G;
                    if (!((C03963zf) c00i.get()).A00) {
                        c1iy.A01 = new Runnable() { // from class: X.3zg
                            public static final String __redex_internal_original_name = "NavigationLoggerActivityCore$1";

                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z;
                                HashMap hashMap;
                                String str;
                                C1iy c1iy2 = C1iy.this;
                                FbUserSession fbUserSession2 = fbUserSession;
                                synchronized (2Kk.A00) {
                                    if (!c1iy2.A03) {
                                        c1iy2.A03 = true;
                                        c1iy2.A0F.get();
                                        RealtimeSinceBootClock.A00.now();
                                        Integer num = 0S2.A0C;
                                        if (!((PowerManager) c1iy2.A0K.get()).isScreenOn()) {
                                            num = 0S2.A00;
                                        }
                                        1UG A00 = 1UD.A00((04J) c1iy2.A0C.get(), 1ZG.A01, "app_state");
                                        NetworkInfo A02 = ((DeviceConditionHelper) c1iy2.A09.get()).A02();
                                        if (A00.isSampled()) {
                                            switch (num.intValue()) {
                                                case 0:
                                                    str = "resign";
                                                    break;
                                                case 1:
                                                    str = "foreground";
                                                    break;
                                                default:
                                                    str = "background";
                                                    break;
                                            }
                                            A00.A7R("state", str);
                                            A00.A7R("visitation_id", ((1YY) c1iy2.A0A.get()).A02());
                                            A00.A7R("connection", A02 != null ? A02.getTypeName() : "null");
                                            A00.A7R(1BJ.A00(202), "");
                                            A00.A7R(1BJ.A00(203), C1iy.A00(c1iy2, fbUserSession2));
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        C08394mt c08394mt = (C08394mt) c1iy2.A05.get();
                                        synchronized (c08394mt) {
                                            try {
                                                C08394mt.A01(c08394mt);
                                                C00i c00i2 = c08394mt.A0A;
                                                hashMap = new HashMap(((2Ct) ((AnonymousClass449) c00i2.get())).A00);
                                                ((AnonymousClass449) c00i2.get()).A04();
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                        if (z) {
                                            A00.A6J("analytic_counters", hashMap);
                                        }
                                        C00i c00i3 = c1iy2.A0H;
                                        if (((2Ko) c00i3.get()).A00.A01 != null && z) {
                                            try {
                                                A00.A7R("click_point", (String) ((2Ko) c00i3.get()).A00.A00());
                                                ((2Ko) c00i3.get()).A00((String) null);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                        }
                                        ((1J0) c1iy2.A0L.get()).A01();
                                        if (z) {
                                            A00.BZL();
                                        }
                                        c1iy2.A00 = null;
                                        if (!((1Od) c1iy2.A06.get()).A0G()) {
                                            C2mT c2mT = (C2mT) c1iy2.A08.get();
                                            synchronized (c2mT.A05) {
                                                try {
                                                    c2mT.A02.clear();
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    throw th;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        };
                        ((1vU) c1iy.A0J.get()).A03(c1iy.A01, 5000L);
                    }
                    String A00 = ((1vW) c1iy.A0B.get()).A00(activity);
                    if (((C03963zf) c00i.get()).A00) {
                        2Jy r0 = new 2Jy("session_end");
                        r0.A0D("pigeon_reserved_keyword_uuid", A00);
                        r0.A0E("session_timeout", ConstantsKt.CAMERA_ID_BACK);
                        r0.A01 = now;
                        C08394mt c08394mt = (C08394mt) c1iy.A05.get();
                        synchronized (c08394mt) {
                            try {
                                C08394mt.A01(c08394mt);
                                ((AnonymousClass449) c08394mt.A0A.get()).A5V(r0);
                                c08394mt.A03(r0);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        ((C03963zf) c00i.get()).A00 = false;
                    }
                }
                2J2 r02 = (2J2) c1iy.A0E.get();
                C00j.A05("NavigationLoggerChatHeadCore.onActivityPaused", 374624053);
                try {
                    int i = -950994877;
                    if (((2yD) r02.A01.get()).AZk(72339803457784090L)) {
                        i = 1128907970;
                    }
                    C00j.A01(i);
                } catch (Throwable th2) {
                    th = th2;
                    C00j.A01(1940038659);
                    throw th;
                }
            }
            C00j.A01(529948228);
        } catch (Throwable th3) {
            C00j.A01(-401128065);
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0238, code lost:
    
        if (r0 != false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(android.app.Activity r302, final com.facebook.auth.usersession.FbUserSession r303) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1is.A09(android.app.Activity, com.facebook.auth.usersession.FbUserSession):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.2vk] */
    public void A0A(Activity activity, String str, String str2, String str3, java.util.Map map) {
        Activity activity2 = activity;
        if (((C1iu) this.A0O.get()).A05) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        ?? obj = new Object();
        if (activity != null && !(activity instanceof 1lN)) {
            Object A00 = A00(obj, activity);
            if (A00 != null) {
                hashMap.put("dest_module_class", A02(this, A00));
            }
            hashMap.put("dest_fragment_hash", Integer.valueOf(activity.hashCode()));
            activity2 = null;
        }
        A03(activity2, obj, (1lN) activity2, 1Fw.A04((1EZ) 1Bn.A0E(activity2, (1BY) null, 16428)), str, str2, str3, hashMap);
    }

    public void A0B(Context context, Fragment fragment) {
        A0C(context, fragment, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.2vk] */
    public void A0C(Context context, Fragment fragment, String str, String str2, java.util.Map map) {
        Fragment fragment2 = fragment;
        if (((C1iu) this.A0O.get()).A05) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        ?? obj = new Object();
        if (fragment != null && !(fragment instanceof 1lN)) {
            Object A00 = A00(obj, fragment);
            if (A00 != null) {
                hashMap.put("dest_module_class", A02(this, A00));
            }
            hashMap.put("dest_fragment_hash", 1BK.A0j(fragment));
            fragment2 = null;
        }
        A03(context, obj, (1lN) fragment2, 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428)), null, str, str2, hashMap);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v102 ??, still in use, count: 2, list:
          (r315v102 ??) from 0x0c49: PHI (r315v101 ??) = (r315v100 ??), (r315v102 ??) binds: [B:561:0x0c2e, B:566:0x0c44] A[DONT_GENERATE, DONT_INLINE]
          (r315v102 ?? I:X.3xs) from 0x0c46: IPUT (r315v102 ?? I:X.3xs), (r0v337 ?? I:X.2Jy) A[Catch: all -> 0x1a6b] X.2Jy.A02 X.3xs
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
    public void A0D(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v102 ??, still in use, count: 2, list:
          (r315v102 ??) from 0x0c49: PHI (r315v101 ??) = (r315v100 ??), (r315v102 ??) binds: [B:561:0x0c2e, B:566:0x0c44] A[DONT_GENERATE, DONT_INLINE]
          (r315v102 ?? I:X.3xs) from 0x0c46: IPUT (r315v102 ?? I:X.3xs), (r0v337 ?? I:X.2Jy) A[Catch: all -> 0x1a6b] X.2Jy.A02 X.3xs
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

    public void A0E(String str) {
        int i;
        C00j.A05("NavigationLogger.setLastNavigationTapPoint", 686170453);
        try {
            if (((C1iu) this.A0O.get()).A05) {
                i = 1999298646;
            } else {
                ((2Ko) this.A0a.get()).A00(str);
                i = 443098191;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1280679245);
            throw th;
        }
    }

    public void A0F(String str, String str2, String str3) {
        2Jy r0 = new 2Jy("click");
        if (str != null) {
            r0.A0D("pigeon_reserved_keyword_module", str);
        }
        r0.A0D("pigeon_reserved_keyword_obj_type", str2);
        if (str3 != null) {
            r0.A0D("pigeon_reserved_keyword_obj_id", str3);
        }
        2wB.A00((C1kw) this.A0P.get()).A02(r0);
    }

    public void A0G(String str, String str2, String str3, java.util.Map map) {
        2Jy r0 = new 2Jy("click");
        r0.A0D("pigeon_reserved_keyword_module", str);
        r0.A0D("pigeon_reserved_keyword_obj_type", str2);
        if (str3 != null) {
            r0.A0D("pigeon_reserved_keyword_obj_id", str3);
        }
        if (map != null) {
            2Jy.A03(r0, map, false);
        }
        2wB.A00((C1kw) this.A0P.get()).A03(r0);
    }

    public void A0H(String str, java.util.Map map) {
        if (((C1iu) this.A0O.get()).A05) {
            return;
        }
        if (((2yD) this.A0K.get()).AZk(36312879040894053L)) {
            ((1vU) this.A0c.get()).A01(new 6QL(this, str, map));
        } else {
            A04(this, str, map);
        }
    }

    public void A0I(final String str, final java.util.Map map, final boolean z) {
        if (((C1iu) this.A0O.get()).A05) {
            return;
        }
        if (((2yD) this.A0K.get()).AZk(36312879040894053L)) {
            ((1vU) this.A0c.get()).A01(new Runnable() { // from class: X.5il
                public static final String __redex_internal_original_name = "NavigationLogger$1";

                @Override // java.lang.Runnable
                public void run() {
                    C1is.A05(C1is.this, str, map, z);
                }
            });
        } else {
            A05(this, str, map, z);
        }
    }
}
