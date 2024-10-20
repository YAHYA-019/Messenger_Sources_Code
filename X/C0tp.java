package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.service.ChatHeadService;

/* renamed from: X.0tp, reason: invalid class name */
/* loaded from: 0tp.class */
public final class C0tp implements C02l {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C0tp(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C02l
    public final void CFb(Context context, Intent intent, C01q c01q) {
        switch (this.A00) {
            case 0:
                ((ChatHeadService) this.A01).A1K((FbUserSession) this.A02);
                return;
            case 1:
                ((ChatHeadService) this.A01).A1L((FbUserSession) this.A02);
                return;
            case 2:
                ((ChatHeadService) this.A01).A1J(intent, (FbUserSession) this.A02);
                return;
            case 3:
                ((ChatHeadService) this.A01).A1M((FbUserSession) this.A02);
                return;
            default:
                int A00 = C09o.A00(-1908167240);
                String dataString = intent.getDataString();
                05S r0 = ((0IM) this.A01).A01;
                if (05W.A01(r0.A00, r0.A01, dataString)) {
                    ((Runnable) this.A02).run();
                }
                C09o.A01(324140484, A00);
                return;
        }
    }
}
