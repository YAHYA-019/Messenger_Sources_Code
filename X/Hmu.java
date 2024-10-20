package X;

import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.contentsearch.ContentSearchResultsView;

/* loaded from: Hmu.class */
public final class Hmu {
    public final /* synthetic */ ContentSearchResultsView A00;

    public Hmu(ContentSearchResultsView contentSearchResultsView) {
        this.A00 = contentSearchResultsView;
    }

    public void A00(Sticker sticker, int i) {
        HY5 hy5 = this.A00.A03;
        if (hy5 != null) {
            IFE ife = (IFE) hy5.A00.A01;
            I26 i26 = ife.A0J;
            GWm gWm = IFE.A01(ife).A07;
            int i2 = gWm.A01;
            if (i2 < 0) {
                i2 = gWm.A0D.size();
            }
            i26.A01(i, i2);
            JMV jmv = ife.A04;
            if (jmv != null) {
                String str = ife.A08;
                jmv.CNU(sticker, ife.A03, ife.A06, str, i);
            }
        }
    }
}
