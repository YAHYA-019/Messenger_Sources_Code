package X;

import android.os.Handler;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.3yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yn.class */
public final class C03643yn extends PhoneStateListener {
    public final /* synthetic */ 2Ao A00;

    public C03643yn(2Ao r302) {
        this.A00 = r302;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        2Ao r0 = this.A00;
        ImmutableSet immutableSet = 2Ao.A0N;
        r0.A00 = ((C0dr) r0.A04.get()).now();
        if (!((2yD) r0.A07.get()).AZk(36312694357300169L)) {
            2Ao.A01(r0);
            r0.A02();
        } else {
            1EK.A09("CarrierMonitor", 881081412356415L);
            ((Handler) r0.A08.get()).post(C0jy.A02(new 4OQ(this), "CarrierMonitor", 0));
            1EK.A03();
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onServiceStateChanged(ServiceState serviceState) {
        2Ao r0 = this.A00;
        ImmutableSet immutableSet = 2Ao.A0N;
        if (!((2yD) r0.A07.get()).AZk(36312694357300169L)) {
            2Ao.A01(r0);
            return;
        }
        1EK.A09("CarrierMonitor", 881081412356415L);
        ((Handler) r0.A08.get()).post(C0jy.A02(new Runnable() { // from class: X.3yp
            public static final String __redex_internal_original_name = "CarrierMonitor$1$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                2Ao.A01(C03643yn.this.A00);
            }
        }, "CarrierMonitor", 0));
        1EK.A03();
    }
}
