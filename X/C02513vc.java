package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged;
import com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit;

/* renamed from: X.3vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vc.class */
public final class C02513vc implements 1Vf {
    public final Context A00;
    public final 1Br A01;

    public C02513vc() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        11T.A0A(A00);
        this.A01 = 1Bu.A01(A00, 16428);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        2SG r309;
        1Hb r305;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterChanged")) {
            OnThreadTypeFilterChanged onThreadTypeFilterChanged = (OnThreadTypeFilterChanged) r302;
            11T.A0F(onThreadTypeFilterChanged, 0);
            FbUserSession A03 = 1Br.A03(this.A01);
            Context context = this.A00;
            11T.A09(context);
            r309 = (2SG) 1Lm.A05(context, A03, 33197);
            r305 = onThreadTypeFilterChanged.A00;
        } else {
            if (!str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadTypeFilterInit")) {
                throw 0Pz.A05(1BJ.A00(ActionId.MESSENGER_DELTA_REQUEST), str);
            }
            OnThreadTypeFilterInit onThreadTypeFilterInit = (OnThreadTypeFilterInit) r302;
            11T.A0F(onThreadTypeFilterInit, 0);
            FbUserSession A04 = 1Fw.A04((1EZ) this.A01.A00.get());
            Context context2 = this.A00;
            11T.A09(context2);
            r309 = (2SG) 1Lm.A05(context2, A04, 33197);
            r305 = onThreadTypeFilterInit.A00;
        }
        r309.A00 = r305;
    }
}
