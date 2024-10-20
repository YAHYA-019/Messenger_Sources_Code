package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import android.util.Log;

/* loaded from: DalvikReplaceBuffer.class */
public class DalvikReplaceBuffer {
    public static final String LOG_TAG = "DalvikReplaceBuffer";
    public static String failureReason = "";
    public static Result resultValue = Result.NOT_ATTEMPTED;

    /* loaded from: DalvikReplaceBuffer$Result.class */
    public enum Result {
        NOT_ATTEMPTED,
        FAILURE,
        SUCCESS
    }

    public static String getFailureString() {
        if (resultValue == Result.FAILURE) {
            return failureReason;
        }
        throw AnonymousClass001.A0N("No failure string is provided when the operation did not fail.");
    }

    public static Result getResult() {
        return resultValue;
    }

    public static void replaceBuffer(DalvikLinearAllocType dalvikLinearAllocType) {
        if (resultValue != Result.NOT_ATTEMPTED) {
            Log.e(LOG_TAG, "Multiple attempts to replace the buffer detected!");
            return;
        }
        try {
            DalvikInternals.fixLinearAllocBuffer(dalvikLinearAllocType.bufferSizeBytes);
            resultValue = Result.SUCCESS;
        } catch (Throwable th) {
            resultValue = Result.FAILURE;
            failureReason = th.getMessage();
            Log.e(LOG_TAG, 0Pz.A0d("Failed to replace LinearAlloc buffer (at size ", "). Continuing with standard buffer.", dalvikLinearAllocType.bufferSizeBytes), th);
        }
    }

    public static boolean replaceBufferIfNecessary(DalvikLinearAllocType dalvikLinearAllocType) {
        return false;
    }
}
