package com.facebook.quicklog;

import X.0Pz;
import com.facebook.acra.constants.ActionId;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: JNIMethodsBridge.class */
public class JNIMethodsBridge {
    public static void markerPoint(int i, int i2, String str, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }

    public static void markerPoint(int i, int i2, String str, String str2, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
            withMarker.withLevel(i3);
            withMarker.pointEditor(str).addPointData("__key", str2).pointCustomTimestamp(j).pointEditingCompleted().markerEditingCompleted();
        }
    }

    public static void markerPoint(int i, int i2, String str, String[] strArr, int i3, long j, boolean z, QuickPerformanceLogger quickPerformanceLogger) {
        String str2;
        if (quickPerformanceLogger != null) {
            int length = strArr.length;
            if (length % 3 == 0) {
                MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, i2);
                withMarker.withLevel(i3);
                PointEditor pointShouldIncludeMetadata = withMarker.pointEditor(str).pointCustomTimestamp(j).pointShouldIncludeMetadata(z);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= length) {
                        pointShouldIncludeMetadata.pointEditingCompleted().markerEditingCompleted();
                        return;
                    }
                    String str3 = strArr[i5];
                    String str4 = strArr[i5 + 1];
                    str2 = strArr[i5 + 2];
                    switch (str2.hashCode()) {
                        case ActionId.IN_PROGRESS /* 49 */:
                            if (str2.equals(ConstantsKt.CAMERA_ID_BACK)) {
                                pointShouldIncludeMetadata.addPointData(str3, str4);
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            if (str2.equals("2")) {
                                pointShouldIncludeMetadata.addPointData(str3, Long.parseLong(str4));
                                break;
                            } else {
                                break;
                            }
                        case ActionId.UNKNOWN /* 51 */:
                            if (str2.equals("3")) {
                                pointShouldIncludeMetadata.addPointData(str3, Double.parseDouble(str4));
                                break;
                            } else {
                                break;
                            }
                        case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                            if (str2.equals("4")) {
                                pointShouldIncludeMetadata.addPointData(str3, !ConstantsKt.CAMERA_ID_FRONT.equals(str4));
                                break;
                            } else {
                                break;
                            }
                        case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                            if (str2.equals("5")) {
                                pointShouldIncludeMetadata.addPointData(str3, str4.split(",,,"));
                                break;
                            } else {
                                break;
                            }
                        case ActionId.QUEUEING_BEGIN /* 54 */:
                            if (str2.equals("6")) {
                                String[] split = str4.split(",,,");
                                int length2 = split.length;
                                long[] jArr = new long[length2];
                                for (int i6 = 0; i6 < length2; i6++) {
                                    jArr[i6] = Long.parseLong(split[i6]);
                                }
                                pointShouldIncludeMetadata.addPointData(str3, jArr);
                                break;
                            } else {
                                break;
                            }
                        case ActionId.QUEUEING_SUCCESS /* 55 */:
                            if (str2.equals("7")) {
                                String[] split2 = str4.split(",,,");
                                int length3 = split2.length;
                                double[] dArr = new double[length3];
                                for (int i7 = 0; i7 < length3; i7++) {
                                    dArr[i7] = Double.parseDouble(split2[i7]);
                                }
                                pointShouldIncludeMetadata.addPointData(str3, dArr);
                                break;
                            } else {
                                break;
                            }
                        case ActionId.QUEUEING_FAIL /* 56 */:
                            if (str2.equals("8")) {
                                String[] split3 = str4.split(",,,");
                                int length4 = split3.length;
                                boolean[] zArr = new boolean[length4];
                                for (int i8 = 0; i8 < length4; i8++) {
                                    zArr[i8] = ConstantsKt.CAMERA_ID_BACK.equals(split3[i8]);
                                }
                                pointShouldIncludeMetadata.addPointData(str3, zArr);
                                break;
                            } else {
                                break;
                            }
                    }
                    i4 = i5 + 3;
                }
                throw 0Pz.A05("Type entry is not supported: ", str2);
            }
        }
    }
}
