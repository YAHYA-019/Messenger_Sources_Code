package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: A0g.class */
public final class A0g implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 2R2 A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public A0g(2R2 r302, ThreadKey threadKey, String str, String str2, String str3, long j, boolean z) {
        this.A06 = z;
        this.A01 = r302;
        this.A04 = str;
        this.A00 = j;
        this.A05 = str2;
        this.A02 = threadKey;
        this.A03 = str3;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Number A0y = 7zS.A0y(obj);
        String str = null;
        boolean A1T = AnonymousClass001.A1T(A0y != null ? 7zN.A0j(A0y) : null);
        if (this.A06) {
            str = "Copied Message";
        }
        2R2 r0 = this.A01;
        r0.A0E("event_type", this.A04);
        r0.A0E("thread_id", String.valueOf(this.A00));
        7zS.A1D(r0, this.A05, A1T);
        7zT.A1E(r0, this.A02, str);
        r0.A0E("bot_response_id", this.A03);
        r0.BZL();
    }
}
