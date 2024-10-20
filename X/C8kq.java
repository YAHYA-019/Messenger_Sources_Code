package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8kq, reason: invalid class name */
/* loaded from: 8kq.class */
public final class C8kq extends C1rj {
    public AZQ A00;
    public List A01;

    public C8kq() {
        super("ContextRepliesComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        List list = this.A01;
        11T.A0F(r302, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16980);
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        C1rq A0Q = 7zN.A0Q(r302, 0);
        C1ro c1ro = C1ro.CENTER;
        A0Q.A2h(c1ro);
        C1rp c1rp = C1rp.CENTER;
        A0Q.A2i(c1rp);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return A0Q.A00;
            }
            Object next = it.next();
            i++;
            if (i3 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            C2797Goa c2797Goa = (C2797Goa) next;
            2cM A01 = 2cK.A01(r302, (String) null, 0);
            A01.A1I(2132411205);
            A01.A2g(c1ro);
            A01.A1M(2132279326);
            A01.A2T(1LI.A0C(r302, C8kq.class, "ContextRepliesComponent", new Object[]{c2797Goa}, -1755229903));
            A01.A1q(1LI.A0C(r302, C8kq.class, "ContextRepliesComponent", new Object[]{c2797Goa}, 1620922701));
            7zL.A1J(A01);
            String str = c2797Goa.A01;
            A01.A2S(7zN.A0u(r302, str, 2131960653));
            A01.A2h(c1rp);
            A01.A2B(C26z.HORIZONTAL, R.dimen.mapbox_four_dp);
            A01.A0a();
            2KD A13 = 7zM.A13(r302, str, 0);
            A13.A2x(migColorScheme);
            A13.A2e();
            A13.A2h();
            A01.A2d(A13);
            A01.A2L(0Pz.A0T("ContextualReply", i3));
            7zL.A1H(A01, A0Q);
            i2 = i;
        }
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        List list = this.A01;
        11T.A0H(r302, list);
        int i = (int) (-(4YU.A0E(r302).getDimensionPixelSize(2132279326) * 0.2d));
        int size = list.size();
        5XB[] r0 = new 5XB[size];
        for (int i2 = 0; i2 < size; i2++) {
            String A0T = 0Pz.A0T("ContextualReply", i2);
            5Rn r02 = C3s9.A04;
            5X3 A00 = C3s9.A00(r02, A0T);
            7zP.A1B(A00, C2jm.A00);
            7zM.A1U(A00, 200);
            r0[i2] = 7zV.A0H(r02, A00, 0Pz.A0T("ContextualReply", i2), i);
        }
        return new 5XA((C3s9[]) Arrays.copyOf(r0, size), 75);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        Boolean bool = null;
        if (i == -1755229903) {
            1Is r0 = r302.A00.A01;
            C2797Goa c2797Goa = (C2797Goa) r302.A03[0];
            View view = ((3xC) obj).A00;
            AZQ azq = ((C8kq) r0).A00;
            11T.A0F(c2797Goa, 2);
            if (view != null) {
                view.performHapticFeedback(1);
            }
            if (azq != null) {
                azq.BoO(c2797Goa);
                return null;
            }
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i == 1620922701) {
                1Is r02 = r302.A00.A01;
                C2797Goa c2797Goa2 = (C2797Goa) r302.A03[0];
                View view2 = ((C03173xD) obj).A00;
                AZQ azq2 = ((C8kq) r02).A00;
                7zR.A1O(c2797Goa2, view2);
                if (azq2 != null) {
                    azq2.C5C(view2, c2797Goa2);
                }
                bool = AnonymousClass001.A0K();
            }
        }
        return bool;
    }
}
