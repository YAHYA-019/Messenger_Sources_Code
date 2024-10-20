package com.facebook.stickers.store;

import X.0FI;
import X.0NA;
import X.0S2;
import X.0V5;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1GS;
import X.1He;
import X.1Ho;
import X.1I7;
import X.1IB;
import X.1Kd;
import X.1P9;
import X.1PA;
import X.1iF;
import X.1pK;
import X.2S2;
import X.4YT;
import X.5Qx;
import X.6HM;
import X.7zL;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbL;
import X.C00i;
import X.C01q;
import X.C02l;
import X.C09o;
import X.C09s;
import X.C6xd;
import X.C6yc;
import X.C7lo;
import X.DKG;
import X.DKH;
import X.DPW;
import X.EL5;
import X.Eg4;
import X.Eg5;
import X.EsU;
import X.F6h;
import X.FXq;
import X.FYW;
import X.Fao;
import X.FwJ;
import X.FwK;
import X.G6e;
import X.GHX;
import X.GL6;
import X.IL5;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickerPacksParams;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.titlebar.TitleBarButtonSpec;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* loaded from: StickerStoreFragment.class */
public final class StickerStoreFragment extends 1pK implements NavigableFragment, C02l {
    public SearchView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public FbUserSession A04;
    public GHX A05;
    public BlueServiceOperationFactory A06;
    public EL5 A07;
    public EL5 A08;
    public DPW A09;
    public 6HM A0A;
    public EmptyListViewItem A0B;
    public GL6 A0C;
    public TitleBarButtonSpec A0D;
    public TitleBarButtonSpec A0E;
    public LinkedHashMap A0G;
    public LinkedHashMap A0H;
    public boolean A0I;
    public boolean A0J;
    public Context A0K;
    public 1PA A0L;
    public 1I7 A0M;
    public boolean A0N;
    public Optional A0F = Absent.INSTANCE;
    public final 2S2 A0T = (2S2) 1Bi.A03(66368);
    public final C00i A0O = AbH.A0a();
    public final C00i A0P = 1BQ.A01();
    public final C00i A0Q = AbH.A0S();
    public final Fao A0S = (Fao) 1Bi.A03(100161);
    public final EsU A0R = (EsU) 1Bi.A03(100211);
    public final C00i A0U = 1BQ.A02(16504);

    private 1IB A03(1He r302, 5Qx r303) {
        FetchStickerPacksParams fetchStickerPacksParams = new FetchStickerPacksParams(r302, r303, 0S2.A0C, C7lo.A00((C6xd) this.A0F.get()));
        Bundle A05 = 1BK.A05();
        A05.putParcelable(4YT.A00(342), fetchStickerPacksParams);
        return 1Ho.A00(this.A06.newInstance_DEPRECATED(1BJ.A00(46), A05), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A06() {
        FXq.A01(this.A02, this, ActionId.APP_DID_FINISH_LAUNCHING);
        FXq.A01(this.A01, this, ActionId.APP_DID_BECOME_ACTIVE);
        FXq.A01(this.A03, this, ActionId.APP_WILL_ENTER_FOREGROUND);
        TypedValue typedValue = new TypedValue();
        this.A0K.getTheme().resolveAttribute(2130971832, typedValue, false);
        if (typedValue.type == 18 && Boolean.valueOf(typedValue.coerceToString().toString()).booleanValue()) {
            A07(this.A02);
            A07(this.A01);
            A07(this.A03);
        }
        ViewGroup viewGroup = (ViewGroup) 7zL.A0F(this, 2131367633);
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(this.A02) + 1;
        int indexOfChild2 = viewGroup.indexOfChild(this.A01) + 1;
        int indexOfChild3 = viewGroup.indexOfChild(this.A03) + 1;
        TextView textView = this.A02;
        Resources A0D = 7zO.A0D(this);
        String string = 7zO.A0D(this).getString(2131956904);
        Integer valueOf = Integer.valueOf(indexOfChild);
        Integer valueOf2 = Integer.valueOf(childCount);
        textView.setContentDescription(A0D.getString(2131966369, string, valueOf, valueOf2));
        this.A01.setContentDescription(7zO.A0D(this).getString(2131966369, 7zO.A0D(this).getString(2131952756), Integer.valueOf(indexOfChild2), valueOf2));
        this.A03.setContentDescription(7zO.A0D(this).getString(2131966369, 7zO.A0D(this).getString(2131968239), Integer.valueOf(indexOfChild3), valueOf2));
    }

    public static void A07(TextView textView) {
        textView.setText(textView.getText().toString().toUpperCase(Locale.getDefault()));
    }

    private void A08(5Qx r302, EL5 el5) {
        1He r306;
        if (this.A0N || r302 != 5Qx.A05) {
            r306 = 1He.A04;
        } else {
            r306 = 1He.A02;
            this.A0N = true;
        }
        1IB A03 = A03(r306, r302);
        if (this.A07 != el5) {
            A09(this, ImmutableList.of(), false);
            this.A0B.A0E(null);
            this.A0B.A0F(true);
        }
        if (this.A0I) {
            1Kd.A0E(FwJ.A00(el5, this, 43), A03);
        }
    }

    public static void A09(StickerStoreFragment stickerStoreFragment, List list, boolean z) {
        DPW dpw;
        EL5 el5 = stickerStoreFragment.A08;
        if (el5 == EL5.A03) {
            dpw = stickerStoreFragment.A09;
            LinkedList A1F = AbF.A1F();
            LinkedList A1F2 = AbF.A1F();
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Object obj : stickerStoreFragment.A0G.keySet().toArray()) {
                builder.m11011add(stickerStoreFragment.A0G.get(obj));
            }
            A1F.addAll(builder.build());
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (Object obj2 : stickerStoreFragment.A0H.keySet().toArray()) {
                builder2.m11011add(stickerStoreFragment.A0H.get(obj2));
            }
            A1F2.addAll(builder2.build());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StickerPack stickerPack = (StickerPack) it.next();
                LinkedHashMap linkedHashMap = stickerStoreFragment.A0G;
                String str = stickerPack.A0B;
                if (!linkedHashMap.containsKey(str) && DKH.A1b(stickerPack, stickerStoreFragment)) {
                    A1F.add(stickerPack);
                } else if (!stickerStoreFragment.A0H.containsKey(str) && !DKH.A1b(stickerPack, stickerStoreFragment)) {
                    A1F2.add(stickerPack);
                }
            }
            A1F.addAll(A1F2);
            list = A1F;
        } else {
            if (el5 == EL5.A01) {
                ArrayList A17 = 1BK.A17(list);
                Collections.sort(A17, new G6e(stickerStoreFragment, 6));
                DPW dpw2 = stickerStoreFragment.A09;
                LinkedHashMap A1C = 1BK.A1C();
                A1C.putAll(stickerStoreFragment.A0G);
                A1C.putAll(stickerStoreFragment.A0H);
                dpw2.A01(A1C, A17, z);
                stickerStoreFragment.A09.A00(stickerStoreFragment.A00.getQuery().toString());
                return;
            }
            dpw = stickerStoreFragment.A09;
        }
        LinkedHashMap A1C2 = 1BK.A1C();
        A1C2.putAll(stickerStoreFragment.A0G);
        A1C2.putAll(stickerStoreFragment.A0H);
        dpw.A01(A1C2, list, z);
    }

    public static void A0A(StickerStoreFragment stickerStoreFragment, boolean z) {
        stickerStoreFragment.A0J = false;
        EL5 el5 = stickerStoreFragment.A08;
        EL5 el52 = EL5.A01;
        if (el5 != el52 || z) {
            GL6.A00(stickerStoreFragment, new TitleBarButtonSpec[0]);
            stickerStoreFragment.A08(5Qx.A05, el52);
            stickerStoreFragment.A08 = el52;
            stickerStoreFragment.A00.setVisibility(0);
            stickerStoreFragment.A09.A00(stickerStoreFragment.A00.getQuery().toString());
            stickerStoreFragment.A02.setSelected(false);
            stickerStoreFragment.A01.setSelected(true);
            stickerStoreFragment.A03.setSelected(false);
        }
    }

    public static void A0B(StickerStoreFragment stickerStoreFragment, boolean z) {
        stickerStoreFragment.A0J = false;
        EL5 el5 = stickerStoreFragment.A08;
        EL5 el52 = EL5.A02;
        if (el5 != el52 || z) {
            GL6.A00(stickerStoreFragment, new TitleBarButtonSpec[0]);
            stickerStoreFragment.A08(5Qx.A05, el52);
            stickerStoreFragment.A08 = el52;
            stickerStoreFragment.A00.setVisibility(8);
            stickerStoreFragment.A02.setSelected(true);
            stickerStoreFragment.A01.setSelected(false);
            stickerStoreFragment.A03.setSelected(false);
        }
    }

    public static void A0C(StickerStoreFragment stickerStoreFragment, boolean z) {
        GL6.A00(stickerStoreFragment, new TitleBarButtonSpec[]{stickerStoreFragment.A0J ? stickerStoreFragment.A0D : stickerStoreFragment.A0E});
        EL5 el5 = stickerStoreFragment.A08;
        EL5 el52 = EL5.A03;
        if (el5 != el52 || z) {
            stickerStoreFragment.A08(5Qx.A04, el52);
            stickerStoreFragment.A08 = el52;
            stickerStoreFragment.A00.setVisibility(8);
            stickerStoreFragment.A02.setSelected(false);
            stickerStoreFragment.A01.setSelected(false);
            stickerStoreFragment.A03.setSelected(true);
        }
    }

    public static void A0D(StickerStoreFragment stickerStoreFragment, boolean z) {
        EL5 el5 = stickerStoreFragment.A08;
        int ordinal = el5.ordinal();
        if (ordinal == 0) {
            A0B(stickerStoreFragment, z);
            return;
        }
        if (ordinal == 1) {
            A0A(stickerStoreFragment, z);
        } else if (ordinal != 2) {
            0fH.A0S(StickerStoreFragment.class, "Unknown tab specified for reload: %s", new Object[]{el5});
        } else {
            A0C(stickerStoreFragment, z);
        }
    }

    public 1iF A1R() {
        return AbF.A0C(313698419837672L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = AbL.A09(this);
        this.A0M = (1I7) 7zO.A0m(this, 65728);
        this.A06 = (BlueServiceOperationFactory) 7zO.A0l(this, 33031);
        this.A0A = (6HM) 7zO.A0m(this, 50020);
        this.A08 = EL5.A02;
    }

    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        int i;
        int A00 = C09o.A00(319939999);
        StickerPack stickerPack = (StickerPack) intent.getParcelableExtra("stickerPack");
        if (stickerPack == null) {
            i = -570002966;
        } else {
            if ("com.facebook.orca.stickers.DOWNLOAD_SUCCESS".equals(intent.getAction())) {
                Optional optional = this.A0F;
                LinkedHashMap linkedHashMap = (optional.isPresent() && stickerPack.A06.A01((C6xd) optional.get())) ? this.A0G : this.A0H;
                String str = stickerPack.A0B;
                linkedHashMap.put(str, stickerPack);
                DPW dpw = this.A09;
                LinkedHashMap linkedHashMap2 = dpw.A01;
                if (linkedHashMap2 != null) {
                    linkedHashMap2.put(str, stickerPack);
                    0V5.A00(dpw, 1802283755);
                }
            }
            i = -2060797285;
        }
        C09o.A01(i, A00);
    }

    @Override // com.facebook.base.fragment.NavigableFragment
    public void Crb(GHX ghx) {
        this.A05 = ghx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(1066896158);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        if (getActivity() instanceof StickerStoreActivity) {
            this.A0F = 1BK.A0a(((StickerStoreActivity) A1P()).A01);
        }
        this.A0J = false;
        this.A02 = DKG.A0D(this, 2131364061);
        this.A01 = DKG.A0D(this, 2131362300);
        this.A03 = DKG.A0D(this, 2131366221);
        this.A00 = (SearchView) 7zL.A0F(this, 2131367630);
        if (getContext() != null) {
            this.A00.setQueryHint(getContext().getResources().getString(2131966355));
        }
        this.A00.setOnQueryTextListener(new FYW(this));
        View inflate = LayoutInflater.from(this.A0K).inflate(2132542967, (ViewGroup) 7zL.A0F(this, 2131367655), true);
        StickerStoreListView A01 = C09s.A01(inflate, 2131366231);
        A01.A6u(new IL5(this, 3));
        EmptyListViewItem emptyListViewItem = (EmptyListViewItem) C09s.A01(inflate, 2131366230);
        this.A0B = emptyListViewItem;
        emptyListViewItem.setBackgroundColor(getContext().getColor(R.color.transparent));
        A01.setEmptyView(this.A0B);
        DPW dpw = new DPW(this.A0K, (1GS) this.A0U.get(), (C6xd) this.A0F.get());
        this.A09 = dpw;
        dpw.A00 = new Eg4(this);
        A01.setAdapter(dpw);
        A01.A0S = new Eg5(this);
        this.A0C = ((StickerStoreActivity) ((C6yc) requireContext())).A04;
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A00 = 1;
        f6h.A08 = 7zO.A0D(this).getString(2131966363);
        f6h.A06 = "sticker_store_edit";
        f6h.A01 = -2;
        f6h.A07 = 7zO.A0D(this).getString(2131966364);
        this.A0E = new TitleBarButtonSpec(f6h);
        F6h f6h2 = new F6h();
        f6h2.A00 = 2;
        f6h2.A08 = 7zO.A0D(this).getString(2131966361);
        f6h2.A06 = "sticker_store_done";
        f6h2.A01 = -2;
        f6h2.A07 = 7zO.A0D(this).getString(2131966362);
        this.A0D = new TitleBarButtonSpec(f6h2);
        GL6.A00(this, new TitleBarButtonSpec[0]);
        A06();
        1P9 r0 = new 1P9(this.A0M);
        r0.A05(this, "com.facebook.orca.stickers.DOWNLOAD_PROGRESS");
        r0.A05(this, "com.facebook.orca.stickers.DOWNLOAD_SUCCESS");
        1PA A012 = 1P9.A01(r0, this, "com.facebook.orca.stickers.DOWNLOAD_FAILURE");
        this.A0L = A012;
        A012.A00();
        this.A0G = 1BK.A1C();
        this.A0H = 1BK.A1C();
        1Kd.A0E(FwK.A01(this, 45), A03(1He.A04, 5Qx.A03));
        0FI.A08(-1477673034, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1784353841);
        ContextThemeWrapper A06 = 0NA.A06(getContext(), 2130971834, 2132608349);
        this.A0K = A06;
        View A08 = AbG.A08(LayoutInflater.from(A06), viewGroup, 2132542963);
        this.A0T.A01(A08, this, "sticker_store");
        0FI.A08(1263073623, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1067813506);
        1PA r0 = this.A0L;
        if (r0 != null) {
            r0.A01();
            this.A0L = null;
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(1617030337, A02);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        A0D(this, false);
        A06();
    }
}
