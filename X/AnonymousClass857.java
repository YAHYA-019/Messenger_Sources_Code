package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;

/* renamed from: X.857, reason: invalid class name */
/* loaded from: 857.class */
public final class AnonymousClass857 extends C1rs {
    public 1Iw A00;
    public 64M A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass857(1Iw r302, 64M r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "coreBindings", "fbUserSession", "fragmentManager", "item", "listener", "rowViewType", "textSpannable", "theme", "threadViewSurface"};
        BitSet bitSet = new BitSet(10);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 64M A2V() {
        C1rs.A05(this.A02, this.A03, 10);
        A0J();
        return this.A01;
    }

    public void A2X(06Z r302) {
        this.A01.A03 = r302;
        this.A02.set(3);
    }

    public void A2Y(FbUserSession fbUserSession) {
        this.A01.A04 = fbUserSession;
        this.A02.set(2);
    }

    public void A2Z(2S4 r302) {
        this.A01.A05 = r302;
        this.A02.set(9);
    }

    public void A2a(1LI r302) {
        this.A01.A07 = r302 == null ? null : r302.A0l();
    }

    public void A2b(5zD r302) {
        this.A01.A09 = r302;
        this.A02.set(8);
    }

    public void A2c(63D r302) {
        this.A01.A0C = r302;
        this.A02.set(1);
    }

    public void A2d(C62q c62q) {
        this.A01.A0D = c62q;
        this.A02.set(5);
    }

    public void A2e(64I r302) {
        this.A01.A0E = r302;
        this.A02.set(7);
    }

    public void A2f(AnonymousClass622 anonymousClass622) {
        this.A01.A0G = anonymousClass622;
        this.A02.set(4);
    }

    public void A2g(63V r302) {
        this.A01.A0H = r302;
        this.A02.set(6);
    }

    public void A2h(Capabilities capabilities) {
        this.A01.A0J = capabilities;
        this.A02.set(0);
    }
}
