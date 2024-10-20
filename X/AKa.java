package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: AKa.class */
public final class AKa extends C00q implements C00m {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKa(9Rk r302, int i, long j, long j2) {
        super(0);
        this.A00 = i;
        this.A03 = r302;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A01 = j2;
        }
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1Um AQV;
        MailboxFutureImpl A0P;
        A0a a0a;
        int i = this.A00;
        22I r0 = (22I) 1Br.A0B(((9Rk) this.A03).A00);
        if (i != 0) {
            Long valueOf = Long.valueOf(this.A01);
            Long valueOf2 = Long.valueOf(this.A02);
            AQV = 1BK.A0O(r0, 0);
            A0P = 1BK.A0P(AQV);
            a0a = new A0a(2, r0, valueOf2, valueOf, A0P, new QQ9(r0, AQV));
        } else {
            Long valueOf3 = Long.valueOf(this.A02);
            Long valueOf4 = Long.valueOf(this.A01);
            AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
            A0P = 1BK.A0P(AQV);
            a0a = new A0a(1, r0, new QQ8(r0, AQV), valueOf4, valueOf3, A0P);
        }
        1Um.A02(AQV, a0a, A0P, false);
        return A0P;
    }
}
