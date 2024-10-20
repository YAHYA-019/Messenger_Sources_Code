package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pk.class */
public abstract class AbstractDialogInterfaceOnCancelListenerC01053pk extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final GoogleApiAvailability A00;
    public final AtomicReference A01;
    public final Handler A02;
    public volatile boolean A03;

    public AbstractDialogInterfaceOnCancelListenerC01053pk(GoogleApiAvailability googleApiAvailability, MKC mkc) {
        super(mkc);
        this.A01 = new AtomicReference(null);
        this.A02 = new C28w(Looper.getMainLooper());
        this.A00 = googleApiAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A06() {
        this.A03 = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void A07() {
        this.A03 = false;
    }

    public void A09() {
        Handler handler = ((C01043pj) this).A01.A06;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public void A0A(ConnectionResult connectionResult, int i) {
        ((C01043pj) this).A01.A05(connectionResult, i);
    }

    public final void A0B(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        4TH r0 = new 4TH(connectionResult, i);
        do {
            atomicReference = this.A01;
            if (1MG.A00(atomicReference, (Object) null, r0)) {
                this.A02.post(new LoY(r0, this));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.A01;
        4TH r0 = (4TH) atomicReference.get();
        int i = r0 == null ? -1 : r0.A00;
        atomicReference.set(null);
        A0A(connectionResult, i);
    }
}
