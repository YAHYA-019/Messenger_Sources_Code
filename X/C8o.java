package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: C8o.class */
public final class C8o {
    public final /* synthetic */ C1583Am2 A00;

    public C8o(C1583Am2 c1583Am2) {
        this.A00 = c1583Am2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Am2] */
    public void A00(ThreadSummary threadSummary, ImmutableList immutableList, Long l, String str, String str2, boolean z) {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (!r0.isAdded() || context == null) {
            return;
        }
        C2T c2t = (C2T) r0.A0B.get();
        AbG.A0r(c2t.A01).flowEndSuccess(c2t.A00);
        Bye bye = r0.A06;
        bye.A07 = str;
        bye.A01 = threadSummary;
        bye.A06 = str2;
        bye.A04 = l;
        bye.A02 = immutableList;
        bye.A0B = z;
        if (r0.A09 != 0S2.A0N) {
            L2r l2r = r0.A08;
            if (l2r != null) {
                l2r.A01();
            }
            L2r A00 = L2r.A00(context, r0.A03, threadSummary.A0n, immutableList, l, str, str2, "message_search");
            r0.A08 = A00;
            A00.A02();
            r0.A06.A08 = true;
            if (C1583Am2.A08(r0, r0.A09)) {
                r0.dismiss();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Am2] */
    public void A01(ThreadSummary threadSummary, String str, int i) {
        ?? r0 = this.A00;
        if (r0.isAdded()) {
            Bye bye = r0.A06;
            bye.A07 = str;
            bye.A01 = threadSummary;
            bye.A00 = i;
            ThreadKey threadKey = threadSummary.A0n;
            C1gb A0n = AbF.A0n(r0.A0C);
            1BK.A1M(threadKey, A0n);
            DHT dht = (Fragment) ((threadKey.A0z() || C1gb.A02(A0n).AZk(36321322948575445L)) ? new AmA() : new C1590Am9());
            r0.A00 = dht;
            if (dht instanceof DHT) {
                dht.Cta(threadSummary, str, i);
            }
            Integer num = r0.A09;
            Integer num2 = 0S2.A0C;
            if (num != num2) {
                r0.A09 = num2;
                C1583Am2.A07(r0, num2);
                Fragment fragment = r0.A00;
                C06c A09 = AbJ.A09((Fragment) r0);
                A09.A0D(2130772065, 2130772072, 2130772065, 2130772072);
                A09.A0P(fragment, "message_search_thread_message_list_fragment", 2131365682);
                A09.A0V("message_search_thread_message_list_fragment");
                C06c.A00(A09, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x018e, code lost:
    
        if (r0.A01 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0191, code lost:
    
        r0.A07.A04(null, r0.A06.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0182, code lost:
    
        if (r0.A06.A07 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r303 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r0.A06.A07 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0 != 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r0.getChildFragmentManager().A1Q("message_search_thread_list_fragment", 0);
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Am2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o.A02():boolean");
    }
}
