package X;

import com.facebook.messaging.archivedchats.plugins.archivedchats.archivedchatsitem.ArchivedChatsSetting;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.mesetting.pendingchatssetting.PendingChatsSetting;

/* loaded from: Ci0.class */
public final class Ci0 implements 2OV {
    public final int A00;
    public final Object A01;

    public Ci0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final void Bkl() {
        DFp dFp;
        switch (this.A00) {
            case 0:
                dFp = ((CHB) this.A01).A04;
                dFp.D7z();
                return;
            case 1:
                dFp = ((ArchivedChatsSetting) this.A01).A04;
                dFp.D7z();
                return;
            case 2:
                B5I.A03((B5I) this.A01);
                return;
            case 3:
                LEG leg = ((8Gu) this.A01).A03;
                if (leg == null) {
                    11T.A0L("surfaceHelper");
                    throw 0Q8.createAndThrow();
                }
                leg.A0D();
                return;
            case 4:
                AlW.A06((AlW) this.A01);
                return;
            default:
                dFp = ((PendingChatsSetting) this.A01).A06;
                dFp.D7z();
                return;
        }
    }
}
