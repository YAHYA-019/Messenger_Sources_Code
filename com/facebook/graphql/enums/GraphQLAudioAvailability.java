package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLAudioAvailability.class */
public enum GraphQLAudioAvailability {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE_BUT_MUTED(MessageAvailabilityResponseId$Companion.AVAILABLE),
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE_BUT_MUTED("AVAILABLE_BUT_MISSING_LOUDNESS_DATA"),
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE_BUT_MUTED("AVAILABLE_BUT_MUTED"),
    AVAILABLE_BUT_SILENT("AVAILABLE_BUT_SILENT"),
    UNAVAILABLE("UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLAudioAvailability(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
