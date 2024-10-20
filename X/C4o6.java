package X;

import com.facebook.messaging.business.common.calltoaction.model.AdCallToAction;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* renamed from: X.4o6, reason: invalid class name */
/* loaded from: 4o6.class */
public final class C4o6 extends C4Nd {
    public String A00;
    public String A01;

    public C4o6(CallToAction callToAction) {
        super(callToAction);
        this.A01 = "";
        if (callToAction instanceof AdCallToAction) {
            AdCallToAction adCallToAction = (AdCallToAction) callToAction;
            this.A00 = adCallToAction.A00;
            this.A01 = adCallToAction.A01;
        }
    }
}
