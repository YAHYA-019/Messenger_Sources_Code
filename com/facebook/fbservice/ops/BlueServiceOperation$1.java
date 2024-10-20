package com.facebook.fbservice.ops;

import X.0FI;
import X.LDB;
import X.LnP;
import android.os.Handler;
import com.facebook.fbservice.service.ICompletionHandler;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: BlueServiceOperation$1.class */
public final class BlueServiceOperation$1 extends ICompletionHandler.Stub {
    public final /* synthetic */ LDB A00;

    public BlueServiceOperation$1(LDB ldb) {
        this.A00 = ldb;
        0FI.A09(-1486048397, 0FI.A03(1125336763));
    }

    @Override // com.facebook.fbservice.service.ICompletionHandler
    public void CA5(OperationResult operationResult) {
        int A03 = 0FI.A03(-1192193289);
        LDB.A05(this.A00, operationResult);
        0FI.A09(-366974591, A03);
    }

    @Override // com.facebook.fbservice.service.ICompletionHandler
    public void CA7(OperationResult operationResult) {
        int A03 = 0FI.A03(2039057230);
        LDB ldb = this.A00;
        if (!ldb.A0E) {
            Runnable lnP = new LnP(this, operationResult);
            Handler handler = ldb.A01;
            if (handler != null) {
                handler.post(lnP);
            } else {
                ldb.A0L.execute(lnP);
            }
        }
        0FI.A09(-1435073109, A03);
    }
}
