package X;

import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerParams;
import com.facebook.ipc.inspiration.model.InspirationEditingData;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: N3J.class */
public final class N3J {
    public static final /* synthetic */ N3J A00 = new Object();

    public static final boolean A00(InspirationEditingData inspirationEditingData) {
        ImmutableList immutableList = inspirationEditingData.A0X;
        11T.A0A(immutableList);
        if ((immutableList instanceof Collection) && immutableList.isEmpty()) {
            return false;
        }
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            InspirationStickerParams inspirationStickerParams = ((InspirationOverlayParamsHolder) it.next()).A00;
            if ((inspirationStickerParams != null ? inspirationStickerParams.A01() : null) == EPI.A10) {
                return true;
            }
        }
        return false;
    }
}
