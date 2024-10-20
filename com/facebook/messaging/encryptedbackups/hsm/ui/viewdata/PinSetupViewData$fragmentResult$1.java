package com.facebook.messaging.encryptedbackups.hsm.ui.viewdata;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.C0Bd;
import X.C8sC;

/* loaded from: PinSetupViewData$fragmentResult$1.class */
public final class PinSetupViewData$fragmentResult$1 extends 0DO implements C0Bd {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    public PinSetupViewData$fragmentResult$1(0DR r302) {
        super(3, r302);
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A03 = AnonymousClass001.A03(obj2);
        PinSetupViewData$fragmentResult$1 pinSetupViewData$fragmentResult$1 = new PinSetupViewData$fragmentResult$1((0DR) obj3);
        pinSetupViewData$fragmentResult$1.L$0 = obj;
        pinSetupViewData$fragmentResult$1.I$0 = A03;
        return pinSetupViewData$fragmentResult$1.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        Object obj2 = this.L$0;
        int i = this.I$0;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("fragmentResult: registrationResult: ");
        A0k.append(obj2);
        0fH.A0j("PinSetupViewData", AnonymousClass001.A0e(", clicked: ", A0k, i));
        return new PinSetupViewData$FragmentResult(i, 11T.A0O(obj2, C8sC.A00));
    }
}
