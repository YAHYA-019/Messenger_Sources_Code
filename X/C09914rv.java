package X;

import com.facebook.graphql.enums.GraphQLStructuredNamePart;
import com.facebook.user.model.Name;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.4rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rv.class */
public final class C09914rv {
    static {
        String language = Locale.JAPANESE.getLanguage();
        11T.A0A(language);
        Locale locale = Locale.ROOT;
        11T.A0A(language.toLowerCase(locale));
        String language2 = Locale.KOREAN.getLanguage();
        11T.A0A(language2);
        11T.A0A(language2.toLowerCase(locale));
        String language3 = Locale.CHINESE.getLanguage();
        11T.A0A(language3);
        11T.A0A(language3.toLowerCase(locale));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v0 */
    /* JADX WARN: Type inference failed for: r303v3 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    public static final Name A00(2JX r301, String str) {
        Name name;
        ?? r303 = 0;
        if (r301 != null) {
            str = r301.A0r(3556653);
            ImmutableList A0c = r301.A0c(106437344, 2JX.class, -2086410281);
            11T.A0I(A0c, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.graphql.querybuilder.common.CommonGraphQL2Interfaces.DefaultNamePartFields>");
            if (!A0c.isEmpty()) {
                name = r303;
                if (str != null) {
                    Iterator it = A0c.iterator();
                    String str2 = null;
                    while (it.hasNext()) {
                        2JY r0 = (2JY) it.next();
                        int intValue = r0.getIntValue(-1019779949);
                        int intValue2 = r0.getIntValue(-1106363674);
                        Enum A0g = r0.A0g(GraphQLStructuredNamePart.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 3433459);
                        if (A0g != null) {
                            int offsetByCodePoints = str.offsetByCodePoints(0, intValue);
                            String substring = str.substring(offsetByCodePoints, str.offsetByCodePoints(offsetByCodePoints, intValue2));
                            11T.A0A(substring);
                            if (A0g == GraphQLStructuredNamePart.FIRST) {
                                r303 = substring;
                            } else if (A0g == GraphQLStructuredNamePart.LAST) {
                                str2 = substring;
                            }
                        }
                    }
                    return new Name(r303 == true ? 1 : 0, str2, str);
                }
                return name;
            }
        }
        name = r303;
        if (str != null) {
            name = new Name(str);
        }
        return name;
    }
}
