package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Akv, reason: case insensitive filesystem */
/* loaded from: Akv.class */
public final class C1542Akv extends 1pK {
    public static final String __redex_internal_original_name = "SelectChannelFragment";
    public LithoView A01;
    public Bd2 A02;
    public ImmutableList A03;
    public long A04;
    public FbUserSession A05;
    public long A00 = -1;
    public final 1Br A06 = 7zM.A0Y();
    public final Bcr A07 = new Bcr(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1542Akv c1542Akv) {
        String str;
        if (c1542Akv.getContext() != null) {
            MigColorScheme A0j = 7zS.A0j(c1542Akv);
            Bcr bcr = c1542Akv.A07;
            ImmutableList immutableList = c1542Akv.A03;
            long j = c1542Akv.A00;
            String string = c1542Akv.requireArguments().getString("error_message_if_no_eligible_chats");
            FbUserSession fbUserSession = c1542Akv.A05;
            if (fbUserSession == null) {
                str = "fbUserSession";
            } else {
                1LI c8bk = new C8bk(fbUserSession, bcr, A0j, immutableList, string, j);
                LithoView lithoView = c1542Akv.A01;
                if (lithoView != null) {
                    lithoView.A0x(c8bk);
                    return;
                }
                str = "lithoView";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = requireArguments().getLong("community_id");
        this.A00 = bundle != null ? bundle.getLong("selected_thread_fbid") : -1;
        this.A05 = 7zV.A09(this, this.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-255978922);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        0FI.A08(439316875, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        String str;
        int A02 = 0FI.A02(618441113);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03(this);
        LithoView lithoView = this.A01;
        if (lithoView == null) {
            str = "lithoView";
        } else {
            AbO.A0N(lithoView, this);
            Bundle requireArguments = requireArguments();
            C0H c0h = (C0H) 7zO.A0m(this, 82814);
            long j = this.A04;
            boolean z = requireArguments.getBoolean("display_categories");
            boolean z2 = requireArguments.getBoolean("display_empty_categories");
            boolean z3 = requireArguments.getBoolean("display_unjoined_channels");
            int[] intArray = requireArguments.getIntArray("thread_caopability_filters");
            if (intArray == null) {
                IllegalStateException A0h = 1BK.A0h();
                0FI.A08(271823502, A02);
                throw A0h;
            }
            FbUserSession fbUserSession = this.A05;
            if (fbUserSession != null) {
                c0h.A00(fbUserSession, new DCC(this, 0), intArray, j, z, z2, z3);
                0FI.A08(359253386, A02);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putLong("selected_thread_fbid", this.A00);
    }
}
