package X;

import android.content.Intent;
import com.facebook.graphservice.interfaces.GraphQLConsistency;
import com.facebook.graphservice.interfaces.PaginableList;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.archive.MontageArchiveFragment;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: B5v.class */
public final class B5v extends HGG {
    public final int A00;
    public final Object A01;

    public B5v(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, X.Gc5] */
    public void A01() {
        switch (this.A00) {
            case 2:
                ?? r0 = (C2403Gc5) this.A01;
                r0.A0A.get();
                r0.getContext();
                06Z childFragmentManager = r0.getChildFragmentManager();
                11T.A0F(childFragmentManager, 1);
                CAj.A00(childFragmentManager, false);
                return;
            case 3:
                return;
            default:
                super.A01();
                return;
        }
    }

    public void A02() {
        switch (this.A00) {
            case 0:
                0fH.A0j(7zK.A00(61), "MontageViewerSimpleListener::onCreate");
                ((C9tz) this.A01).A01();
                return;
            case 3:
                return;
            default:
                super.A02();
                return;
        }
    }

    public void A03(long j, boolean z, boolean z2) {
        if (3 - this.A00 != 0) {
            super.A03(j, z, z2);
            return;
        }
        AcQ acQ = (AcQ) this.A01;
        acQ.A0I.D1g(new C9w8(acQ, 2), C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER);
        C00i c00i = acQ.A0A;
        if (c00i == null || !AnonymousClass001.A1T(((AcP) c00i.get()).A0G.A02)) {
            return;
        }
        AcP A0T = AbI.A0T(acQ);
        A0T.A06 = false;
        if (A0T.A0K) {
            AcP.A01(A0T).A01();
        }
    }

    public void A05(String str) {
        TreeBuilderJNI treeBuilderJNI;
        Class cls;
        2JY result;
        TreeBuilderJNI treeBuilderJNI2;
        switch (this.A00) {
            case 1:
                MontageArchiveFragment montageArchiveFragment = (MontageArchiveFragment) this.A01;
                2JX r0 = montageArchiveFragment.A04;
                if (r0 != null) {
                    Object obj = 2JZ.A01;
                    if (r0.isValidGraphServicesJNIModel()) {
                        cls = 2JX.class;
                        result = r0.reinterpret(cls, 969972740);
                    } else {
                        if (!(r0 instanceof Tree) || !((Tree) r0).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("StoryHistoryContainer", 6As.class, 969972740, (Tree) r0)) == null) {
                            return;
                        }
                        cls = 2JX.class;
                        result = treeBuilderJNI.getResult(cls, 969972740);
                    }
                    2JY r02 = result;
                    if (r02 != null) {
                        String A00 = 1BJ.A00(976);
                        PaginableList A0H = r02.A0H(A00, cls, 133079778);
                        ImmutableList immutableList = A0H.mTrees;
                        ImmutableList.Builder builder = ImmutableList.builder();
                        1Du it = immutableList.iterator();
                        while (it.hasNext()) {
                            2JY A0P = 7zL.A0P(it);
                            String A0k = A0P.A0k();
                            if (A0k == null || !A0k.equals(str)) {
                                builder.m11011add((Object) A0P);
                            }
                        }
                        PaginableList withMetadata = PaginableList.withMetadata(builder.build(), A0H);
                        Tree tree = montageArchiveFragment.A04;
                        if (tree == null || !(tree instanceof Tree) || !tree.isValidGraphServicesJNIModel() || (treeBuilderJNI2 = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("StoryHistoryContainer", 6As.class, 969972740, tree)) == null) {
                            return;
                        }
                        treeBuilderJNI2.setPaginableTreeList(A00, withMetadata);
                        ((GraphQLConsistency) 4YU.A0p(montageArchiveFragment.A05)).publishWithFullConsistency(treeBuilderJNI2.getResult(cls, 969972740));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                return;
            default:
                super.A05(str);
                return;
        }
    }

    public void A08() {
        if (3 - this.A00 != 0) {
            super.A08();
        }
    }

    public void A09() {
        switch (this.A00) {
            case 0:
                0fH.A0j(7zK.A00(61), "MontageViewerSimpleListener::onDismiss");
                ((C9tz) this.A01).A00();
                return;
            case 1:
                ((MontageArchiveFragment) this.A01).A0B = false;
                return;
            case 2:
            default:
                super.A09();
                return;
            case 3:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, com.facebook.messaging.montage.archive.MontageArchiveFragment] */
    public void A0A(UserKey userKey, String str, java.util.Map map) {
        String str2 = str;
        switch (this.A00) {
            case 1:
                ?? r0 = (MontageArchiveFragment) this.A01;
                ThreadKey A0l = AbH.A0l((4iI) r0.A0G.get(), userKey);
                if (str == null) {
                    str2 = "";
                }
                NavigationTrigger navigationTrigger = new NavigationTrigger(AnonymousClass539.A6x, null, 4YT.A00(72), null, str2, null, null, map, null, false);
                5SW r02 = 5SW.A1G;
                C6el A0H = 1BK.A0H(A0l);
                A0H.A06 = navigationTrigger;
                A0H.A02(r02);
                ThreadViewParams threadViewParams = new ThreadViewParams(A0H);
                Intent A0D = C3o5.A0D(r0.A06.A0D, ThreadViewActivity.class);
                A0D.putExtra("thread_key", threadViewParams.A05);
                r0.startActivity(A0D);
                return;
            case 2:
                C2403Gc5.A08((C2403Gc5) this.A01, userKey);
                return;
            case 3:
                return;
            default:
                super.A0A(userKey, str, map);
                return;
        }
    }
}
