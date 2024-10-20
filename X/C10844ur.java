package X;

import android.database.Cursor;
import com.facebook.user.model.UserKey;

/* renamed from: X.4ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ur.class */
public final class C10844ur {
    public final C15h A00 = new DBP(this, 12);
    public final C15h A01 = new DBR(1Bn.A0A(16428), this, 3);

    public Cursor A00(String str, boolean z) {
        if (((1PG) 1Bi.A03(66265)).A07()) {
            return null;
        }
        C7pP[] c7pPArr = CkC.A0N;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            C7pP c7pP = c7pPArr[i];
            sb.append(c7pP.A01);
            sb.append(" as ");
            sb.append(c7pP.A00);
            i++;
            if (i >= 9) {
                break;
            }
            if (i != 0) {
                sb.append(',');
            }
        }
        String replace = "select distinct {projection} from threads join thread_participants on thread_participants.thread_key = threads.thread_key join thread_users on thread_users.user_key = thread_participants.user_key where threads.folder = 'inbox' {thread-type-filter} and (thread_users.first_name like ?1 or thread_users.last_name like ?1 or thread_users.name like ?1) {timestamp-filter} {viewer-filter}union select distinct {projection} from threads where threads.folder = 'inbox' {thread-type-filter} and (threads.name like ?1 or threads.name like ?2) {timestamp-filter} order by threads_timestamp_ms desc".replace("{projection}", sb.toString()).replace("{thread-type-filter}", z ? "and (threads.thread_key like 'GROUP%' or threads.thread_key like 'ONE_TO_ONE%')" : "and threads.thread_key like 'GROUP%'").replace("{timestamp-filter}", "").replace("{viewer-filter}", "and not thread_users.user_key = ?4");
        ((UserKey) this.A00.get()).A05().getClass();
        return ((C10654u8) this.A01.get()).A00.AUF().rawQuery(replace, new String[]{0Pz.A0W(str, "%"), 0Pz.A0j("% ", str, "%")});
    }
}
