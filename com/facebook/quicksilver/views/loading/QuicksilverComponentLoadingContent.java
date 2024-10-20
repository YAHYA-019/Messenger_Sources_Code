package com.facebook.quicksilver.views.loading;

import X.1BV;
import X.1HH;
import X.1Iw;
import X.2OB;
import X.7zL;
import X.AbF;
import X.AbH;
import X.C00i;
import X.C09s;
import X.C0A2;
import X.C1rs;
import X.DKF;
import X.DKG;
import X.Efx;
import X.Er6;
import X.F6C;
import X.FA8;
import X.FAX;
import X.FXq;
import X.GJw;
import X.GKY;
import X.QEN;
import X.QKH;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.google.common.base.Platform;
import java.util.BitSet;

/* loaded from: QuicksilverComponentLoadingContent.class */
public class QuicksilverComponentLoadingContent extends RelativeLayout implements GKY {
    public FAX A00;
    public GJw A01;
    public FA8 A02;
    public String A03;
    public int A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public LithoView A08;
    public boolean A09;
    public boolean A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final View.OnClickListener A0D;
    public final View.OnClickListener A0E;
    public final 1Iw A0F;
    public final Efx A0G;

    public QuicksilverComponentLoadingContent(1Iw r302) {
        this(r302, (AttributeSet) null);
    }

    public QuicksilverComponentLoadingContent(1Iw r302, AttributeSet attributeSet) {
        super(r302.A0D, attributeSet);
        this.A0B = DKG.A0Q();
        this.A0C = AbH.A0D();
        this.A0D = FXq.A00(this, ActionId.RTMP_CONNECTION_FAILED);
        this.A0E = FXq.A00(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
        this.A0G = new Efx(this);
        this.A0F = r302;
        A00();
    }

    public QuicksilverComponentLoadingContent(Context context) {
        this(context, (AttributeSet) null);
    }

    public QuicksilverComponentLoadingContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = DKG.A0Q();
        this.A0C = AbH.A0D();
        this.A0D = FXq.A00(this, ActionId.RTMP_CONNECTION_FAILED);
        this.A0E = FXq.A00(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
        this.A0G = new Efx(this);
        this.A0F = 7zL.A0W(context);
        A00();
    }

    private void A00() {
        this.A07 = 1BV.A00(98401);
        Context context = getContext();
        1HH A0Q = AbF.A0Q(context, 82751);
        this.A05 = A0Q;
        this.A06 = AbF.A0Q(context, 98364);
        this.A00 = ((F6C) A0Q.get()).A00;
        View.inflate(context, 2132542075, this);
        this.A08 = (LithoView) C09s.A01(this, 2131367540);
        FA8 fa8 = new FA8(this);
        this.A02 = fa8;
        fa8.A00.setVisibility(8);
        reset();
    }

    private void A01() {
        Er6 er6 = this.A00.A03;
        if (er6 != null) {
            QKH qkh = null;
            if (A02()) {
                this.A03 = er6.A0e;
                C00i c00i = this.A07;
                c00i.getClass();
                c00i.get();
                1Iw r0 = this.A0F;
                String str = er6.A0l;
                String str2 = Platform.stringIsNullOrEmpty(this.A03) ? "" : er6.A0d;
                boolean z = this.A09;
                String str3 = er6.A0k;
                String string = getContext().getString(er6.A07);
                View.OnClickListener onClickListener = this.A0E;
                Efx efx = this.A0G;
                View.OnClickListener onClickListener2 = this.A0D;
                QEN qen = new QEN(r0, new QKH());
                qkh = qen.A01;
                qkh.A06 = str;
                BitSet bitSet = qen.A02;
                bitSet.set(7);
                if (str2 == null) {
                    str2 = "";
                }
                qkh.A04 = str2;
                bitSet.set(3);
                qkh.A07 = z;
                bitSet.set(4);
                qkh.A03 = str3;
                bitSet.set(0);
                qkh.A05 = string;
                bitSet.set(6);
                qkh.A01 = onClickListener;
                bitSet.set(5);
                qkh.A02 = efx;
                bitSet.set(1);
                qkh.A00 = onClickListener2;
                bitSet.set(2);
                C1rs.A05(bitSet, qen.A03, 8);
                qen.A0J();
            } else {
                this.A02.A02(this.A04);
                if (this.A04 == 100) {
                    this.A02.A01();
                }
            }
            LithoView lithoView = this.A08;
            if (qkh == null) {
                lithoView.setVisibility(8);
                this.A02.A00.setVisibility(0);
            } else {
                lithoView.A0x(qkh);
                this.A08.setVisibility(0);
                this.A02.A00.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r301.A0A != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A06
            java.lang.Object r0 = X.4YU.A0p(r0)
            X.F4Q r0 = (X.F4Q) r0
            X.FAX r0 = r0.A00
            r302 = r0
            r0 = r302
            X.Er6 r0 = r0.A03
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r303
            boolean r0 = r0.A10
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L46
            r0 = r303
            boolean r0 = r0.A0t
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
        L2c:
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L3e
            r0 = r301
            boolean r0 = r0.A0A
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L43
        L3e:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L43:
            r0 = r305
            return r0
        L46:
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A0N
            r302 = r0
            r0 = r302
            boolean r0 = X.09K.A00(r0)
            r305 = r0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quicksilver.views.loading.QuicksilverComponentLoadingContent.A02():boolean");
    }

    public View BJw() {
        return this;
    }

    public void BO9(boolean z) {
        this.A0A = true;
        A01();
    }

    public void BrM() {
    }

    public void C03() {
        Resources resources;
        Er6 er6 = this.A00.A03;
        if (er6 != null) {
            this.A02.A00();
            String str = er6.A0j;
            if (!Platform.stringIsNullOrEmpty(str)) {
                FA8 fa8 = this.A02;
                fa8.A03.A0G(C0A2.A03(str), FA8.A07);
            }
            FA8 fa82 = this.A02;
            fa82.A02.setText(er6.A0m);
            this.A02.A05.A04 = 100;
            boolean A07 = DKF.A0d(this.A0B).A07();
            2OB r0 = this.A02.A06;
            Context context = getContext();
            if (A07) {
                DKF.A11(context, r0, 2132214307);
                2OB r02 = this.A02.A06;
                resources = getResources();
                DKF.A17(resources, r02, 2132279460);
                DKF.A11(context, this.A02.A02, 2132214310);
            } else {
                DKF.A11(context, r0, 2132214302);
                2OB r03 = this.A02.A06;
                resources = getResources();
                DKF.A17(resources, r03, 2132279460);
                DKF.A11(context, this.A02.A02, 2132214309);
            }
            DKF.A17(resources, this.A02.A02, 2132279529);
        }
        A01();
    }

    public void C07() {
        this.A04 = 100;
        if (A02()) {
            return;
        }
        A01();
    }

    public void CmV(GJw gJw) {
        this.A01 = gJw;
    }

    public void CpD(boolean z) {
        this.A09 = z;
        A01();
    }

    public void Cqp(int i) {
        if (i > this.A04) {
            this.A04 = Math.min(Math.max(i, 0), 100);
            if (A02()) {
                return;
            }
            A01();
        }
    }

    public void Cr2(int i) {
    }

    public void CtT(boolean z, boolean z2) {
    }

    public void reset() {
        this.A04 = 0;
        this.A0A = false;
        this.A09 = true;
    }
}
