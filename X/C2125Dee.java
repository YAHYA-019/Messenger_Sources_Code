package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.text.NumberFormat;

/* renamed from: X.Dee, reason: case insensitive filesystem */
/* loaded from: Dee.class */
public final class C2125Dee extends DMV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorFilter A06;
    public Drawable A07;
    public Drawable A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public String A0C;
    public NumberFormat A0D;
    public boolean A0E;
    public Handler A0F;
    public TextView A0G;
    public CharSequence A0H;
    public boolean A0I;

    public C2125Dee(Context context) {
        super(context, DMV.A00(context, 0));
        this.A03 = 0;
        this.A0C = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.A0D = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    public C2125Dee(Context context, int i) {
        super(context, i);
        this.A03 = 0;
        this.A0C = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.A0D = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Dee, X.DMV, android.app.Dialog] */
    public static C2125Dee A01(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int i = 5;
        if (5YG.A04(context)) {
            i = 4;
        }
        ?? c2125Dee = new C2125Dee(context, i);
        if (charSequence != null) {
            c2125Dee.setTitle(charSequence);
        }
        c2125Dee.A04(charSequence2);
        c2125Dee.A05(z);
        c2125Dee.setCancelable(false);
        c2125Dee.setOnCancelListener(null);
        6QF.A00((Dialog) c2125Dee);
        c2125Dee.show();
        return c2125Dee;
    }

    public static void A02(C2125Dee c2125Dee) {
        Handler handler;
        if (c2125Dee.A03 != 1 || (handler = c2125Dee.A0F) == null || handler.hasMessages(0)) {
            return;
        }
        c2125Dee.A0F.sendEmptyMessage(0);
    }

    public void A04(CharSequence charSequence) {
        if (this.A09 == null) {
            this.A0H = charSequence;
        } else if (this.A03 == 1) {
            super.A04(charSequence);
        } else {
            this.A0G.setText(charSequence);
        }
    }

    public void A05(boolean z) {
        ProgressBar progressBar = this.A09;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.A0I = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        if (6QE.A00) {
            6QE.A00(this);
            6QE.A01(this);
            6QE.A02(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1oo.A10, 2130968674, 0);
        if (this.A03 == 1) {
            this.A0F = new DNb(this, 1);
            inflate = from.inflate(obtainStyledAttributes.getResourceId(5, 2132541968), (ViewGroup) null);
            this.A09 = (ProgressBar) inflate.findViewById(2131366700);
            this.A0A = AbF.A06(inflate, 2131366718);
            this.A0B = AbF.A06(inflate, 2131366719);
        } else {
            inflate = from.inflate(obtainStyledAttributes.getResourceId(6, 2132541969), (ViewGroup) null);
            this.A09 = (ProgressBar) inflate.findViewById(2131366700);
            this.A0G = AbF.A06(inflate, 2131365608);
        }
        FEx fEx = ((DMV) this).A00;
        fEx.A0C = inflate;
        fEx.A0R = false;
        obtainStyledAttributes.recycle();
        int i = this.A02;
        if (i > 0) {
            ProgressBar progressBar = this.A09;
            if (progressBar != null) {
                progressBar.setMax(i);
                A02(this);
            } else {
                this.A02 = i;
            }
        }
        int i2 = this.A04;
        if (i2 > 0) {
            if (this.A0E) {
                this.A09.setProgress(i2);
                A02(this);
            } else {
                this.A04 = i2;
            }
        }
        int i3 = this.A05;
        if (i3 > 0) {
            ProgressBar progressBar2 = this.A09;
            if (progressBar2 != null) {
                progressBar2.setSecondaryProgress(i3);
                A02(this);
            } else {
                this.A05 = i3;
            }
        }
        int i4 = this.A00;
        if (i4 > 0) {
            ProgressBar progressBar3 = this.A09;
            if (progressBar3 != null) {
                progressBar3.incrementProgressBy(i4);
                A02(this);
            } else {
                this.A00 = i4 + i4;
            }
        }
        int i5 = this.A01;
        if (i5 > 0) {
            ProgressBar progressBar4 = this.A09;
            if (progressBar4 != null) {
                progressBar4.incrementSecondaryProgressBy(i5);
                A02(this);
            } else {
                this.A01 = i5 + i5;
            }
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            ProgressBar progressBar5 = this.A09;
            if (progressBar5 != null) {
                progressBar5.setProgressDrawable(drawable);
            } else {
                this.A08 = drawable;
            }
        }
        Drawable drawable2 = this.A07;
        if (drawable2 != null) {
            ProgressBar progressBar6 = this.A09;
            if (progressBar6 != null) {
                progressBar6.setIndeterminateDrawable(drawable2);
            } else {
                this.A07 = drawable2;
            }
        }
        CharSequence charSequence = this.A0H;
        if (charSequence != null) {
            A04(charSequence);
        }
        A05(this.A0I);
        ColorFilter colorFilter = this.A06;
        if (colorFilter != null) {
            ProgressBar progressBar7 = this.A09;
            if (progressBar7 != null && progressBar7.getIndeterminateDrawable() != null) {
                this.A09.getIndeterminateDrawable().mutate().setColorFilter(colorFilter);
            }
            this.A06 = colorFilter;
        }
        A02(this);
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super/*android.app.Dialog*/.onStart();
        this.A0E = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        super/*android.app.Dialog*/.onStop();
        this.A0E = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCancelMessage(Message message) {
        if (6QE.A00) {
            6QE.A00(this);
        }
        super/*android.app.Dialog*/.setCancelMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDismissMessage(Message message) {
        if (6QE.A00) {
            6QE.A01(this);
        }
        super/*android.app.Dialog*/.setDismissMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        if (6QE.A00) {
            6QE.A00(this);
        }
        super/*android.app.Dialog*/.setOnCancelListener(onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (6QE.A00) {
            6QE.A01(this);
        }
        super/*android.app.Dialog*/.setOnDismissListener(onDismissListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        if (6QE.A00) {
            6QE.A02(this);
        }
        super/*android.app.Dialog*/.setOnShowListener(onShowListener);
    }
}
