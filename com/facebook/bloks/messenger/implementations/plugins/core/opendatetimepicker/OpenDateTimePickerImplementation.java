package com.facebook.bloks.messenger.implementations.plugins.core.opendatetimepicker;

import X.11T;
import X.4YU;
import X.DKc;
import X.DLQ;
import X.FGb;
import X.FHh;
import X.FJb;
import X.Fwk;
import X.FyG;
import X.GJj;
import android.app.DatePickerDialog;
import android.content.Context;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* loaded from: OpenDateTimePickerImplementation.class */
public final class OpenDateTimePickerImplementation {
    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        GJj A00 = FGb.A00(dKc, 0);
        List list = dKc.A00;
        DLQ dlq = (DLQ) list.get(1);
        FyG fyG = (FyG) 4YU.A0q(list, 3);
        Context A01 = FyG.A01(fyG);
        long j = 0;
        if (dlq != null) {
            j = dlq.getLong(35, 0L);
        }
        Object obj = list.get(2);
        Number number = obj == null ? null : (Number) obj;
        Calendar calendar = Calendar.getInstance();
        if (number != null) {
            calendar.setTimeInMillis(number.longValue() * 1000);
        }
        Object obj2 = list.get(4);
        if (obj2 != null) {
            calendar.setTimeZone(TimeZone.getTimeZone((String) obj2));
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(A01, new FJb(this, fyG, fHh, A00, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMinDate(1000 * j);
        datePickerDialog.show();
        return null;
    }
}
