package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;

/* loaded from: Ijt.class */
public final /* synthetic */ class Ijt implements JH3 {
    public final /* synthetic */ IFL A00;

    @Override // X.JH3
    public final void C5v(Integer num, MediaEffect mediaEffect) {
        Hu0 hu0 = this.A00.A0J;
        int intValue = num.intValue();
        11T.A0F(mediaEffect, 1);
        Iterator A0y = AnonymousClass001.A0y(hu0.A07);
        while (A0y.hasNext()) {
            ((Ik1) GOp.A15(A0y)).A5a(mediaEffect, intValue);
        }
    }
}
