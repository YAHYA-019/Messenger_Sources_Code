package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import java.io.Serializable;

/* loaded from: B8z.class */
public final class B8z extends BJB {
    public static final String __redex_internal_original_name = "SuggestedReplySettingsFragment";
    public FbUserSession A00;
    public C00i A01;
    public C00i A02;
    public C6W A03;
    public boolean A04;
    public final C00i A05 = 1BV.A00(83250);
    public final C00i A06 = 1BV.A00(83811);
    public final C5ww A08 = Cvn.A00(this, 25);
    public final DEn A07 = new CiV(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        1Br r304;
        super/*X.1pK*/.onAttach(context);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = A0G;
        this.A01 = 7zL.A0R(context, 82295);
        this.A02 = 7zL.A0R(context, 83810);
        this.A04 = ((CIW) this.A06.get()).A02();
        ((BRS) this.A01.get()).A00(A0G, this.A07);
        Bundle bundle = this.mArguments;
        Serializable serializable = bundle != null ? bundle.getSerializable("feature") : null;
        Bot bot = (Bot) this.A02.get();
        if (11T.A0O(serializable, "sayt")) {
            r304 = bot.A00;
        } else {
            11T.A0O(serializable, "suggested_reply");
            r304 = bot.A01;
        }
        this.A03 = (C6W) 1Br.A0B(r304);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(831614977);
        if (getContext() != null) {
            BO9 bo9 = null;
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                bo9 = bundle2.getSerializable("settings_entrypoint");
            }
            C6W c6w = this.A03;
            1UG A08 = 1BK.A08(c6w.A01(), 1BJ.A00(1058));
            if (A08.isSampled()) {
                1UG.A02(A08, "biim");
                0DA r0 = new 0DA();
                r0.A01(bo9, "entry");
                C6W.A00(r0, A08, c6w);
            }
        }
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(1850729858, A02);
        return A1Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(2047396837);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A1c();
        0FI.A08(-2025602132, A02);
    }
}
