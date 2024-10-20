package X;

import com.facebook.msgorcapinnedmessages.mca.MailboxMSGOrcaPinnedMessagesJNI;
import com.facebook.msgpinnedmessages.mca.MailboxMSGPinnedMessagesJNI;
import com.facebook.polls.mca.MailboxPollsJNI;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;
import com.facebook.thread.mca.MailboxThreadJNI;
import com.facebook.threadbans.mca.MailboxThreadBansJNI;
import com.facebook.translation.mca.MailboxTranslationJNI;
import java.util.List;

/* renamed from: X.8yf, reason: invalid class name */
/* loaded from: 8yf.class */
public final class C8yf extends C1qL {
    public final int A00;

    public C8yf(int i) {
        this.A00 = i;
    }

    @Override // X.C1qL
    public List A01() {
        switch (this.A00) {
            case 0:
                return MailboxMSGOrcaPinnedMessagesJNI.getHeaderFields();
            case 1:
                return MailboxMSGPinnedMessagesJNI.getHeaderFields();
            case 2:
                return MailboxPollsJNI.getHeaderFields();
            case 3:
                return MailboxSecureAuthPlatformPakeJNI.getHeaderFields();
            case 4:
                return MailboxThreadJNI.getHeaderFields();
            case 5:
                return MailboxThreadBansJNI.getHeaderFields();
            case 6:
                return MailboxTranslationJNI.getHeaderFields();
            default:
                return null;
        }
    }
}
