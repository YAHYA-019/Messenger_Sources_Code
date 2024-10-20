package X;

import com.facebook.user.model.User;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: DAg.class */
public final class DAg implements Comparator {
    public final Collator A00;

    public DAg() {
        Collator collator = Collator.getInstance();
        this.A00 = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        User user = (User) obj2;
        String A13 = 7zL.A13((User) obj);
        if (A13 == null) {
            A13 = "";
        }
        String A132 = 7zL.A13(user);
        if (A132 == null) {
            A132 = "";
        }
        return this.A00.compare(A13, A132);
    }
}
