package com.facebook.messaging.business.attachments.generic.views;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.2Wo;
import X.AbG;
import X.AnonymousClass001;
import X.BMF;
import X.C09s;
import X.DKC;
import X.F6F;
import X.FXr;
import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.graphql.enums.GraphQLMessengerPlatformWebviewPerformanceOption;
import com.facebook.messaging.business.attachments.generic.model.LogoImage;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.facebook.messaging.business.common.calltoaction.CallToActionContainerView;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.widget.text.BetterTextView;
import java.util.List;

/* loaded from: PlatformGenericAttachmentItemView.class */
public final class PlatformGenericAttachmentItemView extends XMALinearLayout implements CallerContextable {
    public static final CallerContext A0G = CallerContext.A06(PlatformGenericAttachmentItemView.class);
    public LogoImage A00;
    public PlatformGenericAttachmentItem A01;
    public String A02;
    public List A03;
    public final View A04;
    public final FbDraweeView A05;
    public final FbDraweeView A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 2Wo A09;
    public final BetterTextView A0A;
    public final BetterTextView A0B;
    public final BetterTextView A0C;
    public final BetterTextView A0D;
    public final BetterTextView A0E;
    public final LinearLayout A0F;

    public PlatformGenericAttachmentItemView(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlatformGenericAttachmentItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        if (context == null) {
            throw 1BK.A0h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformGenericAttachmentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = 1Bq.A00(100034);
        this.A07 = AbG.A0M();
        A0D(2132542951);
        setOrientation(1);
        this.A05 = DKC.A0M(this, 2131366565);
        this.A04 = C09s.A01(this, 2131366560);
        this.A06 = DKC.A0M(this, 2131366564);
        this.A0F = (LinearLayout) C09s.A01(this, 2131366558);
        this.A0E = DKC.A0g(this, 2131366567);
        this.A0A = DKC.A0g(this, 2131366561);
        this.A0B = DKC.A0g(this, 2131366562);
        this.A0C = DKC.A0g(this, 2131366563);
        this.A0D = DKC.A0g(this, 2131366559);
        View A01 = C09s.A01(this, 2131366557);
        11T.A0I(A01, 1BJ.A00(14));
        this.A09 = 2Wo.A00((ViewStub) A01);
        setOnClickListener(FXr.A02(this, 65));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(BetterTextView betterTextView, String str) {
        if (str == null || str.length() == 0) {
            betterTextView.setVisibility(8);
        } else {
            betterTextView.setVisibility(0);
            betterTextView.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public final void A0G(LogoImage logoImage, PlatformGenericAttachmentItem platformGenericAttachmentItem, List list) {
        int i;
        Uri uri;
        Uri uri2;
        this.A01 = platformGenericAttachmentItem;
        if (list == null || !1BK.A1Y(list)) {
            list = platformGenericAttachmentItem != null ? platformGenericAttachmentItem.A06 : null;
        }
        this.A03 = list;
        this.A00 = logoImage;
        PlatformGenericAttachmentItem platformGenericAttachmentItem2 = this.A01;
        if (platformGenericAttachmentItem2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Uri uri3 = platformGenericAttachmentItem2.A03;
        ?? r0 = this.A05;
        if (uri3 != null) {
            r0.setVisibility(0);
            r0.setBackgroundResource(2132213760);
            r0.A0G(platformGenericAttachmentItem2.A03, A0G);
            this.A04.setVisibility(0);
            float f = platformGenericAttachmentItem2.A00;
            if (f == 0.0f) {
                f = 1.91f;
            }
            r0.A04(f);
        } else {
            r0.setVisibility(8);
            this.A04.setVisibility(8);
        }
        ?? r02 = this.A06;
        LogoImage logoImage2 = this.A00;
        CallerContext callerContext = A0G;
        11T.A0B(callerContext);
        if (logoImage2 == null || (uri2 = logoImage2.A02) == null) {
            i = 8;
        } else {
            r02.A0G(uri2, callerContext);
            i = 0;
        }
        r02.setVisibility(i);
        A00(this.A0E, platformGenericAttachmentItem2.A0F);
        A00(this.A0A, platformGenericAttachmentItem2.A0B);
        A00(this.A0B, platformGenericAttachmentItem2.A0C);
        A00(this.A0C, platformGenericAttachmentItem2.A0D);
        BetterTextView betterTextView = this.A0D;
        String str = platformGenericAttachmentItem2.A0E;
        if (TextUtils.isEmpty(str)) {
            CallToAction callToAction = platformGenericAttachmentItem2.A05;
            str = (callToAction == null || (uri = callToAction.A00) == null || callToAction.A01 != null) ? null : uri.getHost();
        }
        A00(betterTextView, str);
        List list2 = this.A03;
        if (list2 == null || !1BK.A1Y(list2)) {
            this.A09.A02();
        } else {
            2Wo r03 = this.A09;
            CallToActionContainerView callToActionContainerView = (CallToActionContainerView) r03.A01();
            List list3 = this.A03;
            11T.A0I(list3, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.messaging.business.common.calltoaction.model.CallToAction>");
            String str2 = platformGenericAttachmentItem2.A0A;
            11T.A09(str2);
            BMF bmf = BMF.A0N;
            String str3 = platformGenericAttachmentItem2.A08;
            if (str3 == null) {
                str3 = this.A02;
            }
            11T.A0F(list3, 0);
            callToActionContainerView.A03 = str3;
            callToActionContainerView.A0G(bmf, str2, list3);
            r03.A03();
        }
        if (platformGenericAttachmentItem2.A04 == GraphQLMessengerPlatformWebviewPerformanceOption.WARMUP) {
            if (SystemClock.uptimeMillis() - ((F6F) 1Br.A0B(this.A08)).A00 > 3000 && getContext() == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            1Br.A04(this.A07).D0v("PlatformGenericAttachmentItemView", e.toString());
        }
    }
}
