package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: Ewy.class */
public final class Ewy {
    public String A00;
    public String A01;
    public final ConcurrentMap A02 = new ConcurrentHashMap();
    public final ConcurrentMap A03 = new ConcurrentHashMap();

    public Ewy() {
        synchronized (this) {
            String A0t = 1BK.A0t();
            this.A00 = A0t;
            0fH.A0g(A0t, "StorySessionStore", "start new story tray session with session id %s");
        }
    }

    public String A00() {
        String str;
        synchronized (this) {
            str = this.A01;
            if (str == null) {
                str = 1BK.A0t();
                this.A01 = str;
            }
        }
        return str;
    }

    public String A01() {
        String str;
        synchronized (this) {
            str = this.A00;
            str.getClass();
        }
        return str;
    }
}
