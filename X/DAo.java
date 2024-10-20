package X;

import com.facebook.user.model.User;
import java.util.Comparator;

/* loaded from: DAo.class */
public final class DAo implements Comparator {
    public static final DAo A00 = new DAo();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((User) ((8Lt) obj).A03).A08, ((User) ((8Lt) obj2).A03).A08);
    }
}
