package X;

import android.content.Context;
import android.view.View;
import java.util.Set;

/* loaded from: A88.class */
public final class A88 implements 74E {
    public final 4kZ A00;

    public A88(4kZ r302) {
        this.A00 = r302;
    }

    public boolean BQh(5vW r302) {
        return 7zQ.A0y(r302).A00 instanceof 7HJ;
    }

    public void BoE(Context context, View view, 5vW r304) {
        11T.A0F(r304, 2);
        C5fv c5fv = ((5vV) r304).A00;
        if (c5fv instanceof 7HJ) {
            4kZ r0 = this.A00;
            C5o3 c5o3 = (C5o3) r0.A03.get();
            if (c5o3 == null) {
                c5o3 = C5o3.A01;
            }
            String str = ((C5fu) c5fv).A09;
            11T.A0F(str, 0);
            Set set = c5o3.A00;
            if (!set.contains(str)) {
                Set A0e = 0QD.A0e(set);
                A0e.add(str);
                c5o3 = new C5o3(0QD.A0f(A0e));
            }
            r0.A02.A00(c5o3);
        }
    }
}
