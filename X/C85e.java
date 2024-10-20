package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.85e, reason: invalid class name */
/* loaded from: 85e.class */
public final class C85e implements 7Ij {
    public final 1Br A00;
    public final Context A01;
    public final ThreadKey A02;
    public final 84C A03;
    public final 2Of A04;

    public C85e(Context context, ThreadKey threadKey, 84C r304, 2Of r305) {
        11T.A0F(r304, 4);
        this.A01 = context;
        this.A02 = threadKey;
        this.A04 = r305;
        this.A03 = r304;
        this.A00 = 1BK.A0C();
    }

    public /* synthetic */ Integer Atc() {
        return null;
    }

    public String Azs(5vW r302) {
        return 1BK.A0u(this.A01, 2131966330);
    }

    public boolean BQh(5vW r302) {
        C5v9 c5v9;
        Photo photo;
        11T.A0F(r302, 0);
        C5fv c5fv = ((5vV) r302).A00;
        Integer num = null;
        if ((c5fv instanceof C5v9) && (c5v9 = (C5v9) c5fv) != null && (photo = c5v9.A00) != null) {
            num = photo.A0A;
        }
        boolean z = false;
        if (num == 0S2.A01) {
            z = true;
        }
        82U AxW = c5fv.AxW(C5vc.A00);
        return z && AxW != null && AxW.A02 && ((2yD) this.A00.A00.get()).AZk(36326670180833049L);
    }

    public boolean BUD() {
        return true;
    }

    public void C6v() {
        this.A04.AQN(new A5l(this.A02));
    }

    public void C6w() {
        84C.A00(this.A03, "cutout_sticker_mustache_nux_impression_count");
    }

    public void CcS(7MJ r302) {
        11T.A0F(r302, 0);
        84C r0 = this.A03;
        r302.A00(AnonymousClass001.A1R(7zM.A03(1Br.A09(r0.A00), ((1M0) 1Br.A0B(r0.A02)).A00("cutout_sticker_mustache_nux_impression_count")), 3));
    }
}
