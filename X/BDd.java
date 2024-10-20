package X;

import com.facebook.broadcastflow.mca.MailboxBroadcastFlowJNI;
import com.facebook.e2eexmareceiverfetch.mca.MailboxE2EEXmaReceiverFetchJNI;
import com.facebook.grouplinks.mca.MailboxGroupLinksJNI;
import com.facebook.messagerequestssdk.mca.MailboxMessageRequestsSDKJNI;
import com.facebook.messengerrankingextension.mca.MailboxMessengerRankingExtensionJNI;
import com.facebook.pinnedthreads.mca.MailboxPinnedThreadsJNI;
import com.facebook.publicchats.mca.MailboxPublicChatsJNI;
import com.facebook.reportingsdk.mca.MailboxReportingSDKJNI;
import com.facebook.threaddetails.mca.MailboxThreadDetailsJNI;
import java.util.List;

/* loaded from: BDd.class */
public final class BDd extends C1qL {
    public final int A00;

    public BDd(int i) {
        this.A00 = i;
    }

    @Override // X.C1qL
    public List A01() {
        switch (this.A00) {
            case 0:
                return MailboxBroadcastFlowJNI.getHeaderFields();
            case 1:
                return MailboxE2EEXmaReceiverFetchJNI.getHeaderFields();
            case 2:
                return MailboxGroupLinksJNI.getHeaderFields();
            case 3:
                return MailboxMessageRequestsSDKJNI.getHeaderFields();
            case 4:
                return MailboxMessengerRankingExtensionJNI.getHeaderFields();
            case 5:
                return MailboxPinnedThreadsJNI.getHeaderFields();
            case 6:
                return MailboxPublicChatsJNI.getHeaderFields();
            case 7:
                return MailboxReportingSDKJNI.getHeaderFields();
            case 8:
                return MailboxThreadDetailsJNI.getHeaderFields();
            default:
                return null;
        }
    }
}
