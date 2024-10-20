package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.input.phonenumber.countrypicker.MigCountryCodePickerDialogFragment;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.functions.Function1;

/* loaded from: DBj.class */
public final class DBj implements C00l, Function1 {
    public final int A00;
    public final Object A01;

    public DBj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, X.BRI] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                ThreadKey threadKey = (ThreadKey) obj;
                BpY bpY = (BpY) ((C9Y) this.A01).A07.get();
                11T.A0F(threadKey, 0);
                return new AfN((C5xl) 1Br.A0B(bpY.A00), (AeX) 1Br.A0B(bpY.A01), threadKey);
            case 1:
                8Lu r0 = (8Lu) obj;
                0fH.A0j("GroupMembersViewData", "On repository data model changed.");
                ThreadSummary threadSummary = (ThreadSummary) r0.A00;
                ImmutableCollection immutableCollection = (ImmutableCollection) r0.A01;
                ImmutableMap.Builder A0c = 1BK.A0c();
                1Du it = immutableCollection.iterator();
                while (it.hasNext()) {
                    User A0t = AbG.A0t(it);
                    A0c.put(A0t.A0k, A0t);
                }
                ImmutableMap build = A0c.build();
                1BL.A1F(threadSummary, build);
                ?? obj2 = new Object();
                ((BRI) obj2).A00 = threadSummary;
                ((BRI) obj2).A01 = build;
                return obj2;
            case 2:
                ThreadSummary threadSummary2 = (ThreadSummary) ((8Lu) obj).A00;
                C9Y c9y = (C9Y) this.A01;
                C00i c00i = c9y.A04;
                return ((5Hr) c9y.A06.get()).A01((Context) c00i.get(), 4YV.A0C(1BK.A04(c00i)), threadSummary2 == null ? null : threadSummary2.A0n, threadSummary2, (User) null, (2Sh) null);
            case 3:
                3xC r02 = (3xC) obj;
                View.OnClickListener onClickListener = ((CNi) this.A01).A00;
                if (onClickListener == null) {
                    return null;
                }
                onClickListener.onClick(r02.A00);
                return null;
            case 4:
                1FX r03 = (1FX) this.A01;
                Ct1 ct1 = (Ct1) obj;
                CallerContext callerContext = Ctk.A04;
                r03.set(ct1 != null ? new CDU(ct1) : new CDU(0S2.A00, (Throwable) null));
                return 04S.A00;
            default:
                MigCountryCodePickerDialogFragment migCountryCodePickerDialogFragment = (MigCountryCodePickerDialogFragment) this.A01;
                1Im r04 = migCountryCodePickerDialogFragment.A00;
                if (r04 != null) {
                    r04.A00(obj);
                }
                migCountryCodePickerDialogFragment.A0o();
                return null;
        }
    }
}
