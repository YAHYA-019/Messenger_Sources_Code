package X;

import com.facebook.acra.constants.ActionId;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.44j, reason: invalid class name */
/* loaded from: 44j.class */
public class C44j extends C2ak implements 0DS {
    public final 0DR A00;

    public C44j(0DR r302, 0DE r303) {
        super(r303, true);
        this.A00 = r302;
    }

    @Override // X.C2a1
    public void A0H(Object obj) {
        if (this instanceof 45F) {
            A0S(obj);
            return;
        }
        0DR A02 = 0DT.A02(this.A00);
        if (obj instanceof C2s6) {
            Throwable th = ((C2s6) obj).A00;
            11T.A0F(th, 0);
            obj = new 0DV(th);
        }
        C2ar.A00(obj, A02);
    }

    @Override // X.C2a1
    public final boolean A0M() {
        return true;
    }

    @Override // X.C2ak
    public void A0S(Object obj) {
        if (!(this instanceof 45F)) {
            0DR r0 = this.A00;
            if (obj instanceof C2s6) {
                Throwable th = ((C2s6) obj).A00;
                11T.A0F(th, 0);
                obj = new 0DV(th);
            }
            r0.resumeWith(obj);
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 45F.A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0N(AnonymousClass000.A00(ActionId.MQTT_CONNECTING));
                }
                0DR A02 = 0DT.A02(this.A00);
                if (obj instanceof C2s6) {
                    Throwable th2 = ((C2s6) obj).A00;
                    11T.A0F(th2, 0);
                    obj = new 0DV(th2);
                }
                C2ar.A00(obj, A02);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    public final 0DS getCallerFrame() {
        0DS r0 = this.A00;
        if (r0 instanceof 0DS) {
            return r0;
        }
        return null;
    }
}
