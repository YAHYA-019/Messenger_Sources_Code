package com.facebook.messaging.rtc.incall.impl.mediasync.autoplay;

import X.0FI;
import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.4zI;
import X.7zM;
import X.7zP;
import X.C09s;
import X.C0A2;
import X.C1u3;
import X.C2cd;
import X.DKF;
import X.DKG;
import X.Gqz;
import X.HVN;
import X.IDw;
import X.IKB;
import X.IZu;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.CountdownRingContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncAutoPlayView.class */
public final class MediaSyncAutoPlayView extends ConstraintLayout implements JFq, CallerContextable {
    public static final CallerContext A08 = CallerContext.A06(MediaSyncAutoPlayView.class);
    public Gqz A00;
    public boolean A01;
    public final View A02;
    public final ImageView A03;
    public final FbDraweeView A04;
    public final 1Br A05;
    public final 1Br A06;
    public final CountdownRingContainer A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncAutoPlayView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncAutoPlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public MediaSyncAutoPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A06 = 7zM.A0U();
        this.A05 = 1Bu.A00(114787);
        1Bn.A0A(147730);
        FbUserSession A01 = IDw.A01(this, "MediaSyncAutoPlayView");
        Context context2 = getContext();
        this.A00 = new Gqz(A01, context2);
        LayoutInflater.from(context2).inflate(2132542509, this);
        ?? r0 = (FbDraweeView) C09s.A01(this, 2131362292);
        this.A04 = r0;
        CountdownRingContainer countdownRingContainer = (CountdownRingContainer) C09s.A01(this, 2131362295);
        this.A07 = countdownRingContainer;
        ImageView imageView = (ImageView) C09s.A01(this, 2131362294);
        this.A03 = imageView;
        View A012 = C09s.A01(this, 2131362293);
        this.A02 = A012;
        r0.setBackgroundColor(201326592);
        setBackgroundColor(-13421772);
        View view = this.A02;
        Resources resources = getResources();
        C2cd.A06(view, resources.getString(2131959305));
        C2cd.A06(this.A03, resources.getString(2131959306));
        IKB.A00(countdownRingContainer, this, 10);
        countdownRingContainer.A0B = new HVN(this);
        IKB.A00(A012, this, 11);
        IKB.A00((View) r0, this, 12);
        imageView.setImageDrawable(7zP.A0S(this.A06).A07(C1u3.A51));
    }

    public /* synthetic */ MediaSyncAutoPlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (X.1Br.A06(r0.A00).AZk(36314390871613353L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00() {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = X.4YU.A08(r0)
            r302 = r0
            r0 = 67593(0x10809, float:9.4718E-41)
            r303 = r0
            r0 = r302
            r1 = 0
            r2 = r303
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            X.ICR r0 = (X.ICR) r0
            r304 = r0
            r0 = r301
            X.1Br r0 = r0.A05
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Hnh r0 = (X.Hnh) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.A00()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L4c
            r0 = r304
            X.1Br r0 = r0.A00
            r305 = r0
            r0 = r305
            X.1CO r0 = X.1Br.A06(r0)
            r302 = r0
            r0 = 36314390871613353(0x8103bf00231fa9, double:3.028705241298828E-306)
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r303 = r0
            r0 = 8
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L52
        L4c:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L52:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.mediasync.autoplay.MediaSyncAutoPlayView.A00():int");
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZu iZu = (IZu) jdb;
        11T.A0F(iZu, 0);
        this.A01 = iZu.A04;
        View view = this.A02;
        view.setVisibility(A00());
        if (!iZu.A03) {
            this.A07.setVisibility(8);
            this.A04.A0G(null, A08);
            return;
        }
        CountdownRingContainer countdownRingContainer = this.A07;
        countdownRingContainer.setVisibility(0);
        boolean z = this.A01;
        int i = 8;
        view.setVisibility(z ? 8 : A00());
        ImageView imageView = this.A03;
        if (!z) {
            i = 0;
        }
        imageView.setVisibility(i);
        String str = iZu.A01;
        if (str != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
            try {
                this.A04.A0G(uri, A08);
            } catch (SecurityException e) {
                4zI.A03.A02("MediaSyncAutoPlayView", "Error parsing url", e, new Object[0]);
            }
        }
        if (iZu.A02) {
            countdownRingContainer.A01();
        }
        countdownRingContainer.A04 = iZu.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2024085090);
        super.onAttachedToWindow();
        Gqz gqz = this.A00;
        11T.A0D(gqz);
        gqz.A0Y(this);
        0FI.A0C(-1840284481, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-2125900488);
        super.onDetachedFromWindow();
        Gqz gqz = this.A00;
        11T.A0D(gqz);
        gqz.A0X();
        0FI.A0C(-1913988947, A06);
    }
}
