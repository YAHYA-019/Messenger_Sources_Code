package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.messages.Message;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.68t, reason: invalid class name */
/* loaded from: 68t.class */
public final class C68t {
    public static final C00i A0P = new 1BQ(16385);
    public static final C00i A0O = new 1BQ(16387);
    public static final Set A0Q = ImmutableSet.A06("facebook.com", "www.facebook.com", "m.alpha.facebook.com", "www.m.alpha.facebook.com", "m.facebook.com", "www.alpha.facebook.com", new String[0]);
    public static final List A0R = ImmutableList.of((Object) "com.facebook.katana", (Object) "com.facebook.wakizashi", (Object) "com.facebook.lite");
    public final C00i A0L = new 1BQ(6);
    public final C00i A05 = new 1BQ(16511);
    public final C00i A07 = new 1BV(100011);
    public final C00i A0I = new 1BV(83498);
    public final C00i A08 = new 1BQ(99723);
    public final C00i A0J = new 1BV(114751);
    public final C00i A0A = new 1BV(83526);
    public final C00i A09 = new 1BV(84572);
    public final C00i A0K = new 1BQ(16766);
    public final C00i A06 = new 1BV(68321);
    public final C00i A00 = new 1BQ(16885);
    public final C00i A01 = new 1BQ(17137);
    public final C00i A03 = new 1BV(49963);
    public final C00i A0F = new 1BQ(114758);
    public final C00i A0E = new 1BQ(84962);
    public final C00i A0M = new 1BQ(114759);
    public final C00i A0H = new 1BV(147498);
    public final C00i A0G = new 1BV(68733);
    public final C00i A0D = new 1BQ(16457);
    public final C00i A0B = new 1BQ(66393);
    public final C68w A0N = new C68w((C68u) C1Y6.A00(null, "com_facebook_messaging_linkhandling_plugins_interfaces_linkhandler_LinkHandlerInterfaceSpec", "All", new Object[0]));
    public final C00i A02 = new 1BQ(68728);
    public final C15h A0C = new AHe(this, 21);
    public final C00i A04 = new 1BQ(82975);

    public static BO2 A00(Uri uri) {
        if (BU4.A00(uri)) {
            return BO2.A02;
        }
        String host = uri.getHost();
        if (uri.toString().startsWith(C1ic.A18) || A0Q.contains(host)) {
            return BO2.A01;
        }
        return null;
    }

    private ListenableFuture A01(Context context, Uri uri, FbUserSession fbUserSession, Message message, C5id c5id) {
        1hM r314;
        C7N c7n;
        Integer num;
        C00i c00i = this.A02;
        C7N c7n2 = (C7N) c00i.get();
        String str = message == null ? null : message.A1V;
        c7n2.A01(str, "try_handle_web_url");
        if (uri != null) {
            if (A0H(context, uri)) {
                c7n = (C7N) c00i.get();
                num = 0S2.A1J;
            } else {
                if (BNN.A00(uri) == BNN.A02) {
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments.size() >= 4) {
                        if (((16Y) this.A0A.get()).BXk(context, new Uri.Builder().scheme("fb-messenger").authority("community").appendQueryParameter("group_id", 1BK.A14(pathSegments, 1)).appendQueryParameter("threadkey", 0Pz.A0W("GROUP:", 1BK.A14(pathSegments, 3))).appendQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE, "link_sharing").build())) {
                            c7n = (C7N) c00i.get();
                            num = 0S2.A0C;
                        }
                    }
                }
                if (c5id != C5id.A0Z || !((2yD) A0P.get()).AZk(36315962828007012L)) {
                    ((C7N) c00i.get()).A01(message == null ? null : message.A1V, "try_open_iab");
                    if (BNN.A00(uri) == BNN.A0D) {
                        C00i c00i2 = A0P;
                        String BCz = 1BK.A0N(c00i2).BCz(36883035949434210L, "");
                        int A00 = C1Ur.A00((1CO) c00i2.get(), 0, 36601560972662249L);
                        1BK.A0N(c00i2).AZk(36320085996092439L);
                        if ((!C7sp.A01(BCz, uri.toString()) || A00 != 1) && (!((CNG) 1Bn.A0A(68730)).A03(uri) || ((!((C67Q) this.A03.get()).A08() || !1BK.A0N(A0O).AZk(72340108397186072L)) && !1BK.A0N(A0O).AZk(72340108396727314L)))) {
                            C00i c00i3 = this.A07;
                            if (((FIu) c00i3.get()).A0B(context, uri)) {
                                boolean z = true;
                                if (LDu.A04(uri)) {
                                    C00i c00i4 = this.A06;
                                    C9ag c9ag = (C9ag) c00i4.get();
                                    C00i c00i5 = c9ag.A01.A00;
                                    long generateNewFlowId = ((UserFlowLogger) c00i5.get()).generateNewFlowId(5506720);
                                    c9ag.A00 = generateNewFlowId;
                                    ((UserFlowLogger) c00i5.get()).flowStart(generateNewFlowId, new UserFlowConfig("handleBrowserOpen", false));
                                    C00i c00i6 = this.A00;
                                    String str2 = "com.facebook.wakizashi";
                                    boolean z2 = false;
                                    if (((C0B5) c00i6.get()).A01(str2, 0) != null) {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        str2 = null;
                                        if (((C0B5) c00i6.get()).A01("com.facebook.katana", 0) != null) {
                                            str2 = "com.facebook.katana";
                                        }
                                    }
                                    boolean z3 = ((C4R) this.A04.get()).A00((String) this.A0C.get()).A05;
                                    if (str2 != null) {
                                        z = false;
                                    }
                                    ((C9ag) c00i4.get()).A01(0S2.A0j, generateNewFlowId, z3);
                                    ((C9ag) c00i4.get()).A01(0S2.A0Y, generateNewFlowId, z);
                                    if (!z) {
                                        C00i c00i7 = A0O;
                                        if (1BK.A0N(c00i7).AZk(72340692512542755L) && (z3 || !1BK.A0N(c00i7).AZk(72340692512608292L))) {
                                            FbUserSession A0D = 4YV.A0D(context);
                                            GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                                            4YV.A1A(4YU.A0J(GraphQlCallInput.A02, uri.toString(), "url"), graphQlQueryParamSet, "request");
                                            2Jf r0 = new 2Jf(2JX.class, (Class) null, "WebTriggerRetrievalQuery", (String) null, "fbandroid", -857875274, 0, 3688838009L, 3688838009L, false, true);
                                            r0.A00 = graphQlQueryParamSet;
                                            1FV A09 = 1VX.A0E(context, A0D).A09(C3sa.A00(r0));
                                            ABm aBm = new ABm(this, generateNewFlowId, 1);
                                            1JU r02 = 1JU.A01;
                                            1Kd.A0F(aBm, A09, r02);
                                            r314 = 2FP.A02(new ABd(context, uri, this, c5id, str2, generateNewFlowId), A09, r02);
                                        }
                                    }
                                    C9ag c9ag2 = (C9ag) c00i4.get();
                                    c9ag2.A01(0S2.A00, generateNewFlowId, true);
                                    c9ag2.A00(generateNewFlowId, false);
                                }
                                ((FIu) c00i3.get()).A09(context, uri, c5id);
                                r314 = new 1hM(true);
                            } else {
                                FIu fIu = (FIu) c00i3.get();
                                if (!FHo.A03(uri) && fIu.A0C(uri) && LDu.A04(uri) && 1BK.A0N(c00i2).AZk(36313265587951650L)) {
                                    r314 = 2FP.A01(new D2z(1, uri, c5id, this, context), ((C67Q) this.A03.get()).A04(context, fbUserSession));
                                }
                            }
                            return 2FP.A02(new Imk(context, uri, this, message, c5id), r314, 1JU.A01);
                        }
                    }
                    r314 = new 1hM(false);
                    return 2FP.A02(new Imk(context, uri, this, message, c5id), r314, 1JU.A01);
                }
            }
            c7n.A00(num, str, (String) null, true);
            return new 1hM(true);
        }
        return new 1hM(false);
    }

    private String A02(Context context, Intent intent, PackageManager packageManager) {
        0CS A00 = F4o.A00(intent, context.getApplicationInfo(), packageManager);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0s.add(((PackageItemInfo) it.next()).packageName);
        }
        Iterator it2 = A0R.iterator();
        while (it2.hasNext()) {
            String A0i = AnonymousClass001.A0i(it2);
            if (((C0B5) this.A00.get()).A01(A0i, 0) != null && A0s.contains(A0i)) {
                return A0i;
            }
        }
        return null;
    }

    public static String A03(Message message, boolean z) {
        6Ay BCm;
        7ZM A0w;
        String str = null;
        if (z) {
            str = (String) message.A13.get(C5l0.class.getName());
        } else {
            5Pm r0 = message.A08;
            if (r0 != null && (BCm = r0.BCm()) != null && (A0w = BCm.A0w()) != null) {
                return Integer.toString(A0w.getIntValue(1208616083));
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x019a, code lost:
    
        if (X.C5id.A0y.equals(r307) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(android.content.Context r301, android.content.Intent r302, android.net.Uri r303, com.facebook.auth.usersession.FbUserSession r304, X.C68t r305, com.facebook.messaging.model.messages.Message r306, X.C5id r307) {
        /*
            Method dump skipped, instructions count: 2730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68t.A04(android.content.Context, android.content.Intent, android.net.Uri, com.facebook.auth.usersession.FbUserSession, X.68t, com.facebook.messaging.model.messages.Message, X.5id):void");
    }

    public static void A05(Context context, Uri uri, FbUserSession fbUserSession, C68t c68t, Message message, C5id c5id) {
        ((C7N) c68t.A02.get()).A01(message == null ? null : message.A1V, "open_iab_handle_third_party_failed");
        c68t.A08.get();
        Intent A00 = FHo.A00(context, uri);
        A00.addCategory("android.intent.category.BROWSABLE");
        A04(context, A00, uri, fbUserSession, c68t, message, c5id);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x03bf, code lost:
    
        if (r0.equals(X.0S2.A0C) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x037a, code lost:
    
        if ((!r333) == false) goto L161;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(android.content.Context r301, android.net.Uri r302, com.facebook.auth.usersession.FbUserSession r303, X.C68t r304, com.facebook.messaging.model.messages.Message r305, X.C5id r306) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68t.A06(android.content.Context, android.net.Uri, com.facebook.auth.usersession.FbUserSession, X.68t, com.facebook.messaging.model.messages.Message, X.5id):void");
    }

    public static void A07(Context context, Uri uri, FbUserSession fbUserSession, C68t c68t, Message message, C5id c5id) {
        1Kd.A0F(new AC1(2, context, uri, fbUserSession, c68t, message, c5id), c68t.A01(context, uri, fbUserSession, message, c5id), ((CG7) c68t.A0G.get()).A01() ? (Executor) c68t.A0D.get() : 1JU.A01);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v44 ??, still in use, count: 3, list:
          (r318v44 ??) from 0x18e4: PHI (r318v45 ??) = (r318v44 ??), (r318v57 ??) binds: [B:1166:0x1988, B:987:0x18de] A[DONT_GENERATE, DONT_INLINE]
          (r318v44 ?? I:android.content.Intent) from 0x197d: INVOKE (r318v44 ?? I:android.content.Intent), (r1v53 ?? I:android.net.Uri) VIRTUAL call: android.content.Intent.setData(android.net.Uri):android.content.Intent A[Catch: Exception -> 0x203e, all -> 0x2043, MD:(android.net.Uri):android.content.Intent (c)]
          (r318v44 ?? I:android.content.Intent) from 0x198a: INVOKE (r318v44 ?? I:android.content.Intent), (r0v356 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.addCategory(java.lang.String):android.content.Intent A[Catch: Exception -> 0x203e, all -> 0x2043, MD:(java.lang.String):android.content.Intent (c)]
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
    private void A08(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v44 ??, still in use, count: 3, list:
          (r318v44 ??) from 0x18e4: PHI (r318v45 ??) = (r318v44 ??), (r318v57 ??) binds: [B:1166:0x1988, B:987:0x18de] A[DONT_GENERATE, DONT_INLINE]
          (r318v44 ?? I:android.content.Intent) from 0x197d: INVOKE (r318v44 ?? I:android.content.Intent), (r1v53 ?? I:android.net.Uri) VIRTUAL call: android.content.Intent.setData(android.net.Uri):android.content.Intent A[Catch: Exception -> 0x203e, all -> 0x2043, MD:(android.net.Uri):android.content.Intent (c)]
          (r318v44 ?? I:android.content.Intent) from 0x198a: INVOKE (r318v44 ?? I:android.content.Intent), (r0v356 ?? I:java.lang.String) VIRTUAL call: android.content.Intent.addCategory(java.lang.String):android.content.Intent A[Catch: Exception -> 0x203e, all -> 0x2043, MD:(java.lang.String):android.content.Intent (c)]
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

    /* JADX WARN: Type inference failed for: r0v33, types: [X.1pP, java.lang.Object] */
    public static boolean A09(Context context, Intent intent, PackageManager packageManager) {
        0CS A00 = F4o.A00(intent, context.getApplicationInfo(), packageManager);
        2yD r0 = (2yD) 1Bi.A03(16385);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            String str = ((PackageItemInfo) it.next()).packageName;
            if ("com.facebook.katana".equals(str) || "com.facebook.wakizashi".equals(str)) {
                String BCy = r0.BCy(36882971525907798L);
                PackageInfo A01 = ((C0B5) 1Bi.A03(16885)).A01("com.facebook.katana", 0);
                if (A01 != null && new Object().A00(A01.versionName, BCy) >= 0) {
                    return FE6.A01(context, intent);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        if (X.0LS.A0C(r301, r0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0A(android.content.Context r301, android.net.Uri r302, X.C68t r303, com.facebook.messaging.model.messages.Message r304, X.C5id r305) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68t.A0A(android.content.Context, android.net.Uri, X.68t, com.facebook.messaging.model.messages.Message, X.5id):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (((java.lang.String) r0.get("action")).startsWith("copy") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (r0.intValue() != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0B(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A13
            r303 = r0
            java.lang.String r0 = "action"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.containsKey(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L35
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r304 = r0
            java.lang.String r0 = "copy"
            r306 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 != 0) goto L38
        L35:
            r0 = 0
            r307 = r0
        L38:
            r0 = r301
            java.lang.Integer r0 = r0.A1G
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L57
            r0 = r306
            int r0 = r0.intValue()
            r308 = r0
            r0 = 3
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r308
            r1 = r309
            if (r0 == r1) goto L5d
        L57:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L5d:
            r0 = r307
            if (r0 != 0) goto L72
            r0 = r305
            if (r0 != 0) goto L72
            r0 = r301
            boolean r0 = r0.A20
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L74
        L72:
            r0 = 1
            r302 = r0
        L74:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68t.A0B(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0C(C5id c5id) {
        if (c5id == C5id.A0Z) {
            return ((2yD) A0P.get()).AZk(36319364442372041L);
        }
        return true;
    }

    private void A0D(Context context, Intent intent, Uri uri, Message message, boolean z) {
        if (message.A08 != null) {
            C00i c00i = A0P;
            if (((2yD) c00i.get()).AZk(36319364441520067L)) {
                FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
                intent.putExtra("from_xma_click", true);
                intent.putExtra("is_e2ee", z);
                boolean z2 = false;
                if (uri != null && ((C0Aj.A03(uri) && !C0Aj.A06(uri)) || 0Pw.A00(uri))) {
                    z2 = true;
                }
                intent.putExtra("is_fb_content", Boolean.valueOf(z2));
                intent.putExtra("is_xma_forwarded", A0B(message));
                intent.putExtra("xma_message_sent_time", Long.toString(message.A05));
                intent.putExtra("msgr_navigation_chain", ((2Kq) 1Lo.A06(A04, 65959)).A06());
                intent.putExtra("xma_content_type", A03(message, z));
                if (((2yD) c00i.get()).AZk(36319364441847750L)) {
                    this.A0B.get();
                    intent.putExtra("xma_click_id", 7Lt.A09);
                }
            }
        }
    }

    public void A0E(Context context, Uri uri) {
        A08(context, uri, 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428)), null, C5id.A10);
    }

    public void A0F(Context context, Uri uri, Message message, C5id c5id) {
        A08(context, uri, 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428)), message, c5id);
    }

    public void A0G(Context context, Uri uri, C5id c5id) {
        A0F(context, uri, null, c5id);
    }

    public boolean A0H(Context context, Uri uri) {
        if (BNN.A00(uri) != BNN.A07) {
            return false;
        }
        Uri build = uri.buildUpon().scheme("fb-messenger").appendQueryParameter(AbstractC00603o4.A00(87), "handle_mdotme_natively_messenger").build();
        HnO hnO = (HnO) this.A0J.get();
        if (build != null) {
            hnO.A00(build.toString(), "messenger_thread");
        }
        return ((16Y) this.A0A.get()).BXk(context, build);
    }
}
