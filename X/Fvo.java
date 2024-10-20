package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.service.models.FetchStickerPacksByIdParams;
import com.facebook.stickers.service.models.FetchStickerPacksResult;
import com.facebook.stickers.service.models.FetchStickersResult;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fvo.class */
public final class Fvo implements 2eF, CallerContextable {
    public static final String __redex_internal_original_name = "StickerToPackMetadataLoader$1";
    public final /* synthetic */ C7om A00;
    public final /* synthetic */ C6ox A01;

    public Fvo(C7om c7om, C6ox c6ox) {
        this.A01 = c6ox;
        this.A00 = c7om;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        FetchStickerPacksResult fetchStickerPacksResult;
        1Du it = ((FetchStickersResult) ((OperationResult) obj).A07()).A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Sticker sticker = (Sticker) it.next();
            if (sticker.A0F.equals(this.A00.A00)) {
                if (sticker.A0I) {
                    fetchStickerPacksResult = FetchStickerPacksResult.A02;
                } else {
                    String str = sticker.A0H;
                    if (str != null && !str.isEmpty()) {
                        if (sticker.A0B != GraphQLStickerType.PAIR_AI_GENERATED) {
                            FetchStickerPacksByIdParams fetchStickerPacksByIdParams = new FetchStickerPacksByIdParams(1JW.A03(new String[]{str}));
                            Bundle A05 = 1BK.A05();
                            A05.putParcelable(4YT.A00(341), fetchStickerPacksByIdParams);
                            return 4YU.A0M(A05, AbH.A0B(this), 4YU.A0L(this.A01.A03), 1BJ.A00(92), true);
                        }
                        fetchStickerPacksResult = FetchStickerPacksResult.A04;
                    }
                }
            }
        }
        fetchStickerPacksResult = new FetchStickerPacksResult(null, null);
        return 1Kd.A0A(OperationResult.A04(fetchStickerPacksResult));
    }
}
