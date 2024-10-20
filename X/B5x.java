package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.google.common.collect.ImmutableList;

/* loaded from: B5x.class */
public final class B5x extends 2MV {
    public final /* synthetic */ B4B A00;

    public B5x(B4B b4b, 2M8 r303) {
        this.A00 = b4b;
        11T.A0F(r303, 1);
        ((2MW) this).A00 = r303;
    }

    public void AGN() {
        B4B b4b = this.A00;
        B4B.A04(b4b, false);
        b4b.A07.A1Y();
        b4b.A07.A1c(true);
    }

    public void AGO() {
        B4B.A03(this.A00);
    }

    public void AGP() {
        B4B b4b = this.A00;
        Fragment fragment = b4b.A03;
        if (fragment == null || !C0D1.A01(b4b.A0W())) {
            return;
        }
        C06c A0C = AbM.A0C(b4b);
        A0C.A0I(fragment);
        A0C.A0K(b4b.A07);
        C06c.A00(A0C, false);
        b4b.A03 = null;
    }

    public void AGT() {
        B4B.A04(this.A00, true);
    }

    public void AGU() {
        B4B b4b = this.A00;
        Fragment fragment = b4b.A04;
        if (fragment == null || !C0D1.A01(b4b.A0W())) {
            return;
        }
        C06c A0C = AbM.A0C(b4b);
        A0C.A0I(fragment);
        A0C.A0K(b4b.A07);
        C06c.A00(A0C, false);
        b4b.A04 = null;
    }

    public void AGX() {
    }

    public DrawerFolderKey Afd() {
        2Oo r0 = this.A00.A01;
        if (!(r0 instanceof 2Oo)) {
            return null;
        }
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.messaging.navigation.home.drawer.interfaces.DrawerFolderFragment");
        return r0.AiR();
    }

    public void CVe(Context context, ImmutableList immutableList) {
        B4B b4b = this.A00;
        7zP.A0e(((BgB) 1Br.A0B(b4b.A0D)).A00).markerStart(5505182);
        KrE krE = b4b.A06;
        if (krE != null) {
            JU4.A0d(krE.A00);
        }
    }

    public void CVh(Integer num) {
        11T.A0F(num, 0);
        B4B b4b = this.A00;
        6EP r0 = (6EP) ((2OP) 1Br.A0B(b4b.A0B)).A01.getValue();
        if (r0 != null) {
            Fragment fragment = b4b.A02;
            06Z A0W = b4b.A0W();
            11T.A0A(A0W);
            r0.A01(fragment, A0W, num, B4B.A00(b4b));
        }
    }

    public void CVi(C4Mh c4Mh) {
        11T.A0F(c4Mh, 0);
        B4B b4b = this.A00;
        2N1 r0 = b4b.A07;
        2PI r02 = 2PI.A09;
        11T.A0F(r02, 0);
        r0.A1a((Bundle) null, r02);
        DrawerFolderKey drawerFolderKey = c4Mh.A02;
        if (drawerFolderKey instanceof FolderNameDrawerFolderKey) {
            11T.A0I(drawerFolderKey, 1BJ.A00(1852));
            1F9 r03 = ((FolderNameDrawerFolderKey) drawerFolderKey).A00;
            1F9 r04 = 1F9.A0I;
            if (r03 == r04) {
                B4B.A03(b4b);
                ((5dU) 1Hv.A02(4YU.A08(b4b), 83210)).A00(new FolderNameDrawerFolderKey(r04));
                return;
            }
        }
        6EP r05 = (6EP) ((2OP) 1Br.A0B(b4b.A0B)).A01.getValue();
        if (r05 != null) {
            B4B.A02(r05.A00(c4Mh), b4b, c4Mh);
        }
    }

    public void CVj(Fragment fragment, C4Mh c4Mh) {
        B4B.A02(fragment, this.A00, c4Mh);
    }

    public void CVo(C46x c46x) {
        Fragment A00;
        11T.A0F(c46x, 0);
        B4B b4b = this.A00;
        2OK A002 = ((2OI) 1Br.A0B(b4b.A0A)).A00();
        if (A002 == null || (A00 = A002.A00()) == b4b.A03 || !C0D1.A01(b4b.A0W())) {
            return;
        }
        b4b.A03 = A00;
        C06c A0C = AbM.A0C(b4b);
        A0C.A0P(A00, "folder_fragment_tag", 2131364228);
        A0C.A0H(b4b.A07);
        C06c.A00(A0C, false);
    }

    public void CVw(Context context, 06Z r303) {
    }

    public void CW9(Integer num) {
        11T.A0F(num, 0);
        B4B b4b = this.A00;
        1Br.A0C(b4b.A0F);
        Fragment A06 = 2Oj.A06();
        if (A06 == b4b.A00 || !C0D1.A01(b4b.A0W())) {
            return;
        }
        b4b.A00 = A06;
        C06c A0C = AbM.A0C(b4b);
        A0C.A0P(A06, "contextual_fragment_tag", 2131364228);
        A0C.A0H(b4b.A07);
        C06c.A00(A0C, false);
    }

    public void CWL(ThreadViewParams threadViewParams) {
        11T.A0F(threadViewParams, 0);
        KrE krE = this.A00.A06;
        if (krE != null) {
            krE.A01(threadViewParams);
        }
    }

    public void D0P(boolean z) {
        this.A00.A07.A1c(false);
    }

    public void D89(int i, int i2) {
    }
}
