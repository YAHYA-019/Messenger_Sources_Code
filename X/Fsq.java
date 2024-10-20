package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.util.TriState;
import com.facebook.zero.common.ZeroIndicatorData;
import com.google.common.base.Objects;
import java.io.IOException;

/* loaded from: Fsq.class */
public final class Fsq implements GGf {
    public C15h A00;
    public final EqD A01;

    public Fsq() {
        EqD eqD = (EqD) 1Bi.A03(98620);
        G7K A01 = G7K.A01(this, ActionId.MESSENGER_QUEUE_CREATION);
        this.A01 = eqD;
        this.A00 = A01;
    }

    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        Uri data;
        if (1BL.A1a(this.A00) && (data = intent.getData()) != null) {
            EqD eqD = this.A01;
            if (eqD.A06 == null) {
                synchronized (eqD) {
                    if (eqD.A06 == null) {
                        try {
                            String A3a = 1BK.A0R(eqD.A01).A3a(DKC.A0b(((1Ky) eqD.A03.get()).A0Q), "");
                            if (!1JF.A0B(A3a)) {
                                eqD.A02.get();
                                eqD.A06 = 5Xm.A00(A3a);
                            }
                        } catch (IOException e) {
                            0fH.A0S(EqD.class, "Error deserializing indicator data %s: ", new Object[]{e.getMessage(), e});
                        }
                    }
                }
            }
            ZeroIndicatorData zeroIndicatorData = eqD.A06;
            if (zeroIndicatorData != null && Objects.equal(data.toString(), zeroIndicatorData.A01)) {
                return TriState.YES;
            }
        }
        return TriState.UNSET;
    }
}
