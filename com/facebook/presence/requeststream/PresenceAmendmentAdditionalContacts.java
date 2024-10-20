package com.facebook.presence.requeststream;

import X.HXL;
import java.util.List;

/* loaded from: PresenceAmendmentAdditionalContacts.class */
public final class PresenceAmendmentAdditionalContacts extends HXL {
    public final List additionalContacts;
    public final String requestId;

    public PresenceAmendmentAdditionalContacts(String str, List list) {
        super(1);
        this.additionalContacts = list;
        this.requestId = str;
    }
}
