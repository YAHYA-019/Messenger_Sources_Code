package X;

import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.30d, reason: invalid class name */
/* loaded from: 30d.class */
public final class C30d {
    public static final AnonymousClass207 A0F;
    public Function1 A00;
    public final int A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C1qM A06;
    public final Gv3 A07;
    public final C3d6 A08;
    public final GsE A09;
    public final java.util.Map A0A;
    public final java.util.Map A0B;
    public final Set A0C;
    public final Set A0D;
    public final 1De A0E;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0F = new AnonymousClass207(36W.class, "TypingIndicator");
    }

    public C30d(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0E = r303;
        this.A04 = 1Bq.A00(65723);
        this.A03 = 1Bq.A00(16387);
        1BY r0 = r303.A00;
        this.A02 = 1Lm.A03(fbUserSession, r0, 16686);
        1Br A03 = 1Lm.A03(fbUserSession, r0, 115362);
        this.A05 = A03;
        this.A09 = ((GP6) 1Br.A0B(A03)).A01;
        this.A0B = 1BK.A1C();
        this.A0D = new LinkedHashSet();
        this.A0A = 1BK.A1C();
        this.A0C = new LinkedHashSet();
        this.A08 = new C3d6(this, 2);
        this.A07 = new Gv3(this, 2);
        this.A06 = new Iad(this, 3);
        this.A01 = 2yD.A00(1Br.A07(this.A03), 72622760194540113L);
    }

    public static final void A00(C30d c30d, List list, Set set, Set set2) {
        Object obj;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long valueOf = Long.valueOf(AnonymousClass001.A05(it.next()));
            if (!set2.contains(valueOf) && (obj = c30d.A0A.get(valueOf)) != null) {
                list.add(obj);
            }
        }
    }

    public final boolean A01(ThreadKey threadKey) {
        if (threadKey.A0x()) {
            return this.A0C.contains(Long.valueOf(threadKey.A01));
        }
        Boolean bool = (Boolean) this.A0B.get(threadKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
