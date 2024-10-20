package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9m2, reason: invalid class name */
/* loaded from: 9m2.class */
public final class C9m2 {
    public final 1Br A01 = 7zM.A0T();
    public final 1Br A02 = 1Bu.A00(68891);
    public final Object A03 = new Object();
    public 99N A00 = C8sJ.A00;

    public static final UserFlowLogger A00(C9m2 c9m2) {
        return 4YV.A0Z(c9m2.A01);
    }

    public static void A01(C9m2 c9m2, String str, int i) {
        A02(c9m2, new AV7(str, c9m2, i));
    }

    public static final void A02(C9m2 c9m2, Function1 function1) {
        synchronized (c9m2.A03) {
            99N r0 = c9m2.A00;
            if (r0 instanceof C8sI) {
                if (4YV.A0Z(c9m2.A01).isOngoingFlow(((C8sI) r0).A00)) {
                    function1.invoke(r0);
                } else {
                    1Br.A0C(c9m2.A02);
                }
            } else if (r0 instanceof C8sJ) {
                1Br.A0C(c9m2.A02);
            }
        }
    }

    public final void A03() {
        synchronized (this.A03) {
            99N r0 = this.A00;
            if (11T.A0O(r0, C8sJ.A00)) {
                0fH.A0j("GDriveSetupFlowLogger", "Flow is not started");
            } else if (r0 instanceof C8sI) {
                1Br.A0C(this.A02);
            }
        }
    }

    public final void A04(C96q c96q, boolean z) {
        11T.A0F(c96q, 1);
        synchronized (this.A03) {
            if (!11T.A0O(this.A00, C8sJ.A00)) {
                1Br.A0C(this.A02);
            }
            if (z) {
                1Br r0 = this.A01;
                long generateNewFlowId = 4YV.A0Z(r0).generateNewFlowId(231348960);
                this.A00 = new C8sI(generateNewFlowId, true);
                UserFlowLogger A0Z = 4YV.A0Z(r0);
                String obj = c96q.toString();
                7zN.A1Z(A0Z, obj, generateNewFlowId, false);
                4YV.A0Z(r0).flowAnnotateWithCrucialData(generateNewFlowId, "ENTRY_POINT", obj);
            } else {
                1Br r02 = this.A01;
                long generateNewFlowId2 = 4YV.A0Z(r02).generateNewFlowId(231349378);
                this.A00 = new C8sI(generateNewFlowId2, false);
                7zN.A1Z(4YV.A0Z(r02), c96q.toString(), generateNewFlowId2, false);
            }
        }
    }
}
