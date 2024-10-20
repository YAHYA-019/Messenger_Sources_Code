package X;

import com.facebook.messaging.montage.model.art.BaseItem;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Hwy.class */
public final class Hwy {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static void A00(BaseItem baseItem, Object obj) {
        ((Hwy) obj).A00.remove(Long.valueOf(baseItem.A03()));
    }
}
