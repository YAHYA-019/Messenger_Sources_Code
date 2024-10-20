package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.79q, reason: invalid class name */
/* loaded from: 79q.class */
public final class C79q implements TextWatcher {
    public C79u A00;
    public final LinkedList A01;

    public C79q(TextWatcher... textWatcherArr) {
        LinkedList linkedList = new LinkedList();
        this.A01 = linkedList;
        0QU.A0u(linkedList, textWatcherArr);
    }

    public final void A00(TextWatcher textWatcher) {
        11T.A0F(textWatcher, 0);
        this.A01.addLast(textWatcher);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        11T.A0F(editable, 0);
        C79u c79u = this.A00;
        if (c79u != null && !c79u.A02.BV8()) {
            Iterator it = c79u.A04.iterator();
            while (it.hasNext()) {
                c79u.A01.markerPoint(((Number) it.next()).intValue(), -599342816, "afterTextChanged_start");
            }
        }
        Iterator it2 = this.A01.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).afterTextChanged(editable);
        }
        C79u c79u2 = this.A00;
        if (c79u2 == null || c79u2.A02.BV8()) {
            return;
        }
        Iterator it3 = c79u2.A04.iterator();
        while (it3.hasNext()) {
            c79u2.A01.markerEnd(((Number) it3.next()).intValue(), -599342816, (short) 2);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        11T.A0F(charSequence, 0);
        C79u c79u = this.A00;
        if (c79u != null && !c79u.A02.BV8()) {
            Iterator it = c79u.A04.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                QuickPerformanceLogger quickPerformanceLogger = c79u.A01;
                quickPerformanceLogger.markerStart(intValue, -599342816, "THREAD_VIEW_IMPL", "STAX");
                String str = c79u.A03;
                if (str == null) {
                    str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                }
                quickPerformanceLogger.markerAnnotate(intValue, -599342816, "thread_type", str);
            }
        }
        Iterator it2 = this.A01.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
        C79u c79u2 = this.A00;
        if (c79u2 == null || c79u2.A02.BV8()) {
            return;
        }
        Iterator it3 = c79u2.A04.iterator();
        while (it3.hasNext()) {
            c79u2.A01.markerPoint(((Number) it3.next()).intValue(), -599342816, "beforeTextChanged_end");
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        11T.A0F(charSequence, 0);
        C79u c79u = this.A00;
        if (c79u != null) {
            int i4 = i3 - i2;
            if (!c79u.A02.BV8()) {
                Iterator it = c79u.A04.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    QuickPerformanceLogger quickPerformanceLogger = c79u.A01;
                    quickPerformanceLogger.markerPoint(intValue, -599342816, "TEXT_RENDERED");
                    quickPerformanceLogger.markerAnnotate(intValue, -599342816, "count", i4);
                    java.util.Map map = c79u.A00;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            quickPerformanceLogger.markerAnnotate(intValue, -599342816, (String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                }
            }
        }
        Iterator it2 = this.A01.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).onTextChanged(charSequence, i, i2, i3);
        }
        C79u c79u2 = this.A00;
        if (c79u2 == null || c79u2.A02.BV8()) {
            return;
        }
        Iterator it3 = c79u2.A04.iterator();
        while (it3.hasNext()) {
            c79u2.A01.markerPoint(((Number) it3.next()).intValue(), -599342816, "onTextChanged_end");
        }
    }
}
