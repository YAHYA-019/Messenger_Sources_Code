package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Akr, reason: case insensitive filesystem */
/* loaded from: Akr.class */
public final class C1538Akr extends 1pK {
    public static Integer A02;
    public static final int A03 = View.generateViewId();
    public static final String __redex_internal_original_name = "EventListWrapperFragment";
    public final C01i A01 = C01g.A01(new AKM(this, 2));
    public final 1Br A00 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        if (bundle == null) {
            bundle = requireArguments();
        }
        String string = bundle.getString("thread_type");
        if (string == null) {
            throw 1BK.A0h();
        }
        A02 = R0e.A00(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = 0FI.A02(-1941733813);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        AbH.A1J(linearLayout, -1);
        LithoView A0M = 7zR.A0M(this);
        C5yw A0b = 7zN.A0b(A0M.A09, false);
        CxE.A01(A0b, this, 34);
        A0b.A2b(7zQ.A0m(this.A00));
        A0b.A2f(getString(2131956638));
        A0b.A2N(true);
        AbH.A1R(A0M, A0b);
        linearLayout.addView(A0M);
        FrameLayout A08 = AbJ.A08(this);
        A08.setId(A03);
        AbH.A1J(A08, -1);
        linearLayout.addView(A08);
        0FI.A08(1312122368, A022);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Bundle A0E;
        String str;
        String str2;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            MigColorScheme.A00(view, 7zQ.A0m(this.A00));
            Integer num = A02;
            if (num == null) {
                11T.A0L("eventThreadType");
                throw 0Q8.createAndThrow();
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                ThreadKey threadKey = (ThreadKey) this.A01.getValue();
                11T.A0F(threadKey, 0);
                A0E = 7zR.A0E(threadKey);
                str = "thread_type";
                str2 = "PUBLIC_CHATS";
            } else {
                if (intValue != 1) {
                    throw 1BK.A1F();
                }
                ThreadKey threadKey2 = (ThreadKey) this.A01.getValue();
                11T.A0F(threadKey2, 0);
                A0E = 7zR.A0E(threadKey2);
                str = "thread_type";
                str2 = "COMMUNITY_MESSAGING";
            }
            A0E.putString(str, str2);
            Fragment alV = new AlV();
            alV.setArguments(A0E);
            C06c A0G = 7zL.A0G(7zN.A08(this));
            A0G.A0L(alV, A03);
            C06c.A00(A0G, false);
        }
    }
}
