package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.users.displayname.ChangeDisplayNameSettingsFragment;

/* renamed from: X.Af2, reason: case insensitive filesystem */
/* loaded from: Af2.class */
public final class C1360Af2 extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C1360Af2(C00m c00m, int i, int i2) {
        this.A00 = i2;
        this.A02 = c00m;
        this.A01 = i;
    }

    public C1360Af2(ChangeDisplayNameSettingsFragment changeDisplayNameSettingsFragment, int i) {
        this.A00 = 2;
        this.A02 = changeDisplayNameSettingsFragment;
        this.A01 = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, com.facebook.messaging.users.displayname.ChangeDisplayNameSettingsFragment] */
    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        switch (this.A00) {
            case 0:
            case 1:
            case 3:
                7zL.A1R(this.A02);
                return;
            case 2:
                ?? r0 = (ChangeDisplayNameSettingsFragment) this.A02;
                r0.A06.A01("edit_name_learn_more_clicked");
                ((08O) r0.A0D.get()).A03().A0A(r0.getContext(), 4YV.A08("https://www.facebook.com/help/112146705538576"));
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
            case 1:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setColor(this.A01);
                textPaint.setUnderlineText(false);
                return;
            case 2:
                textPaint.setColor(this.A01);
                return;
            case 3:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setColor(this.A01);
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
