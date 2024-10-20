package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.contentdiscovery.bottomsheet.LifeEventsBottomSheetDialogFragment;
import com.facebook.messaging.sharing.contentdiscovery.model.LifeEvent;
import java.io.Serializable;

/* loaded from: Ctp.class */
public final class Ctp implements DJb {
    public final /* synthetic */ FriendsTabFragment A00;

    public Ctp(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.DJb
    public void C2a(ThreadKey threadKey, LifeEvent lifeEvent) {
        String str;
        ?? r0 = this.A00;
        if (r0.getContext() != null) {
            if (r0.A0S != null) {
                if (!r0.A1I.A04()) {
                    ((C8c) r0.A0p.get()).A01(BLX.A02, 0S2.A00, lifeEvent.A08, lifeEvent.A0B, lifeEvent.A0A, lifeEvent.A01, lifeEvent.A00);
                }
                r0.A0S.A04(BLX.A02, 0S2.A00, lifeEvent.A08, lifeEvent.A0B, lifeEvent.A0A, lifeEvent.A01, lifeEvent.A00);
            }
            if (!r0.A1I.A04()) {
                ((6HS) 1Hv.A02(r0.getContext(), 50024)).A07(threadKey, "content_discovery_life_event");
                return;
            }
            C7F c7f = (C7F) 1Bn.A0E(r0.getContext(), (1BY) null, 83093);
            CJ7 cj7 = r0.A0S;
            if (cj7 != null) {
                synchronized (cj7) {
                    str = cj7.A01;
                }
            } else {
                str = null;
            }
            c7f.A00(r0.getContext(), lifeEvent, str);
            CJ7 cj72 = r0.A0S;
            if (cj72 != null) {
                cj72.A01();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.DJb
    public boolean C2j(ThreadKey threadKey, LifeEvent lifeEvent) {
        ?? r0 = this.A00;
        CJ7 cj7 = r0.A0S;
        if (cj7 != null) {
            cj7.A02(BLX.A02, lifeEvent.A00, lifeEvent.A01);
        }
        Serializable serializable = BLX.A02;
        2Ov lifeEventsBottomSheetDialogFragment = new LifeEventsBottomSheetDialogFragment();
        Bundle A0E = 7zR.A0E(threadKey);
        A0E.putSerializable("surface", serializable);
        A0E.putParcelable("life_event", lifeEvent);
        lifeEventsBottomSheetDialogFragment.setArguments(A0E);
        lifeEventsBottomSheetDialogFragment.A0i(r0.getChildFragmentManager(), "LifeEventsBottomSheetDialogFragment");
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.fragment.app.Fragment, X.Ale] */
    @Override // X.DJb
    public void CJl() {
        FriendsTabFragment friendsTabFragment = this.A00;
        CJ7 cj7 = friendsTabFragment.A0S;
        if (cj7 != null && cj7.A01 != null) {
            1UG A08 = 1BK.A08(1Br.A02(cj7.A03), 1BJ.A00(1208));
            if (A08.isSampled()) {
                String str = cj7.A01;
                if (str == null) {
                    throw 1BK.A0h();
                }
                AbF.A1N(A08, str);
                A08.A0B("entry_point");
                A08.BZL();
            }
        }
        if (friendsTabFragment.A04.BVa()) {
            ?? c1560Ale = new C1560Ale();
            Bv2 bv2 = friendsTabFragment.A0R;
            if (bv2 != null) {
                c1560Ale.A02 = bv2;
            }
            friendsTabFragment.A04.Czz((Fragment) c1560Ale, 0S2.A0u, C1560Ale.__redex_internal_original_name);
        }
    }
}
