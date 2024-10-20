package X;

import com.facebook.user.model.User;
import java.util.Comparator;

/* loaded from: DAf.class */
public final class DAf implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        User user = (User) obj;
        User user2 = (User) obj2;
        11T.A0H(user, user2);
        return 11T.A01(user2.A0J, user.A0J);
    }
}
