package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;

/* loaded from: Cyi.class */
public final class Cyi implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public Cyi(5O6 r302, CQU cqu, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i2;
        switch (i2) {
            case 0:
            case 2:
                this.A03 = cqu;
                this.A01 = i;
                this.A04 = str;
                this.A02 = r302;
                this.A06 = z;
                this.A07 = z2;
                this.A05 = z3;
                break;
            default:
                this.A02 = cqu;
                this.A01 = i;
                this.A04 = str;
                this.A05 = z;
                this.A03 = r302;
                this.A07 = z2;
                this.A06 = z3;
                break;
        }
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2;
        ImmutableList A01;
        boolean z;
        Object obj3;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        if (1 - this.A00 != 0) {
            CQU cqu = (CQU) this.A03;
            CQU.A01(cqu).A01(this.A01);
            if (mailboxNullable == null || (obj3 = mailboxNullable.value) == null) {
                return;
            }
            CQU.A07((5O6) this.A02, cqu, N4R.A01(obj3), this.A04, false, this.A06, this.A07, this.A05, false);
            return;
        }
        CQU cqu2 = (CQU) this.A02;
        CQU.A01(cqu2).A01(this.A01);
        if (mailboxNullable == null || (obj2 = mailboxNullable.value) == null) {
            return;
        }
        String str = this.A04;
        boolean z2 = this.A05;
        5O6 r0 = (5O6) this.A03;
        boolean z3 = this.A07;
        boolean z4 = this.A06;
        1Br.A0C(cqu2.A0P);
        if (CQU.A05(cqu2).AZk(36322280726152476L)) {
            A01 = N4R.A01(obj2);
            z = cqu2.A0D;
        } else {
            boolean A08 = CQU.A02(cqu2).A08();
            A01 = N4R.A01(obj2);
            if (A08 && CQU.A02(cqu2).A08()) {
                ((C10264sx) 1Br.A0B(cqu2.A0M)).A0A(new Cmu(r0, cqu2, A01, str, z3, z4, z2));
                return;
            }
            z = false;
        }
        CQU.A07(r0, cqu2, A01, str, true, z3, z4, z2, z);
    }
}
