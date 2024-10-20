package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3du, reason: invalid class name */
/* loaded from: 3du.class */
public final class C3du implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C3du(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onFailure(Throwable th) {
        1FX r304;
        ThreadKey A00;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                if (th instanceof C4Qa) {
                    Summary summary = ((C4Qa) th).summary;
                    if (summary != null) {
                        C1x7 c1x7 = (C1x7) this.A03;
                        11T.A0I(summary, "null cannot be cast to non-null type com.facebook.graphservice.interfaces.Summary");
                        C1x7.A00(c1x7, summary);
                    }
                } else if (th instanceof DpH) {
                    C1x7 c1x72 = (C1x7) this.A03;
                    Summary summary2 = ((DpH) th).summary;
                    11T.A09(summary2);
                    C1x7.A00(c1x72, summary2);
                }
                ((Function1) this.A01).invoke(th.toString());
                return;
            case 1:
                return;
            case 2:
                11T.A0F(th, 0);
                0fH.A0v("FriendsInboxUnitItemListener", "Failed to resolve the thread key.", th);
                r304 = (1FX) this.A02;
                A00 = C2i8.A00((C2i8) this.A03, (3xR) this.A01);
                break;
            case 3:
                11T.A0F(th, 0);
                0fH.A0v("FriendsInboxUnitItemListener", "Failed to resolve the thread key.", th);
                r304 = (1FX) this.A02;
                C2i8 c2i8 = (C2i8) this.A03;
                User user = ((2tH) this.A01).A02;
                if (user == null) {
                    A00 = null;
                    break;
                } else {
                    A00 = 4iI.A00((4iI) 1Br.A0B(c2i8.A0J), user.A0k);
                    break;
                }
            case 4:
                0fH.A0k("NoteNotificationOpener", "Failed to fetch RichStatus for Note from notification");
                2kU.A00((Context) this.A01, (ViewGroup) this.A02, (2kU) this.A03);
                return;
            default:
                2Mr r0 = (2Mr) this.A03;
                ThreadViewParams threadViewParams = (ThreadViewParams) this.A02;
                1uZ r02 = r0.A0A;
                ThreadKey threadKey = threadViewParams.A05;
                11T.A09(threadKey);
                2Mr.A00(r0, (2M6) this.A01, threadViewParams, r02.A07(threadKey));
                return;
        }
        r304.set(A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2JY r0;
        2JX A0L;
        1FX r304;
        ThreadKey A00;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                Function1 function1 = (Function1) this.A02;
                Object obj2 = null;
                if (abstractC08294mh != null && (r0 = (2JY) abstractC08294mh.A03) != null) {
                    2JY A0B = 1BK.A0B(r0, 2JX.class, -1475026643, -350464949);
                    32B r313 = A0B != null ? (32B) A0B.A0J(-1419509697, -302753489) : null;
                    2JY A0B2 = 1BK.A0B(r0, 2JX.class, -1797583269, -1629214601);
                    32A r320 = A0B2 != null ? (32A) A0B2.A0J(-1833852976, 829648844) : null;
                    2JY A0P = r0.A0P(2JX.class, -2131587827);
                    if (A0P != null && (A0L = 1BL.A0L(A0P, 92645877, 206738583)) != null) {
                        obj2 = A0L.A0w();
                    }
                    obj2 = new AnonymousClass327(r313, obj2, r320, Integer.valueOf(r0.getIntValue(1821880301)), Integer.valueOf(r0.getIntValue(-2061260532)));
                }
                function1.invoke(obj2);
                return;
            case 1:
                java.util.Map map = (java.util.Map) obj;
                if (map.isEmpty()) {
                    return;
                }
                ImmutableCollection immutableCollection = (ImmutableCollection) this.A03;
                ArrayList A10 = 1BL.A10(immutableCollection);
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    UserKey userKey = ((User) it.next()).A0k;
                    Number A0o = 1BK.A0o(userKey.id, map);
                    Number A0o2 = 1BK.A0o(userKey.id, (java.util.Map) this.A02);
                    A10.add(Double.valueOf(A0o == null ? 0.0d : (A0o2 == null || A0o2.floatValue() <= 0.0f) ? -1.0d : A0o.doubleValue() / A0o2.doubleValue()));
                }
                1UG A08 = 1BK.A08(1BK.A07(((3MF) this.A01).A01), "msgr_ppml_an_displayed_ratios");
                if (A08.isSampled()) {
                    A08.A7h("ratios", A10);
                    A08.BZL();
                    return;
                }
                return;
            case 2:
                if (obj == null) {
                    r304 = (1FX) this.A02;
                    A00 = C2i8.A00((C2i8) this.A03, (3xR) this.A01);
                    r304.set(A00);
                    return;
                }
                ((1FX) this.A02).set(obj);
                return;
            case 3:
                if (obj == null) {
                    r304 = (1FX) this.A02;
                    C2i8 c2i8 = (C2i8) this.A03;
                    User user = ((2tH) this.A01).A02;
                    A00 = user != null ? 4iI.A00((4iI) 1Br.A0B(c2i8.A0J), user.A0k) : null;
                    r304.set(A00);
                    return;
                }
                ((1FX) this.A02).set(obj);
                return;
            case 4:
                List list = (List) obj;
                if (list == null || list.isEmpty() || list.get(0) == null) {
                    2kU.A00((Context) this.A01, (ViewGroup) this.A02, (2kU) this.A03);
                    return;
                }
                2kU r02 = (2kU) this.A03;
                Object obj3 = list.get(0);
                11T.A0I(obj3, "null cannot be cast to non-null type com.facebook.presence.api.model.RichStatus");
                r02.A00 = ((RichStatus) obj3).A04;
                ((C21p) 1Br.A0B(r02.A09)).A05("Fetched pending Note ID");
                3Fk r03 = r02.A01;
                if (r03 != null) {
                    r02.A03(r03.A00, r03.A01, r03.A02, r03.A03);
                    return;
                }
                return;
            default:
                2Mr r04 = (2Mr) this.A03;
                ThreadViewParams threadViewParams = (ThreadViewParams) this.A02;
                1uZ r05 = r04.A0A;
                ThreadKey threadKey = threadViewParams.A05;
                11T.A09(threadKey);
                2Mr.A00(r04, (2M6) this.A01, threadViewParams, r05.A07(threadKey));
                return;
        }
    }
}
