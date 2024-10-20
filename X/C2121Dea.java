package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;

/* renamed from: X.Dea, reason: case insensitive filesystem */
/* loaded from: Dea.class */
public final class C2121Dea extends DKS {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public DialogInterface.OnClickListener A02;

    public C2121Dea(Context context) {
        super(new ContextWrapper(context));
    }

    public C2121Dea(Context context, int i) {
        super(new ContextWrapper(context), i);
    }

    public static C2121Dea A03(Context context) {
        return new C2121Dea(context);
    }

    public DKS A0D(DialogInterface.OnClickListener onClickListener, int i) {
        this.A00 = onClickListener;
        super.A0D(onClickListener, i);
        return this;
    }

    public DKS A0E(DialogInterface.OnClickListener onClickListener, int i) {
        this.A02 = onClickListener;
        super.A0E(onClickListener, i);
        return this;
    }

    public DKS A0F(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00 = onClickListener;
        super.A0F(onClickListener, charSequence);
        return this;
    }

    public DKS A0G(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A01 = onClickListener;
        super.A0G(onClickListener, charSequence);
        return this;
    }

    public DKS A0H(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A02 = onClickListener;
        super.A0H(onClickListener, charSequence);
        return this;
    }

    public DMV A0I() {
        DMV A0I = super.A0I();
        6QF.A00(A0I);
        return A0I;
    }

    public void A0J(DialogInterface.OnClickListener onClickListener, int i) {
        this.A01 = onClickListener;
        F8e f8e = ((DKS) this).A01;
        f8e.A0E = f8e.A0M.getText(i);
        f8e.A03 = onClickListener;
    }
}
