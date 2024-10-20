package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.79x, reason: invalid class name */
/* loaded from: 79x.class */
public final class C79x implements TextWatcher {
    public final HashMap A04 = new HashMap();
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();
    public final 1Br A00 = 1Bq.A00(16385);

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        11T.A0F(editable, 0);
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                7IB r0 = (7IB) it.next();
                Iterator it2 = r0.A02.iterator();
                while (it2.hasNext()) {
                    editable.removeSpan(it2.next());
                }
                editable.removeSpan(r0);
            }
            arrayList.clear();
        }
        HashMap hashMap = this.A04;
        int i = -1;
        if (!hashMap.isEmpty()) {
            int length = editable.length();
            Iterator A0x = AnonymousClass001.A0x(hashMap);
            boolean z = false;
            int i2 = -1;
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                Object key = A0z.getKey();
                String A16 = 1BK.A16(A0z);
                if (editable.getSpanStart(key) >= 0) {
                    length = Math.min(editable.getSpanStart(key), length);
                    i2 = Math.max(editable.getSpanEnd(key), i2);
                    z = 1Br.A07(this.A00).AZk(36324084611108284L) ? 0CU.A0T(A16, editable.subSequence(length, i2).toString(), false) : true;
                    editable.removeSpan(key);
                }
            }
            if (z) {
                int i3 = length - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = editable.length();
                if (i2 > length2) {
                    i2 = length2;
                }
                editable.delete(i3, i2);
            } else {
                hashMap.clear();
            }
        }
        ArrayList arrayList2 = this.A02;
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                editable.removeSpan(it3.next());
            }
        }
        ArrayList arrayList3 = this.A01;
        if (!arrayList3.isEmpty()) {
            int length3 = editable.length();
            Iterator it4 = arrayList3.iterator();
            boolean z2 = false;
            while (it4.hasNext()) {
                Object next = it4.next();
                if (editable.getSpanStart(next) >= 0) {
                    length3 = Math.min(editable.getSpanStart(next), length3);
                    i = Math.max(editable.getSpanEnd(next), i);
                    editable.removeSpan(next);
                    z2 = true;
                }
            }
            if (z2) {
                editable.delete(Math.max(length3 - 1, 0), Math.min(i, editable.length()));
            } else {
                arrayList3.clear();
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length;
        int length2;
        11T.A0F(charSequence, 0);
        HashMap hashMap = this.A04;
        if (!hashMap.isEmpty()) {
            hashMap.clear();
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        int i4 = i + i2;
        7Sf[] r0 = (7Sf[]) valueOf.getSpans(i, i4, 7Sf.class);
        7IB[] r02 = (7IB[]) valueOf.getSpans(i, i4, 7IB.class);
        if (r0 != null && (length2 = r0.length) != 0) {
            if (i2 <= i3) {
                ArrayList arrayList = this.A03;
                arrayList.clear();
                11T.A0D(r02);
                int length3 = r02.length;
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 >= length3) {
                        break;
                    }
                    7IB r03 = r02[i6];
                    if (i != 0 && i != valueOf.getSpanStart(r03) && i != valueOf.getSpanEnd(r03)) {
                        arrayList.add(r03);
                    }
                    i5 = i6 + 1;
                }
            } else {
                ArrayList A0t = AnonymousClass001.A0t(length2);
                int i7 = 0;
                do {
                    7Sf r04 = r0[i7];
                    A0t.add(1BK.A1G(r04, valueOf.subSequence(Math.max(valueOf.getSpanStart(r04), 0), Math.min(valueOf.getSpanEnd(r04), valueOf.length())).toString()));
                    i7++;
                } while (i7 < length2);
                04R.A0H(A0t, hashMap);
            }
        }
        7Sg[] r05 = (7Sg[]) valueOf.getSpans(i, i4, 7Sg.class);
        if (r05 == null || (length = r05.length) == 0) {
            return;
        }
        if (i2 > i3) {
            0QU.A0u(this.A01, r05);
            return;
        }
        ArrayList arrayList2 = this.A02;
        arrayList2.clear();
        int i8 = 0;
        do {
            7Sg r06 = r05[i8];
            if (i != 0 && i != valueOf.getSpanStart(r06) && i != valueOf.getSpanEnd(r06)) {
                arrayList2.add(r06);
            }
            i8++;
        } while (i8 < length);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
