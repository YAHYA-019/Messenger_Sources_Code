package X;

import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Iib.class */
public final class Iib implements JJC {
    public static final Set A03;
    public static final Set A04 = C1n3.A05("OverlayRenderer");
    public 1BY A00;
    public final C15h A02 = J5u.A03(this, 100);
    public final C00i A01 = 7zN.A0D(116176);

    static {
        HashSet A0v = AnonymousClass001.A0v();
        A03 = A0v;
        A0v.add(IiK.class);
    }

    public Iib(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ JMy AKh(PersistedGLRenderer persistedGLRenderer) {
        return ((C2598Gih) this.A01.get()).A00((I8g) ((C3R8) this.A02.get()).A02(persistedGLRenderer.A00, I8g.class), true);
    }

    public Set D3Y() {
        return A04;
    }
}
