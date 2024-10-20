package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.memories.model.MemoryMessageModel;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.AdvancedCryptoSharedFilesTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.msys.threadsummary.metadata.thread.MsysThreadTypeMetadata;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.9qp, reason: invalid class name */
/* loaded from: 9qp.class */
public final class C9qp implements Observer {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C9qp(int i, Object obj, Object obj2, Object obj3) {
        this.A01 = i;
        this.A03 = obj3;
        this.A00 = obj2;
        this.A02 = obj;
    }

    public C9qp(MediatorLiveData mediatorLiveData, 9W3 r303) {
        this.A01 = 2;
        this.A03 = r303;
        this.A02 = mediatorLiveData;
    }

    public static final void A00(ThreadKey threadKey, C9qp c9qp) {
        9W3 r0 = (9W3) c9qp.A03;
        9Vg r02 = (9Vg) 1Br.A0B(r0.A09);
        String str = r0.A0C;
        MutableLiveData A0H = 7zL.A0H();
        GraphQlQueryParamSet A0M = 7zL.A0M();
        ImmutableList of = ImmutableList.of((Object) 1BK.A0w(threadKey));
        A0M.A06("thread_ids", of);
        boolean A1T = AnonymousClass001.A1T(of);
        if (str == null) {
            str = "ALL";
        }
        A0M.A05("category", str);
        C00i c00i = r02.A04.A00;
        A0M.A04(AbE.A00(175), Integer.valueOf(C54a.A00((C54a) c00i.get())));
        A0M.A04(4YT.A00(350), Integer.valueOf(C54a.A00((C54a) c00i.get())));
        A0M.A04(4YT.A00(368), Integer.valueOf(((C54a) c00i.get()).A06() * 2));
        A0M.A04(4YT.A00(367), 7zS.A0w(c00i));
        A0M.A04("medium_preview_width", Integer.valueOf(((C54a) c00i.get()).A07() * 2));
        A0M.A04("medium_preview_height", Integer.valueOf(((C54a) c00i.get()).A07()));
        A0M.A04(4YT.A00(443), Integer.valueOf(((C54a) c00i.get()).A08() * 2));
        A0M.A04(4YT.A00(442), Integer.valueOf(((C54a) c00i.get()).A08()));
        A0M.A01(((C3t8) 1Br.A0B(r02.A05)).A00(), "nt_context");
        float f = 50.0f;
        if (!((5zA) 1Br.A0B(r02.A07)).A00.A05("semi_free_messenger_placeholder")) {
            f = 0.0f;
        }
        A0M.A04("blur", Double.valueOf(f));
        Preconditions.checkArgument(A1T);
        2Jf r03 = new 2Jf(2JX.class, (Class) null, "PinnedMessagesQuery", (String) null, "fbandroid", 1981951238, 0, 1163656786L, 1163656786L, false, true);
        r03.A00 = A0M;
        1Hz r04 = new 1Hz();
        r04.A05(1735518709);
        C3sa A0A = 7zT.A0A(r03, r04, -338181066);
        4YU.A1J(A0A, 415192073395620L);
        7zT.A09(r02.A01).ARI(new FfO(A0H, r02, 3), new FfV(1, A0H, threadKey, r02), A0A);
        LiveData liveData = (LiveData) c9qp.A00;
        if (liveData != A0H) {
            if (liveData != null) {
                ((MediatorLiveData) c9qp.A02).removeSource(liveData);
            }
            c9qp.A00 = A0H;
            MediatorLiveData mediatorLiveData = (MediatorLiveData) c9qp.A02;
            mediatorLiveData.addSource(A0H, new C9qq(mediatorLiveData, 73));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v262, types: [androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v315, types: [com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation] */
    /* JADX WARN: Type inference failed for: r303v11, types: [com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation] */
    /* JADX WARN: Type inference failed for: r303v9, types: [com.facebook.messaging.sharedcontent.plugins.advancedcryptolinks.tabcontent.AdvancedCryptoSharedLinksTabContentImplementation] */
    /* JADX WARN: Type inference failed for: r320v3, types: [com.facebook.messaging.memories.viewer.MemoryViewerFragment, java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        LifecycleOwner lifecycleOwner;
        MutableLiveData mutableLiveData;
        int i;
        ThreadSummary threadSummary;
        8Lt r0;
        AbstractCollection abstractCollection;
        MsysThreadTypeMetadata msysThreadTypeMetadata;
        Observer c9qn;
        LifecycleOwner lifecycleOwner2;
        AdvancedCryptoSharedFilesTabContentImplementation advancedCryptoSharedFilesTabContentImplementation;
        LifecycleOwner lifecycleOwner3;
        AdvancedCryptoSharedFilesTabContentImplementation advancedCryptoSharedFilesTabContentImplementation2;
        C3R5 c3r5;
        3Dn r316;
        int i2;
        String string;
        String string2;
        int i3;
        switch (this.A01) {
            case 0:
                ThreadSummaryDataModel threadSummaryDataModel = (ThreadSummaryDataModel) obj;
                11T.A0F(threadSummaryDataModel, 0);
                ThreadSummary threadSummary2 = threadSummaryDataModel.A00;
                if (threadSummary2 != null) {
                    C9kx c9kx = (C9kx) this.A03;
                    8LD r02 = (8LD) this.A02;
                    LiveData liveData = (LiveData) this.A00;
                    C3T9 c3t9 = (C3T9) 1Bu.A06(c9kx.A00, 68762);
                    C1zm c1zm = new C1zm(threadSummary2);
                    int i4 = r02.A00;
                    Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                    AnonymousClass201 A01 = C1zz.A01(C1zz.A02());
                    AnonymousClass207 anonymousClass207 = MsysThreadTypeMetadata.A01;
                    A01.A01(anonymousClass207, new MsysThreadTypeMetadata(i4));
                    c1zm.A0C(A01.A00());
                    ThreadSummary threadSummary3 = new ThreadSummary(c1zm);
                    2YQ r03 = c9kx.A01;
                    C2gi A00 = C9kx.A00(c9kx, threadSummary3);
                    long j = threadSummary3.A06;
                    5SW r04 = 5SW.A1p;
                    ThreadSummary threadSummary4 = C9kx.A00(c9kx, threadSummary3).A01;
                    ThreadPreviewParams threadPreviewParams = null;
                    if (!threadSummary4.A2i && (msysThreadTypeMetadata = (MsysThreadTypeMetadata) threadSummary4.AxS().A00(anonymousClass207)) != null) {
                        threadPreviewParams = new ThreadPreviewParams(null, 1BJ.A00(559), msysThreadTypeMetadata.A00, false);
                    }
                    c3t9.A03(r03, A00, threadPreviewParams, r04, j);
                    liveData.removeObserver(this);
                    return;
                }
                return;
            case 1:
                MemoryViewModel memoryViewModel = (MemoryViewModel) obj;
                11T.A0F(memoryViewModel, 0);
                ?? r320 = (MemoryViewerFragment) this.A03;
                if (memoryViewModel.equals(r320.A08)) {
                    return;
                }
                r320.A08 = memoryViewModel;
                if (!1pQ.A00(r320.A0O).AZk(36324595714969431L) || memoryViewModel.A03 != C96y.A02.modeId) {
                    7zL.A1R(this.A00);
                    return;
                }
                MemoryMessageModel memoryMessageModel = (MemoryMessageModel) this.A02;
                Object obj2 = this.A00;
                9Vf r05 = (9Vf) 1Bn.A0A(68209);
                FbUserSession fbUserSession = r320.A00;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                String str = memoryMessageModel.A01;
                11T.A0F(str, 1);
                if (!r05.A01) {
                    r05.A01 = true;
                    2UF r06 = (2UF) 1Lo.A08(fbUserSession, 67249);
                    1Um A0O = 1BK.A0O(r06, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new A1V(r06, A0P, str, 8), A0P, false);
                    A1d.A01(A0P, r05, 78);
                }
                mutableLiveData = r05.A02;
                c9qn = new C9qn(obj2, r320, 15);
                lifecycleOwner2 = r320;
                mutableLiveData.observe(lifecycleOwner2, c9qn);
                return;
            case 2:
                ThreadSummaryDataModel threadSummaryDataModel2 = (ThreadSummaryDataModel) obj;
                if (threadSummaryDataModel2 == null || (threadSummary = threadSummaryDataModel2.A00) == null) {
                    throw 1BK.A0h();
                }
                ThreadKey threadKey = threadSummary.A0n;
                11T.A0A(threadKey);
                9W3 r07 = (9W3) this.A03;
                Integer num = null;
                MediatorLiveData mediatorLiveData = r07.A04;
                8Lt r08 = (8Lt) mediatorLiveData.getValue();
                if (r08 != null) {
                    num = r08.A03;
                }
                Integer num2 = 0S2.A0C;
                if (num == num2 && (r0 = (8Lt) mediatorLiveData.getValue()) != null && (abstractCollection = (AbstractCollection) r0.A01) != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C9c9 c9c9 = (C9c9) next;
                        if (c9c9 != null) {
                            C61J c61j = (C61J) 1Br.A0B(r07.A08);
                            String str2 = c9c9.A00.A03.A1V;
                            if (str2 == null) {
                                throw AnonymousClass001.A0N("Required value was null.");
                            }
                            Object obj3 = c61j.A02.get(str2);
                            if (obj3 == null) {
                                obj3 = 61K.A02;
                            }
                            if (obj3 != 61K.A04) {
                                A0s.add(next);
                            }
                        }
                    }
                    7zP.A0O(r07.A07).A00(mediatorLiveData, new 8Lt(threadSummary, 1BL.A0a(A0s), num2));
                }
                if (!r07.A00) {
                    r07.A06.A01(new AF4(threadKey, this), threadKey);
                    return;
                } else {
                    A00(threadKey, this);
                    r07.A00 = false;
                    return;
                }
            case 3:
                ThreadSummaryDataModel A0N = 7zU.A0N(obj);
                AdvancedCryptoSharedFilesTabContentImplementation advancedCryptoSharedFilesTabContentImplementation3 = (AdvancedCryptoSharedFilesTabContentImplementation) this.A03;
                C00i c00i = advancedCryptoSharedFilesTabContentImplementation3.A06.A00;
                if (1Br.A06(((C9fe) c00i.get()).A00).AZk(36325411755545287L)) {
                    ((LiveData) this.A00).removeObserver(this);
                }
                ThreadSummary threadSummary5 = A0N.A00;
                advancedCryptoSharedFilesTabContentImplementation3.A00 = threadSummary5 != null ? threadSummary5.A1e : null;
                lifecycleOwner = (LifecycleOwner) this.A02;
                advancedCryptoSharedFilesTabContentImplementation3.A0E.A05(C96h.A02);
                C9mc c9mc = advancedCryptoSharedFilesTabContentImplementation3.A0B;
                boolean z = ((C9fe) c00i.get()).A02;
                AV3 A002 = AV3.A00(advancedCryptoSharedFilesTabContentImplementation3, 5);
                c9mc.A0A(new 84Q(3, c9mc, A002, z), new DDq(A002, c9mc, 23));
                mutableLiveData = c9mc.A05;
                i = 90;
                advancedCryptoSharedFilesTabContentImplementation = advancedCryptoSharedFilesTabContentImplementation3;
                c9qn = new C9qq(advancedCryptoSharedFilesTabContentImplementation, i);
                lifecycleOwner2 = lifecycleOwner;
                mutableLiveData.observe(lifecycleOwner2, c9qn);
                return;
            case 4:
                ThreadSummaryDataModel A0N2 = 7zU.A0N(obj);
                boolean z2 = true;
                if (1Br.A06(((C9fe) 1Bn.A0A(68435)).A00).AZk(36325411755479750L)) {
                    ThreadSummary threadSummary6 = A0N2.A00;
                    if (threadSummary6 == null) {
                        return;
                    }
                    LiveData liveData2 = (LiveData) this.A00;
                    ?? r303 = (AdvancedCryptoSharedLinksTabContentImplementation) this.A03;
                    lifecycleOwner3 = (LifecycleOwner) this.A02;
                    liveData2.removeObserver(this);
                    if (!threadSummary6.A2X || threadSummary6.A2Z) {
                        z2 = false;
                    }
                    r303.A04 = z2;
                    advancedCryptoSharedFilesTabContentImplementation2 = r303;
                } else {
                    ?? r3032 = (AdvancedCryptoSharedLinksTabContentImplementation) this.A03;
                    ThreadSummary threadSummary7 = A0N2.A00;
                    if (threadSummary7 == null || !threadSummary7.A2X || threadSummary7.A2Z) {
                        z2 = false;
                    }
                    r3032.A04 = z2;
                    lifecycleOwner3 = (LifecycleOwner) this.A02;
                    advancedCryptoSharedFilesTabContentImplementation2 = r3032;
                }
                C9mc c9mc2 = advancedCryptoSharedFilesTabContentImplementation2.A0F;
                if (!c9mc2.A0A) {
                    if (z2) {
                        c9mc2.A0A(null, AV4.A00(c9mc2, 30));
                    } else {
                        C9mc.A01(c9mc2, -1);
                    }
                }
                c9mc2.A09(AQV.A00(advancedCryptoSharedFilesTabContentImplementation2, 43));
                mutableLiveData = c9mc2.A06;
                i = 91;
                advancedCryptoSharedFilesTabContentImplementation = advancedCryptoSharedFilesTabContentImplementation2;
                lifecycleOwner = lifecycleOwner3;
                c9qn = new C9qq(advancedCryptoSharedFilesTabContentImplementation, i);
                lifecycleOwner2 = lifecycleOwner;
                mutableLiveData.observe(lifecycleOwner2, c9qn);
                return;
            case 5:
                ThreadSummaryDataModel A0N3 = 7zU.A0N(obj);
                boolean z3 = true;
                if (!1Br.A06(((C9fe) 1Bn.A0A(68435)).A00).AZk(36325411755414213L)) {
                    AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation = (AdvancedCryptoSharedMediaTabContentImplementation) this.A03;
                    ThreadSummary threadSummary8 = A0N3.A00;
                    if (threadSummary8 == null || !threadSummary8.A2X || threadSummary8.A2Z) {
                        z3 = false;
                    }
                    advancedCryptoSharedMediaTabContentImplementation.A0A = z3;
                    advancedCryptoSharedMediaTabContentImplementation.A05 = threadSummary8 != null ? threadSummary8.A1e : null;
                    if (7zQ.A1a(advancedCryptoSharedMediaTabContentImplementation.A0Y)) {
                        AdvancedCryptoSharedMediaTabContentImplementation.A00((LifecycleOwner) this.A02, advancedCryptoSharedMediaTabContentImplementation);
                        return;
                    }
                    return;
                }
                ThreadSummary threadSummary9 = A0N3.A00;
                if (threadSummary9 != null) {
                    LiveData liveData3 = (LiveData) this.A00;
                    AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation2 = (AdvancedCryptoSharedMediaTabContentImplementation) this.A03;
                    LifecycleOwner lifecycleOwner4 = (LifecycleOwner) this.A02;
                    liveData3.removeObserver(this);
                    if (!threadSummary9.A2X || threadSummary9.A2Z) {
                        z3 = false;
                    }
                    advancedCryptoSharedMediaTabContentImplementation2.A0A = z3;
                    if (7zQ.A1a(advancedCryptoSharedMediaTabContentImplementation2.A0Y)) {
                        AdvancedCryptoSharedMediaTabContentImplementation.A00(lifecycleOwner4, advancedCryptoSharedMediaTabContentImplementation2);
                    }
                    advancedCryptoSharedMediaTabContentImplementation2.A05 = threadSummary9.A1e;
                    advancedCryptoSharedMediaTabContentImplementation2.A04 = threadSummary9.A1g;
                    advancedCryptoSharedMediaTabContentImplementation2.A03 = Boolean.valueOf(threadSummary9.A2P);
                    return;
                }
                return;
            case 6:
                ThreadSummaryDataModel threadSummaryDataModel3 = (ThreadSummaryDataModel) obj;
                11T.A0F(threadSummaryDataModel3, 0);
                ((LiveData) this.A00).removeObserver(this);
                ThreadSummary threadSummary10 = threadSummaryDataModel3.A00;
                if (threadSummary10 != null) {
                    C83a c83a = (C83a) this.A03;
                    int ordinal = ((3Dn) this.A02).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1 || 2Gt.A0F(threadSummary10)) {
                            return;
                        }
                        5I5.A03(threadSummary10, (5I5) 1Lm.A05(c83a.A02, c83a.A03, 49665), false, true);
                        c3r5 = C3R5.A00;
                        r316 = 3Dn.A03;
                    } else {
                        if (!2Gt.A0F(threadSummary10)) {
                            return;
                        }
                        5I5.A03(threadSummary10, (5I5) 1Lm.A05(c83a.A02, c83a.A03, 49665), true, true);
                        c3r5 = C3R5.A00;
                        r316 = 3Dn.A02;
                    }
                    c3r5.A00(AnonymousClass986.SUCCESS, r316, threadSummary10.A1e);
                    return;
                }
                return;
            case 7:
                AX5 ax5 = (AX5) obj;
                if (ax5 instanceof Ab5) {
                    try {
                        8Cj r09 = (8Cj) this.A03;
                        if (r09.getActivity() != null) {
                            Ab5 ab5 = (Ab5) ax5;
                            Context requireContext = r09.requireContext();
                            11T.A0F(ab5, 1);
                            Resources resources = requireContext.getResources();
                            C90d c90d = (C90d) ab5;
                            11T.A0D(c90d.A00 > 0 ? c90d.A02 : requireContext.getString(2131963868));
                            long j2 = c90d.A01;
                            if (j2 > 0) {
                                int i5 = (int) j2;
                                if (i5 < 2048) {
                                    i2 = 2131952808;
                                } else {
                                    i5 /= 1024;
                                    if (i5 < 2048) {
                                        i2 = 2131952809;
                                    } else {
                                        i5 /= 1024;
                                        i2 = 2131952810;
                                    }
                                }
                                string = resources.getString(i2, Integer.valueOf(i5));
                            } else {
                                string = requireContext.getString(2131963868);
                            }
                            11T.A0D(string);
                            String formatStrLocaleSafe = j2 > 0 ? StringFormatUtil.formatStrLocaleSafe(requireContext.getString(2131960381), string) : requireContext.getString(2131960383);
                            11T.A0D(formatStrLocaleSafe);
                            ((CheckBox) this.A00).setText(formatStrLocaleSafe);
                            ((View) this.A02).setEnabled(true);
                            8Cj.A01(r09, 0S2.A03, 0S2.A0C, new 03Y[0]);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        8Cj r010 = (8Cj) this.A03;
                        8Cz.A00(r010, th, r010.A01);
                        return;
                    }
                }
                return;
            default:
                AX5 ax52 = (AX5) obj;
                if (ax52 instanceof Ab5) {
                    8Ci r011 = (8Ci) this.A03;
                    if (r011.getActivity() != null) {
                        Ab5 ab52 = (Ab5) ax52;
                        Context requireContext2 = r011.requireContext();
                        11T.A0F(ab52, 1);
                        Resources resources2 = requireContext2.getResources();
                        C90d c90d2 = (C90d) ab52;
                        String string3 = c90d2.A00 > 0 ? c90d2.A02 : requireContext2.getString(2131963868);
                        11T.A0D(string3);
                        long j3 = c90d2.A01;
                        if (j3 > 0) {
                            int i6 = (int) j3;
                            if (i6 < 2048) {
                                i3 = 2131952808;
                            } else {
                                i6 /= 1024;
                                if (i6 < 2048) {
                                    i3 = 2131952809;
                                } else {
                                    i6 /= 1024;
                                    i3 = 2131952810;
                                }
                            }
                            string2 = resources2.getString(i3, AnonymousClass001.A1a(i6));
                        } else {
                            string2 = requireContext2.getString(2131963868);
                        }
                        11T.A0D(string2);
                        11T.A0D(j3 > 0 ? StringFormatUtil.formatStrLocaleSafe(requireContext2.getString(2131960381), string2) : requireContext2.getString(2131960383));
                        ((TextView) this.A02).setText(string2);
                        ((TextView) this.A00).setText(string3);
                        C9fp.A00(7zU.A0Z(r011.A01), 0S2.A03, 0S2.A0C, 0S2.A0Y, Arrays.copyOf(new 03Y[0], 0));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
