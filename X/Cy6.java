package X;

import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* loaded from: Cy6.class */
public final class Cy6 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CQU A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public Cy6(CQU cqu, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = cqu;
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        DHP dhp;
        List list;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        11T.A0F(mailboxNullable, 0);
        CQU cqu = this.A01;
        CQU.A01(cqu).A01(this.A00);
        1qX r0 = (1qX) mailboxNullable.value;
        if (r0 != null) {
            boolean z = this.A03;
            boolean z2 = this.A04;
            boolean z3 = this.A05;
            boolean z4 = this.A02;
            if (1qX.A00(r0) > 0) {
                String A0m = 7zP.A0m(r0, 0);
                String A0n = 7zP.A0n(r0, 0);
                String A0o = 7zP.A0o(r0, 0);
                String A0p = 7zP.A0p(r0, 0);
                Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 10);
                if (A0m != null && A0n != null && A0o != null && A0p != null && nullableInteger != null) {
                    Btt btt = new Btt(nullableInteger, A0m, A0n, A0o, A0p);
                    AcX A04 = AcX.A04(ClientDataSourceIdentifier.A0y, 53N.A0R);
                    A04.A00 = btt;
                    dhp = cqu.A05;
                    if (dhp != null) {
                        list = 7zN.A0e(C1301Ade.A01(EnumC1297Ada.A0E, A04));
                        dhp.Byh(list, z, z2, z3, z4);
                    }
                    return;
                }
            }
            dhp = cqu.A05;
            if (dhp != null) {
                list = C0ty.A00;
                dhp.Byh(list, z, z2, z3, z4);
            }
        }
    }
}
