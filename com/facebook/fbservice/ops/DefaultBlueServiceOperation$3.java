package com.facebook.fbservice.ops;

import X.0FI;
import X.0Pz;
import X.1Ho;
import X.3gO;
import com.facebook.fbservice.service.ICompletionHandler;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: DefaultBlueServiceOperation$3.class */
public final class DefaultBlueServiceOperation$3 extends ICompletionHandler.Stub {
    public final /* synthetic */ 1Ho A00;

    public DefaultBlueServiceOperation$3(1Ho r302) {
        this.A00 = r302;
        0FI.A09(608762445, 0FI.A03(-1826168735));
    }

    @Override // com.facebook.fbservice.service.ICompletionHandler
    public void CA5(OperationResult operationResult) {
        int A03 = 0FI.A03(-2015683598);
        this.A00.A07(operationResult);
        0FI.A09(-1744303350, A03);
    }

    @Override // com.facebook.fbservice.service.ICompletionHandler
    public void CA7(OperationResult operationResult) {
        int A03 = 0FI.A03(-626413271);
        1Ho r0 = this.A00;
        if (!r0.A01.A02 && !r0.A0A) {
            1Ho.A03(r0, new 3gO(r0, operationResult), 0Pz.A0W("ReportProgress-", r0.A0N));
        }
        0FI.A09(800762246, A03);
    }
}
