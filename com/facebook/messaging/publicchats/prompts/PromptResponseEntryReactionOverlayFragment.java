package com.facebook.messaging.publicchats.prompts;

import X.02L;
import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Br;
import X.1Lo;
import X.2Ov;
import X.6Im;
import X.6In;
import X.6qY;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.8K2;
import X.8cD;
import X.9KD;
import X.AZX;
import X.AaS;
import X.C7W1;
import X.C9bl;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.publicchats.prompt.model.PromptArgs;
import java.util.List;

/* loaded from: PromptResponseEntryReactionOverlayFragment.class */
public final class PromptResponseEntryReactionOverlayFragment extends 2Ov implements AaS, AZX {
    public 8K2 A00;
    public FbUserSession A01;
    public LithoView A02;
    public 9KD A03;
    public C9bl A04;
    public 6qY A05;
    public final 1Br A06 = 7zN.A0I(this);

    @Override // X.AaS
    public void ANi() {
        A0p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CGj(String str) {
        String str2;
        11T.A0F(str, 0);
        C9bl c9bl = this.A04;
        if (c9bl == null) {
            str2 = "presenter";
        } else {
            PromptArgs promptArgs = c9bl.A01;
            if (promptArgs == null) {
                str2 = "promptArgs";
            } else {
                ThreadKey threadKey = promptArgs.A01;
                if (threadKey == null) {
                    return;
                }
                9KD r0 = this.A03;
                if (r0 == null) {
                    str2 = "navigator";
                } else {
                    06Z parentFragmentManager = getParentFragmentManager();
                    FbUserSession fbUserSession = this.A01;
                    if (fbUserSession != null) {
                        6Im r02 = (6In) 1Br.A0B(r0.A00);
                        r02.A05.A00(parentFragmentManager, fbUserSession, 6Im.A03(r02, threadKey, str));
                        A0o();
                        return;
                    }
                    str2 = "fbUserSession";
                }
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    public void CSP(String str) {
        String str2;
        11T.A0F(str, 0);
        C9bl c9bl = this.A04;
        if (c9bl == null) {
            str2 = "presenter";
        } else {
            FbUserSession fbUserSession = this.A01;
            if (fbUserSession != null) {
                c9bl.A00(fbUserSession, str);
                A0o();
                return;
            }
            str2 = "fbUserSession";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AaS
    public void Cf3(String str, String str2) {
        String str3;
        C9bl c9bl = this.A04;
        if (c9bl == null) {
            str3 = "presenter";
        } else {
            8K2 r0 = this.A00;
            if (r0 == null) {
                str3 = "promptResponseEntry";
            } else {
                String str4 = r0.A03;
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession != null) {
                    c9bl.A01(fbUserSession, str4, null);
                    A0p();
                    return;
                }
                str3 = "fbUserSession";
            }
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AaS
    public void Cl5(String str, String str2) {
        String str3;
        11T.A0F(str2, 1);
        C9bl c9bl = this.A04;
        if (c9bl == null) {
            str3 = "presenter";
        } else {
            8K2 r0 = this.A00;
            if (r0 == null) {
                str3 = "promptResponseEntry";
            } else {
                String str4 = r0.A03;
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession != null) {
                    c9bl.A01(fbUserSession, str4, str2);
                    A0p();
                    return;
                }
                str3 = "fbUserSession";
            }
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AaS
    public void D1a() {
        A0p();
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-255233946);
        super.onCreate(bundle);
        A0g(2, 2132606976);
        0FI.A08(-583489491, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-169778715);
        LithoView A0M = 7zR.A0M(this);
        this.A02 = A0M;
        0FI.A08(628601773, A02);
        return A0M;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1011663169);
        super.onDestroyView();
        this.A02 = null;
        0FI.A08(1094426353, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Bundle bundle2 = this.mArguments;
        int i = bundle2 != null ? bundle2.getInt("reaction_bar_vertical_offset") : 0;
        this.A04 = (C9bl) 7zO.A0m(this, 68124);
        this.A03 = (9KD) 7zO.A0m(this, 68122);
        FbUserSession A01 = 1BM.A01(this);
        this.A01 = A01;
        if (A01 == null) {
            str = "fbUserSession";
        } else {
            this.A05 = (6qY) 1Lo.A08(A01, 67662);
            Rect A06 = 7zT.A06(this);
            LithoView lithoView = this.A02;
            if (lithoView == null) {
                return;
            }
            8K2 r0 = this.A00;
            if (r0 == null) {
                str = "promptResponseEntry";
            } else {
                MigColorScheme A0m = 7zQ.A0m(this.A06);
                6qY r02 = this.A05;
                if (r02 != null) {
                    List A09 = 02L.A09(r02.Ah3());
                    int A00 = C7W1.A00(requireContext());
                    int i2 = A00 - i;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    Rect A062 = 7zT.A06(this);
                    int i3 = A062.top;
                    Resources A0D = 7zO.A0D(this);
                    int dimensionPixelSize = i2 + (i3 != 0 ? A0D.getDimensionPixelSize(2132279398) + A062.top : A0D.getDimensionPixelSize(2132279326));
                    if (dimensionPixelSize > A00) {
                        dimensionPixelSize = A00;
                    }
                    if (dimensionPixelSize < 0) {
                        dimensionPixelSize = 0;
                    }
                    lithoView.A0y(new 8cD(this, A0m, r0, A09, dimensionPixelSize, A06.right));
                    return;
                }
                str = "reactionsManager";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
