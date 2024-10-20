package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: D4d.class */
public final class D4d implements 1K9 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public D4d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj5;
        this.A01 = i;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A04 = obj;
    }

    public void onFailure(Throwable th) {
        if (this.A00 != 0) {
            0fH.A0r("ThreadTileDrawableComponentSpec", "Failed to fetch image ", th);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 == 0) {
            03Y r0 = (03Y) obj;
            if (r0 != null) {
                Cq3 cq3 = (Cq3) this.A06;
                long A05 = cq3.A03.now() >= AnonymousClass001.A05(r0.second) ? 0L : AnonymousClass001.A05(r0.first);
                BEP bep = (BEP) this.A02;
                int i = this.A01;
                AcX A00 = Cq3.A00(cq3, bep, i, A05);
                ImmutableList.Builder builder = (ImmutableList.Builder) this.A05;
                builder.m11011add((Object) A00);
                if (i == ((List) this.A04).size() - 1) {
                    Cq3.A03(cq3, (C96) this.A03, 1Fj.A01(builder));
                    return;
                }
                return;
            }
            return;
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            0fH.A0k("ThreadTileDrawableComponentSpec", "Failed to fetch URI");
            return;
        }
        2IA A01 = 2IA.A01(uri);
        A01.A0A = (2rB) this.A02;
        2Dp A04 = A01.A04();
        5YF r02 = (5YF) this.A03;
        int i2 = this.A01;
        2rE r03 = (2rE) this.A05;
        UserKey userKey = (UserKey) this.A06;
        CallerContext callerContext = Dza.A05;
        1OW A002 = r03.A00(callerContext, A04, userKey);
        Uri uri2 = (Uri) this.A04;
        5YH r304 = (5YH) 5YH.A09.A3p();
        if (r304 == null) {
            r304 = (5YH) 1Bn.A0A(49775);
        }
        A002.getClass();
        r304.A04 = A002;
        r304.A00 = i2;
        r304.A05 = r02;
        r304.A02 = uri2;
        r304.A01 = 255;
        callerContext.getClass();
        r304.A03 = callerContext;
        A002.D3K(r304, 1BK.A1E(r304.A06));
        r02.A06(r304, i2);
    }
}
