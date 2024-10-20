package X;

import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9qj, reason: invalid class name */
/* loaded from: 9qj.class */
public final class C9qj implements Observer {
    public final /* synthetic */ 8H6 A00;

    public C9qj(8H6 r302) {
        this.A00 = r302;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (1BK.A1X(obj, false)) {
            8H6 r0 = this.A00;
            C9l3 c9l3 = r0.A03;
            if (c9l3 != null) {
                06Z r02 = r0.mFragmentManager;
                11T.A0A(r02);
                9hP r03 = (9hP) 1Br.A0B(c9l3.A07);
                ThreadKey threadKey = c9l3.A0B.A00;
                11T.A0F(threadKey, 1);
                if (9hP.A00(r02, "participation_nux_fragment_tag")) {
                    ((C9kt) 1Br.A0B(r03.A05)).A01(r02, threadKey, "participation_nux_fragment_tag", false, threadKey.A1A(), threadKey.A1F(), false);
                }
                C9l3 c9l32 = r0.A03;
                if (c9l32 != null) {
                    c9l32.A02.removeObserver(this);
                    return;
                }
            }
            11T.A0L("viewData");
            throw 0Q8.createAndThrow();
        }
    }
}
