package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.impl.client.RequestWrapper;

/* renamed from: X.40a, reason: invalid class name */
/* loaded from: 40a.class */
public final class C40a implements C40b {
    public static final 1G2 A02 = 1G0.A04.A0D("zero_debug_http_filter_enabled");
    public final C00i A00 = new 1BQ(33013);
    public final List A01 = new ArrayList();

    @Override // X.C40b
    public int B4q() {
        return (-1) >>> 1;
    }

    @Override // X.C40b
    public void CZ9(AnonymousClass409 anonymousClass409, RequestWrapper requestWrapper) {
        boolean AZn = ((FbSharedPreferences) this.A00.get()).AZn(A02, false);
        List list = this.A01;
        if (AZn) {
            list.add(0, requestWrapper.getURI().toString());
        } else {
            if (list.isEmpty()) {
                return;
            }
            list.clear();
        }
    }
}
