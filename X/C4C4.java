package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4C4, reason: invalid class name */
/* loaded from: 4C4.class */
public final class C4C4 {
    public final C4C5 A00;
    public final C4C3 A01;
    public final String A02;

    public C4C4(C4C3 c4c3, String str) {
        if (str == null) {
            throw AnonymousClass001.A0L("Name may not be null");
        }
        if (c4c3 == null) {
            throw AnonymousClass001.A0L("Body may not be null");
        }
        this.A02 = str;
        this.A01 = c4c3;
        this.A00 = new C4C5();
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        String A02 = c4c3.A02();
        if (A02 != null) {
            sb.append("; filename=\"");
            sb.append(A02);
            sb.append("\"");
        }
        A00(HttpRequestMultipart.CONTENT_DISPOSITION, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4c3.A00);
        if (c4c3.A01() != null) {
            sb2.append("; charset=");
            sb2.append(c4c3.A01());
        }
        A00(HttpRequestMultipart.CONTENT_TYPE, sb2.toString());
        A00(HttpRequestMultipart.CONTENT_TRANSFER_ENCODING, c4c3.A03());
    }

    private void A00(String str, String str2) {
        C4C5 c4c5 = this.A00;
        C4C7 c4c7 = new C4C7(str, str2);
        String lowerCase = c4c7.A00.toLowerCase(Locale.US);
        java.util.Map map = c4c5.A01;
        List list = (List) map.get(lowerCase);
        if (list == null) {
            list = new LinkedList();
            map.put(lowerCase, list);
        }
        list.add(c4c7);
        c4c5.A00.add(c4c7);
    }
}
