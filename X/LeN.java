package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* loaded from: LeN.class */
public final class LeN implements MIx {
    @Override // X.MIx
    public int Apm() {
        return 1;
    }

    @Override // X.MIx
    public boolean BX8(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.BX7(j)) {
                return true;
            }
        }
        return false;
    }
}
