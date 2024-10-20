package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* renamed from: X.838, reason: invalid class name */
/* loaded from: 838.class */
public final class AnonymousClass838 extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass838(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new AAn((List) this.A01, this.A02);
            case 1:
                boolean z = this.A02;
                C6qu c6qu = (C6qu) this.A01;
                return new AAa(c6qu.Ad4(), z, c6qu.BF7().A0z());
            case 2:
                ThreadKey BF7 = ((C6qu) this.A01).BF7();
                return ((BF7.A18() || BF7.A1F() || BF7.A0w()) && !this.A02) ? new AnonymousClass711() : new AnonymousClass711();
            case 3:
                return new 7MQ(7MP.A01, (7MO) ((C01i) this.A01).getValue(), this.A02);
            default:
                C6qu c6qu2 = (C6qu) this.A01;
                2S4 BFS = c6qu2.BFS();
                1Va Akk = c6qu2.Akk();
                C01i Awt = c6qu2.Awt();
                return new AAz(BFS, Akk, Awt != null ? (C75c) Awt.getValue() : null, this.A02);
        }
    }
}
