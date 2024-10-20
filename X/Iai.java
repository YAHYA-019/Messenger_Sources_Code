package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.presence.plugins.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Iai.class */
public final class Iai implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public Iai(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1Br r304;
        switch (this.A00) {
            case 0:
                2CM r0 = (2CM) obj;
                11T.A0F(r0, 0);
                boolean z = r0.A00;
                HSW hsw = (HSW) this.A01;
                boolean z2 = this.A02;
                if (z) {
                    Grb grb = hsw.A00;
                    grb.A03 = z2;
                    1GU r02 = grb.A01;
                    if (r02 == null) {
                        11T.A0L("threadUtil");
                        throw 0Q8.createAndThrow();
                    }
                    r02.Ciz(new IqX(grb));
                    return;
                }
                return;
            case 1:
                if (!AnonymousClass001.A1V(obj)) {
                    throw new RuntimeException("Run query failed: story badging mode update");
                }
                BfK bfK = (BfK) ((C5d1) this.A01).A04.get();
                boolean z3 = this.A02;
                1UG A08 = 1BK.A08(bfK.A00, 1BJ.A00(ActionId.SERVICE_ON_START_COMMAND));
                if (A08.isSampled()) {
                    A08.A7R("event_name", "badging_controls_toggle_saved");
                    A08.A7R("new_value", z3 ? "enabled" : "disabled");
                    A08.BZL();
                    return;
                }
                return;
            case 2:
                1qX r03 = (1qX) ((MailboxNullable) obj).value;
                if (r03 != null) {
                    C3RI c3ri = (C3RI) this.A01;
                    boolean z4 = this.A02;
                    if (1qX.A00(r03) == 0) {
                        C3RI.A00(c3ri, 0S2.A00);
                        return;
                    }
                    boolean z5 = false;
                    if (r03.mResultSet.getInteger(0, 1) == 1) {
                        z5 = true;
                    }
                    c3ri.A03(z5, z4);
                    return;
                }
                return;
            case 3:
                r304 = ((MsysPresenceUpdateImplementation) this.A01).A02;
                break;
            case 4:
                r304 = ((I2r) this.A01).A07;
                break;
            default:
                if (this.A02) {
                    GVv.A01((GVv) this.A01);
                    return;
                }
                return;
        }
        ((5Ch) 1Br.A0B(r304)).A05(this.A02);
    }
}
