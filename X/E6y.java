package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.facebook.payments.ui.PaymentFormEditTextView;
import java.util.List;

/* loaded from: E6y.class */
public abstract class E6y extends PaymentFormEditTextView implements TextWatcher, GJT, View.OnFocusChangeListener, GFe {
    public 2JX A00;
    public final List A01;

    public E6y(Context context) {
        super(context, null);
        this.A01 = AbF.A1F();
        AbH.A1K(this, -1);
        DPX dpx = ((PaymentFormEditTextView) this).A03;
        dpx.setTextSize(C0A8.A06(getResources(), 2132279515));
        dpx.setSingleLine();
        dpx.setImeOptions(134217728);
        Context context2 = getContext();
        setPadding(DKG.A01(context2, 2132279327), DKG.A01(context2, 2132279332), DKG.A01(context2, 2132279327), DKG.A01(context2, 2132279332));
    }

    private String A00() {
        2JX r0 = this.A00;
        String str = null;
        if (r0 != null && !r0.A2K(2117924273, 1366449572).isEmpty()) {
            String str2 = (String) getValue();
            1Du A0w = AbI.A0w(this.A00, 2117924273, 1366449572);
            while (true) {
                if (!A0w.hasNext()) {
                    break;
                }
                2JX A0D = AbG.A0D(A0w);
                if (!R2r.A00(A0D, str2)) {
                    str = A0D.A0r(-1938755376);
                    break;
                }
            }
        }
        return str;
    }

    public void A5o(Els els) {
        this.A01.add(els);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f3, code lost:
    
        if (r0.equals(r305) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0209, code lost:
    
        if (r0.equals("NUMERICAL") != false) goto L21;
     */
    @Override // X.GFe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cnp(X.2JX r302) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6y.Cnp(X.2JX):void");
    }

    public boolean D8t() {
        String A00 = A00();
        if (A00 == null) {
            DKH.A1Q(this);
            return true;
        }
        A0p(A00);
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (A00() == null) {
            DKH.A1Q(this);
            2JX r0 = this.A00;
            if (r0 == null || r0.A0r(-929008000) == null) {
                return;
            }
            for (Els els : this.A01) {
                els.A02.put(this.A00.A0r(-929008000), getValue());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            return;
        }
        D8t();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
