package X;

import com.facebook.assistant.stella.ipc.common.model.StellaContact;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NicknamesMap;
import com.facebook.user.model.User;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserIdentifier;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.AjM, reason: case insensitive filesystem */
/* loaded from: AjM.class */
public final class C1499AjM extends StellaContact {
    public final /* synthetic */ AnonymousClass243 A00;
    public final /* synthetic */ D33 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ HashMap A03;
    public final /* synthetic */ HashMap A04;
    public final /* synthetic */ HashMap A05;
    public final /* synthetic */ HashSet A06;
    public final /* synthetic */ HashSet A07;
    public final /* synthetic */ java.util.Map A08;

    public C1499AjM(AnonymousClass243 anonymousClass243, D33 d33, User user, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashSet hashSet, HashSet hashSet2, java.util.Map map, float f, long j, long j2, boolean z, boolean z2) {
        this.A01 = d33;
        this.A02 = user;
        this.A04 = hashMap;
        this.A00 = anonymousClass243;
        this.A03 = hashMap2;
        this.A05 = hashMap3;
        this.A07 = hashSet;
        this.A06 = hashSet2;
        this.A08 = map;
        UserIdentifier userIdentifier = user.A0i;
        this.threadId = (userIdentifier instanceof UserFbidIdentifier ? (UserFbidIdentifier) userIdentifier : null).A00;
        this.fullName = 7zL.A13(user);
        if (z) {
            this.profilePictureSquareUrl = user.A07();
        }
        if (hashMap.containsKey(this.threadId)) {
            this.nickName = ((NicknamesMap) hashMap.get(this.threadId)).A02(anonymousClass243, this.threadId);
        }
        this.isEpdRestricted = AnonymousClass001.A1W(user.A0p, 1Ks.A02);
        this.userRank = hashMap2.containsKey(this.threadId) ? ((Number) hashMap2.get(this.threadId)).floatValue() / f : 0.0f;
        1MA r0 = user.A0h;
        if (r0 != null && r0 != 1MA.A0T) {
            this.relationship = r0.toString();
        }
        boolean z3 = true;
        if (z2) {
            0fH.A07(B9p.class, Integer.valueOf(hashMap3.size()), "Defaulting all contacts to e2ee, had %s threads");
        } else if (!hashSet.contains(this.threadId) && !hashSet2.contains(this.threadId)) {
            z3 = false;
        }
        this.isE2ee = z3;
        this.isGroup = false;
        this.groupChatParticipant = null;
        if (hashMap3.containsKey(this.threadId)) {
            Integer num = (Integer) hashMap3.get(this.threadId);
            if (num.intValue() < j) {
                this.msgRank = num;
            }
        }
        ThreadKey A0H = ThreadKey.A0H(Long.parseLong(this.threadId), j2);
        if (map.containsKey(A0H)) {
            Integer num2 = (Integer) map.get(A0H);
            if (num2.intValue() < j) {
                this.callRank = num2;
            }
        }
    }
}
