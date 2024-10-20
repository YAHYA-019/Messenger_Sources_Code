package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;

/* loaded from: Hvu.class */
public final class Hvu {
    public static final void A00(06Z r301, LifecycleOwner lifecycleOwner, ThreadKey threadKey, JGZ jgz, String str) {
        1BL.A11(1, r301, lifecycleOwner, jgz);
        2Ov generatedStickerSearchFragment = new GeneratedStickerSearchFragment();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("thread_key", threadKey);
        generatedStickerSearchFragment.setArguments(A05);
        generatedStickerSearchFragment.A0m(r301, str);
        r301.A1O(new ILP(jgz, 3), lifecycleOwner, "generated_sticker_search_result");
    }
}
