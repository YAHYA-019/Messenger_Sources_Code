package com.facebook.contacts.service;

import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1Bn;
import X.1Bt;
import X.3qL;
import X.3qM;
import X.4YU;
import X.7zL;
import X.AbI;
import X.AbstractC00603o4;
import X.AbstractC02263un;
import X.C00i;
import X.C15h;
import X.DBe;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;

/* loaded from: ContactLocaleChangeService.class */
public class ContactLocaleChangeService extends AbstractC02263un implements CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(ContactLocaleChangeService.class);
    public 3qL A00;
    public C00i A01;
    public C15h A02;
    public final C00i A03;

    public ContactLocaleChangeService() {
        super(ContactLocaleChangeService.class.getSimpleName());
        this.A03 = 1BQ.A02(66185);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02263un
    public void A03() {
        this.A02 = DBe.A00(this, 5);
        this.A01 = 7zL.A0R(this, 33031);
        this.A00 = (3qL) 1Bn.A0A(32774);
    }

    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        0fH.A07(ContactLocaleChangeService.class, intent, AbstractC00603o4.A00(384));
        ((1Bt) this.A03.get()).A02();
        C15h c15h = this.A02;
        c15h.getClass();
        if (c15h.get() != null) {
            Bundle A05 = 1BK.A05();
            BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 4YU.A0p(this.A01);
            CallerContext callerContext = A04;
            AbI.A1H(A05, callerContext, blueServiceOperationFactory, 1BJ.A00(471));
            this.A00.getClass();
            this.A00.getClass();
            if (3qL.A03.contains(3qM.A02)) {
                0fH.A0A(ContactLocaleChangeService.class, "Trigger reindex contacts omnistore collection");
                AbI.A1H(A05, callerContext, (BlueServiceOperationFactory) 4YU.A0p(this.A01), 1BJ.A00(ActionId.RTMP_CONNECTION_RELEASE));
            }
            0fH.A07(ContactLocaleChangeService.class, intent, "Done handling intent: %s");
        }
    }
}
