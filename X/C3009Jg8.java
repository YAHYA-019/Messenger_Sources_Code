package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.Jg8, reason: case insensitive filesystem */
/* loaded from: Jg8.class */
public final class C3009Jg8 extends 3vE {
    public final /* synthetic */ Chip A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3009Jg8(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r0.contains(r302, r303) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0c(float r302, float r303) {
        /*
            r301 = this;
            r0 = r301
            com.google.android.material.chip.Chip r0 = r0.A00
            r304 = r0
            r0 = r304
            X.K8I r0 = r0.A04
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L38
            r0 = r305
            android.graphics.drawable.Drawable r0 = r0.A0T
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L38
            r0 = r304
            android.graphics.RectF r0 = r0.A0C
            r305 = r0
            r0 = r305
            r0.setEmpty()
            r0 = r305
            r1 = r302
            r2 = r303
            boolean r0 = r0.contains(r1, r2)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L3e
        L38:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L3e:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3009Jg8.A0c(float, float):int");
    }

    public void A0h(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A05 = z;
            chip.refreshDrawableState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.A0a == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0j(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r302) {
        /*
            r301 = this;
            r0 = r301
            com.google.android.material.chip.Chip r0 = r0.A00
            r303 = r0
            r0 = r303
            X.K8I r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1c
            r0 = r304
            boolean r0 = r0.A0a
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L21
        L1c:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L21:
            r0 = r302
            r1 = r306
            r0.A0A(r1)
            r0 = r303
            boolean r0 = r0.isClickable()
            r306 = r0
            r0 = r302
            r1 = r306
            r0.A0C(r1)
            r0 = r303
            X.K8I r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L47
            r0 = r304
            boolean r0 = r0.A0a
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L6a
        L47:
            r0 = r303
            boolean r0 = r0.isClickable()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L6a
            java.lang.String r0 = "android.view.View"
            r304 = r0
        L55:
            r0 = r302
            r1 = r304
            r0.A07(r1)
            r0 = r303
            java.lang.CharSequence r0 = r0.getText()
            r307 = r0
            r0 = r302
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r1 = r307
            r0.setText(r1)
            return
        L6a:
            r0 = r303
            X.K8I r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L84
            r0 = r304
            boolean r0 = r0.A0a
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L84
            java.lang.String r0 = "android.widget.CompoundButton"
            r304 = r0
            goto L55
        L84:
            java.lang.String r0 = "android.widget.Button"
            r304 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3009Jg8.A0j(androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }

    public void A0k(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        String str;
        str = "";
        if (i != 1) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.A02;
            accessibilityNodeInfo.setContentDescription(str);
            accessibilityNodeInfo.setBoundsInParent(Chip.A0F);
            return;
        }
        Chip chip = this.A00;
        CharSequence text = chip.getText();
        String trim = 1BK.A0v(chip.getContext(), TextUtils.isEmpty(text) ? "" : text, 2131961859).trim();
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.A02;
        accessibilityNodeInfo2.setContentDescription(trim);
        RectF rectF = chip.A0C;
        rectF.setEmpty();
        Rect rect = chip.A0B;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        accessibilityNodeInfo2.setBoundsInParent(rect);
        accessibilityNodeInfoCompat.A05(0Oe.A08);
        accessibilityNodeInfo2.setEnabled(chip.isEnabled());
    }

    public void A0l(List list) {
        DKD.A1S(list, 0);
    }

    public boolean A0n(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.A00.performClick();
        }
        if (i != 1) {
            return false;
        }
        Chip chip = this.A00;
        chip.playSoundEffect(0);
        chip.A0D.A0g(1, 1);
        return false;
    }
}
