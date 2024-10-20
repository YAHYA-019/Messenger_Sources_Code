package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.facebook.fbui.widget.text.BadgeTextView;
import com.facebook.resources.ui.FbCheckedTextView;
import com.facebook.resources.ui.FbTextView;

/* renamed from: X.Df1, reason: case insensitive filesystem */
/* loaded from: Df1.class */
public final class C2142Df1 extends ImageBlockLayout implements Checkable {
    public static final int[] A08 = {R.attr.state_checkable, R.attr.state_checked};
    public static final int[] A09 = {R.attr.state_checkable};
    public static final String __redex_internal_original_name = "PopoverListItemView";
    public GlyphView A00;
    public BadgeTextView A01;
    public FbCheckedTextView A02;
    public FbTextView A03;
    public boolean A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C2142Df1(Context context) {
        super(context, null, 2130971339);
        this.A04 = true;
        if (super.A06 != 16) {
            super.A06 = 16;
            requestLayout();
        }
        setContentView(2132541999);
        this.A01 = (BadgeTextView) C09s.A01(this, 2131364044);
        this.A03 = (FbTextView) C09s.A01(this, 2131364042);
        this.A00 = (GlyphView) C09s.A01(this, 2131364043);
        this.A02 = C09s.A01(this, 2131364045);
    }

    public static final void A00(TextView textView, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.TextView, com.facebook.fbui.widget.text.BadgeTextView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0H(android.view.MenuItem r302) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2142Df1.A0H(android.view.MenuItem):void");
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A07;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        if (!this.A06) {
            int[] onCreateDrawableState = super/*android.view.ViewGroup*/.onCreateDrawableState(i);
            11T.A0A(onCreateDrawableState);
            return onCreateDrawableState;
        }
        int[] onCreateDrawableState2 = super/*android.view.ViewGroup*/.onCreateDrawableState(i + 2);
        View.mergeDrawableStates(onCreateDrawableState2, this.A07 ? A08 : A09);
        FbCheckedTextView fbCheckedTextView = this.A02;
        if (fbCheckedTextView == null) {
            11T.A0L("titleWithCheckbox");
            throw 0Q8.createAndThrow();
        }
        if (fbCheckedTextView.getVisibility() == 0) {
            fbCheckedTextView.setChecked(this.A07);
        }
        11T.A0D(onCreateDrawableState2);
        return onCreateDrawableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r303 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(r1)
            r0 = r301
            boolean r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L24
            r0 = r301
            java.lang.Integer r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
        L1e:
            r0 = r302
            r1 = r303
            X.C2rp.A03(r0, r1)
            return
        L24:
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2142Df1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0.getLineCount() <= 1) goto L10;
     */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
            r0 = r301
            com.facebook.fbui.widget.text.BadgeTextView r0 = r0.A01
            r304 = r0
            java.lang.String r0 = "title"
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L7c
            r0 = r304
            int r0 = r0.getVisibility()
            r306 = r0
            java.lang.String r0 = "Required value was null."
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L3e
            r0 = r304
            android.text.Layout r0 = r0.getLayout()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9c
            r0 = r305
            int r0 = r0.getLineCount()
            r306 = r0
            r0 = r306
            r1 = r308
            if (r0 > r1) goto L6f
        L3e:
            r0 = r301
            com.facebook.resources.ui.FbCheckedTextView r0 = r0.A02
            r304 = r0
            java.lang.String r0 = "titleWithCheckbox"
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L7c
            r0 = r304
            int r0 = r0.getVisibility()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L9b
            r0 = r304
            android.text.Layout r0 = r0.getLayout()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L85
            r0 = r305
            int r0 = r0.getLineCount()
            r306 = r0
            r0 = r306
            r1 = r308
            if (r0 <= r1) goto L9b
        L6f:
            r0 = r301
            com.facebook.resources.ui.FbTextView r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L8b
            java.lang.String r0 = "description"
            r305 = r0
        L7c:
            r0 = r305
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L85:
            r0 = r307
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L8b:
            r0 = 8
            r306 = r0
            r0 = r304
            r1 = r306
            r0.setVisibility(r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
        L9b:
            return
        L9c:
            r0 = r307
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2142Df1.onMeasure(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.A07 = z;
        refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void toggle() {
        this.A07 = !this.A07;
        refreshDrawableState();
    }
}
