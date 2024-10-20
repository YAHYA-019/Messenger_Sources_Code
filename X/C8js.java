package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.intf.FriendsSubTabTag;
import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.8js, reason: invalid class name */
/* loaded from: 8js.class */
public final class C8js extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 06Z A04;
    public MutableLiveData A05;
    public 2O4 A06;
    public FbUserSession A07;
    public C2xg A08;
    public C2kx A09;
    public C2kf A0A;
    public 8Kw A0B;
    public 2YJ A0C;
    public 9Wy A0D;
    public C9kr A0E;
    public 95Z A0F;
    public C95a A0G;
    public Aaj A0H;
    public 8LH A0I;
    public HighlightsTabFeedLoaderState A0J;
    public C9yk A0K;
    public Aa5 A0L;
    public Aa6 A0M;
    public 8Kh A0N;
    public DJb A0O;
    public C95p A0P;
    public 8Kl A0Q;
    public MigColorScheme A0R;
    public AZg A0S;
    public AZg A0T;
    public ImmutableList A0U;
    public ImmutableList A0V;
    public List A0W;
    public java.util.Map A0X;

    public C8js() {
        super("FriendsTabRootSection");
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[34];
        System.arraycopy(new Object[]{this.A0D, this.A05, Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A0W, Integer.valueOf(this.A03), this.A0B}, 1BK.A1W(new Object[]{this.A0U, this.A0E, this.A0F, this.A0R, this.A08, this.A07, Integer.valueOf(this.A00), this.A04, this.A0H, this.A0I, this.A0V, this.A0J, this.A0S, this.A0C, this.A0T, this.A0O, this.A0P, this.A0Q, this.A0K, this.A0L, this.A0G, this.A06, this.A0X, this.A0M, this.A0N, this.A09, this.A0A}, objArr) ? 1 : 0, objArr, 27, 7);
        return objArr;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cM A01;
        1LI c8eh;
        List list = this.A0W;
        C9yk c9yk = this.A0K;
        8Kl r0 = this.A0Q;
        DJb dJb = this.A0O;
        ImmutableList immutableList = this.A0U;
        2YJ r02 = this.A0C;
        C9kr c9kr = this.A0E;
        9Wy r03 = this.A0D;
        C95p c95p = this.A0P;
        95Z r04 = this.A0F;
        C95a c95a = this.A0G;
        HighlightsTabFeedLoaderState highlightsTabFeedLoaderState = this.A0J;
        int i = this.A01;
        int i2 = this.A03;
        int i3 = this.A00;
        java.util.Map map = this.A0X;
        Aa5 aa5 = this.A0L;
        C2kx c2kx = this.A09;
        C2kf c2kf = this.A0A;
        2O4 r05 = this.A06;
        MigColorScheme migColorScheme = this.A0R;
        int i4 = this.A02;
        8Kw r06 = this.A0B;
        8LH r07 = this.A0I;
        Aaj aaj = this.A0H;
        MutableLiveData mutableLiveData = this.A05;
        FbUserSession fbUserSession = this.A07;
        8Kh r08 = this.A0N;
        Aa6 aa6 = this.A0M;
        06Z r09 = this.A04;
        AZg aZg = this.A0S;
        AZg aZg2 = this.A0T;
        ImmutableList immutableList2 = this.A0V;
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        boolean A1W = AnonymousClass001.A1W(list.get(i4), FriendsSubTabTag.A05);
        if (list.get(i4) != FriendsSubTabTag.A02 && !A1W) {
            if (list.get(i4) == FriendsSubTabTag.A06) {
                2cM A013 = 2cK.A01(r302, (String) null, 0);
                8Or r010 = new 8Or(r302, new C8jr());
                C8jr c8jr = r010.A01;
                c8jr.A0C = migColorScheme;
                BitSet bitSet = r010.A02;
                bitSet.set(0);
                c8jr.A09 = c95a;
                bitSet.set(4);
                c8jr.A0A = c9yk;
                bitSet.set(5);
                c8jr.A07 = r02;
                bitSet.set(3);
                c8jr.A01 = i;
                bitSet.set(12);
                c8jr.A02 = i2;
                bitSet.set(13);
                c8jr.A00 = i3;
                bitSet.set(2);
                c8jr.A0D = map;
                bitSet.set(8);
                c8jr.A0B = aa5;
                bitSet.set(6);
                c8jr.A05 = c2kx;
                bitSet.set(9);
                c8jr.A06 = c2kf;
                bitSet.set(10);
                c8jr.A03 = r05;
                bitSet.set(7);
                c8jr.A08 = r03;
                bitSet.set(11);
                c8jr.A04 = fbUserSession;
                bitSet.set(1);
                C1rs.A05(bitSet, r010.A03, 14);
                r010.A0J();
                7zO.A1C(A013, A012, c8jr);
            } else if (list.get(i4) == FriendsSubTabTag.A04) {
                A01 = 2cK.A01(r302, (String) null, 0);
                c8eh = new C8hb(r09, mutableLiveData, r05, fbUserSession, r03, c95a, aaj, r07, highlightsTabFeedLoaderState, c9yk, aa5, r08, migColorScheme, aZg, immutableList2);
            }
            return A012.A00;
        }
        A01 = 2cK.A01(r302, (String) null, 0);
        c8eh = new C8eh(r05, fbUserSession, c2kx, c2kf, r06, r03, c9kr, r04, aa6, r08, dJb, c95p, r0, migColorScheme, aZg2, immutableList, A1W);
        A01.A2e(c8eh);
        A012.A2d(A01);
        return A012.A00;
    }
}
