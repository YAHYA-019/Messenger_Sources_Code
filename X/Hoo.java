package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hoo.class */
public final class Hoo {
    public long A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Hoo(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 99983);
        this.A02 = 1Bu.A03(r0, 115471);
    }

    public final boolean A00(Context context, EffectItem effectItem) {
        if (SystemClock.elapsedRealtime() - this.A00 < 1000) {
            return false;
        }
        this.A00 = SystemClock.elapsedRealtime();
        I5n i5n = (I5n) 1Br.A0B(this.A01);
        1Br.A0C(this.A02);
        I5n.A00(new Hqg(effectItem, 0S2.A0u, null, null), i5n, null, 0S2.A0j, i5n.A01());
        Intent A0A = 4YU.A0A(AnonymousClass000.A00(24));
        A0A.setType("text/plain");
        A0A.putExtra(AnonymousClass000.A00(25), AnonymousClass001.A0h(AnonymousClass001.A0n("https://messenger.com/ar/"), effectItem.A03()));
        0LS.A0C(context, Intent.createChooser(A0A, context.getString(2131956294)));
        return true;
    }
}
