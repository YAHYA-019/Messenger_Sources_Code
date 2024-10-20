package X;

import com.facebook.payments.confirmation.ConfirmationData;
import com.facebook.payments.confirmation.ConfirmationViewParams;
import com.facebook.payments.confirmation.SimpleConfirmationData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fm4.class */
public final class Fm4 implements GFV {
    public /* bridge */ /* synthetic */ ImmutableList Adp(ConfirmationData confirmationData) {
        ImmutableList.Builder A0h = 4YU.A0h();
        ConfirmationViewParams confirmationViewParams = ((SimpleConfirmationData) confirmationData).A00.A02.A02;
        confirmationViewParams.getClass();
        2JX r0 = confirmationViewParams.A00;
        r0.getClass();
        1Du A0w = AbI.A0w(r0, 947936814, 1325792274);
        while (A0w.hasNext()) {
            1Du A0w2 = AbI.A0w(AbG.A0D(A0w), -447446250, 96187451);
            while (A0w2.hasNext()) {
                2JX A0D = AbG.A0D(A0w2);
                2JX A0L = 1BL.A0L(A0D, 281035123, -1406647334);
                A0h.m11011add((Object) new Fm0(1BL.A0L(A0D, -612557761, 1675946283), 1BL.A0L(A0D, -324052173, 1851371179), A0L));
            }
        }
        return A0h.build();
    }
}
