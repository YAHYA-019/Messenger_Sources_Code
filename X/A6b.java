package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.composer.aibot.discover.activity.AiBotDiscoverActivity;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6b.class */
public final class A6b implements 6xM {
    public HashSet A00 = null;
    public boolean A01;
    public final Context A02;
    public final BOj A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final C6tS A06;
    public final Integer A07;
    public final boolean A08;

    public A6b(Context context, BOj bOj, FbUserSession fbUserSession, ThreadKey threadKey, C6tS c6tS, Integer num, boolean z) {
        this.A05 = threadKey;
        this.A08 = 7zO.A1Y(z);
        this.A03 = bOj;
        this.A02 = context;
        this.A06 = c6tS;
        this.A04 = fbUserSession;
        this.A07 = num;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{A5e.class, A5d.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AiBotDiscoverPlugin";
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [X.6Sh, java.lang.Object] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof A5d) {
            if (!this.A01) {
                this.A01 = true;
            }
            boolean z = this.A08;
            11T.A0F(r304, 0);
            if (z) {
                7FI.A02(r304, 7Aw.A02);
            }
            7FI.A02(r304, (6Sh) new Object());
            return;
        }
        if (r305 instanceof A5e) {
            if (!this.A01) {
                this.A01 = true;
            }
            Context context = this.A02;
            C6tS c6tS = this.A06;
            Integer num = this.A07;
            ThreadKey threadKey = this.A05;
            BOj bOj = this.A03;
            boolean z2 = this.A08;
            11T.A0F(r304, 0);
            AW6 aw6 = new AW6(r304, c6tS, 28);
            ErE erE = (ErE) 1Bn.A0A(68314);
            EU9.A00(context);
            if (AnonymousClass016.A00(context, 1XW.class) != null) {
                08O A0l = 7zR.A0l();
                A0l.A06().A0A(context, C3o5.A0D(context, AiBotDiscoverActivity.class));
            } else {
                erE.A00(context, num, aw6);
            }
            3vU.A04(bOj, 3vV.A00(threadKey), (3vU) 1Bn.A0A(68258), Boolean.valueOf(threadKey.A0z()), "hamburger_menu", 4YU.A0y(threadKey), 0, 18, !z2 ? 1 : 0);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
