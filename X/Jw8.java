package X;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* loaded from: Jw8.class */
public final class Jw8 extends K1Y {
    public long A00;
    public final Kfd A01;
    public final LinkedHashMap A02;
    public final Handler A03;

    public Jw8(Context context, Handler handler, 6Vz r304, Kfd kfd, MFv mFv, 6W2 r307, 6Vr r308, int i, int i2, int i3, long j, boolean z, boolean z2) {
        super(context, handler, r304, mFv, r307, r308, i, i2, i3, j, z, z2);
        this.A00 = 0L;
        this.A02 = 1BK.A1C();
        this.A03 = handler;
        this.A01 = kfd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0R(6Yl[] r302, long j, long j2) {
        super/*X.K0P*/.A0R(r302, j, j2);
        this.A00 = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0b(long j) {
        RYp A00;
        super/*X.K0b*/.A0b(j);
        LinkedHashMap linkedHashMap = this.A02;
        Long valueOf = Long.valueOf(j);
        Number number = (Number) linkedHashMap.get(valueOf);
        if (number != null) {
            j = number.longValue();
            linkedHashMap.remove(valueOf);
        }
        Kfd kfd = this.A01;
        if (kfd == null || (A00 = kfd.A00.A0D.A00(j)) == null) {
            return;
        }
        this.A03.post(new Lnw(A00, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0f(6WD r302) {
        boolean A02 = 5N4.A02(5N3.A07);
        LinkedHashMap linkedHashMap = this.A02;
        long j = r302.A01;
        GOn.A1Y(Long.valueOf(j), linkedHashMap, A02 ? j - this.A00 : r302.A00);
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(JR1.A0r(AnonymousClass001.A0x(linkedHashMap)));
        }
        super/*X.K0b*/.A0f(r302);
    }
}
