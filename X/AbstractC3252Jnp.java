package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewStructure;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jnp, reason: case insensitive filesystem */
/* loaded from: Jnp.class */
public abstract class AbstractC3252Jnp extends KTE implements MCB {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public Intent A0A;
    public KeC A0B;
    public KlP A0C;
    public KeE A0D;
    public BrowserLiteWebChromeClient A0E;
    public KTX A0F;
    public MK3 A0G;
    public MK3 A0H;
    public Kk8 A0I;
    public MCB A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Integer A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v4 ??, still in use, count: 6, list:
          (r314v4 ??) from 0x00f0: PHI (r314v2 ??) = (r314v0 ??), (r314v4 ??) binds: [B:66:0x00ed, B:46:0x0099] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ??) from 0x00ae: PHI (r314v3 ??) = (r314v1 ??), (r314v4 ??), (r314v4 ??) binds: [B:64:0x00a8, B:45:0x00a0, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ??) from 0x00ae: PHI (r314v3 ??) = (r314v1 ??), (r314v4 ??), (r314v4 ??) binds: [B:64:0x00a8, B:45:0x00a0, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ?? I:java.io.OutputStream) from 0x006d: INVOKE 
          (r315v4 ?? I:android.graphics.Bitmap)
          (r301v0 ?? I:android.graphics.Bitmap$CompressFormat)
          (r0v49 ?? I:int)
          (r314v4 ?? I:java.io.OutputStream)
         VIRTUAL call: android.graphics.Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean A[Catch: IOException -> 0x0094, all -> 0x00e2, MD:(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean (c)]
          (r314v4 ?? I:java.io.OutputStream) from 0x0073: INVOKE (r314v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.flush():void A[Catch: IOException -> 0x0094, all -> 0x00e2, MD:():void throws java.io.IOException (c)]
          (r314v4 ?? I:java.io.OutputStream) from 0x007d: INVOKE (r314v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: IOException -> 0x0083, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 315, insn: 0x00e4: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r315 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:62:0x00e4 */
    public static java.io.File A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v4 ??, still in use, count: 6, list:
          (r314v4 ??) from 0x00f0: PHI (r314v2 ??) = (r314v0 ??), (r314v4 ??) binds: [B:66:0x00ed, B:46:0x0099] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ??) from 0x00ae: PHI (r314v3 ??) = (r314v1 ??), (r314v4 ??), (r314v4 ??) binds: [B:64:0x00a8, B:45:0x00a0, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ??) from 0x00ae: PHI (r314v3 ??) = (r314v1 ??), (r314v4 ??), (r314v4 ??) binds: [B:64:0x00a8, B:45:0x00a0, B:28:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r314v4 ?? I:java.io.OutputStream) from 0x006d: INVOKE 
          (r315v4 ?? I:android.graphics.Bitmap)
          (r301v0 ?? I:android.graphics.Bitmap$CompressFormat)
          (r0v49 ?? I:int)
          (r314v4 ?? I:java.io.OutputStream)
         VIRTUAL call: android.graphics.Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean A[Catch: IOException -> 0x0094, all -> 0x00e2, MD:(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean (c)]
          (r314v4 ?? I:java.io.OutputStream) from 0x0073: INVOKE (r314v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.flush():void A[Catch: IOException -> 0x0094, all -> 0x00e2, MD:():void throws java.io.IOException (c)]
          (r314v4 ?? I:java.io.OutputStream) from 0x007d: INVOKE (r314v4 ?? I:java.io.OutputStream) VIRTUAL call: java.io.OutputStream.close():void A[Catch: IOException -> 0x0083, MD:():void throws java.io.IOException (c)]
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

    public static String A02(AbstractC3252Jnp abstractC3252Jnp, int i) {
        LiZ A03 = abstractC3252Jnp.A03();
        return A03.historyEntryList.size() > i ? A03.A00(i).A03 : abstractC3252Jnp.A08();
    }

    public BrowserLiteWebChromeClient A05() {
        BrowserLiteWebChromeClient browserLiteWebChromeClient;
        JYM jym = ((SystemWebView) this).A01;
        if (jym == null || (browserLiteWebChromeClient = jym.A00) == null) {
            return null;
        }
        return browserLiteWebChromeClient;
    }

    public JYI A06() {
        SystemWebView systemWebView = (SystemWebView) this;
        ViewStructure jyi = new JYI();
        boolean z = systemWebView.A0P;
        JvO jvO = systemWebView.A03;
        if (z) {
            JvO.A01(jyi, jvO);
            return jyi;
        }
        jvO.onProvideAutofillVirtualStructure(jyi, 0);
        return jyi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File A07(java.io.File r302, java.lang.String r303, float r304) {
        /*
            r301 = this;
            r0 = 0
            r305 = r0
            r0 = r301
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r301
            r308 = r0
            r0 = r301
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r308 = r0
            r0 = r308
            X.JvO r0 = r0.A03     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r308 = r0
            r0 = r308
            r1 = r307
            r0.setDrawingCacheEnabled(r1)     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r0 = r308
            r1 = r307
            android.graphics.Bitmap r0 = r0.getDrawingCache(r1)     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r308 = r0
            r0 = r308
            X.0gF.A00(r0)     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r0 = r308
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)     // Catch: java.lang.Throwable -> L4e java.lang.NullPointerException -> L53
            r309 = r0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.NullPointerException -> L49 java.lang.Throwable -> L8a
            r308 = r0
            r0 = r308
            r1 = r309
            r2 = r302
            r3 = r303
            r4 = r304
            java.io.File r0 = A01(r0, r1, r2, r3, r4)     // Catch: java.lang.NullPointerException -> L49 java.lang.Throwable -> L8a
            r305 = r0
            goto L69
        L49:
            r310 = move-exception
            goto L58
        L4e:
            r311 = move-exception
            goto L90
        L53:
            r310 = move-exception
            r0 = 0
            r309 = r0
        L58:
            java.lang.String r0 = "BrowserLiteWebView"
            r311 = r0
            java.lang.String r0 = "Unable to capture screenshot, the drawing cache may not be ready yet."
            r308 = r0
            r0 = r311
            r1 = r308
            r2 = r310
            X.LCd.A01(r0, r1, r2)     // Catch: java.lang.Throwable -> L8a
        L69:
            r0 = r306
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            r306 = r0
            r0 = r306
            X.JvO r0 = r0.A03
            r308 = r0
            r0 = r308
            r1 = 0
            r0.setDrawingCacheEnabled(r1)
            r0 = r309
            if (r0 == 0) goto L87
            r0 = r309
            r0.recycle()
        L87:
            r0 = r305
            return r0
        L8a:
            r311 = move-exception
            r0 = r309
            r305 = r0
        L90:
            r0 = r306
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            r306 = r0
            r0 = r306
            X.JvO r0 = r0.A03
            r308 = r0
            r0 = r308
            r1 = 0
            r0.setDrawingCacheEnabled(r1)
            r0 = r305
            if (r0 == 0) goto Lae
            r0 = r305
            r0.recycle()
        Lae:
            r0 = r311
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3252Jnp.A07(java.io.File, java.lang.String, float):java.io.File");
    }

    public String A08() {
        KeE keE = this.A0D;
        if (keE != null) {
            Iterator it = keE.A00.A0o.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        String str = null;
        try {
            LiZ A03 = A03();
            if ((A03.historyEntryList.size() == 0 ? null : A03.A00(A03.currentIndex)) != null) {
                str = (A03.historyEntryList.size() == 0 ? null : A03.A00(A03.currentIndex)).A03;
            }
        } catch (Throwable unused) {
        }
        if (str == null || str.isEmpty()) {
            str = ((SystemWebView) this).A03.getUrl();
        }
        return str;
    }

    public String A09() {
        String str;
        if (this.A0K.booleanValue()) {
            str = "";
        } else {
            str = this.A0N;
            if (str == null) {
                String A02 = A02(this, 0);
                this.A0N = A02;
                return A02;
            }
        }
        return str;
    }

    public void A0A() {
        KeE keE = this.A0D;
        if (keE != null) {
            keE.A00.A0Z(3, A08());
        }
    }

    public void A0B() {
        JvO jvO = ((SystemWebView) this).A03;
        jvO.loadUrl("about:blank");
        jvO.setTag(null);
        jvO.clearHistory();
        jvO.removeAllViews();
        try {
            jvO.onPause();
        } catch (Exception unused) {
        }
        A04();
        this.A0b = true;
    }

    public void A0C(long j) {
        KlP klP;
        KlP klP2;
        IABEvent iABLandingPageInteractiveEvent;
        Bundle extras;
        if (!A0K() && this.A04 < j) {
            this.A04 = j;
            Intent intent = this.A0A;
            if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false)) {
                A0I("var f = function () {  var preview = document.body.getElementsByTagName('div')[0];  var width = window.innerWidth    || window.outerWidth     || document.documentElement.clientWidth     || document.body.clientWidth     || document.body.offsetWidth     || screen.width;  var ratio = width / 320.0 || 1;  var scale = 'scale(' + ratio + ',' + ratio + ')';  preview.style.transform = scale;  preview.style.webkitTransform = scale;  preview.style.position = 'relative';  preview.style.transformOrigin = 'top left';  preview.style.webkitTransformOrigin = 'top left';};f();");
                extras.putBoolean("BrowserLiteIntent.EXTRA_EXECUTE_ADS_PREVIEW_JS", false);
            }
            long j2 = this.A06;
            if (j2 != -1) {
                LCd.A04("BrowserLiteWebView", "==DomContentLoaded: %d ms==", 1BK.A1Z(j - j2));
            }
        }
        if (!this.A0U && (klP2 = this.A0C) != null) {
            JgX jgX = klP2.A04;
            LAK lak = jgX.A1K;
            lak.A04("BLWV.onDOMContentLoaded", KVr.A00(j));
            if (!jgX.A0x) {
                jgX.A0x = true;
                jgX.A0g = Long.valueOf(j);
                JgX.A0H(jgX, this, j);
                L11 l11 = jgX.A0c;
                String str = (String) jgX.A0H.A02.getValue();
                if (l11.A0g) {
                    Parcelable.Creator creator = IABEvent.CREATOR;
                    iABLandingPageInteractiveEvent = new IABLandingPageInteractiveEvent(l11.A0P, l11.A0U, str, l11.A0S, l11.A07, l11.A06, l11.A0B, L11.A00(l11), l11.A0L, l11.A0Z);
                } else {
                    iABLandingPageInteractiveEvent = IABEvent.A04;
                }
                JQx.A1E(jgX, iABLandingPageInteractiveEvent);
                jgX.A0Y.A01 = SystemClock.elapsedRealtime();
                L4Z l4z = jgX.A0N;
                long j3 = 0;
                if (l4z != null && l4z.A02()) {
                    long parseLong = jgX.A0V() != null ? Long.parseLong(jgX.A0V()) : 0L;
                    String A0B = JgX.A0B(jgX, true);
                    Intent intent2 = jgX.A07;
                    String stringExtra = intent2 == null ? null : intent2.getStringExtra("BWP_MEDIA_ID");
                    HashMap A0u = AnonymousClass001.A0u();
                    A0u.put("pageLoadSource", "NEWS_FEED");
                    A0u.put("tokenSource", KVj.A00(jgX.A0N.A03.A01));
                    A0u.put("is_organic", String.valueOf(jgX.A0N.A02));
                    A0u.put("media_id", stringExtra);
                    LDF.A00().A0D("PAGE_LOADED", A0B, A0u, parseLong);
                }
                L36 l36 = jgX.A0M;
                if (l36 != null && l36.A01()) {
                    if (jgX.A0V() != null) {
                        j3 = Long.parseLong(jgX.A0V());
                    }
                    String A0B2 = JgX.A0B(jgX, true);
                    HashMap A0u2 = AnonymousClass001.A0u();
                    A0u2.put("pageLoadSource", "NEWS_FEED");
                    A0u2.put("tokenSource", KVh.A00(jgX.A0M.A02.A01));
                    LDF.A00().A0C("PAGE_LOADED", A0B2, A0u2, j3);
                }
            }
            List list = jgX.A0o;
            if (list != null) {
                StringBuilder A01 = LAK.A01(lak, "onDomLoaded");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((MNt) it.next()).BuQ(this);
                }
                LAK.A02(lak, A01);
            }
            this.A0U = true;
        }
        if (this.A0W || (klP = this.A0C) == null) {
            return;
        }
        long j4 = klP.A03;
        if (j4 > 0) {
            LAK lak2 = klP.A04.A1K;
            lak2.A04("BLWV.onPageInteractive", KVr.A00(j));
            lak2.A04("web_view_interactive_ts", KVr.A00(j) - j4);
        }
        JgX jgX2 = klP.A04;
        JgX.A0J(jgX2, "BLWV.onPageInteractive");
        jgX2.A1M.add(A08());
        if (!klP.A02) {
            klP.A02 = true;
            jgX2.A0s = true;
        }
        if (jgX2.A0w && jgX2.A0b != null) {
            ((SystemWebView) this).A03.setBackgroundColor(-1);
        }
        List list2 = jgX2.A0o;
        if (list2 != null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            LAK A00 = LAK.A00(jgX2, "onPageInteractive", A0k);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((MNt) it2.next()).CAa(this, j);
            }
            LAK.A02(A00, A0k);
        }
        Bundle bundleExtra = jgX2.A07.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
        String stringExtra2 = jgX2.A07.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY");
        boolean booleanExtra = jgX2.A07.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", true);
        if (!TextUtils.isEmpty(stringExtra2)) {
            if (bundleExtra == null) {
                bundleExtra = 1BK.A05();
            }
            bundleExtra.putString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", stringExtra2);
            bundleExtra.putBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", booleanExtra);
        }
        LDF ldf = jgX2.A0P;
        LDF.A02(new JmV(bundleExtra, ldf, A08(), jgX2.A0S(), j), ldf);
        this.A0W = true;
    }

    public void A0D(long j) {
        IABEvent iABLandingPageFinishedEvent;
        L3M l3m;
        if (A0K()) {
            return;
        }
        long j2 = this.A05;
        if (j2 < j) {
            long j3 = -1;
            if (j2 != j3 || j == j3) {
                return;
            }
            this.A05 = j;
            KlP klP = this.A0C;
            if (klP != null) {
                JgX jgX = klP.A04;
                Intent intent = jgX.A07;
                if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_TRANSPARENT_IAB_ENABLED", false)) {
                    FrameLayout frameLayout = jgX.A0D;
                    if (frameLayout != null) {
                        frameLayout.setBackgroundColor(-1);
                    }
                    ((SystemWebView) this).A03.setBackgroundColor(-1);
                }
                jgX.A1K.A04("BLWV.onLoadEvent", KVr.A00(j));
                if (!jgX.A0y) {
                    String A09 = A09();
                    C3241Jnc c3241Jnc = jgX.A0I;
                    if (c3241Jnc != null && (l3m = c3241Jnc.A07) != null) {
                        l3m.A06 = true;
                        l3m.A01(A09);
                        if (l3m.A0F) {
                            LDF ldf = l3m.A07;
                            LDF.A02(new C3200Jmb(ldf, l3m.A09, l3m.A0B, l3m.A0A, A09, l3m.A0C, l3m.A0G), ldf);
                        }
                    }
                    jgX.A0y = true;
                    L11 l11 = jgX.A0c;
                    if (l11.A0g) {
                        l11.A0F = j;
                    }
                    jgX.A0H.A02.setValue(A09);
                    JgX.A0D(jgX.A07, jgX);
                    L11 l112 = jgX.A0c;
                    if (l112.A0g) {
                        Parcelable.Creator creator = IABEvent.CREATOR;
                        iABLandingPageFinishedEvent = new IABLandingPageFinishedEvent(l112.A0P, l112.A0U, A09, l112.A0W, l112.A0F, L11.A00(l112));
                    } else {
                        iABLandingPageFinishedEvent = IABEvent.A04;
                    }
                    JQx.A1E(jgX, iABLandingPageFinishedEvent);
                }
            }
            LCd.A04("BrowserLiteWebView", "==onLoadEventEnd: %d ms==", 1BK.A1Z(this.A05 - this.A06));
        }
    }

    public void A0E(long j) {
        if (A0K()) {
            return;
        }
        long j2 = this.A07;
        if (j2 < j) {
            long j3 = -1;
            if (j2 == j3) {
                this.A07 = j;
                long j4 = this.A06;
                if (j4 != j3) {
                    LCd.A04("BrowserLiteWebView", "onResponseEnd: %d ms", 1BK.A1Z(j - j4));
                }
            }
        }
    }

    public void A0F(Intent intent) {
        this.A0A = intent;
        Kk8 kk8 = this.A0I;
        kk8.A02 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_NAVIGATION_TIMING_LOGGER_ENABLED", true);
        kk8.A03 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_INTERACTION_TO_NEXT_PAINT_LOGGING_ENABLED", false);
        this.A0Q = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_PAYMENT_ENABLED", false);
        this.A0P = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_FRAMEWORK_FORM_DETECTION_LOGGING", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        ((com.facebook.browser.lite.webview.SystemWebView) r301).A03.loadUrl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r304 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r304 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005c, code lost:
    
        if (r302 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        r302.BxV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(X.MII r302, java.lang.String r303, boolean r304) {
        /*
            r301 = this;
            java.lang.String r0 = "javascript: "
            r305 = r0
            r0 = r305
            r1 = r303
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r306 = r0
            r0 = r301
            boolean r0 = r0.A0R
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L3c
            X.LL1 r0 = new X.LL1     // Catch: java.lang.IllegalStateException -> L43
            r308 = r0
            r0 = r308
            r1 = r302
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L43
            r0 = r301
            r305 = r0
            r0 = r301
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0     // Catch: java.lang.IllegalStateException -> L43
            r305 = r0
            r0 = r305
            X.JvO r0 = r0.A03     // Catch: java.lang.IllegalStateException -> L43
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r308
            r0.evaluateJavascript(r1, r2)     // Catch: java.lang.IllegalStateException -> L43
            return
        L3c:
            r0 = r304
            if (r0 == 0) goto L5b
            goto L48
        L43:
            r0 = r304
            if (r0 == 0) goto L5b
        L48:
            r0 = r301
            r305 = r0
            r0 = r301
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.JvO r0 = r0.A03
            r305 = r0
            r0 = r305
            r1 = r306
            r0.loadUrl(r1)
        L5b:
            r0 = r302
            if (r0 == 0) goto L65
            r0 = r302
            r0.BxV()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3252Jnp.A0G(X.MII, java.lang.String, boolean):void");
    }

    public void A0H(MF9 mf9) {
        try {
            File filesDir = SystemWebView.A00(this).getFilesDir();
            AnonymousClass001.A0D(filesDir, "iab_source.html").delete();
            A0G(new LUe(mf9, this, filesDir, "iab_source.html", false, false), "(function(){ return document.documentElement.innerHTML; })();", false);
        } catch (IOException unused) {
        }
    }

    public void A0I(String str) {
        A0G(null, str, true);
    }

    public boolean A0J() {
        if (!((SystemWebView) this).A03.canGoBack()) {
            return false;
        }
        LiZ A03 = A03();
        if (A03.historyEntryList.size() >= 2 && A03.currentIndex == 1) {
            String str = A03.A00(0).A03;
            String str2 = A03.A00(1).A03;
            if ("about:blank".equals(str) || TextUtils.equals(str, str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((com.facebook.browser.lite.webview.SystemWebView) r301).A03.canGoForward() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0K() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0J()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1a
            r0 = r301
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.JvO r0 = r0.A03
            boolean r0 = r0.canGoForward()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            r302 = r0
        L1c:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3252Jnp.A0K():boolean");
    }
}
