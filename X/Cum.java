package X;

import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsclick.ThreadSettingsLeaveGroupClickHandler;
import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsmenuitem.LeaveConversationMenuItem;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cum.class */
public final class Cum implements 6HY {
    public final int A00;
    public final Object A01;

    public Cum(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final void D0Q(ThreadKey threadKey, int i, boolean z) {
        DHd dHd;
        switch (this.A00) {
            case 0:
                AmL amL = (AmL) this.A01;
                amL.A00 = 0;
                AmL.A08(amL);
                return;
            case 1:
                dHd = ((ThreadSettingsLeaveGroupClickHandler) this.A01).A0B;
                dHd.CWA(i);
                return;
            default:
                dHd = ((LeaveConversationMenuItem) this.A01).A05;
                dHd.CWA(i);
                return;
        }
    }
}
