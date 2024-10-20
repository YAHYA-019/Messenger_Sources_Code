package com.facebook.messaging.nativepagereply.privatereply.commentview.activity;

import X.06Z;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Iw;
import X.1Lm;
import X.2JX;
import X.2JY;
import X.2Jf;
import X.4YV;
import X.4fF;
import X.5zC;
import X.6RU;
import X.6tT;
import X.7FI;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.8dU;
import X.98W;
import X.9VK;
import X.9XK;
import X.9cG;
import X.A3Q;
import X.AC8;
import X.AKO;
import X.C1u2;
import X.DKy;
import X.DLP;
import X.FJ8;
import X.S8H;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PrivateReplyCommentViewActivity.class */
public final class PrivateReplyCommentViewActivity extends FbFragmentActivity {
    public 2JX A00;
    public 2JX A01;
    public 1Iw A02;
    public LithoView A03;
    public 9cG A04;
    public 6RU A05;
    public 6tT A06;
    public LithoView A07;
    public final 9XK A08 = new 9XK(this);
    public 9VK composerController;

    public static final 8dU A12(1Iw r301, PrivateReplyCommentViewActivity privateReplyCommentViewActivity) {
        String str;
        2JY A0B;
        2JY A0O;
        2JY A0B2;
        2JY A0O2;
        2JY A0B3;
        1BV A0G = 7zU.A0G(r301, 16979);
        C1u2 A0I = 4YV.A0I();
        2JX r0 = privateReplyCommentViewActivity.A01;
        2JX r307 = null;
        if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -603244481, 452557630)) != null && (A0O = 7zL.A0O(A0B, 2JX.class, 1555731783, 2057131022, 2056217035)) != null && (A0B2 = 1BK.A0B(A0O, 2JX.class, -594341906, -1372665018)) != null && (A0O2 = 7zL.A0O(A0B2, 2JX.class, 410302901, 512924796, 1442188424)) != null && (A0B3 = 1BK.A0B(A0O2, 2JX.class, 1285028280, 487058813)) != null) {
            r307 = (2JX) A0B3.A0K(17745340, 2JX.class, -1772472067);
        }
        5zC r02 = (5zC) 1Bn.A0A(49882);
        2JX r03 = privateReplyCommentViewActivity.A00;
        if (r03 == null) {
            str = "commItemPart";
        } else {
            MigColorScheme A0W = 7zN.A0W(A0G);
            AKO ako = new AKO(privateReplyCommentViewActivity, 46);
            06Z BDe = privateReplyCommentViewActivity.BDe();
            9cG r04 = privateReplyCommentViewActivity.A04;
            if (r04 != null) {
                return new 8dU(BDe, A0I, r307, r03, r04, r02, A0W, ako);
            }
            str = "lazyListViewController";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.9cG] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        String A0k;
        super.A2y(bundle);
        this.A04 = new Object();
        Object A03 = FJ8.A03(getIntent().getExtras(), "extra_comm_item");
        if (A03 != null && 2JX.A0A(1133594216, A03)) {
            this.A00 = (2JX) A03;
        }
        1Iw A0W = 7zL.A0W(this);
        this.A02 = A0W;
        LithoView lithoView = new LithoView(this, (AttributeSet) null);
        lithoView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        lithoView.A0x(A12(A0W, this));
        MigColorScheme.A00(lithoView, 7zR.A0b(7zL.A0A(A0W)));
        this.A03 = lithoView;
        this.A05 = new 6RU(this);
        LithoView lithoView2 = new LithoView(this, (AttributeSet) null);
        lithoView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        this.A07 = lithoView2;
        LithoView lithoView3 = this.A03;
        if (lithoView3 == null) {
            str = "postLithoView";
        } else {
            6RU r0 = this.A05;
            if (r0 != null) {
                6tT r02 = new 6tT(r0);
                r02.setOrientation(1);
                r02.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                r02.addView(lithoView3);
                r02.addView(lithoView2);
                this.A06 = r02;
                str = "linearLayoutRootView";
                setContentView((View) r02);
                FbUserSession A05 = 7zQ.A0N().A05(this);
                ((DKy) 1Lm.A05(this, A05, 99445)).A01(this);
                6tT r03 = this.A06;
                if (r03 != null) {
                    r03.post(new S8H(this));
                    6RU r04 = this.A05;
                    if (r04 != null) {
                        LithoView lithoView4 = this.A07;
                        if (lithoView4 == null) {
                            11T.A0L("composerView");
                            throw 0Q8.createAndThrow();
                        }
                        ThreadKey A0H = ThreadKey.A0H(0L, 0L);
                        2JX r05 = this.A00;
                        if (r05 != null) {
                            this.composerController = new 9VK(this, A05, r05, lithoView4, A0H, this.A08, r04);
                            2JX r06 = this.A00;
                            if (r06 != null) {
                                2JY A0B = 1BK.A0B(r06, 2JX.class, 1014891912, 1389715613);
                                if (A0B != null && (A0k = A0B.A0k()) != null) {
                                    GraphQlQueryParamSet A0M = 7zL.A0M();
                                    A0M.A05("commItemID", A0k);
                                    ((4fF) 1Bn.A0E(this, (1BY) null, 68126)).A0I(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "PrivateReplyCommentDetailQuery", (String) null, "fbandroid", 1377368718, 0, 4108750371L, 4108750371L, false, true)), AC8.A00(this, 38), 1BK.A0t(), 7zM.A1E(16432));
                                }
                                6tT r07 = this.A06;
                                if (r07 != null) {
                                    new DLP(r07).A02(new A3Q(this, 3));
                                    return;
                                }
                            }
                        }
                        str = "commItemPart";
                    }
                }
            }
            str = "composerContext";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        9VK r0 = this.composerController;
        if (r0 == null) {
            11T.A0L("composerController");
            throw 0Q8.createAndThrow();
        }
        7FI.A02(r0.A00, 98W.A02);
        finish();
    }
}
