package com.facebook.graphql.querybuilder.common;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: ScaleInputPixelRatio.class */
public enum ScaleInputPixelRatio {
    NUMBER_1(ConstantsKt.CAMERA_ID_BACK),
    NUMBER_1_5("1.5"),
    NUMBER_2("2"),
    NUMBER_3("3"),
    NUMBER_4("4");

    public final String serverValue;

    ScaleInputPixelRatio(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
