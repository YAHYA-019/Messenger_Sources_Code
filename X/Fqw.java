package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;

/* loaded from: Fqw.class */
public final class Fqw implements 29I {
    public final FyG A00;

    public Fqw(FyG fyG) {
        this.A00 = fyG;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        View view = (View) obj;
        if (!(obj3 instanceof EqR)) {
            return null;
        }
        EqR eqR = (EqR) obj3;
        FyG fyG = this.A00;
        1BL.A1F(eqR, view);
        CharSequence charSequence = eqR.A04;
        if (!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null || fyG.A02.AZU().Aq9() == null) {
            return null;
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), DgI.class);
        11T.A0A(spans);
        for (Object obj4 : spans) {
            DgI dgI = (DgI) obj4;
            FyG fyG2 = dgI.A00;
            DLQ dlq = dgI.A01;
            5BO A01 = 5Bm.A01(FAh.A00(fyG2, dlq), (java.util.Map) null);
            C06974ih A02 = FAh.A02(fyG2, dlq);
            11T.A0F(dlq, 0);
            AKs aKs = new AKs(1, DgI.A02, "BloksRichTextImageSpan", FAh.A01(fyG2, dlq), 5BS.A03().A03(((DOR) dgI).A02, (Rect) null, (ContextChain) null, A02, A01, (Object) null, F2Z.A00(dlq, 74, false), false), dgI);
            ((DOR) dgI).A01 = aKs;
            aKs.invoke();
            ((DOR) dgI).A00 = view;
        }
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Spanned spanned;
        View view = (View) obj;
        if (obj3 instanceof EqR) {
            EqR eqR = (EqR) obj3;
            view.setContentDescription(null);
            FyG fyG = this.A00;
            11T.A0F(eqR, 1);
            CharSequence charSequence = eqR.A04;
            if (!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null || fyG.A02.AZU().Aq9() == null) {
                return;
            }
            Object[] spans = spanned.getSpans(0, spanned.length(), DgI.class);
            11T.A0A(spans);
            for (Object obj5 : spans) {
                DOR dor = (DOR) obj5;
                dor.A00 = null;
                5BS.A01().Ccn(dor.A03);
            }
        }
    }
}
