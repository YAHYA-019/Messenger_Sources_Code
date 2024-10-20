package X;

import android.content.Context;

/* loaded from: Jtt.class */
public final class Jtt extends 1Iw {
    public C3Yn A00;
    public LYU A01;
    public final int A02;

    public Jtt(Jtt jtt) {
        super(((1Iw) jtt).A0D);
        this.A02 = jtt.A02;
    }

    public Jtt(Context context, int i) {
        super(context);
        this.A02 = i;
    }

    public void A0F(C2l4 c2l4) {
        LYU lyu = this.A01;
        if (lyu != null) {
            synchronized (lyu.A09) {
                lyu.A0C.add(c2l4);
            }
        }
    }

    public void A0G(C2l4 c2l4, String str) {
        LYU lyu = this.A01;
        if (lyu != null) {
            synchronized (lyu.A09) {
                lyu.A0C.add(c2l4);
                lyu.A0F.set(true);
            }
            if (GOp.A1a(lyu.A0D)) {
                lyu.A08.CXv(lyu.A0B, "SurfaceManager_updateState");
            }
        }
    }

    public void A0H(C2l4 c2l4, String str) {
        A0G(c2l4, str);
    }
}
