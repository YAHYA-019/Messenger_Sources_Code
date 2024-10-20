package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PlatformLogger;

/* loaded from: A01.class */
public final class A01 implements MailboxCallback {
    public final /* synthetic */ String A00;

    public A01(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) {
            return;
        }
        PlatformLogger.platformEventStructuredLoggerThreadFBIdAnnotationWithAliasId(this.A00, obj2.toString());
    }
}
