package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickerPacksParams;
import com.facebook.stickers.service.models.FetchStickerPacksResult;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* renamed from: X.6yh, reason: invalid class name */
/* loaded from: 6yh.class */
public final class C6yh implements C6ws {
    public final BlueServiceOperationFactory A00;
    public final C6xd A01;
    public final C6yi A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.6yi] */
    public C6yh(BlueServiceOperationFactory blueServiceOperationFactory, final C6xd c6xd) {
        this.A00 = blueServiceOperationFactory;
        this.A01 = c6xd;
        this.A02 = new Function(c6xd) { // from class: X.6yi
            public final C6xd A00;

            {
                this.A00 = c6xd;
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                FetchStickerPacksResult fetchStickerPacksResult = (FetchStickerPacksResult) ((OperationResult) obj).A07();
                ImmutableList.Builder builder = new ImmutableList.Builder();
                ArrayList arrayList = new ArrayList();
                if (fetchStickerPacksResult != null) {
                    Optional optional = fetchStickerPacksResult.A00;
                    if (optional.isPresent()) {
                        1Du it = ((ImmutableCollection) optional.get()).iterator();
                        while (it.hasNext()) {
                            StickerPack stickerPack = (StickerPack) it.next();
                            arrayList.add(stickerPack.A0B);
                            if (stickerPack.A06.A01(this.A00)) {
                                builder.m11011add((Object) stickerPack);
                            }
                        }
                    }
                }
                return builder.build();
            }
        };
    }

    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("fetchStickerPacksParams", new FetchStickerPacksParams(1He.A04, 5Qx.A03, 0S2.A0C, C7lo.A00(this.A01)));
        return 2FP.A02(this.A02, 1Ho.A00(this.A00.newInstance_DEPRECATED(1BJ.A00(46), bundle2), true), 1JU.A01);
    }
}
