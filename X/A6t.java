package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: A6t.class */
public final class A6t implements 79Q {
    public long A00;
    public C2636Gjo A01;
    public final 1Br A02;
    public final 1Br A03 = 1Bq.A00(84488);
    public final ExecutorService A04 = (ExecutorService) 1Bi.A03(16456);
    public final 1De A05;

    public A6t(1De r302) {
        this.A05 = r302;
        this.A02 = 7zM.A0h(r302, 83914);
    }

    public /* bridge */ /* synthetic */ ListenableFuture D1r(Object obj) {
        C2636Gjo c2636Gjo = this.A01;
        if (c2636Gjo != null && 1Br.A01(this.A03) - this.A00 < 86400000) {
            return new 1hM(new 9Pv((ImmutableList) c2636Gjo.A02, (String) null));
        }
        1FV A0j = 4YU.A0j();
        1Kd.A0F(new ABp(this, A0j, 26), ((I5H) 1Br.A0B(this.A02)).A01(), this.A04);
        this.A00 = 1Br.A01(this.A03);
        return A0j;
    }
}
