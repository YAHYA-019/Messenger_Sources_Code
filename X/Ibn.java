package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Ibn.class */
public final class Ibn implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxCallback A03;
    public final /* synthetic */ MailboxCallback A04;
    public final /* synthetic */ GsM A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public Ibn(MailboxCallback mailboxCallback, MailboxCallback mailboxCallback2, GsM gsM, Integer num, String str, String str2, long j, long j2, long j3, boolean z) {
        this.A03 = mailboxCallback;
        this.A08 = str;
        this.A09 = z;
        this.A05 = gsM;
        this.A02 = j;
        this.A07 = str2;
        this.A06 = num;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = mailboxCallback2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int i;
        int i2;
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        if (A14 != null && 1qX.A00(A14) >= 1) {
            int A00 = 1qX.A00(A14);
            for (int i3 = 0; i3 < A00; i3++) {
                if (A14.mResultSet.getBoolean(i3, 3)) {
                    String str = this.A08;
                    if (str == null || str.equals(7zP.A0k(A14, i3)) || str.equals(7zP.A0l(A14, i3))) {
                        boolean z = this.A09;
                        GsM gsM = this.A05;
                        if (!z) {
                            long j = this.A00;
                            long j2 = this.A02;
                            String str2 = this.A07;
                            long j3 = this.A01;
                            long A0F = 7zQ.A0F(A14, i3);
                            long j4 = A14.mResultSet.getLong(i3, 0);
                            Integer num = this.A06;
                            if (num == null) {
                                num = 0S2.A01;
                            }
                            switch (num.intValue()) {
                                case 1:
                                    i = 2;
                                    break;
                                case 2:
                                    i = 3;
                                    break;
                                default:
                                    i = 1;
                                    break;
                            }
                            if (str == null) {
                                str = "";
                            }
                            gsM.A01(this.A03, this.A04, (Number) null, str2, str, i, j, j2, j3, A0F, j4, false);
                            return;
                        }
                        long j5 = this.A02;
                        String str3 = this.A07;
                        long A0F2 = 7zQ.A0F(A14, i3);
                        Integer num2 = this.A06;
                        if (num2 == null) {
                            num2 = 0S2.A01;
                        }
                        switch (num2.intValue()) {
                            case 1:
                                i2 = 2;
                                break;
                            case 2:
                                i2 = 3;
                                break;
                            default:
                                i2 = 1;
                                break;
                        }
                        if (str == null) {
                            str = "";
                        }
                        long j6 = this.A01;
                        long j7 = this.A00;
                        MailboxCallback mailboxCallback = this.A03;
                        1Um A0O = 1BK.A0O(gsM, 0);
                        MailboxFutureImpl A0Q = 1BK.A0Q(A0O, mailboxCallback);
                        1Um.A02(A0O, new Ibh(A0Q, gsM, str3, str, i2, j5, A0F2, j6, j7), A0Q, false);
                        return;
                    }
                }
            }
        }
        this.A03.onCompletion(true);
    }
}
