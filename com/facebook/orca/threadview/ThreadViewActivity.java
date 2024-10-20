package com.facebook.orca.threadview;

import X.0FI;
import X.0Pw;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1iF;
import X.1pH;
import X.2LI;
import X.2LK;
import X.2M3;
import X.2OZ;
import X.2Or;
import X.3Do;
import X.4YU;
import X.5SW;
import X.5YZ;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.BFM;
import X.C00i;
import X.C04r;
import X.C0D1;
import X.C0et;
import X.C1lM;
import X.C1xf;
import X.C3o5;
import X.CfB;
import X.D6w;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import java.util.Map;

/* loaded from: ThreadViewActivity.class */
public class ThreadViewActivity extends FbFragmentActivity implements 2LI, C1lM, 2LK, C1xf {
    public C0et A00;
    public ThreadKey A01;
    public 5SW A02;
    public 2OZ A03;
    public 1pH A05;
    public final C00i A0A = AbH.A0P();
    public final 5YZ A0B = (5YZ) 1Bi.A03(49777);
    public final C00i A09 = 1BV.A00(16430);
    public final C00i A07 = 1BV.A00(32821);
    public final C00i A06 = 1BQ.A02(16616);
    public final 2M3 A08 = new CfB(this, 7);
    public boolean A04 = false;

    public static Intent A12(Context context, ThreadKey threadKey) {
        context.getClass();
        threadKey.getClass();
        Intent A0D = C3o5.A0D(context, ThreadViewActivity.class);
        A0D.setExtrasClassLoader(ThreadViewActivity.class.getClassLoader());
        A0D.putExtra("thread_key", threadKey);
        return A0D;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        2Or.A00(fragment, this.A08);
        if (fragment instanceof 2OZ) {
            2OZ r0 = (2OZ) fragment;
            this.A03 = r0;
            r0.A0b = new BFM(this, 1);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(621497308797881L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        0fH.A0k("BIZ_VC_DEBUG", "ThreadViewActivity.onActivityDestroy()");
        super.A2l();
        1pH r0 = this.A05;
        if (r0 != null) {
            r0.A06();
            this.A05 = null;
        }
        if (this.A03 == null || isChangingConfigurations()) {
            return;
        }
        this.A03.A1Y();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2w(Context context) {
        this.A00 = AbJ.A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0767, code lost:
    
        if (0 != 0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0574  */
    /* JADX WARN: Type inference failed for: r0v119, types: [com.facebook.messaging.threadview.params.ThreadViewParams, X.6el] */
    /* JADX WARN: Type inference failed for: r0v123, types: [android.content.Intent, java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v127, types: [android.os.Parcelable, android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v129, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v132, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v133, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, com.facebook.messaging.composer.params.ComposerInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v134, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v135, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, android.content.Intent, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v137, types: [com.facebook.messaging.business.mdotme.model.PlatformRefParams, com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v138, types: [com.facebook.messaging.business.common.calltoaction.model.CallToAction, com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v139, types: [com.facebook.messaging.business.common.calltoaction.CallToActionContextParams, com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v141, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v142, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, com.facebook.messaging.model.threadkey.ThreadKey, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v143, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh, boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh, boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh, boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v148, types: [com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup, com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v149, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v150, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v151, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v152, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v153, types: [X.5ap, com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v154, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, com.facebook.messaging.business.bmcconversionfoundations.pdp.params.PdpInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v155, types: [com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams, java.lang.String, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v156, types: [com.facebook.messaging.communitymessaging.adminonboarding.hintcard.HintCardParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v160, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v163, types: [X.Byx, boolean] */
    /* JADX WARN: Type inference failed for: r0v165, types: [com.facebook.messaging.composer.params.ComposerInitParams, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v168, types: [java.util.HashSet, java.util.AbstractCollection, X.Byx, java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v170, types: [java.util.HashSet, X.Byx, java.util.Set, com.facebook.messaging.composer.params.ComposerInitParams] */
    /* JADX WARN: Type inference failed for: r0v171, types: [X.Byx, com.facebook.share.model.ComposerAppAttribution, com.facebook.messaging.composer.params.ComposerInitParams] */
    /* JADX WARN: Type inference failed for: r0v172, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v173, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource] */
    /* JADX WARN: Type inference failed for: r0v174, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v175, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v177, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v178, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v180, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v181, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v182, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v183, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v184, types: [X.Byx, com.facebook.messaging.composer.params.ComposerInitParams, boolean] */
    /* JADX WARN: Type inference failed for: r0v186, types: [java.util.HashSet, X.Byx, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v187, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v195, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v204, types: [X.Aeg, int, androidx.fragment.app.Fragment, X.06c] */
    /* JADX WARN: Type inference failed for: r0v211, types: [int, androidx.fragment.app.Fragment, X.2OZ, X.06c, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v216, types: [android.content.Context, int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, android.content.Intent, java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v226 */
    /* JADX WARN: Type inference failed for: r0v227 */
    /* JADX WARN: Type inference failed for: r0v230 */
    /* JADX WARN: Type inference failed for: r0v231 */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.content.Intent, java.lang.String, com.facebook.messaging.model.threadkey.ThreadKey] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.content.Intent, java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.6el, com.facebook.messaging.model.threadkey.ThreadKey] */
    /* JADX WARN: Type inference failed for: r0v69, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v72, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v75, types: [android.content.Intent, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams, X.2OZ, boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [android.view.View, android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v89, types: [android.view.View$AccessibilityDelegate, android.view.View, X.GUE] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r302v0, types: [android.os.Bundle, android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r315v0 */
    /* JADX WARN: Type inference failed for: r315v1 */
    /* JADX WARN: Type inference failed for: r315v5 */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.orca.threadview.ThreadViewActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return !(this instanceof ThreadViewBubblesActivity);
    }

    public boolean ADk() {
        return false;
    }

    @Override // X.C1lM
    public Map AWe() {
        ThreadKey threadKey;
        C04r A06 = AbH.A06();
        2OZ r0 = this.A03;
        if (r0 != null && (threadKey = r0.A0H) != null) {
            A06.put("thread_key", threadKey.toString());
        }
        return A06;
    }

    public String AWg() {
        return "thread";
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A00;
    }

    public ThreadKey Afy() {
        return this.A03.A0H;
    }

    public Map Agf() {
        2OZ r0 = this.A03;
        if (r0 == null || !r0.isVisible()) {
            return null;
        }
        return this.A03.Agf();
    }

    public Long Am7() {
        return 621497308797881L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        2OZ r0 = this.A03;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A05;
        if ((r0 == null || !r0.A07()) && C0D1.A01(BDe()) && !this.A03.A1d((String) null)) {
            D6w d6w = new D6w(this);
            boolean A00 = C0D1.A00(BDe());
            Handler A0G = 4YU.A0G(this.A09);
            if (A00) {
                A0G.postDelayed(d6w, 1L);
            } else {
                A0G.post(d6w);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (super.onKeyDown(r302, r303) != false) goto L30;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r302, android.view.KeyEvent r303) {
        /*
            r301 = this;
            r0 = r303
            int r0 = r0.getAction()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L98
            r0 = r303
            int r0 = r0.getKeyCode()
            r305 = r0
            r0 = 4
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L98
            r0 = r301
            X.00i r0 = r0.A0A
            X.1kw r0 = X.1BK.A06(r0)
            r306 = r0
            X.AgI r0 = X.AgI.A00
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L5b
            java.lang.Class<X.AgI> r0 = X.AgI.class
            r308 = r0
            r0 = r308
            monitor-enter(r0)
            X.AgI r0 = X.AgI.A00     // Catch: java.lang.Throwable -> L53
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L4d
            X.AgI r0 = new X.AgI     // Catch: java.lang.Throwable -> L53
            r307 = r0
            r0 = r307
            r1 = r306
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            r0 = r307
            X.AgI.A00 = r0     // Catch: java.lang.Throwable -> L53
        L4d:
            r0 = r308
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r307 = move-exception
            r0 = r308
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            r0 = r307
            throw r0
        L5b:
            X.AgI r0 = X.AgI.A00
            r309 = r0
            java.lang.String r0 = "click"
            X.2Jy r0 = X.4YU.A0H(r0)
            r306 = r0
            r0 = r306
            java.lang.String r1 = "pigeon_reserved_keyword_module"
            java.lang.String r2 = "thread"
            r0.A0D(r1, r2)
            r0 = r306
            java.lang.String r1 = "pigeon_reserved_keyword_obj_type"
            java.lang.String r2 = "android_button"
            r0.A0D(r1, r2)
            java.lang.String r0 = "pigeon_reserved_keyword_obj_id"
            r308 = r0
            java.lang.String r0 = "back"
            r307 = r0
            r0 = r306
            r1 = r308
            r2 = r307
            r0.A0D(r1, r2)
            r0 = r309
            r1 = r306
            r0.A03(r1)
        L98:
            r0 = r301
            X.2OZ r0 = r0.A03
            r306 = r0
            r0 = r303
            int r0 = r0.getKeyCode()
            r305 = r0
            r0 = 31
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto Lb8
            r0 = r306
            X.2OZ.A0H(r0)
        Lb2:
            r0 = 1
            r305 = r0
        Lb5:
            r0 = r305
            return r0
        Lb8:
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.onKeyDown(r1, r2)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            if (r0 == 0) goto Lb5
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.orca.threadview.ThreadViewActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (super.onKeyUp(r302, r303) != false) goto L8;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyUp(int r302, android.view.KeyEvent r303) {
        /*
            r301 = this;
            r0 = r301
            X.2OZ r0 = r0.A03
            r304 = r0
            r0 = r303
            int r0 = r0.getKeyCode()
            r305 = r0
            r0 = 82
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L21
            r0 = r304
            boolean r0 = r0.A1c()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L31
        L21:
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.onKeyUp(r1, r2)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L34
        L31:
            r0 = 1
            r306 = r0
        L34:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.orca.threadview.ThreadViewActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-841102741);
        this.A04 = false;
        0fH.A0k("BIZ_VC_DEBUG", "ThreadViewActivity.onPause()");
        super.onPause();
        this.A0B.A03();
        0FI.A07(-1741123809, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1947358230);
        this.A04 = true;
        0fH.A0k("BIZ_VC_DEBUG", "ThreadViewActivity.onResume()");
        super.onResume();
        0FI.A07(622001461, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        closeOptionsMenu();
        ThreadKey threadKey = this.A03.A0H;
        if (threadKey == null) {
            threadKey = this.A01;
        }
        AbF.A1J(bundle, threadKey);
        bundle.putSerializable("extra_thread_source", this.A02);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        2OZ r0 = this.A03;
        if (r0 != null) {
            r0.A0w = z;
            2OZ.A0J(r0);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        2OZ r0 = this.A03;
        if (r0 != null) {
            Uri data = intent.getData();
            if (0Pw.A00(data) && PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(data.getAuthority())) {
                List<String> pathSegments = data.getPathSegments();
                if (pathSegments.size() == 2 && 1BK.A14(pathSegments, 1).equals("chatcolors") && 1BK.A14(pathSegments, 0).equals(4YU.A0z(r0.A0H))) {
                    r0.A0c.A0r.A08.CVz(3Do.A03, (String) null);
                    return;
                }
            }
            super.startActivity(intent);
        }
    }
}
