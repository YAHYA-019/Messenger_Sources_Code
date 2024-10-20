package X;

import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;

/* renamed from: X.6F3, reason: invalid class name */
/* loaded from: 6F3.class */
public final class C6F3 implements C62i {
    public final /* synthetic */ 6F2 A00;

    public C6F3(6F2 r302) {
        this.A00 = r302;
    }

    @Override // X.C62i
    public void CQS() {
        6F2 r0 = this.A00;
        6F2.A0i(r0);
        6QS r02 = r0.A0b;
        if (r02 != null) {
            r02.A1u((5zD) r0.A3N.get());
        }
        6FO r03 = r0.A11;
        if (r03 != null && r03 != 6FO.A04) {
            6F2.A0q(r0, false);
        }
        6Fx r04 = r0.A0r;
        C00i c00i = r0.A3N;
        5zD r05 = (5zD) c00i.get();
        6Gi r06 = r04.A0C;
        if (((C6kc) r06.A01.get()).A06(r06.A06.BF7()) && r06.BUB()) {
            Object A0b = r06.A05.AcP().A0b("media_view_fragment");
            A0b.getClass();
            ((MediaViewFragment) A0b).A1D(6Gi.A00(r05, r06));
        }
        r0.A3c.CQX((5zD) c00i.get());
        6IW r07 = r0.A1I;
        if (r07 != null) {
            r07.A03((5zD) c00i.get());
        }
    }
}
