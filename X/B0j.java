package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.base.Platform;

/* loaded from: B0j.class */
public final class B0j extends C1rj {
    public static final MigColorScheme A03 = LightColorScheme.A00();
    public DI7 A00;
    public MigColorScheme A01;
    public String A02;

    public B0j() {
        super("M4OmnipickerSearchEditText");
        this.A01 = A03;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new EditText(context);
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        ((Ch5) r302.A06().A05).A00 = new CYa(this.A00, 10);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        B1w b1w = (B1w) 4YU.A0P(r302);
        TextView textView = (TextView) obj;
        String str = this.A02;
        MigColorScheme migColorScheme = this.A01;
        TextWatcher textWatcher = ((Ch5) r302.A06().A05).A00;
        InputMethodManager inputMethodManager = b1w.A01;
        View.OnFocusChangeListener onFocusChangeListener = b1w.A00;
        boolean z = b1w.A03;
        boolean z2 = b1w.A02;
        AbG.A1H(textView, migColorScheme);
        AbH.A1M(textView, migColorScheme);
        AbG.A1I(textView, migColorScheme);
        textView.setTextSize(1, 16.0f);
        textView.setHint(2131962707);
        textView.setSingleLine();
        textView.setImeOptions(33554438);
        textView.addTextChangedListener(textWatcher);
        textView.setOnEditorActionListener(new CZU(inputMethodManager, textView, 0));
        if (!z2 && !Platform.stringIsNullOrEmpty(str)) {
            if (r302.A02 != null) {
                4YV.A1F(r302, true, (-1) << (-1));
            }
            textView.setTextKeepState(str);
            textView.requestFocus();
        }
        if (!z) {
            textView.requestFocus();
            textView.post(new D8A(textView, inputMethodManager));
            if (r302.A02 != null) {
                4YV.A1F(r302, true, Process.WAIT_RESULT_STOPPED);
            }
        }
        textView.setOnFocusChangeListener(onFocusChangeListener);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((TextView) obj).removeTextChangedListener(((Ch5) r302.A06().A05).A00);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1w b1w = (B1w) r303;
        InputMethodManager inputMethodManager = (InputMethodManager) 1Hv.A02(r302.A0D, 100189);
        b1w.A00 = new CZI(inputMethodManager, 1);
        b1w.A03 = false;
        b1w.A01 = inputMethodManager;
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((Ch5) interfaceC00783om).A00 = ((Ch5) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B0j b0j = (B0j) r302;
            MigColorScheme migColorScheme = this.A01;
            MigColorScheme migColorScheme2 = b0j.A01;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            String str = this.A02;
            String str2 = b0j.A02;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            DI7 di7 = this.A00;
            DI7 di72 = b0j.A00;
            if (di7 != null) {
                if (!di7.equals(di72)) {
                    return false;
                }
            } else if (di72 != null) {
                return false;
            }
        }
        return true;
    }
}
