package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.secure.intentswitchoff.ActivityIntentSwitchOffDI;
import com.facebook.systrace.Systrace;
import com.google.common.base.Throwables;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.06t, reason: invalid class name */
/* loaded from: 06t.class */
public final class C06t extends C06u implements C06v, C1em, C00g {
    public static final /* synthetic */ C06z[] A0T = {new C06w(C06t.class, "startOpDispatcher", "getStartOpDispatcher()Lcom/facebook/startup/operations/StartOpDispatcher;", 0), new C06w(C06t.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0), new C06w(C06t.class, "adminIdMobileConfig", "getAdminIdMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0), new C06w(C06t.class, "unexpectedEventReporter", "getUnexpectedEventReporter()Lcom/facebook/telemetry/ueinterface/UnexpectedEventReporter;", 0), new C06w(C06t.class, "layoutBuilderLookup", "getLayoutBuilderLookup()Lcom/facebook/codelayouts/LayoutBuilderLookup;", 0), new C06w(C06t.class, "codeLayoutExperiments", "getCodeLayoutExperiments()Lcom/facebook/codelayouts/CodeLayoutExperiments;", 0), new C06w(C06t.class, "layoutCache", "getLayoutCache()Lcom/facebook/codelayouts/LayoutCache;", 0), new C06w(C06t.class, "errorReporter", "getErrorReporter()Lcom/facebook/common/errorreporting/FbErrorReporter;", 0), new C06w(C06t.class, "activityIntentSwitchOffDI", "getActivityIntentSwitchOffDI()Lcom/facebook/secure/intentswitchoff/ActivityIntentSwitchOffDI;", 0), new C06w(C06t.class, "annotationCache", "getAnnotationCache()Lcom/facebook/common/annotationcache/AnnotationCache;", 0), new C06w(C06t.class, "_navigationObserver", "get_navigationObserver()Lcom/facebook/hierarchicalsessions/observer/NavigationObserver;", 0), new C06w(C06t.class, "resetRestoreDecisionManager", "getResetRestoreDecisionManager()Lcom/facebook/katana/activity/starttodefault/staterestoration/ResetRestoreDecisionManager;", 0)};
    public long A00;
    public LayoutInflater A01;
    public L8q A02;
    public boolean A03;
    public 1gG A04;
    public C00i A05;
    public C00i A06;
    public 1Ih A07;
    public 53V A08;
    public Set A09;
    public Set A0A;
    public Set A0B;
    public boolean A0C;
    public boolean A0D;
    public final C00i A0E;
    public final FbFragmentActivity A0F;
    public final 1Br A0Q;
    public final Set A0S = new LinkedHashSet();
    public final 1Br A0O = 1Bq.A00(16385);
    public final 1Br A0I = 1Bq.A00(16387);
    public final 1Br A0R = 1Bu.A00(16669);
    public final 1Br A0M = 1Bq.A00(294);
    public final 1Br A0K = 1Bq.A00(66183);
    public final 1Br A0N = 1Bq.A00(115405);
    public final 1Br A0L = 1Bq.A00(16511);
    public final 1Br A0H = 1Bq.A00(9);
    public final 1Br A0J = 1Bq.A00(99365);
    public final 1Br A0G = 1Bq.A00(66206);
    public final 1Br A0P = 1Bu.A00(100131);

    public C06t(FbFragmentActivity fbFragmentActivity) {
        this.A0F = fbFragmentActivity;
        this.A0Q = 1HG.A00(fbFragmentActivity, 16755);
        this.A0E = 1HG.A00(fbFragmentActivity, 66357);
    }

    private final L2N A01() {
        return (L2N) this.A0J.A0F();
    }

    private final C01s A02() {
        return (C01s) this.A0L.A0F();
    }

    private final 1lX A03() {
        return (1lX) this.A0G.A0F();
    }

    private final DKV A04() {
        return (DKV) this.A0P.A0F();
    }

    private final 1CO A05() {
        return (1CO) this.A0I.A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final 1CO A06() {
        return (1CO) this.A0O.A0F();
    }

    private final ActivityIntentSwitchOffDI A08() {
        return (ActivityIntentSwitchOffDI) this.A0H.A0F();
    }

    private final C1fy A09() {
        return (C1fy) this.A0Q.A0F();
    }

    private final AnonymousClass046 A0A() {
        return (AnonymousClass046) this.A0R.A0F();
    }

    public static void A0E() {
        11T.A0L("_listenerDispatcher");
        throw 0Q8.createAndThrow();
    }

    private final void A0F() {
        this.A0M.A0F();
    }

    public static final void A0G(Context context, Throwable th, int i) {
        Throwables.throwIfInstanceOf(th, AI9.class);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\n            \n            Failed inflating resource: ");
        A0k.append(i);
        A0k.append("\n            With Resource Name: ");
        A0k.append(context.getResources().getResourceName(i));
        String stackTraceString = android.util.Log.getStackTraceString(th);
        11T.A0A(stackTraceString);
        A0k.append(0CU.A0T(stackTraceString, "line #-1 (sorry, not yet implemented)", false) ? "\n  TESTING NOTE:  If you receive this error in a test, you might not have a theme set on the activity.  This can be set in the testing manifest or by adding a call to setTheme(R.style.Theme_FBUi) when creating the activity" : "");
        A0k.append("\n  Original Throwable: ");
        A0k.append(android.util.Log.getStackTraceString(th));
        RuntimeException runtimeException = new RuntimeException(0Cc.A0j(AnonymousClass001.A0d("\n            ", A0k)));
        runtimeException.initCause(th);
        throw runtimeException;
    }

    private final void A0H(FbUserSession fbUserSession, Context context) {
        11T.A0F(fbUserSession, 0);
        this.A09 = 1Bq.A02(66);
        this.A0B = 1Bu.A07(295);
        FbFragmentActivity fbFragmentActivity = this.A0F;
        this.A0A = 1Lm.A08(fbFragmentActivity, fbUserSession, 127);
        this.A05 = 1Lm.A00(fbFragmentActivity, fbUserSession, 16757);
        1Ih r306 = (1Ih) 1Bq.A01(67196);
        if (A0M()) {
            r306 = r306.A00(context);
        }
        this.A07 = r306;
        if (r306 == null) {
            11T.A0L("fbResources");
            throw 0Q8.createAndThrow();
        }
        this.A06 = 1Bu.A00(66371);
        this.A04 = (1gG) 1Bu.A06(fbFragmentActivity, 65790);
    }

    public static final void A0J(ReqContext reqContext) {
        if (reqContext != null) {
            reqContext.close();
            1EK.A03();
        }
    }

    private final void A0K(String str) {
        if (Looper.getMainLooper().isCurrentThread()) {
            return;
        }
        AnonymousClass047 ACu = A0A().ACu("activity", 817903748);
        ACu.A8K("method", str);
        ACu.Cmr(new IllegalStateException(0Pz.A0j("Android Activity.", str, " called off main thread")));
        ACu.report();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r301.A0F.A36() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0L() {
        /*
            r301 = this;
            r0 = r301
            X.1CO r0 = r0.A06()
            r302 = r0
            r0 = 36322559897126553(0x810b2d00004699, double:3.0338713659274014E-306)
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r301
            com.facebook.base.activity.FbFragmentActivity r0 = r0.A0F
            r306 = r0
            r0 = r306
            boolean r0 = r0.A36()
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L32
        L2c:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06t.A0L():boolean");
    }

    private final boolean A0M() {
        FbFragmentActivity fbFragmentActivity = this.A0F;
        if (!(fbFragmentActivity instanceof 1gF)) {
            return false;
        }
        11T.A0I(fbFragmentActivity, "null cannot be cast to non-null type com.facebook.common.pictureinpicture.PictureInPicture");
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 8, list:
          (r311v0 ??) from 0x0041: PHI (r311v2 ??) = (r311v0 ??), (r311v0 ??), (r311v3 ??) binds: [B:104:0x0221, B:105:0x0229, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ??) from 0x0041: PHI (r311v2 ??) = (r311v0 ??), (r311v0 ??), (r311v3 ??) binds: [B:104:0x0221, B:105:0x0229, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0157: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v51 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0164: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v54 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x017c: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v60 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0189: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v63 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x01b3: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r1v11 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x01c0: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v70 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
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
    public static final boolean A0N(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 8, list:
          (r311v0 ??) from 0x0041: PHI (r311v2 ??) = (r311v0 ??), (r311v0 ??), (r311v3 ??) binds: [B:104:0x0221, B:105:0x0229, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ??) from 0x0041: PHI (r311v2 ??) = (r311v0 ??), (r311v0 ??), (r311v3 ??) binds: [B:104:0x0221, B:105:0x0229, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0157: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v51 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0164: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v54 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x017c: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v60 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x0189: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v63 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x01b3: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r1v11 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r311v0 ?? I:java.lang.StringBuilder) from 0x01c0: INVOKE (r311v0 ?? I:java.lang.StringBuilder), (r0v70 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: SecurityException -> 0x0234, NameNotFoundException -> 0x0253, IllegalArgumentException -> 0x026d, MD:(java.lang.String):java.lang.StringBuilder (c)]
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

    public final 1gG A0R() {
        1gG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        A0E();
        throw 0Q8.createAndThrow();
    }

    public final C09q A0S() {
        return new C09q(this);
    }

    public final C1oh A0T() {
        Object obj = this.A0E.get();
        11T.A0A(obj);
        return (C1oh) obj;
    }

    public final ReqContext A0U() {
        1iF A2g = this.A0F.A2g();
        if (1iF.A00(A2g) == 0) {
            return null;
        }
        1EK.A09("FbFragmentActivity", 1iF.A01(A2g));
        return AnonymousClass018.A04("FbFragmentActivity", ReqContextTypeResolver.resolveName("ui_components"));
    }

    public final 1lX A0V() {
        return A03();
    }

    public final C1gj A0W() {
        C00i c00i = this.A05;
        if (c00i == null) {
            11T.A0L("_themePreferences");
            throw 0Q8.createAndThrow();
        }
        Object obj = c00i.get();
        11T.A0A(obj);
        return (C1gj) obj;
    }

    public final Set A0X() {
        return this.A0S;
    }

    public final void A0Y() {
        C00i c00i = this.A06;
        if (c00i == null) {
            11T.A0L("disposableContextHelper");
            throw 0Q8.createAndThrow();
        }
        ((2CP) c00i.get()).A00();
    }

    public final void A0Z() {
        this.A00 = -1;
        if (((2yD) 1Bq.A01(16385)).AZk(36314133171412507L)) {
            try {
                FbFragmentActivity fbFragmentActivity = this.A0F;
                Intent intent = fbFragmentActivity.getIntent();
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    11T.A0D(extras);
                    extras.setClassLoader(getClass().getClassLoader());
                    5Tp A02 = 5Tf.A02(fbFragmentActivity, intent);
                    if (A02 != null) {
                        L8q l8q = new L8q(1Bu.A00(16669));
                        l8q.A05(fbFragmentActivity, A02, A02.A0B());
                        this.A02 = l8q;
                        this.A00 = ((C0dr) 1Bq.A01(84488)).now();
                    }
                }
            } catch (2LN unused) {
            } catch (BadParcelableException e) {
                C01s c01s = (C01s) 1Bq.A01(16511);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                c01s.D0v("FbFragmentActivity", message);
            }
        }
    }

    public final void A0a() {
        Resources B7l = super.B7l();
        11T.A0A(B7l);
        1Ih r0 = this.A07;
        if (r0 == null) {
            11T.A0L("fbResources");
            throw 0Q8.createAndThrow();
        }
        r0.A03(B7l.getConfiguration(), B7l.getDisplayMetrics());
    }

    public final void A0b(final int i) {
        C1oi.A01(this.A0F, new Runnable() { // from class: X.09r
            public static final String __redex_internal_original_name = "FbFragmentActivityImpl$forceSetRequestedOrientationInternal$1";

            @Override // java.lang.Runnable
            public final void run() {
                super/*X.06u*/.Cu1(i);
            }
        });
    }

    public final void A0c(53V r302) {
        this.A08 = r302;
    }

    public final boolean A0d() {
        return this.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (A05().AZk(72339910829214154L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0e(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.A0f(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r301
            X.1CO r0 = r0.A05()
            r304 = r0
            r0 = 72339910829214154(0x10100c4000f09ca, double:7.748180005112562E-304)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 != 0) goto L27
        L25:
            r0 = 0
            r303 = r0
        L27:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06t.A0e(android.os.Bundle):boolean");
    }

    public final boolean A0f(Bundle bundle) {
        FbFragmentActivity fbFragmentActivity = this.A0F;
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        return A04().A00(fbFragmentActivity, bundle);
    }

    @Override // X.C06u, X.C1en
    public void A5D(1gM r302) {
        11T.A0F(r302, 0);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0X(r302);
    }

    @Override // X.C06u, X.C06v
    public void AAx(Context context) {
        C1fy A09 = A09();
        C1g1 A01 = C1g0.A01();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        C1gA A03 = A09.A03(fbFragmentActivity, A01);
        A03.A03("call_delegate_on_base_context_attached");
        fbFragmentActivity.A2w(context);
        A03.A03("inject_fields");
        A0H(1Fw.A04((1EZ) 1Bu.A06(context, 16428)), context);
        A03.A03("update_resources");
        A0a();
        A03.A01();
    }

    @Override // X.C06u, X.C06v
    public void AT5(Activity activity) {
        super.AT5(activity);
    }

    @Override // X.C06u, X.C06v
    public Object Ari(Class cls) {
        if (cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // X.C06u, X.C06v
    public LayoutInflater AtU() {
        LayoutInflater AtU = super.AtU();
        11T.A0A(AtU);
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater == null) {
            A0F();
            this.A01 = AtU;
            layoutInflater = AtU;
        }
        11T.A0D(layoutInflater);
        return layoutInflater;
    }

    @Override // X.C06u, X.C06v
    public MenuInflater Awc() {
        MenuInflater Awc = super.Awc();
        11T.A0A(Awc);
        return Awc;
    }

    @Override // X.C06u, X.C06v
    public View B0T(int i) {
        A0K("getOptionalView(id)");
        FbFragmentActivity fbFragmentActivity = this.A0F;
        C0k4.A00(fbFragmentActivity);
        return fbFragmentActivity.findViewById(i);
    }

    @Override // X.C06u, X.C06v
    public Resources B7l() {
        Resources resources = this.A07;
        if (resources != null) {
            return resources;
        }
        11T.A0L("fbResources");
        throw 0Q8.createAndThrow();
    }

    @Override // X.C06u, X.C1em, X.C06v
    public 06Z BDe() {
        06Z BDe = super.BDe();
        11T.A0A(BDe);
        return BDe;
    }

    @Override // X.C06u, X.C06v
    public Object BE6(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.BE6(str);
        }
        LayoutInflater layoutInflater = (LayoutInflater) super.BE6("layout_inflater");
        if (layoutInflater == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        LayoutInflater layoutInflater2 = this.A01;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        A0F();
        this.A01 = layoutInflater;
        return layoutInflater;
    }

    @Override // X.C06u, X.C06v
    public View BJx(int i) {
        A0K("getView(id)");
        return C09s.A00(this.A0F, i);
    }

    @Override // X.C06u, X.C06v
    public boolean BMe(Throwable th) {
        1gG r0 = this.A04;
        if (r0 != null) {
            return r0.A0g(th);
        }
        A0E();
        throw 0Q8.createAndThrow();
    }

    @Override // X.C06u, X.C06v
    public void Bhh(Bundle bundle) {
    }

    @Override // X.C06u, X.C06v
    public void Bhl(Intent intent) {
        this.A03 = true;
        A02().D0v("onActivityNewIntent", getClass().getName());
    }

    @Override // X.C06u, X.C06v
    public void Bhn() {
    }

    @Override // X.C06u, X.C06v
    public void BjK(Resources.Theme theme, int i, boolean z) {
        String str;
        super.BjK(theme, i, z);
        1gG r0 = this.A04;
        if (r0 == null) {
            str = "_listenerDispatcher";
        } else {
            FbFragmentActivity fbFragmentActivity = this.A0F;
            r0.A0O(fbFragmentActivity, theme, i, z);
            C00i c00i = this.A05;
            if (c00i != null) {
                C1gj c1gj = (C1gj) c00i.get();
                int intValue = fbFragmentActivity.A2h().intValue();
                boolean A06 = intValue != 2 ? intValue != 1 ? c1gj.A06() : true : false;
                Resources[] resourcesArr = {fbFragmentActivity.getApplicationContext().getResources(), super.B7l(), fbFragmentActivity.getResources()};
                c1gj.A04(theme, A06);
                c1gj.A03(fbFragmentActivity.getApplicationContext().getTheme());
                fbFragmentActivity.A35(A06);
                return;
            }
            str = "_themePreferences";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.C06u, X.C06v
    public void Bjb(Fragment fragment) {
        super.Bjb(fragment);
        Set set = this.A0S;
        String name = fragment.getClass().getName();
        11T.A0A(name);
        set.add(name);
        0fH.A0d(name, getClass(), "FbFragmentActivity", "Fragment %s is attaching to %s");
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0W(fragment);
    }

    @Override // X.C06u, X.C06v
    public void Bkf() {
    }

    @Override // X.C06u, X.C06v
    public void Bl1(Bundle bundle) {
    }

    @Override // X.C06u, X.C06v
    public void Bl3(Bundle bundle) {
    }

    @Override // X.C06u, X.C06v
    public void BlM(Bundle bundle) {
    }

    @Override // X.C06u, X.C06v
    public boolean BrS(MenuItem menuItem) {
        return super.BrS(menuItem);
    }

    @Override // X.C06u, X.C06v
    public Dialog Brp(int i) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0J(i);
        Dialog Brp = super.Brp(i);
        11T.A0A(Brp);
        return Brp;
    }

    @Override // X.C06u, X.C06v
    public boolean Brv(Menu menu) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0U(menu);
        return super.Brv(menu);
    }

    @Override // X.C06u, X.C06v
    public void C8v(Intent intent) {
        ActivityIntentSwitchOffDI A08 = A08();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        ActivityIntentSwitchOffDI.A02(fbFragmentActivity, intent, A08);
        A08.A03(fbFragmentActivity, intent, null, fbFragmentActivity);
        super.C8v(intent);
        if (!fbFragmentActivity.isFinishing() || A01().A00(getClass())) {
            1gG r0 = this.A04;
            if (r0 == null) {
                A0E();
                throw 0Q8.createAndThrow();
            }
            r0.A0P(intent);
            this.A03 = false;
            fbFragmentActivity.A2x(intent);
            if (!this.A03) {
                throw AnonymousClass001.A0N("onActivityNewIntent didn't call super.onActivityNewIntent()");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (super.CAH(r302) != false) goto L10;
     */
    @Override // X.C06u, X.C06v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CAH(android.view.MenuItem r302) {
        /*
            r301 = this;
            r0 = r301
            X.1gG r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L10
            A0E()
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L10:
            r0 = r303
            r1 = r302
            boolean r0 = r0.A0f(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2a
            r0 = r301
            r1 = r302
            boolean r0 = super.CAH(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            r304 = r0
        L2c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06t.CAH(android.view.MenuItem):boolean");
    }

    @Override // X.C06u, X.C06v
    public void CBj(boolean z, Configuration configuration) {
        super.CBj(z, configuration);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0b(z, configuration);
    }

    @Override // X.C06u, X.C06v
    public void CCw(Bundle bundle) {
        A09().A06(this.A0F, bundle, C1g0.A05());
    }

    @Override // X.C06u, X.C06v
    public void CD1() {
        super.CD1();
        6QM A2d = this.A0F.A2d();
        if (A2d != null) {
            A2d.A0O();
        }
    }

    @Override // X.C06u, X.C06v
    public void CDI(int i, Dialog dialog) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0M(i, dialog);
        super.CDI(i, dialog);
    }

    @Override // X.C06u, X.C06v
    public boolean CDS(Menu menu) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0V(menu);
        return super.CDS(menu);
    }

    @Override // X.C06u, X.C06v
    public void CH2(int i, String[] strArr, int[] iArr) {
        super.CH2(i, strArr, iArr);
        53V r0 = this.A08;
        if (r0 != null) {
            r0.A00(i, strArr, iArr);
        }
    }

    @Override // X.C06u, X.C06v
    public void CHt() {
        ReqContext A0U = A0U();
        try {
            super.CHt();
            1gG r0 = this.A04;
            if (r0 == null) {
                A0E();
                throw 0Q8.createAndThrow();
            }
            r0.A0D();
        } finally {
            A0J(A0U);
        }
    }

    @Override // X.C06u, X.C06v
    public void CQk(CharSequence charSequence, int i) {
        super.CQk(charSequence, i);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0Z(charSequence, i);
    }

    @Override // X.C06u, X.C06v
    public void CTH() {
        super.CTH();
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0H();
    }

    @Override // X.C06u, X.C06v
    public void CTK() {
        super.CTK();
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0I();
    }

    @Override // X.C06u, X.C06v
    public void Cbh() {
        this.A0D = true;
        super.Cbh();
    }

    @Override // X.C06u, X.C06v
    public void CcH(1IG r302) {
        C00i c00i = this.A06;
        if (c00i == null) {
            11T.A0L("disposableContextHelper");
            throw 0Q8.createAndThrow();
        }
        ((2CP) c00i.get()).A01(r302);
    }

    @Override // X.C06u, X.C1en
    public void Cdt(1gM r302) {
        11T.A0F(r302, 0);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0Y(r302);
    }

    @Override // X.C06u, X.C06v
    public void CnO(int i) {
        boolean A0E = Systrace.A0E(32);
        if (A0E) {
            C00j.A07("setContentView(%s)", Long.toHexString(i), -586213552);
        }
        try {
            try {
                super.CnO(i);
                if (A0E) {
                    C00j.A01(-50817784);
                }
            } catch (RuntimeException e) {
                A0G(this.A0F, e, i);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (A0E) {
                C00j.A01(141680551);
            }
            throw th;
        }
    }

    @Override // X.C06u, X.C06v
    public void Cq2(Intent intent) {
        A0K("setIntent()");
        super.Cq2(intent);
    }

    @Override // X.C06u, X.C06v
    public void Cu1(int i) {
        if (((C1oh) this.A0E.get()).A02(this.A0F.A2j().get())) {
            A0b(i);
        }
    }

    @Override // X.C06u, X.C06v
    public boolean CyH(03Y r302) {
        return false;
    }

    @Override // X.C06u, X.C06v
    public void D1P(Intent intent) {
        super.D1P(intent);
        A0K("startActivity(intent)");
    }

    @Override // X.C06u, X.C06v
    public void D1Q(Intent intent, Bundle bundle) {
        super.D1Q(intent, bundle);
        A0K("startActivity(intent, options)");
    }

    @Override // X.C06u, X.C06v
    public void D1R(Intent intent, int i, Bundle bundle) {
        String className;
        A0K("startActivityForResult");
        try {
            super.D1R(intent, i, bundle);
        } catch (ActivityNotFoundException e) {
            if (intent.hasExtra("expect_activity_not_found")) {
                throw e;
            }
            ComponentName component = intent.getComponent();
            if (component == null) {
                A02().softReport("FbFragmentActivity", "failed component was null", e);
            } else if (A0N(this.A0F, e, component)) {
                D1R(intent, i, bundle);
            }
        } catch (SecurityException e2) {
            if (!A05().AZk(72339910828755399L)) {
                throw e2;
            }
            C01s A02 = A02();
            if (intent.getComponent() == null) {
                className = "";
            } else {
                ComponentName component2 = intent.getComponent();
                11T.A0D(component2);
                className = component2.getClassName();
                11T.A0A(className);
            }
            String action = intent.getAction();
            if (action == null) {
                action = "null";
            }
            A02.softReport("FbFragmentActivity", 0Pz.A0z("Failed to start intent with classname: ", className, " and action: ", action, " due to security violation."), e2);
        }
    }

    @Override // X.C06u, X.C06v
    public boolean D3g() {
        return false;
    }

    @Override // X.C06u, X.C06v
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // X.C06u, X.C06v
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C06u, X.C06v
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1gA A02 = A09().A02(this.A0F, motionEvent, C1g0.A00());
        boolean AZk = A06().AZk(36324690203463607L);
        A02.A02(0Hc.A00, "start_tracing_dispatch_touch_event", false);
        try {
            A02.A02(new 0Hd(motionEvent, this), "dispatch_touch_event_listeners", AZk);
            A02.A02(new 0He(motionEvent, this), "dispatch_unscoped_touch_event_listeners", AZk);
            A02.A02(new 0Hf(motionEvent, this), "dispatch_user_scoped_touch_event_listeners", AZk);
            A02.A02(new 0Hg(motionEvent), "dispatch_touch_up_listener", AZk);
            A02.A02(0Hh.A00, "stop_tracing_dispatch_touch_event", false);
            try {
                try {
                    A02.A03("call_super_dispatch_touch_event");
                    return super.dispatchTouchEvent(motionEvent);
                } catch (IllegalArgumentException e) {
                    String message = e.getMessage();
                    if (message == null || message.length() == 0 || !("pointerIndex out of range".equals(message) || 11T.A0P("invalid pointerIndex -1 for MotionEvent", 1, message))) {
                        throw e;
                    }
                    ((C01s) 1Bq.A01(16511)).softReport("FbFragmentActivity", e);
                    A02.A01();
                    return false;
                }
            } finally {
                A02.A01();
            }
        } catch (Throwable th) {
            A02.A02(0Hh.A00, "stop_tracing_dispatch_touch_event", false);
            throw th;
        }
    }

    @Override // X.C06u, X.C06v
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (FIb.A04(printWriter, str, strArr)) {
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // X.C06u, X.C06v
    public void finish() {
        super.finish();
        A0K("finish");
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A07();
        1lX A0V = A0V();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        A0V.A01(fbFragmentActivity);
        1lZ.A01(fbFragmentActivity, fbFragmentActivity.getIntent());
    }

    @Override // X.C06u, X.C00g
    public Context getContext() {
        return this.A0F;
    }

    @Override // X.C06u, X.C06v
    public Intent getIntent() {
        A0K("getIntent()");
        Intent intent = super.getIntent();
        11T.A0A(intent);
        return intent;
    }

    @Override // X.C06u, X.C06v
    public void onActivityDestroy() {
    }

    @Override // X.C06u, X.C06v
    public void onActivityResult(int i, int i2, Intent intent) {
        ReqContext A0U = A0U();
        try {
            super.onActivityResult(i, i2, intent);
            1gG r0 = this.A04;
            if (r0 == null) {
                A0E();
                throw 0Q8.createAndThrow();
            }
            r0.A0L(i, i2, intent);
        } finally {
            A0J(A0U);
        }
    }

    @Override // X.C06u, X.C06v
    public void onBackPressed() {
        FbFragmentActivity fbFragmentActivity = this.A0F;
        if (C0D1.A01(fbFragmentActivity.BDe())) {
            ReqContext A0U = A0U();
            try {
                1gG r0 = this.A04;
                if (r0 == null) {
                    A0E();
                    throw 0Q8.createAndThrow();
                }
                if (!r0.A0c()) {
                    fbFragmentActivity.A2n();
                    super.onBackPressed();
                }
                ((C2ip) 1Bq.A01(17081)).A00();
            } finally {
                A0J(A0U);
            }
        }
    }

    @Override // X.C06u, X.C06v
    public void onConfigurationChanged(Configuration configuration) {
        A0a();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        1jW.A04(fbFragmentActivity);
        super.onConfigurationChanged(configuration);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0Q(configuration);
        6QM A2d = fbFragmentActivity.A2d();
        if (A2d != null) {
            A2d.A0K();
        }
    }

    @Override // X.C06u, X.C06v
    public void onContentChanged() {
        super.onContentChanged();
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A09();
    }

    @Override // X.C06u, X.C06v
    public void onCreate(Bundle bundle) {
        C1fy A09 = A09();
        C1g1 A02 = C1g0.A02();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        C1gA A01 = A09.A01(fbFragmentActivity, bundle, A02);
        A01.A03("activity_perform_injections");
        fbFragmentActivity.A2m();
        A01.A03("fb_activity_listener_before_super_on_create");
        1gG r0 = this.A04;
        if (r0 != null) {
            r0.A0N(fbFragmentActivity);
            boolean A0e = r0.A0e(bundle);
            A01.A03("maybe_finish_oncreate_early_on_activity_finish");
            if (!A0e) {
                A01.A03("fb_activity_listener_before_activity_create");
                1gG r02 = this.A04;
                if (r02 != null) {
                    if (!r02.A0d(bundle)) {
                        A01.A01();
                        return;
                    }
                }
            }
            this.A0C = true;
            return;
        }
        11T.A0L("_listenerDispatcher");
        throw 0Q8.createAndThrow();
    }

    @Override // X.C06u, X.C06v
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // X.C06u, X.C06v
    public void onDestroy() {
        A09().A07(this.A0F, C1g0.A03());
    }

    @Override // X.C06u, X.C06v
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        Boolean A05 = r0.A05(keyEvent, i);
        return A05 != null ? A05.booleanValue() : super.onKeyDown(i, keyEvent);
    }

    @Override // X.C06u, X.C06v
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0T(keyEvent, i);
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // X.C06u, X.C06v
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        Boolean A06 = r0.A06(keyEvent, i);
        return A06 != null ? A06.booleanValue() : super.onKeyUp(i, keyEvent);
    }

    @Override // X.C06u, X.C06v
    public void onPause() {
        A09().A07(this.A0F, C1g0.A04());
    }

    @Override // X.C06u, X.C06v
    public void onResume() {
        C1fy A09 = A09();
        C1g1 A06 = C1g0.A06();
        FbFragmentActivity fbFragmentActivity = this.A0F;
        C1gA A03 = A09.A03(fbFragmentActivity, A06);
        A03.A03("recreate_if_window_size_changed");
        03Y A2k = fbFragmentActivity.A2k();
        if (A2k == null || !fbFragmentActivity.A3A(A2k)) {
            A03.A01();
        } else {
            0fH.A0n("FbFragmentActivity", "onResume - recreating the activity due to window size changes");
            fbFragmentActivity.recreate();
        }
    }

    @Override // X.C06u, X.C06v
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("attached_fragment_names", new ArrayList<>(this.A0S));
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0S(bundle);
        bundle.putInt("fb_fragment_activity_sentinel", 1);
        bundle.putBoolean("is_recreating", this.A0D);
    }

    @Override // X.C06u, X.C06v
    public boolean onSearchRequested() {
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0E();
        return super.onSearchRequested();
    }

    @Override // X.C06u, X.C06v
    public void onStart() {
        A09().A07(this.A0F, C1g0.A07());
    }

    @Override // X.C06u, X.C06v
    public void onStop() {
        A09().A07(this.A0F, C1g0.A08());
    }

    @Override // X.C06u, X.C06v
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0K(i);
    }

    @Override // X.C06u, X.C06v
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        1gG r0 = this.A04;
        if (r0 == null) {
            A0E();
            throw 0Q8.createAndThrow();
        }
        r0.A0a(z);
    }

    @Override // X.C06u, X.C06v
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        A0K("startActivityForResult(intent, requestCode)");
    }
}
