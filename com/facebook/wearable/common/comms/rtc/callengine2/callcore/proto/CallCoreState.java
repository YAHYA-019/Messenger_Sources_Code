package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEY;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: CallCoreState.class */
public final class CallCoreState extends KJb implements MJ3 {
    public static final int CALLS_FIELD_NUMBER = 2;
    public static final int CALL_ACCOUNTS_FIELD_NUMBER = 1;
    public static final CallCoreState DEFAULT_INSTANCE;
    public static final int INCOMING_CALL_DECISION_CACHE_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int POST_CHECKLISTS_FIELD_NUMBER = 4;
    public static final int PRE_CHECKLISTS_FIELD_NUMBER = 3;
    public MRR callAccounts_;
    public MRR calls_;
    public MRR incomingCallDecisionCache_;
    public MRR postChecklists_;
    public MRR preChecklists_;

    static {
        CallCoreState callCoreState = new CallCoreState();
        DEFAULT_INSTANCE = callCoreState;
        KJb.A0A(callCoreState, CallCoreState.class);
    }

    public CallCoreState() {
        KE9 ke9 = KE9.A02;
        this.callAccounts_ = ke9;
        this.calls_ = ke9;
        this.preChecklists_ = ke9;
        this.postChecklists_ = ke9;
        this.incomingCallDecisionCache_ = ke9;
    }

    public static KEY newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreState parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
    }

    public final Object dynamicMethod(KMJ kmj, Object obj, Object obj2) {
        Object obj3;
        MGg mGg;
        switch (kmj.ordinal()) {
            case 0:
                obj3 = (byte) 1;
                break;
            case 1:
                return null;
            case 2:
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005����\u0001\u0005\u0005��\u0005��\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"callAccounts_", CallAccount.class, "calls_", Call.class, "preChecklists_", Check.class, "postChecklists_", Check.class, "incomingCallDecisionCache_", IncomingCallDecisionWithVideoOverride.class});
            case 3:
                return new CallCoreState();
            case 4:
                return new KEY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreState.class) {
                        mGg = PARSER;
                        if (mGg == null) {
                            L9l l9l = Lgf.A01;
                            mGg = KJb.A00(DEFAULT_INSTANCE);
                            PARSER = mGg;
                        }
                    }
                    return mGg;
                }
                break;
            default:
                throw AnonymousClass001.A0p();
        }
        return obj3;
    }
}
