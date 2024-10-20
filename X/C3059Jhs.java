package X;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* renamed from: X.Jhs, reason: case insensitive filesystem */
/* loaded from: Jhs.class */
public final class C3059Jhs extends 2Xd {
    public final int A00;
    public final Context A01;
    public final CalendarConstraints A02;
    public final DateSelector A03;
    public final MDE A04;

    public C3059Jhs(Context context, CalendarConstraints calendarConstraints, DateSelector dateSelector, MDE mde) {
        Month month = calendarConstraints.A05;
        Month month2 = calendarConstraints.A04;
        Month month3 = calendarConstraints.A00;
        if (month.A06.compareTo(month3.A06) > 0) {
            throw AnonymousClass001.A0L("firstPage cannot be after currentPage");
        }
        if (month3.A06.compareTo(month2.A06) > 0) {
            throw AnonymousClass001.A0L("currentPage cannot be after lastPage");
        }
        int dimensionPixelSize = JYV.A05 * context.getResources().getDimensionPixelSize(2131165250);
        int A01 = JgQ.A08(context, R.attr.windowFullscreen) ? DKG.A01(context, 2131165250) : 0;
        this.A01 = context;
        this.A00 = dimensionPixelSize + A01;
        this.A02 = calendarConstraints;
        this.A03 = dateSelector;
        this.A04 = mde;
        A0B(true);
    }

    public int A0H(Month month) {
        Month month2 = this.A02.A05;
        if (month2.A06 instanceof GregorianCalendar) {
            return ((month.A04 - month2.A04) * 12) + (month.A03 - month2.A03);
        }
        throw AnonymousClass001.A0L("Only Gregorian calendars are supported.");
    }

    public Month A0I(int i) {
        Calendar A02 = LBq.A02(this.A02.A05.A06);
        A02.add(2, i);
        return new Month(A02);
    }

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        C3068Ji6 c3068Ji6 = (C3068Ji6) c2lb;
        CalendarConstraints calendarConstraints = this.A02;
        Calendar A02 = LBq.A02(calendarConstraints.A05.A06);
        A02.add(2, i);
        Month month = new Month(A02);
        c3068Ji6.A00.setText(month.A02(c3068Ji6.A0I.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c3068Ji6.A01.findViewById(2131365820);
        if (materialCalendarGridView.A00() == null || !month.equals(materialCalendarGridView.A00().A04)) {
            JYV jyv = new JYV(calendarConstraints, this.A03, month);
            materialCalendarGridView.setNumColumns(month.A02);
            materialCalendarGridView.setAdapter((ListAdapter) jyv);
        } else {
            materialCalendarGridView.invalidate();
            JYV A00 = materialCalendarGridView.A00();
            Iterator it = A00.A01.iterator();
            while (it.hasNext()) {
                JYV.A01(materialCalendarGridView, A00, JR0.A0X(it));
            }
            DateSelector dateSelector = A00.A03;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.B9f().iterator();
                while (it2.hasNext()) {
                    JYV.A01(materialCalendarGridView, A00, JR0.A0X(it2));
                }
                A00.A01 = dateSelector.B9f();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new LLB(this, materialCalendarGridView, 3));
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2132542782, viewGroup, false);
        if (JgQ.A08(context, R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new C2lg(-1, this.A00));
            z = true;
        }
        return new C3068Ji6(linearLayout, z);
    }

    public int getItemCount() {
        return this.A02.A01;
    }

    public long getItemId(int i) {
        Calendar A02 = LBq.A02(this.A02.A05.A06);
        A02.add(2, i);
        return new Month(A02).A06.getTimeInMillis();
    }
}
