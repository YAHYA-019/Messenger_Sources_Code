package X;

import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2sg, reason: invalid class name */
/* loaded from: 2sg.class */
public final class C2sg {
    public ImmutableMap A00;
    public List A01;
    public java.util.Map A02;
    public final ImmutableList A03;

    public C2sg(ImmutableList immutableList) {
        this.A03 = immutableList;
    }

    public final java.util.Map A00() {
        java.util.Map map = this.A02;
        java.util.Map map2 = map;
        if (map == null) {
            ImmutableList immutableList = this.A03;
            HashMap hashMap = new HashMap(immutableList.size());
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                User user = (User) it.next();
                UserKey userKey = user.A0k;
                11T.A0A(userKey);
                hashMap.put(userKey, user);
            }
            this.A02 = hashMap;
            map2 = hashMap;
        }
        return map2;
    }
}
