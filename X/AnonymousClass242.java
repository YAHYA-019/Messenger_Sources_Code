package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.242, reason: invalid class name */
/* loaded from: 242.class */
public final class AnonymousClass242 {
    public 1BY A00;
    public final C28m A02;
    public final FbUserSession A03;
    public final AnonymousClass243 A01 = (AnonymousClass243) 1Bn.A0E((Context) null, (1BY) null, 68334);
    public final UserKey A06 = (UserKey) 1Bn.A0E((Context) null, (1BY) null, 83438);
    public final C00i A04 = new 1BV((1BY) null, 83436);
    public final C00i A05 = new 1BV((1BY) null, 17074);
    public final Set A07 = new HashSet();

    public AnonymousClass242(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A03 = fbUserSession;
        this.A02 = (C28m) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 16908);
    }

    public static ParticipantInfo A00(Message message, ThreadSummary threadSummary) {
        ParticipantInfo A01;
        ParticipantInfo A02;
        ParticipantInfo participantInfo = message.A0K;
        if (threadSummary != null) {
            if (participantInfo == null) {
                A01 = null;
            } else {
                ImmutableList immutableList = threadSummary.A1L;
                UserKey userKey = participantInfo.A0F;
                A01 = A01(userKey, immutableList);
                if (A01 == null) {
                    A01 = A01(userKey, threadSummary.A1G);
                    if (A01 == null) {
                        if (User.A01(userKey.type) && (A02 = A02(participantInfo.A0J, immutableList)) != null) {
                            return A02;
                        }
                    }
                }
            }
            return A01;
        }
        return participantInfo;
    }

    public static ParticipantInfo A01(UserKey userKey, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (Objects.equal(userKey, C28p.A01(threadParticipant))) {
                return threadParticipant.A05;
            }
        }
        return null;
    }

    public static ParticipantInfo A02(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (Objects.equal(str, C28p.A03(threadParticipant))) {
                return threadParticipant.A05;
            }
        }
        return null;
    }

    public static ThreadParticipant A03(AnonymousClass242 anonymousClass242, C1yg c1yg, ThreadSummary threadSummary) {
        ThreadParticipant threadParticipant = null;
        if (threadSummary != null) {
            ImmutableList immutableList = threadSummary.A1L;
            if (immutableList.size() >= 1) {
                ThreadKey threadKey = threadSummary.A0n;
                if (threadKey.A06 == c1yg || (ThreadKey.A0p(threadKey) && immutableList.size() == 2)) {
                    threadParticipant = anonymousClass242.A08(threadSummary);
                }
            }
        }
        return threadParticipant;
    }

    public static ThreadParticipant A04(AnonymousClass242 anonymousClass242, ThreadSummary threadSummary) {
        UserKey userKey = anonymousClass242.A06;
        if (userKey == null) {
            return null;
        }
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (!Objects.equal(C28p.A01(threadParticipant), userKey)) {
                return threadParticipant;
            }
        }
        return null;
    }

    public static ThreadParticipant A05(ThreadSummary threadSummary, UserKey userKey) {
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (C28p.A01(threadParticipant).equals(userKey)) {
                return threadParticipant;
            }
        }
        return null;
    }

    public static ImmutableList A06(AnonymousClass242 anonymousClass242, ThreadSummary threadSummary) {
        ImmutableList.Builder builder;
        if (ThreadKey.A0Y(threadSummary.A0n)) {
            builder = ImmutableList.builder();
            1Du it = threadSummary.A1L.iterator();
            while (it.hasNext()) {
                ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
                if (!Objects.equal(threadParticipant.A05.A0F, anonymousClass242.A06)) {
                    builder.m11011add((Object) threadParticipant);
                }
            }
        } else {
            ImmutableList immutableList = threadSummary.A1L;
            C1qN c1qN = new C1qN(immutableList.size());
            1Du it2 = immutableList.iterator();
            while (it2.hasNext()) {
                ThreadParticipant threadParticipant2 = (ThreadParticipant) it2.next();
                UserKey userKey = threadParticipant2.A05.A0F;
                if (!Objects.equal(userKey, anonymousClass242.A06)) {
                    c1qN.put(userKey, threadParticipant2);
                }
            }
            builder = ImmutableList.builder();
            1Du it3 = threadSummary.A1Q.iterator();
            while (it3.hasNext()) {
                Object remove = c1qN.remove(((ParticipantInfo) it3.next()).A0F);
                if (remove != null) {
                    builder.m11011add(remove);
                }
            }
            builder.addAll(c1qN.values());
        }
        return builder.build();
    }

    public static ImmutableList A07(List list, boolean z) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadParticipant threadParticipant = (ThreadParticipant) it.next();
            if (!z || threadParticipant.A03() != 0S2.A0C) {
                builder.m11011add((Object) threadParticipant.A05);
            }
        }
        return builder.build();
    }

    public ThreadParticipant A08(ThreadSummary threadSummary) {
        ThreadParticipant threadParticipant = null;
        ThreadParticipant A04 = A04(this, threadSummary);
        if (A04 != null) {
            return A04;
        }
        ImmutableList immutableList = threadSummary.A1L;
        if (!immutableList.isEmpty()) {
            threadParticipant = (ThreadParticipant) immutableList.get(0);
        }
        return threadParticipant;
    }

    public ImmutableList A09(ThreadSummary threadSummary) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            UserKey A01 = C28p.A01((ThreadParticipant) it.next());
            if (!A01.equals(this.A04.get())) {
                builder.m11011add((Object) A01);
            }
        }
        return builder.build();
    }

    public ImmutableList A0A(ThreadSummary threadSummary) {
        ImmutableList A07;
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A06 == C1yg.ONE_TO_ONE) {
            ThreadParticipant A04 = A04(this, threadSummary);
            A07 = A04 != null ? ImmutableList.of((Object) A04.A05) : ImmutableList.of();
        } else {
            A07 = A07(A06(this, threadSummary), false);
        }
        if (A07.size() == 1) {
            ParticipantInfo participantInfo = (ParticipantInfo) A07.get(0);
            UserKey userKey = participantInfo.A0F;
            String A0D = A0D(threadSummary, userKey.id);
            if (A0D == null) {
                A0D = this.A02.A00(participantInfo);
                if (A0D == null) {
                    Set set = this.A07;
                    if (!set.contains(userKey)) {
                        set.add(userKey);
                        0fH.A18("ThreadParticipantUtils", "ThreadKey [%s], ParticipantInfo [%s]", new Object[]{threadKey, participantInfo});
                    }
                    return ImmutableList.of();
                }
            }
            return ImmutableList.of((Object) A0D);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C2gn) this.A05.get()).A00(this.A03, A07).iterator();
        while (it.hasNext()) {
            ParticipantInfo participantInfo2 = (ParticipantInfo) it.next();
            String A0D2 = A0D(threadSummary, participantInfo2.A0F.id);
            if (Platform.stringIsNullOrEmpty(A0D2)) {
                A0D2 = this.A02.A01(participantInfo2);
                if (Platform.stringIsNullOrEmpty(A0D2)) {
                    String str = participantInfo2.A08.A00;
                    A0D2 = null;
                    if (!TextUtils.isEmpty(str)) {
                        A0D2 = str;
                    }
                }
            }
            if (!Platform.stringIsNullOrEmpty(A0D2)) {
                arrayList.add(A0D2);
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ImmutableList A0B(ThreadSummary threadSummary) {
        if (threadSummary.A0n.A06 != C1yg.ONE_TO_ONE) {
            return A07(A06(this, threadSummary), false);
        }
        ThreadParticipant A04 = A04(this, threadSummary);
        return A04 != null ? ImmutableList.of((Object) A04.A05) : ImmutableList.of();
    }

    public String A0C(ParticipantInfo participantInfo, ThreadCustomization threadCustomization) {
        String str;
        if (participantInfo == null || !((Boolean) 1Bi.A03(67703)).booleanValue() || (str = participantInfo.A0F.id) == null) {
            return null;
        }
        String A02 = threadCustomization.A00.A02(this.A01, str);
        if (1JF.A0B(A02)) {
            return null;
        }
        return A02;
    }

    public String A0D(ThreadSummary threadSummary, String str) {
        if (threadSummary == null || !((Boolean) 1Bi.A03(67703)).booleanValue()) {
            return null;
        }
        ThreadCustomization BF2 = threadSummary.BF2();
        if (str == null) {
            return null;
        }
        String A02 = BF2.A00.A02(this.A01, str);
        if (1JF.A0B(A02)) {
            return null;
        }
        return A02;
    }

    public boolean A0E(ThreadSummary threadSummary) {
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            if (Objects.equal(C28p.A01((ThreadParticipant) it.next()), this.A06)) {
                return true;
            }
        }
        return false;
    }
}
