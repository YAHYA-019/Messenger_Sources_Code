package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Iaq.class */
public final class Iaq implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public Iaq(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A02 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            MailboxNullable mailboxNullable = (MailboxNullable) obj;
            11T.A0F(mailboxNullable, 0);
            boolean A1X = 7zR.A1X(mailboxNullable.value);
            String A00 = AbE.A00(262);
            if (!A1X) {
                0fH.A14(A00, "failed to insert the upgrade admin message", 1BK.A1Z(this.A01));
                return;
            }
            7FC r0 = (7FC) this.A02;
            7FC.A00(r0, r0.A01.A02, this.A03);
            0fH.A0h(Long.valueOf(this.A01), A00, "successfully inserted the upgrade admin message and update SharedPrefs");
            return;
        }
        String str = (String) obj;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OptimisticSend callback filePath: ");
        A0k.append(str);
        A0k.append(", attachmentPk: ");
        A0k.append(this.A01);
        A0k.append(", contentToken: ");
        0fH.A0j("[MP] ArmadilloMediaMetaDataProvider", AnonymousClass001.A0d(this.A03, A0k));
        JJv jJv = (JJv) this.A02;
        11T.A0D(str);
        jJv.CAE(str);
    }
}
