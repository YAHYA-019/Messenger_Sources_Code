package com.facebook.account.twofac.protocol;

import X.AbstractC01033pi;
import X.BRb;
import X.C27T;
import com.facebook.common.json.FbJsonDeserializer;

/* loaded from: CheckApprovedMachineMethod_ApprovalStatusDeserializer.class */
public class CheckApprovedMachineMethod_ApprovalStatusDeserializer extends FbJsonDeserializer {
    public CheckApprovedMachineMethod_ApprovalStatusDeserializer() {
        this.A00 = CheckApprovedMachineMethod$ApprovalStatus.class;
    }

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return BRb.A00(abstractC01033pi);
    }
}
