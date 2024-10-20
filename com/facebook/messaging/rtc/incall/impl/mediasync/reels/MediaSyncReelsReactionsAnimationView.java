package com.facebook.messaging.rtc.incall.impl.mediasync.reels;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2Dp;
import X.2EU;
import X.2IA;
import X.2rA;
import X.7zM;
import X.AKW;
import X.AbI;
import X.C01g;
import X.C01i;
import X.C03183xW;
import X.C0A2;
import X.C22a;
import X.C2638Gjs;
import X.C2r9;
import X.C6ka;
import X.DKF;
import X.DKG;
import X.IUY;
import X.J9t;
import X.JDB;
import X.JFq;
import X.JIJ;
import X.JIg;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.common.bitmaps.BitmapUtil;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncReelsReactionsAnimationView.class */
public final class MediaSyncReelsReactionsAnimationView extends View implements JFq, CallerContextable {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Map A03;
    public final C01i A04;
    public final C01i A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsReactionsAnimationView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsReactionsAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSyncReelsReactionsAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A05 = C01g.A01(new AKW(context, this, 4));
        this.A02 = 7zM.A0X();
        this.A00 = 1Bu.A00(115986);
        this.A01 = 1Bu.A01(context, 67593);
        this.A03 = 1BK.A1C();
        this.A04 = J9t.A01(this, 9);
    }

    public /* synthetic */ MediaSyncReelsReactionsAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        C2638Gjs c2638Gjs = (C2638Gjs) jdb;
        11T.A0F(c2638Gjs, 0);
        String str = c2638Gjs.A00.emojiId;
        11T.A09(str);
        String str2 = c2638Gjs.A01;
        if (getVisibility() == 0) {
            C22a c22a = (C22a) 1Br.A0B(this.A02);
            Resources resources = getResources();
            C6ka AjQ = c22a.AjQ(str, resources.getDimensionPixelSize(2132279326));
            Map map = this.A03;
            Bitmap bitmap = null;
            if (map.containsKey(str2)) {
                2EU r0 = (2EU) map.get(str2);
                if (r0 != null) {
                    bitmap = (Bitmap) r0.A09();
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
                JIg jIg = (JIg) this.A04.getValue();
                if (jIg != null) {
                    jIg.D1S(AjQ, bitmapDrawable);
                    return;
                }
                return;
            }
            JIJ iuy = new IUY(AjQ, this, str2);
            2rA r02 = new 2rA();
            r02.A05 = new C03183xW(false, false);
            C2r9 c2r9 = new C2r9(r02);
            Uri uri = null;
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            2IA A01 = 2IA.A01(uri);
            A01.A04 = c2r9;
            2Dp A04 = A01.A04();
            BitmapUtil bitmapUtil = (BitmapUtil) 1Br.A0B(this.A00);
            11T.A0D(A04);
            bitmapUtil.A08(CallerContext.A06(getClass()), A04, iuy);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-75566643);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A05);
        0FI.A0C(-2088060500, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(488630808);
        Map map = this.A03;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((2EU) A1A.next()).close();
        }
        map.clear();
        AbI.A1X(this.A05);
        super.onDetachedFromWindow();
        0FI.A0C(1696264330, A06);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        JIg jIg = (JIg) this.A04.getValue();
        if (jIg != null) {
            jIg.AOd(canvas);
        }
    }
}
