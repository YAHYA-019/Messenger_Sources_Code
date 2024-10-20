package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.8v8, reason: invalid class name */
/* loaded from: 8v8.class */
public final class C8v8 extends BJB {
    public static final String __redex_internal_original_name = "MemoriesThreadOptOutFragment";
    public FbUserSession A00;
    public 9Y6 A01;
    public Context A02;
    public LithoView A03;
    public final C01i A05 = C01g.A00(C03i.A02, AMu.A00);
    public final 1Br A04 = 7zM.A0R();

    public static final void A03(C8v8 c8v8, List list) {
        String str;
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131959432;
        By5 A00 = c9bw.A00();
        LithoView lithoView = c8v8.A03;
        if (lithoView != null) {
            Context context = c8v8.A02;
            if (context == null) {
                str = "context";
            } else {
                1Iw A0W = 7zL.A0W(context);
                MigColorScheme migColorScheme = ((BJB) c8v8).A01;
                11T.A0A(migColorScheme);
                FbUserSession fbUserSession = c8v8.A00;
                if (fbUserSession != null) {
                    lithoView.A0y(c8v8.A1Z(new 8ZH(fbUserSession, migColorScheme, list, new AW4(c8v8, 21)), A0W, A00));
                    return;
                }
                str = "fbUserSession";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public 1iF A1R() {
        return new 1iF(1065372051377103L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 1BM.A01(this);
    }

    public void A1c() {
        A03(this, C0ty.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-984069477);
        LithoView A0M = 7zR.A0M(this);
        A0M.setClickable(true);
        this.A03 = A0M;
        0FI.A08(1402424419, A02);
        return A0M;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1530686825);
        super/*X.DZJ*/.onDestroyView();
        this.A03 = null;
        0FI.A08(1005773022, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A02 = 4YU.A08(view);
        Executor A11 = 4YV.A11(this.A04);
        Context context = this.A02;
        if (context == null) {
            str = "context";
        } else {
            9Y6 r0 = new 9Y6(context, A11);
            this.A01 = r0;
            if (this.A00 != null) {
                AVD A01 = AVD.A01(this, 44);
                7zM.A0K(r0.A00).A0C(7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FetchHiddenThreadsQuery", (String) null, "fbandroid", -1385857732, 0, 2958949693L, 2958949693L, false, true)), new D4p(r0, A01, 39), r0.A01);
                A1c();
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
