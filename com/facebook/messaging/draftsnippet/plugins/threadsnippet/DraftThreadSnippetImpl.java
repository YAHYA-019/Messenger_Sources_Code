package com.facebook.messaging.draftsnippet.plugins.threadsnippet;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1EZ;
import X.1Fw;
import X.2gW;
import X.2nH;
import X.C1u7;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: DraftThreadSnippetImpl.class */
public final class DraftThreadSnippetImpl {
    public final Context A00;
    public final 1Br A01;

    public DraftThreadSnippetImpl(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = 1Bu.A01(context, 33242);
    }

    public final 2nH A00(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        Context context = this.A00;
        if (!((2gW) this.A01.A00.get()).A01(1Fw.A04((1EZ) 1Bu.A06(context, 16428)), threadSummary, true)) {
            return null;
        }
        MessageDraft A00 = ((2gW) 1Bu.A06(context, 33242)).A00(1Fw.A04((1EZ) 1Bu.A06(context, 16428)), threadSummary);
        SpannableString spannableString = new SpannableString(context.getResources().getString(2131966981));
        spannableString.setSpan(new ForegroundColorSpan(C1u7.A06.Ato()), 0, spannableString.length(), 33);
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) " ").append((CharSequence) new SpannableString(A00 != null ? A00.A03 : null));
        11T.A0A(append);
        return new 2nH(append);
    }
}
