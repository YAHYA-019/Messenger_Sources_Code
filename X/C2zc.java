package X;

import com.facebook.messaging.business.inboxads.common.InboxAdsItem;
import com.google.common.base.Predicate;

/* renamed from: X.2zc, reason: invalid class name */
/* loaded from: 2zc.class */
public final class C2zc implements Predicate {
    public static final C2zc A00 = new C2zc();

    @Override // com.google.common.base.Predicate
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return obj instanceof InboxAdsItem;
    }
}
