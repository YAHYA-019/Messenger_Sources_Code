package com.facebook.rti.mqtt.manager;

import X.05P;
import X.0fH;
import X.AnonymousClass001;
import X.C00j;
import X.C05O;
import X.C17o;
import android.content.Intent;
import android.os.Looper;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: MqttBackgroundServiceDelegate.class */
public abstract class MqttBackgroundServiceDelegate extends C05O {
    public boolean A00;
    public final Object A01;
    public volatile C17o A02;

    public MqttBackgroundServiceDelegate(05P r302) {
        super(r302);
        this.A01 = AnonymousClass001.A0R();
    }

    @Override // X.C05O
    public int A0C(Intent intent, int i, int i2) {
        this.A02.A02(i, i2, intent);
        return 1;
    }

    @Override // X.C05O
    public void A0D() {
        this.A02.A00();
        super.A0D();
    }

    @Override // X.C05O
    public void A0F(Intent intent, int i) {
        A0C(intent, -1, i);
    }

    @Override // X.C05O
    public final void A0G(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A0M();
        A0Q(fileDescriptor, printWriter, strArr);
    }

    @Override // X.C05O
    public void A0I() {
        C17o c17o;
        A0E();
        0fH.A0l("MqttBackgroundService", "Creating service");
        Looper A0L = A0L();
        if (A0L == null || A0L == Looper.getMainLooper()) {
            final Looper mainLooper = Looper.getMainLooper();
            c17o = new C17o(mainLooper, this) { // from class: X.0ku
                public final /* synthetic */ MqttBackgroundServiceDelegate A00;

                {
                    this.A00 = this;
                }

                @Override // X.C17o
                public void A00() {
                    this.A00.A0N();
                }

                @Override // X.C17o
                public void A01() {
                    this.A00.A0M();
                }

                @Override // X.C17o
                public void A02(int i, int i2, Intent intent) {
                    this.A00.A0P(i, i2, intent);
                }
            };
        } else {
            c17o = new C17o(A0L, this);
        }
        this.A02 = c17o;
        this.A02.A01();
    }

    public abstract Looper A0L();

    public void A0M() {
        C00j.A05("MqttBackgroundServiceDelegate.ensureInitialized", -1398809912);
        try {
            synchronized (this.A01) {
                if (!this.A00) {
                    A0O();
                    this.A00 = true;
                }
            }
            C00j.A01(282297691);
        } catch (Throwable th) {
            C00j.A01(1268921199);
            throw th;
        }
    }

    public abstract void A0N();

    public abstract void A0O();

    public abstract void A0P(int i, int i2, Intent intent);

    public abstract void A0Q(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
