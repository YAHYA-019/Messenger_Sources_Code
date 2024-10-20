package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;

/* loaded from: Ijr.class */
public final /* synthetic */ class Ijr implements JH2 {
    public final /* synthetic */ IFL A00;

    @Override // X.JH2
    public final void C5u(Integer num, MediaEffect mediaEffect) {
        Hu0 hu0 = this.A00.A0J;
        int intValue = num.intValue();
        11T.A0F(mediaEffect, 1);
        Iterator A0y = AnonymousClass001.A0y(hu0.A07);
        while (A0y.hasNext()) {
            ((Ik1) GOp.A15(A0y)).CeD(mediaEffect, intValue);
        }
    }
}
