package com.facebook.messaging.users.username;

import X.0Q8;
import X.11T;
import X.7zQ;
import X.AbG;
import X.AbM;
import X.AnonymousClass001;
import X.BiR;
import X.C09s;
import X.CYa;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: EditUsernameEditText.class */
public final class EditUsernameEditText extends CustomFrameLayout {
    public int A00;
    public int A01;
    public EditText A02;
    public ProgressBar A03;
    public TextView A04;
    public TextView A05;
    public BiR A06;
    public MigColorScheme A07;
    public Integer A08;
    public String A09;
    public boolean A0A;

    public EditUsernameEditText(Context context) {
        super(context);
        this.A09 = "";
        A00();
    }

    public EditUsernameEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = "";
        A00();
    }

    public EditUsernameEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = "";
        A00();
    }

    private final void A00() {
        A0U(2132542910);
        Context context = getContext();
        this.A01 = context.getResources().getInteger(2131427340);
        this.A00 = context.getResources().getInteger(2131427387);
        this.A04 = AbG.A09(this, 2131368319);
        this.A05 = AbG.A09(this, 2131368321);
        EditText editText = (EditText) C09s.A01(this, 2131368316);
        this.A02 = editText;
        if (editText == null) {
            11T.A0L("editText");
            throw 0Q8.createAndThrow();
        }
        editText.addTextChangedListener(new CYa(this, 13));
        A0V();
        ProgressBar progressBar = (ProgressBar) C09s.A01(this, 2131368315);
        this.A03 = progressBar;
        if (progressBar != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(AbG.A00(context), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static final void A01(Context context, EditUsernameEditText editUsernameEditText) {
        String str;
        TextView textView = editUsernameEditText.A04;
        if (textView == null) {
            str = "numCharactersTextView";
        } else {
            Resources resources = context.getResources();
            EditText editText = editUsernameEditText.A02;
            if (editText != null) {
                Integer valueOf = Integer.valueOf(7zQ.A05(AbM.A0u(editText)));
                Integer num = editUsernameEditText.A08;
                textView.setText(resources.getString(2131956268, AnonymousClass001.A1b(valueOf, num != null ? num.intValue() : editUsernameEditText.A00)));
                return;
            }
            str = "editText";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A02(EditUsernameEditText editUsernameEditText) {
        MigColorScheme migColorScheme = editUsernameEditText.A07;
        int A00 = migColorScheme == null ? AbG.A00(editUsernameEditText.getContext()) : migColorScheme.B4h();
        EditText editText = editUsernameEditText.A02;
        if (editText == null) {
            11T.A0L("editText");
            throw 0Q8.createAndThrow();
        }
        editText.getBackground().setColorFilter(A00, PorterDuff.Mode.SRC_ATOP);
    }

    public static final void A03(EditUsernameEditText editUsernameEditText) {
        MigColorScheme migColorScheme = editUsernameEditText.A07;
        int color = migColorScheme == null ? editUsernameEditText.getContext().getColor(2132214247) : migColorScheme.B6U();
        EditText editText = editUsernameEditText.A02;
        if (editText == null) {
            11T.A0L("editText");
            throw 0Q8.createAndThrow();
        }
        editText.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
    }

    public final void A0V() {
        this.A0A = false;
        A02(this);
        TextView textView = this.A05;
        if (textView == null) {
            11T.A0L("unavailableUsernameTextView");
            throw 0Q8.createAndThrow();
        }
        textView.setVisibility(8);
    }

    public final void A0W() {
        this.A0A = true;
        A03(this);
        TextView textView = this.A05;
        if (textView == null) {
            11T.A0L("unavailableUsernameTextView");
            throw 0Q8.createAndThrow();
        }
        textView.setVisibility(0);
    }
}
