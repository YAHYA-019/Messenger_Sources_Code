package X;

import android.content.Intent;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.store.StickerStoreActivity;
import com.facebook.stickers.store.StickerStoreFragment;

/* loaded from: Far.class */
public final class Far implements GHX {
    public final /* synthetic */ StickerStoreActivity A00;

    public Far(StickerStoreActivity stickerStoreActivity) {
        this.A00 = stickerStoreActivity;
    }

    public void Byj(Intent intent, NavigableFragment navigableFragment) {
        StickerStoreActivity stickerStoreActivity = this.A00;
        if (intent == null) {
            stickerStoreActivity.finish();
        } else if (navigableFragment instanceof StickerStoreFragment) {
            StickerStoreActivity.A12((StickerPack) intent.getParcelableExtra("stickerPack"), stickerStoreActivity, intent.getBooleanExtra(1BJ.A00(1443), false), false, true);
        }
    }

    public boolean CFu(NavigableFragment navigableFragment) {
        this.A00.onBackPressed();
        return true;
    }
}
