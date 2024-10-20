package X;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* loaded from: GAt.class */
public final class GAt extends C00q implements Function1 {
    public static final GAt A00 = new GAt();

    public GAt() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        11T.A0F(resources, 0);
        return Boolean.valueOf(AnonymousClass001.A1Q(resources.getConfiguration().uiMode & 48, 32));
    }
}
