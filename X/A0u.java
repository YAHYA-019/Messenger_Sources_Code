package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: A0u.class */
public final class A0u implements MailboxCallback {
    public final /* synthetic */ 2R2 A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 6Q7 A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public A0u(2R2 r302, FbUserSession fbUserSession, 6Q7 r304, ThreadKey threadKey, String str, String str2, String str3, boolean z) {
        this.A01 = fbUserSession;
        this.A02 = r304;
        this.A07 = z;
        this.A00 = r302;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = threadKey;
        this.A04 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Number A0y = 7zS.A0y(obj);
        if (A0y != null) {
            long longValue = A0y.longValue();
            5xU r0 = (5xU) 4YU.A0n(this.A01, this.A02.A00, 67540);
            boolean z = this.A07;
            r0.A03(new A0g(this.A00, this.A03, this.A05, this.A06, this.A04, longValue, z), longValue);
        }
    }
}
