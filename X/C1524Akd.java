package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.BitSet;

/* renamed from: X.Akd, reason: case insensitive filesystem */
/* loaded from: Akd.class */
public final class C1524Akd extends 1pK {
    public static final String __redex_internal_original_name = "CommunityProfileFragment";
    public 1pI A00;
    public LithoView A01;
    public Community A02;
    public MigColorScheme A03;
    public final 1Br A04 = 1Bu.A00(83430);

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -103340253);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        0FI.A08(902791862, A04);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        FbUserSession A01 = 1BM.A01(this);
        String str = "community";
        Parcelable parcelable = requireArguments().getParcelable(str);
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        this.A02 = (Community) parcelable;
        LithoView lithoView = this.A01;
        if (lithoView != null) {
            this.A03 = 7zV.A0S(this);
            C3R9 c3r9 = new C3R9();
            Community community = this.A02;
            if (community != null) {
                ParcelableSecondaryData A0w = AbG.A0w(community, c3r9);
                LithoView lithoView2 = this.A01;
                if (lithoView2 != null) {
                    C1824Atx c1824Atx = new C1824Atx(lithoView2.A09, new C2017Aze());
                    C2017Aze c2017Aze = c1824Atx.A01;
                    c2017Aze.A03 = A01;
                    BitSet bitSet = c1824Atx.A02;
                    bitSet.set(2);
                    c2017Aze.A02 = getViewLifecycleOwner();
                    bitSet.set(4);
                    c2017Aze.A01 = getParentFragmentManager();
                    bitSet.set(3);
                    c2017Aze.A06 = AbJ.A0n(this.A04);
                    bitSet.set(7);
                    MigColorScheme migColorScheme = this.A03;
                    if (migColorScheme != null) {
                        c2017Aze.A04 = migColorScheme;
                        bitSet.set(0);
                        c2017Aze.A00 = 1BK.A05();
                        bitSet.set(5);
                        c2017Aze.A07 = A0w;
                        bitSet.set(1);
                        c2017Aze.A05 = CxE.A00(this, 30);
                        bitSet.set(6);
                        7zP.A17(c1824Atx, bitSet, c1824Atx.A03);
                        lithoView.A0y(c2017Aze);
                        this.A00 = 1vD.A00(view);
                        return;
                    }
                    str = "colorScheme";
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        str = "lithoView";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
