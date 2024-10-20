package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: A6a.class */
public final class A6a implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final Fragment A02;
    public final FbUserSession A03;
    public final ThreadKey A04;
    public final ThreadKey A05;
    public final 76D A06;

    public A6a(Fragment fragment, FbUserSession fbUserSession, ThreadKey threadKey, ThreadKey threadKey2, 76D r306) {
        this.A02 = fragment;
        this.A05 = threadKey2;
        this.A04 = threadKey;
        r306.getClass();
        this.A06 = r306;
        this.A03 = fbUserSession;
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{8Nb.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AiBotShareBackPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 8Nb) {
            if (!this.A01) {
                this.A01 = true;
            }
            8Nb r0 = (8Nb) r305;
            ThreadKey threadKey = this.A04;
            ThreadKey threadKey2 = this.A05;
            76D r02 = this.A06;
            FbUserSession fbUserSession = this.A03;
            2Oh r03 = this.A02;
            boolean A1X = 1BL.A1X(r304, r0);
            Executor A1E = 7zM.A1E(16460);
            1qK A0V = 7zR.A0V();
            if (1qK.A01(A0V).AZn(1qK.A02(A0V).A00("ai_bot_share_back_nux_seen"), false)) {
                A1E.execute(new AH9(r304.A00, fbUserSession, threadKey, threadKey2, r02, r0.A00));
                if (r03 instanceof 2Oh) {
                    r03.CfF();
                    return;
                }
                return;
            }
            1Bn.A0A(67527);
            Context context = r304.A00;
            DR6 A01 = C5ic.A01(context, (MigColorScheme) 1Bu.A06(context, 16979));
            A01.A03(context.getString(2131952671));
            A01.A0J(context.getString(2131952670));
            A01.A0G(new C9nn(A1X ? 1 : 0, r0, threadKey, r03, r02, fbUserSession, A1E, r304, threadKey2), context.getString(2131957332));
            A01.A0E(new DialogInterface.OnClickListener() { // from class: X.9o3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, context.getString(2131955696));
            A01.A05();
            1Ql.A01(7zO.A0b(A0V), 1qK.A02(A0V).A00("ai_bot_share_back_nux_seen"), A1X);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
