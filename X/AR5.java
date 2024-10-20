package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: AR5.class */
public final class AR5 extends C00q implements Function1 {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR5(long j, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 1:
                Function1 function1 = (Function1) obj;
                11T.A0F(function1, 0);
                ((5xU) 1Br.A0B(((5Q3) this.A02).A07)).A03(new A1d(function1, 82), this.A01);
                break;
            case 2:
                7SN r0 = ((AnonymousClass690) this.A02).A07;
                if (r0 != null) {
                    r0.Bkr(this.A01);
                    break;
                }
                break;
            default:
                long A05 = AnonymousClass001.A05(obj);
                MailboxFeature A0d = 7zP.A0d(((9ZC) this.A02).A01);
                long j = this.A01;
                1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new A1W(7, j, A05, A0d, A0P), A0P, false);
                break;
        }
        return 04S.A00;
    }
}
