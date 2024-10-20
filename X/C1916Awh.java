package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.Awh, reason: case insensitive filesystem */
/* loaded from: Awh.class */
public final class C1916Awh extends C1rs {
    public 1Iw A00;
    public B0T A01;
    public final BitSet A02;
    public final String[] A03;

    public C1916Awh(1Iw r302, B0T b0t) {
        super(b0t, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "dummySearchBarListener", "headerButtonText", "headerListener", "headerTitleText", "initialSearchText", "isConnectedToInternet", "isFinalResult", "isFinishButtonEnabled", "isSearchNullState", "isSearching", "isServerFailed", "isTincanMode", "listOnScrollListener", "listener", "onTileClickListener", "scrollController", "searchBarListener", "searchSurface", "sections", "selectedUsers", "shouldShowFooterNux", "shouldShowNewErrorStates"};
        BitSet A18 = 1BK.A18(23);
        this.A02 = A18;
        this.A01 = b0t;
        this.A00 = r302;
        A18.clear();
    }

    public static C1916Awh A06(1Iw r301, ImmutableList immutableList) {
        C1916Awh c1916Awh = new C1916Awh(r301, new B0T());
        c1916Awh.A01.A0S = immutableList;
        c1916Awh.A02.set(19);
        return c1916Awh;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public B0T A2V() {
        C1rs.A05(this.A02, this.A03, 23);
        A0J();
        return this.A01;
    }

    public void A2X(2O4 r302) {
        this.A01.A02 = r302;
        this.A02.set(13);
    }

    public void A2Y(C2kx c2kx) {
        this.A01.A04 = c2kx;
        this.A02.set(16);
    }

    public void A2Z(AZV azv) {
        this.A01.A0E = azv;
        this.A02.set(15);
    }

    public void A2a(DI6 di6) {
        this.A01.A0F = di6;
        this.A02.set(3);
    }

    public void A2b(DI7 di7) {
        this.A01.A0G = di7;
        this.A02.set(17);
    }

    public void A2c(DIk dIk) {
        this.A01.A0H = dIk;
        this.A02.set(14);
    }

    public void A2d(2Yl r302) {
        this.A01.A0I = r302;
        this.A02.set(1);
    }

    public void A2e(53M r302) {
        this.A01.A0K = r302;
        this.A02.set(18);
    }

    public void A2f(MigColorScheme migColorScheme) {
        this.A01.A0P = migColorScheme;
        this.A02.set(0);
    }

    public void A2g(ImmutableList immutableList) {
        this.A01.A0U = immutableList;
        this.A02.set(20);
    }

    public void A2h(CharSequence charSequence) {
        this.A01.A0X = charSequence;
        this.A02.set(4);
    }

    public void A2i(String str) {
        this.A01.A0i = str;
        this.A02.set(5);
    }

    public void A2j(boolean z) {
        this.A01.A11 = z;
        this.A02.set(6);
    }

    public void A2k(boolean z) {
        this.A01.A12 = z;
        this.A02.set(7);
    }

    public void A2l(boolean z) {
        this.A01.A13 = z;
        this.A02.set(8);
    }

    public void A2m(boolean z) {
        this.A01.A18 = z;
        this.A02.set(9);
    }

    public void A2n(boolean z) {
        this.A01.A19 = z;
        this.A02.set(10);
    }

    public void A2o(boolean z) {
        this.A01.A1A = z;
        this.A02.set(11);
    }

    public void A2p(boolean z) {
        this.A01.A1B = z;
        this.A02.set(12);
    }

    public void A2q(boolean z) {
        this.A01.A1F = z;
        this.A02.set(21);
    }

    public void A2r(boolean z) {
        this.A01.A1J = z;
        this.A02.set(22);
    }
}
