package X;

import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* renamed from: X.90w, reason: invalid class name */
/* loaded from: 90w.class */
public final class C90w extends 44R {
    public final 1Br A00 = 1Bq.A00(147925);

    public boolean A04(QuickPromotionDefinition.ContextualFilter contextualFilter, QuickPromotionDefinition quickPromotionDefinition) {
        int i;
        Long l;
        11T.A0F(contextualFilter, 1);
        N2E n2e = (N2E) 1Br.A0B(this.A00);
        synchronized (n2e) {
            i = 0;
            if (N2E.A00(n2e)) {
                N1G n1g = n2e.A00;
                if (n1g != null) {
                    synchronized (n1g) {
                        l = n1g.A0E;
                    }
                    if (l != null) {
                        i = 1;
                    }
                }
            } else {
                0fH.A0l("MessagingInBlueInteractionStore.java", "MessagingInBlueInteractionStore should have been initialized, but getClickedTopRightHeaderInboxIcon had to do it again.");
            }
        }
        return AnonymousClass001.A1Q(i, Boolean.parseBoolean(contextualFilter.value) ? 1 : 0);
    }
}
