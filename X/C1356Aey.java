package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aey, reason: case insensitive filesystem */
/* loaded from: Aey.class */
public final class C1356Aey extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1356Aey(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356Aey.onClick(android.view.View):void");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int color;
        switch (this.A00) {
            case 0:
                BvU bvU = (BvU) this.A01;
                Context context = (Context) this.A02;
                int i = 2132214208;
                if (C0et.A0P == bvU.A00) {
                    i = 2132214198;
                }
                color = context.getColor(i);
                break;
            case 1:
                11T.A0F(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(((MigColorScheme) this.A03).AZc());
                textPaint.setTypeface(2KQ.A03.A00(7zN.A06(this.A02)));
                return;
            case 2:
            case 3:
                11T.A0F(textPaint, 0);
                color = ((MigColorScheme) this.A01).Chx(C1u7.A06);
                break;
            case 4:
            case 5:
                super.updateDrawState(textPaint);
                Resources resources = (Resources) this.A02;
                5zD r0 = (5zD) this.A03;
                textPaint.setColor(r0 != null ? r0.Axg().B4i() : resources.getColor(2132214411));
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setColor(color);
    }
}
