package com.facebook.messaging.montage.composer.mention;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Fj;
import X.1Fw;
import X.1Iw;
import X.2kW;
import X.4YU;
import X.7zL;
import X.AbR;
import X.AnonymousClass001;
import X.B7v;
import X.B7x;
import X.Bf0;
import X.C00i;
import X.C09s;
import X.C13;
import X.C1320Ady;
import X.C2kV;
import X.C2kf;
import X.C2ki;
import X.C6o;
import X.CIo;
import X.CqM;
import X.D1a;
import X.DLP;
import X.FYT;
import X.HyP;
import X.QOQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbSwitch;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;

/* loaded from: MentionSuggestionView.class */
public final class MentionSuggestionView extends CustomLinearLayout {
    public static final C2kf A0A;
    public int A00;
    public View A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public Bf0 A05;
    public C1320Ady A06;
    public FbSwitch A07;
    public DLP A08;
    public LithoView A09;

    static {
        2kW r0 = new 2kW();
        r0.A01 = 0;
        A0A = r0.A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionSuggestionView(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00();
    }

    private final void A00() {
        String str;
        Context A08 = 4YU.A08(this);
        this.A02 = 1Bu.A01(A08, 474);
        this.A03 = 1Bu.A00(85197);
        this.A04 = 1Bu.A00(148085);
        A0D(2132542668);
        this.A09 = (LithoView) C09s.A01(this, 2131365595);
        this.A01 = C09s.A01(this, 2131365592);
        this.A07 = (FbSwitch) C09s.A01(this, 2131365589);
        DLP dlp = new DLP(this);
        this.A08 = dlp;
        dlp.A02(new D1a(this));
        FbUserSession A06 = 1Fw.A06(1Bn.A0E(A08, (1BY) null, 16428));
        ImmutableList.Builder builder = ImmutableList.builder();
        C00i c00i = this.A02;
        if (c00i == null) {
            str = "contactsDataSourceProvider";
        } else {
            builder.m11011add((Object) ((AbR) c00i.get()).A0q(A06, new C6o(false)));
            ImmutableList A01 = 1Fj.A01(builder);
            CqM b7x = new B7x(0);
            B7v b7v = new B7v(this, 2);
            FbUserSession A062 = 1Fw.A06(1Bn.A0E(A08, (1BY) null, 16428));
            1Bn.A0A(83179);
            CIo cIo = new CIo(b7x, "composer_mention_suggestion");
            cIo.A01(b7v);
            cIo.A02(A01);
            this.A06 = new C1320Ady(A08, A062, cIo);
            A01(this, 1BK.A0b());
            View view = this.A01;
            if (view == null || this.A07 == null) {
                return;
            }
            boolean z = false;
            view.setVisibility(0);
            C00i c00i2 = this.A03;
            str = "mentionReshareSettingHelper";
            if (c00i2 != null) {
                String BD0 = 1Br.A09(((C13) c00i2.get()).A00).BD0(HyP.A0H);
                if (BD0 == null) {
                    BD0 = "ALLOW";
                }
                boolean equals = "ALLOW".equals(BD0);
                boolean equals2 = "NONE".equals(BD0);
                FbSwitch fbSwitch = this.A07;
                if (fbSwitch == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                if (equals || equals2) {
                    z = true;
                }
                fbSwitch.setChecked(z);
                if (equals2) {
                    C00i c00i3 = this.A03;
                    if (c00i3 != null) {
                        ((C13) c00i3.get()).A00(true);
                        C00i c00i4 = this.A04;
                        if (c00i4 == null) {
                            str = "montagePreferenceChangeLogger";
                        } else {
                            c00i4.get();
                        }
                    }
                }
                FbSwitch fbSwitch2 = this.A07;
                if (fbSwitch2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                fbSwitch2.setOnCheckedChangeListener(new FYT(this, 2));
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A01(MentionSuggestionView mentionSuggestionView, ImmutableList immutableList) {
        LithoView lithoView = mentionSuggestionView.A09;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            C2ki A00 = C2kV.A00(r0);
            A00.A2f(A0A);
            11T.A0D(r0);
            7zL.A1K(r0);
            QOQ qoq = new QOQ();
            qoq.A01 = immutableList;
            qoq.A00 = mentionSuggestionView.A05;
            A00.A2d(qoq);
            A00.A0e();
            A00.A0l(96.0f);
            lithoView.A0y(A00.A2W());
        }
    }
}
