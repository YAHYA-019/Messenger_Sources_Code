package X;

import com.facebook.messaging.notify.type.MessagingNotification;

/* renamed from: X.5q0, reason: invalid class name */
/* loaded from: 5q0.class */
public final class C5q0 implements C5pz {
    public boolean A00 = false;
    public final C45d A01;
    public final MessagingNotification A02;
    public final C5pz A03;
    public final 1PB A04;

    public C5q0(C45d c45d, MessagingNotification messagingNotification, C5pz c5pz, 1PB r305) {
        this.A03 = c5pz;
        this.A02 = messagingNotification;
        this.A01 = c45d;
        this.A04 = r305;
    }

    @Override // X.C5pz
    public void Blg() {
        synchronized (this) {
            if (this.A00) {
                0fH.A0m("BitmapCallbackWithTimeout", "onBitmapFetchFailed() ignored");
                return;
            }
            this.A00 = true;
            0fH.A0m("BitmapCallbackWithTimeout", "onBitmapFetchFailed()");
            this.A03.Blg();
        }
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        synchronized (this) {
            if (this.A00) {
                0fH.A0m("BitmapCallbackWithTimeout", "onCloseableBitmapAvailable() ignored");
                r302.close();
            } else {
                this.A00 = true;
                0fH.A0m("BitmapCallbackWithTimeout", "onCloseableBitmapAvailable()");
                this.A03.BpV(r302);
            }
        }
    }
}
