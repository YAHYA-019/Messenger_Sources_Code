package X;

import com.facebook.stickers.store.StickerStoreActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fcs.class */
public final class Fcs implements 2TV {
    public final /* synthetic */ StickerStoreActivity A00;
    public final /* synthetic */ boolean A01;

    public Fcs(StickerStoreActivity stickerStoreActivity, boolean z) {
        this.A00 = stickerStoreActivity;
        this.A01 = z;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        StickerStoreActivity stickerStoreActivity = this.A00;
        1BK.A09(stickerStoreActivity.A08).softReport("StickerStoreActivity_StickerPackFromIdLoadFailed", "Failed to load sticker pack from sticker id", (Throwable) obj2);
        StickerStoreActivity.A15(stickerStoreActivity);
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        ES0 es0 = (ES0) obj2;
        if (es0 instanceof E9p) {
            StickerStoreActivity.A12(((E9p) es0).A00, this.A00, false, this.A01, false);
        }
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
