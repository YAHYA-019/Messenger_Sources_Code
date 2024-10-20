package X;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* loaded from: M5h.class */
public final class M5h extends C00q implements Function1 {
    public static final M5h A00 = new M5h();

    public M5h() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        DKC.A1U(obj);
        String str = (String) obj;
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (11T.A0O(forLanguageTag.toLanguageTag(), "und")) {
            android.util.Log.e("Locale", 0Pz.A0j("The language tag ", str, " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."));
        }
        return new KsQ(forLanguageTag);
    }
}
