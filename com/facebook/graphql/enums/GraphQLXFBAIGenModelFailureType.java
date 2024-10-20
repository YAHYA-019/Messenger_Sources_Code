package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLXFBAIGenModelFailureType.class */
public enum GraphQLXFBAIGenModelFailureType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("ACL_FAILURE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("EMPTY_ATTACHMENTS_RESPONSE_FROM_MODEL"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("EMPTY_INPUT_FILE_FROM_HANDLE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("EMPTY_INPUT_IMAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("INPUT_INTEGRITY_VIOLATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("INTEGRITY_VIOLATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("INTERNAL_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("INVALID_KEY"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("INVALID_PROMPT"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("MODEL_GEN_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("NOT_PASSING_GK"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("NOT_SUPPORTED_MODEL_TYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("OUTPUT_INTEGRITY_VIOLATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("PROMPT_FAIL_LENGTH_CHECK"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("PROMPT_FAIL_RAI_CHECK"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("PROMPT_LANGUAGE_NOT_SUPPORTED"),
    REACH_RATE_LIMITED("REACH_RATE_LIMITED"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBMIT_FEEDBACK_FAILED("SUBMIT_FEEDBACK_FAILED"),
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLXFBAIGenModelFailureType(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
