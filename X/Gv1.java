package X;

import android.content.Context;
import com.facebook.inspiration.model.movableoverlay.caption.InspirationCaptionStickerInfo;
import com.facebook.photos.creativeediting.model.RelativeImageOverlayParams;
import com.google.common.base.Preconditions;

/* loaded from: Gv1.class */
public final class Gv1 extends IiM {
    public final 1Br A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gv1(RelativeImageOverlayParams relativeImageOverlayParams) {
        super(relativeImageOverlayParams);
        Q9U q9v;
        11T.A0F(relativeImageOverlayParams, 1);
        1Br A00 = 1Bq.A00(116215);
        this.A00 = A00;
        InspirationCaptionStickerInfo inspirationCaptionStickerInfo = relativeImageOverlayParams.A05;
        if (inspirationCaptionStickerInfo == null) {
            throw AnonymousClass001.A0L("CaptionOverlayRenderer: RelativeImageOverlayParams.getCaptionStickerInfo()== null");
        }
        1Br.A0C(A00);
        int i = inspirationCaptionStickerInfo.A03;
        if (i == QqW.A04.styleIndex) {
            q9v = new Q9U(7zL.A09(), inspirationCaptionStickerInfo, (float) (inspirationCaptionStickerInfo.A00 + 0.5d), true);
        } else {
            int i2 = QqW.A02.styleIndex;
            Context A09 = 7zL.A09();
            float f = (float) (inspirationCaptionStickerInfo.A00 + 0.5d);
            q9v = i == i2 ? new Q9V(A09, inspirationCaptionStickerInfo, f, true) : new Q9T(A09, inspirationCaptionStickerInfo, f, true);
        }
        IiK iiK = ((IiM) this).A01;
        IiK.A03(iiK, true);
        I8g i8g = iiK.A0T;
        Preconditions.checkArgument(true, "updateOverlaySource may have only 1 non-null input source, has %d sources", 1);
        i8g.overlayUri = null;
        if (i8g.A00 != q9v) {
            i8g.A00 = q9v;
        }
    }
}
