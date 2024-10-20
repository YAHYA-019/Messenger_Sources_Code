package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.90v, reason: invalid class name */
/* loaded from: 90v.class */
public final class C90v extends 44R {
    public 1BY A00;

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        1BY r0 = this.A00;
        C1wv c1wv = (C1wv) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 68883);
        C1wv.A04(c1wv);
        MutableLiveData mutableLiveData = c1wv.A06;
        boolean z = false;
        if (mutableLiveData.getValue() != C1wy.A04 && AnonymousClass001.A1W(mutableLiveData.getValue(), C1wy.A02) == Boolean.parseBoolean(contextualFilter.value)) {
            z = true;
        }
        return z;
    }
}
