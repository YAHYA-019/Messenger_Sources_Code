package com.facebook.video.plugins;

import X.11T;
import X.1BL;
import X.6TI;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.functions.Function1;

/* loaded from: XappCoverImagePlugin.class */
public class XappCoverImagePlugin extends CoverImagePlugin {
    public Function1 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XappCoverImagePlugin(Context context, CallerContext callerContext) {
        super(context, callerContext);
        1BL.A1F(context, callerContext);
    }

    @Override // com.facebook.video.plugins.CoverImagePlugin
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        super.A0e(r302, z);
        Function1 function1 = this.A00;
        if (function1 != null) {
            ImmutableMap immutableMap = r302.A04;
            function1.invoke(String.valueOf(immutableMap != null ? immutableMap.get("offlineThreadingId") : null));
        }
    }
}
