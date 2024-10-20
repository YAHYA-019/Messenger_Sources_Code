package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PlatformLogger;

/* loaded from: A02.class */
public final class A02 implements MailboxCallback {
    public final int A00;
    public final String A01;

    public A02(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) {
            return;
        }
        PlatformLogger.platformEventStructuredLoggerThreadFBIdAnnotationWithAliasId(this.A01, obj2.toString());
    }
}
