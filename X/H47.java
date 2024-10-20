package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import com.facebook.rsys.call.gen.CallModel;
import java.util.Iterator;

/* loaded from: H47.class */
public final class H47 extends HGE {
    public final int A00;
    public final Object A01;

    public H47(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        if (this.A00 == 0) {
            GrV.A0K((GrV) this.A01);
        }
    }

    public void A01() {
        if (this.A00 == 0) {
            GrV.A0K((GrV) this.A01);
        }
    }

    public void A04() {
        switch (this.A00) {
            case 0:
                GrV.A0K((GrV) this.A01);
                return;
            case 1:
                C2476GeX c2476GeX = (C2476GeX) this.A01;
                DKE.A0K(c2476GeX.A0N).post(new Is4(c2476GeX));
                return;
            case 2:
            default:
                return;
            case 3:
                Iterator it = ((I2q) this.A01).A09.iterator();
                while (it.hasNext()) {
                    ((JKH) it.next()).B0C().invoke();
                }
                return;
        }
    }

    public void A05() {
        switch (this.A00) {
            case 0:
                GrV.A0K((GrV) this.A01);
                return;
            case 1:
                C2476GeX c2476GeX = (C2476GeX) this.A01;
                DKE.A0K(c2476GeX.A0N).post(new Is5(c2476GeX));
                return;
            case 2:
            default:
                return;
            case 3:
                Iterator it = ((I2q) this.A01).A09.iterator();
                while (it.hasNext()) {
                    ((JKH) it.next()).B0D().invoke();
                }
                return;
        }
    }

    public void A06(int i) {
        Boolean bool;
        if (2 - this.A00 == 0) {
            if (i == 4) {
                4gE.A02.A01("SUPVideoCallingImpl", "onHardwareStatusEvent HINGES_OPEN");
                T6G.A01(true);
            } else if (i != 5) {
                if (i == 18) {
                    4gE.A02.A01("SUPVideoCallingImpl", "onHardwareStatusEvent NO_DEVICE_READY");
                    bool = false;
                } else {
                    if (i != 19) {
                        return;
                    }
                    4gE.A02.A01("SUPVideoCallingImpl", "onHardwareStatusEvent DEVICE_IS_READY");
                    bool = true;
                }
                T6G.A00(bool);
            } else {
                4gE.A02.A01("SUPVideoCallingImpl", "onHardwareStatusEvent HINGED_CLOSED");
                T6G.A01(false);
            }
            ((SUPVideoCallingImpl) this.A01).A02();
        }
    }

    public void A07(T5C t5c) {
        switch (this.A00) {
            case 0:
                GrV.A0K((GrV) this.A01);
                return;
            case 3:
                I2q i2q = (I2q) this.A01;
                if (((IBC) 1Br.A0B(i2q.A06)).A03(t5c)) {
                    Iterator it = i2q.A09.iterator();
                    while (it.hasNext()) {
                        ((JKH) it.next()).B0B().invoke();
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A08(T57 t57) {
        JNg A00;
        JNg A002;
        if (3 - this.A00 == 0) {
            I2q i2q = (I2q) this.A01;
            C00i c00i = i2q.A06.A00;
            if (((IBC) c00i.get()).A04(t57)) {
                Iterator it = i2q.A09.iterator();
                while (it.hasNext()) {
                    ((JKH) it.next()).B0B().invoke();
                }
                return;
            }
            int A02 = ((IBC) c00i.get()).A02(t57);
            if (A02 != 0) {
                if (A02 != 3 || (A002 = Hn2.A00(i2q.A05)) == null) {
                    return;
                }
                A002.BMA(T4h.A0A);
                return;
            }
            5Vt r0 = i2q.A01;
            if (r0 == null) {
                throw AnonymousClass001.A0N("MediaStreamSharedState is missing rpStore. Please call init() first.");
            }
            if (IFr.A0H((CallModel) ((8LW) r0.Anq().invoke()).A00(CallModel.class)) || (A00 = Hn2.A00(i2q.A05)) == null) {
                return;
            }
            4zI.A03.A05("sup:MediaStreamSharedState", "Request turn video on glasses input", new Object[0]);
            A00.CpO(true);
            FbUserSession fbUserSession = i2q.A00;
            if (fbUserSession != null) {
                DKE.A0K(i2q.A08).post(new IxJ(fbUserSession, i2q));
            }
        }
    }
}
