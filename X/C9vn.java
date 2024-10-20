package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.messaging.highlightstab.loader.HighlightsTabFeedLoaderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9vn, reason: invalid class name */
/* loaded from: 9vn.class */
public final class C9vn implements 7yU {
    public final /* synthetic */ 9JE A00;

    public C9vn(9JE r302) {
        this.A00 = r302;
    }

    public void C49(Throwable th) {
        String str;
        0fH.A0r("HTImmersiveContentLoader", "Data load failed", th);
        8Gh r0 = this.A00.A00;
        View view = r0.mView;
        if (view != null) {
            6LF r02 = r0.A0M;
            if (r02 == null) {
                str = "snackBar";
            } else {
                MigColorScheme migColorScheme = r0.A0L;
                if (migColorScheme != null) {
                    Resources resources = view.getResources();
                    CharSequence text = resources.getText(2131957819);
                    11T.A0A(text);
                    r02.A00(C9py.A03(r0, 127), view, r0.A01, migColorScheme, (KT3) null, text, resources.getText(2131957820), -2, 0);
                    return;
                }
                str = "userColorScheme";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C95(8LH r302, HighlightsTabFeedLoaderState highlightsTabFeedLoaderState) {
        Long valueOf;
        StringBuilder A0k;
        String str;
        List list = r302.A01;
        int size = list != null ? list.size() : 0;
        Integer num = highlightsTabFeedLoaderState.A01;
        0fH.A0j("HTImmersiveContentLoader", 0Pz.A0E(size, "Data received. ", " items, loaderState: ", num != null ? 9CP.A00(num) : "null"));
        9JE r0 = this.A00;
        HashSet A0v = AnonymousClass001.A0v();
        C9cn c9cn = new C9cn(r302, highlightsTabFeedLoaderState, 4YV.A10("highlightsTabFeedLoaderState", 4YV.A0z("highlightsTabFeedResult", A0v, A0v)));
        if (1BK.A0L(16385).AZk(2342168768862966741L)) {
            8Gh r02 = r0.A00;
            List list2 = r02.A0A.A00().A01;
            List list3 = c9cn.A00().A01;
            0fH.A0j("HTImmersiveContentFragment", 0Pz.A0v("Checking for content deduplication. Old content=", 0QD.A0K(", ", "", "", list2, ASX.A00, -1), ",New content=", 0QD.A0K(", ", "", "", list3, ASY.A00, -1)));
            1Br.A0C(r02.A0T);
            C9cn c9cn2 = r02.A0A;
            11T.A0F(c9cn2, 0);
            List list4 = c9cn2.A00().A01;
            if (list4.size() != list3.size()) {
                A0k = AnonymousClass001.A0k();
                7zQ.A1Z("Content size differs. Old size: ", A0k, list4);
                7zQ.A1Z(", new size: ", A0k, list3);
            } else {
                ArrayList A1E = C1A3.A1E(list4);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    7zR.A1U(A1E, it);
                }
                ArrayList A1E2 = C1A3.A1E(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    7zR.A1U(A1E2, it2);
                }
                if (!A1E.equals(A1E2)) {
                    str = "Content order differs";
                    0fH.A0j("HTImmersiveContentDeduper", str);
                    break;
                }
                Iterator it3 = list4.iterator();
                Object obj = null;
                if (it3.hasNext()) {
                    valueOf = Long.valueOf(7zV.A04(it3));
                    while (it3.hasNext()) {
                        Long valueOf2 = Long.valueOf(7zV.A04(it3));
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                Iterator it4 = list3.iterator();
                if (it4.hasNext()) {
                    obj = Long.valueOf(7zV.A04(it4));
                    while (it4.hasNext()) {
                        Long valueOf3 = Long.valueOf(7zV.A04(it4));
                        if (obj.compareTo(valueOf3) < 0) {
                            obj = valueOf3;
                        }
                    }
                }
                if (11T.A0O(valueOf, obj)) {
                    int size2 = list4.size();
                    for (int i = 0; i < size2; i++) {
                        if (!11T.A0O(list4.get(i), list3.get(i))) {
                            A0k = AnonymousClass001.A0k();
                            A0k.append("Content differs at index ");
                            A0k.append(i);
                            A0k.append(". Old content: ");
                            A0k.append(list4.get(i));
                            A0k.append(", new content: ");
                            obj = list3.get(i);
                        }
                    }
                    if (!1BK.A0L(16385).AZk(2342168768863228888L) || 11T.A0O(c9cn2.A01(), c9cn.A01())) {
                        0fH.A0l("HTImmersiveContentFragment", "Content is the same as the previous content, so we don't need to update the UI");
                        return;
                    }
                } else {
                    A0k = AnonymousClass001.A0k();
                    A0k.append("Content timestamp differs. Old max timestamp: ");
                    A0k.append(valueOf);
                    A0k.append(", new max timestamp: ");
                }
                A0k.append(obj);
            }
            str = A0k.toString();
            0fH.A0j("HTImmersiveContentDeduper", str);
            break;
        }
        8Gh r03 = r0.A00;
        r03.A0A = c9cn;
        8Gh.A08(r03, c9cn, r03.A0K, true);
    }
}
