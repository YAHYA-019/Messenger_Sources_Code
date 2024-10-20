package com.facebook.games.nativetos;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1HG;
import X.1Hv;
import X.1pK;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zT;
import X.AbG;
import X.AnonymousClass001;
import X.C09s;
import X.C0A2;
import X.C2125Dee;
import X.C2202Dgu;
import X.DKE;
import X.DKF;
import X.DMV;
import X.DhM;
import X.Er6;
import X.Eto;
import X.Eus;
import X.ExP;
import X.F8q;
import X.FA8;
import X.FHN;
import X.FXb;
import X.FXm;
import X.FXt;
import X.GEp;
import X.GHq;
import X.GNr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.litho.LithoView;

/* loaded from: GamingLoginNativeToSFragment.class */
public final class GamingLoginNativeToSFragment extends 1pK {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public FbUserSession A06;
    public ExP A07;
    public GHq A08;
    public Eto A09;
    public GEp A0A;
    public Eus A0B;
    public GraphQLInstantGameContextType A0C;
    public LithoView A0D;
    public Er6 A0E;
    public FA8 A0F;
    public F8q A0G;
    public boolean A0H;
    public View A0I;
    public C2125Dee A0J;
    public FHN A0K;
    public final 1Br A0N = 7zM.A0M();
    public final 1Br A0L = AbG.A0M();
    public final 1Br A0M = 1BK.A0C();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.games.nativetos.GamingLoginNativeToSFragment r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.games.nativetos.GamingLoginNativeToSFragment.A03(com.facebook.games.nativetos.GamingLoginNativeToSFragment, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Dee, android.app.Dialog] */
    public static final void A06(Context context, GamingLoginNativeToSFragment gamingLoginNativeToSFragment) {
        A08(gamingLoginNativeToSFragment);
        ?? c2125Dee = new C2125Dee(context);
        gamingLoginNativeToSFragment.A0J = c2125Dee;
        c2125Dee.setCancelable(false);
        C2125Dee c2125Dee2 = gamingLoginNativeToSFragment.A0J;
        if (c2125Dee2 != null) {
            c2125Dee2.A05(true);
        }
        C2125Dee c2125Dee3 = gamingLoginNativeToSFragment.A0J;
        if (c2125Dee3 != null) {
            c2125Dee3.A04(7zO.A0D(gamingLoginNativeToSFragment).getText(2131957324));
        }
        DMV dmv = gamingLoginNativeToSFragment.A0J;
        if (dmv != null) {
            dmv.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(GamingLoginNativeToSFragment gamingLoginNativeToSFragment) {
        View view = gamingLoginNativeToSFragment.A0I;
        if (view == null) {
            11T.A0L("nativeToSView");
            throw 0Q8.createAndThrow();
        }
        view.setVisibility(8);
        try {
            DKE.A1J(gamingLoginNativeToSFragment, gamingLoginNativeToSFragment.mFragmentManager);
        } catch (NullPointerException e) {
            1Br.A04(gamingLoginNativeToSFragment.A0L).softReport("fb_gaming_login_native_tos_screen", "GamingLoginNativeToSFragment is already destroyed", e);
        }
    }

    public static final void A08(GamingLoginNativeToSFragment gamingLoginNativeToSFragment) {
        try {
            DMV dmv = gamingLoginNativeToSFragment.A0J;
            if (dmv != null) {
                dmv.dismiss();
            }
            gamingLoginNativeToSFragment.A0J = null;
        } catch (IllegalArgumentException e) {
            1Br.A04(gamingLoginNativeToSFragment.A0L).softReport("fb_gaming_login_native_tos_screen", "QuicksilverStartScreenOverlayActivity is already destroyed, no need to dismiss Progress dialog here", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A06 = 7zT.A08(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1641916646);
        11T.A0F(layoutInflater, 0);
        int i = 2132542084;
        if (1BL.A0Q().AZk(36322001553605646L)) {
            i = 2132542083;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        11T.A0D(inflate);
        0FI.A08(-952502694, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0Q8 A0h;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            throw 1BK.A0h();
        }
        this.A0K = (FHN) 1Bi.A03(85203);
        this.A07 = (ExP) 1Hv.A02(context, 68373);
        String str2 = null;
        this.A09 = (Eto) 1Bn.A0E(context, (1BY) null, 85235);
        this.A0B = (Eus) 1Hv.A02(context, 98402);
        this.A0F = new FA8(view);
        this.A05 = DKF.A0E(view, 2131365298);
        this.A02 = DKF.A0E(view, 2131365288);
        this.A00 = C09s.A01(view, 2131365289);
        this.A04 = DKF.A0E(view, 2131365296);
        this.A01 = C09s.A01(view, 2131365290);
        this.A03 = DKF.A0E(view, 2131365298);
        this.A0D = (LithoView) C09s.A01(view, 2131365928);
        this.A0I = view;
        ExP exP = this.A07;
        if (exP == null) {
            11T.A0L("gamingLoginNativeToSContextController");
            throw 0Q8.createAndThrow();
        }
        exP.A07 = 7zL.A14(this);
        try {
            FA8 fa8 = this.A0F;
            String str3 = null;
            if (fa8 != null) {
                Er6 er6 = this.A0E;
                if (er6 != null) {
                    String str4 = er6.A0j;
                    if (str4 != null) {
                        fa8.A03.A0G(C0A2.A03(str4), FA8.A07);
                        Er6 er62 = this.A0E;
                        if (er62 != null) {
                            String str5 = er62.A0d;
                            String str6 = er62.A0e;
                            if (str6 != null) {
                                TextView textView = this.A02;
                                String str7 = "developerPrivacyTextView";
                                if (textView != null) {
                                    textView.setText(str5);
                                    TextView textView2 = this.A02;
                                    if (textView2 != null) {
                                        textView2.setTextSize(18.0f);
                                        View view2 = this.A00;
                                        str7 = "developerPrivacyLinkView";
                                        if (view2 != null) {
                                            FXm.A00(view2, this, str6, 1);
                                            View view3 = this.A00;
                                            if (view3 != null) {
                                                view3.setContentDescription(str5);
                                            }
                                        }
                                    }
                                }
                                11T.A0L(str7);
                            }
                        }
                        TextView textView3 = this.A05;
                        if (textView3 == null) {
                            11T.A0L("privacyTextView");
                        } else {
                            Er6 er63 = this.A0E;
                            textView3.setText(er63 != null ? er63.A0l : null);
                            TextView textView4 = this.A04;
                            if (textView4 == null) {
                                11T.A0L("playButton");
                            } else {
                                Er6 er64 = this.A0E;
                                if (er64 != null) {
                                    GNr gNr = er64.A09;
                                    if (gNr != null) {
                                        str2 = ((C2202Dgu) gNr).A0r(-665663753);
                                    }
                                }
                                textView4.setText(str2);
                                TextView textView5 = this.A03;
                                if (textView5 == null) {
                                    11T.A0L("permissionDescriptionView");
                                } else {
                                    ExP exP2 = this.A07;
                                    if (exP2 == null) {
                                        11T.A0L("gamingLoginNativeToSContextController");
                                    } else {
                                        CharSequence charSequence = exP2.A02;
                                        if (charSequence != null) {
                                            textView5.setText(charSequence);
                                            Context context2 = getContext();
                                            if (context2 != null) {
                                                1Br A00 = 1HG.A00(context2, 99435);
                                                View view4 = this.A01;
                                                if (view4 == null) {
                                                    11T.A0L("editPermissionButton");
                                                } else {
                                                    FXt.A01(view4, A00, context2, this, 14);
                                                    Er6 er65 = this.A0E;
                                                    if (er65 != null) {
                                                        GNr gNr2 = er65.A09;
                                                        if (gNr2 != null) {
                                                            DhM AXJ = gNr2.AXJ();
                                                            if (AXJ != null) {
                                                                str3 = AXJ.A0k();
                                                            }
                                                        }
                                                    }
                                                    if (str3 != null) {
                                                        Context context3 = getContext();
                                                        if (context3 != null) {
                                                            this.A0G = (F8q) 1Hv.A02(context3, 99435);
                                                            TextView textView6 = this.A04;
                                                            if (textView6 != null) {
                                                                textView6.setOnClickListener(new FXb(context3, this, str3, 0));
                                                                return;
                                                            }
                                                            11T.A0L("playButton");
                                                        } else {
                                                            A0h = AnonymousClass001.A0N("Required value was null.");
                                                        }
                                                    } else {
                                                        A0h = AnonymousClass001.A0N("Required value was null.");
                                                    }
                                                }
                                            } else {
                                                A0h = 1BK.A0h();
                                            }
                                            throw A0h;
                                        }
                                        11T.A0L("permissionDescription");
                                    }
                                }
                            }
                        }
                    }
                }
                A0h = 1BK.A0h();
                throw A0h;
            }
            11T.A0L("loadingIndicatorViewHolder");
            A0h = 0Q8.createAndThrow();
            throw A0h;
        } catch (IllegalStateException e) {
            e = e;
            if (getActivity() != null) {
                requireActivity().finish();
            }
            str = "GamingLoginNativeToSFragment has null iconUri: gameInformation?.iconUri";
            1Br.A04(this.A0L).softReport("fb_gaming_login_native_tos_screen", str, e);
        } catch (NullPointerException e2) {
            e = e2;
            str = "GamingLoginNativeToSFragment isn't destroyed properly in previous session which causes NPE";
            A07(this);
            1Br.A04(this.A0L).softReport("fb_gaming_login_native_tos_screen", str, e);
        } catch (Exception e3) {
            e = e3;
            if (getActivity() != null) {
                requireActivity().finish();
            }
            str = "GamingLoginNativeToSFragment isn't initialized properly due to unknown issue";
            1Br.A04(this.A0L).softReport("fb_gaming_login_native_tos_screen", str, e);
        }
    }
}
