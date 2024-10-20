package com.facebook.presence.note.ui.creation;

import X.03Y;
import X.0FI;
import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Lo;
import X.1pI;
import X.1pK;
import X.1pN;
import X.1vD;
import X.2S2;
import X.2TI;
import X.2Tj;
import X.2ZM;
import X.4YU;
import X.5Rf;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.7zT;
import X.8LZ;
import X.96W;
import X.9LV;
import X.9La;
import X.9PP;
import X.9Wa;
import X.9YL;
import X.9pH;
import X.9pL;
import X.AOT;
import X.AQW;
import X.AQp;
import X.AVG;
import X.AnonymousClass001;
import X.Bnh;
import X.C01g;
import X.C01i;
import X.C03513yC;
import X.C03i;
import X.C2iw;
import X.C5ic;
import X.C8i3;
import X.C9am;
import X.C9ck;
import X.C9h6;
import X.C9oG;
import X.DR6;
import X.EnumC03533yL;
import X.K8M;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import java.io.Serializable;
import java.util.List;

/* loaded from: NotesCreationFragment.class */
public final class NotesCreationFragment extends 1pK implements 1pN {
    public static final 9Wa A0V = new Object();
    public int A01;
    public Context A02;
    public InputMethodManager A03;
    public EnumC03533yL A04;
    public FbUserSession A05;
    public 1pI A06;
    public LithoView A07;
    public C9h6 A08;
    public 8LZ A09;
    public MusicData A0A;
    public 9pL A0B;
    public Long A0C;
    public String A0D;
    public List A0E;
    public 03Y A0F;
    public boolean A0G;
    public 2Tj A0H;
    public final 1Br A0I;
    public final List A0K;
    public final C01i A0L;
    public final C01i A0M;
    public final C01i A0N;
    public final C01i A0O;
    public final C01i A0P;
    public final C01i A0Q;
    public final C01i A0R;
    public final C01i A0S;
    public final C01i A0T;
    public final C01i A0U;
    public float A00 = 1.0f;
    public final C2iw A0J = 7zL.A0Z();

    public NotesCreationFragment() {
        C03i c03i = C03i.A02;
        this.A0T = AQW.A00(this, c03i, 4);
        this.A0O = AQp.A00(this, c03i, 49);
        this.A0M = AQp.A00(this, c03i, 47);
        this.A0Q = AQW.A00(this, c03i, 1);
        this.A0S = AQW.A00(this, c03i, 3);
        this.A0N = AQp.A00(this, c03i, 48);
        this.A0P = AQW.A00(this, c03i, 0);
        this.A0I = 1Bq.A00(68396);
        this.A0L = AQp.A00(this, c03i, 46);
        this.A0K = AnonymousClass001.A0s();
        this.A0U = C01g.A00(c03i, AOT.A00);
        this.A0R = AQW.A00(this, c03i, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x010a -> B:13:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.presence.note.ui.creation.NotesCreationFragment r301, java.util.List r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.note.ui.creation.NotesCreationFragment.A03(com.facebook.presence.note.ui.creation.NotesCreationFragment, java.util.List, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(8LZ r301, NotesCreationFragment notesCreationFragment) {
        notesCreationFragment.A09 = r301;
        9pL r305 = notesCreationFragment.A0B;
        if (r305 == null) {
            r305 = new 9pL(7zO.A0J(notesCreationFragment), r301.A04);
            notesCreationFragment.A0B = r305;
        }
        String str = "textWatcher";
        if (r301.A04) {
            if (r305 != null) {
                r305.A01 = new C9am(r301, notesCreationFragment);
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        9PP r0 = new 9PP(r301, notesCreationFragment);
        LithoView lithoView = notesCreationFragment.A07;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            Context context = notesCreationFragment.A02;
            if (context == null) {
                str = "context";
            } else {
                MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
                MusicData musicData = notesCreationFragment.A0A;
                List list = notesCreationFragment.A0E;
                int i = notesCreationFragment.A01;
                String str2 = notesCreationFragment.A0D;
                if (str2 == null) {
                    str2 = "";
                }
                C2iw c2iw = notesCreationFragment.A0J;
                9pH r02 = (9pH) notesCreationFragment.A0U.getValue();
                9pL r03 = notesCreationFragment.A0B;
                if (r03 != null) {
                    EnumC03533yL enumC03533yL = notesCreationFragment.A04;
                    if (enumC03533yL != null) {
                        String str3 = str2;
                        lithoView.A0y(new C8i3(r02, r03, c2iw, migColorScheme, 7zO.A0c(notesCreationFragment), r301, musicData, r0, str3, list, notesCreationFragment.A00, i, AnonymousClass001.A1W(enumC03533yL, EnumC03533yL.NOTE_CONSUMPTION_MIMICRY)));
                        return;
                    }
                    str = "entrypoint";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A07(NotesCreationFragment notesCreationFragment) {
        String str;
        InputMethodManager inputMethodManager = notesCreationFragment.A03;
        if (inputMethodManager == null) {
            str = "inputMethodManager";
        } else {
            LithoView lithoView = notesCreationFragment.A07;
            if (lithoView == null) {
                str = "lithoView";
            } else {
                7zR.A12(lithoView, inputMethodManager);
                7zO.A0c(notesCreationFragment).A03();
                1pI r0 = notesCreationFragment.A06;
                str = "contentViewManager";
                if (r0 != null) {
                    if (!r0.BVa()) {
                        return;
                    }
                    1pI r02 = notesCreationFragment.A06;
                    if (r02 != null) {
                        r02.CeH("NotesCreationFragment");
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A08(com.facebook.presence.note.ui.creation.NotesCreationFragment r301) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.note.ui.creation.NotesCreationFragment.A08(com.facebook.presence.note.ui.creation.NotesCreationFragment):void");
    }

    public static final void A09(NotesCreationFragment notesCreationFragment) {
        String str;
        String str2 = notesCreationFragment.A0D;
        if ((str2 == null || str2.length() == 0) && notesCreationFragment.A0A == null) {
            C03513yC A0c = 7zO.A0c(notesCreationFragment);
            int A00 = C03513yC.A00(((C9h6) 1Br.A0B(A0c.A06)).A00());
            int i = (-1) << (-1);
            C03513yC.A01(null, A0c, null, 1, 0, A00, i, i);
            7zP.A0e(((9LV) notesCreationFragment.A0N.getValue()).A00).markerEnd(91363306, (short) 4);
            A07(notesCreationFragment);
            9La r0 = (9La) notesCreationFragment.A0S.getValue();
            Context context = notesCreationFragment.A02;
            if (context != null) {
                ((2ZM) 1Br.A0B(r0.A00)).A04(context, "682064803736605");
                return;
            }
        } else {
            notesCreationFragment.A0M.getValue();
            LithoView lithoView = notesCreationFragment.A07;
            if (lithoView == null) {
                str = "lithoView";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            Context A08 = 4YU.A08(lithoView);
            Context context2 = notesCreationFragment.A02;
            if (context2 != null) {
                DR6 A01 = C5ic.A01(A08, (MigColorScheme) 1Bn.A0E(context2, (1BY) null, 16979));
                A01.A00(2131967649);
                A01.A06(2131962233);
                C9oG.A01(A01, notesCreationFragment, 65, 2131962231);
                C9oG.A02(A01, notesCreationFragment, 66, 2131962232);
                7zN.A13(A01);
                return;
            }
        }
        str = "context";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0A(NotesCreationFragment notesCreationFragment) {
        A07(notesCreationFragment);
        5Rf r0 = (5Rf) 1Br.A0B(notesCreationFragment.A0I);
        r0.A02 = true;
        7zP.A0e(r0.A04).markerPoint(913375233, "creation_screen_closed");
        5Rf.A00(r0);
        FragmentActivity activity = notesCreationFragment.getActivity();
        if (activity != null) {
            K8M.A00(7zM.A0F(activity), 2131962198, 0).A06();
        }
    }

    public static final void A0B(NotesCreationFragment notesCreationFragment, List list) {
        String str;
        String str2 = notesCreationFragment.A0D;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (notesCreationFragment.A01 == list.size() && str2.length() == 0) {
            str3 = 0Pz.A0L(1BK.A14(list, 0), '\"', '\"');
            notesCreationFragment.A01 = 0;
        } else if (notesCreationFragment.A01 != list.size()) {
            str3 = 0Pz.A0L(1BK.A14(list, notesCreationFragment.A01), '\"', '\"');
        }
        if (notesCreationFragment.A01 == 0) {
            InputMethodManager inputMethodManager = notesCreationFragment.A03;
            if (inputMethodManager == null) {
                str = "inputMethodManager";
            } else {
                LithoView lithoView = notesCreationFragment.A07;
                if (lithoView == null) {
                    str = "lithoView";
                } else {
                    inputMethodManager.hideSoftInputFromWindow(lithoView.getWindowToken(), 0);
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        notesCreationFragment.A0D = str3;
        notesCreationFragment.A01 = (notesCreationFragment.A01 + 1) % (list.size() + 1);
        notesCreationFragment.A00 = 1.05f;
        8LZ r0 = notesCreationFragment.A09;
        if (r0 != null) {
            A06(r0, notesCreationFragment);
        } else {
            str = "viewDataModel";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public static final boolean A0C(NotesCreationFragment notesCreationFragment) {
        String str;
        int i;
        List list = notesCreationFragment.A0E;
        boolean z = false;
        if (list != null && (str = notesCreationFragment.A0D) != null && str.length() != 0 && (i = notesCreationFragment.A01) > 0 && !str.equals(0Pz.A0L(1BK.A14(list, i - 1), '\"', '\"'))) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = 1BM.A01(this);
        Context requireContext = requireContext();
        this.A02 = requireContext;
        FbUserSession fbUserSession = this.A05;
        Serializable serializable = null;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        this.A08 = (C9h6) 1Lo.A04(requireContext, fbUserSession, (1BY) null, 68391);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable("entrypoint_key");
        }
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.MsgrNoteEntryPoint");
        this.A04 = (EnumC03533yL) serializable;
    }

    public boolean Bkd() {
        A09(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(-1315222917);
        7zP.A0e(((9LV) this.A0N.getValue()).A00).markerStart(91363306);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        7zT.A1A(this);
        this.A03 = 7zS.A0C(requireContext());
        FbUserSession fbUserSession = this.A05;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            Context context = this.A02;
            if (context == null) {
                str = "context";
            } else {
                this.A0H = (2Tj) 1Lo.A04(context, fbUserSession, (1BY) null, 33122);
                this.A07 = 7zR.A0M(this);
                2S2 r0 = (2S2) 1Bi.A03(66368);
                LithoView lithoView = this.A07;
                str = "lithoView";
                if (lithoView != null) {
                    r0.A01(lithoView, this, "notes_creation");
                    this.A0G = ((2TI) this.A0P.getValue()).A00.AZk(72340842836332774L);
                    LithoView lithoView2 = this.A07;
                    if (lithoView2 != null) {
                        0FI.A08(-939856445, A02);
                        return lithoView2;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1752720127);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        7zT.A19(this);
        0FI.A08(-730142811, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1757620604);
        super/*androidx.fragment.app.Fragment*/.onResume();
        7zT.A1A(this);
        0FI.A08(-1068367277, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = 1vD.A00(view);
        Context context = this.A02;
        String str = "context";
        if (context != null) {
            String A0u = 1BK.A0u(context, 2131962214);
            Context context2 = this.A02;
            if (context2 != null) {
                String A0u2 = 1BK.A0u(context2, 2131962212);
                C01i c01i = this.A0P;
                8LZ r0 = new 8LZ(A0u, A0u2, (List) null, false, ((2TI) c01i.getValue()).A04(true), false);
                A06(r0, this);
                if (r0.A04) {
                    ((9YL) 7zM.A1B(this.A0R)).A00(11T.A03(96W.A03), 7zQ.A14(), AVG.A01(this, 20));
                }
                A08(this);
                if (!((2TI) c01i.getValue()).A02()) {
                    return;
                }
                FbUserSession fbUserSession = this.A05;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    Context context3 = this.A02;
                    if (context3 != null) {
                        C9ck c9ck = (C9ck) 1Lo.A04(context3, fbUserSession, (1BY) null, 68401);
                        c9ck.A01 = new Bnh(c9ck, 7zR.A0s());
                        c9ck.A00(true, true);
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
