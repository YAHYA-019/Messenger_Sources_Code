package com.facebook.messaging.groups.create.logging;

import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.AbH;
import X.AbL;
import X.AbR;
import X.BLb;
import X.C00i;
import X.C1m1;
import X.CDK;
import X.COk;
import X.Chj;
import X.DIx;
import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.inject.FbInjector;
import java.io.Serializable;

/* loaded from: CreateGroupAggregatedLatencyLogger.class */
public class CreateGroupAggregatedLatencyLogger {
    public final RealtimeSinceBootClock A00;
    public final C00i A01;
    public final C00i A02;
    public final COk A03;
    public final C1m1 A04;
    public final AbR A05;
    public final DIx A06;

    /* loaded from: CreateGroupAggregatedLatencyLogger$LatencyInfo.class */
    public class LatencyInfo implements Serializable {
        public static final long serialVersionUID = -8448745752365380852L;
        public long appStartMs;
        public long appSuccessMs;
        public long preRequestMs;
        public long requestPubAckMs;
        public long requestPublishedMs;
        public long requestResponseMs;
        public final long startMqttConnectionMs;
        public final long startMs;
        public long uiSuccessMs;
        public long webSuccessMs;
        public boolean sameMqttConnection = true;
        public String creationType = "u";

        public LatencyInfo(long j, long j2) {
            long j3 = -1;
            this.appStartMs = j3;
            this.preRequestMs = j3;
            this.requestPublishedMs = j3;
            this.requestPubAckMs = j3;
            this.requestResponseMs = j3;
            this.webSuccessMs = j3;
            this.appSuccessMs = j3;
            this.uiSuccessMs = j3;
            this.startMs = j;
            this.startMqttConnectionMs = j2;
        }
    }

    public CreateGroupAggregatedLatencyLogger() {
        AbR abR = (AbR) 1Bn.A0A(380);
        this.A05 = abR;
        this.A02 = AbH.A0a();
        this.A00 = (RealtimeSinceBootClock) 1Bi.A03(84490);
        this.A04 = (C1m1) 1Bi.A03(16782);
        this.A01 = 1BQ.A01();
        Chj chj = new Chj(this);
        this.A06 = chj;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            COk cOk = new COk(chj);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = cOk;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void A00(long j) {
        CDK.A00(this.A03, BLb.A02, j);
    }

    public void A01(long j) {
        CDK.A00(this.A03, BLb.A07, j);
    }
}
