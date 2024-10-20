package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9zw, reason: invalid class name */
/* loaded from: 9zw.class */
public final class C9zw implements C1qM {
    public final int A00;
    public final Object A01;

    public C9zw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1qM
    public final void CNu(Set set) {
        switch (this.A00) {
            case 0:
                List list = C5bx.A0N;
                11T.A0D(set);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (set.contains(it.next())) {
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("sproc query notification received for ");
                                0fH.A0j("HighlightsTabFeedLoader", AnonymousClass001.A0a(0QD.A0g(set, list), A0k));
                                Integer num = 0S2.A0Y;
                                C5bx c5bx = (C5bx) this.A01;
                                1Br.A0D(c5bx.A0I, new 5cB(c5bx, C5c2.A03, num), C5bx.A01(c5bx, num));
                            }
                        }
                    }
                }
                if (set.contains("highlights_tab_fetch_range")) {
                    ((C5bx) this.A01).A0A(null);
                    return;
                }
                return;
            case 1:
                if (set.contains("story_settings_by_owner_id")) {
                    C5d1 c5d1 = (C5d1) this.A01;
                    if (c5d1.A01 != null) {
                        c5d1.A00();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (set.contains("in_thread_banners_list") || set.contains("pinned_messages_banners_list") || set.contains("chat_level_suggested_actions_banner") || set.contains("gcu_countdown_banner")) {
                    7Nl r0 = (7Nl) this.A01;
                    if (!r0.A0D.isEmpty()) {
                        7Nl.A01(r0);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (set.contains("fetch_color_filter_setting")) {
                    C08044lp c08044lp = (C08044lp) this.A01;
                    AC8.A02(c08044lp.A00(), c08044lp, 48);
                    return;
                }
                return;
        }
    }
}
