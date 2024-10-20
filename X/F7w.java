package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: F7w.class */
public final class F7w {
    public ColorStateList A00 = null;
    public boolean A01 = false;
    public boolean A02;
    public final CompoundButton A03;

    public F7w(CompoundButton compoundButton) {
        this.A03 = compoundButton;
    }

    public static void A00(F7w f7w) {
        CompoundButton compoundButton = f7w.A03;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable == null || !f7w.A01) {
            return;
        }
        Drawable mutate = buttonDrawable.mutate();
        if (f7w.A01) {
            mutate.setTintList(f7w.A00);
        }
        DKE.A1I(mutate, compoundButton);
        compoundButton.setButtonDrawable(mutate);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(android.util.AttributeSet r302, int r303) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F7w.A01(android.util.AttributeSet, int):void");
    }
}
