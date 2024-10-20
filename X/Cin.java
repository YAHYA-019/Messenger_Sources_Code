package X;

import com.facebook.messaging.communitymessaging.plugins.leavechat.leavechatbutton.LeaveChatButtonImplementation;
import com.facebook.messaging.communitymessaging.plugins.memberactions.leavechat.LeaveChatImplementation;
import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsclick.ThreadSettingsLeaveGroupClickHandler;
import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsmenuitem.LeaveConversationMenuItem;

/* loaded from: Cin.class */
public final class Cin implements DGg {
    public final int A00;
    public final Object A01;

    public Cin(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.DGg
    public void C3U() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.DGg
    public void C3W() {
        DHc dHc;
        switch (this.A00) {
            case 0:
                dHc = ((LeaveChatButtonImplementation) this.A01).A07;
                dHc.C3T();
                return;
            case 1:
                ((LeaveChatImplementation) this.A01).A07.Bu9("close_button");
                return;
            case 2:
                dHc = ((ThreadSettingsLeaveGroupClickHandler) this.A01).A0A;
                dHc.C3T();
                return;
            default:
                dHc = ((LeaveConversationMenuItem) this.A01).A04;
                dHc.C3T();
                return;
        }
    }
}
