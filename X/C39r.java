package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.39r, reason: invalid class name */
/* loaded from: 39r.class */
public final class C39r extends 44R {
    public 1BY A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.39r] */
    public static final C39r A00(1BO r301) {
        ?? obj = new Object();
        obj.A00 = new 1BY(r301);
        return obj;
    }

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        1BY r0 = this.A00;
        C1wv c1wv = (C1wv) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 68883);
        C1wv.A04(c1wv);
        MutableLiveData mutableLiveData = c1wv.A07;
        boolean z = false;
        if (mutableLiveData.getValue() != C1wz.A04 && AnonymousClass001.A1W(mutableLiveData.getValue(), C1wz.A03) == Boolean.parseBoolean(contextualFilter.value)) {
            z = true;
        }
        return z;
    }
}
