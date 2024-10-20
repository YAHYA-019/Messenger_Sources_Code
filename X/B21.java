package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.BitSet;

/* loaded from: B21.class */
public final class B21 extends 2Yf {
    public Bundle A00;
    public 06Z A01;
    public LifecycleOwner A02;
    public FbUserSession A03;
    public 1pI A04;
    public 1F9 A05;
    public ThreadSummary A06;
    public 6Fe A07;
    public DJY A08;
    public MigColorScheme A09;
    public User A0A;
    public ParcelableSecondaryData A0B;
    public String A0C;
    public boolean A0D;

    public B21() {
        super("ProfileBottomSheetSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        ThreadKey threadKey;
        FbUserSession fbUserSession = this.A03;
        ThreadSummary threadSummary = this.A06;
        String str = this.A0C;
        User user = this.A0A;
        DJY djy = this.A08;
        MigColorScheme migColorScheme = this.A09;
        1F9 r0 = this.A05;
        ParcelableSecondaryData parcelableSecondaryData = this.A0B;
        Bundle bundle = this.A00;
        06Z r02 = this.A01;
        1pI r03 = this.A04;
        boolean z = this.A0D;
        LifecycleOwner lifecycleOwner = this.A02;
        6Fe r04 = this.A07;
        1BK.A1M(c1qb, fbUserSession);
        11T.A0F(user, 5);
        11T.A0F(djy, 6);
        11T.A0F(migColorScheme, 8);
        11T.A0F(lifecycleOwner, 15);
        11T.A0F(r04, 16);
        AnonymousClass659 anonymousClass659 = (AnonymousClass659) 1Bn.A0A(82451);
        1WY A0e = 7zQ.A0e();
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        C1854Aur c1854Aur = new C1854Aur(c1qb, new C2019Azg());
        C2019Azg c2019Azg = c1854Aur.A01;
        c2019Azg.A03 = fbUserSession;
        BitSet bitSet = c1854Aur.A02;
        bitSet.set(4);
        c2019Azg.A0C = str;
        bitSet.set(10);
        c2019Azg.A06 = threadSummary;
        bitSet.set(15);
        bitSet.set(14);
        c2019Azg.A08 = djy;
        bitSet.set(2);
        c2019Azg.A0A = user;
        bitSet.set(16);
        c2019Azg.A09 = migColorScheme;
        bitSet.set(0);
        c2019Azg.A05 = r0;
        bitSet.set(5);
        c2019Azg.A0B = parcelableSecondaryData;
        bitSet.set(3);
        c2019Azg.A01 = r02;
        bitSet.set(6);
        c2019Azg.A04 = r03;
        bitSet.set(1);
        c2019Azg.A00 = bundle;
        bitSet.set(9);
        c2019Azg.A0E = z;
        bitSet.set(12);
        c2019Azg.A0D = 1WY.A01(A0e).AZk(36320871975042826L);
        bitSet.set(11);
        anonymousClass659.A00(user, (threadSummary == null || (threadKey = threadSummary.A0l) == null) ? null : 4YU.A0l(threadKey));
        bitSet.set(13);
        c2019Azg.A02 = lifecycleOwner;
        bitSet.set(8);
        c2019Azg.A07 = r04;
        bitSet.set(7);
        C1rs.A05(bitSet, c1854Aur.A03, 17);
        c1854Aur.A0J();
        A0I.A05(c2019Azg);
        A0l.A00(A0I);
        2Ys r05 = A0l.A00;
        11T.A0A(r05);
        return r05;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B21 b21 = (B21) r302;
            MigColorScheme migColorScheme = this.A09;
            MigColorScheme migColorScheme2 = b21.A09;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            1pI r0 = this.A04;
            1pI r02 = b21.A04;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            DJY djy = this.A08;
            DJY djy2 = b21.A08;
            if (djy != null) {
                if (!djy.equals(djy2)) {
                    return false;
                }
            } else if (djy2 != null) {
                return false;
            }
            ParcelableSecondaryData parcelableSecondaryData = this.A0B;
            ParcelableSecondaryData parcelableSecondaryData2 = b21.A0B;
            if (parcelableSecondaryData != null) {
                if (!parcelableSecondaryData.equals(parcelableSecondaryData2)) {
                    return false;
                }
            } else if (parcelableSecondaryData2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A03;
            FbUserSession fbUserSession2 = b21.A03;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            1F9 r03 = this.A05;
            1F9 r04 = b21.A05;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            06Z r05 = this.A01;
            06Z r06 = b21.A01;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            6Fe r07 = this.A07;
            6Fe r08 = b21.A07;
            if (r07 != null) {
                if (!r07.equals(r08)) {
                    return false;
                }
            } else if (r08 != null) {
                return false;
            }
            LifecycleOwner lifecycleOwner = this.A02;
            LifecycleOwner lifecycleOwner2 = b21.A02;
            if (lifecycleOwner != null) {
                if (!lifecycleOwner.equals(lifecycleOwner2)) {
                    return false;
                }
            } else if (lifecycleOwner2 != null) {
                return false;
            }
            Bundle bundle = this.A00;
            Bundle bundle2 = b21.A00;
            if (bundle != null) {
                if (!bundle.equals(bundle2)) {
                    return false;
                }
            } else if (bundle2 != null) {
                return false;
            }
            if (this.A0D != b21.A0D) {
                return false;
            }
            ThreadSummary threadSummary = this.A06;
            ThreadSummary threadSummary2 = b21.A06;
            if (threadSummary != null) {
                if (!threadSummary.equals(threadSummary2)) {
                    return false;
                }
            } else if (threadSummary2 != null) {
                return false;
            }
            User user = this.A0A;
            User user2 = b21.A0A;
            if (user != null) {
                if (!user.equals(user2)) {
                    return false;
                }
            } else if (user2 != null) {
                return false;
            }
            String str = this.A0C;
            String str2 = b21.A0C;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }
}
