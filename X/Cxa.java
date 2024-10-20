package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cxa.class */
public final class Cxa implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;

    public Cxa(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("clearMemberListBySource: Result ");
        A0k.append(obj);
        A0k.append(" for groupId=");
        A0k.append(this.A00);
        A0k.append(", memberListSource: ");
        A0k.append(this.A01);
        0fH.A0j("MemberRequestsMsysApi", A0k.toString());
    }
}
