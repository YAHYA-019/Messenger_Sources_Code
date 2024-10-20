package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.media.download.params.DownloadPhotosParams;
import com.facebook.messaging.media.download.params.PhotoToDownload;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9y8, reason: invalid class name */
/* loaded from: 9y8.class */
public final class C9y8 implements 6Ge {
    public 1BY A00;
    public final C00i A06 = 1BV.A01((1BY) null, 68706);
    public final C00i A05 = 1BV.A01((1BY) null, 81928);
    public final C00i A02 = 1BQ.A02(50098);
    public final C00i A04 = 1BQ.A02(16432);
    public final C00i A01 = 1BQ.A01();
    public final C00i A03 = new 1HH((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 99435);

    public C9y8(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A0l.id;
        obj.A05 = 4YU.A0u(context.getResources(), context.getResources().getString(2131956666), 2131959604);
        obj.A01 = 2132346847;
        obj.A00 = 0;
        obj.A04 = parcelable;
        obj.A06 = "share_image";
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Share image";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        if (!((CNP) this.A06.get()).A03()) {
            F8q.A00(new FEd(2131962122), (F8q) this.A03.get(), true);
            return true;
        }
        7zU.A1Q((C3E) this.A05.get(), BNO.A0l);
        ImageAttachmentData imageAttachmentData = (ImageAttachmentData) menuDialogItem.A03;
        53U B8W = r309.B8W();
        C00i c00i = this.A02;
        6Ro r0 = (6Ro) c00i.get();
        CallerContext A0C = CallerContext.A0C(DKB.A00(279), "photo_save_temp_thread_view");
        c00i.get();
        RequestPermissionsConfig requestPermissionsConfig = 6Ro.A06;
        String str = imageAttachmentData.A0C;
        11T.A0F(str, 1);
        1FV A01 = 6Ro.A01(context, (ViewerContext) null, A0C, r0, new DownloadPhotosParams(ImmutableList.of((Object) new PhotoToDownload(null, null, str, null)), 0S2.A01, false, true), B8W);
        1Kd.A0D(this.A04, new FwJ(context, this, 17), A01);
        return true;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        return false;
    }
}
