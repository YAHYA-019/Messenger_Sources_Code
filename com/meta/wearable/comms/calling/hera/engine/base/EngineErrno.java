package com.meta.wearable.comms.calling.hera.engine.base;

import X.AnonymousClass001;
import X.HM1;
import X.MGf;

/* loaded from: EngineErrno.class */
public enum EngineErrno implements MGf {
    ENGINE_ERR_OK(0),
    ENGINE_ERR_FAILURE(1),
    ENGINE_ERR_MAKING_CALL_WHILE_CALL_IN_PROGRESS(2),
    UNRECOGNIZED(-1);

    public static final HM1 internalValueMap = new HM1();
    public final int value;

    EngineErrno(int i) {
        this.value = i;
    }

    public static EngineErrno forNumber(int i) {
        if (i == 0) {
            return ENGINE_ERR_OK;
        }
        if (i == 1) {
            return ENGINE_ERR_FAILURE;
        }
        if (i != 2) {
            return null;
        }
        return ENGINE_ERR_MAKING_CALL_WHILE_CALL_IN_PROGRESS;
    }

    @Override // X.MGf
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw AnonymousClass001.A0L("Can't get the number of an unknown enum value.");
    }
}
