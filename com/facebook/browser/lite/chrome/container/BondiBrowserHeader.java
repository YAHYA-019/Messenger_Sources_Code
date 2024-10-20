package com.facebook.browser.lite.chrome.container;

import X.1Bi;
import X.1CO;
import X.2MR;
import X.AbJ;
import X.AnonymousClass001;
import X.JR2;
import X.JgX;
import X.Kqf;
import X.Kqt;
import X.L2h;
import X.LDi;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.browser.lite.chrome.widgets.progressbar.BondiProgressBar;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.FbImageView;
import java.util.HashSet;

/* loaded from: BondiBrowserHeader.class */
public class BondiBrowserHeader extends LinearLayout {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public JgX A06;
    public JgX A07;
    public BondiProgressBar A08;
    public Kqt A09;
    public Kqf A0A;
    public L2h A0B;
    public GlyphButton A0C;
    public GlyphButton A0D;
    public GlyphButton A0E;
    public GlyphButton A0F;
    public GlyphButton A0G;
    public 1CO A0H;
    public 1CO A0I;
    public FbTextView A0J;
    public FbTextView A0K;
    public FbImageView A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final HashSet A0W;

    public BondiBrowserHeader(Context context) {
        super(context);
        this.A0I = AbJ.A0e();
        this.A0H = (1CO) 1Bi.A03(16387);
        boolean z = false;
        this.A0O = false;
        this.A0W = AnonymousClass001.A0v();
        this.A0V = this.A0I.AZk(36320678701448824L);
        this.A0U = this.A0I.AZk(36325076748685628L);
        this.A0T = this.A0I.AZk(36325076748816702L);
        this.A0N = (JR2.A0n(this) || JR2.A0o(this)) ? true : z;
    }

    public BondiBrowserHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = AbJ.A0e();
        this.A0H = (1CO) 1Bi.A03(16387);
        boolean z = false;
        this.A0O = false;
        this.A0W = AnonymousClass001.A0v();
        this.A0V = this.A0I.AZk(36320678701448824L);
        this.A0U = this.A0I.AZk(36325076748685628L);
        this.A0T = this.A0I.AZk(36325076748816702L);
        this.A0N = (JR2.A0n(this) || JR2.A0o(this)) ? true : z;
    }

    public BondiBrowserHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = AbJ.A0e();
        this.A0H = (1CO) 1Bi.A03(16387);
        boolean z = false;
        this.A0O = false;
        this.A0W = AnonymousClass001.A0v();
        this.A0V = this.A0I.AZk(36320678701448824L);
        this.A0U = this.A0I.AZk(36325076748685628L);
        this.A0T = this.A0I.AZk(36325076748816702L);
        this.A0N = (JR2.A0n(this) || JR2.A0o(this)) ? true : z;
    }

    public static GradientDrawable A00(BondiBrowserHeader bondiBrowserHeader, boolean z, boolean z2) {
        Context context = bondiBrowserHeader.getContext();
        GradientDrawable gradientDrawable = (GradientDrawable) context.getResources().getDrawable(2132410523, null);
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            if (z2) {
                gradientDrawable.setStroke(1, LDi.A02(context).A01(2MR.A0p));
            }
            if (z) {
                gradientDrawable.setColor(LDi.A02(context).A01(2MR.A2d));
            }
        }
        return gradientDrawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x035b, code lost:
    
        if (r306 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02e0, code lost:
    
        r0.A00(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0342, code lost:
    
        if (r306 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dd, code lost:
    
        if (r306 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r301.A0R != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (r301.A0Q != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
    
        if (r0 != 5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03a9, code lost:
    
        r307 = 2132345225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03a6, code lost:
    
        if (r312 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03bf, code lost:
    
        if (r312 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0147, code lost:
    
        if (r301.A0Q != false) goto L56;
     */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.0w6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.MLg r302, java.lang.Integer r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.chrome.container.BondiBrowserHeader.A01(X.MLg, java.lang.Integer, java.lang.String):void");
    }

    public void setProgress(int i) {
        BondiProgressBar bondiProgressBar = this.A08;
        if (bondiProgressBar != null) {
            bondiProgressBar.A00(i);
        }
    }
}
