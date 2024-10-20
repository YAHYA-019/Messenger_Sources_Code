package X;

import android.content.Intent;
import android.content.ServiceConnection;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.Jgl, reason: case insensitive filesystem */
/* loaded from: Jgl.class */
public final class C3022Jgl extends MutableLiveData {
    public final /* synthetic */ LA9 A00;

    public C3022Jgl(LA9 la9) {
        this.A00 = la9;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        MutableLiveData mutableLiveData;
        Object obj;
        LA9 la9 = this.A00;
        synchronized (la9) {
            if (la9.A00 == null) {
                String A02 = la9.A02();
                if (A02 != null) {
                    la9.A00 = new LFi(la9, 2);
                    Intent A05 = AbF.A05();
                    DKD.A18(A05, A02, "com.fbpay.w3c.ipc.AutofillKeyFetchServiceImpl");
                    ServiceConnection serviceConnection = la9.A00;
                    if (!09X.A00().A07().A08(la9.A04, A05, serviceConnection, 1)) {
                        la9.A02 = null;
                        la9.A00 = null;
                        mutableLiveData = la9.A05;
                        new Khv(null, AbF.A1D(0Pz.A0W("Couldn't bind to service for ", A02)));
                    }
                } else {
                    mutableLiveData = la9.A05;
                    new Khv(null, AbF.A1D("Package name could not be found."));
                }
                mutableLiveData.postValue(obj);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        LA9 la9 = this.A00;
        LA9.A01(la9.A00, la9);
        la9.A00 = null;
        la9.A02 = null;
    }
}
