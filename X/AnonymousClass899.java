package X;

import com.facebook.messaging.business.plugins.quickpromotion.leadautotrigger.LeadIntentAutoDetectedQPTrigger;
import com.facebook.messaging.business.plugins.quickpromotion.leaddetectedtrigger.LeadIntentDetectedQPTrigger;
import java.util.Set;

/* renamed from: X.899, reason: invalid class name */
/* loaded from: 899.class */
public final class AnonymousClass899 extends C21h {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass899(LeadIntentAutoDetectedQPTrigger leadIntentAutoDetectedQPTrigger, C7Nz c7Nz) {
        super("get_lead_intent_thread_to_auto_label");
        this.A02 = leadIntentAutoDetectedQPTrigger;
        this.A01 = c7Nz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass899(LeadIntentDetectedQPTrigger leadIntentDetectedQPTrigger, C7Nz c7Nz) {
        super("get_lead_intent_thread_not_already_marked_as_lead");
        this.A02 = leadIntentDetectedQPTrigger;
        this.A01 = c7Nz;
    }

    @Override // X.C21h
    public void A00(Set set) {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            LeadIntentDetectedQPTrigger.A00((LeadIntentDetectedQPTrigger) obj, (C7Nz) this.A01);
        } else {
            LeadIntentAutoDetectedQPTrigger.A00((LeadIntentAutoDetectedQPTrigger) obj, (C7Nz) this.A01);
        }
    }
}
