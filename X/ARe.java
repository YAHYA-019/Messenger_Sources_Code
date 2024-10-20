package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.MediaResourceList;
import com.facebook.user.model.User;
import kotlin.jvm.functions.Function1;

/* loaded from: ARe.class */
public final class ARe extends C00q implements Function1 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ C00m $launchSharedAlbumBottomSheet;
    public final /* synthetic */ C00m $onAlbumCreatedCallback;
    public final /* synthetic */ C00m $onVideoSizeExceeded;
    public final /* synthetic */ Parcelable $parcelable;
    public final /* synthetic */ ThreadKey $threadKey;
    public final /* synthetic */ C9iC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARe(Context context, Parcelable parcelable, ThreadKey threadKey, C9iC c9iC, String str, C00m c00m, C00m c00m2, C00m c00m3) {
        super(1);
        this.$context = context;
        this.this$0 = c9iC;
        this.$launchSharedAlbumBottomSheet = c00m;
        this.$parcelable = parcelable;
        this.$threadKey = threadKey;
        this.$entryPoint = str;
        this.$onAlbumCreatedCallback = c00m2;
        this.$onVideoSizeExceeded = c00m3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A03 = AnonymousClass001.A03(obj);
        Context context = this.$context;
        String str = ((User) 1Br.A0B(this.this$0.A06)).A0X.firstName;
        if (str == null) {
            str = 7zL.A13((User) 1Br.A0B(this.this$0.A06));
        }
        String A0v = 1BK.A0v(context, str, 2131955203);
        11T.A0A(A0v);
        if (A03 > 0) {
            this.$launchSharedAlbumBottomSheet.invoke();
        } else {
            boolean z = this.$parcelable instanceof MediaResourceList;
            9nJ A0j = 7zQ.A0j(this.this$0.A01);
            ThreadKey threadKey = this.$threadKey;
            String str2 = this.$entryPoint;
            if (z) {
                A0j.A0B(threadKey, str2);
                this.this$0.A03(this.$threadKey, (MediaResourceList) this.$parcelable, A0v, this.$onAlbumCreatedCallback, this.$onVideoSizeExceeded);
            } else {
                A0j.A0B(threadKey, str2);
                FbUserSession A0F = 4YV.A0F(this.$context);
                this.this$0.A02(this.$parcelable, A0F, this.$threadKey, A0v, this.$onAlbumCreatedCallback);
            }
        }
        return 04S.A00;
    }
}
