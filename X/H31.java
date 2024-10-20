package X;

import android.content.Context;
import android.view.View;
import com.facebook.graphql.enums.GraphQLVideoBroadcastStatus;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: H31.class */
public final class H31 extends C6d6 {
    public GraphQLVideoBroadcastStatus A00;
    public GraphQLMedia A01;
    public 6UR A02;
    public QoR A03;
    public boolean A04;
    public boolean A05;
    public final View A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 5Kv A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H31(Context context) {
        this(context, 2132543354);
        11T.A0F(context, 1);
        View view = this.A06;
        if (view != null) {
            C2rp.A01(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H31(Context context, int i) {
        super(context, null, 0);
        this.A09 = 1Bq.A00(99939);
        this.A0A = 1HG.A00(context, 115833);
        this.A07 = 7zM.A0Q();
        this.A0B = 1Bq.A00(115824);
        this.A08 = 1Bq.A00(82100);
        this.A03 = QoR.A02;
        this.A0C = GOo.A0b();
        A0C(i);
        this.A06 = C09s.A01(this, 2131362725);
        A0h(GPl.A00(this, 89), GPl.A00(this, 88), GPl.A00(this, 87), GPl.A00(this, 90), GPl.A00(this, 91), GPl.A00(this, 92));
    }

    public static final String A00(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 4) {
                return "INVISIBLE";
            }
            if (intValue == 0) {
                return "VISIBLE";
            }
            if (intValue == 8) {
                return "GONE";
            }
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UNKNOWN(");
        return AnonymousClass002.A0K(num, A0k);
    }

    private final void A01() {
        6TI A0F = A0F();
        if (A0F != null) {
            A0F.A02("AutoplayStateManager");
            1Br.A0C(this.A0A);
            DKE.A0c().AZk(72340507828752181L);
        }
    }

    private final void A02(int i) {
        View view = this.A06;
        0fH.A0Y(A00(view != null ? Integer.valueOf(view.getVisibility()) : null), A00(Integer.valueOf(i)), this.A03, 4YU.A14(this), "SinglePlayIconPlugin", "Play icon visibility [%s]->[%s] iconState[%s] view[%s]");
    }

    private final void A03(6TI r302) {
        boolean z = false;
        this.A0D = false;
        this.A03 = QoR.A02;
        GraphQLVideoBroadcastStatus graphQLVideoBroadcastStatus = null;
        this.A02 = null;
        GraphQLMedia A01 = 6US.A01(r302);
        this.A01 = A01;
        if (this.A00 == null) {
            if (A01 != null) {
                graphQLVideoBroadcastStatus = (GraphQLVideoBroadcastStatus) A01.A0V(GraphQLVideoBroadcastStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -351684304);
            }
            this.A00 = graphQLVideoBroadcastStatus;
        }
        if (r302 != null) {
            VideoPlayerParams videoPlayerParams = r302.A03;
            if (!videoPlayerParams.A1N && !videoPlayerParams.A12) {
                z = true;
            }
        }
        this.A04 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04(X.6TI r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L6c
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            r0 = r303
            com.facebook.spherical.video.model.SphericalVideoParams r0 = r0.A0U
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L59
            r0 = 2131230765(0x7f08002d, float:1.8077592E38)
            r305 = r0
        L1b:
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r1 = r305
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r304 = r0
        L25:
            r0 = r301
            android.view.View r0 = r0.A06
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L36
            r0 = r306
            r1 = r304
            r0.setBackground(r1)
        L36:
            r0 = r302
            boolean r0 = X.6US.A04(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L58
            r0 = r306
            if (r0 == 0) goto L58
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r303 = r0
            r0 = 2131952945(0x7f130531, float:1.9542347E38)
            r307 = r0
            r0 = r303
            r1 = r306
            r2 = r307
            X.GOo.A16(r0, r1, r2)
        L58:
            return
        L59:
            r0 = r303
            boolean r0 = r0.A10
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L6c
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            goto L25
        L6c:
            r0 = 2132345531(0x7f1902bb, float:2.0338606E38)
            r305 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H31.A04(X.6TI):void");
    }

    public static void A05(H31 h31, int i) {
        h31.A02(i);
        View view = h31.A06;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // X.C6d6
    public HAM A0G() {
        return HAM.A04;
    }

    @Override // X.C6d6
    public String A0H() {
        return "SinglePlayIconPlugin";
    }

    @Override // X.C6d6
    public void A0L() {
        A0O();
        super.A08 = null;
    }

    @Override // X.C6d6
    public void A0P() {
        this.A05 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r307 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r0 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        if (r301.A0O == X.6TN.A0F) goto L30;
     */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(X.6TI r302) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H31.A0Y(X.6TI):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0a(6TI r302, 6U2 r303, C6ce c6ce) {
        super.A08 = c6ce;
        if (r302.A03.A1k) {
            A0f(r303);
            return;
        }
        A0f(r303);
        if (c6ce != 0) {
            A0j(null, c6ce.B3e());
        }
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        if (z) {
            A03(r302);
        }
        A04(r302);
        6cT r0 = super.A07;
        if (r0 == null || r0.ADd()) {
            return;
        }
        6Tu r02 = super.A08;
        A0j(null, r02 != null ? r02.B3e() : null);
    }

    public final void A0j(C52j c52j, 6UR r303) {
        boolean z;
        GraphQLVideoBroadcastStatus graphQLVideoBroadcastStatus;
        1Br.A0C(this.A0A);
        if (!((1vL) 1Br.A0B(this.A09)).A0M()) {
            if (r303 == null) {
                return;
            }
            int ordinal = this.A03.ordinal();
            if (ordinal == 0) {
                if (!r303.A00() && (r303 != 6UR.A06 || !this.A04)) {
                    if (r303 == 6UR.A09) {
                        PlayerOrigin playerOrigin = super.A03;
                        if (!11T.A0O(playerOrigin != null ? playerOrigin.A00 : null, PlayerOrigin.A08.A00) || this.A0O != 6TN.A0F) {
                            return;
                        }
                    } else {
                        1Br.A0C(this.A08);
                        GraphQLMedia graphQLMedia = this.A01;
                        if (graphQLMedia == null || !graphQLMedia.A0b(-1433294616) || ((graphQLVideoBroadcastStatus = this.A00) != GraphQLVideoBroadcastStatus.LIVE_STOPPED && graphQLVideoBroadcastStatus != GraphQLVideoBroadcastStatus.SEAL_STARTED && graphQLVideoBroadcastStatus != GraphQLVideoBroadcastStatus.VOD_READY)) {
                            A01();
                            5Kv r0 = this.A0C;
                            if (r0.A1g) {
                                z = r0.A1f;
                            } else {
                                z = 2yD.A04(r0.A3g, 36313261316184089L);
                                r0.A1f = z;
                                r0.A1g = true;
                            }
                            if (!z || ((r303 != 6UR.A01 && r303 != 6UR.A05) || c52j != C52j.A1n)) {
                                if (r303 != 6UR.A03 || !this.A05 || !r0.A08()) {
                                    A05(this, 0);
                                    return;
                                }
                            }
                        }
                    }
                }
                A05(this, 4);
                return;
            }
            if (ordinal != 1) {
                return;
            }
        }
        A05(this, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r304 == null) goto L6;
     */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CgE(X.6TX r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            super.CgE(r1)
            java.lang.String r0 = "SinglePlayIconPlugin"
            r303 = r0
            r0 = r301
            X.QoR r0 = r0.A03
            java.lang.String r0 = r0.name()
            r304 = r0
            r0 = r302
            r1 = r303
            java.lang.String r2 = "PlayIconState"
            r3 = r304
            r0.A04(r1, r2, r3)
            r0 = r301
            X.6UR r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L33
            r0 = r305
            java.lang.String r0 = r0.toString()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L37
        L33:
            java.lang.String r0 = ""
            r304 = r0
        L37:
            r0 = r302
            r1 = r303
            java.lang.String r2 = "LastPlaybackState"
            r3 = r304
            r0.A04(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H31.CgE(X.6TX):void");
    }
}
