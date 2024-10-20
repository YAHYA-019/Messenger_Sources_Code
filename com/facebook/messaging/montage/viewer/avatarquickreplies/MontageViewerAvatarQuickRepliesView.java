package com.facebook.messaging.montage.viewer.avatarquickreplies;

import X.0QD;
import X.11T;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zQ;
import X.8fJ;
import X.9kF;
import X.AP3;
import X.AVB;
import X.C0ty;
import X.C9Js;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.widget.text.BetterTextView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MontageViewerAvatarQuickRepliesView.class */
public final class MontageViewerAvatarQuickRepliesView extends FbFrameLayout {
    public C9Js A00;
    public final 1Br A01;
    public final BetterTextView A02;
    public final Function1 A03;
    public final LithoView A04;
    public final LithoView A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerAvatarQuickRepliesView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerAvatarQuickRepliesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView, android.view.View] */
    public MontageViewerAvatarQuickRepliesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A01 = 1Bu.A01(context, 16980);
        this.A03 = AVB.A01(this, 20);
        View.inflate(context, 2132542729, this);
        TextView textView = (TextView) findViewById(2131362321);
        this.A04 = (LithoView) 7zM.A0H(this, 2131362322);
        this.A05 = (LithoView) 7zM.A0H(this, 2131362323);
        ?? r0 = (BetterTextView) 7zM.A0H(this, 2131362324);
        this.A02 = r0;
        textView.setTextColor(7zQ.A0m(this.A01).BKh());
        A00(C0ty.A00);
        r0.setTextColor(7zQ.A0m(this.A01).BKf());
        int BKh = 7zQ.A0m(this.A01).BKh();
        AP3 ap3 = AP3.A00;
        11T.A0F(ap3, 4);
        r0.setClickable(true);
        r0.setMovementMethod(LinkMovementMethod.getInstance());
        r0.setText(9kF.A00(context, "mux_label_automigration_stories", ap3, BKh));
    }

    public /* synthetic */ MontageViewerAvatarQuickRepliesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void A00(List list) {
        Function1 function1;
        LithoView lithoView;
        List subList;
        LithoView lithoView2;
        8fJ r308;
        11T.A0F(list, 0);
        List A0Y = 0QD.A0Y(list, 6);
        if (A0Y.isEmpty()) {
            lithoView2 = this.A04;
            C0ty c0ty = C0ty.A00;
            function1 = this.A03;
            r308 = new 8fJ(c0ty, function1);
        } else {
            if (A0Y.size() > 2) {
                int size = A0Y.size() / 2;
                LithoView lithoView3 = this.A04;
                List subList2 = A0Y.subList(0, size);
                function1 = this.A03;
                lithoView3.A0y(new 8fJ(subList2, function1));
                lithoView = this.A05;
                subList = A0Y.subList(size, A0Y.size());
                lithoView.A0y(new 8fJ(subList, function1));
            }
            lithoView2 = this.A04;
            function1 = this.A03;
            r308 = new 8fJ(A0Y, function1);
        }
        lithoView2.A0y(r308);
        lithoView = this.A05;
        subList = C0ty.A00;
        lithoView.A0y(new 8fJ(subList, function1));
    }
}
