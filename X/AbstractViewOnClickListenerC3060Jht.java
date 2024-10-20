package X;

import android.view.View;

/* renamed from: X.Jht, reason: case insensitive filesystem */
/* loaded from: Jht.class */
public abstract class AbstractViewOnClickListenerC3060Jht extends 2Xd implements View.OnClickListener {
    public long A00 = -1;
    public boolean A01 = false;
    public boolean A02 = false;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        int A05 = 0FI.A05(-858364850);
        Number number = (Number) view.getTag();
        if (number != null) {
            long longValue = number.longValue();
            if (longValue != this.A00) {
                this.A00 = longValue;
                A07();
                i = 1851697517;
                0FI.A0B(i, A05);
            }
        }
        i = -895041745;
        0FI.A0B(i, A05);
    }
}
