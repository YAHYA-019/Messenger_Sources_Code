package X;

import com.facebook.contacts.picker.SingleTapActionConfig;
import com.facebook.messaging.neue.contactpicker.ContactPickerParams;
import com.google.common.collect.ImmutableList;

/* loaded from: Cks.class */
public final class Cks implements DGx {
    public final /* synthetic */ AlM A00;

    public Cks(AlM alM) {
        this.A00 = alM;
    }

    @Override // X.DGx
    public void Coj(String str) {
    }

    @Override // X.DGx
    public void Cwf(ImmutableList immutableList) {
        AlM alM = this.A00;
        AlL alL = alM.A0I;
        if (alL != null) {
            alL.A0V = immutableList;
            DJk dJk = alL.A0T;
            ContactPickerParams contactPickerParams = alL.A0P;
            boolean z = contactPickerParams.A0F;
            SingleTapActionConfig singleTapActionConfig = contactPickerParams.A02;
            ImmutableList immutableList2 = contactPickerParams.A07;
            dJk.D1t(new Bwo(contactPickerParams.A01, alL.A01, singleTapActionConfig, contactPickerParams.A06, immutableList, immutableList2, z));
            return;
        }
        C1555AlG c1555AlG = alM.A08;
        if (c1555AlG != null) {
            BuS buS = c1555AlG.A08;
            buS.getClass();
            buS.A03 = immutableList;
            C1555AlG c1555AlG2 = alM.A08;
            C1555AlG.A06(c1555AlG2);
            BuS buS2 = c1555AlG2.A08;
            buS2.getClass();
            buS2.A01.AEC();
            c1555AlG2.A08.A01.A08();
        }
    }
}
