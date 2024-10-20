package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9ht, reason: invalid class name */
/* loaded from: 9ht.class */
public final class C9ht {
    public C8t A00;
    public final Context A01;
    public final 06Z A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadKey A07;
    public final ThreadThemeInfo A08;
    public final boolean A09;
    public final boolean A0A;
    public final FbUserSession A0B;
    public final C5ic A0C;
    public final MigColorScheme A0D;
    public final AYj A0E;
    public final String A0F;
    public final boolean A0G;

    public C9ht(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, MigColorScheme migColorScheme, AYj aYj, ThreadThemeInfo threadThemeInfo, String str, boolean z, boolean z2, boolean z3) {
        7zR.A1O(migColorScheme, fbUserSession);
        this.A01 = context;
        this.A0D = migColorScheme;
        this.A0B = fbUserSession;
        this.A02 = r303;
        this.A09 = z;
        this.A0A = z2;
        this.A0G = z3;
        this.A0F = str;
        this.A08 = threadThemeInfo;
        this.A07 = threadKey;
        this.A0E = aYj;
        this.A04 = 1Bq.A00(50079);
        this.A03 = 1Bq.A00(68186);
        this.A05 = 1Bq.A00(68183);
        this.A0C = 7zQ.A0l();
        this.A06 = 1Bu.A01(context, 68182);
    }

    public static final void A00(C9ht c9ht) {
        c9ht.A0E.BuH();
        2xK r0 = new 2xK();
        r0.A0T = 651420105782479L;
        r0.A0S = 3259963564026002L;
        com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo threadThemeInfo = new com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo(r0);
        9Zo r02 = (9Zo) 1Br.A0B(c9ht.A06);
        Context context = c9ht.A01;
        FbUserSession fbUserSession = c9ht.A0B;
        06Z r03 = c9ht.A02;
        if (r03 == null) {
            throw 1BK.A0h();
        }
        r02.A00(context, r03, fbUserSession, c9ht.A07, (ThreadSummary) null, threadThemeInfo, "background", c9ht.A0F, "remove_theme_dialog", c9ht.A0G);
    }

    public void A01() {
        ThreadKey threadKey = this.A07;
        if (threadKey != null) {
            if (threadKey.A0z()) {
                Object A0B = 1Br.A0B(this.A03);
                ((5P5) 1Lo.A08(this.A0B, 67488)).A00(A1f.A00(threadKey, A0B, 39), threadKey.A01);
            } else {
                ((6NA) 1Br.A0B(this.A04)).A03(threadKey);
            }
        }
        Context context = this.A01;
        String A0u = 1BK.A0u(context, 2131955383);
        String A0u2 = 1BK.A0u(context, 2131955380);
        String A0u3 = 1BK.A0u(context, 2131955382);
        DR6 A02 = this.A0C.A02(context);
        A02.A03(A0u);
        A02.A0J(A0u2);
        C9oG.A00(A02, A0u3, this, 51);
        A02.A0E(new DialogInterface.OnClickListener() { // from class: X.9o4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                7zU.A0x(dialogInterface);
            }
        }, context.getString(2131955381));
        A02.A05();
    }

    public void A02(final C9a1 c9a1, final ThreadThemeInfo threadThemeInfo, final boolean z) {
        DG3 dg3 = new DG3() { // from class: X.9xr
            @Override // X.DG3
            public final void CAG(DJd dJd) {
                ThreadKey threadKey;
                11T.A0F(dJd, 0);
                C9ht c9ht = C9ht.this;
                int Apm = dJd.Apm();
                ThreadThemeInfo threadThemeInfo2 = threadThemeInfo;
                C9a1 c9a12 = c9a1;
                boolean z2 = z;
                if (Apm == 2131364325) {
                    C9ht.A00(c9ht);
                } else if (Apm == 2131364324) {
                    c9a12.A00(c9ht.A07, threadThemeInfo2);
                } else if (Apm == 2131364326 && (threadKey = c9ht.A07) != null) {
                    6In r0 = (6In) 1Bu.A06(c9ht.A01, 68120);
                    String valueOf = String.valueOf(threadThemeInfo2.A06);
                    06Z r02 = c9ht.A02;
                    if (r02 == null) {
                        throw 1BK.A0h();
                    }
                    r0.Czg(r02, threadKey, valueOf);
                    r0.A5K(new DFC(1, c9ht, z2) { // from class: X.9w9
                        public final int A00;
                        public final Object A01;
                        public final boolean A02;

                        {
                            this.A00 = r302;
                            this.A02 = z2;
                            this.A01 = c9ht;
                        }

                        public void BxG(Integer num) {
                            switch (this.A00) {
                                case 0:
                                    11T.A0F(num, 0);
                                    if (this.A02 && num == 0S2.A0Y) {
                                        9gI r03 = (9gI) this.A01;
                                        C5ic A0l = 7zQ.A0l();
                                        Context context = r03.A01;
                                        DR6 A02 = A0l.A02(context);
                                        A02.A03(context.getString(2131955383));
                                        A02.A0J(context.getString(2131955380));
                                        C9oG.A00(A02, context.getString(2131955382), r03, 12);
                                        A02.A0B(Ril.A00, 2131955381);
                                        A02.A05();
                                        return;
                                    }
                                    return;
                                case 1:
                                    11T.A0F(num, 0);
                                    if (this.A02 && num == 0S2.A0Y) {
                                        ((C9ht) this.A01).A01();
                                        return;
                                    }
                                    return;
                                default:
                                    I8C.A01((I8C) this.A01, this.A02);
                                    return;
                            }
                        }
                    });
                }
                C8t c8t = c9ht.A00;
                if (c8t != null) {
                    c8t.A00();
                }
                c9ht.A00 = null;
            }
        };
        06Z r0 = this.A02;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        Bwz bwz = new Bwz(r0);
        bwz.A03 = this.A0D;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!z) {
            final int i = 2131364324;
            final String A0u = 1BK.A0u(this.A01, 2131957299);
            final C1u3 c1u3 = C1u3.A2c;
            builder.m11011add((Object) new DJd(c1u3, this, A0u, i) { // from class: X.9xo
                public final String A00;
                public final int A01;
                public final C1u3 A02;
                public final /* synthetic */ C9ht A03;

                {
                    this.A03 = this;
                    this.A01 = i;
                    this.A00 = A0u;
                    this.A02 = c1u3;
                }

                @Override // X.DJd
                public String AWg() {
                    return this.A00;
                }

                @Override // X.DJd
                public String AhU() {
                    return this.A00;
                }

                @Override // X.DJd
                public C1u3 ApY() {
                    return this.A02;
                }

                @Override // X.DJd
                public /* synthetic */ int Apg() {
                    return 0;
                }

                @Override // X.DJd
                public int Apm() {
                    return this.A01;
                }

                @Override // X.DJd
                public /* synthetic */ Bpf AqH() {
                    return null;
                }

                @Override // X.DJd
                public /* bridge */ /* synthetic */ CharSequence getTitle() {
                    return this.A00;
                }
            });
        }
        final int i2 = 2131364326;
        Context context = this.A01;
        final String A0u2 = 1BK.A0u(context, 2131957301);
        final C1u3 c1u32 = C1u3.A1N;
        builder.m11011add((Object) new DJd(c1u32, this, A0u2, i2) { // from class: X.9xo
            public final String A00;
            public final int A01;
            public final C1u3 A02;
            public final /* synthetic */ C9ht A03;

            {
                this.A03 = this;
                this.A01 = i2;
                this.A00 = A0u2;
                this.A02 = c1u32;
            }

            @Override // X.DJd
            public String AWg() {
                return this.A00;
            }

            @Override // X.DJd
            public String AhU() {
                return this.A00;
            }

            @Override // X.DJd
            public C1u3 ApY() {
                return this.A02;
            }

            @Override // X.DJd
            public /* synthetic */ int Apg() {
                return 0;
            }

            @Override // X.DJd
            public int Apm() {
                return this.A01;
            }

            @Override // X.DJd
            public /* synthetic */ Bpf AqH() {
                return null;
            }

            @Override // X.DJd
            public /* bridge */ /* synthetic */ CharSequence getTitle() {
                return this.A00;
            }
        });
        if (z) {
            final int i3 = 2131364325;
            final String A0u3 = 1BK.A0u(context, 2131957300);
            final C1u3 c1u33 = C1u3.A0q;
            builder.m11011add((Object) new DJd(c1u33, this, A0u3, i3) { // from class: X.9xo
                public final String A00;
                public final int A01;
                public final C1u3 A02;
                public final /* synthetic */ C9ht A03;

                {
                    this.A03 = this;
                    this.A01 = i3;
                    this.A00 = A0u3;
                    this.A02 = c1u33;
                }

                @Override // X.DJd
                public String AWg() {
                    return this.A00;
                }

                @Override // X.DJd
                public String AhU() {
                    return this.A00;
                }

                @Override // X.DJd
                public C1u3 ApY() {
                    return this.A02;
                }

                @Override // X.DJd
                public /* synthetic */ int Apg() {
                    return 0;
                }

                @Override // X.DJd
                public int Apm() {
                    return this.A01;
                }

                @Override // X.DJd
                public /* synthetic */ Bpf AqH() {
                    return null;
                }

                @Override // X.DJd
                public /* bridge */ /* synthetic */ CharSequence getTitle() {
                    return this.A00;
                }
            });
        }
        bwz.A04 = 1Fj.A01(builder);
        bwz.A02 = dg3;
        C8t c8t = new C8t(bwz);
        this.A00 = c8t;
        c8t.A02();
    }
}
