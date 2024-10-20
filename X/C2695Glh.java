package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.user.model.User;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.PillFrameLayout;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Glh, reason: case insensitive filesystem */
/* loaded from: Glh.class */
public final class C2695Glh extends C1rj {
    public C2578Ghr A00;
    public I4p A01;
    public HhX A02;
    public GL2 A03;
    public Hnb A04;
    public Hnb A05;
    public HIQ A06;
    public String A07;

    public C2695Glh() {
        super("StoryViewerPollStickerComponent");
    }

    public static void A00(IFW ifw) {
        if (ifw.A04 != null) {
            for (int i = 0; i < ifw.A0C.size(); i++) {
                ((TextView) ifw.A0C.get(i)).setText("");
                ((TextView) ifw.A0A.get(i)).setText("");
                IFW.A00((GradientDrawable) ((View) ifw.A09.get(i)).getBackground(), ifw, IFW.A08(ifw, IFW.A0c));
            }
        }
        if (ifw.A00 > 0.0f) {
            for (TextView textView : ifw.A0C) {
                textView.setVisibility(4);
                textView.setTextSize(0, ifw.A00);
            }
        }
        ifw.A09();
        ifw.A0D = false;
        if (ifw.A04 != null) {
            AnimatorSet animatorSet = ifw.A02;
            if (animatorSet != null) {
                animatorSet.cancel();
                ifw.A02 = null;
            }
            ifw.A04.clearAnimation();
        }
        ifw.A0E = false;
        ifw.A0G = false;
        ifw.A0D = false;
        ifw.A00 = -1.0f;
        ifw.A02 = null;
        ifw.A04 = null;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        CustomFrameLayout customFrameLayout = new CustomFrameLayout(context);
        AbH.A1J(customFrameLayout, -2);
        return customFrameLayout;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 829436257) {
            return null;
        }
        ((C2705Gls) 4YU.A0P(r302.A00.A00)).A01.A09();
        return null;
    }

    @Override // X.C1rj
    public void A1D(1Iw r302) {
        A00(((C2705Gls) 4YU.A0P(r302)).A01);
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        C2705Gls c2705Gls = (C2705Gls) 4YU.A0P(r302);
        HhX hhX = this.A02;
        GL2 gl2 = this.A03;
        IFW ifw = c2705Gls.A01;
        1Bn.A0H(HIH.class, (Class) null);
        ImmutableList of = ImmutableList.of();
        ImmutableList of2 = ImmutableList.of();
        C1pq.A08(7zK.A00(408), of);
        C1pq.A08("seenByList", of2);
        ifw.A08 = gl2;
        2JX A0u = I6C.A00(gl2).A0u();
        int intValue = A0u.getBooleanValue(-282985720) ? -1 : A0u.getIntValue(1760627594);
        GOq.A0X(1Fw.A04(ifw.A0I), ifw).A01(I6C.A01(A0u, intValue, true), A0u.A0k(), 4YU.A06(ifw.A08.A01.A05 + 86400000));
        ifw.A07 = hhX;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C2705Gls c2705Gls = (C2705Gls) 4YU.A0P(r302);
        FbFrameLayout fbFrameLayout = (FbFrameLayout) obj;
        Hnb hnb = this.A05;
        GL2 gl2 = this.A03;
        C2578Ghr c2578Ghr = this.A00;
        Hnb hnb2 = this.A04;
        IFW ifw = c2705Gls.A01;
        ifw.A06 = new Hir(c2578Ghr, r302, ifw, gl2, hnb2, hnb, fbFrameLayout);
        View.OnClickListener cz7 = new CZ7(2, r302, hnb, fbFrameLayout, ifw, gl2, c2578Ghr, hnb2);
        View view = ifw.A04;
        if (view != null) {
            view.setOnClickListener(cz7);
        }
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        String str;
        C2705Gls c2705Gls = (C2705Gls) 4YU.A0P(r302);
        FrameLayout frameLayout = (FrameLayout) obj;
        IXN ixn = this.A03;
        C2578Ghr c2578Ghr = this.A00;
        I4p i4p = this.A01;
        IFW ifw = c2705Gls.A01;
        HhT hhT = c2705Gls.A00;
        boolean equals = "IG_TWO_OPTION_COMBINED".equals(c2578Ghr.A0v());
        Context context = frameLayout.getContext();
        QVA qva = equals ? new QVA(context) : new PillFrameLayout(context);
        Resources resources = r302.A0D.getResources();
        DKD.A1B(qva, resources.getDimensionPixelSize(2132279336), resources.getDimensionPixelSize(2132279345));
        Context context2 = qva.getContext();
        LayoutInflater.from(context2).inflate(2132542010, (ViewGroup) qva);
        LayoutInflater.from(context2).inflate(2132542011, (ViewGroup) qva);
        qva.setId(2131364066);
        qva.setTag(2131364068, equals ? "ig_poll_style_tag" : "fb_poll_style_tag");
        frameLayout.removeAllViews();
        frameLayout.addView(qva);
        if (ifw.A04 == null) {
            ifw.A0B(qva, equals, true);
        }
        if (ixn != null) {
            IXN ixn2 = ixn;
            if (EWc.A00((GLo) ixn2.A06.get()) != null) {
                ifw.A0A();
                ((HsD) 1Lo.A04((Context) null, 1Fw.A04(ifw.A0I), ifw.A05, 99757)).A01(context, ifw.A0N);
                MontageCard montageCard = ixn2.A01;
                if (montageCard.A0E != null) {
                    1LI.A02(r302, C2695Glh.class, 0S2.A01, "StoryViewerPollStickerComponent", new Object[]{frameLayout}, 829436257);
                }
                User user = (User) 1Bn.A0H(User.class, LoggedInUser.class);
                if (user != null && (str = user.A13) != null) {
                    MontageUser montageUser = montageCard.A08;
                    if (str.equals(montageUser == null ? null : montageUser.A01.id)) {
                        return;
                    }
                }
                View findViewById = frameLayout.findViewById(2131364066);
                findViewById.getClass();
                MontageUser montageUser2 = montageCard.A08;
                if (montageUser2 != null) {
                    1BY r0 = ixn2.A00;
                    ((23F) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 33102)).A00(montageUser2.A01);
                }
                hhT.A02 = i4p;
                hhT.A01 = frameLayout;
                hhT.A00 = findViewById;
                ((C2t1) hhT.A03.get()).A0Q(Q9b.class, "7051");
            }
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        A00(((C2705Gls) 4YU.A0P(r302)).A01);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C2705Gls c2705Gls = (C2705Gls) r303;
        Object A0F = 1Bn.A0F(r302.A0D, IFW.class, (Class) null);
        Object A0H = 1Bn.A0H(HhT.class, (Class) null);
        if (A0F != null) {
            c2705Gls.A01 = (IFW) A0F;
        }
        if (A0H != null) {
            c2705Gls.A00 = (HhT) A0H;
        }
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2695Glh c2695Glh = (C2695Glh) r302;
            HhX hhX = this.A02;
            HhX hhX2 = c2695Glh.A02;
            if (hhX != null) {
                if (!hhX.equals(hhX2)) {
                    return false;
                }
            } else if (hhX2 != null) {
                return false;
            }
            HIQ hiq = this.A06;
            HIQ hiq2 = c2695Glh.A06;
            if (hiq != null) {
                if (!hiq.equals(hiq2)) {
                    return false;
                }
            } else if (hiq2 != null) {
                return false;
            }
            String str = this.A07;
            String str2 = c2695Glh.A07;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            Hnb hnb = this.A04;
            Hnb hnb2 = c2695Glh.A04;
            if (hnb != null) {
                if (!hnb.equals(hnb2)) {
                    return false;
                }
            } else if (hnb2 != null) {
                return false;
            }
            GL2 gl2 = this.A03;
            GL2 gl22 = c2695Glh.A03;
            if (gl2 != null) {
                if (!gl2.equals(gl22)) {
                    return false;
                }
            } else if (gl22 != null) {
                return false;
            }
            C2578Ghr c2578Ghr = this.A00;
            C2578Ghr c2578Ghr2 = c2695Glh.A00;
            if (c2578Ghr != null) {
                if (!c2578Ghr.equals(c2578Ghr2)) {
                    return false;
                }
            } else if (c2578Ghr2 != null) {
                return false;
            }
            I4p i4p = this.A01;
            I4p i4p2 = c2695Glh.A01;
            if (i4p != null) {
                if (!i4p.equals(i4p2)) {
                    return false;
                }
            } else if (i4p2 != null) {
                return false;
            }
            Hnb hnb3 = this.A05;
            Hnb hnb4 = c2695Glh.A05;
            if (hnb3 != null) {
                if (!hnb3.equals(hnb4)) {
                    return false;
                }
            } else if (hnb4 != null) {
                return false;
            }
        }
        return true;
    }
}
