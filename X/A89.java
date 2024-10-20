package X;

import android.content.Context;
import android.view.View;

/* loaded from: A89.class */
public final class A89 implements 74E {
    public final 2Of A00;

    public A89(2Of r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public boolean BQh(5vW r302) {
        11T.A0F(r302, 0);
        5gP r0 = ((5vV) r302).A00;
        String str = null;
        if (!(r0 instanceof 5gP)) {
            return false;
        }
        5gP r02 = r0;
        boolean z = false;
        if (r02 == null) {
            return false;
        }
        C5wn A0g = 7zO.A0g(r0);
        if (A0g != null) {
            str = A0g.A04;
        }
        if (!((C5fu) r0).A0I && !6Bl.A04(r02.A01) && !11T.A0O(str, "2191329907595522")) {
            z = true;
        }
        return z;
    }

    public void BoE(Context context, View view, 5vW r304) {
        5gP r0;
        11T.A0F(r304, 2);
        5gP r02 = ((5vV) r304).A00;
        if (!(r02 instanceof 5gP) || (r0 = r02) == null) {
            return;
        }
        this.A00.AQN(new 7BG((Integer) null, (Integer) null, r0.A01, (String) null));
    }
}
