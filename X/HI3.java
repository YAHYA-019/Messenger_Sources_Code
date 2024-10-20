package X;

import com.facebook.messaging.montage.model.art.ArtItem;
import com.google.common.collect.ImmutableList;

/* loaded from: HI3.class */
public abstract class HI3 {
    public static final boolean A00(ArtItem artItem) {
        Hav hav;
        Hg3 hg3;
        boolean z = false;
        if (artItem != null && (hav = artItem.A02) != null) {
            ImmutableList immutableList = hav.A01;
            if (09K.A00(immutableList) && immutableList != null && (hg3 = (Hg3) immutableList.get(0)) != null && hg3.A03) {
                z = true;
            }
        }
        return z;
    }
}
