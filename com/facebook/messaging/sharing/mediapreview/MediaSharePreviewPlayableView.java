package com.facebook.messaging.sharing.mediapreview;

import X.1BQ;
import X.1Bi;
import X.2eS;
import X.5HP;
import X.5HV;
import X.AbH;
import X.C00i;
import X.C1oo;
import X.C81c;
import X.GOn;
import X.GOp;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.video.player.FbVideoView;
import com.facebook.widget.CustomFrameLayout;
import java.util.concurrent.ExecutorService;

/* loaded from: MediaSharePreviewPlayableView.class */
public class MediaSharePreviewPlayableView extends CustomFrameLayout implements CallerContextable {
    public ImageView A00;
    public TextView A01;
    public 2eS A02;
    public FbDraweeView A03;
    public C00i A04;
    public 5HP A05;
    public FbVideoView A06;
    public ExecutorService A07;
    public boolean A08;
    public final C00i A09;
    public final 5HV A0A;
    public final C81c A0B;

    public MediaSharePreviewPlayableView(Context context) {
        super(context);
        this.A09 = 1BQ.A01();
        this.A0A = GOp.A0z();
        this.A0B = (C81c) 1Bi.A03(66777);
        A00(null);
    }

    public MediaSharePreviewPlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = 1BQ.A01();
        this.A0A = GOp.A0z();
        this.A0B = (C81c) 1Bi.A03(66777);
        A00(attributeSet);
    }

    public MediaSharePreviewPlayableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = 1BQ.A01();
        this.A0A = GOp.A0z();
        this.A0B = (C81c) 1Bi.A03(66777);
        A00(attributeSet);
    }

    private void A00(AttributeSet attributeSet) {
        this.A04 = AbH.A0E();
        this.A07 = (ExecutorService) GOn.A16();
        if (attributeSet != null) {
            getContext().obtainStyledAttributes(attributeSet, C1oo.A1v).recycle();
        }
    }
}
