package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* loaded from: K2k.class */
public final class K2k extends 3C8 {
    public final KrG A00;
    public final 4FE A01;

    public K2k(KrG krG, 4FE r303) {
        super(4);
        this.A01 = r303;
        this.A00 = krG;
    }

    public final void A00(Status status) {
        this.A01.A02(new 3F8(status));
    }

    public final /* bridge */ /* synthetic */ void A01(2BK r302, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(2A2 r302) {
        try {
            r302.A08.remove(this.A00);
            this.A01.A03(1BK.A0d());
        } catch (DeadObjectException e) {
            A00(new Status(19, 0Pz.A0j(AnonymousClass001.A0X(e), ": ", e.getLocalizedMessage())));
            throw e;
        } catch (RemoteException e2) {
            A00(new Status(19, 0Pz.A0j(AnonymousClass001.A0X(e2), ": ", e2.getLocalizedMessage())));
        } catch (RuntimeException e3) {
            this.A01.A02(e3);
        }
    }

    public final void A03(Exception exc) {
        this.A01.A02(exc);
    }

    public final boolean A04(2A2 r302) {
        r302.A08.get(this.A00);
        return false;
    }

    public final Feature[] A05(2A2 r302) {
        r302.A08.get(this.A00);
        return null;
    }
}
