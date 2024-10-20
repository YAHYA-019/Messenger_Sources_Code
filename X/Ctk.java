package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.sharing.broadcastflow.intent.model.LinkShareIntentModel;
import com.facebook.share.model.LinksPreview;
import com.facebook.share.protocol.LinksPreviewParams;
import com.facebook.storage.cask.fbapps.FBCask;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: Ctk.class */
public final class Ctk implements DHZ, CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(Ctk.class);
    public static final String __redex_internal_original_name = "LinkPreviewLoader";
    public 1BY A00;
    public final C00i A02 = 7zN.A0D(33031);
    public final C00i A01 = 1BQ.A00();
    public final Bn6 A03 = (Bn6) 1Bi.A03(83545);

    public Ctk(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public CDU BYN(LinkShareIntentModel linkShareIntentModel) {
        CDU cdu;
        ImmutableList.Builder A0h = 4YU.A0h();
        String str = linkShareIntentModel.A03;
        LinksPreviewParams linksPreviewParams = new LinksPreviewParams(A0h, str);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("linksPreviewParams", linksPreviewParams);
        Throwable e = null;
        try {
        } catch (InterruptedException | ExecutionException | Exception e2) {
            e = e2;
        }
        if (!1BK.A0N(this.A01).AZk(36325673748419459L)) {
            OperationResult operationResult = (OperationResult) AbK.A0H(A05, A04, 4YU.A0L(this.A02), "csh_links_preview").get();
            if (operationResult != null && operationResult.A08() != null) {
                LinksPreview linksPreview = (LinksPreview) operationResult.A07();
                cdu = new CDU(new Ct1(linksPreview.A00(), linksPreview.name, linksPreview.description, linksPreview.caption, linksPreview.A01()));
            }
            return new CDU(0S2.A00, e);
        }
        SettableFuture A0j = 4YU.A0j();
        Bn6 bn6 = this.A03;
        DBj dBj = new DBj(A0j, 4);
        11T.A0F(str, 0);
        C7A1 c7a1 = 7A0.A04;
        new 7A0(bn6.A00, new RmZ(bn6, dBj), (FBCask) 1Bi.A03(16600), (1Mw) 1Bn.A0A(67127)).A00(bn6.A01, str, C04I.A00().hashCode(), true);
        cdu = (CDU) A0j.get();
        if (cdu == null) {
            return new CDU(0S2.A00, (Throwable) null);
        }
        return cdu;
    }

    public Class BDh() {
        return LinkShareIntentModel.class;
    }
}
