package X;

import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: K2n.class */
public final class K2n extends AbstractDialogInterfaceOnCancelListenerC01053pk {
    public final SparseArray A00;

    public K2n(MKC mkc) {
        super(GoogleApiAvailability.A00, mkc);
        this.A00 = DKC.A0E();
        ((LifecycleCallback) this).A00.A5N(this, "AutoManageHelper");
    }

    private final LcI A01(int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (LcI) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A06() {
        super.A06();
        SparseArray sparseArray = this.A00;
        android.util.Log.d("AutoManageHelper", 0Pz.A17("onStart ", " ", String.valueOf(sparseArray), this.A03));
        if (this.A01.get() == null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                LcI A01 = A01(i);
                if (A01 != null) {
                    A01.A01.A08();
                }
            }
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A07() {
        super.A07();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00.size()) {
                return;
            }
            LcI A01 = A01(i2);
            if (A01 != null) {
                A01.A01.A09();
            }
            i = i2 + 1;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00.size()) {
                return;
            }
            LcI A01 = A01(i2);
            if (A01 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(0);
                printWriter.println(":");
                A01.A01.A0D(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
            i = i2 + 1;
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk
    public final void A09() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00.size()) {
                return;
            }
            LcI A01 = A01(i2);
            if (A01 != null) {
                A01.A01.A08();
            }
            i = i2 + 1;
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC01053pk
    public final void A0A(ConnectionResult connectionResult, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray sparseArray = this.A00;
        LcI lcI = (LcI) sparseArray.get(i);
        if (lcI != null) {
            LcI lcI2 = (LcI) sparseArray.get(i);
            sparseArray.remove(i);
            if (lcI2 != null) {
                28M r0 = lcI2.A01;
                r0.A0C(lcI2);
                r0.A09();
            }
            lcI.A00.Bqs(connectionResult);
        }
    }
}
