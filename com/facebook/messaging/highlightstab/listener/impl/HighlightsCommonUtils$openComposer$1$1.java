package com.facebook.messaging.highlightstab.listener.impl;

import X.04S;
import X.06Z;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0S2;
import X.1BL;
import X.2Ov;
import X.2Zo;
import X.2aI;
import X.2aK;
import X.2qR;
import X.4YV;
import X.7zR;
import X.94R;
import X.95K;
import X.AJP;
import X.AnonymousClass001;
import X.C3kz;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabBirthdayComposerBottomSheetFragment;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabComposerBottomSheetFragment;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.common.BaseHTBottomSheetDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;

/* loaded from: HighlightsCommonUtils$openComposer$1$1.class */
public final class HighlightsCommonUtils$openComposer$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ HighlightsFeedContent $feedContent;
    public final /* synthetic */ 06Z $hostFragmentManager;
    public final /* synthetic */ String $initialText;
    public final /* synthetic */ AtomicBoolean $isComposerLaunched;
    public final /* synthetic */ 95K $mode;
    public final /* synthetic */ long $threadId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightsCommonUtils$openComposer$1$1(Context context, 06Z r303, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent, 95K r306, String str, AtomicBoolean atomicBoolean, 0DR r309, long j) {
        super(2, r309);
        this.$isComposerLaunched = atomicBoolean;
        this.$mode = r306;
        this.$hostFragmentManager = r303;
        this.$feedContent = highlightsFeedContent;
        this.$initialText = str;
        this.$context = context;
        this.$fbUserSession = fbUserSession;
        this.$threadId = j;
    }

    public final 0DR create(Object obj, 0DR r303) {
        AtomicBoolean atomicBoolean = this.$isComposerLaunched;
        95K r0 = this.$mode;
        HighlightsCommonUtils$openComposer$1$1 highlightsCommonUtils$openComposer$1$1 = new HighlightsCommonUtils$openComposer$1$1(this.$context, this.$hostFragmentManager, this.$fbUserSession, this.$feedContent, r0, this.$initialText, atomicBoolean, r303, this.$threadId);
        highlightsCommonUtils$openComposer$1$1.L$0 = obj;
        return highlightsCommonUtils$openComposer$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            2aI r02 = (2aI) this.L$0;
            if (!this.$isComposerLaunched.getAndSet(true)) {
                Integer num = 0S2.A00;
                C3kz A01 = 2aK.A01(num, 2Zo.A02(num), new AJP(this.$context, this.$fbUserSession, this.$feedContent, null, this.$threadId), r02);
                this.label = 1;
                obj = A01.A0D(this);
                if (obj == r0) {
                    return r0;
                }
            }
            return 04S.A00;
        }
        if (i != 1) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        ThreadKey threadKey = (ThreadKey) obj;
        if (threadKey != null) {
            if (this.$mode == 95K.A02) {
                94R r03 = HighlightsTabBirthdayComposerBottomSheetFragment.A03;
                06Z r04 = this.$hostFragmentManager;
                HighlightsFeedContent highlightsFeedContent = this.$feedContent;
                4YV.A1N(r04, highlightsFeedContent);
                2Ov highlightsTabBirthdayComposerBottomSheetFragment = new HighlightsTabBirthdayComposerBottomSheetFragment();
                Bundle A0E = 7zR.A0E(threadKey);
                A0E.putParcelable("feed_content", highlightsFeedContent);
                highlightsTabBirthdayComposerBottomSheetFragment.setArguments(A0E);
                highlightsTabBirthdayComposerBottomSheetFragment.A0m(r04, "HighlightsTabComposerBottomSheetRenderer");
            } else {
                2qR r05 = BaseHTBottomSheetDialogFragment.A05;
                HighlightsFeedContent highlightsFeedContent2 = this.$feedContent;
                String str = this.$initialText;
                1BL.A1F(highlightsFeedContent2, str);
                2Ov highlightsTabComposerBottomSheetFragment = new HighlightsTabComposerBottomSheetFragment();
                Bundle A0E2 = 7zR.A0E(threadKey);
                A0E2.putParcelable("feed_content", highlightsFeedContent2);
                A0E2.putString("initial_text", str);
                highlightsTabComposerBottomSheetFragment.setArguments(A0E2);
                highlightsTabComposerBottomSheetFragment.A0m(this.$hostFragmentManager, "HighlightsTabComposerBottomSheetFragment");
            }
        }
        return 04S.A00;
    }
}
