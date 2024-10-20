package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.google.common.base.Predicate;

/* loaded from: In0.class */
public final class In0 implements Predicate {
    public final /* synthetic */ 6TN A00;
    public final /* synthetic */ PlayerOrigin A01;
    public final /* synthetic */ GRD A02;
    public final /* synthetic */ 6TI A03;

    public In0(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305) {
        this.A03 = r305;
        this.A02 = grd;
        this.A01 = playerOrigin;
        this.A00 = r302;
    }

    @Override // com.google.common.base.Predicate
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        6TI r0 = this.A03;
        GRD grd = this.A02;
        return ((C6cb) obj).BUW(this.A00, this.A01, grd, r0);
    }
}
