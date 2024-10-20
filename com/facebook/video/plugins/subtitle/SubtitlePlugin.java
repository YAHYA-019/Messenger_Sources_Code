package com.facebook.video.plugins.subtitle;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Fk;
import X.6TI;
import X.6TN;
import X.6TX;
import X.6Tb;
import X.6UR;
import X.6US;
import X.6WH;
import X.82P;
import X.AnonymousClass001;
import X.C03713yu;
import X.C6dd;
import X.C6df;
import X.C6dh;
import X.C6dj;
import X.C6dl;
import X.C6dn;
import X.C7lz;
import X.GRX;
import X.Hgo;
import X.Hpd;
import X.HrR;
import X.HyJ;
import X.I6H;
import android.content.Context;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.inject.FbInjector;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.plugins.subtitle.SubtitlePlugin;
import com.facebook.video.subtitles.views.FbSubtitleView;
import java.lang.ref.SoftReference;

/* loaded from: SubtitlePlugin.class */
public class SubtitlePlugin extends C6dd {
    public C03713yu A00;
    public GraphQLMedia A01;
    public VideoPlayerParams A02;
    public 6UR A03;
    public Hgo A04;
    public FbSubtitleView A05;
    public String A06;
    public SoftReference A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final 1Fk A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final C6dh A0T;
    public final C6df A0U;
    public final C6dj A0V;
    public final C6dn A0W;
    public final C6dl A0X;
    public volatile 6WH A0Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitlePlugin(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0U = new C6df() { // from class: X.6de
            @Override // X.C6df
            public int Afj() {
                SubtitlePlugin subtitlePlugin = SubtitlePlugin.this;
                GRX grx = ((C6d6) subtitlePlugin).A09;
                int i = 0;
                if (grx != null) {
                    VideoPlayerParams videoPlayerParams = subtitlePlugin.A02;
                    if (videoPlayerParams != null) {
                        String str = videoPlayerParams.A0k;
                        PlayerOrigin playerOrigin = ((C6d6) subtitlePlugin).A03;
                        if (playerOrigin == null) {
                            throw 1BK.A0h();
                        }
                        i = grx.A00(playerOrigin, str);
                    }
                } else {
                    6Tu r0 = ((C6d6) subtitlePlugin).A08;
                    if (r0 != null) {
                        return r0.Afn();
                    }
                }
                return i;
            }
        };
        this.A0D = new 1Fk() { // from class: X.6dg
            public void CTJ(boolean z) {
                I2p i2p;
                SubtitlePlugin subtitlePlugin = SubtitlePlugin.this;
                subtitlePlugin.A0A = z;
                FbSubtitleView fbSubtitleView = subtitlePlugin.A05;
                if (fbSubtitleView != null) {
                    if (z) {
                        fbSubtitleView.A0F();
                        return;
                    }
                    if (!fbSubtitleView.A07 || (i2p = fbSubtitleView.A02) == null) {
                        return;
                    }
                    if (i2p.A05 == null) {
                        i2p.A09 = true;
                    } else {
                        I2p.A00(i2p);
                    }
                    fbSubtitleView.A0C.setVisibility(0);
                }
            }
        };
        this.A0T = new C6dh(this);
        this.A0V = new C6dj() { // from class: X.6di
            @Override // X.C6dj
            public float Afl() {
                String str;
                Number number;
                SubtitlePlugin subtitlePlugin = SubtitlePlugin.this;
                VideoPlayerParams videoPlayerParams = subtitlePlugin.A02;
                if (videoPlayerParams == null || (str = videoPlayerParams.A0k) == null || (number = (Number) ((HYE) 1Br.A0B(subtitlePlugin.A0O)).A00.A02(str)) == null) {
                    return 1.0f;
                }
                return number.floatValue();
            }
        };
        this.A0Y = 6WH.A04;
        this.A0R = 1Bq.A00(49694);
        this.A0E = 1Bq.A00(16465);
        this.A0M = 1Bq.A00(66167);
        this.A0N = 1Bq.A00(66168);
        this.A0G = 1Bq.A00(16511);
        this.A0H = 1Bu.A00(115818);
        this.A0Q = 1Bu.A00(115819);
        this.A0L = 1Bu.A00(115821);
        this.A0S = 1Bq.A00(115824);
        this.A0J = 1Bu.A00(16459);
        this.A0P = 1Bq.A00(67461);
        this.A0K = 1Bu.A00(66166);
        this.A0F = 1Bq.A00(16501);
        this.A09 = true;
        this.A0I = 1Bq.A00(16385);
        this.A0O = 1Bq.A00(115822);
        A0h(new 82P(this, 42), new 82P(this, 44), new 82P(this, 45), new 82P(this, 43), new 82P(this, 41), new 82P(this, 46), new 82P(this, 39), new 82P(this, 40));
        this.A0X = new C6dl() { // from class: X.6dk
            @Override // X.C6dl
            public void CGp(Hgo hgo) {
                11T.A0F(hgo, 0);
                SubtitlePlugin subtitlePlugin = SubtitlePlugin.this;
                GRX grx = ((C6d6) subtitlePlugin).A09;
                String str = null;
                String str2 = hgo.A02;
                if (grx == null) {
                    6cT r0 = ((C6d6) subtitlePlugin).A07;
                    if (r0 != null) {
                        str = r0.BJQ();
                    }
                    if (!11T.A0O(str2, str)) {
                        return;
                    }
                } else {
                    6TI r02 = ((C6d6) subtitlePlugin).A05;
                    if (r02 != null) {
                        str = r02.A03();
                    }
                    if (!11T.A0O(str2, str)) {
                        0fH.A0n("SubtitlePlugin", "Subtitle is for incorrect video ID. Skipping setting subtitles");
                        return;
                    }
                }
                subtitlePlugin.A0s(hgo);
            }

            @Override // X.C6dl
            public void CGt() {
                SubtitlePlugin.this.A0s(null);
            }

            @Override // X.C6dl
            public void CGv(Throwable th) {
                SubtitlePlugin.this.A0s(null);
            }
        };
        this.A0W = new C6dn() { // from class: X.6dm
            @Override // X.C6dn
            public void CMk() {
                SubtitlePlugin.this.A00 = null;
            }

            @Override // X.C6dn
            public void CMm(C03713yu c03713yu) {
                SubtitlePlugin.this.A00 = c03713yu;
            }
        };
    }

    public static final void A00(6UR r301, SubtitlePlugin subtitlePlugin) {
        FbSubtitleView fbSubtitleView = subtitlePlugin.A05;
        if (fbSubtitleView == null || r301 == null) {
            return;
        }
        int ordinal = r301.ordinal();
        if (ordinal == 4) {
            fbSubtitleView.A0G();
            return;
        }
        if (ordinal != 7) {
            if (ordinal == 9 || ordinal == 10) {
                subtitlePlugin.A0Y = 6WH.A04;
                FbSubtitleView fbSubtitleView2 = subtitlePlugin.A05;
                if (fbSubtitleView2 != null) {
                    fbSubtitleView2.A0H();
                    return;
                }
                return;
            }
            subtitlePlugin.A0Y = 6WH.A04;
            FbSubtitleView fbSubtitleView3 = subtitlePlugin.A05;
            if (fbSubtitleView3 != null) {
                fbSubtitleView3.A0F();
            }
        }
    }

    public static final void A01(SubtitlePlugin subtitlePlugin) {
        C03713yu c03713yu = subtitlePlugin.A00;
        if (c03713yu != null) {
            c03713yu.cancel(true);
            subtitlePlugin.A00 = null;
        }
    }

    @Override // X.C6d6
    public void A0M() {
        A01(this);
        A0s(null);
        this.A07 = null;
        this.A02 = null;
        this.A0Y = 6WH.A04;
        FbSubtitleView fbSubtitleView = this.A05;
        if (fbSubtitleView != null) {
            fbSubtitleView.A0H();
        }
    }

    @Override // X.C6d6
    public void A0P() {
        this.A08 = false;
        this.A09 = true;
        A0M();
    }

    @Override // X.C6d6
    public void A0Y(6TI r302) {
        VideoPlayerParams videoPlayerParams;
        boolean z = true;
        boolean A1W = AnonymousClass001.A1W(super.A0O, 6TN.A09);
        if (r302 == null || (videoPlayerParams = r302.A03) == null || videoPlayerParams.A1b || A1W) {
            z = false;
        }
        ((C6dd) this).A00 = r302;
        GRX grx = super.A09;
        if (grx != null) {
            this.A03 = grx.A06(super.A03, super.A0A);
        }
        if (!z) {
            if (r302 != null) {
                A0e(r302, true);
                return;
            }
            return;
        }
        VideoPlayerParams videoPlayerParams2 = r302 != null ? r302.A03 : null;
        this.A02 = videoPlayerParams2;
        if (videoPlayerParams2 != null) {
            ((6Tb) this.A0S.A00.get()).A0K(super.A03, videoPlayerParams2.A0k);
        }
        this.A07 = new SoftReference(super.A06);
        this.A08 = true;
        A0p();
    }

    @Override // X.C6d6
    public void A0Z(6TI r302) {
        super.A0Z(r302);
        this.A0Y = 6WH.A04;
    }

    @Override // X.C6dd, X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        ((C6dd) this).A00 = r302;
        VideoPlayerParams videoPlayerParams = r302.A03;
        this.A02 = videoPlayerParams;
        if (videoPlayerParams != null) {
            String str = videoPlayerParams.A0k;
            ((6Tb) this.A0S.A00.get()).A0K(super.A03, str);
        }
        A0r(6US.A01(r302));
        this.A07 = new SoftReference(super.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0p() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.subtitle.SubtitlePlugin.A0p():void");
    }

    public final void A0q() {
        HrR hrR = (HrR) this.A0Q.A00.get();
        GraphQLMedia graphQLMedia = this.A01;
        6TI r0 = super.A05;
        this.A06 = hrR.A00(r0 != null ? r0.A01 : null, graphQLMedia);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0r(GraphQLMedia graphQLMedia) {
        this.A09 = false;
        this.A01 = graphQLMedia;
        A0q();
        if (I6H.A01(this.A01)) {
            A0p();
            return;
        }
        String str = null;
        String str2 = this.A06;
        if ((str2 == null || str2.length() == 0 || graphQLMedia == null || !I6H.A02(graphQLMedia) || !I6H.A00(graphQLMedia).contains(this.A06)) && !HyJ.A00((HyJ) this.A0P.A00.get())) {
            A0s(null);
            return;
        }
        A01(this);
        Hpd hpd = (Hpd) 1Br.A0B(this.A0M);
        VideoPlayerParams videoPlayerParams = this.A02;
        if (videoPlayerParams != null) {
            str = videoPlayerParams.A0k;
        }
        String str3 = this.A06;
        C6dl c6dl = this.A0X;
        Context context = getContext();
        if (context == null) {
            context = FbInjector.A00();
        }
        11T.A0D(context);
        6TI r0 = super.A05;
        hpd.A00(context, r0 != null ? r0.A01 : null, graphQLMedia, this.A0W, c6dl, str, str3);
    }

    public final void A0s(Hgo hgo) {
        if (super.A09 == null && super.A07 == null) {
            return;
        }
        if (!11T.A0O(this.A04, hgo) || this.A04 == null) {
            this.A04 = hgo;
            boolean z = false;
            if (hgo != null) {
                A0p();
                z = true;
            } else {
                FbSubtitleView fbSubtitleView = this.A05;
                if (fbSubtitleView != null) {
                    fbSubtitleView.A0E();
                }
                this.A0B = false;
            }
            A0t(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b5, code lost:
    
        if (r0.A1F != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b8, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a3, code lost:
    
        r319 = null;
        r320 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02be, code lost:
    
        r312 = X.6WH.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f0, code lost:
    
        throw X.1BK.A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c6, code lost:
    
        r318 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02cc, code lost:
    
        r306 = X.6TN.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d4, code lost:
    
        r318 = java.lang.Integer.valueOf(r0.Afn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018b, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0180, code lost:
    
        if (r310 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018e, code lost:
    
        r306 = r0.B3f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0199, code lost:
    
        if (r306 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019e, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
    
        r306 = r0.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01aa, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01af, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b4, code lost:
    
        if (r310 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        r318 = java.lang.Integer.valueOf(r0.A00(r310, r317));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cb, code lost:
    
        if (r308 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ce, code lost:
    
        r312 = X.6WH.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d5, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e8, code lost:
    
        if (r0.A01.get() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        if (r317 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f2, code lost:
    
        if (r310 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f5, code lost:
    
        r0 = r0.A05(r310, r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0202, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r0 = (X.C7gl) r0.A1y.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0214, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0217, code lost:
    
        r319 = r0.A01;
        r320 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0227, code lost:
    
        if (r320 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022a, code lost:
    
        r320 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0233, code lost:
    
        if (r319 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0237, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023a, code lost:
    
        r0 = r0.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0242, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0245, code lost:
    
        r316 = (java.lang.String) r0.get("upstream_player_source");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0260, code lost:
    
        if (r301.A0Y == r312) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0263, code lost:
    
        r301.A0Y = r312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026b, code lost:
    
        if (r315 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026e, code lost:
    
        r319 = r301.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0274, code lost:
    
        X.4YV.A11(r301.A0E).execute(new X.J4E(r306, r312, r310, r0, r301, r318, r317, r319, r320, r316));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0t(boolean r302) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.plugins.subtitle.SubtitlePlugin.A0t(boolean):void");
    }

    @Override // X.C6d6
    public void CgE(6TX r302) {
        11T.A0F(r302, 0);
        super.CgE(r302);
        FbSubtitleView fbSubtitleView = this.A05;
        if (fbSubtitleView != null) {
            C7lz.A00(fbSubtitleView, r302, "Subtitle");
        } else {
            r302.A04("SubtitlePlugin", "SubtitleViewNotSetup", "");
        }
    }
}
