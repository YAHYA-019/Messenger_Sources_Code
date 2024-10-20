package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.stickers.service.models.FetchStickerTagsParams;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.6yy, reason: invalid class name */
/* loaded from: 6yy.class */
public final class C6yy extends 2UV implements CallerContextable {
    public static final CallerContext A02 = CallerContext.A06(C6yy.class);
    public static final String __redex_internal_original_name = "StickerTagsLoader";
    public 1BY A00;
    public final C00i A01;

    public C6yy(1BO r302) {
        super((Executor) 1Bi.A03(16432));
        this.A01 = new 1BV((1BY) null, 33031);
        this.A00 = new 1BY(r302);
    }

    public /* bridge */ /* synthetic */ 2UW A02(Object obj) {
        ImmutableList immutableList;
        String str;
        1BY r0 = this.A00;
        Object A04 = 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 49969);
        69H r02 = (69H) A04;
        synchronized (A04) {
            immutableList = r02.A05;
        }
        synchronized (A04) {
            str = r02.A06;
        }
        if (immutableList != null && !TextUtils.isEmpty(str)) {
            return new 2UW(0S2.A0C, new HcH(immutableList, str));
        }
        2UW r03 = 2UV.A03;
        11T.A0I(r03, "null cannot be cast to non-null type com.facebook.common.loader.AbstractListenableFutureFbLoader.LoaderResult<RESULT of com.facebook.common.loader.AbstractListenableFutureFbLoader.LoaderResult.Companion.forResultNotCached>");
        return r03;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("fetchStickerTagsParam", new FetchStickerTagsParams(1He.A04, ((C7on) obj).A00));
        return 2FP.A01(new ABa(this, 6), 4YU.A0M(A05, A02, 4YU.A0L(this.A01), 1BJ.A00(182), true));
    }
}
