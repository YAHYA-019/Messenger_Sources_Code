package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: D2z.class */
public final class D2z implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public D2z(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj2;
        this.A04 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        boolean z;
        FetchThreadResult A0c;
        MessagesCollection messagesCollection;
        switch (this.A00) {
            case 0:
                C68t c68t = (C68t) this.A01;
                Message message = (Message) this.A02;
                Object obj2 = this.A03;
                Context context = (Context) this.A04;
                Boolean bool = (Boolean) obj;
                C00i c00i = c68t.A02;
                C7N c7n = (C7N) c00i.get();
                String str = message == null ? null : message.A1V;
                boolean booleanValue = bool.booleanValue();
                if (str != null) {
                    Number A0o = 1BK.A0o(str, c7n.A01);
                    if (A0o != null) {
                        7zP.A0e(c7n.A00).markerAnnotate(268767160, A0o.intValue(), "is_auto_login_eligible", booleanValue);
                    }
                }
                if (booleanValue) {
                    0fH.A0j(4YT.A00(230), "Eligible for auto login on Facebook");
                    Uri.Builder buildUpon = C0A2.A03(0Pz.A0W(C1ic.A18, "auto_login")).buildUpon();
                    11T.A0A(buildUpon);
                    buildUpon.appendQueryParameter("src", String.valueOf(1));
                    buildUpon.appendQueryParameter("redirect", obj2.toString());
                    Uri build = buildUpon.build();
                    11T.A0A(build);
                    Intent A09 = 4YU.A09(build);
                    if (FE6.A01(context, A09)) {
                        z = true;
                        ((C7N) c00i.get()).A00(0S2.A1G, str, (String) null, true);
                        0LS.A0B(context, A09);
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                if (AnonymousClass001.A1V(obj)) {
                    C68t c68t2 = (C68t) this.A01;
                    C00i c00i2 = C68t.A0P;
                    ((FIu) c68t2.A07.get()).A09((Context) this.A02, (Uri) this.A04, (C5id) this.A03);
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                OperationResult operationResult = (OperationResult) obj;
                MontageBucketInfo montageBucketInfo = null;
                if (operationResult != null && (A0c = AbM.A0c(operationResult)) != null && (messagesCollection = A0c.A03) != null) {
                    ThreadSummary threadSummary = A0c.A05;
                    threadSummary.getClass();
                    ImmutableList reverse = messagesCollection.A01.reverse();
                    C12147zf c12147zf = (C12147zf) this.A01;
                    long j = ((ThreadKey) this.A03).A04;
                    HashSet A0v = AnonymousClass001.A0v();
                    ImmutableList.of();
                    ImmutableList A0E = ((60V) c12147zf.A03.get()).A0E(reverse);
                    C1pq.A08("cards", A0E);
                    ImmutableList immutableList = threadSummary.A1L;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int size = immutableList.size();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < size) {
                            ThreadParticipant threadParticipant = (ThreadParticipant) immutableList.get(i2);
                            String A02 = C28p.A02(threadParticipant);
                            UserKey A01 = C28p.A01(threadParticipant);
                            C1pq.A08("userKey", A01);
                            if (A02 == null) {
                                A02 = "";
                            }
                            builder.m11011add((Object) new MontageUser(A01, A02, threadParticipant.A03));
                            i = i2 + 1;
                        } else {
                            ImmutableList build2 = builder.build();
                            montageBucketInfo = new MontageBucketInfo(A0E, build2, C1pq.A07(build2, "seenByUserList", A0v, A0v), 1, j, false);
                            MontageBucketInfo A03 = ((6uX) 1Lo.A04((Context) null, (FbUserSession) this.A02, c12147zf.A00, 85200)).A03(1BK.A0X(((User) this.A04).A13));
                            if (A03 != null) {
                                ImmutableList.Builder builder2 = ImmutableList.builder();
                                HashSet A0v2 = AnonymousClass001.A0v();
                                ImmutableList immutableList2 = A03.A02;
                                int size2 = immutableList2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    A0v2.add(((MontageCard) immutableList2.get(i3)).A0E);
                                }
                                ImmutableList immutableList3 = montageBucketInfo.A02;
                                int size3 = immutableList3.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    MontageCard montageCard = (MontageCard) immutableList3.get(i4);
                                    if (!A0v2.contains(montageCard.A0E)) {
                                        builder2.m11011add((Object) montageCard);
                                    }
                                }
                                builder2.addAll(immutableList2);
                                HashSet A0v3 = AnonymousClass001.A0v();
                                ImmutableList.of();
                                ImmutableList build3 = builder2.build();
                                C1pq.A08("cards", build3);
                                long j2 = montageBucketInfo.A01;
                                ImmutableList A00 = montageBucketInfo.A00();
                                return new MontageBucketInfo(build3, A00, C1pq.A07(A00, "seenByUserList", A0v3, A0v3), 1, j2, false);
                            }
                        }
                    }
                }
                return montageBucketInfo;
        }
    }
}
