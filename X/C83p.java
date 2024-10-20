package X;

import com.facebook.analyticslogging.mca.MailboxAnalyticsLoggingJNI;
import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.memberrequests.mca.MailboxMemberRequestsJNI;
import com.facebook.replyreminder.mca.MailboxReplyReminderJNI;
import com.facebook.sdk.mca.MailboxSDKJNI;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.threadtheme.mca.MailboxThreadThemeJNI;
import java.util.List;

/* renamed from: X.83p, reason: invalid class name */
/* loaded from: 83p.class */
public final class C83p extends C1qL {
    public final int A00;

    public C83p(int i) {
        this.A00 = i;
    }

    @Override // X.C1qL
    public List A01() {
        switch (this.A00) {
            case 0:
                return MailboxAnalyticsLoggingJNI.getHeaderFields();
            case 1:
                return MailboxAvatarArtifactoJNI.getHeaderFields();
            case 2:
                return MailboxMemberRequestsJNI.getHeaderFields();
            case 3:
                return MailboxReplyReminderJNI.getHeaderFields();
            case 4:
                return MailboxSDKJNI.getHeaderFields();
            case 5:
                return MailboxSecureMessageJNI.getHeaderFields();
            case 6:
                return MailboxShimJNI.getHeaderFields();
            case 7:
                return MailboxThreadThemeJNI.getHeaderFields();
            default:
                return null;
        }
    }
}
