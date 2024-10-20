package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.stickers.model.StickerSuggestionRule;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pk, reason: invalid class name */
/* loaded from: 6pk.class */
public final class C6pk {
    public final AnonymousClass244 A00 = (AnonymousClass244) 1Bi.A03(68335);

    public static String A00(List list) {
        C26T c26t = C26T.A00;
        C03353xs c03353xs = new C03353xs(c26t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StickerSuggestionRule stickerSuggestionRule = (StickerSuggestionRule) it.next();
            2DM A0g = 4YU.A0g(c26t);
            A0g.A0o("rule", stickerSuggestionRule.A01);
            A0g.A0o("category", stickerSuggestionRule.A00);
            c03353xs.A0d(A0g);
        }
        return c03353xs.toString();
    }

    public ImmutableList A01(String str) {
        if (1JF.A0B(str)) {
            return null;
        }
        24X A0I = this.A00.A0I(str);
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0I.A05()) {
                return builder.build();
            }
            24X A0B = A0I.A0B(i2);
            if (A0B != null) {
                builder.m11011add((Object) new StickerSuggestionRule(C3o5.A0P(A0B, "category", null), JSONUtil.A0H(A0B.A0D("rule"), null)));
            }
            i = i2 + 1;
        }
    }
}
