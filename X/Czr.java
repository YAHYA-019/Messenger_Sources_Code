package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.widget.text.BetterTextView;
import com.facebook.widget.tiles.ThreadTileView;
import com.google.common.collect.ImmutableList;

/* loaded from: Czr.class */
public final class Czr implements GFd {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();

    public Czr(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v116, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r316v2, types: [android.widget.ImageView] */
    @Override // X.GFd
    public GFc B1x(ThreadSummary threadSummary, EMw eMw) {
        String string;
        String string2;
        Resources resources;
        int i;
        ThreadTileView threadTileView;
        Context context = this.A01;
        FbUserSession A0C = 4YV.A0C(context);
        int ordinal = eMw.ordinal();
        if (ordinal == 1) {
            string = context.getResources().getString(2131962410);
            string2 = context.getResources().getString(2131962409);
            resources = context.getResources();
            i = 2131962408;
        } else {
            if (ordinal == 3) {
                String string3 = context.getResources().getString(2131962418);
                String string4 = context.getResources().getString(2131962417);
                String string5 = context.getResources().getString(2131962415);
                String string6 = context.getResources().getString(2131962416);
                BIv bIv = new BIv(context);
                bIv.A03 = eMw;
                if (threadSummary == null) {
                    ?? r316 = bIv.A02;
                    r316.setImageDrawable(bIv.A00.getDrawable(2132345098));
                    threadTileView = r316;
                } else {
                    2fZ r0 = (2fZ) 1Lo.A04(bIv.getContext(), A0C, (1BY) null, 17067);
                    ThreadTileView threadTileView2 = bIv.A09;
                    C2fd c2fd = C2fd.A0V;
                    C00i c00i = r0.A0B;
                    02W.A03("Participant utils cannot be null", c00i.get());
                    C2fc c2fc = new C2fc();
                    c2fc.A04 = (C2fe) r0.A0E.get();
                    ImmutableList A0B = ((AnonymousClass242) c00i.get()).A0B(threadSummary);
                    if (A0B.size() < 2) {
                        2fZ.A06(threadSummary, r0, A0B.size());
                        c2fc.A0A = true;
                    } else {
                        c2fc.A08 = 2fZ.A04(r0, A0B, true);
                    }
                    c2fc.A01(c2fd);
                    threadTileView2.A01(c2fc.A00());
                    threadTileView = threadTileView2;
                }
                threadTileView.setVisibility(0);
                BIv.A00(bIv.A08, string3);
                BIv.A00(bIv.A07, string4);
                ?? r02 = bIv.A05;
                BIv.A00((BetterTextView) r02, string5);
                C2rp.A01(r02);
                ?? r03 = bIv.A06;
                BIv.A00((BetterTextView) r03, string6);
                C2rp.A01(r03);
                bIv.A01.setVisibility(8);
                return bIv;
            }
            if (ordinal == 2) {
                string = context.getResources().getString(2131962413);
                string2 = context.getResources().getString(2131962412);
                resources = context.getResources();
                i = 2131962411;
            } else {
                if (ordinal != 0) {
                    throw AnonymousClass002.A0C(eMw, "Invalid PaymentAwarenessMode provided: ", AnonymousClass001.A0k());
                }
                string = context.getResources().getString(2131962421);
                string2 = context.getResources().getString(2131962420);
                resources = context.getResources();
                i = 2131962419;
            }
        }
        String string7 = resources.getString(i);
        BIv bIv2 = new BIv(context);
        bIv2.A03 = eMw;
        5YB r04 = bIv2.A02;
        r04.setImageDrawable(bIv2.A00.getDrawable(2132345098));
        r04.setVisibility(0);
        BIv.A00(bIv2.A08, string);
        BIv.A00(bIv2.A07, string2);
        ?? r05 = bIv2.A05;
        BIv.A00((BetterTextView) r05, string7);
        C2rp.A01(r05);
        ?? r06 = bIv2.A06;
        BIv.A00((BetterTextView) r06, (String) null);
        C2rp.A01(r06);
        bIv2.A01.setVisibility(0);
        return bIv2;
    }
}
