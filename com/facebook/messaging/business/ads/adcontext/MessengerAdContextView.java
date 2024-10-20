package com.facebook.messaging.business.ads.adcontext;

import X.2XA;
import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.hscrollrecyclerview.HScrollRecyclerView;
import com.facebook.widget.snaprecyclerview.SnapLinearLayoutManager;
import com.facebook.widget.text.BetterTextView;

/* loaded from: MessengerAdContextView.class */
public class MessengerAdContextView extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A06(MessengerAdContextView.class);
    public FbDraweeView A00;
    public MessengerAdsContextExtensionInputParams A01;
    public HScrollRecyclerView A02;
    public BetterTextView A03;
    public BetterTextView A04;
    public BetterTextView A05;

    public MessengerAdContextView(Context context) {
        this(context, null, 0);
    }

    public MessengerAdContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessengerAdContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0D(2132541497);
        setOrientation(1);
        setGravity(1);
        this.A05 = (BetterTextView) C09s.A01(this, 2131361927);
        this.A03 = (BetterTextView) C09s.A01(this, 2131361925);
        this.A00 = (FbDraweeView) C09s.A01(this, 2131361924);
        this.A04 = (BetterTextView) C09s.A01(this, 2131361926);
        this.A02 = (HScrollRecyclerView) C09s.A01(this, 2131361920);
        2XA snapLinearLayoutManager = new SnapLinearLayoutManager(context);
        snapLinearLayoutManager.A0f();
        this.A02.A1D(snapLinearLayoutManager);
    }
}
