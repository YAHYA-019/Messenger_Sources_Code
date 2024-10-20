package X;

import android.app.Person;
import android.content.pm.ShortcutInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C7x.class */
public final class C7x {
    public final int A00;
    public final Person A01;
    public final ShortcutInfo A02;
    public final ThreadKey A03;
    public final String A04;

    public C7x(Person person, ShortcutInfo shortcutInfo, ThreadKey threadKey, String str, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A01 = person;
        C1pq.A08("shortcutInfo", shortcutInfo);
        this.A02 = shortcutInfo;
        C1pq.A08("threadKey", threadKey);
        this.A03 = threadKey;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7x)) {
                return false;
            }
            C7x c7x = (C7x) obj;
            if (!11T.A0O(this.A04, c7x.A04) || this.A00 != c7x.A00 || !11T.A0O(this.A01, c7x.A01) || !11T.A0O(this.A02, c7x.A02) || !11T.A0O(this.A03, c7x.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, (C1pq.A03(this.A04) * 31) + this.A00)));
    }
}
