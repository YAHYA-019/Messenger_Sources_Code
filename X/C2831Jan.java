package X;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.Jan, reason: case insensitive filesystem */
/* loaded from: Jan.class */
public final class C2831Jan extends DragGestureNode implements MNX, MNP, MNQ, MNT, MNN {
    public MJw A00;
    public MBC A01;
    public MBD A02;
    public Function2 A03;
    public Function2 A04;
    public final C2890JcK A05;
    public final LMk A06;
    public final C2900Jcl A07;
    public final ScrollableNestedScrollConnection A08;
    public final ScrollingLogic A09;
    public final NestedScrollDispatcher A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.JcK, X.MBc, X.MBR] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.LPR, X.MBc, X.Jcp] */
    public C2831Jan(MJw mJw, MBC mbc, KMT kmt, MKN mkn, MMs mMs, boolean z, boolean z2) {
        super(kmt, mMs, ScrollableKt.A03, z);
        this.A00 = mJw;
        this.A01 = mbc;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.A0A = nestedScrollDispatcher;
        C2900Jcl c2900Jcl = new C2900Jcl(z);
        A0H(c2900Jcl);
        this.A07 = c2900Jcl;
        MBC lMk = new LMk(new LML(new LMT(ScrollableKt.A01)), ScrollableKt.A02);
        this.A06 = lMk;
        MJw mJw2 = this.A00;
        MBC mbc2 = this.A01;
        ScrollingLogic scrollingLogic = new ScrollingLogic(mJw2, mbc2 == null ? lMk : mbc2, kmt, mkn, nestedScrollDispatcher, z2);
        this.A09 = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.A08 = scrollableNestedScrollConnection;
        ?? c2890JcK = new C2890JcK(kmt, scrollingLogic, z2);
        A0H(c2890JcK);
        this.A05 = c2890JcK;
        A0H(new NestedScrollNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        A0H(new LPR());
        ?? lpr = new LPR();
        lpr.A00 = c2890JcK;
        A0H(lpr);
        A0H(new C2901Jcm(M6n.A00(this, 13)));
    }

    public void A8q(MHw mHw) {
        mHw.Cmn(false);
    }

    public void A8y(MEV mev) {
        if (super.A05 && (this.A03 == null || this.A04 == null)) {
            this.A03 = new AVM(this, 0);
            this.A04 = new M0J(this, (0DR) null);
        }
        Function2 function2 = this.A03;
        if (function2 != null) {
            LPR.A07(KdT.A0I, mev, (String) null, function2);
        }
        Function2 function22 = this.A04;
        if (function22 != null) {
            mev.ClM(KdT.A0J, function22);
        }
    }

    public /* synthetic */ boolean BAh() {
        return false;
    }

    public /* synthetic */ boolean BAo() {
        return false;
    }

    public boolean C32(KeyEvent keyEvent) {
        long A00;
        if (!super.A05) {
            return false;
        }
        if (((keyEvent.getKeyCode() << 32) != L3u.A0A && (keyEvent.getKeyCode() << 32) != L3u.A0B) || keyEvent.getAction() != 0 || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean A1W = AnonymousClass001.A1W(this.A09.A03, KMT.A02);
        long j = this.A05.A00;
        if (A1W) {
            float A0I = JR0.A0I(j);
            if (!AnonymousClass001.A1O(((keyEvent.getKeyCode() << 32) > L3u.A0B ? 1 : ((keyEvent.getKeyCode() << 32) == L3u.A0B ? 0 : -1)))) {
                A0I = -A0I;
            }
            A00 = KvH.A00(0.0f, A0I);
        } else {
            float f = (int) (j >> 32);
            if (!AnonymousClass001.A1O(((keyEvent.getKeyCode() << 32) > L3u.A0B ? 1 : ((keyEvent.getKeyCode() << 32) == L3u.A0B ? 0 : -1)))) {
                f = -f;
            }
            A00 = KvH.A00(f, 0.0f);
        }
        2aK.A03((Integer) null, (0DE) null, new M0J(this, (0DR) null, 2, A00), A08(), 3);
        return true;
    }

    public void C9l() {
        KUl.A00(this, M3K.A00(this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void CCi(KiX kiX, KMa kMa, long j) {
        List list = kiX.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (7zR.A1a(list.get(i), super.A03)) {
                super.CCi(kiX, kMa, j);
                break;
            }
            i++;
        }
        if (kMa == KMa.A03 && kiX.A00 == 6) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!(!JQz.A0O(list, i2).A01())) {
                    return;
                }
            }
            11T.A0D(this.A02);
            MNh mNh = LDX.A02(this).A0C;
            LE0 le0 = new LE0(0L);
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= size3) {
                    break;
                }
                le0 = new LE0(LE0.A04(le0.A00, JQz.A0O(list, i4).A09));
                i3 = i4 + 1;
            }
            2aK.A03((Integer) null, (0DE) null, new M0J(this, (0DR) null, 4, LE0.A02(-mNh.D4T(64.0f), le0.A00)), A08(), 3);
            int size4 = list.size();
            for (int i5 = 0; i5 < size4; i5++) {
                JQz.A0O(list, i5).A00();
            }
        }
    }
}
