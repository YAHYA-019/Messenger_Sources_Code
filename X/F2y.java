package X;

import android.app.DatePickerDialog;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.EditText;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: F2y.class */
public abstract class F2y {
    public static final Handler A00 = AnonymousClass001.A07();

    public static void A00(EditText editText, EhG ehG, FyG fyG, DLQ dlq) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(fyG.A00, new FJa(editText, ehG, fyG, dlq), calendar.get(1), calendar.get(2), calendar.get(5));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String A0E = dlq.A0E();
            if (!TextUtils.isEmpty(A0E)) {
                Date parse = simpleDateFormat.parse(A0E);
                if (parse != null) {
                    datePickerDialog.getDatePicker().setMinDate(parse.getTime());
                }
            }
            String A0C = dlq.A0C();
            if (!TextUtils.isEmpty(A0C)) {
                Date parse2 = simpleDateFormat.parse(A0C);
                if (parse2 != null) {
                    datePickerDialog.getDatePicker().setMaxDate(parse2.getTime());
                }
            }
        } catch (ParseException e) {
            0fH.A0p("MSGNoviDatePickerComponentBinderUtils", "got wrong date format from server", e);
        }
        datePickerDialog.show();
    }
}
