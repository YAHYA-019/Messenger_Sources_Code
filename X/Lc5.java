package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: Lc5.class */
public final class Lc5 implements MIt {
    public static final Uri A01;
    public final LogPrinter A00 = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(TraceFieldType.Uri);
        builder.authority("local");
        A01 = builder.build();
    }

    @Override // X.MIt
    public final Uri DCF() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // X.MIt
    public final void DCN(L8Q l8q) {
        ArrayList A17 = 1BK.A17(l8q.A09.values());
        Collections.sort(A17, new Object());
        StringBuilder A0k = AnonymousClass001.A0k();
        int size = A17.size();
        int i = 0;
        while (i < size) {
            Object obj = A17.get(i);
            i++;
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (A0k.length() != 0) {
                    AnonymousClass001.A1H(A0k);
                }
                A0k.append(obj2);
            }
        }
        this.A00.println(A0k.toString());
    }
}
