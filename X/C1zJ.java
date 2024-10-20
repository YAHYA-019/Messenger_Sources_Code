package X;

import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1zJ, reason: invalid class name */
/* loaded from: 1zJ.class */
public final class C1zJ {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public ParticipantInfo A05;
    public C1zL A06;
    public 1M1 A07;
    public UserKey A08;
    public HeterogeneousMap A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public Set A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public C1zJ() {
        this.A0D = new HashSet();
        this.A0E = true;
        this.A04 = -1;
        this.A00 = -1;
    }

    public C1zJ(ThreadParticipant threadParticipant) {
        this.A0D = AnonymousClass001.A0v();
        threadParticipant.getClass();
        this.A06 = threadParticipant.A06;
        this.A0E = threadParticipant.A0E;
        this.A0A = threadParticipant.A0A;
        this.A08 = threadParticipant.A08;
        this.A0F = threadParticipant.A0F;
        this.A0G = threadParticipant.A0G;
        this.A0H = threadParticipant.A0H;
        this.A0I = threadParticipant.A0I;
        this.A0B = threadParticipant.A0B;
        this.A01 = threadParticipant.A01;
        this.A02 = threadParticipant.A02;
        this.A03 = threadParticipant.A03;
        this.A09 = threadParticipant.A09;
        this.A04 = threadParticipant.A04;
        this.A05 = threadParticipant.A05;
        this.A07 = threadParticipant.A07;
        this.A00 = threadParticipant.A00;
        this.A0C = threadParticipant.A0C;
        this.A0D = new HashSet(threadParticipant.A0D);
    }

    public static void A00(C1zJ c1zJ, String str) {
        if (c1zJ.A0D.contains(str)) {
            return;
        }
        HashSet hashSet = new HashSet(c1zJ.A0D);
        c1zJ.A0D = hashSet;
        hashSet.add(str);
    }

    public void A01(ParticipantInfo participantInfo) {
        this.A05 = participantInfo;
        C1pq.A08("participantInfo", participantInfo);
    }

    public void A02(C1zL c1zL) {
        this.A06 = c1zL;
        C1pq.A08("adminType", c1zL);
        A00(this, "adminType");
    }
}
