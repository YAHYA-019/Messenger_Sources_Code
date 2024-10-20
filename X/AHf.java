package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.google.common.collect.ImmutableSet;

/* loaded from: AHf.class */
public final class AHf implements C15h {
    public final int A00;
    public final Object A01;

    public AHf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v145, types: [X.1g7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.6yW, java.lang.Object] */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        C6zc c6zc;
        Context context;
        Fragment fragment;
        C6x0 c6x0;
        ThreadKey threadKey;
        6rJ r306;
        switch (this.A00) {
            case 0:
                return ((1Br) this.A01).get();
            case 1:
                return 1Lo.A07((FbUserSession) this.A01, 99903);
            case 2:
                return 1Lo.A07((FbUserSession) this.A01, 68051);
            case 3:
                return 1De.A00(((9kQ) this.A01).A00, 16979);
            case 4:
                return 1Bu.A06(((87E) this.A01).A02, 16979);
            case 5:
                return 7zR.A0o((Context) 1De.A00(((8C8) this.A01).A00, 83719), 68747);
            case 6:
                C8uV c8uV = (C8uV) this.A01;
                ImmutableSet immutableSet = 6rJ.A1N;
                c6zc = (C6zc) 1Bn.A0A(66601);
                c6x0 = (C6x0) 1Bn.A0A(67253);
                context = c8uV.A00;
                fragment = c8uV.A01;
                threadKey = c8uV.A05;
                r306 = c8uV;
                break;
            case 7:
                return 1Bn.A0A(83430);
            case 8:
                ?? obj = new Object();
                obj.A02(((A5K) this.A01).A02);
                ((6yW) obj).A04 = MontageComposerActivity.class;
                return obj.A00();
            case 9:
                return C3Om.A01(((C8ed) this.A01).A00.A0D, (1yM) 1Bi.A03(16885));
            case 10:
                6rJ r3062 = (C8uU) this.A01;
                ImmutableSet immutableSet2 = 6rJ.A1N;
                c6zc = (C6zc) 1Bn.A0A(66601);
                context = r3062.A00;
                fragment = r3062.A01;
                c6x0 = (C6x0) 1Br.A0B(r3062.A02);
                threadKey = r3062.A03;
                r306 = r3062;
                break;
            case 11:
                6rJ r0 = (6rJ) this.A01;
                ImmutableSet immutableSet3 = 6rJ.A1N;
                String A01 = C3Om.A01(r0.A00, (1yM) 1Bi.A03(16885));
                11T.A0A(A01);
                return A01;
            case 12:
                return 1BK.A0n(7zT.A0x(((9RA) this.A01).A00));
            case 13:
                return 1Bn.A0E(((View) this.A01).getContext(), (1BY) null, 83438);
            case 14:
                return 1Bi.A03(67703);
            case 15:
                return 1Bi.A03(67199);
            case 16:
                return 1Lm.A06(1Fw.A04((1EZ) this.A01), 16888);
            case 17:
                return 1Lm.A06(1Fw.A04((1EZ) this.A01), 16903);
            case 18:
                return 1Lm.A06(1Fw.A04((1EZ) this.A01), 49879);
            default:
                C15h c15h = (C15h) this.A01;
                boolean z = 1Hj.A00;
                ?? obj2 = new Object();
                obj2.A00 = TriState.UNSET;
                obj2.A01 = c15h;
                return obj2;
        }
        return C6zd.A00(context, c6x0.A01(context, threadKey, r306.A0Y() ? null : 6rJ.A1N), fragment, threadKey, c6zc);
    }
}
