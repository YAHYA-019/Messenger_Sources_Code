package com.facebook.messaging.rtc.incall.impl.mediasync.seekbarview;

import X.0FI;
import X.0KF;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.6TI;
import X.6TJ;
import X.6U2;
import X.6cT;
import X.6dM;
import X.7zL;
import X.AnonymousClass001;
import X.C00i;
import X.C09s;
import X.C0Ad;
import X.C6ce;
import X.DKD;
import X.DKF;
import X.DKG;
import X.GPl;
import X.GRX;
import X.GS2;
import X.GTF;
import X.GVi;
import X.GeJ;
import X.Gq3;
import X.GrE;
import X.HDb;
import X.HgM;
import X.I9A;
import X.IUl;
import X.JPG;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.video.player.RichVideoPlayer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncSeekBarView.class */
public final class MediaSyncSeekBarView extends FbLinearLayout implements JPG {
    public 6U2 A00;
    public 6cT A01;
    public C6ce A02;
    public GRX A03;
    public String A04;
    public final SeekBar A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final GTF A09;
    public final FbTextView A0A;
    public final List A0B;
    public final boolean A0C;
    public final HDb A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncSeekBarView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.widget.TextView, android.view.View, com.facebook.resources.ui.FbTextView] */
    public MediaSyncSeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = 1Bu.A01(context, 114935);
        this.A07 = 1Bu.A01(context, 115808);
        this.A06 = 1Bq.A00(115795);
        GTF gtf = new GTF();
        this.A09 = gtf;
        this.A0B = AnonymousClass001.A0s();
        this.A0D = new Gq3(this);
        DKD.A0A(this).inflate(2132542519, this);
        gtf.A00 = 7zL.A14(this);
        ?? r0 = (FbTextView) C09s.A01(this, 2131363845);
        this.A0A = r0;
        if (r0 != 0) {
            r0.setMinWidth(5);
        }
        boolean z = true;
        r0.setFocusable(true);
        SeekBar seekBar = (SeekBar) C09s.A01(this, 2131367249);
        this.A05 = seekBar;
        6TJ[] r02 = {GPl.A00(this, 46), GPl.A00(this, 45), GPl.A00(this, 44)};
        int i2 = 0;
        do {
            6TJ r03 = r02[i2];
            if (r03 != null) {
                this.A0B.add(r03);
            }
            i2++;
        } while (i2 < 3);
        seekBar.setOnSeekBarChangeListener(((GrE) 1Br.A0B(this.A08)).A02);
        C0Ad.A0B(this, new GVi(this, 1));
        this.A0C = getVisibility() != 0 ? false : z;
    }

    public /* synthetic */ MediaSyncSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final String A00(Resources resources, long j) {
        int i;
        Object[] A1b;
        long A00 = 0KF.A00(j / 1000.0d);
        int i2 = (int) (A00 / 3600);
        long j2 = A00 % 3600;
        long j3 = 60;
        int i3 = (int) (j2 / j3);
        int i4 = (int) (j2 % j3);
        if (i2 > 0) {
            i = 2131962635;
            A1b = 1BK.A1a(Integer.valueOf(i2), Integer.valueOf(i3), i4);
        } else {
            i = 2131962634;
            A1b = AnonymousClass001.A1b(Integer.valueOf(i3), i4);
        }
        String string = resources.getString(i, A1b);
        11T.A0D(string);
        return string;
    }

    public static final void A01(MediaSyncSeekBarView mediaSyncSeekBarView) {
        String str;
        GRX grx = mediaSyncSeekBarView.A03;
        6U2 r303 = null;
        if (grx == null || (str = mediaSyncSeekBarView.A04) == null) {
            6cT r0 = mediaSyncSeekBarView.A01;
            if (r0 == null) {
                return;
            }
            6dM.A00(((RichVideoPlayer) r0).A0I, mediaSyncSeekBarView.A00, mediaSyncSeekBarView.A0B);
            6cT r02 = mediaSyncSeekBarView.A01;
            if (r02 != null) {
                r303 = ((RichVideoPlayer) r02).A0I;
            }
        } else {
            r303 = grx.A07(I9A.A0F, str);
            6dM.A00(r303, r303, mediaSyncSeekBarView.A0B);
        }
        mediaSyncSeekBarView.A00 = r303;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x012b, code lost:
    
        if (X.1BK.A1X(r0, true) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a7, code lost:
    
        if (r0.A0B(X.I9A.A0F, r301.A04) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r0.A00().equals(X.0S2.A01) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.mediasync.seekbarview.MediaSyncSeekBarView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1073624024);
        super.onAttachedToWindow();
        C00i c00i = this.A06.A00;
        HgM hgM = (HgM) c00i.get();
        HDb hDb = this.A0D;
        11T.A0F(hDb, 0);
        hgM.A03.add(hDb);
        C00i c00i2 = this.A08.A00;
        ((GS2) c00i2.get()).A0Y(this);
        this.A01 = ((HgM) c00i.get()).A01;
        6TI r0 = ((HgM) c00i.get()).A00;
        if (r0 != null) {
            ((GrE) c00i2.get()).A0d(r0);
        }
        if (this.A01 != null || this.A03 != null) {
            A01(this);
        }
        1Br r02 = this.A07;
        ((GeJ) 1Br.A0B(r02)).A08(this, new IUl(this));
        ((GeJ) 1Br.A0B(r02)).A07();
        0FI.A0C(1080517501, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-93742006);
        super.onDetachedFromWindow();
        1Br r0 = this.A07;
        ((GeJ) 1Br.A0B(r0)).A06();
        GeJ geJ = (GeJ) 1Br.A0B(r0);
        geJ.A00.getContentResolver().unregisterContentObserver(geJ.A0C);
        geJ.A02.A01();
        GTF gtf = this.A09;
        gtf.removeMessages(2);
        gtf.removeMessages(3);
        HgM hgM = (HgM) 1Br.A0B(this.A06);
        HDb hDb = this.A0D;
        11T.A0F(hDb, 0);
        hgM.A03.remove(hDb);
        ((GS2) 1Br.A0B(this.A08)).A0X();
        this.A01 = null;
        0FI.A0C(-191284604, A06);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        11T.A0F(view, 0);
        super.onVisibilityChanged(view, i);
        GTF gtf = this.A09;
        if (gtf != null) {
            if (i == 0) {
                gtf.sendEmptyMessage(3);
            } else {
                gtf.removeMessages(2);
            }
        }
    }
}
