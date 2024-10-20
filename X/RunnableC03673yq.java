package X;

import android.telephony.SubscriptionManager;

/* renamed from: X.3yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yq.class */
public final class RunnableC03673yq implements Runnable {
    public static final String __redex_internal_original_name = "CellDiagnostics$3";
    public final /* synthetic */ 2DH A00;

    public RunnableC03673yq(2DH r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        2DH r0 = this.A00;
        SubscriptionManager subscriptionManager = r0.A02;
        if (subscriptionManager != null) {
            SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = new SubscriptionManager.OnSubscriptionsChangedListener() { // from class: X.3yr
                @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
                public void onSubscriptionsChanged() {
                    2DH.A0a(RunnableC03673yq.this.A00);
                }
            };
            r0.A01 = onSubscriptionsChangedListener;
            subscriptionManager.addOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
        }
    }
}
