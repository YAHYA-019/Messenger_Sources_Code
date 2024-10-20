package com.facebook.messaging.encryptedbackups.gdrive.flow;

import X.0DL;
import X.0DR;
import X.0J3;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.2aI;
import X.7zK;
import X.7zN;
import X.7zR;
import X.9Eo;
import X.9Fx;
import X.9IO;
import X.9YZ;
import X.AJd;
import X.AKd;
import X.AQb;
import X.Aam;
import X.AnonymousClass001;
import X.AnonymousClass127;
import X.C03r;
import X.C03t;
import X.C14o;
import X.C2az;
import X.C2b0;
import X.C2b1;
import X.C2b5;
import X.C2b6;
import X.C2p2;
import X.C4G6;
import X.C4G7;
import X.C9m2;
import X.C9up;
import X.C9uq;
import X.DKC;
import X.GAc;
import X.JR0;
import X.JR1;
import X.JjV;
import X.K2H;
import X.KVT;
import X.Kvv;
import X.LDn;
import X.LQp;
import X.LWj;
import X.LWk;
import X.LWl;
import X.LWm;
import X.LWn;
import X.LWo;
import X.MCN;
import X.RLE;
import X.RTm;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GoogleAuthController.class */
public final class GoogleAuthController {
    public LQp A00;
    public 9IO A01;
    public K2H A02;
    public final C4G7 A03;
    public final Kvv A04;
    public final boolean A05;

    public GoogleAuthController(Kvv kvv, boolean z) {
        11T.A0F(kvv, 1);
        this.A04 = kvv;
        this.A05 = z;
        this.A03 = new C4G6(0);
    }

    private final C2b6 A00(Context context, AuthorizationResult authorizationResult) {
        C14o th;
        JjV A0a;
        C2b6 c2b6;
        HttpURLConnection httpURLConnection;
        C2b0 c2b0 = new C2b0();
        try {
            String str = authorizationResult.A03;
            if (str == null) {
                c2b0.Cal(LWn.A00);
            } else if (authorizationResult.A04.contains("https://www.googleapis.com/auth/drive.appdata")) {
                11T.A0F(context, 0);
                LDn.A07(context, str);
                11T.A0F(str, 0);
                RTm rTm = new RTm(new C2p2(str));
                boolean z = false;
                C2b0 c2b02 = new C2b0();
                try {
                    try {
                        URLConnection openConnection = new URL("https://www.googleapis.com/oauth2/v1/userinfo").openConnection();
                        11T.A0I(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(false);
                        11T.A0B(Aam.A00);
                        String str2 = rTm.A00.A00;
                        str2.getClass();
                        httpURLConnection.setRequestProperty("Authorization", 0Pz.A0W("Bearer ", str2));
                        0fH.A0j("GoogleAuthApis", 0Pz.A0T("fetchAccountInfo: response code is ", httpURLConnection.getResponseCode()));
                        if (httpURLConnection.getResponseCode() == 200) {
                            z = true;
                        }
                    } catch (IOException e) {
                        e = e;
                        0fH.A0p("GoogleAuthApis", "fetchAccountInfo: failed to fetch account info", e);
                        c2b02.Cal(e);
                        throw 0Q8.createAndThrow();
                    } catch (JSONException e2) {
                        e = e2;
                        0fH.A0p("GoogleAuthApis", "fetchAccountInfo: failed to parse account info", e);
                        c2b02.Cal(e);
                        throw 0Q8.createAndThrow();
                    }
                } catch (C2az e3) {
                    A0a = JR1.A0a(c2b02, e3);
                } catch (Throwable th2) {
                    th = th2;
                    c2b02.A00();
                    KVT.A00(th);
                }
                try {
                    if (!z) {
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        11T.A0A(errorStream);
                        Reader inputStreamReader = new InputStreamReader(errorStream, C03r.A05);
                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        String A00 = C03t.A00(bufferedReader);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        c2b02.Cal(AnonymousClass001.A0G(0Pz.A0N(A00, ':', responseCode)));
                        th = 0Q8.createAndThrow();
                        throw th;
                    }
                    Reader inputStreamReader2 = new InputStreamReader((InputStream) 0J3.A00(httpURLConnection, -2108319039), C03r.A05);
                    BufferedReader bufferedReader2 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                    String A002 = C03t.A00(bufferedReader2);
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    JSONObject A1F = DKC.A1F(A002);
                    String string = A1F.getString("email");
                    String string2 = A1F.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    httpURLConnection.disconnect();
                    A0a = JR0.A0c(c2b02, new RLE(rTm, string, string2));
                    if (A0a instanceof JjV) {
                        new JjV(A0a.A00);
                    } else {
                        if (!(A0a instanceof C2b5)) {
                            th = 1BK.A1F();
                            throw th;
                        }
                        new C2b5(LWm.A00);
                    }
                    return JR0.A0c(c2b0, (RLE) c2b0.ABs(c2b6));
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        AnonymousClass127.A00("fetchAccountInfo: response code is ", th3);
                    }
                }
            } else {
                c2b0.Cal(LWl.A00);
            }
            th = 0Q8.createAndThrow();
            throw th;
        } catch (C2az e4) {
            return JR1.A0a(c2b0, e4);
        } catch (Throwable th5) {
            c2b0.A00();
            KVT.A00(th5);
            throw th5;
        }
    }

    public static final MCN A01(Status status) {
        LWo lWo;
        int i = status.A00;
        if (i == 5 || i == 16) {
            lWo = LWk.A00;
        } else {
            if (i != 12501) {
                return null;
            }
            lWo = LWo.A00;
        }
        return (MCN) lWo;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v7 ??, still in use, count: 2, list:
          (r314v7 ??) from 0x010b: PHI (r314v6 ??) = (r314v5 ??), (r314v7 ??) binds: [B:156:0x00f0, B:142:0x0106] A[DONT_GENERATE, DONT_INLINE]
          (r314v7 ?? I:X.4Ez) from 0x0108: INVOKE (r314v7 ?? I:X.4Ez), (r0v33 ?? I:java.lang.Object) VIRTUAL call: X.4Ez.A0C(java.lang.Object):void A[Catch: all -> 0x030a, 2az -> 0x0319, MD:(java.lang.Object):void (m)]
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
    public static final java.lang.Object A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v7 ??, still in use, count: 2, list:
          (r314v7 ??) from 0x010b: PHI (r314v6 ??) = (r314v5 ??), (r314v7 ??) binds: [B:156:0x00f0, B:142:0x0106] A[DONT_GENERATE, DONT_INLINE]
          (r314v7 ?? I:X.4Ez) from 0x0108: INVOKE (r314v7 ?? I:X.4Ez), (r0v33 ?? I:java.lang.Object) VIRTUAL call: X.4Ez.A0C(java.lang.Object):void A[Catch: all -> 0x030a, 2az -> 0x0319, MD:(java.lang.Object):void (m)]
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

    /* JADX WARN: Removed duplicated region for block: B:122:0x0221 A[Catch: 2az -> 0x0286, all -> 0x0318, TRY_ENTER, TRY_LEAVE, TryCatch #2 {2az -> 0x0286, all -> 0x0318, blocks: (B:13:0x00ac, B:15:0x00b4, B:16:0x00b8, B:16:0x00b8, B:18:0x00bd, B:19:0x00c2, B:20:0x00c7, B:20:0x00c7, B:23:0x00ce, B:24:0x00d3, B:24:0x00d3, B:26:0x00d8, B:28:0x00e4, B:30:0x00ee, B:32:0x00fa, B:36:0x0115, B:39:0x0121, B:42:0x012d, B:44:0x0139, B:48:0x0157, B:52:0x0165, B:55:0x0178, B:56:0x017f, B:57:0x0186, B:59:0x018d, B:61:0x0194, B:62:0x019b, B:64:0x01a4, B:93:0x01ba, B:94:0x01c1, B:95:0x01c8, B:96:0x01cf, B:98:0x01d6, B:99:0x01db, B:99:0x01db, B:102:0x01e2, B:103:0x0235, B:105:0x023c, B:107:0x01ea, B:108:0x01ef, B:110:0x01f6, B:112:0x0150, B:113:0x01fe, B:115:0x0205, B:116:0x020d, B:117:0x0212, B:119:0x0219, B:121:0x010e, B:122:0x0221, B:123:0x0226, B:125:0x022d), top: B:12:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[Catch: 2az -> 0x0286, all -> 0x0318, TRY_ENTER, TRY_LEAVE, TryCatch #2 {2az -> 0x0286, all -> 0x0318, blocks: (B:13:0x00ac, B:15:0x00b4, B:16:0x00b8, B:16:0x00b8, B:18:0x00bd, B:19:0x00c2, B:20:0x00c7, B:20:0x00c7, B:23:0x00ce, B:24:0x00d3, B:24:0x00d3, B:26:0x00d8, B:28:0x00e4, B:30:0x00ee, B:32:0x00fa, B:36:0x0115, B:39:0x0121, B:42:0x012d, B:44:0x0139, B:48:0x0157, B:52:0x0165, B:55:0x0178, B:56:0x017f, B:57:0x0186, B:59:0x018d, B:61:0x0194, B:62:0x019b, B:64:0x01a4, B:93:0x01ba, B:94:0x01c1, B:95:0x01c8, B:96:0x01cf, B:98:0x01d6, B:99:0x01db, B:99:0x01db, B:102:0x01e2, B:103:0x0235, B:105:0x023c, B:107:0x01ea, B:108:0x01ef, B:110:0x01f6, B:112:0x0150, B:113:0x01fe, B:115:0x0205, B:116:0x020d, B:117:0x0212, B:119:0x0219, B:121:0x010e, B:122:0x0221, B:123:0x0226, B:125:0x022d), top: B:12:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0280 -> B:11:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(androidx.fragment.app.FragmentActivity r301, X.C2b1 r302, X.MCM r303, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A03(androidx.fragment.app.FragmentActivity, X.2b1, X.MCM, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01ca -> B:13:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A04(androidx.fragment.app.FragmentActivity r301, X.C2b1 r302, X.MCM r303, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A04(androidx.fragment.app.FragmentActivity, X.2b1, X.MCM, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157 A[LOOP:0: B:31:0x0149->B:33:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.Lc8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A05(androidx.fragment.app.FragmentActivity r301, X.C2b1 r302, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r303, java.lang.String r304, X.0DR r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A05(androidx.fragment.app.FragmentActivity, X.2b1, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, java.lang.String, X.0DR, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A06(androidx.fragment.app.FragmentActivity r301, X.C2b1 r302, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r303, java.lang.String r304, X.0DR r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A06(androidx.fragment.app.FragmentActivity, X.2b1, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, java.lang.String, X.0DR, boolean):java.lang.Object");
    }

    private final Object A07(FragmentActivity fragmentActivity, C2b1 c2b1, String str, 0DR r305, boolean z) {
        0fH.A0j("GoogleAuthController", "startSignInFlow: start sign-in flow");
        0fH.A0j("GoogleAuthController", "isPlayServiceAvailable: Check Google Play Services availability");
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        11T.A0A(googleApiAvailability);
        int A04 = googleApiAvailability.A04(fragmentActivity, 12451000);
        if (A04 == 0) {
            0fH.A0j("GoogleAuthController", "isPlayServiceAvailable: success");
            return this.A05 ? A05(fragmentActivity, c2b1, this, str, r305, z) : A06(fragmentActivity, c2b1, this, str, r305, z);
        }
        AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
        if (A04 == 1 || A04 == 2 || A04 == 3 || A04 == 9) {
            0fH.A0j("GoogleAuthController", 0Pz.A0T("isPlayServiceAvailable: user-resolvable error ", A04));
            9IO r0 = this.A01;
            if (r0 != null) {
                GoogleDriveViewData.A08(r0.A00, "SETUP_WITH_GDRIVE_GPLAY_RECOVERABLE_ERROR", "RESTORE_WITH_GDRIVE_GPLAY_RECOVERABLE_ERROR");
            }
            if (this.A00 != null) {
                AKd aKd = new AKd(A04, 2, googleApiAvailability, fragmentActivity);
                11T.A0F(fragmentActivity, 0);
                9Eo.A00(Lifecycle.State.STARTED, fragmentActivity, 0DL.A00, new AJd(aKd, null, 33));
            }
        } else {
            0fH.A0j("GoogleAuthController", "isPlayServiceAvailable: unrecoverable error");
            9IO r02 = this.A01;
            if (r02 != null) {
                GoogleDriveViewData googleDriveViewData = r02.A00;
                GoogleDriveViewData.A08(googleDriveViewData, 7zK.A00(229), 7zK.A00(221));
                String str2 = (String) 7zN.A0r(9Fx.A01, A04);
                if (str2 == null) {
                    str2 = 7zK.A00(ActionId.FAIL_FILE_TOO_LARGE);
                }
                int ordinal = googleDriveViewData.A0K.flowType.ordinal();
                if (ordinal == 0) {
                    9YZ A00 = GoogleDriveViewData.A00(googleDriveViewData);
                    C9m2 c9m2 = (C9m2) 1Br.A0B(A00.A01);
                    C9m2.A02(c9m2, new GAc(A04, 8, c9m2));
                    Boolean bool = A00.A00;
                    if (bool == null) {
                        throw 1BK.A0h();
                    }
                    if (bool.booleanValue()) {
                        C9uq c9uq = (C9uq) 1Br.A0B(A00.A02);
                        C9uq.A00(c9uq).flowAnnotate(c9uq.A03, "GDRIVE_NO_SERVICE_ERROR_CODE", String.valueOf(A04));
                    }
                } else if (ordinal == 1) {
                    C9up A01 = GoogleDriveViewData.A01(googleDriveViewData);
                    C9up.A00(A01).flowAnnotate(A01.A02, "GDRIVE_NO_SERVICE_ERROR_CODE", String.valueOf(A04));
                }
                GoogleDriveViewData.A08(googleDriveViewData, str2, str2);
            }
        }
        c2b1.Cal(LWj.A00);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0261: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:114:0x0261 */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x0270: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:111:0x0270 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0228 A[Catch: all -> 0x025f, 2az -> 0x026e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {2az -> 0x026e, all -> 0x025f, blocks: (B:16:0x0205, B:18:0x020c, B:20:0x0218, B:22:0x021e, B:25:0x0228, B:27:0x023d, B:29:0x0244, B:35:0x01cf, B:38:0x01db, B:40:0x01e1, B:42:0x01eb, B:43:0x01f2, B:49:0x00d1, B:54:0x00e7, B:55:0x00ec, B:58:0x00f7, B:61:0x0102, B:63:0x0117, B:65:0x011d, B:67:0x0127, B:68:0x012c, B:68:0x012c, B:71:0x013b, B:73:0x0147, B:74:0x014c, B:74:0x014c, B:77:0x0156, B:80:0x0169, B:81:0x016e, B:83:0x0179, B:85:0x0180, B:86:0x0185, B:87:0x018a, B:87:0x018a, B:90:0x0195, B:92:0x019e, B:93:0x01a3, B:93:0x01a3, B:96:0x01ac, B:98:0x01b8, B:99:0x01bd, B:99:0x01bd, B:102:0x01c7, B:103:0x024a, B:105:0x0251, B:106:0x0257, B:106:0x0257, B:109:0x025e), top: B:7:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A08(androidx.fragment.app.FragmentActivity r301, X.MCM r302, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A08(androidx.fragment.app.FragmentActivity, X.MCM, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(2:9|(3:11|12|13)(2:58|59))(12:60|61|62|63|64|65|66|67|68|(1:70)|71|72)|14|15|16|17|18))|81|6|7|(0)(0)|14|15|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ae, code lost:
    
        r312 = X.JR1.A0a(r315, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        r315.A00();
        X.KVT.A00(r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        throw r312;
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r315v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x019f: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x019f */
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x01ae: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:77:0x01ae */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184 A[Catch: all -> 0x019d, 2az -> 0x01ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x01ac, all -> 0x019d, blocks: (B:17:0x00de, B:22:0x00ef, B:24:0x0102, B:31:0x012b, B:32:0x0132, B:33:0x0139, B:35:0x0140, B:38:0x014a, B:40:0x0151, B:42:0x0158, B:43:0x0160, B:43:0x0160, B:46:0x0167, B:50:0x0174, B:52:0x019c, B:53:0x017c, B:54:0x0184, B:55:0x018b, B:57:0x0192), top: B:7:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A09(androidx.fragment.app.FragmentActivity r302, java.lang.String r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A09(androidx.fragment.app.FragmentActivity, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(2:9|(3:11|12|13)(2:58|59))(12:60|61|62|63|64|65|66|67|68|(1:70)|71|72)|14|15|16|17|18))|81|6|7|(0)(0)|14|15|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b2, code lost:
    
        r311 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b4, code lost:
    
        r312 = X.JR1.A0a(r313, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a3, code lost:
    
        r311 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a5, code lost:
    
        r313.A00();
        X.KVT.A00(r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b1, code lost:
    
        throw r311;
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:697)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:697)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 313, insn: 0x01a5: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x01a5 */
    /* JADX WARN: Not initialized variable reg: 313, insn: 0x01b4: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:77:0x01b4 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a A[Catch: all -> 0x01a3, 2az -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x01b2, all -> 0x01a3, blocks: (B:17:0x00e4, B:22:0x00f5, B:24:0x0108, B:31:0x0131, B:32:0x0138, B:33:0x013f, B:35:0x0146, B:38:0x0150, B:40:0x0157, B:42:0x015e, B:43:0x0166, B:43:0x0166, B:46:0x016d, B:50:0x017a, B:52:0x01a2, B:53:0x0182, B:54:0x018a, B:55:0x0191, B:57:0x0198), top: B:7:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0A(androidx.fragment.app.FragmentActivity r302, X.0DR r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A0A(androidx.fragment.app.FragmentActivity, X.0DR, boolean):java.lang.Object");
    }

    public final void A0B(FragmentActivity fragmentActivity, Lifecycle lifecycle, 9IO r304, String str, 2aI r306) {
        7zR.A1O(lifecycle, r304);
        0fH.A0j("GoogleAuthController", "init()");
        this.A01 = r304;
        LQp lQp = new LQp(fragmentActivity.activityResultRegistry, str, new AQb(this, 43), r306, this.A03);
        lifecycle.addObserver(lQp);
        this.A00 = lQp;
    }
}
