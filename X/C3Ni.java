package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3Ni, reason: invalid class name */
/* loaded from: 3Ni.class */
public final class C3Ni {
    public final /* synthetic */ 2Oj A00;

    public C3Ni(2Oj r302) {
        this.A00 = r302;
    }

    public void A00(Integer num) {
        int i;
        2Wo r0 = this.A00.A09;
        if (r0 != null) {
            View A01 = r0.A01();
            Context context = A01.getContext();
            switch (num.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                default:
                    i = 4;
                    break;
            }
            A01.setElevation(C0A8.A00(context, i));
        }
    }
}
