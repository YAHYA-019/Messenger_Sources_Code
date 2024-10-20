package X;

import android.content.Context;
import android.view.View;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: GXm.class */
public final class GXm extends C2lb {
    public HS5 A00;
    public MediaResource A01;
    public final HS8 A02;
    public final IPs A03;
    public final Hzu A04;
    public final Context A05;

    public GXm(View view) {
        super(view);
        Context A08 = 4YU.A08(view);
        this.A05 = A08;
        1Bn.A0E(A08, (1BY) null, 148026);
        IPs iPs = new IPs(view);
        this.A03 = iPs;
        iPs.A01 = new HS9(this);
        1Bn.A0E(A08, (1BY) null, 148025);
        this.A02 = new HS8(view);
        1Bn.A0E(A08, (1BY) null, 147631);
        Hzu hzu = new Hzu(A08);
        this.A04 = hzu;
        hzu.A01 = new IVg(this);
    }
}
