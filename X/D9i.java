package X;

import android.util.Pair;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.messaging.business.plugins.suggestedreply.model.SuggestedReplyOpenTopSheetParams;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: D9i.class */
public final class D9i implements Runnable {
    public static final String __redex_internal_original_name = "SAYTStateTracker$4";
    public final /* synthetic */ COd A00;
    public final /* synthetic */ 6QZ A01;
    public final /* synthetic */ 6Qf A02;
    public final /* synthetic */ String A03;

    public D9i(COd cOd, 6QZ r303, 6Qf r304, String str) {
        this.A00 = cOd;
        this.A03 = str;
        this.A01 = r303;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public void run() {
        COd cOd = this.A00;
        String str = this.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(cOd.A06);
        A0s.add(cOd.A07);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            1Du it2 = ((ImmutableCollection) it.next()).iterator();
            while (it2.hasNext()) {
                ReplyEntry replyEntry = (ReplyEntry) it2.next();
                1GS r0 = (1GS) cOd.A0C.get();
                Float valueOf = Float.valueOf(0.0f);
                float length = str.length();
                String str2 = replyEntry.A0A;
                if (str2 != null && str2.toLowerCase(r0.A05()).contains(str)) {
                    valueOf = Float.valueOf(Math.max(0.0f, length / str2.length()));
                }
                String str3 = replyEntry.A05;
                if (str3 != null && str3.toLowerCase(r0.A05()).contains(str)) {
                    valueOf = Float.valueOf(Math.max(valueOf.floatValue(), length / str3.length()));
                }
                if (replyEntry.A06.toLowerCase(r0.A05()).contains(str)) {
                    valueOf = Float.valueOf(Math.max(valueOf.floatValue(), length / r0.length()));
                }
                if (valueOf.floatValue() != 0.0f && (replyEntry.A01 != BKs.A01 || ((C6y) cOd.A0D.get()).A00(true))) {
                    A0s2.add(new Pair(valueOf, replyEntry));
                }
            }
        }
        SuggestedReplyOpenTopSheetParams suggestedReplyOpenTopSheetParams = null;
        if (!A0s2.isEmpty()) {
            C0k4.A01("threadkey must be not null", cOd.A05);
            if (((C6y) cOd.A0D.get()).A01(true) && ((CIW) cOd.A0E.get()).A02()) {
                ImmutableList.of();
                Collections.sort(A0s2, new DAk(cOd, 0));
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    builder.m11011add(((Pair) it3.next()).second);
                }
                ImmutableList build = builder.build();
                C1pq.A08("replyEntries", build);
                suggestedReplyOpenTopSheetParams = new SuggestedReplyOpenTopSheetParams(build, str, 0L, cOd.A05.A05, true);
            }
        }
        1BK.A1E(cOd.A0G).execute(new D7K(this, suggestedReplyOpenTopSheetParams));
    }
}
