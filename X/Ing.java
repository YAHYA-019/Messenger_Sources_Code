package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.cowatch.gen.CowatchFetchMediaFailureCallback;
import com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueFailureCallback;
import com.facebook.rsys.cowatch.gen.CowatchFetchSuggestedContentQueueSuccessCallback;

/* loaded from: Ing.class */
public final class Ing implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public Ing(FbUserSession fbUserSession, Gws gws, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = gws;
        if (1 - i != 0) {
            this.A03 = cowatchFetchSuggestedContentQueueSuccessCallback;
            this.A02 = fbUserSession;
            this.A06 = str;
        } else {
            this.A02 = fbUserSession;
            this.A06 = str;
            this.A03 = cowatchFetchSuggestedContentQueueSuccessCallback;
        }
        this.A01 = cowatchFetchSuggestedContentQueueFailureCallback;
        this.A05 = str2;
    }

    public Ing(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                ((CowatchFetchMediaFailureCallback) this.A01).onFailure(this.A05, this.A06, 1, th.getMessage(), th.getLocalizedMessage());
                return;
            case 1:
                ((CowatchFetchSuggestedContentQueueFailureCallback) this.A01).onFailure(this.A05, this.A06);
                GP5.A00(GOp.A0K(((Gws) this.A04).A02), "next_chaining_videos_failed_to_load");
                return;
            case 2:
                ((CowatchFetchSuggestedContentQueueFailureCallback) this.A01).onFailure(this.A05, this.A06);
                return;
            default:
                11T.A0F(th, 0);
                0fH.A0s("RichStatusLogger", AbE.A00(205), th);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x06bd, code lost:
    
        if (r311 == null) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ing.onSuccess(java.lang.Object):void");
    }
}
