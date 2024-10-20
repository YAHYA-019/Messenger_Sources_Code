package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.facebook.photos.creativeediting.model.RelativeImageOverlayParams;
import com.google.common.base.Preconditions;

/* loaded from: Gv2.class */
public final class Gv2 extends IiM implements JMy {
    public final 1De A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gv2(1De r302, RelativeImageOverlayParams relativeImageOverlayParams) {
        super(relativeImageOverlayParams);
        Q9W dpq;
        11T.A0F(relativeImageOverlayParams, 2);
        this.A00 = r302;
        InspirationMusicStickerInfo inspirationMusicStickerInfo = relativeImageOverlayParams.A06;
        if (inspirationMusicStickerInfo == null) {
            throw AnonymousClass001.A0L("LyricsOverlayRenderer: RelativeImageOverlayParams.getMusicStickerInfo()== null");
        }
        Context A0A = AbK.A0A(r302);
        int i = inspirationMusicStickerInfo.A06;
        if (i != 201) {
            switch (i) {
                case 100:
                    11T.A0F(A0A, 1);
                    dpq = new Q9X(A0A, new FFs(inspirationMusicStickerInfo), true);
                    break;
                case ActionId.ON_VIEW_CREATED_END /* 101 */:
                    11T.A0F(A0A, 1);
                    dpq = new Q9Z(A0A, new FFs(inspirationMusicStickerInfo), true);
                    break;
                case ActionId.DATA_LOAD_START /* 102 */:
                    11T.A0F(A0A, 1);
                    dpq = new Q9Y(A0A, new FFs(inspirationMusicStickerInfo), true);
                    break;
                case ActionId.LEGACY_MARKER /* 103 */:
                    11T.A0F(A0A, 1);
                    dpq = new Q9W(A0A, new FFs(inspirationMusicStickerInfo), true);
                    break;
                default:
                    throw 0Pz.A04("LyricsOverlayRenderer: Unknown MusicStickerStyle.STYLE: ", i);
            }
        } else {
            dpq = new Dpq(A0A, inspirationMusicStickerInfo);
        }
        Dpq dpq2 = (JGn) dpq;
        IiK iiK = ((IiM) this).A01;
        IiK.A03(iiK, true);
        I8g i8g = iiK.A0T;
        Preconditions.checkArgument(true, "updateOverlaySource may have only 1 non-null input source, has %d sources", AnonymousClass001.A1T(dpq2) ? 1 : 0);
        i8g.overlayUri = null;
        if (dpq2 == null) {
            i8g.A00 = null;
        } else if (i8g.A00 != dpq2) {
            i8g.A00 = dpq2;
        }
    }
}
