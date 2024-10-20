package X;

import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: L2f.class */
public final class L2f {
    public Hash A00;
    public Hash A01;
    public final PrivateKey A02;
    public final PublicKey A03;
    public final Connection A04;
    public final LocalChannel A05;
    public final Service A06;
    public final EyL A07;
    public final Function1 A08;
    public final AtomicBoolean A09;
    public final C00m A0A;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.EyL] */
    public L2f(PrivateKey privateKey, PublicKey publicKey, Connection connection, C00m c00m, Function1 function1) {
        11T.A0F(publicKey, 3);
        this.A04 = connection;
        this.A02 = privateKey;
        this.A03 = publicKey;
        this.A0A = c00m;
        this.A08 = function1;
        this.A09 = new AtomicBoolean();
        AtomicBoolean A1E = DKC.A1E(false);
        AtomicBoolean A1E2 = DKC.A1E(false);
        ?? obj = new Object();
        ((EyL) obj).A00 = A1E;
        ((EyL) obj).A01 = A1E2;
        this.A07 = obj;
        LocalChannel localChannel = new LocalChannel(connection, 30);
        localChannel.onError = new M0s(this, 32);
        this.A05 = localChannel;
        Service service = new Service(30);
        service.onReceived = new M0u(this, 7);
        this.A06 = service;
    }

    public static final void A00(L2f l2f, C00m c00m) {
        c00m.invoke();
        EyL eyL = l2f.A07;
        synchronized (eyL) {
            if (eyL.A01.get() && eyL.A00.get()) {
                l2f.A0A.invoke();
            }
        }
    }

    public final void A01() {
        if (GOp.A1a(this.A09)) {
            this.A06.unregister();
            KYw.A00(this.A05);
        }
    }
}
