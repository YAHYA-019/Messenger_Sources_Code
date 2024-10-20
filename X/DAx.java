package X;

import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.concurrent.Callable;

/* loaded from: DAx.class */
public final class DAx implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CHc A02;

    public DAx(CHc cHc, int i, int i2) {
        this.A02 = cHc;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        CHc cHc;
        2JX r302 = null;
        try {
            cHc = this.A02;
            Bpw bpw = cHc.A09;
            int i = this.A00;
            int i2 = this.A01;
            5Uf r0 = bpw.A02;
            5Ug r02 = 5Ug.A08;
            r0.A02(r02);
            C30G A0H = AbF.A0H(64);
            A0H.A06(Property.ICON_TEXT_FIT_HEIGHT, i);
            A0H.A06(Property.ICON_TEXT_FIT_WIDTH, i2);
            A0H.A05("scale", 1.0d);
            C3sa A00 = C3sa.A00(A0H);
            AbstractC05414dq A09 = 1VX.A09(bpw.A00, bpw.A01);
            4YU.A1J(A00, 335144434347286L);
            AbstractC08294mh abstractC08294mh = (AbstractC08294mh) AbstractC05474dx.A01(BPQ.class, A09.A03(A00));
            r0.A03(r02, false);
            2JX r03 = (2JX) abstractC08294mh.A03;
            synchronized (cHc) {
                cHc.A02 = r03;
                cHc.A00 = 1BL.A08(cHc.A07);
                cHc.A03 = null;
                cHc.A04 = false;
            }
        } catch (BPQ e) {
            cHc = this.A02;
            synchronized (cHc) {
                cHc.A03 = null;
                1BK.A09(cHc.A08).D0v("MessengerSettingsKidsDataStore", 0Pz.A1B("Fetch Messenger Kids Error. ", e));
            }
        }
        if (cHc.A01()) {
            r302 = cHc.A02;
        }
        return r302;
    }
}
