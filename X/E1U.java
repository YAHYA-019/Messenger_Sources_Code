package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: E1U.class */
public final class E1U extends E1z {
    public static E1U A0G;
    public static final String A0H;
    public static final String __redex_internal_original_name = "FxCalLinkingFragment";
    public FbUserSession A00;
    public FHc A01;
    public DSI A02;
    public final 1Br A06 = 1Bu.A02(this, 83979);
    public final 1Br A08 = 1Bu.A00(99816);
    public final 1Br A09 = 1Bu.A00(98490);
    public final 1Br A0A = 1Bu.A00(454);
    public final 1Br A07 = 7zM.A0d();
    public final 1Br A0B = 7zM.A0S();
    public final DialogInterface.OnClickListener A03 = FK6.A00(this, 20);
    public final View.OnClickListener A05 = FXr.A02(this, 81);
    public final AnonymousClass553 A0C = new FkE(this, 4);
    public final View.OnClickListener A04 = FXr.A02(this, 80);
    public final AnonymousClass553 A0D = new FkE(this, 5);
    public final FwL A0E = FwL.A00(this, 34);
    public final FwL A0F = FwL.A00(this, 35);

    static {
        String name = E1U.class.getName();
        11T.A0A(name);
        A0H = name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(Context context, 2JX r302, E1U e1u, String str, String str2) {
        String str3;
        e1u.A1e();
        0fH.A0l(A0H, str);
        FHc fHc = e1u.A01;
        if (fHc == null) {
            str3 = "fxCalLogger";
        } else {
            DSI dsi = e1u.A02;
            if (dsi != null) {
                FHc.A03(FHc.A00(dsi), fHc, "web_auth_attempted", (String) null, (String) null, str2);
                ((FHQ) 1Br.A0B(e1u.A06)).A06(context, e1u, r302);
                return;
            }
            str3 = "fxCalLinkingViewModel";
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    public static final void A06(GraphQLResult graphQLResult, E1U e1u) {
        2JX A0L;
        2JX A0L2;
        2JX r0 = (2JX) ((AbstractC08294mh) graphQLResult).A03;
        2JX r304 = null;
        if ((r0 != null ? 1BL.A0L(r0, -899716685, -2003832171) : null) != null) {
            DSI dsi = e1u.A02;
            if (dsi != null) {
                dsi.A01 = (r0 == null || (A0L2 = 1BL.A0L(r0, -899716685, -2003832171)) == null) ? null : 1BL.A0L(A0L2, 3237038, 131788977);
                if (r0 != null && (A0L = 1BL.A0L(r0, -899716685, -2003832171)) != null) {
                    r304 = 1BL.A0L(A0L, -719011917, -1676583161);
                }
                dsi.A02 = r304;
            }
            11T.A0L("fxCalLinkingViewModel");
            throw 0Q8.createAndThrow();
        }
        DSI dsi2 = e1u.A02;
        if (dsi2 != null) {
            Object obj = ((FHQ) 1Br.A0B(e1u.A06)).A09.get();
            11T.A0A(obj);
            dsi2.A04 = ((User) obj).A13;
            DSI dsi3 = e1u.A02;
            if (dsi3 != null) {
                dsi3.A00 = 1Br.A00(e1u.A07) + 1800000;
                return;
            }
        }
        11T.A0L("fxCalLinkingViewModel");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0492, code lost:
    
        r315 = X.2MG.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, X.R0g] */
    /* JADX WARN: Type inference failed for: r0v240, types: [java.lang.Throwable, java.lang.Object, X.R0g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(X.2JX r301, X.E1U r302) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1U.A07(X.2JX, X.E1U):void");
    }

    public static final void A08(E1U e1u) {
        String str;
        FHc fHc = e1u.A01;
        if (fHc == null) {
            str = "fxCalLogger";
        } else {
            DSI dsi = e1u.A02;
            if (dsi != null) {
                FHc.A02(FHc.A00(dsi), fHc, "native_auth_verification_error");
                7zP.A0e(e1u.A0B).markerPoint(857807376, "NATIVE_AUTH_VERIFICATION_ERROR");
                return;
            }
            str = "fxCalLinkingViewModel";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A09(E1U e1u) {
        String str;
        FHc fHc = e1u.A01;
        if (fHc == null) {
            str = "fxCalLogger";
        } else {
            DSI dsi = e1u.A02;
            if (dsi != null) {
                FHc.A02(FHc.A00(dsi), fHc, "web_auth_verification_error");
                7zP.A0e(e1u.A0B).markerPoint(857807376, "WEB_AUTH_VERIFICATION_ERROR");
                return;
            }
            str = "fxCalLinkingViewModel";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0A(E1U e1u, String str) {
        String str2;
        if (e1u.getContext() != null) {
            0fH.A14(A0H, "%s", new Object[]{str});
            FHc fHc = e1u.A01;
            if (fHc == null) {
                str2 = "fxCalLogger";
            } else {
                DSI dsi = e1u.A02;
                if (dsi != null) {
                    FHc.A03(FHc.A00(dsi), fHc, "generic_error", str, (String) null, (String) null);
                    F9e f9e = (F9e) 1Br.A0B(e1u.A08);
                    Context requireContext = e1u.requireContext();
                    MigColorScheme migColorScheme = ((BJB) e1u).A01;
                    11T.A0A(migColorScheme);
                    f9e.A02(requireContext, e1u.A03, migColorScheme, null);
                    return;
                }
                str2 = "fxCalLinkingViewModel";
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A0B(GraphQLResult graphQLResult, E1U e1u, Integer num) {
        String str;
        2JX A0L;
        2JX r0;
        2JX A0L2;
        String str2 = A0H;
        0fH.A0l(str2, "FxCalInitQueryResponse success");
        Object obj = ((AbstractC08294mh) graphQLResult).A03;
        boolean z = true;
        if (obj == null || (r0 = (2JX) obj) == null || (A0L2 = 1BL.A0L(r0, -899716685, -2003832171)) == null || A0L2.A0W(2JX.class, 83215616) != null) {
            7zP.A0e(e1u.A0B).markerEnd(857807376, (short) 3);
            if (num.intValue() != 0) {
                A09(e1u);
            } else {
                A08(e1u);
            }
        }
        2JX r02 = (2JX) obj;
        if (r02 == null || (A0L = 1BL.A0L(r02, -899716685, -2003832171)) == null) {
            if (obj != null) {
                z = false;
            }
            0fH.A14(str2, "FxCalInitQueryResponse result invalid result null=%b", 4YU.A1b(z));
            str = "Invalid FxCalInitQueryResponse result";
        } else {
            if (A0L.A0W(2JX.class, 83215616) == null) {
                return true;
            }
            0fH.A0k(str2, "FxCalInitQueryResponse received error response");
            if (e1u.getContext() == null) {
                return false;
            }
            0fH.A0l(str2, "Showing error dialog");
            2JY A0W = A0L.A0W(2JX.class, 83215616);
            2JX A0M = A0W != null ? 1BL.A0M(A0W, 433112075, -1306790927) : null;
            TreeJNI A0L3 = A0L.A0L(-719011917, 2JX.class, -1676583161);
            if (A0M != null) {
                DialogInterface.OnClickListener fJt = new FJt(e1u, A0L3, 2);
                F9e f9e = (F9e) 1Br.A0B(e1u.A08);
                Context requireContext = e1u.requireContext();
                MigColorScheme migColorScheme = ((BJB) e1u).A01;
                11T.A0A(migColorScheme);
                f9e.A01(requireContext, fJt, e1u.A03, A0M, migColorScheme);
                return false;
            }
            str = "Error null in fxcalInit";
        }
        A0A(e1u, str);
        return false;
    }

    public static final boolean A0C(2JX r301, E1U e1u) {
        if (r301 == null) {
            0fH.A0l(A0H, "FxCalInitQueryResponse contentInfo null");
            return false;
        }
        if (1BL.A0L(r301, -1177318867, -1421601617) != null && r301.A0r(1430150307) != null) {
            return true;
        }
        DSI dsi = e1u.A02;
        if (dsi != null) {
            return 11T.A0O(dsi.A03, "MESSENGER_INTEROP");
        }
        11T.A0L("fxCalLinkingViewModel");
        throw 0Q8.createAndThrow();
    }

    public 1iF A1R() {
        return AbF.A0C(141073731263171L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1U.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            String str = A0H;
            boolean z = true;
            if (lithoView != null) {
                z = false;
            }
            0fH.A14(str, "updateContent() container or context null container null=%b", 4YU.A1b(z));
            return;
        }
        A1b();
        DSI dsi = this.A02;
        if (dsi != null) {
            if (!A0C(dsi.A01, this)) {
                return;
            }
            0fH.A0l(A0H, "Updating content from viewmodel");
            DSI dsi2 = this.A02;
            if (dsi2 != null) {
                A07(dsi2.A01, this);
                return;
            }
        }
        11T.A0L("fxCalLinkingViewModel");
        throw 0Q8.createAndThrow();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super/*X.DZJ*/.onActivityResult(i, i2, intent);
        A1d();
        if (i == 1523) {
            ((FHQ) 1Br.A0B(this.A06)).A08(intent, (String) null, i2, false);
        }
        String str2 = "fxCalLinkingViewModel";
        if (i2 == -1) {
            boolean z = true;
            if (i != 1523) {
                0fH.A14(A0H, "Invalid web auth request code %d in activity result", AnonymousClass001.A1a(i));
                str = "Invalid web auth request code";
            } else if (intent == null || intent.getStringExtra("KEY_URL") == null) {
                String str3 = A0H;
                if (intent != null) {
                    z = false;
                }
                0fH.A14(str3, "Invalid data in activity result data null=%b", 4YU.A1b(z));
                7zP.A0e(this.A0B).markerPoint(857807376, "WEB_AUTH_FAIL");
                str = "Invalid data in activity result data";
            } else {
                FHc fHc = this.A01;
                if (fHc != null) {
                    DSI dsi = this.A02;
                    if (dsi != null) {
                        FHc.A02(FHc.A00(dsi), fHc, "web_auth_success");
                        7zP.A0e(this.A0B).markerPoint(857807376, "WEB_AUTH_SUCCESS");
                        String stringExtra = intent.getStringExtra("KEY_URL");
                        if (stringExtra == null) {
                            throw 1BK.A0h();
                        }
                        0fH.A0l(A0H, "Verifying webauth in onActivityResult");
                        C00i c00i = this.A06.A00;
                        2Jd A03 = ((FHQ) c00i.get()).A03(stringExtra);
                        FHQ fhq = (FHQ) c00i.get();
                        if (this.A00 == null) {
                            str2 = "fbUserSession";
                        } else {
                            DSI dsi2 = this.A02;
                            if (dsi2 != null) {
                                String str4 = dsi2.A03;
                                FwL fwL = this.A0F;
                                11T.A0F(fwL, 3);
                                1Br.A0D(fhq.A07, fwL, FHQ.A00((2Jd) null, A03, fhq, str4));
                                return;
                            }
                        }
                    }
                    11T.A0L(str2);
                }
                11T.A0L("fxCalLogger");
            }
            A0A(this, str);
            return;
        }
        FHc fHc2 = this.A01;
        if (fHc2 != null) {
            DSI dsi3 = this.A02;
            if (dsi3 != null) {
                FHc.A02(FHc.A00(dsi3), fHc2, "web_auth_canceled");
                1Br r0 = this.A0B;
                7zP.A0e(r0).markerPoint(857807376, "WEB_AUTH_CANCELED");
                DSI dsi4 = this.A02;
                if (dsi4 != null) {
                    if (dsi4.A01 == null) {
                        7zP.A0e(r0).markerEnd(857807376, (short) 4);
                        A1a();
                        return;
                    }
                    return;
                }
            }
            11T.A0L(str2);
        }
        11T.A0L("fxCalLogger");
        throw 0Q8.createAndThrow();
    }
}
