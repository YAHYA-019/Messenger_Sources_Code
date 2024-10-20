package X;

import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;
import com.google.android.gms.safetynet.zzm;

/* loaded from: K2l.class */
public final class K2l extends 3C8 {
    public final 28E A00;
    public final L7b A01;
    public final 4FE A02;

    public K2l(28E r302, L7b l7b, 4FE r304, int i) {
        super(i);
        this.A02 = r304;
        this.A01 = l7b;
        this.A00 = r302;
        if (i == 2 && l7b.A01) {
            throw AnonymousClass001.A0L("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void A00(Status status) {
        this.A02.A02(KY5.A00(status));
    }

    public final void A01(2BK r302, boolean z) {
        4FE r0 = this.A02;
        r302.A01.put(r0, Boolean.valueOf(z));
        r0.A00.A08(new Ldo(r302, r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0101: THROW (r0 I:java.lang.Throwable), block:B:45:0x0101 */
    public final void A02(2A2 r302) {
        Throwable th;
        int A03;
        int i;
        try {
            L7b l7b = this.A01;
            2AD r0 = r302.A04;
            4FE r02 = this.A02;
            if (l7b instanceof K2b) {
                ((K2b) l7b).A00.A01.accept(r0, r02);
                return;
            }
            if (l7b instanceof K2a) {
                zzj zzjVar = (zzj) ((zzi) r0.A03());
                A03 = 0FI.A03(1058929060);
                zzjVar.A01(zzjVar.A00(), 13);
                i = -86930936;
            } else {
                2AD r03 = r0;
                zzm zzmVar = new zzm(r02);
                zzj zzjVar2 = (zzj) ((zzi) r03.A03());
                A03 = 0FI.A03(-205457994);
                Parcel A00 = zzjVar2.A00();
                JQx.A19(zzmVar, A00);
                zzjVar2.A01(A00, 12);
                i = -2088047974;
            }
            0FI.A09(i, A03);
        } catch (DeadObjectException unused) {
            throw th;
        } catch (RemoteException e) {
            A00(new Status(19, 0Pz.A0j(AnonymousClass001.A0X(e), ": ", e.getLocalizedMessage())));
        } catch (RuntimeException e2) {
            this.A02.A02(e2);
        }
    }

    public final void A03(Exception exc) {
        this.A02.A02(exc);
    }

    public final boolean A04(2A2 r302) {
        return this.A01.A01;
    }

    public final Feature[] A05(2A2 r302) {
        return this.A01.A02;
    }
}
