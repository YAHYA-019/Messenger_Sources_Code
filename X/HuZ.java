package X;

import android.view.Surface;

/* loaded from: HuZ.class */
public abstract class HuZ {
    public JNc A00;
    public I9e A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public volatile boolean A05;

    public HuZ(boolean z) {
        this.A04 = z;
        this.A03 = z ? AnonymousClass001.A0R() : null;
        this.A02 = AnonymousClass001.A0R();
    }

    public abstract Surface A00(I9e i9e);

    public final void A01() {
        if (this.A04) {
            synchronized (this.A02) {
                JNc jNc = this.A00;
                if (jNc != null) {
                    jNc.CAU();
                }
            }
        }
    }

    public final void A02() {
        Object obj;
        Object obj2 = this.A03;
        if (obj2 == null) {
            throw 1BK.A0h();
        }
        if (this.A04) {
            obj = this.A02;
            synchronized (obj) {
                try {
                    JNc jNc = this.A00;
                    if (jNc != null) {
                        jNc.CAT();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        obj = obj2;
        synchronized (obj2) {
            this.A05 = true;
            obj2.notifyAll();
        }
    }

    public final void A03() {
        Object obj = this.A03;
        if (obj == null) {
            throw 1BK.A0h();
        }
        synchronized (obj) {
            while (!this.A05) {
                try {
                    obj.wait(2000L);
                } catch (InterruptedException e) {
                    I9e i9e = this.A01;
                    if (i9e != null && i9e.A0K()) {
                        AnonymousClass001.A13();
                    }
                    throw AnonymousClass001.A0U(e);
                }
            }
        }
    }

    public abstract boolean A04();
}
