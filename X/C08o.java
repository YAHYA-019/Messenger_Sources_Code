package X;

import android.app.Notification;
import android.app.Service;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.util.Iterator;

/* renamed from: X.08o, reason: invalid class name */
/* loaded from: 08o.class */
public abstract class C08o {
    public static final int A00(Service service, int i) {
        Iterator it = C01w.A00.iterator();
        while (it.hasNext()) {
            ((C01f) it.next()).Brl(service);
        }
        return ExternalProviders.A02.A0A().A00(6, 27, i, 0, 0L);
    }

    public static final int A01(Service service, int i) {
        Iterator it = C01w.A00.iterator();
        while (it.hasNext()) {
            ((C01f) it.next()).CMl(service);
        }
        return ExternalProviders.A02.A0A().A00(6, 27, i, 0, 0L);
    }

    public static final void A02(int i, int i2) {
        ExternalProviders.A02.A0A().A00(6, 28, i, i2, 0L);
    }

    public static final void A03(int i, int i2) {
        ExternalProviders.A02.A0A().A00(6, 28, i, i2, 0L);
    }

    public static final void A04(Notification notification, Service service, int i) {
        11T.A0F(notification, 2);
        service.startForeground(i, notification);
        Iterator it = C01w.A00.iterator();
        while (it.hasNext()) {
            ((C01f) it.next()).D1j(service);
        }
    }

    public static final void A05(Service service) {
        11T.A0F(service, 0);
        service.stopForeground(true);
        Iterator it = C01w.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
