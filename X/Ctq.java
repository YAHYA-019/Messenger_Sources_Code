package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharing.contentdiscovery.bottomsheet.LifeEventsBottomSheetDialogFragment;
import com.facebook.messaging.sharing.contentdiscovery.model.LifeEvent;
import java.io.Serializable;

/* loaded from: Ctq.class */
public final class Ctq implements DJb {
    public final /* synthetic */ C1560Ale A00;

    public Ctq(C1560Ale c1560Ale) {
        this.A00 = c1560Ale;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Ale] */
    @Override // X.DJb
    public void C2a(ThreadKey threadKey, LifeEvent lifeEvent) {
        String str;
        ?? r0 = this.A00;
        1fF r02 = r0.A01;
        if (r02 != null) {
            if (!r02.A04()) {
                C8c c8c = (C8c) 1Br.A0B(r0.A09);
                BLX blx = BLX.A03;
                int i = lifeEvent.A01;
                int i2 = lifeEvent.A00;
                Integer num = 0S2.A00;
                String str2 = lifeEvent.A08;
                11T.A0A(str2);
                String str3 = lifeEvent.A0B;
                11T.A0A(str3);
                c8c.A01(blx, num, str2, str3, lifeEvent.A0A, i, i2);
            }
            CJ7 cj7 = r0.A04;
            if (cj7 != null) {
                BLX blx2 = BLX.A03;
                int i3 = lifeEvent.A01;
                int i4 = lifeEvent.A00;
                Integer num2 = 0S2.A00;
                String str4 = lifeEvent.A08;
                11T.A0A(str4);
                String str5 = lifeEvent.A0B;
                11T.A0A(str5);
                cj7.A04(blx2, num2, str4, str5, lifeEvent.A0A, i3, i4);
                1fF r03 = r0.A01;
                if (r03 != null) {
                    if (!r03.A04()) {
                        ((6HS) 7zO.A0m((Fragment) r0, 50024)).A07(threadKey, "content_discovery_life_event");
                        return;
                    }
                    C7F c7f = (C7F) 7zO.A0l((Fragment) r0, 83093);
                    Context requireContext = r0.requireContext();
                    CJ7 cj72 = r0.A04;
                    if (cj72 != null) {
                        synchronized (cj72) {
                            str = cj72.A01;
                        }
                        c7f.A00(requireContext, lifeEvent, str);
                        CJ7 cj73 = r0.A04;
                        if (cj73 != null) {
                            cj73.A01();
                            return;
                        }
                    }
                }
            }
            11T.A0L("lifeEventsLogger");
            throw 0Q8.createAndThrow();
        }
        11T.A0L("sharingConfig");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, X.Ale] */
    @Override // X.DJb
    public boolean C2j(ThreadKey threadKey, LifeEvent lifeEvent) {
        ?? r0 = this.A00;
        CJ7 cj7 = r0.A04;
        if (cj7 == null) {
            11T.A0L("lifeEventsLogger");
            throw 0Q8.createAndThrow();
        }
        Serializable serializable = BLX.A03;
        cj7.A02(serializable, lifeEvent.A00, lifeEvent.A01);
        2Ov lifeEventsBottomSheetDialogFragment = new LifeEventsBottomSheetDialogFragment();
        Bundle A0E = 7zR.A0E(threadKey);
        A0E.putSerializable("surface", serializable);
        A0E.putParcelable("life_event", lifeEvent);
        lifeEventsBottomSheetDialogFragment.setArguments(A0E);
        lifeEventsBottomSheetDialogFragment.A0i(r0.getChildFragmentManager(), "LifeEventsBottomSheetDialogFragment");
        return true;
    }

    @Override // X.DJb
    public /* synthetic */ void CJl() {
    }
}
