package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3u1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3u1.class */
public final class C02113u1 {
    public 2V3 A00;
    public ImmutableList A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C21h A04;
    public final ConcurrentHashMap A05;
    public final FbUserSession A06;
    public final 1De A07;
    public final MailboxCallback A08;

    public C02113u1(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = fbUserSession;
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        this.A01 = of;
        this.A05 = new ConcurrentHashMap();
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 83978);
        this.A03 = 1Lm.A03(fbUserSession, r0, 33124);
        this.A04 = new C21h() { // from class: X.3u2
            {
                super("thread_action_system_status_list");
            }

            @Override // X.C21h
            public void A00(Set set) {
                C02113u1.A00(C02113u1.this);
            }
        };
        this.A08 = new MailboxCallback() { // from class: X.3u3
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                1qX r02;
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                C02113u1 c02113u1 = C02113u1.this;
                11T.A0D(mailboxNullable);
                if (mailboxNullable == null || (r02 = (1qX) mailboxNullable.value) == null) {
                    return;
                }
                ConcurrentHashMap concurrentHashMap = c02113u1.A05;
                concurrentHashMap.clear();
                int count = r02.mResultSet.getCount();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= count) {
                        break;
                    }
                    long j = r02.mResultSet.getLong(i2, 0);
                    String string = r02.mResultSet.getString(i2, 1);
                    Long valueOf = Long.valueOf(j);
                    11T.A0D(string);
                    concurrentHashMap.put(valueOf, string);
                    i = i2 + 1;
                }
                2V3 r03 = c02113u1.A00;
                if (r03 != null) {
                    r03.A00("thread_action_system", c02113u1.A01);
                }
            }
        };
    }

    public static final void A00(C02113u1 c02113u1) {
        ImmutableList immutableList = c02113u1.A01;
        ArrayList arrayList = new ArrayList(C1A3.A1D(immutableList, 10));
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ThreadKey) it.next()).A0r()));
        }
        C3u4 c3u4 = (C3u4) c02113u1.A02.A00.get();
        MailboxCallback mailboxCallback = c02113u1.A08;
        1Um AQV = c3u4.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (mailboxCallback != null) {
            mailboxFutureImpl.Cu4(mailboxCallback);
        }
        if (AQV.Cj2(new C3u5(mailboxFutureImpl, c3u4, arrayList))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public final void A01(2V3 r302) {
        if (r302 != null) {
            this.A00 = r302;
        }
        if (!this.A01.isEmpty()) {
            this.A05.clear();
            A00(this);
        }
        ((C21N) this.A03.A00.get()).A00(this.A04);
    }
}
