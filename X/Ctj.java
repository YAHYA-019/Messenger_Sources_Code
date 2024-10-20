package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.PlatformLinkShareIntentModel;
import com.facebook.share.model.LinksPreview;
import com.facebook.share.protocol.LinksPreviewParams;
import com.google.common.base.Platform;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: Ctj.class */
public final class Ctj implements DHZ, CallerContextable {
    public static final CallerContext A02 = CallerContext.A06(Ctj.class);
    public static final String __redex_internal_original_name = "PlatformLinkSharePreviewLoader";
    public 1BY A00;
    public final C00i A01 = 7zN.A0D(33031);

    public Ctj(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Class BDh() {
        return PlatformLinkShareIntentModel.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.os.Bundle, java.lang.String, com.facebook.fbservice.ops.BlueServiceOperationFactory, com.facebook.common.callercontext.CallerContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.1FX, boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.facebook.fbservice.service.OperationResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.facebook.share.model.LinksPreview, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.share.model.LinksPreview, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.facebook.share.model.LinksPreview, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.facebook.share.model.LinksPreview, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.Ct1, com.facebook.share.model.LinksPreview] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.facebook.share.model.LinksPreview, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Iterator, com.facebook.share.model.LinksPreview, boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.String, com.facebook.messaging.sharing.broadcastflow.intent.model.PlatformLinkShareIntentModel] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String, com.google.common.collect.ImmutableList$Builder] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.DFr, com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields, com.facebook.messaging.sharing.broadcastflow.intent.model.PlatformLinkShareIntentModel] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int, java.lang.String, X.CFn] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.facebook.share.model.LinksPreview$Media, boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        Integer num;
        ?? A08;
        String str;
        1JF.A0B(((PlatformLinkShareIntentModel) broadcastFlowIntentModel).A01);
        Throwable e = null;
        if (0 != 0) {
            num = 0S2.A01;
        } else {
            ?? A0h = 4YU.A0h();
            new LinksPreviewParams(A0h, A0h);
            1BK.A05();
            "linksPreviewParams".putParcelable("linksPreviewParams", "linksPreviewParams");
            try {
                4YU.A0L(this.A01);
                ?? r0 = A02;
                ?? isCancelled = AbK.A0H((Bundle) r0, (CallerContext) r0, (BlueServiceOperationFactory) r0, (String) r0).isCancelled();
                if (isCancelled == 0) {
                    OperationResult operationResult = (OperationResult) isCancelled.get();
                    if (operationResult != null && (A08 = operationResult.A08()) != 0) {
                        String A01 = ((LinksPreview) A08.A07()).A00().name.description.caption.A01();
                        Iterator it = new Ct1(A01, A01, A01, A01, A01).name.media.iterator();
                        while (true) {
                            ?? hasNext = it.hasNext();
                            if (hasNext == 0) {
                                it = hasNext.description;
                                str = it;
                                break;
                            }
                            String str2 = ((LinksPreview.Media) hasNext.next()).type;
                            it = "song".equals("song");
                            if (it != 0 && (it = Platform.stringIsNullOrEmpty((str = it.artist))) == 0) {
                                break;
                            }
                        }
                        MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields = it.A00().A00;
                        CFn cFn = messengerPlatformExtensibleShareContentFields != null ? new CFn(messengerPlatformExtensibleShareContentFields) : new CFn();
                        cFn.A0I = cFn;
                        cFn.A0G = str;
                        CFn cFn2 = cFn;
                        if (cFn != null) {
                            ?? length = cFn.length();
                            cFn2 = length;
                            if (length != 0) {
                                ((CFn) length).A08 = length;
                                cFn2 = length;
                            }
                        }
                        ?? messengerPlatformExtensibleShareContentFields2 = new MessengerPlatformExtensibleShareContentFields(cFn2);
                        messengerPlatformExtensibleShareContentFields2.A00 = messengerPlatformExtensibleShareContentFields2;
                        return new CDU((DFr) messengerPlatformExtensibleShareContentFields2);
                    }
                } else {
                    e = AbF.A1D("Future cancelled before get");
                }
            } catch (InterruptedException | CancellationException | ExecutionException e2) {
                e = e2;
            }
            num = 0S2.A00;
        }
        return new CDU(num, e);
    }
}
