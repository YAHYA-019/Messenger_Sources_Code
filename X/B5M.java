package X;

import android.content.Context;
import android.text.Layout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.selectmessages.SelectMessagesFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: B5M.class */
public final class B5M extends 6Hk {
    public 1BY A00;
    public FRXParams A01;
    public QyF A02;
    public 9ZS A03;
    public C98 A04;
    public C0o A05;
    public ThreadSummary A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final List A0B = AnonymousClass001.A0s();

    public B5M(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.messaging.integrity.frx.selectmessages.SelectMessagesFragment, androidx.fragment.app.Fragment] */
    public static void A00(B5M b5m) {
        Object obj = ((6Hk) b5m).A00;
        if (obj != null) {
            ?? r0 = (SelectMessagesFragment) obj;
            LithoView lithoView = r0.A02;
            8Sm A00 = C8nz.A00(r0.A04.A01.A01);
            A00.A2X(2131965640);
            C8nz c8nz = A00.A01;
            c8nz.A04 = false;
            c8nz.A03 = null;
            c8nz.A01 = Layout.Alignment.ALIGN_NORMAL;
            c8nz.A00 = AbN.A0T(r0.requireArguments()).B4i();
            lithoView.A0x(A00.A2W());
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [com.facebook.messaging.integrity.frx.selectmessages.SelectMessagesFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r305v3, types: [java.lang.Object, X.Bwk] */
    public static void A01(B5M b5m, boolean z) {
        Bwk bwk;
        int i;
        if (((6Hk) b5m).A00 != null) {
            C98 c98 = b5m.A04;
            if (c98 != null) {
                ?? obj = new Object();
                obj.A04 = AnonymousClass001.A0v();
                obj.A03 = c98.A03;
                obj.A05 = c98.A05;
                obj.A06 = c98.A06;
                obj.A00 = c98.A00;
                obj.A02 = c98.A02;
                obj.A01 = c98.A01;
                obj.A04 = AbF.A1E(c98.A04);
                bwk = obj;
            } else {
                b5m.A03.getClass();
                Bwk bwk2 = new Bwk();
                9ZS r0 = b5m.A03;
                bwk2.A00 = r0;
                C1pq.A08("rowItemCollection", r0);
                bwk2.A01 = b5m.A06;
                bwk = bwk2;
            }
            if (b5m.A0A) {
                int i2 = 2131965656;
                if (b5m.A09) {
                    i2 = 2131960076;
                }
                bwk.A03 = Integer.valueOf(i2);
                if (!bwk.A04.contains("bottomButtonResId")) {
                    HashSet A1E = AbF.A1E(bwk.A04);
                    bwk.A04 = A1E;
                    A1E.add("bottomButtonResId");
                }
                bwk.A05 = b5m.A09;
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) b5m.A0B);
            bwk.A02 = copyOf;
            C1pq.A08("selectedMessages", copyOf);
            bwk.A06 = z;
            b5m.A04 = new C98(bwk);
            ?? r02 = (SelectMessagesFragment) AbM.A0q(b5m);
            C98 c982 = b5m.A04;
            LithoView lithoView = r02.A02;
            Object obj2 = r02.A06.A00.get("key_is_banner_visible");
            if (obj2 == null || !Boolean.class.isInstance(obj2)) {
                obj2 = true;
            }
            Boolean bool = (Boolean) obj2;
            if (c982.A06) {
                BlV blV = r02.A06;
                9ZS r03 = c982.A00;
                Context context = r02.getContext();
                11T.A0F(context, 0);
                ImmutableList immutableList = r03.A00;
                if (immutableList == null) {
                    immutableList = r03.A00(context);
                }
                Object valueOf = Integer.valueOf(immutableList.size() - 1);
                Object obj3 = blV.A00.get("key_last_visible_item_position");
                if (obj3 == null || !Integer.class.isInstance(obj3)) {
                    obj3 = valueOf;
                }
                i = AnonymousClass001.A03(obj3);
            } else {
                i = -1;
            }
            ThreadSummary threadSummary = c982.A01;
            Capabilities A02 = threadSummary != null ? ((5Hr) r02.A01.get()).A02(r02.getContext(), r02.A00, threadSummary, (User) null, (2Sh) null) : 5Hr.A06;
            AuH auH = new AuH(r02.A02.A09, new C1996Ayp());
            C1996Ayp c1996Ayp = auH.A01;
            c1996Ayp.A06 = c982;
            BitSet bitSet = auH.A02;
            bitSet.set(10);
            c1996Ayp.A05 = r02.A04;
            bitSet.set(7);
            c1996Ayp.A08 = AbN.A0T(r02.requireArguments());
            bitSet.set(2);
            c1996Ayp.A03 = r02.A00;
            bitSet.set(3);
            c1996Ayp.A04 = r02.A08;
            bitSet.set(9);
            c1996Ayp.A0A = bool.booleanValue();
            bitSet.set(6);
            c1996Ayp.A00 = i;
            bitSet.set(4);
            c1996Ayp.A07 = r02.A06;
            bitSet.set(8);
            c1996Ayp.A09 = A02;
            bitSet.set(0);
            c1996Ayp.A02 = r02.mFragmentManager;
            bitSet.set(5);
            c1996Ayp.A01 = r02.getChildFragmentManager();
            bitSet.set(1);
            7zP.A1A(auH, bitSet, auH.A03);
            lithoView.A0x(c1996Ayp);
        }
    }

    public void A05() {
        Object obj = ((6Hk) this).A00;
        if (obj != null) {
            7zL.A1Q(obj);
        }
        if (this.A01 != null) {
            1BY r0 = this.A00;
            6Io r02 = (6Io) 1Bn.A0E((Context) null, r0, 67893);
            FbUserSession A05 = 1Fw.A05(r0);
            FRXParams fRXParams = this.A01;
            ThreadKey threadKey = fRXParams.A04;
            C5yq c5yq = fRXParams.A00;
            String str = this.A07;
            long size = this.A0B.size();
            C5yl c5yl = this.A01.A09;
            4YV.A1N(A05, c5yq);
            11T.A0F(c5yl, 5);
            1UG A08 = 1BK.A08(r02.A00, 1BJ.A00(1359));
            if (!A08.isSampled() || threadKey == null) {
                return;
            }
            6Io.A03(A08, r02);
            A08.A6H("selected_message_count", Long.valueOf(size));
            CPB.A03(A08, A05, r02, c5yq, threadKey);
            AbM.A1H(A08, c5yl);
            6Io.A02(A08, A05, r02, threadKey, str);
        }
    }
}
