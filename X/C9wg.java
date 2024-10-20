package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent;
import com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsImpressionEvent;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9wg, reason: invalid class name */
/* loaded from: 9wg.class */
public final class C9wg implements Aaf {
    public final /* synthetic */ C8uS A00;

    public C9wg(C8uS c8uS) {
        this.A00 = c8uS;
    }

    @Override // X.Aaf
    public 2aI Atl() {
        return (2aI) ((C9cp) this.A00).A0A.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r312 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.5fq, X.5qu] */
    @Override // X.Aaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BhU(X.8Jv r302) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9wg.BhU(X.8Jv):void");
    }

    @Override // X.Aaf
    public void Bie(OnAiNullStateCardsClickEvent onAiNullStateCardsClickEvent) {
        this.A00.A0E.CZm(onAiNullStateCardsClickEvent);
    }

    @Override // X.Aaf
    public void Bif(OnAiNullStateCardsImpressionEvent onAiNullStateCardsImpressionEvent) {
        this.A00.A0E.CZm(onAiNullStateCardsImpressionEvent);
    }

    @Override // X.Aaf
    public void C5r(List list, int i) {
        11T.A0F(list, 0);
        C9Jx c9Jx = this.A00.A0B;
        if (c9Jx == null || list.isEmpty()) {
            return;
        }
        36P r0 = c9Jx.A00;
        06Z BdK = r0.A08.BdK();
        if (BdK != null) {
            ArrayList A0z = 1BL.A0z(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                ThreadKey threadKey = r0.A04;
                C5en A00 = C5en.A00();
                A00.A0J = threadKey;
                A00.A0P = 5HP.A0F;
                A00.A0E = uri;
                A00.A0D = uri;
                A0z.add(new SharedMedia(4YU.A0Y(A00), "", 4YU.A0z(threadKey), ""));
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0z);
            Context context = r0.A00;
            ThreadKey threadKey2 = r0.A04;
            11T.A0D(copyOf);
            SharedMedia sharedMedia = (SharedMedia) 0QD.A0J(copyOf, i);
            if (sharedMedia == null) {
                sharedMedia = (SharedMedia) copyOf.get(0);
            }
            11T.A0D(sharedMedia);
            9DK.A00(context, BdK, threadKey2, C95o.A03, sharedMedia, copyOf, "photo_view_fragment", (Function1) null, 0, false, true, true);
        }
    }

    @Override // X.Aaf
    public void C9j() {
        ((C9cp) this.A00).A09.A00(98W.A02);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.5fq, X.5qu] */
    @Override // X.Aaf
    public void CEU(8KG r302) {
        C8uS c8uS = this.A00;
        C6ri c6ri = c8uS.A0D;
        ?? c5fq = new C5fq();
        String str = r302.A05;
        if (str == null) {
            str = r302.A09;
        }
        c5fq.A02 = str;
        c5fq.A02(A9j.A00, new 7fL(0S2.A01, String.valueOf(r302.A01)));
        c6ri.A00(new 7Ad((C5fq) c5fq, "unknown", (String) null));
        c6ri.A00(new A5w(r302, false, true));
        8CW r0 = ((C9cp) c8uS).A01;
        if (r0 != null) {
            8CW.A03(r0, false, true, false);
        }
    }
}
