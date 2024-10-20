package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.art.ArtItem;

/* loaded from: C12.class */
public final class C12 {
    public final /* synthetic */ IQ1 A00;

    public C12(IQ1 iq1) {
        this.A00 = iq1;
    }

    public void A00(ArtItem artItem, HFw hFw, java.util.Map map) {
        IQ1 iq1 = this.A00;
        CallerContext callerContext = IQ1.A1m;
        CEy cEy = iq1.A09;
        E9Q e9q = new E9Q(4, map, cEy, hFw, artItem);
        if (1Br.A07(cEy.A01).AZk(36326902109067125L)) {
            cEy.A02.A01(cEy.A04, e9q, "LOCATION_SHARE_FRAGMENT_TAG", "LocationFrameClickHandler", CEy.A07);
        } else {
            cEy.A05.AHQ(cEy.A04, e9q, CEy.A07);
        }
    }
}
