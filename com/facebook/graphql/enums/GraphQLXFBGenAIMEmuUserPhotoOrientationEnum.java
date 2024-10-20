package com.facebook.graphql.enums;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: GraphQLXFBGenAIMEmuUserPhotoOrientationEnum.class */
public enum GraphQLXFBGenAIMEmuUserPhotoOrientationEnum {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CAMERA_ROLL("CAMERA_ROLL"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER("CENTER"),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT("LEFT"),
    /* JADX INFO: Fake field, exist only in values array */
    RIGHT("RIGHT"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);

    public final String serverValue;

    GraphQLXFBGenAIMEmuUserPhotoOrientationEnum(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
