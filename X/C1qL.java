package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.advancedcryptotransportdiskmanager.mca.MailboxAdvancedCryptoTransportDiskManagerJNI;
import com.facebook.advancedcryptotransportmigration.mca.MailboxAdvancedCryptoTransportMigrationJNI;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.contactsharesettings.mca.MailboxContactShareSettingsJNI;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.highlightstab.mca.MailboxHighlightsTabJNI;
import com.facebook.localstoragemanagement.mca.MailboxLocalStorageManagementJNI;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.qp.mca.MailboxQPJNI;
import com.facebook.status.mca.MailboxStatusJNI;
import com.facebook.stories.mca.MailboxStoriesJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import java.util.List;

/* renamed from: X.1qL, reason: invalid class name */
/* loaded from: 1qL.class */
public abstract class C1qL {
    public List A00 = null;

    public Object A00(int i) {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = A01();
            }
        }
        boolean z = false;
        if (i < this.A00.size()) {
            z = true;
        }
        Integer valueOf = Integer.valueOf(i);
        List list = this.A00;
        Object[] objArr = {valueOf, list};
        if (!z) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("Failed to find index %d in headerFields (%s)", objArr));
        }
        Object obj = list.get(i);
        obj.getClass();
        return obj;
    }

    public List A01() {
        switch (((38C) this).A00) {
            case 0:
                return MailboxAdvancedCryptoTransportJNI.getHeaderFields();
            case 1:
                return MailboxAdvancedCryptoTransportDiskManagerJNI.getHeaderFields();
            case 2:
                return MailboxAdvancedCryptoTransportMigrationJNI.getHeaderFields();
            case 3:
                return MailboxCommunityJNI.getHeaderFields();
            case 4:
                return MailboxContactShareSettingsJNI.getHeaderFields();
            case 5:
                return MailboxCoreJNI.getHeaderFields();
            case 6:
                return MailboxEncryptedBackupsJNI.getHeaderFields();
            case 7:
                return MailboxHighlightsTabJNI.getHeaderFields();
            case 8:
                return MailboxLocalStorageManagementJNI.getHeaderFields();
            case 9:
                return MailboxOrcaJNI.getHeaderFields();
            case 10:
                return MailboxQPJNI.getHeaderFields();
            case 11:
                return MailboxStatusJNI.getHeaderFields();
            case 12:
                return MailboxStoriesJNI.getHeaderFields();
            case 13:
                return MailboxTamJNI.getHeaderFields();
            default:
                return null;
        }
    }
}
