package X;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sync.delta.PrefetchedSyncData;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.Random;

/* loaded from: Grk.class */
public final class Grk extends D0d {
    public 1BY A00;
    public final C00i A02;
    public final C15h A03 = J5u.A03(this, 65);
    public final C00i A01 = 1BV.A01((1BY) null, 115658);

    public Grk(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A02 = AbF.A0B(fbUserSession, (1BY) null, 115766);
    }

    @Override // X.D0d
    public Bundle A0H(PrefetchedSyncData prefetchedSyncData, C7a c7a) {
        return 1BK.A05();
    }

    @Override // X.D0d
    public /* bridge */ /* synthetic */ ImmutableSet A0K(Object obj) {
        return RegularImmutableSet.A05;
    }

    @Override // X.D0d
    public /* bridge */ /* synthetic */ ImmutableSet A0L(Object obj) {
        return RegularImmutableSet.A05;
    }

    @Override // X.DHp
    public void BLv(Bundle bundle, C7a c7a) {
        if (1BL.A1a(this.A03)) {
            String str = ((S26) BI7.A00((BI7) c7a.A02, 70)).payload;
            C00i c00i = this.A01;
            c00i.get();
            long nextInt = new Random().nextInt();
            ((I5r) c00i.get()).A01(nextInt);
            ((I5r) c00i.get()).A02(nextInt, AnonymousClass000.A00(ActionId.CONTROLLER_INITIATED));
            I5r i5r = (I5r) c00i.get();
            HAo hAo = HAo.A0A;
            i5r.A03(nextInt, "delivery_channel", hAo.toString());
            if (str == null) {
                ((I5r) c00i.get()).A04(0S2.A08, nextInt);
                4zI.A01("DeltaRtcMultiwaySignalingHandler", "Multiway Iris payload is null", new Object[0]);
                return;
            }
            try {
                ((IDU) this.A02.get()).A04(hAo, Long.valueOf(nextInt), Base64.decode(str, 0), Math.round(str.length() * 0.6d));
            } catch (IllegalArgumentException e) {
                ((I5r) c00i.get()).A05(0S2.A07, e.getMessage(), nextInt);
                4zI.A01("DeltaRtcMultiwaySignalingHandler", "Error decoding multiway Iris payload", new Object[0]);
            }
        }
    }
}
