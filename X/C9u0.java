package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.9u0, reason: invalid class name */
/* loaded from: 9u0.class */
public final class C9u0 implements Aav {
    public static final String __redex_internal_original_name = "ContactsTabMergedLoaderCoordinatorV2";
    public C9u3 A00;
    public final 1Br A01;
    public final AZF A02;
    public final Context A03;
    public final FbUserSession A04;
    public final C9u2 A05;
    public final C9u1 A06;

    public C9u0(Context context, FbUserSession fbUserSession, 82O r304, 82O r305, AZF azf) {
        1BL.A1F(r304, r305);
        this.A02 = azf;
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A01 = 1Bq.A00(67920);
        AZF azf2 = new AZF() { // from class: X.9tw
            @Override // X.AZF
            public void C46() {
                C9u0.this.A02.C46();
            }

            @Override // X.AZF
            public void CHn(C9u3 c9u3) {
                11T.A0F(c9u3, 0);
                C9u0 c9u0 = C9u0.this;
                C9kj c9kj = new C9kj(c9u0.A00);
                c9kj.A06 = c9u3.AgB();
                C9kj.A00(c9kj, "currentlyAndRecentlyActiveEntities");
                c9kj.A02 = c9u3.AVU();
                C9kj.A00(c9kj, "activeNowLoaderState");
                c9kj.A0C = c9u3.B81();
                C9kj.A00(c9kj, "richStatuses");
                8Kl Ati = c9u3.Ati();
                c9kj.A0A = Ati;
                C1pq.A08("lifeEventsResult", Ati);
                C9kj.A00(c9kj, "lifeEventsResult");
                c9kj.A09 = c9u3.Ath();
                C9kj.A00(c9kj, "lifeEventsLoaderState");
                8Kf BH4 = c9u3.BH4();
                c9kj.A00 = BH4;
                C1pq.A08("trendingChannelsResult", BH4);
                C9kj.A00(c9kj, "trendingChannelsResult");
                8Kg BH5 = c9u3.BH5();
                c9kj.A01 = BH5;
                C1pq.A08("trendingCommunitiesResult", BH5);
                C9kj.A00(c9kj, "trendingCommunitiesResult");
                8Kh B6O = c9u3.B6O();
                c9kj.A08 = B6O;
                C1pq.A08("recommendedPublicChannelsResult", B6O);
                C9kj.A00(c9kj, "recommendedPublicChannelsResult");
                C9u3 c9u32 = new C9u3(c9kj);
                c9u0.A00 = c9u32;
                c9u0.A02.CHn(c9u32);
            }
        };
        Context A00 = 1Bf.A00(r304);
        try {
            C9u2 c9u2 = new C9u2(context, fbUserSession, azf2);
            1Bn.A0K();
            FbInjector.A04(A00);
            this.A05 = c9u2;
            this.A06 = r305.A07(new AZF() { // from class: X.9tx
                @Override // X.AZF
                public void C46() {
                    throw 0Q8.createAndThrow();
                }

                @Override // X.AZF
                public void CHn(C9u3 c9u3) {
                    11T.A0F(c9u3, 0);
                    C9u0 c9u0 = C9u0.this;
                    C9kj c9kj = new C9kj(c9u0.A00);
                    c9kj.A07 = c9u3.AyI();
                    C9kj.A00(c9kj, "montageListResult");
                    C9u3 A002 = C9u3.A00(c9kj, c9u3.AyJ());
                    c9u0.A00 = A002;
                    c9u0.A02.CHn(A002);
                }
            });
            this.A00 = new C9u3(new C9kj());
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    @Override // X.Aav
    public void Bs2() {
        if (((C2fx) 1Br.A0B(this.A01)).A01()) {
            this.A06.Bs2();
        }
    }

    @Override // X.Aav
    public void D1D(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        this.A05.D1D(fbUserSession);
        if (((C2fx) 1Br.A0B(this.A01)).A01()) {
            this.A06.D1D(fbUserSession);
        }
    }

    @Override // X.Aav
    public void D2b(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        this.A05.D2b(fbUserSession);
        if (((C2fx) 1Br.A0B(this.A01)).A01()) {
            this.A06.D2b(fbUserSession);
        }
    }

    @Override // X.Aav
    public void init() {
        this.A05.init();
        ((C2fx) 1Br.A0B(this.A01)).A01();
    }
}
