package X;

import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5xk, reason: invalid class name */
/* loaded from: 5xk.class */
public final class C5xk implements C5xl {
    public final 1Br A00 = 1Bq.A00(116214);
    public final 1Br A01 = 1Bq.A00(116213);

    @Override // X.C5xl
    public LiveData ASY(ThreadKey threadKey) {
        89C r303;
        11T.A0F(threadKey, 0);
        1Bi.A03(66922);
        2yD r0 = (2yD) 1Bi.A03(16385);
        if (!threadKey.A0z() || !r0.AZk(36316439582288080L)) {
            1WY r02 = (1WY) 1Bi.A03(66481);
            if ((!threadKey.A1E() || !1WY.A01(r02).AZk(36319278542108526L)) && (!1WY.A01((1WY) 1Bi.A03(66481)).AZk(36315340064563986L) || !ThreadKey.A0a(threadKey))) {
                C5xr c5xr = (C5xr) 1Bi.A03(68332);
                if (!threadKey.A1C() || !c5xr.A01()) {
                    r303 = (C5xs) this.A00.A00.get();
                    LiveData ASY = ((C5xl) r303).ASY(threadKey);
                    11T.A0A(ASY);
                    return ASY;
                }
            }
        }
        r303 = (89C) this.A01.A00.get();
        LiveData ASY2 = ((C5xl) r303).ASY(threadKey);
        11T.A0A(ASY2);
        return ASY2;
    }
}
