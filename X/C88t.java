package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.88t, reason: invalid class name */
/* loaded from: 88t.class */
public final class C88t implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 5SR A03;

    public C88t(5SR r302, int i, int i2, long j) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A03 = r302;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            0fH.A14(4YT.A00(245), "Failed to report thread co presence for %d, %d, %d", 1BK.A1a(Integer.valueOf(this.A01), Long.valueOf(this.A02), this.A00));
        }
        7NV r0 = (7NV) 1Br.A0B(this.A03.A08);
        04R.A09(7zO.A1b("is_post_success", bool, 1BK.A1G(TraceFieldType.Protocol, "UPI")));
        r0.A00();
    }
}
