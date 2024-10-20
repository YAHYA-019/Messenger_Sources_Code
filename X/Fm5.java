package X;

import com.facebook.payments.confirmation.ConfirmationData;
import com.facebook.payments.confirmation.ConfirmationMessageParams;
import com.facebook.payments.confirmation.ConfirmationViewParams;
import com.facebook.payments.confirmation.PostPurchaseAction;
import com.facebook.payments.confirmation.SimpleConfirmationData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fm5.class */
public final class Fm5 implements GFV {
    public final Fm6 A00 = (Fm6) 1Bn.A0A(99007);

    public /* bridge */ /* synthetic */ ImmutableList Adp(ConfirmationData confirmationData) {
        SimpleConfirmationData simpleConfirmationData = (SimpleConfirmationData) confirmationData;
        ImmutableList.Builder A0h = 4YU.A0h();
        ConfirmationViewParams confirmationViewParams = simpleConfirmationData.A00.A02.A02;
        if (confirmationViewParams != null) {
            ConfirmationMessageParams confirmationMessageParams = confirmationViewParams.A01;
            if (confirmationMessageParams != null) {
                this.A00.A04(confirmationMessageParams, A0h);
            }
            PostPurchaseAction postPurchaseAction = confirmationViewParams.A03;
            if (postPurchaseAction != null) {
                this.A00.A05(postPurchaseAction, A0h);
            }
            ImmutableList immutableList = confirmationViewParams.A04;
            if (immutableList != null) {
                this.A00.A06(simpleConfirmationData, A0h, immutableList);
            }
            A0h.m11011add(new Object());
        }
        return A0h.build();
    }
}
