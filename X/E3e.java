package X;

import android.app.DatePickerDialog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: E3e.class */
public final class E3e extends FIJ {
    public final GL7 A00;

    public E3e(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        GL7 gl7 = this.A00;
        FIJ fij = null;
        String BCx = gl7.BCx(35, null);
        String BCx2 = gl7.BCx(36, null);
        String BCx3 = gl7.BCx(38, null);
        GL7 Ay2 = gl7.Ay2(42);
        if (Ay2 != null) {
            fij = FJ9.A04(Ay2, fyG);
        }
        Object obj = DKG.A0b(gl7, fyG).A00[1];
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            calendar.setTimeInMillis(obj == null ? BCx == null ? System.currentTimeMillis() : simpleDateFormat.parse(BCx).getTime() : simpleDateFormat.parse(obj.toString()).getTime());
            DatePickerDialog datePickerDialog = new DatePickerDialog(fyG.A00, 2132607375, new RiV(fij, this, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
            if (BCx3 != null) {
                datePickerDialog.getDatePicker().setMinDate(simpleDateFormat.parse(BCx3).getTime());
            }
            if (BCx2 != null) {
                datePickerDialog.getDatePicker().setMaxDate(simpleDateFormat.parse(BCx2).getTime());
            }
            datePickerDialog.show();
        } catch (ParseException e) {
            FAo.A00(fyG, e);
        }
    }
}
