package X;

import android.app.Activity;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.Iterator;
import java.util.Set;

/* loaded from: F9t.class */
public final class F9t {
    public QuickPromotionDefinition A00;
    public final Set A02 = 7zL.A15();
    public final java.util.Map A01 = 1BK.A1C();

    public static final void A00(F9t f9t) {
        Iterator it = f9t.A02.iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
            it.remove();
        }
        f9t.A01.clear();
    }

    public final void A01() {
        synchronized (this) {
            this.A00 = null;
            A00(this);
        }
    }

    public final void A02(Activity activity) {
        synchronized (this) {
            11T.A0F(activity, 0);
            this.A02.add(activity);
        }
    }

    public final void A03(QuickPromotionDefinition quickPromotionDefinition) {
        synchronized (this) {
            11T.A0F(quickPromotionDefinition, 0);
            QuickPromotionDefinition quickPromotionDefinition2 = this.A00;
            if (quickPromotionDefinition2 != null) {
                java.util.Map map = this.A01;
                if (!map.containsKey(quickPromotionDefinition2.promotionId) && !map.containsKey(quickPromotionDefinition.promotionId) && !11T.A0O(quickPromotionDefinition2.promotionId, quickPromotionDefinition.promotionId)) {
                    map.put(quickPromotionDefinition2.promotionId, quickPromotionDefinition);
                }
            }
            this.A00 = quickPromotionDefinition;
        }
    }
}
