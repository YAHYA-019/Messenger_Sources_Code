package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2gn, reason: invalid class name */
/* loaded from: 2gn.class */
public final class C2gn {
    public final C2go A00 = (C2go) 1Bn.A0A(17075);

    public ArrayList A00(FbUserSession fbUserSession, List list) {
        23F r0 = (23F) 1Lo.A06(fbUserSession, 33102);
        final HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserKey userKey = ((ParticipantInfo) it.next()).A0F;
            User A00 = r0.A00(userKey);
            hashMap.put(userKey, Float.valueOf(A00 != null ? A00.A08 : 0.0f));
        }
        Comparator comparator = new Comparator(hashMap) { // from class: X.2gp
            public final java.util.Map A00;

            {
                this.A00 = hashMap;
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                java.util.Map map = this.A00;
                Number number = (Number) map.get(((ParticipantInfo) obj).A0F);
                Number number2 = (Number) map.get(((ParticipantInfo) obj2).A0F);
                float f = 0.0f;
                float floatValue = number2 != null ? number2.floatValue() : 0.0f;
                if (number != null) {
                    f = number.floatValue();
                }
                return Float.compare(floatValue, f);
            }
        };
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, comparator);
        return arrayList;
    }
}
