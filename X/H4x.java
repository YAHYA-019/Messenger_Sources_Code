package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.ui.searchbar.ExpressionSearchBarView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.service.models.FetchStickerSuggestionsParams;
import com.facebook.ui.edittext.AnimatedHintsTextLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: H4x.class */
public final class H4x extends CustomFrameLayout {
    public int A00;
    public 06Z A01;
    public LifecycleOwner A02;
    public ThreadKey A03;
    public MigColorScheme A04;
    public JMq A05;
    public Capabilities A06;
    public ImmutableList A07;
    public ImmutableList A08;
    public ListenableFuture A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public C2483Gee A0F;
    public Integer A0G;
    public Integer A0H;
    public String A0I;
    public ScheduledFuture A0J;
    public final ScrollView A0K;
    public final RecyclerView A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final ExpressionSearchBarView A0X;
    public final JMq A0Y;
    public final GWH A0Z;
    public final StickerGridView A0a;
    public final StickerGridView A0b;
    public final GGS A0c;
    public final BetterTextView A0d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [android.widget.TextView, com.facebook.widget.text.BetterTextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [X.2kG, java.lang.Object] */
    public H4x(Context context) {
        super(context, null, 0);
        this.A0R = 1Bu.A01(context, 115512);
        this.A0T = 1Bu.A01(context, 50187);
        this.A0M = 1Bu.A01(context, 83914);
        this.A0S = 1Bu.A01(context, 116052);
        this.A0Q = 1Bq.A00(116065);
        this.A0N = 1Bq.A00(68416);
        this.A0P = 1Bu.A00(68071);
        this.A0V = 1Bu.A01(context, 116053);
        this.A0W = GOn.A0P();
        this.A0U = 1Bu.A00(49988);
        this.A0O = 1Bu.A00(67799);
        Integer num = 0S2.A00;
        this.A0H = num;
        this.A04 = LightColorScheme.A00();
        this.A0C = true;
        this.A0G = num;
        this.A0c = new Igl(this);
        A0U(2132543298);
        this.A0K = (ScrollView) 7zM.A0H(this, 2131367629);
        RecyclerView recyclerView = (RecyclerView) 7zM.A0H(this, 2131367631);
        this.A0L = recyclerView;
        StickerGridView stickerGridView = (StickerGridView) 7zM.A0H(this, 2131364309);
        this.A0a = stickerGridView;
        ?? r0 = stickerGridView.A07;
        11T.A0A((Object) r0);
        this.A0d = r0;
        stickerGridView.A0h(C5es.A04);
        r0.setText(2131957290);
        StickerGridView stickerGridView2 = (StickerGridView) 7zM.A0H(this, 2131367190);
        this.A0b = stickerGridView2;
        GWC gwc = stickerGridView2.A05;
        gwc.getClass();
        gwc.A09 = "search_tab_id";
        ExpressionSearchBarView expressionSearchBarView = (ExpressionSearchBarView) 7zM.A0H(this, 2131367142);
        this.A0X = expressionSearchBarView;
        expressionSearchBarView.A01 = new HXy(this);
        FbImageButton fbImageButton = expressionSearchBarView.A04;
        fbImageButton.setVisibility(0);
        IKB.A00(fbImageButton, this, 58);
        MigColorScheme migColorScheme = this.A04;
        11T.A0F(migColorScheme, 1);
        2Xd r02 = new 2Xd();
        ((GWH) r02).A01 = migColorScheme;
        ((GWH) r02).A00 = 2131965563;
        ((GWH) r02).A03 = 1BK.A0b();
        this.A0Z = r02;
        recyclerView.A16(r02);
        recyclerView.A1D(new LinearLayoutManager(context, 0, false));
        recyclerView.A1B(new Object());
        ((GWH) r02).A02 = new HXz(this);
        A03(this);
        this.A0Y = new Igh(this);
    }

    private final void A00() {
        C2483Gee c2483Gee = this.A0F;
        if (c2483Gee != null) {
            c2483Gee.dispose();
        }
        ScheduledFuture scheduledFuture = this.A0J;
        if (scheduledFuture != null && scheduledFuture.isCancelled() && scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        ListenableFuture listenableFuture = this.A09;
        if (listenableFuture != null && listenableFuture.isCancelled() && listenableFuture.isDone()) {
            listenableFuture.cancel(true);
        }
    }

    public static final void A01(H4x h4x) {
        A08(h4x, false);
        A02(h4x);
        ((2UV) 1Br.A0B(h4x.A0S)).AEC();
        h4x.A00();
    }

    public static final void A02(H4x h4x) {
        StickerGridView stickerGridView;
        C5es c5es;
        ImmutableList immutableList = h4x.A07;
        ImmutableList immutableList2 = h4x.A08;
        Integer num = null;
        if (!h4x.A0E || immutableList == null) {
            if (immutableList2 != null) {
                stickerGridView = h4x.A0b;
                String string = h4x.getContext().getString(2131967434);
                GWC gwc = stickerGridView.A05;
                gwc.getClass();
                boolean z = gwc.A0A;
                Capabilities capabilities = h4x.A06;
                if (capabilities != null && ((AnonymousClass842) 1Br.A0B(h4x.A0N)).A09(h4x.A03, capabilities)) {
                    num = 0S2.A01;
                }
                stickerGridView.A0f(h4x.A0c, StickerGridView.A00(immutableList2, num), string, null, z);
                c5es = C5es.A0G;
            }
            StickerGridView stickerGridView2 = h4x.A0a;
            stickerGridView2.A0Z();
            Integer num2 = 0S2.A00;
            A05(h4x, num2);
            stickerGridView2.setVisibility(8);
            A05(h4x, num2);
        }
        stickerGridView = h4x.A0b;
        String string2 = h4x.getContext().getString(2131966592);
        GWC gwc2 = stickerGridView.A05;
        gwc2.getClass();
        stickerGridView.A0i(immutableList, string2, null, gwc2.A0A);
        c5es = C5es.A0F;
        stickerGridView.A0h(c5es);
        StickerGridView stickerGridView22 = h4x.A0a;
        stickerGridView22.A0Z();
        Integer num22 = 0S2.A00;
        A05(h4x, num22);
        stickerGridView22.setVisibility(8);
        A05(h4x, num22);
    }

    public static final void A03(H4x h4x) {
        int i = 2131965563;
        if (h4x.A0A()) {
            i = 2131965526;
        }
        GWH gwh = h4x.A0Z;
        gwh.A00 = i;
        gwh.A08(0);
        String str = h4x.A0I;
        Context context = h4x.getContext();
        if (11T.A0O(str, context.getString(i))) {
            return;
        }
        h4x.A0I = context.getString(i);
        A09(h4x, true);
    }

    public static final void A04(H4x h4x, Sticker sticker, int i) {
        long j;
        IA5 ia5 = (IA5) 1Br.A0B(h4x.A0Q);
        int size = h4x.A0b.A0W().size();
        int i2 = h4x.A00;
        String A0u = AbM.A0u(h4x.A0X.A02);
        ThreadKey threadKey = h4x.A03;
        boolean z = false;
        if (threadKey != null && threadKey.A1N()) {
            z = true;
        }
        synchronized (ia5) {
            11T.A0F(sticker, 0);
            String str = ia5.A00;
            if (str != null) {
                Set set = ia5.A05;
                String str2 = sticker.A0F;
                if (!set.contains(str2)) {
                    set.add(str2);
                    C00i c00i = ia5.A04.A00;
                    c00i.get();
                    boolean A01 = 6Bl.A01(sticker);
                    HQD hqd = (HQD) 1Br.A0B(ia5.A02);
                    if (A0u == null) {
                        A0u = "";
                    }
                    Integer A012 = IA5.A01(sticker);
                    String str3 = sticker.A0D;
                    if (str3 != null) {
                        Long A0f = 0CW.A0f(str3);
                        if (A0f != null) {
                            j = A0f.longValue();
                            long j2 = i2;
                            boolean A02 = IA5.A02(ia5);
                            if (z || A01) {
                                str2 = null;
                            }
                            c00i.get();
                            Boolean valueOf = Boolean.valueOf(6Bl.A02(sticker));
                            11T.A0F(A012, 3);
                            1UG A08 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1027));
                            0DA r0 = new 0DA();
                            r0.A06("sticker_template_id", Long.valueOf(j));
                            r0.A06("page_number", 4YV.A0j());
                            I68.A01(r0, A012, 1L, "total_pages");
                            Long A0l = 1BK.A0l(i);
                            r0.A06("sticker_rank", A0l);
                            r0.A06("sticker_page_index", A0l);
                            r0.A06("total_avatar_stickers", Long.valueOf(j2));
                            GOp.A1M(r0, A02);
                            GOq.A1C(r0, size);
                            r0.A07("sticker_template_name", (String) null);
                            r0.A07("search_query", A0u);
                            r0.A07("sticker_id", str2);
                            r0.A03("is_social_sticker", valueOf);
                            r0.A03("is_instant_avatar_sticker", Boolean.valueOf(A01));
                            AbstractC2327GOs.A0k(r0, A08, str);
                        }
                    }
                    j = 0;
                    long j22 = i2;
                    boolean A022 = IA5.A02(ia5);
                    if (z) {
                    }
                    str2 = null;
                    c00i.get();
                    Boolean valueOf2 = Boolean.valueOf(6Bl.A02(sticker));
                    11T.A0F(A012, 3);
                    1UG A082 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1027));
                    0DA r02 = new 0DA();
                    r02.A06("sticker_template_id", Long.valueOf(j));
                    r02.A06("page_number", 4YV.A0j());
                    I68.A01(r02, A012, 1L, "total_pages");
                    Long A0l2 = 1BK.A0l(i);
                    r02.A06("sticker_rank", A0l2);
                    r02.A06("sticker_page_index", A0l2);
                    r02.A06("total_avatar_stickers", Long.valueOf(j22));
                    GOp.A1M(r02, A022);
                    GOq.A1C(r02, size);
                    r02.A07("sticker_template_name", (String) null);
                    r02.A07("search_query", A0u);
                    r02.A07("sticker_id", str2);
                    r02.A03("is_social_sticker", valueOf2);
                    r02.A03("is_instant_avatar_sticker", Boolean.valueOf(A01));
                    AbstractC2327GOs.A0k(r02, A082, str);
                }
            }
        }
    }

    public static final void A05(H4x h4x, Integer num) {
        View.OnClickListener onClickListener;
        if (!h4x.A0A() || num == h4x.A0H) {
            return;
        }
        h4x.A0H = num;
        Integer num2 = 0S2.A0C;
        2OB r0 = h4x.A0d;
        if (num == num2) {
            r0.setTextColor(h4x.A04.B4d());
            onClickListener = new IKB(h4x, 59);
        } else {
            AbG.A1J(r0, h4x.A04);
            onClickListener = null;
        }
        r0.setOnClickListener(onClickListener);
        int i = 0;
        if (num == 0S2.A00) {
            i = 8;
        }
        r0.setVisibility(i);
    }

    public static final void A06(H4x h4x, String str) {
        C00i c00i = h4x.A0Q.A00;
        IA5 ia5 = (IA5) c00i.get();
        11T.A0F(str, 0);
        String str2 = ia5.A00;
        if (str2 != null) {
            HQD hqd = (HQD) 1Br.A0B(ia5.A02);
            String A01 = ((1GS) 1Br.A0B(ia5.A01)).A01();
            11T.A0A(A01);
            boolean A02 = IA5.A02(ia5);
            1UG A08 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1030));
            0DA r0 = new 0DA();
            r0.A07("search_query", str);
            r0.A07("search_locale", A01);
            Long A0j = 4YV.A0j();
            r0.A06("result_size", A0j);
            GOp.A1M(r0, A02);
            r0.A06("total_avatar_stickers", A0j);
            AbstractC2327GOs.A0k(r0, A08, str2);
        }
        ((IA5) c00i.get()).A05.clear();
        C00i c00i2 = h4x.A0S.A00;
        ((2UV) c00i2.get()).AEC();
        ((2UV) c00i2.get()).D1t(new HcG(C6xd.A06, str));
        A07(h4x, str, false);
    }

    public static final void A07(H4x h4x, String str, boolean z) {
        if (h4x.A0A()) {
            h4x.A00();
            String A00 = 9E2.A00(str);
            if (A00 == null) {
                h4x.A0a.A0Z();
                A05(h4x, 0S2.A00);
                return;
            }
            StickerGridView stickerGridView = h4x.A0a;
            if (stickerGridView.getVisibility() != 0) {
                if (stickerGridView.getVisibility() != 0) {
                    stickerGridView.setVisibility(0);
                    Hpa hpa = stickerGridView.A06;
                    GridLayoutManager gridLayoutManager = stickerGridView.A01;
                    if (hpa.A00 != null) {
                        int A1h = gridLayoutManager.A1h();
                        while (true) {
                            int i = A1h;
                            if (i > gridLayoutManager.A1j()) {
                                break;
                            }
                            hpa.A00(i);
                            A1h = i + 1;
                        }
                    }
                }
                A05(h4x, 0S2.A01);
            }
            h4x.A0D = z;
            C2483Gee c2483Gee = new C2483Gee(h4x, A00);
            h4x.A0F = c2483Gee;
            h4x.A0J = GOp.A1H(h4x.A0W).schedule((Runnable) new J2C(c2483Gee, h4x, A00, z), ((AnonymousClass842) 1Br.A0B(h4x.A0N)).A01(), TimeUnit.MILLISECONDS);
        }
    }

    public static final void A08(H4x h4x, boolean z) {
        ExpressionSearchBarView expressionSearchBarView = h4x.A0X;
        int i = 8;
        expressionSearchBarView.setVisibility(DKG.A00(z ? 1 : 0));
        RecyclerView recyclerView = h4x.A0L;
        if ((!z ? 1 : 0) != 0) {
            i = 0;
        }
        recyclerView.setVisibility(i);
        if (z) {
            EditText editText = expressionSearchBarView.A02;
            if (AbM.A0u(editText).length() > 0) {
                A06(h4x, AbM.A0u(editText));
            }
        }
    }

    public static final void A09(H4x h4x, boolean z) {
        ExpressionSearchBarView expressionSearchBarView;
        List A03;
        Integer num = (h4x.A0A() && !h4x.A0C && h4x.A0B) ? 0S2.A01 : 0S2.A0C;
        if (z || h4x.A0G != num) {
            h4x.A0G = num;
            if (num == 0S2.A01) {
                expressionSearchBarView = h4x.A0X;
                1Br.A0C(h4x.A0P);
                A03 = 7zQ.A0t().A03();
            } else {
                String str = h4x.A0I;
                if (str == null) {
                    return;
                }
                expressionSearchBarView = h4x.A0X;
                A03 = 11T.A03(str);
            }
            11T.A0F(A03, 0);
            AnimatedHintsTextLayout animatedHintsTextLayout = expressionSearchBarView.A06;
            animatedHintsTextLayout.A05();
            animatedHintsTextLayout.A06(A03);
        }
    }

    private final boolean A0A() {
        Capabilities capabilities = this.A06;
        if (capabilities != null) {
            return ((AnonymousClass842) 1Br.A0B(this.A0N)).A08(this.A03, capabilities);
        }
        return false;
    }

    public final void A0V() {
        IA5 ia5 = (IA5) 1Br.A0B(this.A0Q);
        if (ia5.A00 == null) {
            String A0s = 7zR.A0s();
            ia5.A00 = A0s;
            HQD hqd = (HQD) 1Br.A0B(ia5.A02);
            boolean A02 = IA5.A02(ia5);
            1UG A08 = 1BK.A08(1Br.A02(hqd.A00), 1BJ.A00(1028));
            0DA r0 = new 0DA();
            r0.A07("referrer_surface", "message_thread");
            r0.A07("ui_component", "message_reply");
            GOp.A1M(r0, A02);
            AbstractC2326GOr.A18(r0, A08, A0s);
        }
        StickerGridView stickerGridView = this.A0b;
        int A1h = stickerGridView.A01.A1h();
        int A1j = stickerGridView.A01.A1j();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (A1h != -1 && A1j != -1) {
            ArrayList A0W = stickerGridView.A0W();
            while (A1h < A1j) {
                if (A1h >= A0W.size()) {
                    break;
                }
                A0s2.add(GOn.A0G(Integer.valueOf(A1h), A0W.get(A1h)));
                A1h++;
            }
        }
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.second;
            11T.A09(obj);
            A04(this, (Sticker) obj, GOq.A06(pair));
        }
        this.A0a.A0X();
        stickerGridView.A0X();
    }

    public final void A0W(MigColorScheme migColorScheme) {
        this.A04 = migColorScheme;
        this.A0a.A0d(migColorScheme);
        this.A0b.A0d(migColorScheme);
        ExpressionSearchBarView expressionSearchBarView = this.A0X;
        if (!migColorScheme.equals(expressionSearchBarView.A00)) {
            ExpressionSearchBarView.A00(expressionSearchBarView, migColorScheme);
            expressionSearchBarView.A00 = migColorScheme;
        }
        GWH gwh = this.A0Z;
        gwh.A01 = migColorScheme;
        gwh.A08(0);
    }

    public final void A0X(String str) {
        this.A0E = true;
        IQU iqu = (IQU) 1Br.A0B(this.A0V);
        HcI hcI = new HcI(Locale.US.toString(), str);
        FetchStickerSuggestionsParams fetchStickerSuggestionsParams = new FetchStickerSuggestionsParams(hcI.A00, hcI.A01);
        Bundle A05 = 1BK.A05();
        A05.putParcelable(4YT.A00(1113), fetchStickerSuggestionsParams);
        try {
            1IB A0M = 4YU.A0M(A05, iqu.A03, (BlueServiceOperationFactory) iqu.A04.get(), 1BJ.A00(418), true);
            C2487Gei c2487Gei = new C2487Gei(hcI, iqu, 13);
            2TV r0 = iqu.A01;
            if (r0 != null) {
                r0.C4n(A0M, hcI);
            }
            1Kd.A0D(iqu.A05, c2487Gei, A0M);
            iqu.A00 = new 2eS(c2487Gei, A0M);
        } catch (Exception e) {
            2TV r02 = iqu.A01;
            if (r02 != null) {
                r02.C47(hcI, e);
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.A0K.canScrollVertically(i);
    }
}
