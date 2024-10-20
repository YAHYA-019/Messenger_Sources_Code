package X;

import android.view.View;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cwg.class */
public final class Cwg implements AnonymousClass553 {
    public final int A00;
    public final Object A01;

    public Cwg(MessageRequestsHomeFragment messageRequestsHomeFragment, int i) {
        this.A00 = i;
        this.A01 = messageRequestsHomeFragment;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.facebook.messaging.wellbeing.unknowncontact.messagerequests.threadlist.MessageRequestsHomeFragment, androidx.fragment.app.Fragment] */
    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        2On r0;
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                ?? r02 = (MessageRequestsHomeFragment) this.A01;
                if (r02.getContext() != null) {
                    C00i c00i = r02.A0C.A00;
                    Bqx bqx = (Bqx) c00i.get();
                    Bim bim = r02.A0M;
                    11T.A0F(bim, 0);
                    bqx.A00 = bim;
                    2On r03 = r02.A05;
                    if (r03 != null) {
                        Bqx bqx2 = (Bqx) c00i.get();
                        MigColorScheme migColorScheme = r02.A06;
                        if (migColorScheme == null) {
                            11T.A0L("colorScheme");
                            throw 0Q8.createAndThrow();
                        }
                        boolean BNT = r03.BNT();
                        boolean BNV = r03.BNV();
                        8Ca A01 = ((C9kp) 1Br.A0B(bqx2.A02)).A01(view, migColorScheme);
                        ((7QJ) A01).A01 = bqx2.A01;
                        LQD lqd = ((7QJ) A01).A04;
                        11T.A0A(lqd);
                        if (BNV) {
                            lqd.add(0, 1, 0, 2131959785);
                        }
                        int i = 2;
                        int i2 = 2131959788;
                        if (BNT) {
                            i = 3;
                            i2 = 2131959793;
                        }
                        lqd.add(0, i, 0, i2);
                        A01.A00();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ?? r04 = (MessageRequestsHomeFragment) this.A01;
                if (r04.getContext() != null) {
                    MessageRequestsHomeFragment.A08(r04, 11);
                    2On r05 = r04.A05;
                    if (r05 != null) {
                        r05.APR();
                        return;
                    }
                    return;
                }
                return;
            default:
                ?? r06 = (MessageRequestsHomeFragment) this.A01;
                if (r06.getContext() == null || (r0 = r06.A05) == null) {
                    return;
                }
                r0.AMk();
                return;
        }
    }
}
