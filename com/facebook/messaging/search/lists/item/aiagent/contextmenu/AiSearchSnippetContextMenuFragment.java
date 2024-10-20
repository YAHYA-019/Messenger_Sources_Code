package com.facebook.messaging.search.lists.item.aiagent.contextmenu;

import X.1BK;
import X.AQV;
import X.C01g;
import X.C01i;
import X.C03i;
import com.facebook.xapp.messaging.contextmenu.fragment.AbstractContextMenuFragment;

/* loaded from: AiSearchSnippetContextMenuFragment.class */
public final class AiSearchSnippetContextMenuFragment extends AbstractContextMenuFragment {
    public final C01i A00;
    public final C01i A01;

    public AiSearchSnippetContextMenuFragment() {
        C03i c03i = C03i.A02;
        this.A00 = C01g.A00(c03i, AQV.A00(this, 10));
        this.A01 = C01g.A00(c03i, AQV.A00(this, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A05(AiSearchSnippetContextMenuFragment aiSearchSnippetContextMenuFragment) {
        String string = aiSearchSnippetContextMenuFragment.requireArguments().getString("AiSearchSnippetContextMenuFragment.arg_ai_search_snippet_response_text");
        if (string != null) {
            return string;
        }
        throw 1BK.A0h();
    }
}
