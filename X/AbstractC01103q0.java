package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.3q0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3q0.class */
public abstract class AbstractC01103q0 extends AbstractC01113q1 {
    public final int A00;
    public final Bundle A01;
    public final /* synthetic */ 2AD A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC01103q0(android.os.Bundle r302, final X.2AD r303, int r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r305 = r0
            r0 = r301
            r1 = r303
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            r1 = r302
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01103q0.<init>(android.os.Bundle, X.2AD, int):void");
    }

    public void A01(ConnectionResult connectionResult) {
        2AD r305;
        if (this instanceof C01123q2) {
            r305 = ((C01123q2) this).A01;
            2BC r0 = r305.A0I;
            if (r0 != null) {
                r0.A00.Bqs(connectionResult);
            }
        } else {
            r305 = ((C01093pz) this).A00;
            r305.A08.CGk(connectionResult);
        }
        r305.A01 = connectionResult.A01;
        r305.A05 = System.currentTimeMillis();
    }

    public boolean A02() {
        if (!(this instanceof C01123q2)) {
            ((C01093pz) this).A00.A08.CGk(ConnectionResult.A04);
            return true;
        }
        C01123q2 c01123q2 = (C01123q2) this;
        try {
            IBinder iBinder = c01123q2.A00;
            AbstractC00481b7.A02(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            2AD r0 = c01123q2.A01;
            String A05 = r0.A05();
            if (!A05.equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", 0Pz.A0v("service descriptor mismatch: ", A05, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface A04 = r0.A04(iBinder);
            if (A04 == null) {
                return false;
            }
            if (!2AD.A01(A04, r0, 2, 4) && !2AD.A01(A04, r0, 3, 4)) {
                return false;
            }
            r0.A07 = null;
            2B8 r02 = r0.A0H;
            if (r02 == null) {
                return true;
            }
            r02.A00.Bqg((Bundle) null);
            return true;
        } catch (RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
