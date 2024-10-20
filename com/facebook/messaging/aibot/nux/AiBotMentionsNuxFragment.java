package com.facebook.messaging.aibot.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.2cK;
import X.2cM;
import X.3vU;
import X.4YT;
import X.6KV;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zR;
import X.7zS;
import X.82O;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.AbH;
import X.AbO;
import X.BOj;
import X.BoU;
import X.C1u3;
import X.C5yv;
import X.C5yw;
import X.C77c;
import X.C8nn;
import X.C8xf;
import X.CZD;
import X.CxE;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.List;

/* loaded from: AiBotMentionsNuxFragment.class */
public final class AiBotMentionsNuxFragment extends SlidingSheetFullScreenDialogFragment {
    public BoU A00;
    public C77c A01;
    public MigColorScheme A02;
    public 3vU A03;
    public 6KV A04;
    public LithoView A05;

    /* JADX WARN: Multi-variable type inference failed */
    public static final BOj A05(AiBotMentionsNuxFragment aiBotMentionsNuxFragment) {
        Bundle bundle = aiBotMentionsNuxFragment.mArguments;
        BOj bOj = null;
        Serializable serializable = bundle != null ? bundle.getSerializable(4YT.A00(520)) : null;
        if (serializable instanceof BOj) {
            bOj = (BOj) serializable;
        }
        return bOj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(856969525);
        this.A02 = 7zS.A0j(this);
        this.A01 = (C77c) 7zO.A0l(this, 68283);
        this.A03 = (3vU) 1Bn.A0A(68258);
        6KV A00 = ((82O) 1Bn.A0A(65571)).A00(requireContext());
        this.A04 = A00;
        A00.A02();
        LithoView A0M = 7zR.A0M(this);
        this.A05 = A0M;
        0FI.A08(-1612457485, A02);
        return A0M;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-372782693);
        super.onDestroyView();
        this.A05 = null;
        6KV r0 = this.A04;
        if (r0 == null) {
            11T.A0L("viewOrientationLockHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A05(-1);
        0FI.A08(-466137409, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A05;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            MigColorScheme migColorScheme = this.A02;
            String str = "colorScheme";
            if (migColorScheme != null) {
                MigColorScheme.A00(lithoView, migColorScheme);
                2cM A01 = 2cK.A01(r0, (String) null, 0);
                11T.A0D(r0);
                C5yw A00 = C5yv.A00(r0);
                MigColorScheme migColorScheme2 = this.A02;
                if (migColorScheme2 != null) {
                    A00.A2b(migColorScheme2);
                    CxE.A01(A00, this, 6);
                    A00.A2i(false);
                    AbH.A1Q(A01, A00);
                    8Tn A002 = C8nn.A00(r0);
                    MigColorScheme migColorScheme3 = this.A02;
                    if (migColorScheme3 != null) {
                        A002.A2a(migColorScheme3);
                        C8xf c8xf = new C8xf(null, 2132346588);
                        List A0v = 7zN.A0v(8Ll.A01(C1u3.A3Y, r0.A0D(2131952549), r0.A0D(2131952545), (String) null, 8), 8Ll.A01(C1u3.A61, r0.A0D(2131952550), r0.A0D(2131952548), (String) null, 8), 8Ll.A01(C1u3.A3N, r0.A0D(2131952560), r0.A0D(2131952555), (String) null, 8));
                        String A0D = r0.A0D(2131952562);
                        8Lf r02 = new 8Lf(CZD.A00(this, 25), CZD.A00(this, 26), A0D, r0.A0D(2131952561));
                        String A0D2 = r0.A0D(2131952551);
                        C77c c77c = this.A01;
                        if (c77c == null) {
                            str = "aiBotNuxUtils";
                        } else {
                            Context requireContext = requireContext();
                            if (this.A02 != null) {
                                SpannableString A012 = C77c.A01(requireContext, c77c, false);
                                11T.A0D(A0D2);
                                A002.A2Y(new 8NJ(r02, c8xf, (CharSequence) null, A012, A0D2, A0v, true));
                                lithoView.A0y(7zL.A0V(A01, A002.A2W()));
                                3vU r03 = this.A03;
                                if (r03 != null) {
                                    r03.A0G(A05(this), AbO.A0C(this));
                                    return;
                                }
                                str = "logger";
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
