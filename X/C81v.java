package X;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.Menu;
import android.view.View;

/* renamed from: X.81v, reason: invalid class name */
/* loaded from: 81v.class */
public final /* synthetic */ class C81v implements View.OnLongClickListener {
    public final /* synthetic */ 6PP A00;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.widget.text.BetterEditTextView, android.view.View] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        6PP r0 = this.A00;
        Context context = r0.A0H;
        ?? r02 = r0.A0S;
        7QJ r03 = new 8Ca(context, (View) r02);
        r03.A00 = (ClipboardManager) 1Hv.A02(context, 100196);
        r03.A01 = 1BV.A00(66171);
        r03.A02 = r02;
        JXV jZn = new JZn(((8Ca) r03).A00);
        Menu menu = r03.A04;
        jZn.inflate(2131623940, menu);
        if (r03.A02.getText().length() == 0) {
            menu.removeItem(2131366619);
            menu.removeItem(2131366620);
            menu.removeItem(2131366623);
            1Br.A0C(((AnonymousClass471) ((C9Ji) r03.A01.get()).A00.get()).A00);
        }
        if (1JF.A0B(r03.A00.getText())) {
            menu.removeItem(2131366622);
        }
        1Br.A0C(((AnonymousClass471) ((C9Ji) r03.A01.get()).A00.get()).A00);
        r03.A01 = new 9qH(r03);
        r03.A00();
        return true;
    }
}
