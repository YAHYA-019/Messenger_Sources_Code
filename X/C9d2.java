package X;

import android.net.Uri;
import com.facebook.messaging.aibot.aiplugins.search.models.AISearchSource;
import java.net.URLDecoder;
import java.util.List;

/* renamed from: X.9d2, reason: invalid class name */
/* loaded from: 9d2.class */
public abstract class C9d2 {
    public static final Uri A00(String str) {
        C04t c04t = new C04t("\\[[^\\]]*\\]");
        String decode = URLDecoder.decode(str, "UTF-8");
        11T.A0D(decode);
        Uri parse = Uri.parse(c04t.A02(decode, ARo.A00));
        11T.A0A(parse);
        return parse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r310v1 */
    /* JADX WARN: Type inference failed for: r310v2, types: [java.util.AbstractCollection] */
    public static final List A01(Uri uri) {
        List list;
        if (uri != null) {
            Uri A00 = A00(11T.A02(uri));
            List<String> queryParameters = A00.getQueryParameters("source_titles");
            String A002 = DKB.A00(53);
            11T.A0I(queryParameters, A002);
            List<String> queryParameters2 = A00.getQueryParameters("source_sub_titles");
            11T.A0I(queryParameters2, A002);
            List<String> queryParameters3 = A00.getQueryParameters("source_urls");
            11T.A0I(queryParameters3, A002);
            List<String> queryParameters4 = A00.getQueryParameters("source_favicons");
            11T.A0I(queryParameters4, A002);
            if (queryParameters.size() == queryParameters2.size() && queryParameters2.size() == queryParameters3.size() && !queryParameters.isEmpty()) {
                list = AnonymousClass001.A0s();
                int size = queryParameters.size();
                for (int i = 0; i < size; i++) {
                    list.add(new AISearchSource(1BK.A14(queryParameters, i), 1BK.A14(queryParameters2, i), 1BK.A14(queryParameters3, i), queryParameters4.size() == queryParameters3.size() ? 1BK.A14(queryParameters4, i) : null));
                }
                return list;
            }
        }
        list = C0ty.A00;
        return list;
    }
}
