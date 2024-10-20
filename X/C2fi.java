package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.2fi, reason: invalid class name */
/* loaded from: 2fi.class */
public final class C2fi {
    public 1BY A00;
    public final C00i A02;
    public final C00i A04;
    public final 23F A07;
    public final C00i A06 = new 1BQ(67196);
    public final 1XZ A05 = (1XZ) 1Bi.A03(65723);
    public final C00i A03 = new 1BQ(66630);
    public UserKey A01 = null;

    public C2fi(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A04 = new 1MV(fbUserSession, (1BY) null, 16907);
        this.A02 = new 1BV((1BY) null, 50189);
        this.A07 = (23F) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 33102);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Comparator] */
    public ImmutableList A00(ThreadSummary threadSummary) {
        User A00;
        UserKey userKey = this.A01;
        if (userKey == null) {
            userKey = (UserKey) 1Bn.A0E((Context) null, this.A00, 83436);
            this.A01 = userKey;
            if (userKey == null) {
                return ImmutableList.of();
            }
        }
        ArrayList arrayList = new ArrayList();
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (!C28p.A01(threadParticipant).equals(userKey) && (A00 = this.A07.A00(C28p.A01(threadParticipant))) != null && this.A05.BX3(A00.A0k)) {
                arrayList.add(A00);
            }
        }
        Collections.sort(arrayList, new Object());
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public String A01(ImmutableList immutableList) {
        Resources resources;
        int i;
        Object[] objArr;
        String str;
        ArrayList arrayList = new ArrayList();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Name name = ((User) it.next()).A0X;
            if (!1JF.A0B(name.firstName)) {
                str = name.firstName;
            } else if (!1JF.A0B(name.A00())) {
                str = name.A00();
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            resources = (Resources) this.A06.get();
            i = 2131952276;
            objArr = new Object[]{arrayList.get(0)};
        } else {
            if (size != 2) {
                int size2 = immutableList.size() - 2;
                return ((Resources) this.A06.get()).getQuantityString(2131820550, size2, arrayList.get(0), arrayList.get(1), Integer.valueOf(size2));
            }
            resources = (Resources) this.A06.get();
            i = 2131952277;
            objArr = new Object[]{arrayList.get(0), arrayList.get(1)};
        }
        return resources.getString(i, objArr);
    }

    public boolean A02(ThreadSummary threadSummary) {
        1XZ r0 = this.A05;
        boolean z = false;
        if (r0.BUJ()) {
            UserKey userKey = this.A01;
            if (userKey == null) {
                userKey = (UserKey) 1Bn.A0E((Context) null, this.A00, 83436);
                this.A01 = userKey;
            }
            if (userKey != null) {
                1Du it = threadSummary.A1L.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UserKey A01 = C28p.A01((ThreadParticipant) it.next());
                    if (!userKey.equals(A01) && r0.BX3(A01)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }
}
