package X;

import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messenger.notification.engine.MSGOpenPathRenderedNotification;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3e3, reason: invalid class name */
/* loaded from: 3e3.class */
public final class C3e3 implements 1K9 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ CNT A02;
    public final /* synthetic */ MSGOpenPathRenderedNotification A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ ArrayList A0D;
    public final /* synthetic */ List A0E;
    public final /* synthetic */ Function1 A0F;
    public final /* synthetic */ boolean A0G;

    public C3e3(FbUserSession fbUserSession, ThreadKey threadKey, CNT cnt, MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, List list, Function1 function1, boolean z) {
        this.A02 = cnt;
        this.A0E = list;
        this.A00 = fbUserSession;
        this.A0A = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A04 = num;
        this.A0C = str4;
        this.A06 = l;
        this.A01 = threadKey;
        this.A05 = l2;
        this.A0B = str5;
        this.A0D = arrayList;
        this.A03 = mSGOpenPathRenderedNotification;
        this.A0G = z;
        this.A0F = function1;
        this.A09 = str6;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        CNT cnt = this.A02;
        List list = this.A0E;
        FbUserSession fbUserSession = this.A00;
        String str = this.A0A;
        String str2 = this.A08;
        String str3 = this.A07;
        Integer num = this.A04;
        String str4 = this.A0C;
        long longValue = this.A06.longValue();
        ThreadKey threadKey = this.A01;
        long longValue2 = this.A05.longValue();
        String str5 = this.A0B;
        ArrayList arrayList = this.A0D;
        MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification = this.A03;
        boolean z = this.A0G;
        CNT.A00((Bitmap) null, fbUserSession, threadKey, cnt, mSGOpenPathRenderedNotification, num, str, str2, str3, str4, str5, this.A09, arrayList, list, this.A0F, longValue, longValue2, z);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CNT cnt = this.A02;
        List list = this.A0E;
        FbUserSession fbUserSession = this.A00;
        String str = this.A0A;
        String str2 = this.A08;
        String str3 = this.A07;
        Integer num = this.A04;
        String str4 = this.A0C;
        long longValue = this.A06.longValue();
        ThreadKey threadKey = this.A01;
        long longValue2 = this.A05.longValue();
        String str5 = this.A0B;
        ArrayList arrayList = this.A0D;
        MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification = this.A03;
        boolean z = this.A0G;
        CNT.A00((Bitmap) obj, fbUserSession, threadKey, cnt, mSGOpenPathRenderedNotification, num, str, str2, str3, str4, str5, this.A09, arrayList, list, this.A0F, longValue, longValue2, z);
    }
}
