package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9u1, reason: invalid class name */
/* loaded from: 9u1.class */
public final class C9u1 implements Aav {
    public static final String __redex_internal_original_name = "ContactsTabMontageLoaderCoordinator";
    public 6BX A01;
    public final AZF A03;
    public final 1De A04;
    public final C9w8 A05 = new C9w8(this, 0);
    public boolean A02 = true;
    public C9u3 A00 = C9u3.A00(new C9kj(), C95a.A04);

    public C9u1(1De r302, AZF azf) {
        this.A04 = r302;
        this.A03 = azf;
    }

    private final 6BX A00() {
        if (this.A01 == null) {
            synchronized (this) {
                this.A01 = (6BX) 1De.A00(this.A04, 67970);
            }
        }
        6BX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        11T.A0L("montageListFetcher");
        throw 0Q8.createAndThrow();
    }

    @Override // X.Aav
    public void Bs2() {
        A00().D1g(this.A05, C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER);
    }

    @Override // X.Aav
    public void D1D(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A04.A00;
        6Bd r02 = (6Bd) 1Lo.A04((Context) null, fbUserSession, r0, 49985);
        r02.A02(this.A02);
        ((6Bf) 1Lo.A04((Context) null, fbUserSession, r0, 49987)).A05(this.A02);
        6BY D1g = A00().D1g(this.A05, C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER);
        C9kj c9kj = new C9kj(this.A00);
        c9kj.A07 = D1g;
        C9kj.A00(c9kj, "montageListResult");
        this.A00 = new C9u3(c9kj);
        ((6Bh) 1Lo.A04((Context) null, fbUserSession, r0, 68046)).A01 = true;
        this.A03.CHn(this.A00);
        r02.A00();
        this.A02 = false;
    }

    @Override // X.Aav
    public void D2b(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        1BY r0 = this.A04.A00;
        ((6Bd) 1Lo.A04((Context) null, fbUserSession, r0, 49985)).A01("left_surface");
        ((6Bf) 1Lo.A04((Context) null, fbUserSession, r0, 49987)).A01();
        ((6Bh) 1Lo.A04((Context) null, fbUserSession, r0, 68046)).A01 = false;
        this.A03.CHn(this.A00);
    }

    @Override // X.Aav
    public void init() {
    }
}
