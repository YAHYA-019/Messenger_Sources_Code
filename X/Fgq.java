package X;

import java.util.HashMap;
import org.apache.http.Header;

/* loaded from: Fgq.class */
public final class Fgq implements 1Ro {
    public static final String __redex_internal_original_name = "ResumableUploadGetMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Etm etm = (Etm) obj;
        C04083zw A0T = DKC.A0T();
        AbF.A1P(A0T, "Resumable-Upload-Get");
        A0T.A0J = etm.A00();
        A0T.A0Y = true;
        A0T.A0F = etm.A00;
        A0T.A06 = 0S2.A00;
        A0T.A05(0S2.A01);
        A0T.A0C = etm.A01;
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        GCH.A00(anonymousClass439);
        HashMap A0u = AnonymousClass001.A0u();
        1Du it = anonymousClass439.A01.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            A0u.put(header.getName(), header.getValue());
        }
        return new El0(anonymousClass439.A02(), anonymousClass439.A00, A0u);
    }
}
