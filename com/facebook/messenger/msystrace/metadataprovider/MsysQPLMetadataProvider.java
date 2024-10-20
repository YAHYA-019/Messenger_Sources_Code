package com.facebook.messenger.msystrace.metadataprovider;

import X.C02233ui;
import java.util.Map;

/* loaded from: MsysQPLMetadataProvider.class */
public class MsysQPLMetadataProvider {
    static {
        C02233ui.A00();
    }

    public static native Map generateAnnotationMap(MsysQPLMetadataSnapshot msysQPLMetadataSnapshot, MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2);

    public static native MsysQPLMetadataSnapshot snapshot(long j, int i, int i2);
}
