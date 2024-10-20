package X;

import android.os.Handler;
import androidx.lifecycle.LiveData;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import kotlin.jvm.functions.Function2;

/* loaded from: AVf.class */
public final class AVf extends C00q implements Function2 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, long j) {
        super(2);
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A06 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A02 = obj5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            MLv mLv = (MLv) obj;
            if ((AnonymousClass001.A03(obj2) & 3) == 2 && mLv.BBC()) {
                mLv.D0o();
            } else {
                long j = this.A01;
                LBi.A00((C2826Jai) this.A03, (LMp) this.A05, mLv, (MN4) this.A06, (MLj) this.A04, (C0Bd) this.A02, 384, 0, j);
            }
        } else {
            1Iw r0 = (1Iw) obj;
            String str = (String) obj2;
            1BK.A1M(r0, str);
            ((C2lh) this.A03).A04(new M3m(str, 18));
            9Xh r02 = (9Xh) 7zO.A0o(r0, 68097);
            8iJ r03 = (8iJ) this.A06;
            if (r03.A0P) {
                String str2 = str;
                if (0CU.A0O(str)) {
                    str2 = r03.A0I;
                }
                9hT A00 = r02.A00("suggested_sticker_search_loader_key");
                if (A00 != null) {
                    A00.A01(new C2636Gjo(str2, (Boolean) false));
                }
                2Of r04 = r03.A08;
                C98g c98g = C98g.A08;
                ImmutableMap immutableMap = RegularImmutableMap.A03;
                11T.A0A(immutableMap);
                r04.AQN(new 7C6(c98g, immutableMap));
            }
            String A002 = 9E2.A00(str);
            if (r03.A0M && A002 != null) {
                4NU r05 = (4NU) this.A04;
                Runnable runnable = (Runnable) 7zL.A10(r05);
                if (runnable != null) {
                    ((Handler) ((C2lh) this.A05).A02).removeCallbacks(runnable);
                }
                Runnable afx = new AFX(r02, A002);
                ((Handler) ((C2lh) this.A05).A02).postDelayed(afx, this.A01);
                1sP.A00();
                r05.A00 = afx;
            }
            9hT A003 = r02.A00("suggested_gif_search_loader_key");
            if (A003 != null) {
                A003.A01(str);
            }
            LiveData liveData = (LiveData) this.A02;
            if (0CU.A0O(str)) {
                str = r03.A0H;
            }
            liveData.setValue(str);
        }
        return 04S.A00;
    }
}
