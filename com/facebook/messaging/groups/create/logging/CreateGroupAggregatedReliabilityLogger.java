package com.facebook.messaging.groups.create.logging;

import X.1BQ;
import X.1Bn;
import X.AbH;
import X.AbL;
import X.AbR;
import X.BLM;
import X.BuT;
import X.C00i;
import X.COk;
import X.Chi;
import X.DIx;
import X.K92;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.io.Serializable;

/* loaded from: CreateGroupAggregatedReliabilityLogger.class */
public class CreateGroupAggregatedReliabilityLogger {
    public final C00i A00;
    public final C00i A01;
    public final COk A02;
    public final AbR A03;
    public final DIx A04;

    /* loaded from: CreateGroupAggregatedReliabilityLogger$ReliabilityInfo.class */
    public class ReliabilityInfo implements Serializable {
        public static final long serialVersionUID = 7990218745490741905L;
        public final String creationType;
        public final long firstAttemptTimestamp;
        public int mqttRequests = 0;
        public int graphRequests = 0;
        public long timeSinceFirstAttempt = -1;
        public Outcome outcome = Outcome.UNKNOWN;
        public int errorCode = 0;

        /* loaded from: CreateGroupAggregatedReliabilityLogger$ReliabilityInfo$Outcome.class */
        public enum Outcome {
            UNKNOWN("u"),
            SUCCESS_MQTT("m"),
            SUCCESS_GRAPH("g"),
            FAILURE_RETRYABLE("f"),
            FAILURE_PERMANENT(K92.__redex_internal_original_name);

            public final String rawValue;

            Outcome(String str) {
                this.rawValue = str;
            }
        }

        public ReliabilityInfo(long j, String str) {
            this.firstAttemptTimestamp = j;
            this.creationType = str;
        }
    }

    public CreateGroupAggregatedReliabilityLogger() {
        AbR abR = (AbR) 1Bn.A0A(380);
        this.A03 = abR;
        this.A00 = AbH.A0a();
        this.A01 = 1BQ.A01();
        Chi chi = new Chi(this);
        this.A04 = chi;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            COk cOk = new COk(chi);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = cOk;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void A00(long j, int i) {
        this.A02.A03(BLM.A03, new BuT((Integer) null, String.valueOf(j), i, true, false));
    }

    public void A01(long j, boolean z) {
        this.A02.A03(BLM.A01, new BuT((Integer) null, String.valueOf(j), 0, true, z));
    }

    public void A02(Integer num, long j) {
        this.A02.A03(BLM.A02, new BuT(num, String.valueOf(j), 0, true, false));
    }

    public void A03(Integer num, long j) {
        this.A02.A03(BLM.A04, new BuT(num, String.valueOf(j), 0, true, false));
    }
}
