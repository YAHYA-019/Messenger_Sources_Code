package androidx.compose.foundation.gestures;

import X.0DR;
import X.L8V;
import X.MJy;
import X.MKN;

/* loaded from: ScrollableNestedScrollConnection.class */
public final class ScrollableNestedScrollConnection implements MJy {
    public boolean A00;
    public final ScrollingLogic A01;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = scrollingLogic;
        this.A00 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    @Override // X.MJy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object CCy(X.0DR r302, long r303, long r305) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.CCy(X.0DR, long, long):java.lang.Object");
    }

    @Override // X.MJy
    public long CD2(long j, long j2, int i) {
        if (!this.A00) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.A01;
        if (scrollingLogic.A05.BVo()) {
            return 0L;
        }
        MKN mkn = scrollingLogic.A05;
        float A01 = scrollingLogic.A01(j2);
        if (scrollingLogic.A07) {
            A01 *= -1.0f;
        }
        float ANt = mkn.ANt(A01);
        if (scrollingLogic.A07) {
            ANt *= -1.0f;
        }
        return scrollingLogic.A02(ANt);
    }

    @Override // X.MJy
    public /* synthetic */ Object CD6(0DR r302, long j) {
        return new L8V(0L);
    }

    @Override // X.MJy
    public /* synthetic */ long CD7(long j, int i) {
        return 0L;
    }
}
