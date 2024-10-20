package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: Kvj.class */
public abstract class Kvj {
    public static final Integer A00(Integer num) {
        if (num == null || num.intValue() >= 1000) {
            return num;
        }
        String obj = num.toString();
        int length = obj.length();
        if (AnonymousClass001.A1O(length) || length > 2) {
            return null;
        }
        if (length == 1) {
            obj = 0Pz.A0K(obj, '0');
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy", Qyg.A00());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", Qyg.A00());
        try {
            Date parse = simpleDateFormat.parse(obj);
            if (parse == null) {
                return null;
            }
            String format = simpleDateFormat2.format(parse);
            11T.A0A(format);
            return AbH.A12(format);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final 03Y A01(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("MM/yyyy", Qyg.A00()).parse(0CV.A0W(str, " ", ""));
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return 1BK.A1G(Integer.valueOf(calendar.get(2) + 1), A00(Integer.valueOf(calendar.get(1))));
        } catch (ParseException unused) {
            return null;
        }
    }
}
