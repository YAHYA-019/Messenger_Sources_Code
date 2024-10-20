package com.facebook.mqtt.service;

import X.11T;
import X.1BM;
import X.C04v;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.mqttbypass.IMqttBypassClientHolder;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ConnectionConfig.class */
public final class ConnectionConfig extends C04v {
    public final String appId;
    public final Map appSpecificInfo;
    public final Map assetIds;
    public final boolean autoSubscribeOnReconnect;
    public final String cacheDir;
    public final Executor callbackExecutor;
    public final long capabilities;
    public final boolean chatOnEnabled;
    public final int clientKeepAliveBackgroundInSeconds;
    public final int clientKeepAliveInSeconds;
    public final int clientKeepAliveTimeoutInSeconds;
    public final String clientType;
    public final int connectTimeoutInSeconds;
    public final String deviceId;
    public final boolean enableDeferredDisconnect;
    public final boolean enableDeferredDisconnectOnEmptyRcv;
    public final long endpointCapabilities;
    public final String fallbackHost;
    public final boolean highPriPendingPublishQueueEnabled;
    public final String host;
    public final boolean improvedStateReportEnabled;
    public int initialNetworkState;
    public final double initialReconnectBackoffInSeconds;
    public boolean isAppInBackground;
    public final double maxReconnectBackoffInSeconds;
    public final int maxServerUnavailableBeforeBackoff;
    public final IMqttBypassClientHolder mqttBypassClientHolder;
    public final Integer msysThreadPriority;
    public final boolean networkInterfaceHandlingCellularToWifiEnabled;
    public final boolean networkInterfaceHandlingWifiToCellularEnabled;
    public final int numFailuresForFallback;
    public final String password;
    public final PersonalizationConfig personalizationConfig;
    public final String phpOverride;
    public final int port;
    public final int preemptivePublishTimeoutInSeconds;
    public final int publishTimeoutInSeconds;
    public final boolean qplEnabled;
    public String regionHint;
    public final Set subscribeTopics;
    public final String userAgent;
    public final String userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r325 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r325
            r42 = r325
            r43 = -2097152(0xffffffffffe00000, float:NaN)
            r44 = 1023(0x3ff, float:1.434E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r326 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r326
            r42 = r326
            r43 = -4194304(0xffffffffffc00000, float:NaN)
            r44 = 1023(0x3ff, float:1.434E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r327 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r327
            r42 = r327
            r43 = -8388608(0xffffffffff800000, float:-Infinity)
            r44 = 1023(0x3ff, float:1.434E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r328 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r328
            r42 = r328
            r43 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r44 = 1023(0x3ff, float:1.434E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r329 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r329
            r42 = r329
            r43 = -33554432(0xfffffffffe000000, float:-4.2535296E37)
            r44 = 1023(0x3ff, float:1.434E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, 0, 10, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, 10, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, false, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, false, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, false, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, null, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, false, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, false, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, null, false, null, null, 0, false, 0.2d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r339 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r339
            r42 = r339
            r43 = 0
            r44 = 1016(0x3f8, float:1.424E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338, boolean r339) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r340 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = r339
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r340
            r42 = r340
            r43 = 0
            r44 = 1008(0x3f0, float:1.413E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338, boolean r339, java.util.Map r340) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r341 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = r339
            r37 = r340
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = r341
            r42 = r341
            r43 = 0
            r44 = 992(0x3e0, float:1.39E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338, boolean r339, java.util.Map r340, java.lang.String r341) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r342 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = r339
            r37 = r340
            r38 = r341
            r39 = 0
            r40 = 0
            r41 = r342
            r42 = r342
            r43 = 0
            r44 = 960(0x3c0, float:1.345E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338, boolean r339, java.util.Map r340, java.lang.String r341, int r342) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = r320
            r2 = r321
            r3 = r322
            r4 = r323
            X.1BM.A06(r0, r1, r2, r3, r4)
            r0 = 0
            r343 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = r339
            r37 = r340
            r38 = r341
            r39 = r342
            r40 = 0
            r41 = r343
            r42 = r343
            r43 = 0
            r44 = 896(0x380, float:1.256E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConnectionConfig(java.lang.String r302, java.lang.String r303, java.lang.String r304, int r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310, int r311, long r312, long r314, java.lang.String r316, boolean r317, boolean r318, boolean r319, java.util.Set r320, java.util.Map r321, java.lang.String r322, java.util.concurrent.Executor r323, java.lang.Integer r324, int r325, int r326, int r327, int r328, int r329, int r330, int r331, boolean r332, boolean r333, boolean r334, com.facebook.mqtt.service.PersonalizationConfig r335, boolean r336, boolean r337, com.facebook.mqttbypass.IMqttBypassClientHolder r338, boolean r339, java.util.Map r340, java.lang.String r341, int r342, boolean r343) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = 3
            X.11T.A0F(r0, r1)
            r0 = r320
            r1 = 17
            X.11T.A0F(r0, r1)
            r0 = r321
            r1 = 18
            X.11T.A0F(r0, r1)
            r0 = r322
            r1 = 19
            X.11T.A0F(r0, r1)
            r0 = r323
            r1 = 20
            X.11T.A0F(r0, r1)
            r0 = 0
            r344 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            r10 = r311
            r11 = r312
            r12 = r314
            r13 = r316
            r14 = r317
            r15 = r318
            r16 = r319
            r17 = r320
            r18 = r321
            r19 = r322
            r20 = r323
            r21 = r324
            r22 = r325
            r23 = r326
            r24 = r327
            r25 = r328
            r26 = r329
            r27 = r330
            r28 = r331
            r29 = r332
            r30 = r333
            r31 = r334
            r32 = r335
            r33 = r336
            r34 = r337
            r35 = r338
            r36 = r339
            r37 = r340
            r38 = r341
            r39 = r342
            r40 = r343
            r41 = r344
            r42 = r344
            r43 = 0
            r44 = 768(0x300, float:1.076E-42)
            r45 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.ConnectionConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Map, java.lang.String, java.util.concurrent.Executor, java.lang.Integer, int, int, int, int, int, int, int, boolean, boolean, boolean, com.facebook.mqtt.service.PersonalizationConfig, boolean, boolean, com.facebook.mqttbypass.IMqttBypassClientHolder, boolean, java.util.Map, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, iMqttBypassClientHolder, z9, map2, str11, i10, z10, d, 30.0d);
        11T.A0F(str, 1);
        1BM.A06(str3, set, map, str10, executor);
    }

    public ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        11T.A0F(str, 1);
        11T.A0F(str3, 3);
        11T.A0F(set, 17);
        11T.A0F(map, 18);
        11T.A0F(str10, 19);
        11T.A0F(executor, 20);
        this.userId = str;
        this.password = str2;
        this.host = str3;
        this.port = i;
        this.userAgent = str4;
        this.deviceId = str5;
        this.clientType = str6;
        this.phpOverride = str7;
        this.appId = str8;
        this.initialNetworkState = i2;
        this.capabilities = j;
        this.endpointCapabilities = j2;
        this.regionHint = str9;
        this.qplEnabled = z;
        this.chatOnEnabled = z2;
        this.isAppInBackground = z3;
        this.subscribeTopics = set;
        this.appSpecificInfo = map;
        this.cacheDir = str10;
        this.callbackExecutor = executor;
        this.msysThreadPriority = num;
        this.clientKeepAliveInSeconds = i3;
        this.clientKeepAliveBackgroundInSeconds = i4;
        this.clientKeepAliveTimeoutInSeconds = i5;
        this.connectTimeoutInSeconds = i6;
        this.publishTimeoutInSeconds = i7;
        this.preemptivePublishTimeoutInSeconds = i8;
        this.maxServerUnavailableBeforeBackoff = i9;
        this.networkInterfaceHandlingCellularToWifiEnabled = z4;
        this.networkInterfaceHandlingWifiToCellularEnabled = z5;
        this.improvedStateReportEnabled = z6;
        this.personalizationConfig = personalizationConfig;
        this.enableDeferredDisconnect = z7;
        this.enableDeferredDisconnectOnEmptyRcv = z8;
        this.mqttBypassClientHolder = iMqttBypassClientHolder;
        this.autoSubscribeOnReconnect = z9;
        this.assetIds = map2;
        this.fallbackHost = str11;
        this.numFailuresForFallback = i10;
        this.highPriPendingPublishQueueEnabled = z10;
        this.initialReconnectBackoffInSeconds = d;
        this.maxReconnectBackoffInSeconds = d2;
    }

    public /* synthetic */ ConnectionConfig(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, (i11 & 2097152) != 0 ? 60 : i3, (i11 & 4194304) != 0 ? 284 : i4, (i11 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 ? 6 : i5, (i11 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0 ? 10 : i6, (i11 & 33554432) != 0 ? 10 : i7, (i11 & 67108864) != 0 ? 0 : i8, (i11 & 134217728) != 0 ? 10 : i9, (i11 & 268435456) != 0 ? false : z4, (i11 & 536870912) != 0 ? false : z5, (i11 & 1073741824) != 0 ? false : z6, (i11 & ((-1) << (-1))) != 0 ? null : personalizationConfig, (i12 & 1) != 0 ? false : z7, (i12 & 2) != 0 ? false : z8, (i12 & 4) != 0 ? null : iMqttBypassClientHolder, (i12 & 8) != 0 ? false : z9, (i12 & 16) != 0 ? null : map2, (i12 & 32) != 0 ? null : str11, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? false : z10, (i12 & 256) != 0 ? 0.2d : d, (i12 & 512) != 0 ? 30.0d : d2);
    }

    public static /* synthetic */ ConnectionConfig copy$default(ConnectionConfig connectionConfig, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2, int i11, int i12, Object obj) {
        long j3 = j2;
        long j4 = j;
        int i13 = i2;
        String str12 = str8;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str4;
        int i14 = i;
        String str17 = str3;
        String str18 = str2;
        String str19 = str;
        double d3 = d2;
        double d4 = d;
        int i15 = i6;
        int i16 = i4;
        int i17 = i3;
        Integer num2 = num;
        int i18 = i10;
        boolean z11 = z8;
        Map map3 = map;
        IMqttBypassClientHolder iMqttBypassClientHolder2 = iMqttBypassClientHolder;
        boolean z12 = z6;
        boolean z13 = z3;
        int i19 = i8;
        boolean z14 = z2;
        int i20 = i5;
        Set set2 = set;
        boolean z15 = z5;
        boolean z16 = z;
        Executor executor2 = executor;
        String str20 = str9;
        int i21 = i7;
        String str21 = str10;
        String str22 = str11;
        boolean z17 = z7;
        int i22 = i9;
        boolean z18 = z4;
        PersonalizationConfig personalizationConfig2 = personalizationConfig;
        boolean z19 = z9;
        Map map4 = map2;
        boolean z20 = z10;
        if ((i11 & 1) != 0) {
            str19 = connectionConfig.userId;
        }
        if ((i11 & 2) != 0) {
            str18 = connectionConfig.password;
        }
        if ((i11 & 4) != 0) {
            str17 = connectionConfig.host;
        }
        if ((i11 & 8) != 0) {
            i14 = connectionConfig.port;
        }
        if ((i11 & 16) != 0) {
            str16 = connectionConfig.userAgent;
        }
        if ((i11 & 32) != 0) {
            str15 = connectionConfig.deviceId;
        }
        if ((i11 & 64) != 0) {
            str14 = connectionConfig.clientType;
        }
        if ((i11 & 128) != 0) {
            str13 = connectionConfig.phpOverride;
        }
        if ((i11 & 256) != 0) {
            str12 = connectionConfig.appId;
        }
        if ((i11 & 512) != 0) {
            i13 = connectionConfig.initialNetworkState;
        }
        if ((i11 & 1024) != 0) {
            j4 = connectionConfig.capabilities;
        }
        if ((i11 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j3 = connectionConfig.endpointCapabilities;
        }
        if ((i11 & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            str20 = connectionConfig.regionHint;
        }
        if ((i11 & 8192) != 0) {
            z16 = connectionConfig.qplEnabled;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z14 = connectionConfig.chatOnEnabled;
        }
        if ((i11 & Constants.LOAD_RESULT_PGO) != 0) {
            z13 = connectionConfig.isAppInBackground;
        }
        if ((i11 & 65536) != 0) {
            set2 = connectionConfig.subscribeTopics;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            map3 = connectionConfig.appSpecificInfo;
        }
        if ((i11 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            str21 = connectionConfig.cacheDir;
        }
        if ((i11 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            executor2 = connectionConfig.callbackExecutor;
        }
        if ((i11 & 1048576) != 0) {
            num2 = connectionConfig.msysThreadPriority;
        }
        if ((i11 & 2097152) != 0) {
            i17 = connectionConfig.clientKeepAliveInSeconds;
        }
        if ((i11 & 4194304) != 0) {
            i16 = connectionConfig.clientKeepAliveBackgroundInSeconds;
        }
        if ((i11 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            i20 = connectionConfig.clientKeepAliveTimeoutInSeconds;
        }
        if ((i11 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            i15 = connectionConfig.connectTimeoutInSeconds;
        }
        if ((i11 & 33554432) != 0) {
            i21 = connectionConfig.publishTimeoutInSeconds;
        }
        if ((i11 & 67108864) != 0) {
            i19 = connectionConfig.preemptivePublishTimeoutInSeconds;
        }
        if ((i11 & 134217728) != 0) {
            i22 = connectionConfig.maxServerUnavailableBeforeBackoff;
        }
        if ((i11 & 268435456) != 0) {
            z18 = connectionConfig.networkInterfaceHandlingCellularToWifiEnabled;
        }
        if ((i11 & 536870912) != 0) {
            z15 = connectionConfig.networkInterfaceHandlingWifiToCellularEnabled;
        }
        if ((i11 & 1073741824) != 0) {
            z12 = connectionConfig.improvedStateReportEnabled;
        }
        if ((i11 & ((-1) << (-1))) != 0) {
            personalizationConfig2 = connectionConfig.personalizationConfig;
        }
        if ((i12 & 1) != 0) {
            z17 = connectionConfig.enableDeferredDisconnect;
        }
        if ((i12 & 2) != 0) {
            z11 = connectionConfig.enableDeferredDisconnectOnEmptyRcv;
        }
        if ((i12 & 4) != 0) {
            iMqttBypassClientHolder2 = connectionConfig.mqttBypassClientHolder;
        }
        if ((i12 & 8) != 0) {
            z19 = connectionConfig.autoSubscribeOnReconnect;
        }
        if ((i12 & 16) != 0) {
            map4 = connectionConfig.assetIds;
        }
        if ((i12 & 32) != 0) {
            str22 = connectionConfig.fallbackHost;
        }
        if ((i12 & 64) != 0) {
            i18 = connectionConfig.numFailuresForFallback;
        }
        if ((i12 & 128) != 0) {
            z20 = connectionConfig.highPriPendingPublishQueueEnabled;
        }
        if ((i12 & 256) != 0) {
            d4 = connectionConfig.initialReconnectBackoffInSeconds;
        }
        if ((i12 & 512) != 0) {
            d3 = connectionConfig.maxReconnectBackoffInSeconds;
        }
        return connectionConfig.copy(str19, str18, str17, i14, str16, str15, str14, str13, str12, i13, j4, j3, str20, z16, z14, z13, set2, map3, str21, executor2, num2, i17, i16, i20, i15, i21, i19, i22, z18, z15, z12, personalizationConfig2, z17, z11, iMqttBypassClientHolder2, z19, map4, str22, i18, z20, d4, d3);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component10() {
        return this.initialNetworkState;
    }

    public final long component11() {
        return this.capabilities;
    }

    public final long component12() {
        return this.endpointCapabilities;
    }

    public final String component13() {
        return this.regionHint;
    }

    public final boolean component14() {
        return this.qplEnabled;
    }

    public final boolean component15() {
        return this.chatOnEnabled;
    }

    public final boolean component16() {
        return this.isAppInBackground;
    }

    public final Set component17() {
        return this.subscribeTopics;
    }

    public final Map component18() {
        return this.appSpecificInfo;
    }

    public final String component19() {
        return this.cacheDir;
    }

    public final String component2() {
        return this.password;
    }

    public final Executor component20() {
        return this.callbackExecutor;
    }

    public final Integer component21() {
        return this.msysThreadPriority;
    }

    public final int component22() {
        return this.clientKeepAliveInSeconds;
    }

    public final int component23() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int component24() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final int component25() {
        return this.connectTimeoutInSeconds;
    }

    public final int component26() {
        return this.publishTimeoutInSeconds;
    }

    public final int component27() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int component28() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final boolean component29() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final String component3() {
        return this.host;
    }

    public final boolean component30() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final boolean component31() {
        return this.improvedStateReportEnabled;
    }

    public final PersonalizationConfig component32() {
        return this.personalizationConfig;
    }

    public final boolean component33() {
        return this.enableDeferredDisconnect;
    }

    public final boolean component34() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final IMqttBypassClientHolder component35() {
        return this.mqttBypassClientHolder;
    }

    public final boolean component36() {
        return this.autoSubscribeOnReconnect;
    }

    public final Map component37() {
        return this.assetIds;
    }

    public final String component38() {
        return this.fallbackHost;
    }

    public final int component39() {
        return this.numFailuresForFallback;
    }

    public final int component4() {
        return this.port;
    }

    public final boolean component40() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final double component41() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double component42() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final String component5() {
        return this.userAgent;
    }

    public final String component6() {
        return this.deviceId;
    }

    public final String component7() {
        return this.clientType;
    }

    public final String component8() {
        return this.phpOverride;
    }

    public final String component9() {
        return this.appId;
    }

    public final ConnectionConfig copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, long j, long j2, String str9, boolean z, boolean z2, boolean z3, Set set, Map map, String str10, Executor executor, Integer num, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, boolean z6, PersonalizationConfig personalizationConfig, boolean z7, boolean z8, IMqttBypassClientHolder iMqttBypassClientHolder, boolean z9, Map map2, String str11, int i10, boolean z10, double d, double d2) {
        11T.A0G(str, 0, str3);
        11T.A0F(set, 16);
        11T.A0F(map, 17);
        11T.A0F(str10, 18);
        11T.A0F(executor, 19);
        return new ConnectionConfig(str, str2, str3, i, str4, str5, str6, str7, str8, i2, j, j2, str9, z, z2, z3, set, map, str10, executor, num, i3, i4, i5, i6, i7, i8, i9, z4, z5, z6, personalizationConfig, z7, z8, iMqttBypassClientHolder, z9, map2, str11, i10, z10, d, d2);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Map getAppSpecificInfo() {
        return this.appSpecificInfo;
    }

    public final Map getAssetIds() {
        return this.assetIds;
    }

    public final boolean getAutoSubscribeOnReconnect() {
        return this.autoSubscribeOnReconnect;
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public final Executor getCallbackExecutor() {
        return this.callbackExecutor;
    }

    public final long getCapabilities() {
        return this.capabilities;
    }

    public final boolean getChatOnEnabled() {
        return this.chatOnEnabled;
    }

    public final int getClientKeepAliveBackgroundInSeconds() {
        return this.clientKeepAliveBackgroundInSeconds;
    }

    public final int getClientKeepAliveInSeconds() {
        return this.clientKeepAliveInSeconds;
    }

    public final int getClientKeepAliveTimeoutInSeconds() {
        return this.clientKeepAliveTimeoutInSeconds;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final int getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getEnableDeferredDisconnect() {
        return this.enableDeferredDisconnect;
    }

    public final boolean getEnableDeferredDisconnectOnEmptyRcv() {
        return this.enableDeferredDisconnectOnEmptyRcv;
    }

    public final long getEndpointCapabilities() {
        return this.endpointCapabilities;
    }

    public final String getFallbackHost() {
        return this.fallbackHost;
    }

    public final boolean getHighPriPendingPublishQueueEnabled() {
        return this.highPriPendingPublishQueueEnabled;
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean getImprovedStateReportEnabled() {
        return this.improvedStateReportEnabled;
    }

    public final int getInitialNetworkState() {
        return this.initialNetworkState;
    }

    public final double getInitialReconnectBackoffInSeconds() {
        return this.initialReconnectBackoffInSeconds;
    }

    public final double getMaxReconnectBackoffInSeconds() {
        return this.maxReconnectBackoffInSeconds;
    }

    public final int getMaxServerUnavailableBeforeBackoff() {
        return this.maxServerUnavailableBeforeBackoff;
    }

    public final IMqttBypassClientHolder getMqttBypassClientHolder() {
        return this.mqttBypassClientHolder;
    }

    public final Integer getMsysThreadPriority() {
        return this.msysThreadPriority;
    }

    public final boolean getNetworkInterfaceHandlingCellularToWifiEnabled() {
        return this.networkInterfaceHandlingCellularToWifiEnabled;
    }

    public final boolean getNetworkInterfaceHandlingWifiToCellularEnabled() {
        return this.networkInterfaceHandlingWifiToCellularEnabled;
    }

    public final int getNumFailuresForFallback() {
        return this.numFailuresForFallback;
    }

    public final String getPassword() {
        return this.password;
    }

    public final PersonalizationConfig getPersonalizationConfig() {
        return this.personalizationConfig;
    }

    public final String getPhpOverride() {
        return this.phpOverride;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getPreemptivePublishTimeoutInSeconds() {
        return this.preemptivePublishTimeoutInSeconds;
    }

    public final int getPublishTimeoutInSeconds() {
        return this.publishTimeoutInSeconds;
    }

    public final boolean getQplEnabled() {
        return this.qplEnabled;
    }

    public final String getRegionHint() {
        return this.regionHint;
    }

    public final Set getSubscribeTopics() {
        return this.subscribeTopics;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final boolean isAppInBackground() {
        return this.isAppInBackground;
    }

    public final void setAppInBackground(boolean z) {
        this.isAppInBackground = z;
    }

    public final void setInitialNetworkState(int i) {
        this.initialNetworkState = i;
    }

    public final void setRegionHint(String str) {
        this.regionHint = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Config host:");
        sb.append(this.host);
        sb.append(", fallbackHost:");
        sb.append(this.fallbackHost);
        sb.append(", port:");
        sb.append(this.port);
        sb.append(", user:");
        sb.append(this.userId);
        sb.append(", agent:");
        sb.append(this.userAgent);
        sb.append(", deviceId:");
        sb.append(this.deviceId);
        sb.append(", client:");
        sb.append(this.clientType);
        sb.append(", phpOverride:");
        sb.append(this.phpOverride);
        sb.append(", app:");
        sb.append(this.appId);
        sb.append(", capabilities:");
        sb.append(this.capabilities);
        sb.append(", endpointCapabilities:");
        sb.append(this.endpointCapabilities);
        sb.append(", regionHint:");
        sb.append(this.regionHint);
        sb.append(", appInfo:");
        sb.append(this.appSpecificInfo);
        sb.append(", initialTopics:");
        sb.append(this.subscribeTopics);
        sb.append(", qpl:");
        sb.append(this.qplEnabled);
        sb.append(", cacheDir:");
        sb.append(this.cacheDir);
        sb.append(", chatOn:");
        sb.append(this.chatOnEnabled);
        sb.append(", isBackground:");
        sb.append(this.isAppInBackground);
        sb.append(", clientKeepAliveInSeconds:");
        sb.append(this.clientKeepAliveInSeconds);
        sb.append(", clientKeepAliveBackgroundInSeconds:");
        sb.append(this.clientKeepAliveBackgroundInSeconds);
        sb.append(", clientKeepAliveTimeoutInSeconds:");
        sb.append(this.clientKeepAliveTimeoutInSeconds);
        sb.append(", connectTimeoutInSeconds:");
        sb.append(this.connectTimeoutInSeconds);
        sb.append(",publishTimeoutInSeconds:");
        sb.append(this.publishTimeoutInSeconds);
        sb.append(", preemptivePublishTimeoutInSeconds:");
        sb.append(this.preemptivePublishTimeoutInSeconds);
        sb.append(", personalizationConfig:");
        sb.append(this.personalizationConfig);
        sb.append(", networkInterfaceHandlingCellularToWifiEnabled:");
        sb.append(this.networkInterfaceHandlingCellularToWifiEnabled);
        sb.append(", networkInterfaceHandlingWifiToCellularEnabled:");
        sb.append(this.networkInterfaceHandlingWifiToCellularEnabled);
        sb.append(", enableDeferredDisconnect:");
        sb.append(this.enableDeferredDisconnect);
        sb.append(", enableDeferredDisconnectOnEmptyRcv:");
        sb.append(this.enableDeferredDisconnectOnEmptyRcv);
        sb.append(", mqttBypassClientHolder:");
        sb.append(this.mqttBypassClientHolder);
        sb.append(", autoSubscribeOnReconnect:");
        sb.append(this.autoSubscribeOnReconnect);
        sb.append(", numFailuresForFallback:");
        sb.append(this.numFailuresForFallback);
        sb.append(", highPriPendingPublishQueueEnabled:");
        sb.append(this.highPriPendingPublishQueueEnabled);
        sb.append(", initialReconnectBackoffInSeconds:");
        sb.append(this.initialReconnectBackoffInSeconds);
        sb.append(", maxReconnectBackoffInSeconds:");
        sb.append(this.maxReconnectBackoffInSeconds);
        sb.append(", ");
        return sb.toString();
    }
}
