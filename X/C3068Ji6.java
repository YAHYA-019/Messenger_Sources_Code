package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* renamed from: X.Ji6, reason: case insensitive filesystem */
/* loaded from: Ji6.class */
public final class C3068Ji6 extends C2lb {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public C3068Ji6(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView A06 = AbF.A06(linearLayout, 2131365825);
        this.A00 = A06;
        C0Ad.A0H(A06, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(2131365820);
        if (z) {
            return;
        }
        A06.setVisibility(8);
    }
}
