package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Yb, reason: invalid class name */
/* loaded from: 3Yb.class */
public final class C3Yb implements 4aT {
    public static final Throwable A05 = new SGC();
    public static final java.util.Map A06 = AnonymousClass001.A0u();
    public final 4aT A00;
    public final Queue A01;
    public final AtomicInteger A02;
    public final double A03;
    public final boolean A04;

    public C3Yb(4aT r302, double d, boolean z) {
        A06.put(TraceFieldType.FailureReason, "dropped_prefetch");
        this.A02 = new AtomicInteger();
        this.A01 = new LinkedList();
        this.A00 = r302;
        this.A04 = z;
        this.A03 = d;
    }

    public static void A00(C3Yb c3Yb) {
        AtomicInteger atomicInteger = c3Yb.A02;
        if (atomicInteger.decrementAndGet() >= 1) {
            return;
        }
        do {
            Pair pair = (Pair) c3Yb.A01.poll();
            if (pair == null) {
                return;
            } else {
                c3Yb.A00.CZW((InterfaceC04444az) pair.first, (InterfaceC04374as) pair.second);
            }
        } while (atomicInteger.get() < 1);
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        2IU r0 = ((C04364ar) interfaceC04374as).A05;
        r0.CEC(interfaceC04374as, "ThrottlingNetworkFetchProducer");
        double d = this.A03;
        if (d > 0.0d && interfaceC04374as.BV1() && Math.random() < d) {
            Throwable th = A05;
            r0.CE8(interfaceC04374as, "ThrottlingNetworkFetchProducer", th, A06);
            interfaceC04444az.onFailure(th);
            return;
        }
        if (!this.A04) {
            r0.CEA(interfaceC04374as, "ThrottlingNetworkFetchProducer", (java.util.Map) null);
        } else if (!interfaceC04374as.BV1()) {
            this.A02.getAndIncrement();
            r0.CEA(interfaceC04374as, "ThrottlingNetworkFetchProducer", (java.util.Map) null);
            this.A00.CZW(new 4dT(this, interfaceC04444az), interfaceC04374as);
            return;
        } else {
            r0.CEA(interfaceC04374as, "ThrottlingNetworkFetchProducer", (java.util.Map) null);
            if (this.A02.get() >= 1) {
                this.A01.add(Pair.create(interfaceC04444az, interfaceC04374as));
                return;
            }
        }
        this.A00.CZW(interfaceC04444az, interfaceC04374as);
    }
}
