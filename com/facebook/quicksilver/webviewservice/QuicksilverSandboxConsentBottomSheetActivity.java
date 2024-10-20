package com.facebook.quicksilver.webviewservice;

import X.07S;
import X.0Dc;
import X.0S2;
import X.1BK;
import X.1BQ;
import X.1Hv;
import X.1I7;
import X.1Kd;
import X.1VX;
import X.2MR;
import X.3Eh;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.7zL;
import X.7zM;
import X.7zP;
import X.AbF;
import X.AbH;
import X.C00i;
import X.C01643sd;
import X.C0A2;
import X.C2E;
import X.DKC;
import X.DKG;
import X.Dld;
import X.EKw;
import X.EQG;
import X.EQZ;
import X.ERC;
import X.ERE;
import X.ExT;
import X.FFw;
import X.Fcg;
import X.Fdw;
import X.FwK;
import X.RRB;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.resources.ui.FbTextView;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.widget.tiles.ThreadTileView;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: QuicksilverSandboxConsentBottomSheetActivity.class */
public class QuicksilverSandboxConsentBottomSheetActivity extends FbFragmentActivity {
    public Handler A00;
    public View A01;
    public 1I7 A02;
    public GlyphView A03;
    public FFw A04;
    public EKw A05;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public FbUserSession A0G;
    public final RRB A0L;
    public final C00i A0J = AbH.A0D();
    public Boolean A06 = 1BK.A0d();
    public final C00i A0H = 1BQ.A02(99773);
    public final C00i A0M = 1BQ.A02(16477);
    public final C00i A0K = 1BQ.A00();
    public final C00i A0I = DKG.A0Q();

    public QuicksilverSandboxConsentBottomSheetActivity() {
        String str = this.A07;
        this.A0L = new RRB(EQG.A02, str == null ? ConstantsKt.CAMERA_ID_FRONT : str);
    }

    private void A12() {
        ExT A00 = FFw.A00(7zL.A0W(this));
        A00.A02 = this;
        A00.A04 = this.A01;
        A00.A07 = new Fdw(this, 3);
        FFw A002 = A00.A00(CallerContext.A0B("QuicksilverSandboxConsentBottomSheetActivity"));
        this.A04 = A002;
        A002.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A15(Drawable drawable, 0Dc r302, FbTextView fbTextView) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setColorFilter(2MR.A1Z.lightModeFallBackColorInt, PorterDuff.Mode.SRC_IN);
            r302.A03(" ", "[icon]", new Object[]{new ImageSpan(drawable, 2)}, 33);
            DKC.A1P(fbTextView);
            fbTextView.setText(7zM.A0E(r302));
        }
    }

    public static void A16(EQZ eqz, QuicksilverSandboxConsentBottomSheetActivity quicksilverSandboxConsentBottomSheetActivity, String str) {
        if (quicksilverSandboxConsentBottomSheetActivity.A05 == null || quicksilverSandboxConsentBottomSheetActivity.A0F == null) {
            quicksilverSandboxConsentBottomSheetActivity.finish();
            return;
        }
        Handler handler = quicksilverSandboxConsentBottomSheetActivity.A00;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        quicksilverSandboxConsentBottomSheetActivity.A0L.A00(eqz, str);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, quicksilverSandboxConsentBottomSheetActivity.A07, "app_id");
        07S.A00(A0J, quicksilverSandboxConsentBottomSheetActivity.A05.toString(), "login_profile_type");
        07S.A00(A0J, quicksilverSandboxConsentBottomSheetActivity.A0F, "app_visibility_option");
        4YV.A1A(A0J, A0M, "data");
        5Dh A00 = 5Dh.A00(A0M, new C01643sd(Dld.class, "InstantGameSandboxEnrollmentWithUserPreferenceMutation", null, "data", "fbandroid", 2117115513, 384, 4105779363L, 4105779363L, false, true));
        FbUserSession fbUserSession = quicksilverSandboxConsentBottomSheetActivity.A0G;
        fbUserSession.getClass();
        ListenableFuture A06 = 1VX.A08(quicksilverSandboxConsentBottomSheetActivity, fbUserSession).A06(A00);
        1Kd.A0D(quicksilverSandboxConsentBottomSheetActivity.A0M, FwK.A01(quicksilverSandboxConsentBottomSheetActivity, 43), A06);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A1D(EKw eKw, QuicksilverSandboxConsentBottomSheetActivity quicksilverSandboxConsentBottomSheetActivity, String str, String str2, String str3) {
        String str4;
        String str5;
        int i;
        String string;
        Fcg fcg;
        3Eh r307;
        Drawable A06;
        boolean A1V = 1BK.A1V(quicksilverSandboxConsentBottomSheetActivity.A05, eKw);
        boolean z = eKw == EKw.A02 && !(str2 == null && str3 == null);
        if (A1V || z) {
            TextView A062 = AbF.A06(quicksilverSandboxConsentBottomSheetActivity.A01, 2131367354);
            ThreadTileView threadTileView = (ThreadTileView) quicksilverSandboxConsentBottomSheetActivity.A01.findViewById(2131366603);
            if (A062 != null && threadTileView != null) {
                if (str2 != null) {
                    quicksilverSandboxConsentBottomSheetActivity.A0A = str2;
                }
                if (str3 != null) {
                    quicksilverSandboxConsentBottomSheetActivity.A0B = str3;
                }
                if (eKw == EKw.A03) {
                    str4 = quicksilverSandboxConsentBottomSheetActivity.A0D;
                    str5 = quicksilverSandboxConsentBottomSheetActivity.A0E;
                } else {
                    str4 = quicksilverSandboxConsentBottomSheetActivity.A0A;
                    str5 = quicksilverSandboxConsentBottomSheetActivity.A0B;
                }
                if (str5 != null) {
                    A062.setText(str4);
                    threadTileView.A01(((C2E) 1Hv.A02(quicksilverSandboxConsentBottomSheetActivity.getBaseContext(), 84990)).A00(C0A2.A03(str5), ImmutableList.builder().build()));
                }
            }
            quicksilverSandboxConsentBottomSheetActivity.finish();
            return;
        }
        String str6 = quicksilverSandboxConsentBottomSheetActivity.A0F;
        if (str6 == null || !str6.equals(str)) {
            TextView A063 = AbF.A06(quicksilverSandboxConsentBottomSheetActivity.A01, 2131367353);
            if (A063 != null) {
                0Dc A0P = 7zP.A0P(quicksilverSandboxConsentBottomSheetActivity);
                A0P.A02(quicksilverSandboxConsentBottomSheetActivity.getString(2131964103));
                int hashCode = str.hashCode();
                switch (hashCode) {
                    case -595646709:
                        if (str.equals("ONLY_ME")) {
                            i = 2131964104;
                            string = quicksilverSandboxConsentBottomSheetActivity.getString(i);
                            break;
                        }
                        string = "";
                        break;
                    case -291702466:
                        if (str.equals("FRIENDS_AND_MUTUAL_GAME_PLAYERS")) {
                            i = 2131964102;
                            string = quicksilverSandboxConsentBottomSheetActivity.getString(i);
                            break;
                        }
                        string = "";
                        break;
                    case 117888373:
                        if (str.equals("FRIENDS")) {
                            i = 2131964101;
                            string = quicksilverSandboxConsentBottomSheetActivity.getString(i);
                            break;
                        }
                        string = "";
                        break;
                    case 1064604011:
                        if (str.equals("EVERYONE")) {
                            i = 2131964105;
                            string = quicksilverSandboxConsentBottomSheetActivity.getString(i);
                            break;
                        }
                        string = "";
                        break;
                    default:
                        string = "";
                        break;
                }
                A0P.A03(string, "[privacy_setting]", new Object[0], 33);
                A063.setText(7zM.A0E(A0P));
                GlyphView glyphView = quicksilverSandboxConsentBottomSheetActivity.A03;
                if (glyphView != null) {
                    switch (hashCode) {
                        case -595646709:
                            if (str.equals("ONLY_ME")) {
                                fcg = (Fcg) quicksilverSandboxConsentBottomSheetActivity.A0H.get();
                                r307 = 3Eh.AEV;
                                A06 = fcg.A06(quicksilverSandboxConsentBottomSheetActivity, r307, ERC.A02, ERE.A01);
                                break;
                            }
                            A06 = null;
                            break;
                        case -291702466:
                            if (str.equals("FRIENDS_AND_MUTUAL_GAME_PLAYERS")) {
                                fcg = (Fcg) quicksilverSandboxConsentBottomSheetActivity.A0H.get();
                                r307 = 3Eh.A8o;
                                A06 = fcg.A06(quicksilverSandboxConsentBottomSheetActivity, r307, ERC.A02, ERE.A01);
                                break;
                            }
                            A06 = null;
                            break;
                        case 117888373:
                            if (str.equals("FRIENDS")) {
                                fcg = (Fcg) quicksilverSandboxConsentBottomSheetActivity.A0H.get();
                                r307 = 3Eh.A8k;
                                A06 = fcg.A06(quicksilverSandboxConsentBottomSheetActivity, r307, ERC.A02, ERE.A01);
                                break;
                            }
                            A06 = null;
                            break;
                        case 1064604011:
                            if (str.equals("EVERYONE")) {
                                fcg = (Fcg) quicksilverSandboxConsentBottomSheetActivity.A0H.get();
                                r307 = 3Eh.A9Y;
                                A06 = fcg.A06(quicksilverSandboxConsentBottomSheetActivity, r307, ERC.A02, ERE.A01);
                                break;
                            }
                            A06 = null;
                            break;
                        default:
                            A06 = null;
                            break;
                    }
                    glyphView.setImageDrawable(A06);
                }
            }
            quicksilverSandboxConsentBottomSheetActivity.finish();
            return;
        }
        quicksilverSandboxConsentBottomSheetActivity.A05 = eKw;
        quicksilverSandboxConsentBottomSheetActivity.A0F = str;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public Integer A2h() {
        return 0S2.A01;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.webviewservice.QuicksilverSandboxConsentBottomSheetActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
