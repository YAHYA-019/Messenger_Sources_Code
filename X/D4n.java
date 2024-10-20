package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: D4n.class */
public final class D4n implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public D4n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj6;
        this.A03 = obj3;
        this.A07 = str;
        this.A09 = str2;
        this.A06 = obj5;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = obj4;
        this.A08 = str3;
    }

    public void onFailure(Throwable th) {
        if (this.A00 != 0) {
            0fH.A0r(4YT.A00(31), "Failed fetching group thread summary", th);
            ((5O3) ((4aJ) this.A01).A01.get()).A03(StringFormatUtil.formatStrLocaleSafe("Failed fetching group thread summary fortype %s with message %s:", this.A08, th.getMessage()), ((Message) this.A03).A1V, this.A07, this.A09);
            return;
        }
        4aJ r0 = (4aJ) this.A01;
        ThreadKey threadKey = (ThreadKey) this.A05;
        ParticipantInfo participantInfo = (ParticipantInfo) this.A04;
        Message message = (Message) this.A03;
        4aJ.A01((FbUserSession) this.A02, message, participantInfo, threadKey, (ThreadSummary) this.A06, r0, this.A07, this.A08, this.A09);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 == 0) {
            4aJ r0 = (4aJ) this.A01;
            4aJ.A01((FbUserSession) this.A02, (Message) obj, (ParticipantInfo) this.A04, (ThreadKey) this.A05, (ThreadSummary) this.A06, r0, this.A07, this.A08, this.A09);
            return;
        }
        ThreadSummary threadSummary = (ThreadSummary) obj;
        if (threadSummary == null) {
            0fH.A0n(4YT.A00(31), "Group thread summary is null");
            ((5O3) ((4aJ) this.A01).A01.get()).A03("Thread summary is null", ((Message) this.A03).A1V, this.A07, this.A09);
            return;
        }
        String A00 = 4YT.A00(31);
        ThreadKey threadKey = (ThreadKey) this.A06;
        0fH.A0d(1BK.A0w(threadKey), 4YU.A0y(threadKey), A00, "Notifying stella of threadId=%s msysId=%s");
        String str = threadSummary.A20;
        4aJ r02 = (4aJ) this.A01;
        C00i c00i = r02.A04;
        ImmutableList A002 = ((C7H) c00i.get()).A00((FbUserSession) this.A02, threadSummary);
        C28m c28m = (C28m) ((C00i) this.A04).get();
        ParticipantInfo participantInfo = (ParticipantInfo) this.A05;
        String A003 = c28m.A00(participantInfo);
        String A004 = participantInfo.A00();
        Message message = (Message) this.A03;
        String str2 = message.A1V;
        String A0x = 4YU.A0x(message);
        String A0y = 4YU.A0y(threadKey);
        long j = message.A05;
        boolean A15 = threadKey.A15();
        if (Platform.stringIsNullOrEmpty(str)) {
            str = null;
        }
        ImmutableList immutableList = (ImmutableList) 1BK.A0r(A002);
        ImmutableList immutableList2 = (ImmutableList) A002.get(1);
        String A01 = ((C7H) c00i.get()).A01(message);
        ImmutableList immutableList3 = message.A0r;
        boolean A0z = threadKey.A0z();
        String str3 = this.A07;
        int A005 = 4aJ.A00(message, r02);
        Uri uri = threadSummary.A0V;
        String obj2 = uri != null ? uri.toString() : null;
        ImmutableList immutableList4 = (ImmutableList) A002.get(2);
        String l = Long.toString(threadKey.A05);
        Long l2 = threadSummary.A1e;
        4aJ.A02(r02, immutableList, immutableList2, immutableList3, immutableList4, A003, A004, str2, A0x, A0y, str, A01, str3, obj2, l, l2 != null ? AbH.A1B(l2) : null, this.A08, this.A09, A005, j, A15, A0z);
    }
}
