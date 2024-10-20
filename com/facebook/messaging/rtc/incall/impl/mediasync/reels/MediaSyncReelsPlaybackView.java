package com.facebook.messaging.rtc.incall.impl.mediasync.reels;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1GU;
import X.7zL;
import X.7zQ;
import X.ACA;
import X.AX1;
import X.C00m;
import X.C09s;
import X.C2hw;
import X.GVb;
import X.JPF;
import X.Kuo;
import X.Q2U;
import X.QOI;
import X.R04;
import X.RlA;
import X.S8L;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncReelsPlaybackView.class */
public final class MediaSyncReelsPlaybackView extends GVb implements AX1, JPF {
    public 1GU A00;
    public QOI A01;
    public ReboundViewPager A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsPlaybackView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsPlaybackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsPlaybackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
    }

    public /* synthetic */ MediaSyncReelsPlaybackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public int A05() {
        ReboundViewPager reboundViewPager = this.A02;
        if (reboundViewPager != null) {
            return reboundViewPager.A0F();
        }
        11T.A0L("viewPager");
        throw 0Q8.createAndThrow();
    }

    public View A06() {
        ReboundViewPager reboundViewPager = this.A02;
        if (reboundViewPager != null) {
            return reboundViewPager;
        }
        11T.A0L("viewPager");
        throw 0Q8.createAndThrow();
    }

    public void A07() {
        QOI qoi = this.A01;
        if (qoi != null) {
            qoi.A01();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.R04] */
    public void A08() {
        Context context = getContext();
        LayoutInflater.from(context).inflate(2132542517, (ViewGroup) this);
        this.A00 = 7zQ.A0Q();
        ReboundViewPager reboundViewPager = (ReboundViewPager) C09s.A01(this, 2131363449);
        this.A02 = reboundViewPager;
        String str = "viewPager";
        if (reboundViewPager != null) {
            reboundViewPager.A0G = 0S2.A01;
            reboundViewPager.A0O = true;
            reboundViewPager.A0M(new ACA(this));
            ?? obj = new Object();
            1GU r0 = this.A00;
            if (r0 == null) {
                str = "androidThreadUtil";
            } else {
                QOI qoi = new QOI(r0, 7zL.A0W(context), (R04) obj, this);
                this.A01 = qoi;
                ReboundViewPager reboundViewPager2 = this.A02;
                if (reboundViewPager2 != null) {
                    qoi.A03(reboundViewPager2, 0);
                    ReboundViewPager reboundViewPager3 = this.A02;
                    if (reboundViewPager3 != null) {
                        ((Kuo) reboundViewPager3.A0p.getValue()).A06 = true;
                        return;
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A0B(int i, boolean z) {
        ReboundViewPager reboundViewPager = this.A02;
        if (reboundViewPager == null) {
            11T.A0L("viewPager");
            throw 0Q8.createAndThrow();
        }
        ReboundViewPager.A08(reboundViewPager, 0.0d, i, true);
    }

    public void A0C(List list, C00m c00m) {
        11T.A0F(list, 0);
        QOI qoi = this.A01;
        if (qoi != null && !list.equals(qoi.A00)) {
            C2hw.A00(new Q2U(qoi.A00, list), true).A01(new RlA(qoi, list));
            qoi.A00 = list;
        }
        ReboundViewPager reboundViewPager = this.A02;
        if (reboundViewPager == null) {
            11T.A0L("viewPager");
            throw 0Q8.createAndThrow();
        }
        reboundViewPager.post(new S8L(c00m));
    }
}
