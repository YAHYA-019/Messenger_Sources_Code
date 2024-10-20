package com.facebook.video.plugins.subtitle;

import X.0BR;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Ql;
import X.3Eh;
import X.6TI;
import X.6TN;
import X.6U2;
import X.6UT;
import X.6cT;
import X.AbG;
import X.AbL;
import X.C00i;
import X.C03713yu;
import X.C09s;
import X.C6d5;
import X.C6d6;
import X.C6do;
import X.C6dp;
import X.DKF;
import X.DKG;
import X.ERC;
import X.ERE;
import X.Fcg;
import X.GPl;
import X.GRX;
import X.HHR;
import X.Hgo;
import X.Hog;
import X.HyJ;
import X.I6H;
import X.I7Q;
import X.IK2;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.graphql.model.GraphQLStory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SubtitleButtonPlugin.class */
public final class SubtitleButtonPlugin extends C6d5 {
    public C03713yu A00;
    public GraphQLMedia A01;
    public boolean A02;
    public final GlyphView A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubtitleButtonPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubtitleButtonPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubtitleButtonPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = 1Bq.A00(66167);
        this.A0A = 1Bu.A00(115819);
        this.A04 = AbG.A0M();
        this.A06 = 1Bu.A00(115818);
        this.A07 = 1Bu.A00(115821);
        this.A09 = 1Bq.A00(67461);
        this.A05 = 1Bq.A00(99773);
        A0C(2132543407);
        String A0u = 1BK.A0u(context, 2131966497);
        GlyphView glyphView = (GlyphView) C09s.A01(this, 2131367729);
        this.A03 = glyphView;
        A02(this, false);
        glyphView.setContentDescription(A0u);
        GPl.A02(this, ActionId.CONTROLLER_INITIATED);
        A0h(GPl.A00(this, ActionId.RTMP_STREAM_PREPARED), GPl.A00(this, ActionId.TIMEOUT));
    }

    public /* synthetic */ SubtitleButtonPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final void A00(SubtitleButtonPlugin subtitleButtonPlugin) {
        1Br.A04(subtitleButtonPlugin.A04).D0u(new 0BR(0BR.A01("SubtitleButtonPlugin", "richVideoPlayerEventBus is null")));
    }

    public static final void A01(SubtitleButtonPlugin subtitleButtonPlugin, Hgo hgo) {
        6U2 r0 = ((C6d6) subtitleButtonPlugin).A06;
        if (r0 == null) {
            A00(subtitleButtonPlugin);
            return;
        }
        1Ql A08 = 1Br.A08(((I7Q) 1Br.A0B(subtitleButtonPlugin.A06)).A01);
        A08.CaE(I7Q.A05, 2131957380);
        A08.commit();
        r0.A06(new C6dp(true));
        if (hgo != null) {
            r0.A06(new C6do(hgo));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(SubtitleButtonPlugin subtitleButtonPlugin, boolean z) {
        3Eh r308;
        ERE ere;
        if (!AbL.A1H(((HyJ) 1Br.A0B(subtitleButtonPlugin.A09)).A00)) {
            GlyphView glyphView = subtitleButtonPlugin.A03;
            int i = 2132345281;
            if (z) {
                i = 2132345279;
            }
            glyphView.setImageResource(i);
            return;
        }
        GlyphView glyphView2 = subtitleButtonPlugin.A03;
        Fcg fcg = (Fcg) 1Br.A0B(subtitleButtonPlugin.A05);
        Context context = subtitleButtonPlugin.getContext();
        if (z) {
            r308 = 3Eh.A5P;
            ere = ERE.A01;
        } else {
            r308 = 3Eh.A5Q;
            ere = ERE.A02;
        }
        glyphView2.setImageDrawable(fcg.A06(context, r308, ERC.A05, ere));
    }

    @Override // X.C6d6
    public String A0H() {
        return "SubtitleButtonPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        C03713yu c03713yu = this.A00;
        if (c03713yu != null) {
            c03713yu.cancel(false);
            this.A00 = null;
        }
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        String A0Z;
        6TN B3f;
        11T.A0F(r302, 0);
        6UT r0 = (6UT) r302.A02("GraphQLStoryProps");
        GraphQLMedia A00 = HHR.A00(r0 != null ? (GraphQLStory) r0.A00 : null);
        this.A01 = A00;
        if (A00 == null || (A0Z = A00.A0Z()) == null) {
            A0R();
            return;
        }
        if (I6H.A02(A00) || I6H.A01(A00)) {
            C00i c00i = this.A09.A00;
            if (AbL.A1H(((HyJ) c00i.get()).A00)) {
                if (z) {
                    this.A03.setVisibility(0);
                }
                Hog hog = (Hog) 1Br.A0B(this.A07);
                FbUserSession fbUserSession = r302.A01;
                boolean A002 = hog.A00(fbUserSession, A0Z);
                this.A02 = A002;
                A02(this, A002);
                GRX grx = super.A09;
                if (grx == null || super.A03 == null) {
                    6cT r02 = super.A07;
                    if (r02 == null) {
                        return;
                    } else {
                        B3f = r02.B3f();
                    }
                } else {
                    B3f = grx.A04();
                }
                if (B3f != null) {
                    GlyphView glyphView = this.A03;
                    11T.A09(fbUserSession);
                    IK2 ik2 = null;
                    if (A00.A0Z() != null) {
                        ik2 = new IK2(5, fbUserSession, A00, this, I6H.A00(A00));
                    }
                    glyphView.setOnClickListener(ik2);
                    if (this.A02 && AbL.A1H(((HyJ) c00i.get()).A00)) {
                        A01(this, null);
                        return;
                    }
                    return;
                }
                return;
            }
            c00i.get();
        }
        this.A03.setVisibility(8);
        this.A02 = false;
    }
}
