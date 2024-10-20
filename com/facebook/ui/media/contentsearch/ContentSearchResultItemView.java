package com.facebook.ui.media.contentsearch;

import X.0FI;
import X.11T;
import X.1Bn;
import X.2Wo;
import X.6cT;
import X.C00i;
import X.C1oo;
import X.C52j;
import X.C62j;
import X.C66h;
import X.C66i;
import X.GOq;
import X.H04;
import X.HY8;
import X.IKB;
import X.IKO;
import X.IKm;
import X.KnJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.litho.LithoView;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ContentSearchResultItemView.class */
public class ContentSearchResultItemView extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A0E = CallerContext.A06(ContentSearchResultItemView.class);
    public static final C66h A0F = new C66h(1000.0d, 50.0d);
    public static final C66h A0G = new C66h(120.0d, 10.0d);
    public View A00;
    public ImageView A01;
    public FbDraweeView A02;
    public LithoView A03;
    public HY8 A04;
    public RichVideoPlayer A05;
    public 2Wo A06;
    public boolean A07;
    public int A08;
    public ViewStub A09;
    public ImageView A0A;
    public C66i A0B;
    public C62j A0C;
    public final C00i A0D;

    public ContentSearchResultItemView(Context context) {
        super(context);
        this.A0D = 1Bn.A09(KnJ.class, (Class) null);
        this.A08 = 0;
        this.A07 = true;
        A00(context, null);
    }

    public ContentSearchResultItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0D = 1Bn.A09(KnJ.class, (Class) null);
        this.A08 = 0;
        this.A07 = true;
        A00(context, attributeSet);
    }

    public ContentSearchResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = 1Bn.A09(KnJ.class, (Class) null);
        this.A08 = 0;
        this.A07 = true;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A0C = (C62j) 1Bn.A0H(C62j.class, (Class) null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0Q);
            this.A08 = obtainStyledAttributes.getInt(1, 0);
            obtainStyledAttributes.recycle();
        }
        int i = 2132541765;
        if (this.A08 == 1) {
            i = 2132542060;
        }
        A0U(i);
        this.A02 = (FbDraweeView) requireViewById(2131363343);
        this.A05 = (RichVideoPlayer) requireViewById(2131366967);
        this.A03 = (LithoView) requireViewById(2131363339);
        this.A09 = (ViewStub) requireViewById(2131365370);
        C00i c00i = this.A0D;
        c00i.get();
        c00i.get();
        ViewStub viewStub = this.A09;
        11T.A0F(viewStub, 0);
        viewStub.setLayoutResource(2132542449);
        View inflate = viewStub.inflate();
        11T.A0A(inflate);
        ImageView imageView = (ImageView) inflate;
        this.A01 = imageView;
        imageView.getClass();
        imageView.setVisibility(8);
        this.A00 = requireViewById(2131368037);
        this.A06 = GOq.A0x(this, 2131363346);
        this.A0A = (ImageView) requireViewById(2131363344);
        C62j c62j = this.A0C;
        c62j.getClass();
        C66i c66i = new C66i(c62j);
        c66i.A09(A0F);
        c66i.A0A(new H04(this));
        this.A0B = c66i;
        setOnClickListener(new IKB(this, 63));
        setOnLongClickListener(new IKO(this, 7));
        setOnTouchListener(new IKm(this, 14));
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        6cT r0;
        int A06 = 0FI.A06(221567757);
        if (i == 0 && (r0 = this.A05) != null && r0.getVisibility() == 0) {
            RichVideoPlayer richVideoPlayer = this.A05;
            if (richVideoPlayer.A0F != null) {
                richVideoPlayer.CXU(C52j.A09);
            }
        }
        0FI.A0C(1751075049, A06);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A07) {
            C66i c66i = this.A0B;
            if (z) {
                c66i.A09(A0F);
                d = 1.0d;
            } else {
                c66i.A09(A0G);
                d = 0.0d;
            }
            c66i.A07(d);
        }
    }
}
