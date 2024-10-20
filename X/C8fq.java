package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8fq, reason: invalid class name */
/* loaded from: 8fq.class */
public final class C8fq extends 1LH {
    public static final CallerContext A03 = CallerContext.A0B("InstantAvatarProfileImagesComponent");
    public final int A00;
    public final Integer A01;
    public final C00m A02;

    public C8fq(Integer num, C00m c00m, int i) {
        11T.A0F(num, 3);
        this.A02 = c00m;
        this.A00 = i;
        this.A01 = num;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, SHi.A00);
        4FL.A00(c2k5, AQu.A00(c2k5, this, new 9Ph(A00, this), 4), 7zL.A1Y());
        List list = (List) A00.A02;
        if (list.isEmpty()) {
            return null;
        }
        1Iw r0 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            5BH A01 = 5BG.A01(r0);
            7zM.A1J(A01, A0i);
            A01.A2b(A03);
            float f = this.A00;
            A01.A0l(f);
            A01.A0z(f);
            A01.A13(-11.0f);
            C07004ik A002 = C06984ii.A00();
            ((C07014il) A002).A09 = new Q9P(true);
            C06984ii.A01(A01, A002);
            5BG A0K = 7zL.A0K(A01);
            if (A0K != null) {
                A0s.add(A0K);
            }
        }
        return new C1rh(null, null, null, null, A0s, false);
    }
}
